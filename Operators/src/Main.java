public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        result = result - 1;
        System.out.println(result);

        result = result * 10; // vermenigvuldigt
        System.out.println("2 * 10 = " + result);

        result = result / 5; // gedeeld door
        System.out.println("20 / 5 = " + result);

        result = result % 3; // Remainder van de operand (4 % 3 ) = 1 (omdat 3 maar 1 keer in 4 past)

        // result + 1;
        result ++; // is altijd + 1
        System.out.println("1 + 1 = " + result);

        result--; // is min 1
        System.out.println("1 - 1 = " + result);

        // result = result + 2
        result += 2;
        System.out.println("1 + 2 = " + result);

        // result = result * 10
        result *= 10;
        System.out.println("3 * 10 = " + result);

        // result / 3
        result /= 3;
        System.out.println("30 / 3 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("Is not an alien!");
            System.out.println("And I am scared of aliens.");
        }
        // nooit een semicolon ( ; ) achter de if statement zetten.
        // een enkele = kent een waarde aan een operand. De dubbele == vergelijkt de waarde met twee operands.
        // je kunt dit ook doen door (!isAlien) te doen ipv (isAlien == false).
        // altijd codeblock maken achter if statement {codeblok}

        int topScore = 80;
        if (topScore != 100){ // != is niet equal to
            System.out.println("You got the high score!");
        }
        // and operator &&
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)){ // indien dit niet allebei true is dan gebeurt er niks
            System.out.println("Greater than second top score and less than 100");
        // als je && gebruikt kijk je of beide waardes (links en rechts van de &&) true zijn.
        // als je beide waardes in haakjes () doet is het makkelijker om te zien wat er gebeurt.
            // indien dit niet allebei true is dan gebeurt er niks
        // && is een operator die eigenlijk altijd met boolean operands werkt, true of false.

        }
        // or operator ||
        // bij or operator hoeft maar 1 van de twee waardes true te zijn.
        // als beide false zijn gebeurt er niks
        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }
        // bij if statement moet je altijd een equal to operator gebruiken en nooit een assignment operator.
        // het = teken geeft een waarde aan de variabele, je moet dus een vergelijking maken en niet een waarde toekennen aangezien die al toegekend is.
        // je moet dus geen = doen maar het kan wel != == >= <= zijn
        // bij boolean kan dit echter wel omdat hij niet een waarde toekent
        int newValue = 50;
        if (newValue <= 50){
            System.out.println("This is an error");
        }
        // ! the not operator
        // gebruik je als boolean operator. het test het alternatieve waarde. Als isCar altijd true is dan is !isCar altijd false
        boolean isCar = false;
        if (!isCar){
            System.out.println("false");
        }
        else System.out.println("true");

        // ternary operator ?: Alles wat voor de ? komt is de conditie. Na het vraagteken komt true of false.(simpel gezien)

        isCar = true;
        boolean wasCar = isCar ? true : false;

        if (wasCar){
            System.out.println("wasCar is true");
        }

        // een beter voorbeeld van the ternary operator is dit
        /*
        case.equals("uppercase") ? "JOHN" : "john"
        de conditie is in dit geval case.equals("uppercase")
        de conditie is dus of true of false afhankelijk van de waardes.
        in dit geval is de conditie "uppercase" dus de waarde JOHN is true en john is false.
        Dus dat wat er voor de vraagteken komt is de conditie, daarachter is de true or false statement
        Het is dus in weze een if statement alleen dan korter
         */


        int ageOfCLient = 20;
        boolean isEighteenOrOver = ageOfCLient == 20 ? true : false;




    }
}
