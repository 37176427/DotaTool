package card;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/8/30 15:54
 **/
public enum Type {
    ZHONG(0, "红中"),
    WAN(1, "万"),
    TIAO(2, "条"),
    BING(3, "饼");

    private int code;
    private String desc;

    Type(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
