/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_5;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Frm_5 extends javax.swing.JFrame {
int vec1[],indice1;
int vec2[],indice2;
boolean x=false,y=false;
    /**
     * Creates new form Frm_5
     */
    public Frm_5() {
        initComponents();
    }
    public void Distribuir(int vec){
        int num;
        switch(vec){
            case 0:if(indice1<vec1.length){
                        for(int i=0;i<vec1.length;i++){
                            num=Integer.parseInt(JOptionPane.showInputDialog(this,"Ingresar Valor"));
                            vec1[indice1]=num;
                            indice1++;
                        }
                    }else{
                        JOptionPane.showMessageDialog(this,"Vector 1 lleno");
                    }break;
            default:if(indice2<vec2.length){
                        for(int i=0;i<vec2.length;i++){
                            num=Integer.parseInt(JOptionPane.showInputDialog(this,"Ingresar Valor"));
                            vec2[indice2]=num;
                            indice2++;
                        }
                    }else{
                        JOptionPane.showMessageDialog(this,"Vector 2 lleno");
                    }
        }
        
    }
    public String Respuesta(){
        boolean x=false;
        String msj;
        for(int c=0;c<indice1||c<indice2;c++){
            if(vec1[c]!=vec2[c]){
                x=true;
            }
        }
        if(x==true){
            msj="DIFERENTES";
        }else{
            msj="IGUALES";
        }
        return msj;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        btnIngresar = new javax.swing.JButton();
        txtMensaje = new javax.swing.JTextField();
        cboVec = new javax.swing.JComboBox<>();
        btnMensaje = new javax.swing.JButton();
        btnInLong = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIngresar.setText("INGRESAR DATOS");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        cboVec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vector M", "Vector N" }));

        btnMensaje.setText("Diiferentes/Iguales:");
        btnMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMensajeActionPerformed(evt);
            }
        });

        btnInLong.setText("INGRESAR TAMAÑO DEL VECTOR");
        btnInLong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInLongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMensaje, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                    .addComponent(btnInLong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addComponent(cboVec, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btnInLong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(cboVec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        y=true;
        if(x==true){
            int vec=cboVec.getSelectedIndex();
            Distribuir(vec);
        }else{
            JOptionPane.showMessageDialog(this,"No se introdujo una longitud","ALERTA",JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMensajeActionPerformed
        if(x==true){
            if(y==true){
                String res;
                res=Respuesta();
                txtMensaje.setText(res);
            }else{
                JOptionPane.showMessageDialog(this,"No se introdujo un valor","ALERTA",JOptionPane.WARNING_MESSAGE);  
            }
        }else{
                JOptionPane.showMessageDialog(this,"No se introdujo tamaño","ALERTA",JOptionPane.WARNING_MESSAGE);  
        } 
    }//GEN-LAST:event_btnMensajeActionPerformed

    private void btnInLongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInLongActionPerformed
        x=true;
        int tamaño=Integer.parseInt(JOptionPane.showInputDialog(this,"Ingresar Tamaño"));
        vec1=new int [tamaño];indice1=0;
        vec2=new int [tamaño];indice2=0;
    }//GEN-LAST:event_btnInLongActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Frm_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInLong;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnMensaje;
    private javax.swing.JComboBox<String> cboVec;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JTextField txtMensaje;
    // End of variables declaration//GEN-END:variables
}
