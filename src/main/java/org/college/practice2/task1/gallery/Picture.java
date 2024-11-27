package org.college.practice2.task1.gallery;

public class Picture {
    private final String picturename;
    private final short year;
    private final String author;


    Picture(String picturenamename, short year, String author ){
        this.author = author;
        this.picturename = picturenamename;
        this.year = year;
    }

    String getPicturename(){
        return picturename;
    }

    String getAuthor(){
        return author;
    }

    short getYear(){
        return year;
    }

    public String toString(){
        return "Назва картини: " + getPicturename() + " Автор: " + getAuthor() + " Рік: " + getYear();
    }
}
