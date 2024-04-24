
package com.component;


public class Chat_Date extends javax.swing.JLayeredPane {

    public Chat_Date() {
        initComponents();
    }
    public void setDate(String data){
        lbDate.setText(data);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbDate = new javax.swing.JLabel();
        line2 = new com.swing.Line();
        line3 = new com.swing.Line();

        lbDate.setFont(new java.awt.Font("Mitr Light", 0, 12)); // NOI18N
        lbDate.setForeground(new java.awt.Color(153, 153, 153));
        lbDate.setText("08/04/2024");

        line2.setForeground(new java.awt.Color(153, 153, 153));

        line3.setForeground(new java.awt.Color(153, 153, 153));

        setLayer(lbDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(line2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(line3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(line2, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line3, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(line3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDate)
                    .addComponent(line2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbDate;
    private com.swing.Line line2;
    private com.swing.Line line3;
    // End of variables declaration//GEN-END:variables
}
