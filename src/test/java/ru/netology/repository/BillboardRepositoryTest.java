package ru.netology.repository;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.billboard.BillboardItem;

import static org.junit.jupiter.api.Assertions.*;

public class BillboardRepositoryTest {
    BillboardItem item1 = new BillboardItem(11, "blotshot", "forward", "hotal Belgrade", "gentlemen", "the invisible man", "trolls", " number one",null);
    BillboardItem item2 = new BillboardItem(12, "blotshot", "forward", "hotal Belgrade", "gentlemen", "the invisible man", "trolls", " number one","Tasi");
    BillboardItem item3 = new BillboardItem(13, "blotshot", "forward", "hotal Belgrade", "gentlemen", "the invisible man", "trolls", " number one", "the Great Gegsbi");
    @Test
    public void save() {


        BillboardRepository repo = new BillboardRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);


        BillboardItem[] expected = {item1, item2, item3};
        BillboardItem[] actual = repo.getItems();
       Assertions.assertArrayEquals(expected, actual);


    }
    @Test
    public void remove() {


        BillboardRepository repo = new BillboardRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.removeById(item1.getId());


        BillboardItem[] expected = {item2, item3};
        BillboardItem[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected, actual);


    }

    }
