public class Main {
    public static void main(String[] args) {
    //int number = 4;
   // int finalNumber =20;
    //while(number <= finalNumber){
      //  number++;
       // if (!isEvenNumber(number)){
         //   continue;
       // }
       // System.out.println("Even number " + number);
    //}
        int number = 4;
        int finalNumber =20;
        int evenNumbersFound = 0;

        while(number <= finalNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);

            evenNumbersFound ++;
            if (evenNumbersFound >= 5){
                break;
            }

        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }




    //isEvenNumber(61);
    //isEvenNumber(30238122);

    /*public static boolean isEvenNumber(int number){
     while (true)
         if (number % 2 == 0) {
             System.out.println(number + " is true");
             break;
         }
        else if (number % 2 == 1){
             System.out.println(number + " is false");
            break;
        }
       return false;

     */
    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }

}
