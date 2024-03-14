package Strings;

import java.util.Scanner;

class Strings_reverseSentence {

    static String reverseStringWordWise(String input) {

    //  if(input.length()>100000 || input.isBlank()){
        
    // }

    String[] words = new String[input.length()];
    words =  input.split(" ");
    String reverseString = "";

    System.out.println("Words: ");
        for(int p = 0; p<words.length;p++){
            System.out.println(words[p]);
        }
    

    for(int i=(words.length)-1; i>=0;i--){
        System.out.println("------------------------");
        System.out.println("i ="+i);
        System.out.println("Current Word: "+words[i]);
        reverseString = reverseString+words[i]+" ";
    }
    System.out.println(reverseString);
    return reverseString;
}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}