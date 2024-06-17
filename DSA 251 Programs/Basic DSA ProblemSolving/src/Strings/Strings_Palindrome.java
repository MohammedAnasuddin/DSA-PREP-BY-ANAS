package Strings;
import java.util.*;
import java.math.BigInteger;
public class Strings_Palindrome {
    public static void main(String[] args) {
        //// System.out.println(12462799726421 - 12462788885278);

        // Odd

        // String number = "12963";
        // int length = 5;
        
        // Even
        // String number = "6499986";
        // int length = 7;


        //> Understanding Constraints:
        //> Given , 1 <= len(S) <= 10^4
        //> that is the length of string can have 10^4 digits
        //> Here Indirect Constraints are given
        //> if length = 10^1  then max no. is 9_999_999_9
        
        //> To get the least no. with digits d uis :
          // - A number with  d digits ranges from 10^(d-1) to 10^d -1
        //> Maximum Constraint for this problem is 1 folllowed by 9999  zeroes
        

    long startTime = System.currentTimeMillis();
        String number = "809900622348245118249419616862572095475876895573687105113968970435782575502916674608155752219842078423802033041800100800258638397482877585870143302831559510546684687968397158621755510303156296239360651667407993493809160794406491625339377658894969645432343279589765123247617249020586194570284617507103846225666945384507238266622904785558436368439607783123128503355022171366420027566482533034046709330308397013387885336225650878727074447491620021486680453206120014626511365612398968106743440369425367642912937934435597464355694760688270882860339590362933107104202908285401958593650013286543373257949170532773475725176852528783835008373063507555272263859081207538767485587206690755699580019696696673852936919642749809076629087047737127830300633353018076998939169536797852413301352847635547595996311136488820675561927298149441478429887972665902790253742403764029047158797897916673543089465436919612170627834335002877520781240698339180649062408255849097332534813227551266784684876107826240375478180568422536859655462463432714731525629022528242131893681149378272812153579974124233969600144352443851230063341941146089624537956732894564912120215350031749018404316920783837867195305878546252194320213978138938245212081905454240410700116150052243092346559443707907181542873191065814476817143491477113811607975090391291078350963580380942385198367737803547240000311656131161563945614390380804960314358342008857267350567712822054764868544050463543500627996635189998716521913949345083716805166078647763684184137360517214492070342595682817459914148384470995664897846384149287442249694100113499173834159955368362768556995337318818429598585685676842615563833562977442241279004765989245133707471586568377139190825525649967253100469440042700010436422809464433026035478953467501189722295905845719950167548320595677424492515908573543134608166545410062134108991763154417367023242656697565743272434906097862942832513907549585928257239505078739845979237575903360183247448119467741699184526979304842034454415080515251295753388248549283649117954370743727791311439147210746466205898377109485999822684526222174416979814403626987885160541714859559277824967723570929531425054560765738041760774401782057748860275564367501926283146940548623172575539692244540733730390192343173537115650159923264995816784020087495284307728578893236086123437889453406890160895521918718967606649482757571364608849624532426254666261771354845691029218477751396961897072066442087367454879982565049056852808791651754854541532243914765730598786738433877355669459150327410291161563861983224921850465476977051979331311382914491390534185981330710983886720670490619068678357203970837027842526055049291443447249808858078296348653227881240500172744756767500785562332440742860575084264485302114730192109164971430051937287492424173733555709449220878065452565570616285066044626164745320696060188772450608764026307560277641521780681200677395813466923312706950824984804953166249896301002807990086949048108384581452534015982251784154231474572246284136098182360878830214237070331163575281351242562538730330357933701307705435382319863160534568866888365129454805167919841621788473673316941239324824242727559413211249943412091198585284422774461359465641592569581035016288920727636241546041605658495502215400779689031384481108785911710096477971453915650492097310630004788570173120746539857244388856139121206119080637443401389388881791165826270418473849942895787674307530837462725537133388808151627324263498234763329907387961162088222578073278177790830229875371686310193180602745637742914141815770564151809036159987244897048375414607314249595363815430183948040765577520241851684709045748003206428716567380408193765659526011006418396259301872578520229727118074147478871704309723854791719745319290375522845156141823666137365281960220988456229494894547697714379844445349198988070229517082371420872895746070318311728709395589503579247555109100049607244926089770700177470686280092490801900024649212989259666997888386261910589052906835525280158667022902220659526000846721407689883501085951196307962011927089711196159641478576617968736280581108579855708284";
        
        // int length = 8;


        // String number = "289996";7
        // String number = "290091";
        int length = 6;


        // Scanner iscan = new Scanner(System.in);
        // // // Test case
        // int length = iscan.nextInt();
        // String number =iscan.nextLine() ;
        nextLargestPalindrome(number, length);

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

    System.out.println("Runtime: " + executionTime + "ms");
    }

