public class OOPS_02_getter_setter {
    public static void main(String[] args) {
        Pen01 p1 = new Pen01();

        System.out.println(p1.getColor());

        p1.setColor("red");

        System.out.println(p1.getColor());

    }
}

class Pen01{
    private String color = "blue";
    private int tip = 5;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor (String color){
        this.color = color;
    }

    void setTip (int tip){
        this.tip = tip;
    }
}
