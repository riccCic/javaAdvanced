package javaOopAdvanced._6;


public enum Season {
    SPRING,
    SUMMER,
    FALL,
    WINTER;

    public static String getDateRange(Season season) {
        switch (season) {
            case SPRING:
                return season.name()+"\n"+"March 20 - June 20"+"\n";
            case SUMMER:
                return season.name()+"\n"+"June 21 - September 21"+"\n";
            case FALL:
                return season.name()+"\n"+"September 22 - December 20"+"\n";
            case WINTER:
                return season.name()+"\n"+"December 21 - March 19"+"\n";
            default:
                return "";
        }
    }
}




