package enums;

public enum Categories {
    MOTORYZACJA("motoryzacja");

    private final String name;

    private Categories(String name){
        this.name = name;
    }

    public String category(){
        return this.name;
    }
}
