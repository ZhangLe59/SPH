package zhangle.example.com.sph.bean;

import java.io.Serializable;

public class LinkData implements Serializable {
    private String start;
    private String next;

    public LinkData(String start, String next) {
        this.start = start;
        this.next = next;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "LinkData{" +
                "start='" + start + '\'' +
                ", next='" + next + '\'' +
                '}';
    }
}
