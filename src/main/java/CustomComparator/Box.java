package CustomComparator;

public class Box implements Comparable<Box>{
    public int id;
    public int length;
    public int width;
    public int height;
    private int volume;

    public Box(int id, int length, int width, int height) {
        this.id = id;
        this.length = length;
        this.width = width;
        this.height = height;
        this.volume = this.length*this.width*this.height;
    }

    @Override
    public String toString() {
        return id + "";
    }

    @Override
    public int compareTo(Box box) {
        if(this.volume == box.volume) return 0;
        if(this.volume < box.volume) return 1;
        else return -1;

    }
}
