package Task1;

public class method_left_rectangle {


    private double step = 0.1;

    public double integrate(argument x, double x1, double x2){
        double result = 0;
        double h = ((x2 - x1) / step);
        for(int i = 0; i < h; i++){
            result = result + x.Function(x1 + step * (i + step));
        }
        result = result*step;
        return result ;
    }
}
