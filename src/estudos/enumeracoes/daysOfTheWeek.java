package estudos.enumeracoes;

public enum daysOfTheWeek {
    SUNDAY("Weekend"),
    MONDAY("Week day"),
    TUESDAY("Week day"),
    WEDNESDAY("Week day"),
    THURSDAY("Week day"),
    FRIDAY("Week day"),
    SATURDAY("Weekend");

    final String dayType;

    daysOfTheWeek(String dayType){
        this.dayType = dayType;
    }

    public String getDayType(){
        return this.dayType;
    }

}
