/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author NSP
 */
public class TicTacToe extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToe
     * @param p1
     * @param p2
     */
    
    int score1, score2;
    char aa,ab,ac,ba,bb,bc,ca,cb,cc;
    char sym;
    String p1,p2;
    void restarter()
    {
        aa=0;
        ab=0;
        ac=0;
        ba=0;
        bb=0;
        bc=0;
        ca=0;
        cb=0;
        cc=0;
        sym='X';
        B1.setText("");
        B2.setText("");
        B3.setText("");
        B4.setText("");
        B5.setText("");
        B6.setText("");
        B7.setText("");
        B8.setText("");
        B9.setText("");
        drawMessage.setText("");
    }
    public TicTacToe(String pn1,String pn2, int c,int d) {
        initComponents();
        p1=pn1;
        p2=pn2;
        P1Name.setText(p1+" score: ");
        P2Name.setText(p2+" score: ");
        score1=c;
        score2=d;
        restarter();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        GameName = new javax.swing.JLabel();
        P2Name = new javax.swing.JLabel();
        P1Name = new javax.swing.JLabel();
        B7 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        restart = new javax.swing.JButton();
        restart1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        drawMessage = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(22, 0, 32));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        GameName.setBackground(new java.awt.Color(22, 0, 32));
        GameName.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        GameName.setForeground(new java.awt.Color(255, 255, 255));
        GameName.setText("Tic Tac Toe Gameplay...");

        P2Name.setBackground(new java.awt.Color(22, 0, 32));
        P2Name.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        P2Name.setForeground(new java.awt.Color(255, 255, 255));
        P2Name.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        P2Name.setText("Player 2 score : 11");

        P1Name.setBackground(new java.awt.Color(22, 0, 32));
        P1Name.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        P1Name.setForeground(new java.awt.Color(255, 255, 255));
        P1Name.setText("Player 1 score: 11");

        B7.setBackground(new java.awt.Color(225, 225, 225));
        B7.setFont(new java.awt.Font("Rosemary", 0, 48)); // NOI18N
        B7.setForeground(new java.awt.Color(0, 153, 51));
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B1.setBackground(new java.awt.Color(225, 225, 225));
        B1.setFont(new java.awt.Font("Rosemary", 0, 48)); // NOI18N
        B1.setForeground(new java.awt.Color(0, 153, 51));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B9.setBackground(new java.awt.Color(225, 225, 225));
        B9.setFont(new java.awt.Font("Rosemary", 0, 48)); // NOI18N
        B9.setForeground(new java.awt.Color(0, 153, 51));
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(225, 225, 225));
        B3.setFont(new java.awt.Font("Rosemary", 0, 48)); // NOI18N
        B3.setForeground(new java.awt.Color(0, 153, 51));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B8.setBackground(new java.awt.Color(225, 225, 225));
        B8.setFont(new java.awt.Font("Rosemary", 0, 48)); // NOI18N
        B8.setForeground(new java.awt.Color(0, 153, 51));
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B2.setBackground(new java.awt.Color(225, 225, 225));
        B2.setFont(new java.awt.Font("Rosemary", 0, 48)); // NOI18N
        B2.setForeground(new java.awt.Color(0, 153, 51));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B5.setBackground(new java.awt.Color(225, 225, 225));
        B5.setFont(new java.awt.Font("Rosemary", 0, 48)); // NOI18N
        B5.setForeground(new java.awt.Color(0, 153, 51));
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B4.setBackground(new java.awt.Color(225, 225, 225));
        B4.setFont(new java.awt.Font("Rosemary", 0, 48)); // NOI18N
        B4.setForeground(new java.awt.Color(0, 153, 51));
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B6.setBackground(new java.awt.Color(225, 225, 225));
        B6.setFont(new java.awt.Font("Rosemary", 0, 48)); // NOI18N
        B6.setForeground(new java.awt.Color(0, 153, 51));
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        restart.setBackground(new java.awt.Color(0, 51, 0));
        restart.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        restart.setForeground(new java.awt.Color(255, 102, 102));
        restart.setText("Restart");
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        restart1.setBackground(new java.awt.Color(0, 51, 0));
        restart1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        restart1.setForeground(new java.awt.Color(255, 102, 102));
        restart1.setText("Quit Game");
        restart1.setToolTipText("");
        restart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restart1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(22, 0, 32));
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("X");

        jLabel3.setBackground(new java.awt.Color(22, 0, 32));
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("O");

        drawMessage.setBackground(new java.awt.Color(22, 0, 32));
        drawMessage.setColumns(20);
        drawMessage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        drawMessage.setForeground(new java.awt.Color(255, 255, 204));
        drawMessage.setLineWrap(true);
        drawMessage.setRows(5);
        drawMessage.setWrapStyleWord(true);
        drawMessage.setBorder(null);
        drawMessage.setEnabled(false);
        drawMessage.setFocusable(false);
        jScrollPane1.setViewportView(drawMessage);

        jButton1.setBackground(new java.awt.Color(22, 0, 32));
        jButton1.setForeground(new java.awt.Color(204, 204, 255));
        jButton1.setText("About");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(GameName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(restart1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(restart, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(0, 87, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(P2Name))
                .addGap(197, 197, 197))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(P1Name)
                    .addContainerGap(604, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GameName)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(P2Name)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(restart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(restart1)
                        .addGap(92, 92, 92))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(P1Name)
                    .addContainerGap(504, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
            
    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
        if(aa==0)
        {
            aa=sym;
            B1.setText(""+aa);
            if((aa==bb && bb==cc) || (aa==ab && ab==ac) || (aa==ba && ba==ca))
            {
                if(sym=='X')
                {
                    score1++;
                    P1Name.setText(p1+" score: "+score1);
                    Winner.main(p1,score1,score2);
        restarter();
                }
                else
                {
                    score2++;
                    P2Name.setText(p2+" score: "+score2);
                    Winner.main(p2,score2,score1);
        restarter();
                };
            }
            else if(aa!=0 && ab!=0 && ac!=0 && ba!=0 && bb!=0 && bc!=0 && ca!=0 && cb!=0 && cc!=0)
                drawMessage.setText("Game Draw!!! Press 'Restart' to continue playing...");
            if(sym=='X')
                sym='O';
            else
                sym='X';
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
        if(ab==0)
        {
            ab=sym;
            B2.setText(""+ab);
            if((ab==bb && bb==cb) || (aa==ab && ab==ac))
            {
                if(sym=='X')
                {
                    score1++;
                    P1Name.setText(p1+" score: "+score1);
                    Winner.main(p1,score1,score2);
        restarter();
                }
                else
                {
                    score2++;
                    P2Name.setText(p2+" score: "+score2);
                    Winner.main(p2,score2,score1);
        restarter();
                }
            }
            else if(aa!=0 && ab!=0 && ac!=0 && ba!=0 && bb!=0 && bc!=0 && ca!=0 && cb!=0 && cc!=0)
                drawMessage.setText("Game Draw!!! Press 'Restart' to continue playing...");
            if(sym=='X')
                sym='O';
            else
                sym='X';
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
        if(ac==0)
        {
            ac=sym;
            B3.setText(""+ac);
            if((ac==bb && bb==ca) || (aa==ab && ab==ac) || (ac==bc && bc==cc))
            {
                if(sym=='X')
                {
                    score1++;
                    P1Name.setText(p1+" score: "+score1);
                    Winner.main(p1,score1,score2);
        restarter();
                }
                else
                {
                    score2++;
                    P2Name.setText(p2+" score: "+score2);
                    Winner.main(p2,score2,score1);
        restarter();
                }
            }
            else if(aa!=0 && ab!=0 && ac!=0 && ba!=0 && bb!=0 && bc!=0 && ca!=0 && cb!=0 && cc!=0)
                drawMessage.setText("Game Draw!!! Press 'Restart' to continue playing...");
            if(sym=='X')
                sym='O';
            else
                sym='X';
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        // TODO add your handling code here:
        if(ba==0)
        {
            ba=sym;
            B4.setText(""+ba);
            if((ba==bb && bb==bc) || (aa==ba && ba==ca))
            {
                if(sym=='X')
                {
                    score1++;
                    P1Name.setText(p1+" score: "+score1);
                    Winner.main(p1,score1,score2);
        restarter();
                }
                else
                {
                    score2++;
                    P2Name.setText(p2+" score: "+score2);
                    Winner.main(p2,score2,score1);
        restarter();
                }
            }
            else if(aa!=0 && ab!=0 && ac!=0 && ba!=0 && bb!=0 && bc!=0 && ca!=0 && cb!=0 && cc!=0)
                drawMessage.setText("Game Draw!!! Press 'Restart' to continue playing...");
            if(sym=='X')
                sym='O';
            else
                sym='X';
        }
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        // TODO add your handling code here:
        if(bb==0)
        {
            bb=sym;
            B5.setText(""+bb);
            if((aa==bb && bb==cc) || (ab==bb && bb==cb) || (ac==bb && bb==ca) || (ba==bb && bb==bc))
            {
                if(sym=='X')
                {
                    score1++;
                    P1Name.setText(p1+" score: "+score1);
                    Winner.main(p1,score1,score2);
        restarter();
                }
                else
                {
                    score2++;
                    P2Name.setText(p2+" score: "+score2);
                    Winner.main(p2,score2,score1);
        restarter();
                }
            }
            else if(aa!=0 && ab!=0 && ac!=0 && ba!=0 && bb!=0 && bc!=0 && ca!=0 && cb!=0 && cc!=0)
                drawMessage.setText("Game Draw!!! Press 'Restart' to continue playing...");
            if(sym=='X')
                sym='O';
            else
                sym='X';
        }
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        // TODO add your handling code here:
        if(bc==0)
        {
            bc=sym;
            B6.setText(""+bc);
            if((ba==bb && bb==bc) || (ac==bc && bc==cc))
            {
                if(sym=='X')
                {
                    score1++;
                    P1Name.setText(p1+" score: "+score1);
                    Winner.main(p1,score1,score2);
        restarter();
                }
                else
                {
                    score2++;
                    P2Name.setText(p2+" score: "+score2);
                    Winner.main(p2,score2,score1);
        restarter();
                }
            }
            else if(aa!=0 && ab!=0 && ac!=0 && ba!=0 && bb!=0 && bc!=0 && ca!=0 && cb!=0 && cc!=0)
                drawMessage.setText("Game Draw!!! Press 'Restart' to continue playing...");
            if(sym=='X')
                sym='O';
            else
                sym='X';
        }
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        // TODO add your handling code here:
        if(ca==0)
        {
            ca=sym;
            B7.setText(""+ca);
            if((ca==cb && cb==cc) || (aa==ba && ba==ca) || (ca==bb && bb==ac))
            {
                if(sym=='X')
                {
                    score1++;
                    P1Name.setText(p1+" score: "+score1);
                    Winner.main(p1,score1,score2);
        restarter();
                }
                else
                {
                    score2++;
                    P2Name.setText(p2+" score: "+score2);
                    Winner.main(p2,score2,score1);
        restarter();
                }
            }
            else if(aa!=0 && ab!=0 && ac!=0 && ba!=0 && bb!=0 && bc!=0 && ca!=0 && cb!=0 && cc!=0)
                drawMessage.setText("Game Draw!!! Press 'Restart' to continue playing...");
            if(sym=='X')
                sym='O';
            else
                sym='X';
        }
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        // TODO add your handling code here:
        if(cb==0)
        {
            cb=sym;
            B8.setText(""+cb);
            if((ab==bb && bb==cb) || (ca==cb && cb==cc))
            {
                if(sym=='X')
                {
                    score1++;
                    P1Name.setText(p1+" score: "+score1);
                    Winner.main(p1,score1,score2);
        restarter();
                }
                else
                {
                    score2++;
                    P2Name.setText(p2+" score: "+score2);
                    Winner.main(p2,score2,score1);
        restarter();
                }
            }
            else if(aa!=0 && ab!=0 && ac!=0 && ba!=0 && bb!=0 && bc!=0 && ca!=0 && cb!=0 && cc!=0)
                drawMessage.setText("Game Draw!!! Press 'Restart' to continue playing...");
            if(sym=='X')
                sym='O';
            else
                sym='X';
        }
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        // TODO add your handling code here:
        if(cc==0)
        {
            cc=sym;
            B9.setText(""+cc);
            if((ca==cb && cb==cc) || (aa==bb && bb==cc) || (ac==bc && bc==cc))
            {
                if(sym=='X')
                {
                    score1++;
                    P1Name.setText(p1+" score: "+score1);
                    Winner.main(p1,score1,score2);
        restarter();
                }
                else
                {
                    score2++;
                    P2Name.setText(p2+" score: "+score2);
                    Winner.main(p2,score2,score1);
        restarter();
                }
            }
            else if(aa!=0 && ab!=0 && ac!=0 && ba!=0 && bb!=0 && bc!=0 && ca!=0 && cb!=0 && cc!=0)
                drawMessage.setText("Game Draw!!! Press 'Restart' to continue playing...");
            if(sym=='X')
                sym='O';
            else
                sym='X';
        }
    }//GEN-LAST:event_B9ActionPerformed

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
        // TODO add your handling code here:
        restarter();
    }//GEN-LAST:event_restartActionPerformed

    private void restart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restart1ActionPerformed
        // TODO add your handling code here:
        Quitter.main(null);
    }//GEN-LAST:event_restart1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        About.main(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param a1
     * @param a2
     */
    public static void main(String a1,String a2, int c, int d) {
        
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TicTacToe(a1,a2,c,d).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JLabel GameName;
    private javax.swing.JLabel P1Name;
    private javax.swing.JLabel P2Name;
    private javax.swing.JTextArea drawMessage;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton restart;
    private javax.swing.JButton restart1;
    // End of variables declaration//GEN-END:variables
}
