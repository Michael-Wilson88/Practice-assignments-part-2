public class Main {

    public static void main(String[] args) {

        double firstValue = 20.00;
        double secondValue = 80.00;

        double thirdValue = firstValue + secondValue * 100;
        System.out.println(thirdValue);

        double remainder = thirdValue % 40.00;
        System.out.println(remainder);

        boolean isNoRemainder = remainder == 0;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if(!isNoRemainder){
            System.out.println("Got some remainder " + remainder);
        }
        else System.out.println("Got no remainder mon!" + remainder);
        /*
        boolean isNoRemainder = remainder == 0 ? true : false;
        ofwel
        boolean isNoRemainder = remainder == 0;
           if(remainder == 0) dan is de noRemainder true

         System.out.println("isNoRemainder = " + isNoRemainder);
        if(isNoRemainder == false){
            System.out.println("Got some remainder " + remainder);
        else  System.out.println("Got no remainder mon!" + remainder);
         */

    }
}
