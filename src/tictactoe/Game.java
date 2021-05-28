
package tictactoe;
import javax.swing.*;
public class Game extends javax.swing.JFrame {
    private int player=1;
    private Board board;
    private JButton [][]button=new JButton[3][3];
    protected void setButtonReferences()
    {
        button[0][0]=jButton1;
        button[0][1]=jButton2;
        button[0][2]=jButton3;
        button[1][0]=jButton4;
        button[1][1]=jButton5;
        button[1][2]=jButton6;
        button[2][0]=jButton7;
        button[2][1]=jButton8;
        button[2][2]=jButton9;
    }
    public Game() {
        initComponents();
        
    }
    public void setPlayer(int value)
    {
        player=value;
    }
    public void refreshBoardDisplay()
    {
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
                switch(board.getBoardValue(i, j))
                {
                    case 2:
                    {
                        button[i][j].setEnabled(true);
                        button[i][j].setText("");
                        break;
                    }
                    case 3:
                        {
                        button[i][j].setEnabled(false);
                        button[i][j].setText("X");
                        break;
                    }
                    case 5:
                    {
                        button[i][j].setEnabled(false);
                        button[i][j].setText("O");
                        break;
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setBackground(new java.awt.Color(102, 255, 51));
        setPreferredSize(new java.awt.Dimension(330, 360));
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 0, 0));
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 0, 0));
        jButton5.setToolTipText("");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 0, 0));
        jButton6.setToolTipText("");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 0, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jButton7.setForeground(new java.awt.Color(204, 0, 0));
        jButton7.setToolTipText("");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 0, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jButton8.setForeground(new java.awt.Color(204, 0, 0));
        jButton8.setToolTipText("");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 0, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jButton9.setForeground(new java.awt.Color(204, 0, 0));
        jButton9.setToolTipText("");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(player==1)
        {
            board.setBoardValue(0,0,3);
            this.refreshBoardDisplay();
            if(board.chechWin(1))
            {
                JOptionPane.showMessageDialog(this,"Congratulations! You Win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else if(board.isBoardFilled())
            {
                JOptionPane.showMessageDialog(this,"Game Draw");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                setPlayer(3-player);
                playComputer();
                        
            }
        }
        else
        {//player==2
            board.setBoardValue(0,0,5);
            this.refreshBoardDisplay();
            if(board.chechWin(2))
            {
                JOptionPane.showMessageDialog(this,"Congratulations! You Win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else if(board.isBoardFilled())
            {
                JOptionPane.showMessageDialog(this,"Game Draw");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                setPlayer(3-player);
                playComputer();
                        
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(player==1)
        {
            board.setBoardValue(0,1,3);
            this.refreshBoardDisplay();
            if(board.chechWin(1))
            {
                JOptionPane.showMessageDialog(this,"Congratulations! You Win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else if(board.isBoardFilled())
            {
                JOptionPane.showMessageDialog(this,"Game Draw");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                setPlayer(3-player);
                playComputer();
                        
            }
        }
        else
        {//player==2
            board.setBoardValue(0,1,5);
            this.refreshBoardDisplay();
            if(board.chechWin(2))
            {
                JOptionPane.showMessageDialog(this,"Congratulations! You Win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else if(board.isBoardFilled())
            {
                JOptionPane.showMessageDialog(this,"Game Draw");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                setPlayer(3-player);
                playComputer();
                        
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(player==1)
        {
            board.setBoardValue(0,2,3);
            this.refreshBoardDisplay();
            if(board.chechWin(1))
            {
                JOptionPane.showMessageDialog(this,"Congratulations! You Win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else if(board.isBoardFilled())
            {
                JOptionPane.showMessageDialog(this,"Game Draw");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                setPlayer(3-player);
                playComputer();
                        
            }
        }
        else
        {//player==2
            board.setBoardValue(0,2,5);
            this.refreshBoardDisplay();
            if(board.chechWin(2))
            {
                JOptionPane.showMessageDialog(this,"Congratulations! You Win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else if(board.isBoardFilled())
            {
                JOptionPane.showMessageDialog(this,"Game Draw");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                setPlayer(3-player);
                playComputer();
                        
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(player==1)
        {
            board.setBoardValue(1,0,3);
            this.refreshBoardDisplay();
            if(board.chechWin(1))
            {
                JOptionPane.showMessageDialog(this,"Congratulations! You Win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else if(board.isBoardFilled())
            {
                JOptionPane.showMessageDialog(this,"Game Draw");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                setPlayer(3-player);
                playComputer();
                        
            }
        }
        else
        {//player==2
            board.setBoardValue(1,0,5);
            this.refreshBoardDisplay();
            if(board.chechWin(2))
            {
                JOptionPane.showMessageDialog(this,"Congratulations! You Win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else if(board.isBoardFilled())
            {
                JOptionPane.showMessageDialog(this,"Game Draw");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                setPlayer(3-player);
                playComputer();
                        
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(player==1)
        {
            board.setBoardValue(1,1,3);
            this.refreshBoardDisplay();
            if(board.chechWin(1))
            {
                JOptionPane.showMessageDialog(this,"Congratulations! You Win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else if(board.isBoardFilled())
            {
                JOptionPane.showMessageDialog(this,"Game Draw");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                setPlayer(3-player);
                playComputer();
                        
            }
        }
        else
        {//player==2
            board.setBoardValue(1,1,5);
            this.refreshBoardDisplay();
            if(board.chechWin(2))
            {
                JOptionPane.showMessageDialog(this,"Congratulations! You Win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else if(board.isBoardFilled())
            {
                JOptionPane.showMessageDialog(this,"Game Draw");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                setPlayer(3-player);
                playComputer();
                        
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(player==1)
        {
            board.setBoardValue(1,2,3);
            this.refreshBoardDisplay();
            if(board.chechWin(1))
            {
                JOptionPane.showMessageDialog(this,"Congratulations! You Win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else if(board.isBoardFilled())
            {
                JOptionPane.showMessageDialog(this,"Game Draw");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                setPlayer(3-player);
                playComputer();
                        
            }
        }
        else
        {//player==2
            board.setBoardValue(1,2,5);
            this.refreshBoardDisplay();
            if(board.chechWin(2))
            {
                JOptionPane.showMessageDialog(this,"Congratulations! You Win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else if(board.isBoardFilled())
            {
                JOptionPane.showMessageDialog(this,"Game Draw");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                setPlayer(3-player);
                playComputer();
                        
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(player==1)
        {
            board.setBoardValue(2,0,3);
            this.refreshBoardDisplay();
            if(board.chechWin(1))
            {
                JOptionPane.showMessageDialog(this,"Congratulations! You Win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else if(board.isBoardFilled())
            {
                JOptionPane.showMessageDialog(this,"Game Draw");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                setPlayer(3-player);
                playComputer();
                        
            }
        }
        else
        {//player==2
            board.setBoardValue(2,0,5);
            this.refreshBoardDisplay();
            if(board.chechWin(2))
            {
                JOptionPane.showMessageDialog(this,"Congratulations! You Win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else if(board.isBoardFilled())
            {
                JOptionPane.showMessageDialog(this,"Game Draw");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                setPlayer(3-player);
                playComputer();
                        
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(player==1)
        {
            board.setBoardValue(2,1,3);
            this.refreshBoardDisplay();
            if(board.chechWin(1))
            {
                JOptionPane.showMessageDialog(this,"Congratulations! You Win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else if(board.isBoardFilled())
            {
                JOptionPane.showMessageDialog(this,"Game Draw");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                setPlayer(3-player);
                playComputer();
                        
            }
        }
        else
        {//player==2
            board.setBoardValue(2,1,5);
            this.refreshBoardDisplay();
            if(board.chechWin(2))
            {
                JOptionPane.showMessageDialog(this,"Congratulations! You Win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else if(board.isBoardFilled())
            {
                JOptionPane.showMessageDialog(this,"Game Draw");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                setPlayer(3-player);
                playComputer();
                        
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(player==1)
        {
            board.setBoardValue(2,2,3);
            this.refreshBoardDisplay();
            if(board.chechWin(1))
            {
                JOptionPane.showMessageDialog(this,"Congratulations! You Win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else if(board.isBoardFilled())
            {
                JOptionPane.showMessageDialog(this,"Game Draw");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                setPlayer(3-player);
                playComputer();
                        
            }
        }
        else
        {//player==2
            board.setBoardValue(2,2,5);
            this.refreshBoardDisplay();
            if(board.chechWin(2))
            {
                JOptionPane.showMessageDialog(this,"Congratulations! You Win");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else if(board.isBoardFilled())
            {
                JOptionPane.showMessageDialog(this,"Game Draw");
                board.initializeBoard();
                refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                setPlayer(3-player);
                playComputer();
                        
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    
    public void playComputer()
    {
        int buttonNumber;
        buttonNumber=board.possibleWin(player);
        if(buttonNumber==0)
        {
            buttonNumber=board.possibleWin(3-player);
        }
        if(buttonNumber==0)
        {
            buttonNumber=board.randomBlankButton();
        }
        if(buttonNumber!=0)
        {
            switch(buttonNumber)
            {
                case 1:
                {
                    if(player==1)
                        board.setBoardValue(0,0,3);
                    else
                        board.setBoardValue(0,0,5);
                    this.refreshBoardDisplay();
                    break;
                }
                case 2:
                {
                    if(player==1)
                        board.setBoardValue(0,1,3);
                    else
                        board.setBoardValue(0,1,5);
                    this.refreshBoardDisplay();
                    break;
                }
                case 3:
                {
                    if(player==1)
                        board.setBoardValue(0,2,3);
                    else
                        board.setBoardValue(0,2,5);
                    this.refreshBoardDisplay();
                    break;
                }
                case 4:
                {
                    if(player==1)
                        board.setBoardValue(1,0,3);
                    else
                        board.setBoardValue(1,0,5);
                    this.refreshBoardDisplay();
                    break;
                }
                case 5:
                {
                    if(player==1)
                        board.setBoardValue(1,1,3);
                    else
                        board.setBoardValue(1,1,5);
                    this.refreshBoardDisplay();
                    break;
                }
                case 6:
                {
                    if(player==1)
                        board.setBoardValue(1,2,3);
                    else
                        board.setBoardValue(1,2,5);
                    this.refreshBoardDisplay();
                    break;
                }
                case 7:
                {
                    if(player==1)
                        board.setBoardValue(2,0,3);
                    else
                        board.setBoardValue(2,0,5);
                    this.refreshBoardDisplay();
                    break;
                }
                case 8:
                {
                    if(player==1)
                        board.setBoardValue(2,1,3);
                    else
                        board.setBoardValue(2,1,5);
                    this.refreshBoardDisplay();
                    break;
                }
                case 9:
                {
                    if(player==1)
                        board.setBoardValue(2,2,3);
                    else
                        board.setBoardValue(2,2,5);
                    this.refreshBoardDisplay();
                    break;
                }
            }
            if(board.chechWin(player))
            {
                JOptionPane.showMessageDialog(this,"OOPS! You Lost and Computer Won The Game");
                board.initializeBoard();
                this.refreshBoardDisplay();
                setPlayer(1);
            }
            else if(board.isBoardFilled())
            {
                JOptionPane.showMessageDialog(this,"Game Draw");
                board.initializeBoard();
                this.refreshBoardDisplay();
                setPlayer(1);
            }
            else
            {
                setPlayer(3-player);
            }
        }
        
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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Game game=new Game();
                game.setButtonReferences();
                game.setVisible(true);
                game.board=new Board();
                game.board.initializeBoard();
                game.setPlayer(1);
                game.refreshBoardDisplay();
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}
