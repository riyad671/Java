package com.yhr.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Patient patient = new Patient("YHR", 24,
                new Eye("Left Eye", "Short Sighted", "Blue", true),
                new Eye("Right Eye", "Normal", "Blue", true),
                new Heart("Heart", "Normal", 65),
                new Stomach("Stomach", "PUD", false),
                new Skin("Skin", "Burned", "White", 40));

        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        boolean isFinished = false;

        while (!isFinished){
            System.out.print(
                    "\n\t1. Left Eye" +
                    "\n\t2. Right Eye"+
                    "\n\t3. Heart" +
                    "\n\t4. Stomach" +
                    "\n\t5. Skin" +
                    "\n\t6. Quit" + "\nChoice an option: " );

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                {
                    patient.getLeftEye().getDetails();
                    System.out.println("\t\t1. Close the eye.");
                    if (scanner.nextInt() == 1){
                            patient.getLeftEye().close();
                    } else {
                        System.out.println("\t\t1. Open eye");
                        if (scanner.nextInt() == 1){
                            patient.getLeftEye().open();
                        } else {
                            continue;
                        }
                    }
                    break;
                }

                case 2:
                {
                    patient.getRightEye().getDetails();
                    System.out.println("\t\t1. Close the eye.");
                    if (scanner.nextInt() == 1){
                        patient.getRightEye().close();
                    } else {
                        System.out.println("\t\t1. Open eye");
                        if (scanner.nextInt() == 1){
                            patient.getRightEye().open();
                        } else {
                            continue;
                        }
                    }
                    break;
                }
                case 3:
                {
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change heart rate");
                    if (scanner.nextInt() == 1){
                        System.out.print("Enter new hart rate: ");
                        int newHartRate = scanner.nextInt();
                        patient.getHeart().setRate(newHartRate);
                        System.out.println("Hart rate has been changed to " + patient.getHeart().getRate());
                    } else {
                        continue;
                    }
                    break;
                }
                case 4:
                {
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if (scanner.nextInt() == 1){
                        patient.getStomach().digest();
                    } else {
                        continue;
                    }
                    break;
                }
                case 5:
                {
                    patient.getSkin().getDetails();
                    break;
                }
                case 6:
                {
                    isFinished = true;
                    break;
                }
                default:
                {
                    System.out.println("You choice wrong option");
                    break;
                }

            }
        }
    }
}
