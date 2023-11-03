public class DecToBin {

    public static void DecToBinFun(int dec)
     {
        int bin = 0;
        int pow = 0;
        int rem = 0;

        while(dec>0)
        {
            rem = dec % 2;
            bin = bin + (int)(rem*Math.pow(2, pow));

            pow++ ;
            dec=dec/2;
        }
        System.out.println(bin);
    }

    public static void main(String[] args)
    {
        DecToBinFun(7);
    }
    
}