public class BasicoppConcept {

    public  static void main(String args[]) {
        Pen p1 = new Pen();
        p1.Setcolor("blue");
        p1.Settip(5);

        p1.color = "yellow";  // this assignment is possible because as we have not given any public specifiers to color variable

        //p1.tipsize = 5;  //java: tipsize has private access in Pen
    }
}

class Pen {
    private int tipsize;
    String color;

    void Settip(int tip) {
        tipsize = tip;
        System.out.println(tipsize);
    }
    void Setcolor(String colour) {
        color = colour;
        System.out.println(color);
    }
}