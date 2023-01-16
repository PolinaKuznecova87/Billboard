package ru.netology.billboard;

public class BillboardItem {
    private  int id;
    private String blotshot;
    private String forward;
    private String hotelBelgrade;
    private String gentlemen;
    private String theInvisibleMan;
    private String trolls;
    private String numberOne;
    private String newFilm;



    public BillboardItem() {
    }

    public BillboardItem(int id, String blotshot, String forward, String hotelBelgrade, String gentlemen, String theInvisibleMan, String trolls, String numberOne, String newFilm) {
        this.id = id;
        this.blotshot = blotshot;
        this.forward = forward;
        this.hotelBelgrade = hotelBelgrade;
        this.gentlemen = gentlemen;
        this.theInvisibleMan = theInvisibleMan;
        this.trolls = trolls;
        this.numberOne = numberOne;
        this.newFilm = newFilm;
    }

    public int getId() {
        return id;
    }

    public String getBlotshot() {
        return blotshot;
    }

    public String getForward() {
        return forward;
    }

    public String getHotelBelgrade() {
        return hotelBelgrade;
    }

    public String getGentlemen() {
        return gentlemen;
    }

    public String getTheInvisibleMan() {
        return theInvisibleMan;
    }

    public String getTrolls() {
        return trolls;
    }

    public String getNumberOne() {
        return numberOne;
    }

    public String getNewFilm() {
        return newFilm;
    }

}
