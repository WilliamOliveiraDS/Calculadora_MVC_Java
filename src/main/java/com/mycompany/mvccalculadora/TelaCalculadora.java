
package com.mycompany.mvccalculadora;

/**
 *
 * @author William
 */
public class TelaCalculadora extends javax.swing.JFrame {

    public TelaCalculadora() {
        initComponents(
        );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNum1 = new javax.swing.JTextField();
        tfNum2 = new javax.swing.JTextField();
        lbError = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btMultiplicar = new javax.swing.JButton();
        btDividir = new javax.swing.JButton();
        btSomar = new javax.swing.JButton();
        btSubtrair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbResultado = new javax.swing.JLabel();

        jButton5.setText("Subtrair");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jPanel1.setToolTipText("");
        jPanel1.setName("CalculadoraMVC"); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Primeiro Número:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Segundo Número:");

        tfNum1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNum1KeyPressed(evt);
            }
        });

        tfNum2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfNum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNum2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfNum2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(tfNum1))
                .addGap(18, 18, 18)
                .addComponent(lbError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNum1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNum2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Operações Matemáticas:");

        btMultiplicar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btMultiplicar.setText("Multiplicar");
        btMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultiplicarActionPerformed(evt);
            }
        });

        btDividir.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btDividir.setText("Dividir");
        btDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDividirActionPerformed(evt);
            }
        });

        btSomar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btSomar.setText("Somar");
        btSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSomarActionPerformed(evt);
            }
        });

        btSubtrair.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btSubtrair.setText("Subtrair");
        btSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubtrairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btSomar)
                        .addGap(18, 18, 18)
                        .addComponent(btSubtrair)
                        .addGap(18, 18, 18)
                        .addComponent(btMultiplicar)
                        .addGap(18, 18, 18)
                        .addComponent(btDividir)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btDividir, btMultiplicar, btSomar, btSubtrair});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMultiplicar)
                    .addComponent(btDividir)
                    .addComponent(btSomar)
                    .addComponent(btSubtrair))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btDividir, btMultiplicar, btSomar, btSubtrair});

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("O Resultado da Operação é:");

        lbResultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbResultado.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbResultado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSomarActionPerformed
        float resultado = Float.parseFloat(tfNum1.getText()) + Float.parseFloat(tfNum2.getText());
        lbResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_btSomarActionPerformed

    private void btSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubtrairActionPerformed
        float resultado = Float.parseFloat(tfNum1.getText()) - Float.parseFloat(tfNum2.getText());
        lbResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_btSubtrairActionPerformed

    private void btMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMultiplicarActionPerformed
        float resultado = Float.parseFloat(tfNum1.getText()) * Float.parseFloat(tfNum2.getText());
        lbResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_btMultiplicarActionPerformed

    private void btDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDividirActionPerformed
        float resultado = Float.parseFloat(tfNum1.getText()) / Float.parseFloat(tfNum2.getText());
        lbResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_btDividirActionPerformed

    private void tfNum1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNum1KeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            //Não deixa inserir caractere diferente de números
            tfNum1.setEditable(false);
            
            //mensagem de erro//
            lbError.setText("Favor Inserir Somente Números");
        }else
        {
            tfNum1.setEditable(true);
        }
    }//GEN-LAST:event_tfNum1KeyPressed

    private void tfNum2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNum2KeyPressed
         char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            //Não deixa inserir caractere diferente de números
            tfNum2.setEditable(false);
            
            //mensagem de erro//
            lbError.setText("Favor Inserir Somente Números");
        }else
        {
            tfNum2.setEditable(true);
        }
    }//GEN-LAST:event_tfNum2KeyPressed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDividir;
    private javax.swing.JButton btMultiplicar;
    private javax.swing.JButton btSomar;
    private javax.swing.JButton btSubtrair;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JTextField tfNum1;
    private javax.swing.JTextField tfNum2;
    // End of variables declaration//GEN-END:variables
}
