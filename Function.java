import java.util.*;
import java.lang.*;

public class Function {
    private static double pi=3.14159265358979323846;
    private static double pi2=pi*2.0;
    private static int upper=100;

    public Function(){
        
    }

    public static void main(String[] args){

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
        return 0;
    }
}
