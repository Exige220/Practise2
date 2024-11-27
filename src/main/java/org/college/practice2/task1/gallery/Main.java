package org.college.practice2.task1.gallery;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Створення галереї
        Gallery gallery = Gallery.getInstance("Сучасній галереї мистецтв");

        boolean running = true;

        while (running) {
            System.out.println("\nКоманди на вибір:");
            System.out.println("1. Додати картину");
            System.out.println("2. Убрати картину");
            System.out.println("3. Описати картину");
            System.out.println("4. Продемонструвати картини");
            System.out.println("5. Показати кількість картин");
            System.out.println("6. Знайти картину за назвою");
            System.out.println("7. Вихід");
            System.out.print("Оберіть варіант: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.print("Введіть назву картини: ");
                String name = scanner.nextLine();

                System.out.print("Введіть рік: ");
                short year = Short.parseShort(scanner.nextLine());

                System.out.print("Введіть автора: ");
                String author = scanner.nextLine();

                Picture picture = new Picture(name, year, author);

                if (gallery.addPicture(picture)) {
                    System.out.println("Картина додана успіщно.");
                } else {
                    System.out.println("Картина з таким ім'ям існує");
                }

            } else if (choice.equals("2")) {
                System.out.print("Введіть назву: ");
                String name = scanner.nextLine();

                if (gallery.removePicture(name)) {
                    System.out.println("Картина видалена успішно.");
                } else {
                    System.out.println("Картина не знайдена");
                }

            } else if (choice.equals("3")) {
                System.out.print("Введіть назву картини: ");
                String name = scanner.nextLine();

                System.out.println(gallery.describePicture(name));

            } else if (choice.equals("4")) {
                System.out.println("Картини в галереї:");
                for (Picture picture : gallery.getPictures().values()) {
                    System.out.println(picture);
                }

            } else if (choice.equals("5")) {
                System.out.println("Загальна кількість картин в " + gallery.getName() + ": " +
                        gallery.getPictureCount());

            } else if (choice.equals("6")){
                System.out.println("Введіть назву картини: ");
                String Picturename = scanner.nextLine();

                if (gallery.getPicture(Picturename)){
                    System.out.println(gallery.describePicture(Picturename));
                } else{
                    System.out.println("Картина не знайдена.");
                }

            }
            else if (choice.equals("7")) {
                System.out.println("завершення програми, гарного дня!");
                running = false;

            } else {
                System.out.println("Не правильно введена команда, спробуйте знову.");
            }
        }

        scanner.close();
    }
}