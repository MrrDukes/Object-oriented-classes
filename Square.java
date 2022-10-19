public class Square extends Polygon{

    //attributes of square class
    float size;

    //contructor
    public Square(){
        this.setNumberofsides(4);
    }//end constructor

    //getters sand setters for the attributes od the square class
    public float getSize() {

        return size;
    }//end getter

    public void setSize(float size){
        this.size = size;
    }//end setter
}
