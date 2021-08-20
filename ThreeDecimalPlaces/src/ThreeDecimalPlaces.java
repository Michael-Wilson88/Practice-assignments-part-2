public class ThreeDecimalPlaces {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        if (firstNumber - secondNumber == 0 || firstNumber - secondNumber == 0.0001) return true;
        else return false;
    }
}
