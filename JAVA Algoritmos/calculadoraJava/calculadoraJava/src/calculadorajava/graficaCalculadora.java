package calculadorajava;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class graficaCalculadora extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
    public graficaCalculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        textoOperacion = new javax.swing.JLabel();
        textoResultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bt_divi = new javax.swing.JButton();
        bt_c = new javax.swing.JButton();
        bt_ce = new javax.swing.JButton();
        bt_porc = new javax.swing.JButton();
        bt_7 = new javax.swing.JButton();
        bt_8 = new javax.swing.JButton();
        bt_9 = new javax.swing.JButton();
        bt_multi = new javax.swing.JButton();
        bt_4 = new javax.swing.JButton();
        bt_5 = new javax.swing.JButton();
        bt_6 = new javax.swing.JButton();
        bt_men = new javax.swing.JButton();
        bt_1 = new javax.swing.JButton();
        bt_2 = new javax.swing.JButton();
        bt_3 = new javax.swing.JButton();
        bt_sum = new javax.swing.JButton();
        bt_igual = new javax.swing.JButton();
        bt_change = new javax.swing.JButton();
        bt_0 = new javax.swing.JButton();
        bt_pun = new javax.swing.JButton();

        jButton17.setBackground(new java.awt.Color(187, 187, 187));
        jButton17.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        jButton17.setText("C");
        jButton17.setFocusPainted(false);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        jButton17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N

        jButton18.setBackground(new java.awt.Color(187, 187, 187));
        jButton18.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        jButton18.setText("C");
        jButton18.setFocusPainted(false);
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        jButton18.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N

        jButton19.setBackground(new java.awt.Color(187, 187, 187));
        jButton19.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        jButton19.setText("C");
        jButton19.setFocusPainted(false);
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        jButton19.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N

        jButton20.setBackground(new java.awt.Color(187, 187, 187));
        jButton20.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        jButton20.setText("C");
        jButton20.setFocusPainted(false);
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        jButton20.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoOperacion.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textoOperacion.setForeground(new java.awt.Color(168, 156, 221));
        textoOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(textoOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 260, 44));

        textoResultado.setFont(new java.awt.Font("Verdana", 1, 42)); // NOI18N
        textoResultado.setForeground(new java.awt.Color(107, 85, 197));
        textoResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(textoResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 260, 82));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 170));

        jPanel2.setBackground(new java.awt.Color(32, 21, 92));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_divi.setBackground(new java.awt.Color(240, 240, 240));
        bt_divi.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        bt_divi.setForeground(new java.awt.Color(240, 240, 240));
        bt_divi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_divi.setText("/");
        bt_divi.setBorderPainted(false);
        bt_divi.setFocusPainted(false);
        bt_divi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_divi.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_divi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N
        bt_divi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_diviActionPerformed(evt);
            }
        });
        jPanel2.add(bt_divi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 60, 60));

        bt_c.setBackground(new java.awt.Color(240, 240, 240));
        bt_c.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        bt_c.setForeground(new java.awt.Color(240, 240, 240));
        bt_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_c.setText("C");
        bt_c.setBorderPainted(false);
        bt_c.setFocusPainted(false);
        bt_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N
        bt_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cActionPerformed(evt);
            }
        });
        jPanel2.add(bt_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        bt_ce.setBackground(new java.awt.Color(240, 240, 240));
        bt_ce.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        bt_ce.setForeground(new java.awt.Color(240, 240, 240));
        bt_ce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_ce.setText("←");
        bt_ce.setBorderPainted(false);
        bt_ce.setFocusPainted(false);
        bt_ce.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_ce.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_ce.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N
        bt_ce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ceActionPerformed(evt);
            }
        });
        jPanel2.add(bt_ce, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 60, 60));

        bt_porc.setBackground(new java.awt.Color(240, 240, 240));
        bt_porc.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        bt_porc.setForeground(new java.awt.Color(240, 240, 240));
        bt_porc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_porc.setText("%");
        bt_porc.setBorderPainted(false);
        bt_porc.setFocusPainted(false);
        bt_porc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_porc.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_porc.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N
        bt_porc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_porcActionPerformed(evt);
            }
        });
        jPanel2.add(bt_porc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 60, 60));

        bt_7.setBackground(new java.awt.Color(240, 240, 240));
        bt_7.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        bt_7.setForeground(new java.awt.Color(240, 240, 240));
        bt_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_7.setText("7");
        bt_7.setBorderPainted(false);
        bt_7.setFocusPainted(false);
        bt_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N
        bt_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_7ActionPerformed(evt);
            }
        });
        jPanel2.add(bt_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, 60));

        bt_8.setBackground(new java.awt.Color(240, 240, 240));
        bt_8.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        bt_8.setForeground(new java.awt.Color(240, 240, 240));
        bt_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_8.setText("8");
        bt_8.setBorderPainted(false);
        bt_8.setFocusPainted(false);
        bt_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N
        bt_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_8ActionPerformed(evt);
            }
        });
        jPanel2.add(bt_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 60, 60));

        bt_9.setBackground(new java.awt.Color(240, 240, 240));
        bt_9.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        bt_9.setForeground(new java.awt.Color(240, 240, 240));
        bt_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_9.setText("9");
        bt_9.setBorderPainted(false);
        bt_9.setFocusPainted(false);
        bt_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N
        bt_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_9ActionPerformed(evt);
            }
        });
        jPanel2.add(bt_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 60, 60));

        bt_multi.setBackground(new java.awt.Color(240, 240, 240));
        bt_multi.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        bt_multi.setForeground(new java.awt.Color(240, 240, 240));
        bt_multi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_multi.setText("*");
        bt_multi.setBorderPainted(false);
        bt_multi.setFocusPainted(false);
        bt_multi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_multi.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_multi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N
        bt_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_multiActionPerformed(evt);
            }
        });
        jPanel2.add(bt_multi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 60, 60));

        bt_4.setBackground(new java.awt.Color(240, 240, 240));
        bt_4.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        bt_4.setForeground(new java.awt.Color(240, 240, 240));
        bt_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_4.setText("4");
        bt_4.setBorderPainted(false);
        bt_4.setFocusPainted(false);
        bt_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N
        bt_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_4ActionPerformed(evt);
            }
        });
        jPanel2.add(bt_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 60, 60));

        bt_5.setBackground(new java.awt.Color(240, 240, 240));
        bt_5.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        bt_5.setForeground(new java.awt.Color(240, 240, 240));
        bt_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_5.setText("5");
        bt_5.setBorderPainted(false);
        bt_5.setFocusPainted(false);
        bt_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N
        bt_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_5ActionPerformed(evt);
            }
        });
        jPanel2.add(bt_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 60, 60));

        bt_6.setBackground(new java.awt.Color(240, 240, 240));
        bt_6.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        bt_6.setForeground(new java.awt.Color(240, 240, 240));
        bt_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_6.setText("6");
        bt_6.setBorderPainted(false);
        bt_6.setFocusPainted(false);
        bt_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N
        bt_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_6ActionPerformed(evt);
            }
        });
        jPanel2.add(bt_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 60, 60));

        bt_men.setBackground(new java.awt.Color(240, 240, 240));
        bt_men.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        bt_men.setForeground(new java.awt.Color(240, 240, 240));
        bt_men.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_men.setText("-");
        bt_men.setBorderPainted(false);
        bt_men.setFocusPainted(false);
        bt_men.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_men.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_men.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N
        bt_men.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_menActionPerformed(evt);
            }
        });
        jPanel2.add(bt_men, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 60, 60));

        bt_1.setBackground(new java.awt.Color(240, 240, 240));
        bt_1.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        bt_1.setForeground(new java.awt.Color(240, 240, 240));
        bt_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_1.setText("1");
        bt_1.setBorderPainted(false);
        bt_1.setFocusPainted(false);
        bt_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N
        bt_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_1ActionPerformed(evt);
            }
        });
        jPanel2.add(bt_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 60, 60));

        bt_2.setBackground(new java.awt.Color(240, 240, 240));
        bt_2.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        bt_2.setForeground(new java.awt.Color(240, 240, 240));
        bt_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_2.setText("2");
        bt_2.setBorderPainted(false);
        bt_2.setFocusPainted(false);
        bt_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N
        bt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_2ActionPerformed(evt);
            }
        });
        jPanel2.add(bt_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 60, 60));

        bt_3.setBackground(new java.awt.Color(240, 240, 240));
        bt_3.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        bt_3.setForeground(new java.awt.Color(240, 240, 240));
        bt_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_3.setText("3");
        bt_3.setBorderPainted(false);
        bt_3.setFocusPainted(false);
        bt_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N
        bt_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_3ActionPerformed(evt);
            }
        });
        jPanel2.add(bt_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 60, 60));

        bt_sum.setBackground(new java.awt.Color(240, 240, 240));
        bt_sum.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        bt_sum.setForeground(new java.awt.Color(240, 240, 240));
        bt_sum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_sum.setText("+");
        bt_sum.setBorderPainted(false);
        bt_sum.setFocusPainted(false);
        bt_sum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_sum.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_sum.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N
        bt_sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sumActionPerformed(evt);
            }
        });
        jPanel2.add(bt_sum, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 60, 60));

        bt_igual.setBackground(new java.awt.Color(240, 240, 240));
        bt_igual.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        bt_igual.setForeground(new java.awt.Color(240, 240, 240));
        bt_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_igual.setText("=");
        bt_igual.setBorderPainted(false);
        bt_igual.setFocusPainted(false);
        bt_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N
        bt_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_igualActionPerformed(evt);
            }
        });
        jPanel2.add(bt_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 60, 60));

        bt_change.setBackground(new java.awt.Color(240, 240, 240));
        bt_change.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        bt_change.setForeground(new java.awt.Color(240, 240, 240));
        bt_change.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_change.setText("±");
        bt_change.setBorderPainted(false);
        bt_change.setEnabled(false);
        bt_change.setFocusPainted(false);
        bt_change.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_change.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_change.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N
        bt_change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_changeActionPerformed(evt);
            }
        });
        jPanel2.add(bt_change, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 60, 60));

        bt_0.setBackground(new java.awt.Color(240, 240, 240));
        bt_0.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        bt_0.setForeground(new java.awt.Color(240, 240, 240));
        bt_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_0.setText("0");
        bt_0.setBorderPainted(false);
        bt_0.setFocusPainted(false);
        bt_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N
        bt_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_0ActionPerformed(evt);
            }
        });
        jPanel2.add(bt_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 60, 60));

        bt_pun.setBackground(new java.awt.Color(240, 240, 240));
        bt_pun.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        bt_pun.setForeground(new java.awt.Color(240, 240, 240));
        bt_pun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_pun.setText(".");
        bt_pun.setBorderPainted(false);
        bt_pun.setFocusPainted(false);
        bt_pun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_pun.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        bt_pun.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_press.jpg.png"))); // NOI18N
        bt_pun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_punActionPerformed(evt);
            }
        });
        jPanel2.add(bt_pun, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 60, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 290, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cActionPerformed
        textoResultado.setText("");
        textoOperacion.setText("");
    }//GEN-LAST:event_bt_cActionPerformed

    private void bt_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_7ActionPerformed
        aggNum("7");
                bt_igual.doClick();
    }//GEN-LAST:event_bt_7ActionPerformed

    private void bt_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_8ActionPerformed
        aggNum("8");
                bt_igual.doClick();
    }//GEN-LAST:event_bt_8ActionPerformed

    private void bt_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_9ActionPerformed
        aggNum("9");
                bt_igual.doClick();
    }//GEN-LAST:event_bt_9ActionPerformed

    private void bt_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_4ActionPerformed
        aggNum("4");
                bt_igual.doClick();
    }//GEN-LAST:event_bt_4ActionPerformed

    private void bt_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_5ActionPerformed
       aggNum("5");
               bt_igual.doClick();
    }//GEN-LAST:event_bt_5ActionPerformed

    private void bt_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_6ActionPerformed
        aggNum("6");
                bt_igual.doClick();
    }//GEN-LAST:event_bt_6ActionPerformed

    private void bt_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_1ActionPerformed
        aggNum("1");
                bt_igual.doClick();
    }//GEN-LAST:event_bt_1ActionPerformed

    private void bt_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_2ActionPerformed
        aggNum("2");
                bt_igual.doClick();
    }//GEN-LAST:event_bt_2ActionPerformed

    private void bt_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_3ActionPerformed
        aggNum("3");
        bt_igual.doClick();
    }//GEN-LAST:event_bt_3ActionPerformed

    private void bt_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_0ActionPerformed
        aggNum("0");
        bt_igual.doClick();
    }//GEN-LAST:event_bt_0ActionPerformed

    private void bt_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_igualActionPerformed
    try {
        String resultado = se.eval(textoOperacion.getText()).toString();
        textoResultado.setText(resultado);
    } catch (Exception e) {
            bt_c.doClick();
        }
    }//GEN-LAST:event_bt_igualActionPerformed

    private void bt_sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sumActionPerformed
        aggNum("+");
    }//GEN-LAST:event_bt_sumActionPerformed

    private void bt_menActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menActionPerformed
        aggNum("-");
    }//GEN-LAST:event_bt_menActionPerformed

    private void bt_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_multiActionPerformed
        aggNum("*");
    }//GEN-LAST:event_bt_multiActionPerformed

    private void bt_diviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_diviActionPerformed
        aggNum("/");
    }//GEN-LAST:event_bt_diviActionPerformed

    private void bt_porcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_porcActionPerformed
        aggNum("%");
    }//GEN-LAST:event_bt_porcActionPerformed

    private void bt_ceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ceActionPerformed
        String texto = textoOperacion.getText().substring(0,textoOperacion.getText().length()-1);
        textoOperacion.setText(texto);
                bt_igual.doClick();
    }//GEN-LAST:event_bt_ceActionPerformed

    private void bt_changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_changeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_changeActionPerformed

    private void bt_punActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_punActionPerformed
                aggNum(".");
    }//GEN-LAST:event_bt_punActionPerformed
    
    public void aggNum (String digito){
        textoOperacion.setText(textoOperacion.getText()+digito);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(graficaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(graficaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(graficaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(graficaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new graficaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_0;
    private javax.swing.JButton bt_1;
    private javax.swing.JButton bt_2;
    private javax.swing.JButton bt_3;
    private javax.swing.JButton bt_4;
    private javax.swing.JButton bt_5;
    private javax.swing.JButton bt_6;
    private javax.swing.JButton bt_7;
    private javax.swing.JButton bt_8;
    private javax.swing.JButton bt_9;
    private javax.swing.JButton bt_c;
    private javax.swing.JButton bt_ce;
    private javax.swing.JButton bt_change;
    private javax.swing.JButton bt_divi;
    private javax.swing.JButton bt_igual;
    private javax.swing.JButton bt_men;
    private javax.swing.JButton bt_multi;
    private javax.swing.JButton bt_porc;
    private javax.swing.JButton bt_pun;
    private javax.swing.JButton bt_sum;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel textoOperacion;
    private javax.swing.JLabel textoResultado;
    // End of variables declaration//GEN-END:variables
}
