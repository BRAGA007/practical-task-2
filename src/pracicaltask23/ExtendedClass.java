package pracicaltask23;

import java.util.Objects;


public class ExtendedClass extends ParentClass {
    byte b;
    int i;
    double d;
    String s;

    public ExtendedClass() {
    }

    public ExtendedClass(byte b, int i, double d, String s) {
        this.b = b;
        this.i = i;
        this.d = d;
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExtendedClass that = (ExtendedClass) o;
        return b == that.b && i == that.i && Double.compare(that.d, d) == 0 && Objects.equals(s, that.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(b, i, d, s);
    }

    @Override
    public String toString() {
        return "ExtendedClass{" +
                "b=" + b +
                ", i=" + i +
                ", d=" + d +
                ", s='" + s + '\'' +
                '}';
    }
}