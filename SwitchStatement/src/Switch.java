public class Switch {
    public static void main(String[] args) {
        int value = 1;
        if (value == 1) System.out.println("Value is 1");
        else if (value == 2) System.out.println("Value is 2");
        else System.out.println("Neither 1 or 2");

        int switchValue = 1;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, a 4 or a 5");
                System.out.println("Actually the value is" + switchValue);
                break;
            default:
                System.out.println("Was neither 1 or 2");
                break;
        }
        // more code here after break
        // if you dont use break it will give unusual results
        // de break zorgt ervoor dat je code stopt en anders gaat het door tot het de volgende break heeft gevonden in je code
        // de laatste break kun je wel weghalen maar om consistent te blijven laat je die staan.

        char switchChar = 'A';
        switch (switchChar){
            case 'A':
                System.out.println("Value is A");
                break;
            case 'B':
                System.out.println("Value is B");
                break;
            case 'C':
                System.out.println("Value is C");
                break;
            case 'D':
                System.out.println("Value is D");
                break;
            case 'E':
                System.out.println("Value is E");
                break;
            default:
                System.out.println("None of the above");
                break;
        }
    }
}