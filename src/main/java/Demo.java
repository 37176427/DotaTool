import chess.*;
import spec.AiRen;
import spec.Spec;

import javax.swing.*;
import java.awt.*;
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


    public static void main(String[] args) {

        JFrame frame = new JFrame("自走棋羁绊查看器  by.heasy");
        frame.setContentPane(new Demo().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLocationRelativeTo(null);
        frame.setBounds(900,100,900,1500);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.pack();
    }


    //添加棋子 1检测棋子数量 2添加属性与棋子map
    private boolean addChess(Chess chess) {
        if (chesses.size() != 10) {
            chesses.add(chess);
            addSpec(chess.getSpec());
            return true;
        } else {
            System.out.println("棋子数量已达上限！");
            return false;
        }
    }

    private boolean delChess(Chess chess) {
        if (chesses.size() != 0) {
            chesses.remove(chess);
            delSpec(chess.getSpec());
            return true;
        } else {
            System.out.println("删除失败！不能再删除了");
            return false;
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
                if (!textArea.getText().contains(properties.get(i))) {
                    textArea.setText(textArea.getText() + properties.get(i) + "\r\n");
                }//else 属性已存在不添加
            } else {
                //删除描述
                textArea.setText(textArea.getText().replace(properties.get(i) + "\r\n", ""));
            }
        }
    }


    private void init() {
        specMap = new HashMap<Spec, Integer>();
        chesses = new HashSet<Chess>();
        FuWangCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FuWang o = FuWang.getInstacne();
                if (FuWangCb.isSelected()) {
                    if (!addChess(o)) {
                        FuWangCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        FuWangCb.setSelected(true);
                    }
                }
            }
        });
        MeiHuoMoNvCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MeiHuoMoNv o = MeiHuoMoNv.getInstacne();
                if (MeiHuoMoNvCb.isSelected()) {
                    if (!addChess(o)) {
                        MeiHuoMoNvCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        MeiHuoMoNvCb.setSelected(true);
                    }
                }
            }
        });
        ShiRenMoMoFaShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShiRenMoMoFaShi o = ShiRenMoMoFaShi.getInstacne();
                if (ShiRenMoMoFaShiCb.isSelected()) {
                    if (!addChess(o)) {
                        ShiRenMoMoFaShiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        ShiRenMoMoFaShiCb.setSelected(true);
                    }
                }
            }
        });
        JuYaHaiMinCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JuYaHaiMin o = JuYaHaiMin.getInstacne();
                if (JuYaHaiMinCb.isSelected()) {
                    if (!addChess(o)) {
                        JuYaHaiMinCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        JuYaHaiMinCb.setSelected(true);
                    }
                }
            }
        });
        ZhuoErYouXiaCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ZhuoErYouXia o = ZhuoErYouXia.getInstacne();
                if (ZhuoErYouXiaCb.isSelected()) {
                    if (!addChess(o)) {
                        ZhuoErYouXiaCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        ZhuoErYouXiaCb.setSelected(true);
                    }
                }
            }
        });
        ShangJinLieRenCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShangJinLieRen o = ShangJinLieRen.getInstacne();
                if (ShangJinLieRenCb.isSelected()) {
                    if (!addChess(o)) {
                        ShangJinLieRenCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        ShangJinLieRenCb.setSelected(true);
                    }
                }
            }
        });
        FaTiaoJiShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FaTiaoJiShi o = FaTiaoJiShi.getInstacne();
                if (FaTiaoJiShiCb.isSelected()) {
                    if (!addChess(o)) {
                        FaTiaoJiShiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        FaTiaoJiShiCb.setSelected(true);
                    }
                }
            }
        });
        AnYingSaManCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AnYingSaMan o = AnYingSaMan.getInstacne();
                if (AnYingSaManCb.isSelected()) {
                    if (!addChess(o)) {
                        AnYingSaManCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        AnYingSaManCb.setSelected(true);
                    }
                }
            }
        });
        BianFuQiShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BianFuQiShi o = BianFuQiShi.getInstacne();
                if (BianFuQiShiCb.isSelected()) {
                    if (!addChess(o)) {
                        BianFuQiShiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        BianFuQiShiCb.setSelected(true);
                    }
                }
            }
        });
        XiuBuJiangCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                XiuBuJiang o = XiuBuJiang.getInstacne();
                if (XiuBuJiangCb.isSelected()) {
                    if (!addChess(o)) {
                        XiuBuJiangCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        XiuBuJiangCb.setSelected(true);
                    }
                }
            }
        });
        DiFaShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DiFaShi o = DiFaShi.getInstacne();
                if (DiFaShiCb.isSelected()) {
                    if (!addChess(o)) {
                        DiFaShiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        DiFaShiCb.setSelected(true);
                    }
                }
            }
        });
        XiaoXiaoCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                XiaoXiao o = XiaoXiao.getInstacne();
                if (XiaoXiaoCb.isSelected()) {
                    if (!addChess(o)) {
                        XiaoXiaoCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        XiaoXiaoCb.setSelected(true);
                    }
                }
            }
        });
        ShuiJingShiNvCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShuiJingShiNv o = ShuiJingShiNv.getInstacne();
                if (ShuiJingShiNvCb.isSelected()) {
                    if (!addChess(o)) {
                        ShuiJingShiNvCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        ShuiJingShiNvCb.setSelected(true);
                    }
                }
            }
        });
        ShouWangCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShouWang o = ShouWang.getInstacne();
                if (ShouWangCb.isSelected()) {
                    if (!addChess(o)) {
                        ShouWangCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        ShouWangCb.setSelected(true);
                    }
                }
            }
        });
        JianShengCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JianSheng o = JianSheng.getInstacne();
                if (JianShengCb.isSelected()) {
                    if (!addChess(o)) {
                        JianShengCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        JianShengCb.setSelected(true);
                    }
                }
            }
        });
        FaMuJiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FaMuJi o = FaMuJi.getInstacne();
                if (FaMuJiCb.isSelected()) {
                    if (!addChess(o)) {
                        FaMuJiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        FaMuJiCb.setSelected(true);
                    }
                }
            }
        });
        TongKuNvWangCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TongKuNvWang o = TongKuNvWang.getInstacne();
                if (TongKuNvWangCb.isSelected()) {
                    if (!addChess(o)) {
                        TongKuNvWangCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        TongKuNvWangCb.setSelected(true);
                    }
                }
            }
        });
        JingLingLongCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JingLingLong o = JingLingLong.getInstacne();
                if (JingLingLongCb.isSelected()) {
                    if (!addChess(o)) {
                        JingLingLongCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        JingLingLongCb.setSelected(true);
                    }
                }
            }
        });
        WuYiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                WuYi o = WuYi.getInstacne();
                if (WuYiCb.isSelected()) {
                    if (!addChess(o)) {
                        WuYiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        WuYiCb.setSelected(true);
                    }
                }
            }
        });
        YuRenShouWeiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                YuRenShouWei o = YuRenShouWei.getInstacne();
                if (YuRenShouWeiCb.isSelected()) {
                    if (!addChess(o)) {
                        YuRenShouWeiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        YuRenShouWeiCb.setSelected(true);
                    }
                }
            }
        });
        HunDunQiShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HunDunQiShi o = HunDunQiShi.getInstacne();
                if (HunDunQiShiCb.isSelected()) {
                    if (!addChess(o)) {
                        HunDunQiShiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        HunDunQiShiCb.setSelected(true);
                    }
                }
            }
        });
        ShuJingWeiShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShuJingWeiShi o = ShuJingWeiShi.getInstacne();
                if (ShuJingWeiShiCb.isSelected()) {
                    if (!addChess(o)) {
                        ShuJingWeiShiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        ShuJingWeiShiCb.setSelected(true);
                    }
                }
            }
        });
        YueZhiQiShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                YueZhiQiShi o = YueZhiQiShi.getInstacne();
                if (YueZhiQiShiCb.isSelected()) {
                    if (!addChess(o)) {
                        YueZhiQiShiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        YueZhiQiShiCb.setSelected(true);
                    }
                }
            }
        });
        XianZhiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                XianZhi o = XianZhi.getInstacne();
                if (XianZhiCb.isSelected()) {
                    if (!addChess(o)) {
                        XianZhiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        XianZhiCb.setSelected(true);
                    }
                }
            }
        });
        BianTiJingLingCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BianTiJingLing o = BianTiJingLing.getInstacne();
                if (BianTiJingLingCb.isSelected()) {
                    if (!addChess(o)) {
                        BianTiJingLingCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        BianTiJingLingCb.setSelected(true);
                    }
                }
            }
        });
        YuRenYeXingZheCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                YuRenYeXingZhe o = YuRenYeXingZhe.getInstacne();
                if (YuRenYeXingZheCb.isSelected()) {
                    if (!addChess(o)) {
                        YuRenYeXingZheCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        YuRenYeXingZheCb.setSelected(true);
                    }
                }
            }
        });
        LangRenCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LangRen o = LangRen.getInstacne();
                if (LangRenCb.isSelected()) {
                    if (!addChess(o)) {
                        LangRenCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        LangRenCb.setSelected(true);
                    }
                }
            }
        });
        JuDuShuShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JuDuShuShi o = JuDuShuShi.getInstacne();
                if (JuDuShuShiCb.isSelected()) {
                    if (!addChess(o)) {
                        JuDuShuShiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        JuDuShuShiCb.setSelected(true);
                    }
                }
            }
        });
        QuanNengQiShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                QuanNengQiShi o = QuanNengQiShi.getInstacne();
                if (QuanNengQiShiCb.isSelected()) {
                    if (!addChess(o)) {
                        QuanNengQiShiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        QuanNengQiShiCb.setSelected(true);
                    }
                }
            }
        });
        ShanDianYouHunCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShanDianYouHun o = ShanDianYouHun.getInstacne();
                if (ShanDianYouHunCb.isSelected()) {
                    if (!addChess(o)) {
                        ShanDianYouHunCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        ShanDianYouHunCb.setSelected(true);
                    }
                }
            }
        });
        FengXingZheCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FengXingZhe o = FengXingZhe.getInstacne();
                if (FengXingZheCb.isSelected()) {
                    if (!addChess(o)) {
                        FengXingZheCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        FengXingZheCb.setSelected(true);
                    }
                }
            }
        });
        HuanYingCiKeCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HuanYingCiKe o = HuanYingCiKe.getInstacne();
                if (HuanYingCiKeCb.isSelected()) {
                    if (!addChess(o)) {
                        HuanYingCiKeCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        HuanYingCiKeCb.setSelected(true);
                    }
                }
            }
        });
        SiWangQiShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SiWangQiShi o = SiWangQiShi.getInstacne();
                if (SiWangQiShiCb.isSelected()) {
                    if (!addChess(o)) {
                        SiWangQiShiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        SiWangQiShiCb.setSelected(true);
                    }
                }
            }
        });
        ShaWangCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShaWang o = ShaWang.getInstacne();
                if (ShaWangCb.isSelected()) {
                    if (!addChess(o)) {
                        ShaWangCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        ShaWangCb.setSelected(true);
                    }
                }
            }
        });
        JuJiShouCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JuJiShou o = JuJiShou.getInstacne();
                if (JuJiShouCb.isSelected()) {
                    if (!addChess(o)) {
                        JuJiShouCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        JuJiShouCb.setSelected(true);
                    }
                }
            }
        });
        MingJieYaLongCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MingJieYaLong o = MingJieYaLong.getInstacne();
                if (MingJieYaLongCb.isSelected()) {
                    if (!addChess(o)) {
                        MingJieYaLongCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        MingJieYaLongCb.setSelected(true);
                    }
                }
            }
        });
        YingMoCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                YingMo o = YingMo.getInstacne();
                if (YingMoCb.isSelected()) {
                    if (!addChess(o)) {
                        YingMoCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        YingMoCb.setSelected(true);
                    }
                }
            }
        });
        XiuDouMoDaoShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                XiuDouMoDaoShi o = XiuDouMoDaoShi.getInstacne();
                if (XiuDouMoDaoShiCb.isSelected()) {
                    if (!addChess(o)) {
                        XiuDouMoDaoShiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        XiuDouMoDaoShiCb.setSelected(true);
                    }
                }
            }
        });
        LingHunShouWeiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LingHunShouWei o = LingHunShouWei.getInstacne();
                if (LingHunShouWeiCb.isSelected()) {
                    if (!addChess(o)) {
                        LingHunShouWeiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        LingHunShouWeiCb.setSelected(true);
                    }
                }
            }
        });
        YinXingCiKeCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                YinXingCiKe o = YinXingCiKe.getInstacne();
                if (YinXingCiKeCb.isSelected()) {
                    if (!addChess(o)) {
                        YinXingCiKeCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        YinXingCiKeCb.setSelected(true);
                    }
                }
            }
        });
        YueZhiNvJiSiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                YueZhiNvJiSi o = YueZhiNvJiSi.getInstacne();
                if (YueZhiNvJiSiCb.isSelected()) {
                    if (!addChess(o)) {
                        YueZhiNvJiSiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        YueZhiNvJiSiCb.setSelected(true);
                    }
                }
            }
        });
        MoRiShiZheCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MoRiShiZhe o = MoRiShiZhe.getInstacne();
                if (MoRiShiZheCb.isSelected()) {
                    if (!addChess(o)) {
                        MoRiShiZheCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        MoRiShiZheCb.setSelected(true);
                    }
                }
            }
        });
        HaiJunShangJiangCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HaiJunShangJiang o = HaiJunShangJiang.getInstacne();
                if (HaiJunShangJiangCb.isSelected()) {
                    if (!addChess(o)) {
                        HaiJunShangJiangCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        HaiJunShangJiangCb.setSelected(true);
                    }
                }
            }
        });
        JuMoZhanJiangCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JuMoZhanJiang o = JuMoZhanJiang.getInstacne();
                if (JuMoZhanJiangCb.isSelected()) {
                    if (!addChess(o)) {
                        JuMoZhanJiangCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        JuMoZhanJiangCb.setSelected(true);
                    }
                }
            }
        });
        GuangZhiShouWeiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GuangZhiShouWei o = GuangZhiShouWei.getInstacne();
                if (GuangZhiShouWeiCb.isSelected()) {
                    if (!addChess(o)) {
                        GuangZhiShouWeiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        GuangZhiShouWeiCb.setSelected(true);
                    }
                }
            }
        });
        SiLingFaShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SiLingFaShi o = SiLingFaShi.getInstacne();
                if (SiLingFaShiCb.isSelected()) {
                    if (!addChess(o)) {
                        SiLingFaShiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        SiLingFaShiCb.setSelected(true);
                    }
                }
            }
        });
        ShengTangCiKeCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShengTangCiKe o = ShengTangCiKe.getInstacne();
                if (ShengTangCiKeCb.isSelected()) {
                    if (!addChess(o)) {
                        ShengTangCiKeCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        ShengTangCiKeCb.setSelected(true);
                    }
                }
            }
        });
        LianJinShuShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LianJinShuShi o = LianJinShuShi.getInstacne();
                if (LianJinShuShiCb.isSelected()) {
                    if (!addChess(o)) {
                        LianJinShuShiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        LianJinShuShiCb.setSelected(true);
                    }
                }
            }
        });
        GanRaoZheCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GanRaoZhe o = GanRaoZhe.getInstacne();
                if (GanRaoZheCb.isSelected()) {
                    if (!addChess(o)) {
                        GanRaoZheCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        GanRaoZheCb.setSelected(true);
                    }
                }
            }
        });
        SheFaNvYaoCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SheFaNvYao o = SheFaNvYao.getInstacne();
                if (SheFaNvYaoCb.isSelected()) {
                    if (!addChess(o)) {
                        SheFaNvYaoCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        SheFaNvYaoCb.setSelected(true);
                    }
                }
            }
        });
        LongQiShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LongQiShi o = LongQiShi.getInstacne();
                if (LongQiShiCb.isSelected()) {
                    if (!addChess(o)) {
                        LongQiShiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        LongQiShiCb.setSelected(true);
                    }
                }
            }
        });
        LiZhuaDeLuYiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LiZhuaDeLuYi o = LiZhuaDeLuYi.getInstacne();
                if (LiZhuaDeLuYiCb.isSelected()) {
                    if (!addChess(o)) {
                        LiZhuaDeLuYiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        LiZhuaDeLuYiCb.setSelected(true);
                    }
                }
            }
        });
        AiRenZhiShengJiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AiRenZhiShengJi o = AiRenZhiShengJi.getInstacne();
                if (AiRenZhiShengJiCb.isSelected()) {
                    if (!addChess(o)) {
                        AiRenZhiShengJiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        AiRenZhiShengJiCb.setSelected(true);
                    }
                }
            }
        });
        WuYaoCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                WuYao o = WuYao.getInstacne();
                if (WuYaoCb.isSelected()) {
                    if (!addChess(o)) {
                        WuYaoCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        WuYaoCb.setSelected(true);
                    }
                }
            }
        });
        ChaoXiLieRenCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ChaoXiLieRen o = ChaoXiLieRen.getInstacne();
                if (ChaoXiLieRenCb.isSelected()) {
                    if (!addChess(o)) {
                        ChaoXiLieRenCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        ChaoXiLieRenCb.setSelected(true);
                    }
                }
            }
        });
        MiTuanCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MiTuan o = MiTuan.getInstacne();
                if (MiTuanCb.isSelected()) {
                    if (!addChess(o)) {
                        MiTuanCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        MiTuanCb.setSelected(true);
                    }
                }
            }
        });
        DiJingGongChengShiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DiJingGongChengShi o = DiJingGongChengShi.getInstacne();
                if (DiJingGongChengShiCb.isSelected()) {
                    if (!addChess(o)) {
                        DiJingGongChengShiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        DiJingGongChengShiCb.setSelected(true);
                    }
                }
            }
        });
        SiWangXianZhiCb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SiWangXianZhi o = SiWangXianZhi.getInstacne();
                if (SiWangXianZhiCb.isSelected()) {
                    if (!addChess(o)) {
                        SiWangXianZhiCb.setSelected(false);
                    }
                } else {
                    if (!delChess(o)) {
                        SiWangXianZhiCb.setSelected(true);
                    }
                }
            }
        });
    }


}
