package Task1;

public class method_left_rectangle {

   public double InFunction(double x) {
       return Math.sin(x);
   }
    private double step = 0.1;

    public double integrate(argument x, double x1, double x2){
        double result = 0;
        double h = ((x2 - x1) / step);
        for(int i = 0; i < h; i++){
            result = result + InFunction(x1 + step * i );
        }
        result = result*step;
        return result ;
    }
}
