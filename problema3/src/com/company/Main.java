package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog= new Dog();
        dog.setName("Max");
        dog.setAge(5);
        System.out.println("This dog is called "+dog.getName()+" and it has "+dog.getAge()+" years old.");
    }
}
