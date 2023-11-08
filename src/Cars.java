public class Cars {

    String name;

    String color;

    int maxSpeed;

    boolean isRaceCar;

    public Cars(String pName,String pColor,int pMaxSpeed, boolean pIsRaceCar){
        name= pName;
        color= pColor;
        maxSpeed = pMaxSpeed;
        isRaceCar = pIsRaceCar;


    }

    public Cars(){
        name="Lighting McQueen";
        color= "red and yellow";
        maxSpeed = 230;
        isRaceCar = true;

    }

    public void DescribeCar(){
        System.out.print("Hey there! My name is "+name+" . It's great to meet you! I'm a "+color+" car. Yes, it is " +
                isRaceCar + " that I'm a race car. I can go as fast as " + maxSpeed+" miles per hour!");
    }





}
