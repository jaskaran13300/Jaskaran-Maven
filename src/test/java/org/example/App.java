package org.example;

import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Name of child");
        String name=sc.next();
        System.out.println("Age of child");
        int age=sc.nextInt();
        Child childd=new Child(name,age);
        System.out.println("Name of child");
        name=sc.next();
        System.out.println("Age of child");
        age=sc.nextInt();
        Child childdd=new Child(name,age);

        System.out.println("Name of chocolate");
        String choconame=sc.next();
        System.out.println("Weight of chocolate");
        int chocoweight=sc.nextInt();
        System.out.println("Calories in chocolate");
        int chococal=sc.nextInt();
        System.out.println("Price of chocolate");
        int chocoprice=sc.nextInt();
        Sweets chocolate1=new Choco(choconame,chocoweight,chococal,chocoprice);

        System.out.println("Name of chocolate");
        choconame=sc.next();
        System.out.println("Weight of chocolate");
        chocoweight=sc.nextInt();
        System.out.println("Calories in chocolate");
        chococal=sc.nextInt();
        System.out.println("Price of chocolate");
        chocoprice=sc.nextInt();
        Sweets chocolate2=new Choco(choconame,chocoweight,chococal,chocoprice);

        System.out.println("Name of cake");
        String cakename=sc.next();
        System.out.println("Weight of cake");
        int cakeweight=sc.nextInt();
        System.out.println("Calories in cake");
        int cakecal=sc.nextInt();
        System.out.println("Price of cake");
        int cakeprice=sc.nextInt();
        Sweets cake=new Cake(cakename,cakeweight,cakecal,cakeprice);

        System.out.println("Name of cake");
        cakename=sc.next();
        System.out.println("Weight of cake");
        cakeweight=sc.nextInt();
        System.out.println("Calories in cake");
        cakecal=sc.nextInt();
        System.out.println("Price of cake");
        cakeprice=sc.nextInt();
        Sweets cake1=new Cake(cakename,cakeweight,cakecal,cakeprice);

        System.out.println("Name of candy");
        String candyname=sc.next();
        System.out.println("Weight of candy");
        int candyweight=sc.nextInt();
        System.out.println("Calories in candy");
        int candycal=sc.nextInt();
        System.out.println("Price of candy");
        int candyprice=sc.nextInt();
        Sweets candy=new Candy(candyname,candyweight,candycal,candyprice);

        System.out.println("Name of candy");
        candyname=sc.next();
        System.out.println("Weight of candy");
        candyweight=sc.nextInt();
        System.out.println("Calories in candy");
        candycal=sc.nextInt();
        System.out.println("Price of candy");
        candyprice=sc.nextInt();
        Sweets candy1=new Candy(candyname,candyweight,candycal,candyprice);


        Vector<Sweets> a1=new Vector<Sweets>();
        a1.add(chocolate1);
        a1.add(cake);
        a1.add(candy);
        Vector<Sweets> a2=new Vector<Sweets>();
        a2.add(chocolate2);
        a2.add(cake1);
        a2.add(candy1);
        Gift gift1=new Gift(a1,"HaPPyy New YeaR!!!");
        Gift gift2=new Gift(a2,"lots of wisheSs...");
        childd.give(gift1,childd);
        childdd.give(gift2,childdd);
        childd.show();
        childdd.show();
    }
}