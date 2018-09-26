public class AnotherUserDefinedMethodV2 {
    public static void main(String[] args) {

        System.out.println("Number\tCube");

        for(int i = 1; i <= 15; i++)
        {
            System.out.println(i + "\t\t" + MyMethods.cube(i));
        }

    }
}