    public static String nextLargestPalindrome(String number, int length) {
      System.out.println("String_Number: " + number);
        BigInteger big_num = new BigInteger(number);
        big_num = big_num.add(BigInteger.ONE);

        
    


        number = big_num.toString();

      System.out.println("String_Number after incremnt: " + number);
        length = number.length();
      // ("String_Number_Length: " + length);/
      System.out.println("Number_Nature: " + (length % 2 == 0 ? "Even" : "Odd"));



        
        
        
        
        //> Plaindrome CHeck: Wheher the incemented number is palindrome then  return it
        
       System.out.println("**Checking for Plaindrome**");
        
        StringBuilder palindrome_Check = new StringBuilder(number);
        String reversed_incremented_number = palindrome_Check.reverse().toString();
        palindrome_Check = palindrome_Check.reverse();
       System.out.println("palindrome_Check: "+palindrome_Check.toString());
      System.out.println("reversed: "+reversed_incremented_number);
      System.out.println("palindrome_Check after reversing: "+palindrome_Check.toString());

        if(reversed_incremented_number.equals(palindrome_Check.toString())){
           System.out.println("Incremented nuber is palindrome itself");
            return palindrome_Check.toString();
        }
        
        
        
        




       System.out.println("\n\n\nCheck failed: going for the Algo\n\n\n");
        
        
        
        StringBuilder palindrome_number = new StringBuilder();
        
        if (length == 1) {
           System.out.println("Return: " + number);
            return number;
        } else if (length == 2) {
            char digits[] = number.toCharArray();
            if (Character.getNumericValue(digits[0]) < Character.getNumericValue(digits[1])) {
                palindrome_number.append(digits[1]);
                palindrome_number.append(digits[1]);
            } else {
                palindrome_number.append(digits[0]);
                palindrome_number.append(digits[0]);
            }
           System.out.println("Return: " + palindrome_number.toString());
            return palindrome_number.toString();
        } else {
            String real_left,real_right;

            // System.out.println("length/2: "+length/2);
            String mid="";

            if (length % 2 == 0) {
                // Even No.of Elements
                // no subtaction since substrig is inclusive at end index
                // palindrome_number = new StringBuilder(number.substring(0, (length /
                // 2)));

                real_left = number.substring(0, (length / 2)-1);
                mid = number.substring((length / 2) - 1, (length / 2) + 1);
                real_right = number.substring(((length / 2)+1), length);

                // System.out.println("Even Left: "+real_left);
                // System.out.println("Even Right: "+real_right);
                // palindrome_number.append(real_left);
                // palindrome_number.reverse();

                // if( Long.parseLong(real_right)>Long.parseLong(palindrome_number.reverse().toString())){
                  //  System.out.println("Need to increment the left");
                //     palindrome_number.setLength(0);
                  //  System.out.println("String builder resetted: "+palindrome_number.toString());
                //     real_left = String.valueOf(Long.parseLong(real_left)+1);
                  //  System.out.println("Even Left after incrementing: "+real_left);
                    
                // }
                // palindrome_number.append(real_left);
                // System.out.println("String builder after appending incremented left: "+palindrome_number.toString());
                // real_right = palindrome_number.reverse().toString();
                // palindrome_number.reverse();
                // palindrome_number.append(real_right);

            } else {

                // Odd No. of elements
                real_left = number.substring(0, (length / 2));
                mid = number.substring((length / 2), (length / 2) + 1);
                real_right = number.substring(((length / 2) + 1), length);
                
            }
                // palindrome_number = new StringBuilder(number.substring(0, (length /
                // 2) - 1));
                // -1 since 2 elemnts are mid for even
            

           System.out.println("Left of the String: " + real_left);
           System.out.println("Mid of the String: " + mid);
           System.out.println("Right of the String: " + real_right);

            palindrome_number.append(real_left);
           System.out.println("Appended left to palindrome: " + palindrome_number.toString());

            String palindrome_right = palindrome_number.reverse().toString();
            palindrome_number.reverse();

            BigInteger big_palindrome_right = new BigInteger(palindrome_right);
            BigInteger big_real_right = new BigInteger(real_right);

            boolean mid_increment = false;



            // > this is not the right condition to check the right is to check whether the digits of mid are same or not
            if(
                
                big_palindrome_right.compareTo(big_real_right) < 0 ){
                    // > I want to also chect for gretaer than condition
                    // System.out.println(palindrome_right+" < "+real_right+" "+((Integer.valueOf(palindrome_right)) <= (Integer.valueOf(real_right))));
                   System.out.println("Incrementing the Mid");
                    mid_increment = true;
                }

                    //if mid length 1 increment if 2 pairing up
                    // if mid = 9 or 90,-------99 then incremt left  by 1 and call fuction again
                
                
                if(mid.length() == 1 && mid_increment){
                   System.out.println("Mid length is 1");
                    if(Long.parseLong(mid)<9){
                       System.out.println("Mid: "+mid+" is < 9 just increment ");
                        mid = String.valueOf(Long.parseLong(mid)+1);
                       System.out.println("New Mid: "+mid);
                    
                    }
                    else{
                       System.out.println("Mid: "+mid+" is = 9 increment left");
                        mid="0"; //9+1 = 10 ) 0 is placed 1 is carried to left
                       System.out.println("New Mid: "+mid);
                        real_left = String.valueOf(Long.parseLong(real_left)+1);
                       System.out.println("New left: "+real_left);

                         //> Recursion Approach
                        // StringBuilder string_to_pass = new StringBuilder();
                        // string_to_pass.append(real_left);
                        // string_to_pass.append(mid);
                        // string_to_pass.append(palindrome_right);
                        // System.out.println("New String to be [passed: ]"+string_to_pass.toString());
                        // System.out.println("-----------------------------------------------");
                        // String final_palindrome = nextLargestPalindrome(string_to_pass.toString(),string_to_pass.toString().length() );
                        // System.out.println("Immediate next Palindrome: "+final_palindrome);
                        // return final_palindrome;


                        //> Non Recursion Approach
                        palindrome_number.setLength(0);
                      System.out.println("palindrome_number after setig to 0: "+palindrome_number.toString());
                        palindrome_number.append(real_left);
                        real_right = palindrome_number.reverse().toString();
                        palindrome_number.reverse();
                        palindrome_number.append("0"); 
                      System.out.println("StrinBuilder after left incremnt and ) from mid: "+palindrome_number.toString());
                        palindrome_number.append(real_right);
                        


                      System.out.println("Next palindrome is: " + palindrome_number.toString());
                        return palindrome_number.toString();
                    }
                }

                if(
                    (mid.length() ==2) && (mid_increment || (mid.charAt(0)!=mid.charAt(1)))
                    
                    ){
                    if(Long.parseLong(mid)<10){
                        mid="11";
                    }
                    else if (((Long.parseLong(mid)) >= 11 && (Long.parseLong(mid)) < 22))
                    mid="22";
                    // palindrome_number.append("22");
                else if (((Long.parseLong(mid)) >= 22 && (Long.parseLong(mid)) < 33))
                mid="33";    
                // palindrome_number.append("33");
                else if (((Long.parseLong(mid)) >= 33 && (Long.parseLong(mid)) < 44))
                mid="44";    
                // palindrome_number.append("44");
                else if (((Long.parseLong(mid)) >= 44 && (Long.parseLong(mid)) < 55))
                mid="55";    
                // palindrome_number.append("55");
                else if (((Long.parseLong(mid)) >= 55 && (Long.parseLong(mid)) < 66))
                mid="66";    
                    // palindrome_number.append("66");
                else if (((Long.parseLong(mid)) >= 66 && (Long.parseLong(mid)) < 77))
                // palindrome_number.append("77");
                mid="77";    
                else if (((Long.parseLong(mid)) >= 77 && (Long.parseLong(mid)) < 88))
                // palindrome_number.append("88");
                mid="88";    
                else if (((Long.parseLong(mid)) >= 88 && (Long.parseLong(mid)) < 99))
                // palindrome_number.append("88");
                mid="99";    
                else {
                   System.out.println("Mid:"+mid+ "is in 90 series recall the function and assign mid 00 incremt left");
                    mid="00";
                    real_left = String.valueOf(Long.parseLong(real_left)+1);
                       System.out.println("New left: "+real_left);


                        palindrome_number.setLength(0);
                       System.out.println("palindrome_number after setig to 0: "+palindrome_number.toString());
                        palindrome_number.append(real_left);
                        palindrome_number.append("0"); 
                       System.out.println("StrinBuilder after left incremnt and ) from mid: "+palindrome_number.toString());
                        real_right = palindrome_number.reverse().toString();
                        palindrome_number.reverse();
                        palindrome_number.append(real_right);
                        


                       System.out.println("Next palindrome is: " + palindrome_number.toString());
                        return palindrome_number.toString();

                        // StringBuilder string_to_pass = new StringBuilder();
                        // string_to_pass.append(real_left);
                        // string_to_pass.append(mid);
                        // string_to_pass.append(palindrome_right);
                        // System.out.println("New String to be [passed: ]"+string_to_pass.toString());
                        // System.out.println("-----------------------------------------------");
                        // nextLargestPalindrome(string_to_pass.toString(),string_to_pass.toString().length() );
                        // String final_palindrome = nextLargestPalindrome(string_to_pass.toString(),string_to_pass.toString().length() );
                        // System.out.println("Immediate next Palindrome: "+final_palindrome);
                        // return final_palindrome;

                }

                }
                
                
                // if(mid.length() ==2){
                //     if(mid.charAt(0)!=mid.charAt(1)){
                      //  System.out.println(mid+" ->Mid with 2 digits is palndrome,fixing it ");

                //         if(Long.parseLong(mid)<10){
                //             mid="11";
                //         }
                //         else if (((Long.parseLong(mid)) >= 11 && (Long.parseLong(mid)) < 22))
                //         mid="22";
                        
                //     else if (((Long.parseLong(mid)) >= 22 && (Long.parseLong(mid)) < 33))
                //     mid="33";    
                    
                //     else if (((Long.parseLong(mid)) >= 33 && (Long.parseLong(mid)) < 44))
                //     mid="44";    
                    
                //     else if (((Long.parseLong(mid)) >= 44 && (Long.parseLong(mid)) < 55))
                //     mid="55";    
                    
                //     else if (((Long.parseLong(mid)) >= 55 && (Long.parseLong(mid)) < 66))
                //     mid="66";    
                        
                //     else if (((Long.parseLong(mid)) >= 66 && (Long.parseLong(mid)) < 77))
                    
                //     mid="77";    
                //     else if (((Long.parseLong(mid)) >= 77 && (Long.parseLong(mid)) < 88))
                    
                //     mid="88"; 
                    
                //     else 
                //     mid="99";

                //     }
                  //  System.out.println("Mid after fixing: "+ mid);

                // }




                palindrome_number.append(mid);
                       System.out.println("Palindrome after mid: " + palindrome_number.toString());
            palindrome_number.append(palindrome_right);

            
       System.out.println("Next palindrome is: " + palindrome_number.toString());
        return palindrome_number.toString();
    }

    }
}
