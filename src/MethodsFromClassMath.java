public class MethodsFromClassMath {
    public static void main(String[] args) {

        double a = 1;
        double b = 6;
        double c = -16;

        double positiveEquationAnswer, negativeEquationAnswer;

        positiveEquationAnswer = positiveEquation(a,b,c);
        negativeEquationAnswer = negativeEquation(a,b,c);

        System.out.println(positiveEquationAnswer);
        System.out.println(negativeEquationAnswer);
    }

    public static double positiveEquation(double a, double b, double c)
    {
        double answer;

        answer = ((-b + (Math.sqrt((b*b) - ((4)*((a)*(c)))))) / (2*a));

        return answer;
    }

    public static double negativeEquation(double a, double b, double c)
    {
        double answer;

        answer = ((-b - (Math.sqrt((b*b) - ((4)*((a)*(c)))))) / (2*a));

        return answer;
    }
}
