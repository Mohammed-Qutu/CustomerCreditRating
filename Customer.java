
package com.mycompany.chapter6assignment;

public class Customer 
{
    private String name = null;
    private int creditScore = 300;
            
    public Customer(String newName, int newCreditScore)
    {
        setName(newName);
        setCreditScore(newCreditScore);
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    public void setCreditScore( int newCreditScore)
    {
        if(newCreditScore >= 300)
        {
            creditScore = newCreditScore;
        }
        else
        {
            creditScore = 300;
        }
    }
    
    public String getName()
    {
        return name;
    }
    public int getCreditScore()
    {
        return creditScore;
    }
    
    public String getCreditRating()
    {
        String message;
        if(creditScore >= 200 && creditScore <= 629)
        {
            message = "Bad";
        }
        else if(creditScore >= 630 && creditScore <= 689)
        {
            message = "Fair";
        }
        else if(creditScore >= 690 && creditScore <= 719)
        {
            message = "Good";
        }
        else
        {
            message = "Excellent";
        }
        return message;
    }
    

//public String getCreditRatingCustomer(Customer creditCompare)
   // {
   //     if ( )
   // }
    
}
