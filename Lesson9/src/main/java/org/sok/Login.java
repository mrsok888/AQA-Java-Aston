package org.sok;

import java.util.*;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> logins = new ArrayList<>();

        System.out.println("Введите логины (для завершения введите пустую строку):");
        while (true) {
            String login = scanner.nextLine().trim();

            if (login.isEmpty()) {
                break;
            }

            logins.add(login);
        }

        System.out.println("Логины, начинающиеся с 'f':");
        for (String login : logins) {
            if (login.startsWith("f")) {
                System.out.println(login);
            }
        }
    }
}