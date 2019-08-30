package card;

import java.util.Comparator;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/8/30 15:52
 **/
public class iCard implements Comparable<iCard> {
    private int point;
    private Type type;

    public iCard(int point, Type type) {
        this.point = point;
        this.type = type;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


    @Override
    public int compareTo(iCard c2) {
        if (this.getType().getCode() > c2.getType().getCode()) {
            return 1;
        } else if (this.getType().getCode() < c2.getType().getCode()) {
            return -1;
        } else {
            if (this.getPoint() > c2.getPoint()) return 1;
            else if (this.getPoint() < c2.getPoint()) return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        iCard card = (iCard) o;

        if (point != card.point) return false;
        return type.getCode() == card.type.getCode();
    }

    @Override
    public int hashCode() {
        int result = point;
        result = 31 * result + (type != null ? type.getCode() + type.getDesc().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return point + type.getDesc();
    }
}
