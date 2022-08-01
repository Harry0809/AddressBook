package com.Address.Book.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddresssBook {

	public static void main(String[] args) {

	Operations book = new Operations();
		System.out.println("Welcome to Address Book");
		System.out.println();
		book.add();
		book.printlist(book.contacts);
	}

}