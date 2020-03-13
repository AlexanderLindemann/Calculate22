import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Under {


    static String isTrueString() throws OwnException {
        String a = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            a = (bufferedReader.readLine()).replaceAll(" ", "");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (a.matches("X{0,1}I{0,3}V{0,1}I{0,3}X{0,1}\\S{1}X{0,1}I{0,3}V{0,1}I{0,3}X{0,1}")) {
            System.out.println(RomanNumbers.arabicToRoman(resultForRomen(a)));
        }else if (a.matches("^([1-9]{1}|10)\\S{1}([1-9]{1}|10)")) {
            System.out.println(result(a));
        } else {
            throw new OwnException();
        }
        return a;
    }

    static ArrayList isABInt(String a) {
        String[] arrayData = a.split("\\+|\\-|\\*|\\/");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.parseInt(arrayData[0]));
        arrayList.add(Integer.parseInt(arrayData[1]));
        return arrayList;
    }

    static int result(String a) {
        int result = 0;
        ArrayList<Integer> dataOfCalculate = new ArrayList<>();
        dataOfCalculate = isABInt(a);
        char[] ch1 = (a.replaceAll("\\d", "")).toCharArray();
        char ch = ch1[0];
        switch (ch) {
            case '+':
                result = dataOfCalculate.get(0) + dataOfCalculate.get(1);
                break;
            case '-':
                result = dataOfCalculate.get(0) - dataOfCalculate.get(1);
                break;
            case '*':
                result = dataOfCalculate.get(0) * dataOfCalculate.get(1);
                break;
            case '/':
                result = dataOfCalculate.get(0) / dataOfCalculate.get(1);
                break;
            default:
                System.out.println("Error");
        }
        return result;
    }

    static ArrayList converseNumber(String a) {
        String[] arrayData = a.split("\\+|\\-|\\*|\\/");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(arrayData[0]);
        arrayList.add(arrayData[1]);
        return arrayList;
    }

    static int resultForRomen(String a) {
        int result = 0;
        ArrayList<String> arrayListOfRoman = converseNumber(a);
        ArrayList<Integer> dataOfCalculate = new ArrayList<>();
        dataOfCalculate.add(RomanNumbers.romanToArabic(arrayListOfRoman.get(0)));
        dataOfCalculate.add(RomanNumbers.romanToArabic(arrayListOfRoman.get(1)));
        char[] ch1 = (a.replaceAll("I|V|X", "")).toCharArray();
        char ch = ch1[0];
        switch (ch) {
            case '+':
                result = dataOfCalculate.get(0) + dataOfCalculate.get(1);
                break;
            case '-':
                result = dataOfCalculate.get(0) - dataOfCalculate.get(1);
                break;
            case '*':
                result = dataOfCalculate.get(0) * dataOfCalculate.get(1);
                break;
            case '/':
                result = dataOfCalculate.get(0) / dataOfCalculate.get(1);
                break;
            default:
                System.out.println("Error");
        }
        return result;
    }
}
