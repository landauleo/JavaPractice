public class Main {
    public static void main(String[] args) {
        Dad Jack = new Dad();
        Jack.getEyeColour();
        Son Michael = new Son("blond");
        Michael.getHairColour(); //объявление собственного метода
        Michael.getEyeColour(); //наследование параметра от отца

        Mom Jane = new Mom();
        Jane.getHairColour();
        Daughter Marry = new Daughter("green");
        Marry.getEyeColour(); //объявление собственного метода
        Marry.getHairColour();



    }
}
