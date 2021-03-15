public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double decimalOne, double decimalTwo) {

        if (decimalOne == decimalTwo) {

            System.out.println(decimalOne + " is the same up to three decimal places as " + decimalTwo);
            System.out.println((int) decimalOne);
            return true;
        } else {
            //int num = (int) (decimalOne * 1000);
            String numAsString = Double.toString(decimalOne);
            //System.out.println((int) (decimalOne * 1000));
            //System.out.println((int) decimalOne);

            //int num2 = (int) (decimalTwo * 1000);
            String numAsString2 = Double.toString(decimalTwo);
            //System.out.println((int) (decimalTwo * 1000));
            //System.out.println((int) decimalTwo);

            boolean afterDot = false;
            int countDot = 0;
            for (int i = 0; i < numAsString.length(); i++) {
                //System.out.println("Index: " + i);
                //System.out.println("Current place: " + numAsString.charAt(i));
                //System.out.println("Current second place: " + numAsString2.charAt(i));
                if (0 == i) {
                    //numAsString.charAt(i)
                    if ('-' == numAsString.charAt(0)) {if ('-' != numAsString2.charAt(0)) return false;}
                    if ('-' == numAsString2.charAt(0)) {if ('-' != numAsString.charAt(0)) return false;}
                    //System.out.println("Wir sind an der Stelle im String: " + i);
                }

                if (numAsString.charAt(i) == '.') {
                    afterDot = true;
                }
                if (afterDot) {
                    countDot += 1;
                }
                if (countDot >= 5) {
                    break;
                }
                if (numAsString.charAt(i) != numAsString2.charAt(i)) {return false;}
            }
            return true;
        }
    }
}


// byte myNewByteValue = (byte) (myMinByteValue/2);