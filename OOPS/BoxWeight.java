package inheritance;

public class BoxWeight extends Box {
    double weigth;
    BoxWeight(){
        super();
    }
    BoxWeight(double l,double h,double w,double weight){
        super(l,h,w);
        this.weigth=weight;
    }

    public BoxWeight(BoxPrice other) {
        super(other);
        this.weigth=other.weigth;
    }
}
