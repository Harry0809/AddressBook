package com.Address.Book.java;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;
import java.util.Scanner;

public class AddresssBook{

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Contacts> contactlist = new ArrayList<>();
	
	public static void main(String[] args) {
    
		AddresssBook book = new AddresssBook();
		Contacts con = new Contacts(); 
		
		System.out.println("Welcome to Address Book");
		System.out.println();
		con.setFirstName("Harish");
		
		con.setLastName("Mahur");
		
		con.setAddress("F-210 , hari nagar part-2");
		
		con.setCity("delhi");
		
		con.setState("delhi");
		
		con.setZip("110044");
		
		con.setPhoneNo("6396037011");
		
		con.setEmail("hmahur20@gmail.com");
		contactlist.add(con);
		
	    book.print(contactlist);
	    System.out.println(" ");
	}
	
	public void print( ArrayList<Contacts> contactlist) {
		
		for(Contacts contact : contactlist) {
			
			System.out.println(contact.toString());
	    }	
		
     }
}