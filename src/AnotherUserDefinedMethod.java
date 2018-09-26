public class AnotherUserDefinedMethod {
    public static void main(String[] args) {

        System.out.println("Number\tCube");

        for(int i = 1; i <= 15; i++)
        {
            System.out.println(i + "\t\t" + cube(i));
        }

    }

    private static int cube(int number)
    {
        int cubeValue;

        cubeValue = (number*number*number);

        return cubeValue;
    }
}
