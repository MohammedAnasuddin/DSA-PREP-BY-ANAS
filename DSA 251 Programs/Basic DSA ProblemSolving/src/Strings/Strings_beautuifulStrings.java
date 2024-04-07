package Strings;

public class Strings_beautuifulStrings {
    public static void main(String[] args) {
        // String str = "01010010101";
        String str = "110011001100";
        // Try slving for above i/p o/p should be 6


        // String str = "110011001100";
        // String str = "110011001100";
        // String str = "00001";
        // String str = "101010000010110100";
        makeBeautiful(str);
    }

    public static int makeBeautiful(String str) {
        int n_operations = 0;
        // int c =0;
        System.out.println("String: "+str);
        System.out.println("String Length: "+str.length());
        // StringBuilder even_str = new StringBuilder(str);
        // if(even_str.length()%2 !=0){
        // System.out.println("The even_str is odd appending");
        // even_str=even_str.append(str.charAt(str.length()-1));
        // }

        // long sTime = System.nanoTime();
        // System.out.println("Modified even str: "+even_str);
        // System.out.println("even_str Length: "+even_str.length());
        char[] cstr = new char[str.length()];
        cstr = str.toCharArray();

        for (int i = 1; i < cstr.length && i >= 1; i++) {
            System.out.println("------------------------");
            System.out.println("i =" + i);
            // System.out.println("c =" + c);
            System.out.println("i-1 " + cstr[i - 1] + " = " + " i " + cstr[i] );

            if (cstr[i] == '0') {

                System.out.println("Current Element i is 0");

                if (cstr[i - 1] == '1') {
                    System.out.println("i-1 element is 1 continuing");

                    continue;
                } else {
                    System.out.println("i-1 and i are same so operation to be done");
                    System.out.println("No of elemets on left :"+i);
                    System.out.println("No of elemets on Right :"+((cstr.length - 1) - i));
                    // System.out.println("Next Element : "+cstr[i+1]);
                    // if (i <= ((cstr.length - 1) - i) && cstr[i + 1] != cstr[i]) {
                    if (i <= ((cstr.length - 1) - i) && cstr[i -1] != cstr[i+1]) {
                        
                        System.out.println("Left has less elements");
                        System.out.println("Nex Element is not same so proceeding left");
                        cstr[i - 1] = '1';
                        n_operations++;
                        System.out.println("Operations count: " + n_operations);
                        if(i==1)
                            i=0;
                        else
                        i = i - 2;
                        // c=c-2;
                        System.out.println("left element changed restarting the loop");

                    } else {
                        System.out.println("Right has less elements changing them");
                        System.out.println("Next element is not same so proceeding right");
                        cstr[i] = '1';
                        n_operations++;

                        // System.out.println("Operations count: "+n_operations);
                    }

                    System.out.println("Updated String:");
                    for (int p = 0; p < cstr.length; p++) {
                        System.out.print(cstr[p] + ",");
                    }
                    // System.out.println();
                }
            }

            else {

                System.out.println("Current Element i is 1");

                if (cstr[i - 1] == '0') {
                    System.out.println("i-1 element is 0 continuing");

                    continue;
                } else {
                    System.out.println("i-1 and i are same so operation to be done");
                    System.out.println("nEXT eLEEMENT: " + cstr[i+1]);
                    System.out.println("No of elemets on left :"+i);
                    System.out.println("No of elemets on Right :"+((cstr.length - 1) - i));
                    if (i <=((cstr.length - 1) - i) && cstr[i -1] != cstr[i+1]) {
                        System.out.println("Lft has less elements changng those");
                        cstr[i - 1] = '0';
                        n_operations++;
                        System.out.println("Operations count: " + n_operations);
                        if(i==1)
                        i=0;
                        else
                        i = i - 2;
                        // c = c-2;

                        System.out.println("left element changed restarting the loop");

                    } else {
                        System.out.println("Right has less elements changing them");
                        cstr[i] = '0';
                        n_operations++;
                        System.out.println("Operations count: " + n_operations);

                    }

                    // cstr[i] = '0';
                    // n_operations++;
                    // System.out.println("Operations count: "+n_operations);

                    System.out.println("Updated String:");
                    for (int p = 0; p < cstr.length; p++) {
                        System.out.print(cstr[p] + ",");
                    }
                    System.out.println();
                }

            }

        }

        /*
         * System.out.print("Final cstr: ");
         * for(int p = 0;p<cstr.length;p++){
         * System.out.print(cstr[p]+",");
         * }
         * System.out.println();
         */
        System.out.print("Final String : ");
        for (int p = 0; p < cstr.length; p++) {
            System.out.print(cstr[p] + ",");
        }

        System.out.println("Final Return Count of operations: " + n_operations);

        // long eTime = System.nanoTime();
        // System.out.printf("Time Taken: %.3f seconds%n", (eTime - sTime) /
        // 1_000_000_000.0);
        return n_operations;

    }

}
