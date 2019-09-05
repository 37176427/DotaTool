import card.Card;
import card.Type;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.*;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/8/30 15:05
 **/
public class MaJiang {
    private JPanel p;
    private JButton b1w;
    private JButton b9w;
    private JButton b2w;
    private JButton b8w;
    private JButton b1t;
    private JButton b2t;
    private JButton b3t;
    private JButton b4t;
    private JButton b5t;
    private JButton b6t;
    private JButton b7t;
    private JButton b8t;
    private JButton b9t;
    private JButton b1b;
    private JButton b2b;
    private JButton b3b;
    private JButton b4b;
    private JButton b5b;
    private JButton b6b;
    private JButton b7b;
    private JButton b8b;
    private JButton b9b;
    private JButton b3w;
    private JButton b4w;
    private JButton b5w;
    private JButton b6w;
    private JButton b7w;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JLabel l5;
    private JLabel l6;
    private JLabel l7;
    private JLabel l8;
    private JLabel l9;
    private JLabel l10;
    private JLabel l11;
    private JLabel l12;
    private JLabel l13;
    private JLabel l14;
    private JLabel tip;
    private JButton bzhong;
    private JLabel tipb;
    private JLabel tipt;
    private JLabel tipw;
    private JLabel rl1;
    private JLabel rl2;
    private JLabel rl3;
    private JLabel rl4;
    private JLabel rl5;
    private JLabel rl6;
    private JLabel rl7;
    private JLabel rl8;
    private JLabel rl9;
    private JLabel rl10;
    private JLabel rl11;
    private JLabel rl12;
    private JLabel rl13;
    private JLabel rl14;
    private JLabel rtip;
    private JLabel itip;
    private JLabel info;
    private JButton breset;
    private JLabel baoTip;
    private JLabel baoLable;
    private JLabel explain;
    private JButton bExit;
    private JLabel itip2;
    private JLabel useCardIndex;

    //原始牌列表
    private List<Card> rlist;
    //放牌整理好的列表
    private List<Card> list;
    //放展示页面的列表
    private List<JLabel> labels;
    //真实牌顺序列表
    private List<JLabel> rLabels;
    //真实顺序对应的映射
    private static Map<Integer, Card> map;
    //空牌图片
    private ImageIcon emptyIcon;
    //红中的文本
    private static final String ZHONG = "红中";

    MyBtnMouseListener mouseListener = new MyBtnMouseListener();
    MyRLabelListener rLabelListener = new MyRLabelListener();

    {
        emptyIcon = new ImageIcon(Toolkit.getDefaultToolkit().
                getImage(getClass().getResource("cardPng/empty.png")));
        emptyIcon = new ImageIcon(emptyIcon.getImage().getScaledInstance(65, 95, Image.SCALE_DEFAULT));
    }

