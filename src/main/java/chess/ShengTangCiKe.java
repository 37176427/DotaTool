package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:49
 **/
public class ShengTangCiKe extends Chess {
    private static ShengTangCiKe instance;

    public static ShengTangCiKe getInstacne() {
        if (instance == null) {
            instance = new ShengTangCiKe();
        }
        return instance;
    }

    private ShengTangCiKe() {
        this.setName("ShengTangCiKe");
        this.setCost(4);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new JingLing());
        set.add(new CiKe());
        this.setSpec(set);
    }
}
