package card;

/**
 * 描述 ：麻将牌
 * 作者 ：WYH
 * 时间 ：2019/8/30 15:52
 **/
public final class Card implements Comparable<Card> {
    private int point;
    private Type type;

    public Card(int point, Type type) {
        this.point = point;
        this.type = type;
    }

    public final int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public final Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getValue() {
        String t;
        int code = type.getCode();
        if (code == 0) t = "z";
        else if (code == 1) t = "w";
        else if (code == 2) t = "t";
        else t = "b";
        return point + "" + t;
    }

    @Override
    public int compareTo(Card c2) {
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

        Card card = (Card) o;

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
        if (point == 0) return type.getDesc();
        return point + type.getDesc();
    }
}
