public class Calculator {

    static String x = null;

    public static void main(String[] args) {
        try {
            x = (Under.isTrueString()).replaceAll(" ", "");

        } catch (OwnException e) {
            e.printStackTrace();
            System.out.println(e);
        }

    }

}

