public class TyoeConversionCasting{
    public static void main(String[] args) {
        //TYPE CONVERSION
        byte b=27;
        long d=b;
        System.out.println(d);

        //TYPE CASTING
        int a=10;
        byte by=(byte)(a);
        System.out.println(by);

        //AUTOMATIC TYPE PROMOTION IN EXPRESSION
        byte i=40;
        byte j=30;
        byte k=100;
        int l=i*j/k;
        System.out.println(l);

    }
}
