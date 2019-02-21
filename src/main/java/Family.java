//Attempt to create a nuclear "family" in order to practice classes and objects.



    public static void main (String[] args) {


     class Mom {
        String eyeColour;
        String hairColour;

        Mom(String a, String b) {
            a = "blue";
            b = "blond";
        }
    }

      class Dad {
        String eyeColour;
        String hairColour;

        Dad(String c, String d) {
            c = "brown";
            d = "black";
        }

    }


    class Daughter extends Mom {
        String a, b;
        @Override
        String a = "grey";
    }

        class Son extends Dad {
        String c, d;
        @Override
        String d = "red";
    }

}

