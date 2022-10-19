public class Triangle extends Shape {

    //ovveride the draw method- thios polumorphism

    public void draw(){
        //draw triangle
        //using the height and the width

        for(int i = 0;i < this.height; i++){
            for(int j=0; j<i ; j++){
                System.out.print("*");
            }//end inder loop
            System.out.println("\n");
        }

    }//end method

}//end class
