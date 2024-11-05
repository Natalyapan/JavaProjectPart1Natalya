package org.example.tasks;

public class task7 {
    public static void main(String[] args) {
        int n=10;
        int first=0, second=1;
        System.out.println("The first "+n+" numbers of the Fibonacci:");
        for(int i=0;i<n;i++){
            System.out.print(first +" ");

            int next=first+second;
            first=second;
            second=next;
        }
    }
}
