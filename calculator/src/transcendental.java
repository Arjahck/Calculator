import java.lang.Math;

public class transcendental {

    private double a;
    private double b;
    private double result;

    void exponent(){
         result = Math.pow(a,b);
    }

    void factorial(){
        result=1;
        for(int i=1; i<=a;i++){
            result *= i;
        }
    }

    void sin(){
        double b = Math.toRadians(a);
         result = Math.sin(b);
    }

    void sinh(){
        double b = Math.toRadians(a);
        result = Math.sinh(b);
    }

    void cos(){
        double b = Math.toRadians(a);
         result = Math.cos(b);
    }

    void cosh(){
        double b = Math.toRadians(a);
        result = Math.cosh(b);
    }

    public double getNumber(){
        return this.result;
    }

    public void setNumbers(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setNumbers(double a) {
        this.a = a;
    }
}
