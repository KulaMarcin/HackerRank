package com.kulamarcin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String, Integer> phoneNumbers = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            phoneNumbers.put(name, phone);
            in.nextLine();
        }

        while(in.hasNext()){
            String s=in.nextLine();
            try{
                int temp = phoneNumbers.get(s);
                System.out.println(s+"="+temp);
            }catch(NullPointerException e){
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
