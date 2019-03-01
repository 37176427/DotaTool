import chess.*;
import spec.AiRen;
import spec.Spec;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

/**
 * 描述 ：主类
 * 作者 ：WYH
 * 时间 ：2019/3/1 11:56
 **/
public class Demo {
    private JPanel Panel;
    private JTextField title;
    private JButton closeBtn;
    private JCheckBox FuWangCb;
    private JCheckBox MeiHuoMoNvCb;
    private JCheckBox ShiRenMoMoFaShiCb;
    private JCheckBox JuYaHaiMinCb;
    private JCheckBox ZhuoErYouXiaCb;
    private JCheckBox ShangJinLieRenCb;
    private JCheckBox FaTiaoJiShiCb;
    private JCheckBox AnYingSaManCb;
    private JCheckBox BianFuQiShiCb;
    private JCheckBox XiuBuJiangCb;
    private JCheckBox DiFaShiCb;
    private JTextArea textArea;
    private JCheckBox JianShengCb;
    private JCheckBox FaMuJiCb;
    private JCheckBox ShuiJingShiNvCb;
    private JCheckBox ShouWangCb;
    private JCheckBox TongKuNvWangCb;
    private JCheckBox JingLingLongCb;
    private JCheckBox WuYiCb;
    private JCheckBox YuRenShouWeiCb;
    private JCheckBox HunDunQiShiCb;
    private JCheckBox ShuJingWeiShiCb;
    private JCheckBox YueZhiQiShiCb;
    private JCheckBox XianZhiCb;
    private JCheckBox LangRenCb;
    private JCheckBox JuDuShuShiCb;
    private JCheckBox QuanNengQiShiCb;
    private JCheckBox ShanDianYouHunCb;
    private JCheckBox AiRenZhiShengJiCb;
    private JCheckBox YueZhiNvJiSiCb;
    private JCheckBox XiaoXiaoCb;
    private JLabel Star1Label;
    private JLabel Star2Label;
    private JLabel Star3Label;
    private JLabel Star4Label;
    private JLabel Star5Label;
    private JCheckBox BianTiJingLingCb;
    private JCheckBox LingHunShouWeiCb;
    private JCheckBox YuRenYeXingZheCb;
    private JCheckBox FengXingZheCb;
    private JCheckBox HuanYingCiKeCb;
    private JCheckBox SiWangQiShiCb;
    private JCheckBox ShaWangCb;
    private JCheckBox YinXingCiKeCb;
    private JCheckBox JuJiShouCb;
    private JCheckBox MingJieYaLongCb;
    private JCheckBox YingMoCb;
    private JCheckBox XiuDouMoDaoShiCb;
    private JCheckBox MoRiShiZheCb;
    private JCheckBox HaiJunShangJiangCb;
    private JCheckBox JuMoZhanJiangCb;
    private JCheckBox GuangZhiShouWeiCb;
    private JCheckBox SiLingFaShiCb;
    private JCheckBox ShengTangCiKeCb;
    private JCheckBox LianJinShuShiCb;
    private JCheckBox GanRaoZheCb;
    private JCheckBox SheFaNvYaoCb;
    private JCheckBox LongQiShiCb;
    private JCheckBox LiZhuaDeLuYiCb;
    private JCheckBox WuYaoCb;
    private JCheckBox ChaoXiLieRenCb;
    private JCheckBox MiTuanCb;
    private JCheckBox DiJingGongChengShiCb;
    private JCheckBox SiWangXianZhiCb;
    //属性池
    private HashMap<Spec, Integer> specMap;
    //已点击棋子
    private HashSet<Chess> chesses;

    public Demo() {
        init();
    }


    //添加棋子 1检测棋子数量 2添加属性与棋子map
    private void addChess(Chess chess) {
        if (chesses.size() != 10) {
            chesses.add(chess);
            addSpec(chess.getSpec());
        } else {
            System.out.println("棋子数量已达上限！");
        }
    }

    private void delChess(Chess chess) {
        if (chesses.size() != 0) {
            chesses.remove(chess);
            delSpec(chess.getSpec());
        } else {
            System.out.println("删除失败！不能再删除了");
        }
    }

