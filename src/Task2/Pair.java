package Task2;
import java.util.Objects;

class Pair <I, S> {

    private I first;
    private S second;

    private Pair(I i, S s) {
        this.first = i;
        this.second = s;
    }



    public static <I, S> Pair<I, S> of(I i, S s) {
        return new Pair(i, s);
    }

    public I getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pair))  {
            return Objects.equals(first, ((Pair<?, ?>) other).first) &&
                    Objects.equals(second, ((Pair<?, ?>) other).second);
        }
        return false;
    }

    public int hashCode() {
          return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

}
