package javaOopAdvanced._6;

public enum Days {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

public static Boolean isWeekend(Days days){
    if(days.name()==SATURDAY.name()||days.name()==SUNDAY.name()){
        return true;
    }else {
        return false;
    }
}
}