    public MaJiang() {
        init();
        //添加事件在此执行 避免重复
        breset.addActionListener(e -> init());
        bExit.addActionListener(e -> System.exit(0));
        for (int i = 0; i < labels.size(); i++) {
            JLabel label = labels.get(i);
            label.addMouseListener(rLabelListener);
            JLabel rlabel = rLabels.get(i);
            rlabel.addMouseListener(rLabelListener);
        }
        bExit.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
        breset.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.lightBlue));
        b1t.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
        b2t.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
        b3t.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
        b4t.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
        b5t.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
        b6t.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
        b7t.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
        b8t.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
        b9t.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
        b1w.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
        b2w.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
        b3w.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
        b4w.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
        b5w.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
        b6w.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
        b7w.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
        b8w.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
        b9w.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
        bzhong.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
        b1w.addMouseListener(mouseListener);
        b2w.addMouseListener(mouseListener);
        b3w.addMouseListener(mouseListener);
        b4w.addMouseListener(mouseListener);
        b5w.addMouseListener(mouseListener);
        b6w.addMouseListener(mouseListener);
        b7w.addMouseListener(mouseListener);
        b8w.addMouseListener(mouseListener);
        b9w.addMouseListener(mouseListener);
        b1b.addMouseListener(mouseListener);
        b2b.addMouseListener(mouseListener);
        b3b.addMouseListener(mouseListener);
        b4b.addMouseListener(mouseListener);
        b5b.addMouseListener(mouseListener);
        b6b.addMouseListener(mouseListener);
        b7b.addMouseListener(mouseListener);
        b8b.addMouseListener(mouseListener);
        b9b.addMouseListener(mouseListener);
        b1t.addMouseListener(mouseListener);
        b2t.addMouseListener(mouseListener);
        b3t.addMouseListener(mouseListener);
        b4t.addMouseListener(mouseListener);
        b5t.addMouseListener(mouseListener);
        b6t.addMouseListener(mouseListener);
        b7t.addMouseListener(mouseListener);
        b8t.addMouseListener(mouseListener);
        b9t.addMouseListener(mouseListener);
        bzhong.addMouseListener(mouseListener);
        l1.setName("l1");
        l2.setName("l2");
        l3.setName("l3");
        l4.setName("l4");
        l5.setName("l5");
        l6.setName("l6");
        l7.setName("l7");
        l8.setName("l8");
        l9.setName("l9");
        l10.setName("l10");
        l11.setName("l11");
        l12.setName("l12");
        l13.setName("l13");
        l14.setName("l14");

    }

    public static void main(String[] args) {
        try {
            //隐藏设置按钮
            UIManager.put("RootPane.setupButtonVisible", false);
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            e.printStackTrace();
        }
        JFrame frame = new JFrame("视频麻将记牌  by.heasy");
        frame.setContentPane(new MaJiang().p);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLocationRelativeTo(null);
        //frame.getGraphicsConfiguration().getDevice().setFullScreenWindow(frame);
        frame.setBounds(270, 270, 1366, 768);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.pack();
    }

    private boolean check() {
        if (list.size() > 13 || rlist.size() > 13) {
            info.setText("超出牌数限制！");
            return false;
        }
        return true;
    }

    private void addCard(Card card) {
        if (!check()) return;
        list.add(card);
        rlist.add(card);
        sortList();
    }

    private void delListCard(Card card) {
        if (!list.contains(card)) {
            info.setText("无效操作");
            return;
        }
        try {
            for (JLabel label : labels) {
                label.setIcon(emptyIcon);
            }
            Iterator<Card> iterator = list.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().equals(card)) {
                    iterator.remove();
                    break;
                }
            }
            sortList();
        } catch (Exception e) {
            info.setText(e.getMessage());
        }
    }

    //删除原始列表中的牌 不准确 随机删
    private void delRListCard(Card card) {
        if (!rlist.contains(card)) {
            info.setText("无效操作");
            return;
        }
        try {
            for (JLabel rLabel : rLabels) {
                rLabel.setIcon(emptyIcon);
            }
            useCardIndex.setText(String.valueOf(rlist.indexOf(card)+1));
            Iterator<Card> rIterator = rlist.iterator();
            while (rIterator.hasNext()) {
                if (rIterator.next().equals(card)) {
                    rIterator.remove();
                    info.setText("删除牌："+card);
                    break;
                }
            }

        } catch (Exception e) {
            info.setText(e.getMessage());
        }
    }

    //进行牌图标的重新加载
    private void sortList() {
        Collections.sort(list);
        int i = 0;
        for (; i < list.size(); i++) {
            ImageIcon imageByCard = findImageByCard(list.get(i));
            labels.get(i).setIcon(imageByCard);
        }
        //剩余空位设置图片为空
        if (i < labels.size()) {
            while (i < labels.size()) {
                labels.get(i++).setIcon(emptyIcon);
            }
        }
        //真实顺序列表图片重载部分
        int j = 0;
        map.clear();
        for (; j < rlist.size(); j++) {
            ImageIcon imageByCard = findImageByCard(rlist.get(j));
            rLabels.get(j).setIcon(imageByCard);
            map.put(j, rlist.get(j));
        }
        if (j < rLabels.size()) {
            while (j < rLabels.size()) {
                rLabels.get(j++).setIcon(emptyIcon);
            }
        }
    }


    class MyBtnMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            if (!(e.getSource() instanceof JButton)) {
                return;
            }
            JButton b = (JButton) e.getSource();
            String text = b.getText();
            if (!ZHONG.equals(text) && (text == null || text.length() != 2)) {
                info.setText("按钮文本错误！");
                return;
            }
            Card card = findCardByText(text);
            if (e.getButton() == MouseEvent.BUTTON1) {
                addCard(card);
            } else if (e.getButton() == MouseEvent.BUTTON2) {
                baoLable.setText(card.toString());
            } else if (e.getButton() == MouseEvent.BUTTON3) {
                delRListCard(card);
                delListCard(card);
            }
        }
    }

    private void init() {
        baoLable.setText("暂无");
        info.setText("暂无");
        useCardIndex.setText("*");
        rlist = new LinkedList<>();
        //放牌整理好的列表
        list = new ArrayList<>();
        //放展示页面的列表
        labels = new LinkedList<>();
        //真实牌顺序列表
        rLabels = new LinkedList<>();
        //真实顺序对应的映射
        map = new HashMap<>(32);
        initLists();
        for (int i = 0; i < labels.size(); i++) {
            JLabel label = labels.get(i);
            label.setIcon(emptyIcon);
            JLabel rlabel = rLabels.get(i);
            rlabel.setIcon(emptyIcon);
        }
    }

    private void initLists() {
        labels.add(l1);
        labels.add(l2);
        labels.add(l3);
        labels.add(l4);
        labels.add(l5);
        labels.add(l6);
        labels.add(l7);
        labels.add(l8);
        labels.add(l9);
        labels.add(l10);
        labels.add(l11);
        labels.add(l12);
        labels.add(l13);
        labels.add(l14);
        rLabels.add(rl1);
        rLabels.add(rl2);
        rLabels.add(rl3);
        rLabels.add(rl4);
        rLabels.add(rl5);
        rLabels.add(rl6);
        rLabels.add(rl7);
        rLabels.add(rl8);
        rLabels.add(rl9);
        rLabels.add(rl10);
        rLabels.add(rl11);
        rLabels.add(rl12);
        rLabels.add(rl13);
        rLabels.add(rl14);
    }

    private Card findCardByText(String text) {
        if (ZHONG.equals(text)) return new Card(0, Type.ZHONG);
        int point = (int) text.charAt(0) - 48;
        char t = text.charAt(1);
        Type type = null;
        switch (t) {
            case '万':
                type = Type.WAN;
                break;
            case '饼':
                type = Type.BING;
                break;
            case '条':
                type = Type.TIAO;
                break;
        }
        return new Card(point, type);
    }

    private ImageIcon findImageByCard(Card card) {
        String text = card.getValue();
        int point = (int) text.charAt(0) - 48;
        char t = text.charAt(1);
        String fileName = "cardPng/" + point + t + ".png";
        ImageIcon icon = new ImageIcon(Toolkit.getDefaultToolkit().
                getImage(getClass().getResource(fileName)));
        //icon.setImage(icon.getImage().getScaledInstance(65, 95, Image.SCALE_DEFAULT));
        icon = new ImageIcon(icon.getImage().getScaledInstance(65, 95, Image.SCALE_DEFAULT));
        return icon;
    }


    class MyRLabelListener extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            if (!(e.getSource() instanceof JLabel)) {
                return;
            }
            if (e.getButton() == MouseEvent.BUTTON3) {
                JLabel l = (JLabel) e.getSource();
                int index = Integer.parseInt(l.getText()) - 1;
                //点击有序列表时 名字不为null
                if (l.getName() != null) {
                    String name = l.getName().substring(1);
                    Integer integer = Integer.valueOf(name);
                    if (integer > list.size()) return;
                    Card card = list.get(integer - 1);
                    delRListCard(card);
                    delListCard(card);
                    return;
                }
                Card delCard = map.get(index);
                if (delCard == null) return;
                rlist.remove(index);
                delListCard(delCard);
            }
        }
    }
}
