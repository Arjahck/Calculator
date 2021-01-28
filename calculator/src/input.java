import java.util.Scanner;

public class input {

    private double a;
    private double b;
    private String operator;

    public input() {

        Scanner scan = new Scanner(System.in);
        System.out.printf("input your first number :");
        a = scan.nextDouble();
        Scanner scan2 = new Scanner(System.in);
        System.out.printf("input your operator :");
        operator = scan2.nextLine();
        if (operator.length() > 1 || operator.equals("!")) {
            detect(operator,a);
        } else {
            System.out.printf("input your second number :");
            b = scan.nextDouble();
            detect(operator, a, b);
        }
    }

    void detect(String operator, double a, double b){
        if(operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/")) {
            algebric algebric = new algebric();
            algebric.setNumbers(a,b);
            if(operator.equals("+")) {
                algebric.addition();
            }
            else if(operator.equals("-")) {
                algebric.substraction();
            }
            else if(operator.equals("*")) {
                algebric.multiplication();
            }
            else if(operator.equals("/")) {
                algebric.division();
            }
            result(algebric.getNumber());
        }
        else if(operator.equals("^")){
            transcendental transcendental = new transcendental();
            transcendental.setNumbers(a,b);
            transcendental.exponent();
            result(transcendental.getNumber());
        }

    }

    void detect(String operator, double a) {
        transcendental transcendental = new transcendental();
        transcendental.setNumbers(a);
        if(operator.equals("!")) {
            transcendental.factorial();
        }
        else if(operator.equals("sin")) {
            transcendental.sin();
        }
        else if(operator.equals("sinh")) {
            transcendental.sin();
        }
        else if(operator.equals("cos")) {
            transcendental.cos();
        }
        else if(operator.equals("cosh")) {
            transcendental.cos();
        }
        result(transcendental.getNumber());
    }

    void result(double result){
        System.out.println("result : " + result);
    }
}
