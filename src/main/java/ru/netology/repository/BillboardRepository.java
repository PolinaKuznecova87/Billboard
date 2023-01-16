package ru.netology.repository;

import ru.netology.billboard.BillboardItem;

public class BillboardRepository {
    private BillboardItem[] items = new BillboardItem[0];


    public void save(BillboardItem item) {
        BillboardItem[] tmp = new BillboardItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];

        }
        tmp[tmp.length - 1] = item;
        items = tmp;


    }

    public void removeById(int id) {
        BillboardItem[] tmp = new BillboardItem[items.length - 1];
        int copyToIndex = 0;

        for (BillboardItem item : items) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp;

    }


    public BillboardItem[] getItems() {

        return items;
    }


}





