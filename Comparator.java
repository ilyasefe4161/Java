import java.util.Comparator;

class numberComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.number - o2.number;
    }
}
class nameComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return (int)(o1.name.compareTo(o2.name));
    }
}