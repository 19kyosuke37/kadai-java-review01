
public class JavaProgrammingBasicSummary {

    public static void main(String[] args) {

        add(24,26);

        double result = add(2.5,3.5);
        System.out.println("double型の加算:"+result);

        // TODO 自動生成されたメソッド・スタブ

    }

    public static void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("int型の加算:"+ result);

    }

    public static double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

}
