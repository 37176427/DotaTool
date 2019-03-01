package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:52
 **/
public class AiRenZhiShengJi extends Chess {
    private static AiRenZhiShengJi instance;

    public static AiRenZhiShengJi getInstacne() {
        if (instance == null) {
            instance = new AiRenZhiShengJi();
        }
        return instance;
    }

    private AiRenZhiShengJi() {
        this.setName("AiRenZhiShengJi");
        this.setCost(5);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new AiRen());
        set.add(new GongJiang());
        this.setSpec(set);
    }
}
