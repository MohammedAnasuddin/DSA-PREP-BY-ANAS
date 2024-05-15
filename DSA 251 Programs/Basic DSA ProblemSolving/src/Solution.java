
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        //// System.out.println(12462799726421 - 12462788885278);
        // String number = "999";
        // String number = "12462788885278";
        // String number = "4654029508108";
        Scanner iscan = new Scanner(System.in);

        int length = iscan.nextInt();
        String number = iscan.nextLine();
        // String number = "123824802643";
        nextLargestPalindrome(number, length);
    }

    public static String nextLargestPalindrome(String number, int length) {
        System.out.println("Current String(before Increment): "+number);
    // char[] digits = new char[length];
    int i,j;
    long numOfString = Long.parseLong(number);
    numOfString++;
    number = String.valueOf(numOfString);
    // digits = number.toCharArray(); 
    System.out.println("Current String(after Increment): "+number);
    //  length = number.length();
    int[] digits = new int[number.length()];

    




if(length%2 == 0){
    System.out.println("Given String is Even Considering two mids");
    

for (i = 0; i <number.length(); i++) {
    digits[i] = Character.getNumericValue(number.charAt(i));
}
    System.out.print("Current digits:");
    for(int p = 0;p<length;p++){
        System.out.print(digits[p]+",");
    }
    System.out.println();
    int firstMid , secondMid;

    firstMid = (length/2)-1;
    secondMid = firstMid+1;

    System.out.println("FistMid Index: "+firstMid+" Element: "+digits[firstMid]);
    System.out.println("SecondMid Index: "+secondMid+" Element: "+digits[secondMid]);
    for(i=firstMid-1,j=secondMid+1;i>=0 && j<=(length-1);i--,j++){
        System.out.println("------------------------");
                System.out.println("i ="+i+"  element->"+digits[i]);
                System.out.println("j ="+j+"  element->"+digits[j]);
            
                digits[j] = digits[i];
    }
    System.out.println("After Copying Left Half on Right Half");
    for(int p = 0;p<length;p++){
        System.out.print(digits[p]+",");
    }
    System.out.println();
    System.out.println("Handling Mid Terms:");
    System.out.println("Merging digits and converting it to INT");
    String midTerm = digits[firstMid]+""+digits[secondMid];
    System.out.println("mid Term in String: "+midTerm);

    int midDigits = Integer.parseInt(midTerm);

    if(midDigits==0){
        digits[firstMid] = 0;
        digits[secondMid]=0;
    }
    else if(midDigits>=1 && midDigits<=10){
        digits[firstMid] = 1;
        digits[secondMid]=1;
    }
    else if(midDigits>=11 && midDigits<=21){
        digits[firstMid] = 2;
        digits[secondMid]=2;
    }
    else if(midDigits>=22 && midDigits<=32){
        digits[firstMid] = 3;
        digits[secondMid]=3;
    }
    else if(midDigits>=33 && midDigits<=43){
        digits[firstMid] = 4;
        digits[secondMid]=4;
    }
    else if(midDigits>=44 && midDigits<=54){
        digits[firstMid] = 5;
        digits[secondMid]=5;
    }
    else if(midDigits>=55 && midDigits<=65){
        digits[firstMid] = 6;
        digits[secondMid]=6;
    }
    else if(midDigits>=66 && midDigits<=76){
        digits[firstMid] = 7;
        digits[secondMid]=7;
    }
    else if(midDigits>=77 && midDigits<=87){
        digits[firstMid] = 8;
        digits[secondMid]=8;
    }
    else{
        digits[firstMid] = 9;
        digits[secondMid]=9;
    }

    

}

else{
    System.out.println("Given String is Odd Considering one mid");
    int mid = (length/2);
    System.out.println("mid Index: "+mid+" element->"+digits[mid]);
    if(number.charAt(mid+1) > number.charAt(mid-1) ){
        System.out.println("Have to increment leftHalf");
    String leftHalf = number.substring(0, mid+1);
    System.out.println("Left Half: "+leftHalf);
    int leftHalfDigits = Integer.parseInt(leftHalf);
    leftHalfDigits++;
    System.out.println("Left Halfnafter incrementing:"+leftHalfDigits);

    System.out.println("Modifying ht number String");
    System.out.println("Orginal String:"+number);
    number = String.valueOf(leftHalfDigits)+number.substring(mid+1);
    System.out.println("New modified Number :"+number);
    }
    // boolean incrementMid = false;
    // if(digits[mid+1]>digits[mid-1]){
    //     incrementMid = true;
    // }
    

for (i = 0; i <number.length(); i++) {
    digits[i] = Character.getNumericValue(number.charAt(i));
}
    System.out.print("Current digits:");
    for(int p = 0;p<length;p++){
        System.out.print(digits[p]+",");
    }
    System.out.println();

    for(i=mid-1,j=mid+1;i>=0 && j<=(length-1);i--,j++){
        System.out.println("------------------------");
        System.out.println("i ="+i+"  element->"+digits[i]);
        System.out.println("j ="+j+"  element->"+digits[j]);
    
        digits[j] = digits[i];
    }
    System.out.println("After Copying Left Half on Right Half");
    for(int p = 0;p<length;p++){
        System.out.print(digits[p]+",");
    }
    System.out.println();

    // if(incrementMid){
    // String leftHalf = number.substring(0, mid+1);
    

    // System.out.println("Left Half: "+leftHalf);
    // int leftIncrement = Integer.parseInt(leftHalf);
    // leftIncrement++;
    // System.out.println("Left half after Incrementing :"+leftIncrement);


    // leftHalf = String.valueOf(leftIncrement);

    // // if more than 2 digits changes after incremnt it won;t be  a palindrome aymore
    // // for example 9 is the mid term then it changes it left element too then  it will not be a palindrome anymore
    // }
    
}

    







    // number = String.copyValueOf(digits);
    StringBuilder sb = new StringBuilder();
    
    for (int num : digits) {
        sb.append(num);
    }
    
    number = sb.toString();
    System.out.println("Final Return :"+number);
    return number;
    }
}