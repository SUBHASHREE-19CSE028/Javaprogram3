/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;


class account
{
    int balance=0,amount,another;
    String id,name;
    account(String i,String n)
    {
        id=i;
        name=n;
    }
    account(int b,String n,String i)
    {
        balance=b;
        id=i;
        name=n;   
    }
    String getid()
    {
       return id;
    }
    String getname()
    {
        return name;
    }
    int getbalance()
    {
        return balance;
    }
    int credit(int amount)
    {
        balance+=amount;
       return balance;
    }
    int debit(int amount)
    {
        if(amount<=balance)
            balance=balance-amount;
        else
            System.out.println("Amount exceeded balance");
        return balance;
    }
    int transferTo(account acc1,int amount)
    {
        if(amount<=balance)
        {
            acc1.balance=amount;
        }
        else
        {
            System.out.println("Amount exceeded balance");
        }
        return balance;
        
    }
    @Override
    public String toString()
    {
        return "Id:"+id+"\nName:"+name+"\nBalance:"+balance;
    }
}
public class bankac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Customer details:");
       System.out.println("*****************");
       account a=new account("sss15","Subha");
       account a1=new account(a.balance,"Harini","hhh18");
       System.out.println("Customer1 account:");
       System.out.println("******************");
       System.out.println("ID:"+(a.getid()));
       System.out.println("Name:"+(a.getname()));
       System.out.println("Balance:"+(a.getbalance()));
       System.out.println("Customer2 account:");
       System.out.println("******************");
       System.out.println("ID:"+(a1.getid()));
       System.out.println("Name:"+(a1.getname()));
       System.out.println("Balance:"+(a1.getbalance()));
       System.out.println("After crediting Rs.500 in customer1 account:"+"\nBalance is:");
       System.out.println(a.credit(500));
       System.out.println("\nAfter debiting rs.200 from customer1 account:"+"\nBalance is:");
       System.out.println(a.debit(200));
       System.out.println("\nTransfering Rs.200 from customer1 to customer2:");
       System.out.println(a.transferTo(a1,200));
       System.out.println("\nCustomer2 details:");
       System.out.println("******************");
       System.out.println(a1.toString());
       
       
    }
    
}
