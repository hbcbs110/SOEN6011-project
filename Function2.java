import java.util.*;
import java.lang.*;

public class Function2 {
    private static final double pi=3.14159265358979323846;
    private static final double pi2=6.283185307179586476925;
    private static final double[] tanx=
            {0.10033467208545055,
            0.010000333346667209,
            0.001000000333333467,
            0.00010000000033333335,
            1.0000000000333335e-05,
            1.0000000000003337e-06,
            1.0000000000000037e-07,
            1.0000000000000005e-08,
            1.0000000000000005e-09,
            1.0000000000000006e-10,
            1.0000000000000006e-11,
            1.0000000000000006e-12,
            1.0000000000000007e-13,
            1.0000000000000008e-14,
            1e-15};

    public Function2(){

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Function2 f = new Function2();
        System.out.println("Welcome to the calculator of tan(x).");
        double x;
        while(true){
            System.out.print("input x: ");
            try{
                x=sc.nextDouble();
                System.out.print("tan(x)=");
                System.out.print(f.tan(x));
                System.out.println();
            }catch(Exception e){
                System.out.println("Invalid input. Please try again.");
                sc.next();
            }
        }
    }

    public double tan(double x){
        double sgn=1,res=0;
        int j=0;
        x-=(long)(x/pi)*pi;
        if(x<0){
            sgn*=-1;
            x=-x;
        }
        while(x>pi*0.5){
            x-=pi;
        }
        if(x<0){
            sgn*=-1;
            x=-x;
        }
        for(double i=0.1;i>1e-16&&j<15;i*=0.1){
            while(x>i){
                res=(res+tanx[j])/(1-res*tanx[j]);
                x-=i;
            }
            j++;
        }
        return sgn*res;
    }
}
