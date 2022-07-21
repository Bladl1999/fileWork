package org.example;

public class Main {
    public static void main(String[] args) {
        FileWork fileWork = new FileWork();
        System.out.println(fileWork.readDataDirectory("/home/user/job/example"));
    }
}