public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Object Factory!");
        Ponies p;
        p=new Ponies("Bobby","pink", true, false, 40.2);
        System.out.println(p.isUnicorn);

        System.out.println(p.isUnicorn);
        System.out.println(p.name);
        p.describePony();



        Ponies f;
        f=new Ponies("Pinkie Pie","pink", true, true, 50.2);
        f.describePony();


        Ponies a;
        a=new Ponies("Teddy","blue",true, false,40.2);
       System.out.println("pony a's name is " + a.name);
        a.describePony();

        Ponies g;
        g=new Ponies("Twilight Sparkle","pink",true,true,409.6);
        System.out.println("pony a's name is " + a.name);
        g.describePony();

        Ponies l;
        l=new Ponies();

        l.name = "Sarah";
        l.describePony();

        Cars c;
        c=new Cars();
        c.DescribeCar();

        Cars d;
        d=new Cars("Sally","blue",200,false);
        d.DescribeCar();

        Cars m;
        m=new Cars("Mater","brown",210, false);
        m.DescribeCar();







    }


}