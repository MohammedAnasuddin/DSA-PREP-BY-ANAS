package Strings;

import java.util.* ;
import java.io.*; 
public class Strings_minimumParenthesis {

    public static void main(String[] args) {
    //     int tc = 0;
    // Scanner iscan = new Scanner(System.in);
    // tc = iscan.nextInt();
    // String pattern = ")((()";
    String pattern = ")())(";
    

        
    // }
    minimumParentheses(pattern);
    }

    public static int minimumParentheses(String pattern) {

        int n=0;
        char[] bArr = new char[10000];
    
        bArr = pattern.toCharArray();
        for(int i=0;i<bArr.length;i++){
        System.out.println("---------------------------------");
        System.out.println("i ="+i);
        System.out.print("Current String: ");
        
        for(int p = 0;p<bArr.length;p++){
                System.out.print(bArr[p]+",");
            }
        System.out.println();
        //Close Bracket
        if(bArr[i] == ')'){
            System.out.println("Found closeB ) traversing left");

            for(int l =i;l>=0;l--){
            System.out.println("+++++++++++++++++++++");
            System.out.println("l ="+l);
            System.out.println("Compare Element : "+bArr[l]);

            if(bArr[l] == '('){
                System.out.println("Found openB for Closed Bracket Pair found so replacing them");
                // pattern = pattern.replace(pattern.charAt(l), 'd');
                bArr[l] = '0';
                System.out.println("Relaced openB");
                // pattern = pattern.replace(pattern.charAt(i), 'd');
                bArr[i] = '0';
                System.out.println("Replaced closeB");
                break;
                
            }
            else if(l==0){
                System.out.println("Traversed whole left side no openB found ");
                System.out.println("Increemnting n");
                n++;
                System.out.println("n ="+n);
                System.out.println("Replacing closeB");
                bArr[i] = '0';
                // pattern.replace(pattern.charAt(i), 'd');
            //    System.out.println("New String: "+pattern);
            break;
            }

            }
        }


        //open bracket
        else if(bArr[i] == '('){
            
            System.out.println("Found openB ) traversing right");
            for(int r = i ; r<bArr.length;r++){
                System.out.println("+++++++++++++++++++++");
                System.out.println("r ="+r);
                System.out.println("Compare Element : "+bArr[r]);
    
                if(bArr[r] == ')'){
                    System.out.println("Found closeB for openBracket Pair found so replacing them");
                    // pattern = pattern.replace(pattern.charAt(l), 'd');
                    bArr[r] = '0';
                    System.out.println("Relaced closeB");
                    // pattern = pattern.replace(pattern.charAt(i), 'd');
                    bArr[i] = '0';
                    System.out.println("Replaced openB");
                    break;
                    
                }
                else if(r== (bArr.length-1)){
                    System.out.println("Traversed whole right side no closeB found ");
                    System.out.println("Increemnting n");
                    n++;
                    System.out.println("n ="+n);
                    System.out.println("Replacing openB");
                    bArr[i] = '0';
                    // pattern.replace(pattern.charAt(i), 'd');
                //    System.out.println("New String: "+pattern);
                break;
                }

                


            }
        }
        else{
            System.out.println("Current Element: "+bArr[i]);
            System.out.println("Found 0 skip theiteration");
            continue;
        }


        }



        return n;
    }
}
