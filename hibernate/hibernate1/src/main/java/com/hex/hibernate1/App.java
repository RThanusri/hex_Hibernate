package com.hex.hibernate1;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    
 
    		SessionFactory fac;
    		Session ses;
    		 Transaction tx;
    		
    		App()
    		{
    	        fac=new Configuration().configure("hiber.Config.xml").addAnnotatedClass(Book.class).buildSessionFactory();
    	    	
    	    	 ses=fac.openSession();
    			
    		}
    		
    		/*
    		void insertBook() {
    		    Scanner sc = new Scanner(System.in);
    		    tx = ses.beginTransaction();
    		    
    		    System.out.print("Enter the book number: ");
    		    int bn = sc.nextInt();
    		    Book b1=ses.find(Book.class, bn);
    		    if(b1!=null)
    		    {
    		    	System.out.println("Book already exists");
    		    }
    		    else
    		    {
    		    	
    		    
    		   
    		    	
    		        b.setBno(bn);
    		    Book b = new Book();
    		    
    		        System.out.print("Enter the book name: ");
    		        
    		        String name = sc.nextLine();
    		        b.setName(name);
    		        System.out.print("Enter the book price: ");
    		        double price = sc.nextDouble();
    		        b.setPrice(price);
    		      
    		        ses.save(b);
    		        System.out.println("Book successfully inserted.");
    		        tx.commit();
    		       
    		    }
    		
    		

     		    	
    		    
    		    
     		    	 
    		         
    		         
    		        
    		         
    		         
    		    
    		    void removeBook()
    		    {
    		       	
    		    	Scanner sc=new Scanner (System.in);
    		    	System.out.println("Enter the book no to remove");
    		    	int bn=sc.nextInt();
    		    	tx=ses.beginTransaction();
    		    	Book b=ses.find(Book.class, bn);
    		    	if(b!=null)
    		    	{
    		    		ses.delete(b);
    		    		tx.commit();
    		    		System.out.println("Book Removed");
    		    	}
    		    	else
    		    	{
    		    		System.out.println("Book not Found");
    		    	}
    		    }
    		    	
    		    	 void updateBook()
    	    		    {
    	    		    	Scanner sc=new Scanner (System.in);
    	    		    	System.out.println("Enter the book no to update");
    	    		    	int bn=sc.nextInt();
    	    		    	tx=ses.beginTransaction();
    	    		    	Book b=ses.find(Book.class, bn);
    	    		    	if(b!=null)
    	    		    	{
    	    		    		System.out.println("Enter the price to update");
        	    		    	double pri=sc.nextDouble();
        	    		    	b.setPrice(pri);
    	    		    	
    	    		    		ses.update(b);
    	    		    		tx.commit();
    	    		    		System.out.println("Price Updated");
    	    		    	}
    	    		    	else
    	    		    	{
    	    		    		System.out.println("Book not Found");
    	    		    	}
    	    		    
    		    }
    		    	 void searchBook()
 	    		    {
 	    		    	Scanner sc=new Scanner (System.in);
 	    		    	System.out.println("Enter the book no to Search");
 	    		    	int bn=sc.nextInt();
 	    		    	tx=ses.beginTransaction();
 	    		    	Book b=ses.find(Book.class, bn);
 	    		    	if(b!=null)
 	    		    	{
 	    		    		System.out.println("Book Found" +b.toString());
 	    		    		tx.commit();
 	    		    		
     	    		    	
 	    		    	}
 	    		    	else
 	    		    	{
 	    		    		System.out.println("Book not Found");
 	    		    	}
 	    		    }
    		    	 
    		void showAll()
    		{
    			tx=ses.beginTransaction();
    			Query q =ses.createQuery("from Book");
    			List<Book> books= q.list();
    			for (Book i :books)
    			{
    				System.out.println(i);
    			}
    			
    		}
    		*/
    		public static void main(String[] args) {
    		    SessionFactory fac ;
    		    Session ses;
    		    Transaction tx;
    		    
    		    try {
    		        fac = new Configuration().configure("hiber.Config.xml")
    		                .addAnnotatedClass(Book.class)
    		                .addAnnotatedClass(Availability.class)
    		                .buildSessionFactory();
    		        ses = fac.openSession();
    		        tx = ses.beginTransaction();
    		        
    		        Availability avail = new Availability();
    		        
    		        avail.setAvailable("available");
    		        avail.setQuantity(100);
    		        
    		        Book b = new Book();
    		        b.setName(" Core");
    		        b.setPrice(900);
    		        b.setAvail(avail);
    		        
    		        ses.save(b);
    		        tx.commit(); 
    		    } catch (Exception e) {
    		        System.out.println(e.getMessage());
    		}

    
}
}
