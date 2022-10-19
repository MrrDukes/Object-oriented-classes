public class Shapegenrator { public static void main(String[]args){


    System.out.println("short triangle\n");

    Triangle shorty = new Triangle();

    shorty.setHeight(3);
    shorty.setWidth(3);
    shorty.draw();

    System.out.println("\nTall rectangle\n");
    Rectangle tallrectangle = new Rectangle();

    tallrectangle.setHeight(8);
    tallrectangle.setWidth(4);
    tallrectangle.draw();

}
}//end class

