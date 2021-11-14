package SELFEDU.CourseVTB.lesson1;

public class Box {
    String color;
    int size;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object){
            return true;
        }
        if (!(object instanceof Box)){
            return false;
        }
        Box another = (Box) object;
        return this.color.equals(another.color) && this.size == another.size;
    }

    @Override   //hashCode и equals переопределяют вместе
    public int hashCode() {
        return color.length()*13+size*71;
    }
}
