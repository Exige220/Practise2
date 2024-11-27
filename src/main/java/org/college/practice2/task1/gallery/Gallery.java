package org.college.practice2.task1.gallery;

import java.util.HashMap;

public class Gallery {
    private static Gallery instance = null;
    private HashMap<String, Picture> pictures; // Колекція для зберігання картин
    private String galleryname;


    // Приватний конструктор
    private Gallery(String gallerynamename) {
        this.galleryname = gallerynamename;
        this.pictures = new HashMap<>();
    }

    // Статичний метод для Singleton
    public static Gallery getInstance(String name) {
        if (instance == null) {
            instance = new Gallery(name);
        }
        return instance;
    }

    // Додавання картини
    public boolean addPicture(Picture picture) {
        if (!pictures.containsKey(picture.getPicturename())) {
            pictures.put(picture.getPicturename(), picture);
            return true;
        }
        return false;
    }

    // Видалення картини
    public boolean removePicture(String name) {
        return pictures.remove(name) != null;
    }

    // Опис картини
    public String describePicture(String name) {
        Picture picture = pictures.get(name);
        if (picture != null) {
            return picture.toString();
        }
        return "Картина не знайдена";
    }

    // Отримання картини за ім'ям
    public boolean getPicture(String name) {
        return true;
    }

    // Отримання кількості картин
    public int getPictureCount() {
        return pictures.size();
    }

    // Геттер для списку картин
    public HashMap<String, Picture> getPictures() {
        return pictures;
    }

    // Геттер для назви галереї
    public String getName() {
        return galleryname;
    }


}











