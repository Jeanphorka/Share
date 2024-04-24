
package com.component;


public class Chat_File extends javax.swing.JPanel {

   
    public Chat_File() {
        initComponents();
        setOpaque(false);
    }
    
    public void setFile(String fileName, String size){
        IbFileName.setText(fileName);
        IbFileSize.setText(size);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progress1 = new com.swing.Progress();
        jPanel1 = new javax.swing.JPanel();
        IbFileName = new javax.swing.JLabel();
        IbFileSize = new javax.swing.JLabel();

        progress1.setProgressType(com.swing.Progress.ProgressType.FILE);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        IbFileName.setFont(new java.awt.Font("Mitr Light", 0, 12)); // NOI18N
        IbFileName.setText("My File Name .file");
        jPanel1.add(IbFileName);

        IbFileSize.setFont(new java.awt.Font("Mitr Light", 0, 12)); // NOI18N
        IbFileSize.setForeground(new java.awt.Color(32, 110, 162));
        IbFileSize.setText("5 MB");
        jPanel1.add(IbFileSize);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IbFileName;
    private javax.swing.JLabel IbFileSize;
    private javax.swing.JPanel jPanel1;
    private com.swing.Progress progress1;
    // End of variables declaration//GEN-END:variables
}
