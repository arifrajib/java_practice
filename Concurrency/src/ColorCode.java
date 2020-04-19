public class ColorCode {
    final public static String COLOR_ONE   = "\u001b[42;1m";
    final public static String COLOR_TWO   =  "\u001b[43;1m";
    final public static String COLOR_THREE = "\u001b[45;1m";
    final public static String COLOR_FOUR  = "\u001b[46;1m";


    public static String textColor (String name) {
        switch (name){
            case "==Thread One==":
                return COLOR_ONE;
            case "==Thread Two==":
                return COLOR_TWO;
            case "==Thread Three==":
                return COLOR_THREE;
            default:
                return COLOR_FOUR;
        }
    }

}
