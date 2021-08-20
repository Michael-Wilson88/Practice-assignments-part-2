public class SpeedConverter {
    public static void main(String[] args) {
        // als je de main in een andere class heb kun je de methode
        // SpeedConverter.toMilesPerHour(...); gebruiken
        // of beter zelfs,
        // SpeedConverter.printConversion(...);

      printConversion(1.5);
      printConversion(10.25);
      printConversion(-5.6);
      printConversion(25.42);
      printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {

        double miles = kilometersPerHour / 1.609;
        if (kilometersPerHour < 0) return -1;
        else return Math.round(miles);
        // if(kilometersPerHour < 0) return -1;
        // return Math.round(kilometersPerHour / 1.609);

    }

    public static void printConversion(double kiloMetersPerHour) {
        long milesPerHour = toMilesPerHour(kiloMetersPerHour);

    if (milesPerHour < 0) System.out.println("Invalid Value");
    else System.out.println(kiloMetersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}

