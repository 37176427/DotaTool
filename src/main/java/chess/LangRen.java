package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:35
 **/
public class LangRen extends Chess {
    private static LangRen instance;

    public static LangRen getInstacne() {
        if (instance == null) {
            instance = new LangRen();
        }
        return instance;
    }

    private LangRen() {
        this.setName("LangRen");
        this.setCost(3);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new RenLei());
        set.add(new YeShou());
        set.add(new ZhanShi());
        this.setSpec(set);
    }
}
