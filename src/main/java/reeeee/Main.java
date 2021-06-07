package reeeee;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String name = input.nextLine();
        System.out.println(name+" has "+name.length()+" characters.");

    }
}
