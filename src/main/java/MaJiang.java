import card.Type;
import card.iCard;

import javax.accessibility.Accessible;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;
import java.util.List;

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

    private static List<iCard> originList = new LinkedList<>();
    //放牌整理好的列表
    private static List<iCard> list = new LinkedList<>();
    //放展示页面的列表
    private static List<JLabel> labels = new LinkedList<>();

    public MaJiang() {
        init();
    }

    public static void main(String[] args) {
        try {
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception ignored) {
        }
        JFrame frame = new JFrame("majiang  by.heasy");
        frame.setContentPane(new MaJiang().p);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLocationRelativeTo(null);

        frame.setBounds(900, 100, 900, 1500);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.pack();
    }

    private void check() throws Exception {
        if (list.size() > 14) {
            throw new Exception("超出牌数限制！");
        }
    }

    private void addCard(iCard card) {
        try {
            check();
            list.add(card);
            sortList();
            originList.add(card);
        } catch (Exception e) {
            l1.setText(e.getMessage());
        }
    }

    private void delCard(iCard card) {
        try {
            if (list.isEmpty()) return;
            Iterator<iCard> iterator = list.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().equals(card)) {
                    iterator.remove();
                    break;
                }
            }
            sortList();
        } catch (Exception e) {
            l1.setText(e.getMessage());
        }
    }

    private void sortList() {
        Collections.sort(list);
        //todo 进行牌图标的重新加载
        int i = 0;
        for (; i < list.size(); i++) {
            labels.get(i).setVisible(true);
            ImageIcon imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().
                    getImage(getClass().getResource("close.png")));

            labels.get(i).setIcon(imageIcon);
            labels.get(i).setSize(10, 20);
            labels.get(i).setText(list.get(i).toString());
        }
        if (i < labels.size()) {
            while (i < labels.size()) {
                labels.get(i++).setVisible(false);
            }
        }
    }


    class MyBtnMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            String text = null;
            if (e.getSource() instanceof JButton) {
                JButton b = (JButton) e.getSource();
                text = b.getText();
            }
            if (e.getSource() instanceof JLabel) {
                JLabel l = (JLabel) e.getSource();
                text = l.getText();
            }
            Type type = null;
            if (text == null || text.length() != 2) {
                System.out.println("文本错误");
                return;
            }
            int point = (int) text.charAt(0) - 48;
            char t = text.charAt(1);
            switch (t) {
                case 'w':
                    type = Type.WAN;
                    break;
                case 'b':
                    type = Type.BING;
                    break;
                case 't':
                    type = Type.TIAO;
                    break;
                case 'z':
                    type = Type.ZHONG;
                    break;
            }
            iCard card = new iCard(point, type);
            if (e.getButton() == MouseEvent.BUTTON1) {
                System.out.println("左键点击");
                addCard(card);
                System.out.println("添加牌：" + card);
            } else if (e.getButton() == MouseEvent.BUTTON3) {
                System.out.println("右键点击");
                System.out.println("删除牌：" + card);
                delCard(card);
            }
            System.out.println("调整后结果：" + list);
        }
    }

    private void init() {
        MyBtnMouseListener mouseListener = new MyBtnMouseListener();
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
        for (JLabel label : labels) {
            label.addMouseListener(mouseListener);
            label.setVisible(false);
        }
    }
}
