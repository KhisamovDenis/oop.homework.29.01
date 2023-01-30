package com.otus.homework.oop.learning;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Exercise question1 = new Exercise(" What is the capital of China?", new String[]{"Beijing", "Ganzhou", "Shanghai"}, 1);
        Exercise question2 = new Exercise("What is the capital of Japan? ", new String[]{"Osaka", "Kioto", "Tokio"}, 3);
        //   Exercise question3 = new Exercise("What is the capital of India? ", new String[] {"Mumbai", "Deli", "Carachi"});

        //  question1.correctAnswers = 1;
        //  question2.correctAnswers = 3;


        Exercise[] exercises = new Exercise[]{
                question1,
                question2,
                new Exercise("What is the capital of India? ", new String[]{"Mumbai", "Deli", "Carachi"}, 2)
        };

       int wrongCount = 0;
        int correctCount = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < exercises.length; i++) {
            System.out.println(exercises[i].question);
            for (int j = 0; j < exercises[i].answers.length; j++) {
                System.out.println((j + 1) + " " + exercises[i].answers[j]);

            } System.out.println("Your answer : ");

            int answer = scanner.nextInt();
            if (answer == exercises[i].correctAnswers) {
                correctCount = correctCount + 1;
                System.out.println("That's right");
                System.out.println();
            } else {
                wrongCount = wrongCount+1;

                 System.out.println("That's wrong");
                System.out.println();
            }
        }
        System.out.println("Correct answers : " + correctCount);
        System.out.println("Wrong answers : " + wrongCount);


    }
}