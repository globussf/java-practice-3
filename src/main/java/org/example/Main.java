package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        List<String> tasks = new ArrayList<>();

        while(true){
            System.out.println("1 - добавить задачу \n" +
                    "2 - удалить первую задачу \n" +
                    "3 - удалить задачу по номеру \n" +
                    "4 - показать все задачи \n" +
                    "5 - выход");
            Scanner scanner = new Scanner(System.in);
            int userChoose = scanner.nextInt();
            switch (userChoose){
                case 1:
                    scanner.nextLine();
                    System.out.println("Введите текст задачи:");
                    String userTask = scanner.nextLine();
                    tasks.add(userTask);
                    break;

                case 2:
                    if (tasks.isEmpty()){
                        System.out.println("Список пуст");
                    }
                    tasks.removeFirst();
                    break;

                case 3:
                    scanner.nextLine();
                    System.out.println("Введите номер задачи(от 1 до "+tasks.size()+")");
                    int userNumber = scanner.nextInt();
                    if (userNumber < 1 || userNumber > tasks.size()){
                        System.out.println("Неверный номер");
                    }
                    tasks.remove(userNumber-1);
                    break;

                case 4:
                    for(int i = 0; i <= tasks.size()-1; i++){
                        String task = tasks.get(i);
                        System.out.println(i+1 + " - " + task);
                    }
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Неверная команда");
                    break;
            }
        }
    }
}
