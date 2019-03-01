package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:37
 **/
public class QuanNengQiShi extends Chess {
    private static QuanNengQiShi instance;

    public static QuanNengQiShi getInstacne() {
        if (instance == null) {
            instance = new QuanNengQiShi();
        }
        return instance;
    }

    private QuanNengQiShi() {
        this.setName("QuanNengQiShi");
        this.setCost(3);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new RenLei());
        set.add(new QiShi());
        this.setSpec(set);
    }
}
