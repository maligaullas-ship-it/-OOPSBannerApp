public class UC6OOPSBanner {



    public static String[] getOPattern() {
        return new String[]{
                "   ***   ",
                "  **   ** ",
                " **     **",
                " **     **",
                " **     **",
                "  **   ** ",
                "   ***   "
        };
    }

    // Method to generate pattern for letter 'P'
    public static String[] getPPattern() {
        return new String[]{
                " ******  ",
                " **   ** ",
                " **   ** ",
                " ******  ",
                " **      ",
                " **      ",
                " **      "
        };
    }

    // Method to generate pattern for letter 'S'
    public static String[] getSPattern() {
        return new String[]{
                "  ****** ",
                " **      ",
                " **      ",
                "  *****  ",
                "       **",
                "       **",
                " ******  "
        };
    }

    // Main method
    public static void main(String[] args) {

        // Get patterns using methods
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Loop to print OOPS banner
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                    oPattern[i] + " " +
                    oPattern[i] + " " +
                    pPattern[i] + " " +
                    sPattern[i]
            );
        }
    }
}

