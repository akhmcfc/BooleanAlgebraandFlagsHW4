public class Main {
    public static void main(String[] args)
    {
        int n1=387;
        int n2=6381;
        int x=1;
        boolean LCM=true;
        while(LCM==true)
        {
            if(x%n1==0&&x%n2==0)
            {
            LCM=false;
            }
            x=x+1;



        }
        System.out.println(x);

    }
}