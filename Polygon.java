public class Polygon {

    //Attributes of the class polygon
    private int numberofsides;

    //Main method creates a new polygon
    public static void main(String[] args) {
        //create a new polygon with fives sides
        Polygon mypolygon = new Polygon();
        mypolygon.setNumberofsides(5);

        //print out the number of sides the polygon has
        System.out.println("this poloygon has " + mypolygon.getNumberofsides() + "sides");

        //otinal challenge creat a triangle
        Polygon triangle = new Polygon();
        triangle.setNumberofsides(3);
        System.out.println("this polygon has " + triangle.getNumberofsides() +
                "sides becuase it is a triangle");

        //creat a square wich is a polygin with 4 sides
        Square square = new Square();
        square.setSize(4.5f);
        System.out.println("this aquare has " + square.getNumberofsides() + "size ");

    }//end sides

    //constuctor method to create a new polygin

    public Polygon() {

    }//end contructor

    //get the attributes for the numbers of sides
    public int getNumberofsides() {
        return numberofsides;
    }//end getters

    //set the attributes for the polygon numbers of sides
    public void setNumberofsides(int sides) {
        this.numberofsides = sides;

    }//end getters
}
