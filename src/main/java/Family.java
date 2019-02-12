//Attempt to create a nuclear "family" in order to practice classes and objects.

public class Family {

    public static void main (String[] args) {

        FamilyMember mom = new FamilyMember();
        mom.age = 46;
        mom.eyeColour = "blue";
        mom.hairColour = "blond";
        mom.name = "Jane";
        mom.nickname = "Dear";
        mom.height = 167.5;

        FamilyMember dad = new FamilyMember();
        dad.name = "Dick";
        dad.nickname = "Almighty";
        dad.hairColour = "dark blond";
        dad.eyeColour = "green";
        dad.age = 50;
        dad.height = 186.3;

        FamilyMember eldestDaughter = new FamilyMember();
        eldestDaughter.name = "Angie";
        eldestDaughter.height = 165.9;
        eldestDaughter.nickname = "Sweetie";
        eldestDaughter.age = 23;
        eldestDaughter.eyeColour = "blue";


        FamilyMember middleDaughter = new FamilyMember();
        middleDaughter.eyeColour = "green";
        middleDaughter.age = 17;
        middleDaughter.name = "Johanna";
        middleDaughter.nickname = "Hey, you";

        FamilyMember youngestDaughter = new FamilyMember();
        youngestDaughter.nickname = "Baby";
        youngestDaughter.name = "Dora";
        youngestDaughter.age = 4;

        FamilyMember son = new FamilyMember();
        son.name = "Prokopiy";
        son.nickname = "Asshole";
    }

    public static class FamilyMember {

        public String name;
        public String nickname;
        public int age;
        public String eyeColour;
        public String hairColour;
        public double height;
    }
}

