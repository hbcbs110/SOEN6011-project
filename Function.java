import java.util.*;
import java.lang.*;

public class Function {
    private static final double pi=3.14159265358979323846;
    private static final double pi2=6.283185307179586476925;
    private static int upper=100;

    public Function(){
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Function f = new Function();
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

    public double sin(double x){
        x-=(long)(x/pi2)*pi2;
        double m=1,f=1,a=x,res=0;
        for(int i=0;i<=upper;i++){
            res+=m*a/f;
            a*=x*x;
            m=-m;
            f*=(2*i+2)*(2*i+3);
        }
        return res;
    }

    public double cos(double x){
        x-=(long)(x/pi2)*pi2;
        double m=1,f=1,a=1,res=0;
        for(int i=0;i<=upper;i++){
            res+=m*a/f;
            a*=x*x;
            m=-m;
            f*=(2*i+1)*(2*i+2);
        }
        return res;
    }

    public double tan(double x){
        double s=sin(x),c=cos(x);
        if(c==0.0) return Double.POSITIVE_INFINITY;
        return s/c;
    }
}
