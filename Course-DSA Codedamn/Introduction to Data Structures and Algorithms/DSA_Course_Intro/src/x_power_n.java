public class x_power_n {
    public static int xpowern(int n,int pow){
        System.out.println("Currrent Power: "+pow);
        if(pow ==0) return 1;
        if(pow ==1) return n;
        return n*xpowern(n,--pow);
    }
    public static int xpowernRef(int n,int power[]){
        if(power[0]==0){
            return 1;
        }
        power[0]--;
        return n*xpowernRef(n,power);

    }
    public static void main(String[] args) {
        int n=2;
        int power[] = {3};
        int pow = 3;
        
        System.out.println("1.Recursive Approach:");
        System.out.println(xpowernRef(n,power));
        
        
        System.out.println("1.Recursive Approach non referenced:");
        System.out.println(xpowern(n,pow));



        // - Java does not pass parameters has reference.
        /*
        tip  To achieve Call by reference method create a single element of array
        tip  and pass it it would directly update at memory address
        tip Syntax:
            > int v[] = {single value}
            > pass as: func(v);  whole array nedds to be passed to achieve memeory addrress
            x don't just v[0] as single elemnt it is trated as int not as array 
            > receive : func( int v[]){
                > use_as: v[0]  
            > }
        
         */

        int xpn =1;
        for(int i=1;i<=3;i++){
            xpn = xpn*n;
        }
        System.out.println(n+"^"+pow+" using Iterative Approach: "+xpn);
    }
}