    //属性池增加棋子属性
    private void addSpec(HashSet<Spec> set) {
        for (Spec spec : set) {
            if (specMap.containsKey(spec)) {
                specMap.put(spec, specMap.get(spec) + 1);
            } else {
                specMap.put(spec, 1);
            }
            flashSpec(spec, specMap.get(spec));
        }
    }

    //属性池删除棋子属性
    private void delSpec(HashSet<Spec> set) {
        for (Spec spec : set) {
            if (specMap.containsKey(spec)) {
                specMap.put(spec, specMap.get(spec) - 1);
                flashSpec(spec, specMap.get(spec));
            }
        }
    }

    //调整属性文本显示
    private void flashSpec(Spec spec, Integer count) {
        TreeMap<Integer, String> properties = spec.getProperties();
        for (Integer i : properties.keySet()) {
            if (count >= i) {
                //添加描述
                textArea.append(properties.get(i) + "\r\n");
            } else {
                //删除描述
                textArea.setText(textArea.getText().replace(properties.get(i), ""));
            }
        }
    }


    public static void main(String[] args) {

        JFrame frame = new JFrame("Demo");
        frame.setContentPane(new Demo().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    private void init() {
        specMap = new HashMap<Spec, Integer>();
        chesses = new HashSet<Chess>();
        closeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        FuWangCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FuWang o = FuWang.getInstacne();
                if (FuWangCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        MeiHuoMoNvCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MeiHuoMoNv o = MeiHuoMoNv.getInstacne();
                if (MeiHuoMoNvCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        ShiRenMoMoFaShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShiRenMoMoFaShi o = ShiRenMoMoFaShi.getInstacne();
                if (ShiRenMoMoFaShiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        JuYaHaiMinCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JuYaHaiMin o = JuYaHaiMin.getInstacne();
                if (JuYaHaiMinCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        ZhuoErYouXiaCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ZhuoErYouXia o = ZhuoErYouXia.getInstacne();
                if (ZhuoErYouXiaCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        ShangJinLieRenCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShangJinLieRen o = ShangJinLieRen.getInstacne();
                if (ShangJinLieRenCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        FaTiaoJiShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FaTiaoJiShi o = FaTiaoJiShi.getInstacne();
                if (FaTiaoJiShiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        AnYingSaManCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AnYingSaMan o = AnYingSaMan.getInstacne();
                if (AnYingSaManCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        BianFuQiShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BianFuQiShi o = BianFuQiShi.getInstacne();
                if (BianFuQiShiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        XiuBuJiangCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                XiuBuJiang o = XiuBuJiang.getInstacne();
                if (XiuBuJiangCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        DiFaShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DiFaShi o = DiFaShi.getInstacne();
                if (DiFaShiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        XiaoXiaoCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                XiaoXiao o = XiaoXiao.getInstacne();
                if (XiaoXiaoCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        ShuiJingShiNvCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShuiJingShiNv o = ShuiJingShiNv.getInstacne();
                if (ShuiJingShiNvCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        ShouWangCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShouWang o = ShouWang.getInstacne();
                if (ShouWangCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        JianShengCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JianSheng o = JianSheng.getInstacne();
                if (JianShengCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        FaMuJiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FaMuJi o = FaMuJi.getInstacne();
                if (FaMuJiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        TongKuNvWangCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TongKuNvWang o = TongKuNvWang.getInstacne();
                if (TongKuNvWangCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        JingLingLongCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JingLingLong o = JingLingLong.getInstacne();
                if (JingLingLongCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        WuYiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                WuYi o = WuYi.getInstacne();
                if (WuYiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        YuRenShouWeiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                YuRenShouWei o = YuRenShouWei.getInstacne();
                if (YuRenShouWeiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        HunDunQiShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HunDunQiShi o = HunDunQiShi.getInstacne();
                if (HunDunQiShiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        ShuJingWeiShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShuJingWeiShi o = ShuJingWeiShi.getInstacne();
                if (ShuJingWeiShiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        YueZhiQiShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                YueZhiQiShi o = YueZhiQiShi.getInstacne();
                if (YueZhiQiShiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        XianZhiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                XianZhi o = XianZhi.getInstacne();
                if (XianZhiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        BianTiJingLingCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BianTiJingLing o = BianTiJingLing.getInstacne();
                if (BianTiJingLingCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        YuRenYeXingZheCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                YuRenYeXingZhe o = YuRenYeXingZhe.getInstacne();
                if (YuRenYeXingZheCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        LangRenCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LangRen o = LangRen.getInstacne();
                if (LangRenCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        JuDuShuShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JuDuShuShi o = JuDuShuShi.getInstacne();
                if (JuDuShuShiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        QuanNengQiShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                QuanNengQiShi o = QuanNengQiShi.getInstacne();
                if (QuanNengQiShiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        ShanDianYouHunCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShanDianYouHun o = ShanDianYouHun.getInstacne();
                if (ShanDianYouHunCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        FengXingZheCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FengXingZhe o = FengXingZhe.getInstacne();
                if (FengXingZheCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        HuanYingCiKeCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HuanYingCiKe o = HuanYingCiKe.getInstacne();
                if (HuanYingCiKeCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        SiWangQiShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SiWangQiShi o = SiWangQiShi.getInstacne();
                if (SiWangQiShiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        ShaWangCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShaWang o = ShaWang.getInstacne();
                if (ShaWangCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        JuJiShouCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JuJiShou o = JuJiShou.getInstacne();
                if (JuJiShouCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        MingJieYaLongCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MingJieYaLong o = MingJieYaLong.getInstacne();
                if (MingJieYaLongCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        YingMoCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                YingMo o = YingMo.getInstacne();
                if (YingMoCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        XiuDouMoDaoShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                XiuDouMoDaoShi o = XiuDouMoDaoShi.getInstacne();
                if (XiuDouMoDaoShiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        LingHunShouWeiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LingHunShouWei o = LingHunShouWei.getInstacne();
                if (LingHunShouWeiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        YinXingCiKeCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                YinXingCiKe o = YinXingCiKe.getInstacne();
                if (YinXingCiKeCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        YueZhiNvJiSiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                YueZhiNvJiSi o = YueZhiNvJiSi.getInstacne();
                if (YueZhiNvJiSiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        MoRiShiZheCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MoRiShiZhe o = MoRiShiZhe.getInstacne();
                if (MoRiShiZheCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        HaiJunShangJiangCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HaiJunShangJiang o = HaiJunShangJiang.getInstacne();
                if (HaiJunShangJiangCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        JuMoZhanJiangCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JuMoZhanJiang o = JuMoZhanJiang.getInstacne();
                if (JuMoZhanJiangCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        GuangZhiShouWeiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuangZhiShouWei o = GuangZhiShouWei.getInstacne();
                if (GuangZhiShouWeiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        SiLingFaShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SiLingFaShi o = SiLingFaShi.getInstacne();
                if (SiLingFaShiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        ShengTangCiKeCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShengTangCiKe o = ShengTangCiKe.getInstacne();
                if (ShengTangCiKeCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        LianJinShuShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LianJinShuShi o = LianJinShuShi.getInstacne();
                if (LianJinShuShiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        GanRaoZheCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GanRaoZhe o = GanRaoZhe.getInstacne();
                if (GanRaoZheCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        SheFaNvYaoCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SheFaNvYao o = SheFaNvYao.getInstacne();
                if (SheFaNvYaoCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        LongQiShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LongQiShi o = LongQiShi.getInstacne();
                if (LongQiShiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        LiZhuaDeLuYiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LiZhuaDeLuYi o = LiZhuaDeLuYi.getInstacne();
                if (LiZhuaDeLuYiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        AiRenZhiShengJiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AiRenZhiShengJi o = AiRenZhiShengJi.getInstacne();
                if (AiRenZhiShengJiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        WuYaoCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                WuYao o = WuYao.getInstacne();
                if (WuYaoCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        ChaoXiLieRenCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ChaoXiLieRen o = ChaoXiLieRen.getInstacne();
                if (ChaoXiLieRenCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        MiTuanCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MiTuan o = MiTuan.getInstacne();
                if (MiTuanCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        DiJingGongChengShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DiJingGongChengShi o = DiJingGongChengShi.getInstacne();
                if (DiJingGongChengShiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
        SiWangXianZhiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SiWangXianZhi o = SiWangXianZhi.getInstacne();
                if (SiWangXianZhiCb.isSelected()) {
                    addChess(o);
                } else {
                    delChess(o);
                }
            }
        });
    }


}
