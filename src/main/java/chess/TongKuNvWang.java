package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:23
 **/
public class TongKuNvWang extends Chess {
    private static TongKuNvWang instance;

    public static TongKuNvWang getInstacne() {
        if (instance == null) {
            instance = new TongKuNvWang();
        }
        return instance;
    }

    private TongKuNvWang() {
        this.setName("TongKuNvWang");
        this.setCost(2);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new EMo());
        set.add(new CiKe());
        this.setSpec(set);
    }
}
