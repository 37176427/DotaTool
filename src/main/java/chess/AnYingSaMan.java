package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 14:33
 **/
public class AnYingSaMan extends Chess {
    private static AnYingSaMan instance;

    public static AnYingSaMan getInstacne() {
        if (instance == null) {
            instance = new AnYingSaMan();
        }
        return instance;
    }

    private AnYingSaMan() {
        this.setName("AnYingSaMan");
        this.setCost(1);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new JuMo());
        set.add(new SaManJiSi());
        this.setSpec(set);
    }
}
