public class BinToDec{
    public static void BinNum(int BinNum)
    {
        int pow=0;
        int dec = 0;
        while(BinNum>0)
        {
            int lastDigit= BinNum%10;
            dec = dec + (int)(lastDigit*(Math.pow(2, pow)));
            pow++;
            BinNum =BinNum/10;


        }
        System.out.println(dec);


    }

    public static void main(String[] args)
    {
        BinNum(1111111);
    }
}