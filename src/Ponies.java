public class Ponies {
    //true/false
    // numbers -> int -> double
    // words= string
    boolean isUnicorn;
    boolean isPegasus;
    double size;
    String name;
    String color;

    public Ponies(String pName, String pColor, boolean pisUnicorn, boolean pisPegasus, double pSize){
        System.out.println("made a new a pony!");
        isUnicorn= pisUnicorn;
        isPegasus= pisPegasus;
        size = pSize;
        name= pName;
        color= pColor;
    }

    public void describePony(){
        System.out.println("This is pony,"+ name + ". They are the color "+ color + ". They are the size " + size+". It is "
                + isUnicorn +"that the pony is a Unicorn. It is "+isPegasus+" that the pony is a pegasus.");


    }

    }



