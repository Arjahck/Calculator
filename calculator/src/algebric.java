public class algebric {

    private double a;
    private double b;
    private double result;

    void addition() {result = a+b;}
    void substraction() {result = a-b;}
    void multiplication() {result = a*b;}
    void division() {result = a/b;}

    public double getNumber(){
        return this.result;
    }

    public void setNumbers(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
