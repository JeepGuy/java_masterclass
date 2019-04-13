import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {

    private static boolean areEqual;

    public static void main(String[] args) {

        System.out.println("DecimalComparator");

        areEqual = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(areEqual);

        areEqual = areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(areEqual);

        areEqual = areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(areEqual);

//        areEqual = areEqualByThreeDecimalPlaces(3.00, 2.0);
//        System.out.println(areEqual);
        

    }

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo){
        return (int) (numberOne * 1000) == (int) (numberTwo * 1000);
    }



    // my lengthy solution that converts to the number to a string.
    public static boolean areEqualByThreeDecimalPlaces2(double numberOne, double numberTwo){

        boolean areEqualValue;

        String numberOneTrimmed;
        String numberTwoTrimmed;

        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.DOWN);

        numberOneTrimmed = df.format(numberOne);

        numberTwoTrimmed = df.format(numberTwo);


        if (numberOneTrimmed.equals(numberTwoTrimmed)) {
            areEqualValue = true;
        } else{
            areEqualValue = false;
        }
        return areEqualValue;
    }
}