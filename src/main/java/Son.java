public class Son extends Dad{
    String hairColour;

    public Son(String d) { //определение
        super(); //вызов конструктора Dad
        hairColour = d;
    }

    public String getHairColour() {
        return hairColour;
    }
}