public class Rectangle extends Shape{

    //use polymorphism to ovveride the draw method

    public void draw(){
        //draw the retangle
        //usw the height and the width

        for(int i = 0;i < this.height; i++){
            for(int j=0; j< this.width; j++){
                System.out.print("*");
            }//end inder loop
            System.out.println("\n");
        }

    }



    }

