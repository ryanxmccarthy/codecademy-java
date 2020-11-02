//Noodle.java
class Noodle {

    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public void cook() {

        System.out.println("Boiling.");

        this.texture = "cooked";

    }

    public static void main(String[] args) {

        Spaetzle kaesespaetzle = new Spaetzle();
        kaesespaetzle.cook();

    }

}

// Spaetzle.java
class Spaetzle extends Noodle {

    Spaetzle() {

        super(3.0, 1.5, "irregular", "eggs, flour, salt");
        this.texture = "lumpy and liquid";

    }

    // Add the new cook() method below:
    @Override
    public void cook() {
        System.out.println("Grinding or scraping dough.");

        System.out.println("Boiling.");

        this.texture = "cooked";
    }

}