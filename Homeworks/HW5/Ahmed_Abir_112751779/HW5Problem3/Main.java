package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the input string: ");
	String s = sc.nextLine();
	ArrayList<Character> strings = toCharacterArray(s);
	System.out.println("Elements of the Character array list: ");
	for(int i = 0; i < strings.size(); i++){
	    System.out.print(strings.get(i) + " ");
    }

    }

    public static ArrayList<Character> toCharacterArray(String s){
        ArrayList<Character> strings = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            strings.add(s.charAt(i));
        }
        return strings;
    }
}
