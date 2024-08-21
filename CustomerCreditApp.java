package com.mycompany.customercreditapp;

public class CustomerCreditApp 
{
    public static void main(String[] args)
    {
        Customer customer1 = new Customer("Bob Smith", 640);
        
        String name = customer1.getName();
        int credit = customer1.getCreditScore();
        String rating = customer1.getCreditRating();
        
        System.out.println("Name: " + name + "\n" +
            "Credit Score: " + credit + "\n" +
            "Credit Rating: " + rating);
    }
}
