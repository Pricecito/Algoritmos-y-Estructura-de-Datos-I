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
public class Frm_1 extends javax.swing.JFrame {
int vec1[]=new int[50];
int vec2[]=new int[50];
int indice1=0;
int indice2;
double prom;
boolean x=false,y=false;
    /**
     * Creates new form Frm_1
     */
    public Frm_1() {
        initComponents();
    }
    public void Ingresar(int num){
        if(indice1<vec1.length){
            vec1[indice1]=num;
            indice1++;
        }else{
            JOptionPane.showMessageDialog(this,"SOLO SE PUEDEN INGRESAR 50 DATOS");
        }
    }
    public double Promediar(){
        int suma=0;
        for(int c=0;c<indice1;c++){
            suma+=vec1[c];
            prom=suma*1.0/indice1;
        }
        return prom;
    }
    public void CantNumerosMayorProm(){
        indice2=0;
        for(int i=0;i<indice1;i++){
            if(vec1[i]>prom){
                vec2[indice2]=vec1[i];
                indice2++;
            }
        } 
    }
    public void MostrarNumMa(){
        for(int a=0;a<indice2;a++){
            txtA.append(vec2[a]+"\n");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNum = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnPromediar = new javax.swing.JButton();
        btnqNumMaProm = new javax.swing.JButton();
        btnNuMa = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtA.setColumns(20);
        txtA.setRows(5);
        jScrollPane1.setViewportView(txtA);

        jLabel1.setText("Ingresar valor:");

        btnPromediar.setText("PROMEDIAR");
        btnPromediar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromediarActionPerformed(evt);
            }
        });

        btnqNumMaProm.setText("NUMERO DE DATOS MAYORES QUE EL PROMEDIO");
        btnqNumMaProm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnqNumMaPromActionPerformed(evt);
            }
        });

        btnNuMa.setText("DATOS MAYORES QUE EL PROMEDIO");
        btnNuMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuMaActionPerformed(evt);
            }
        });

        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuMa, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnqNumMaProm, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIngresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPromediar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar)
                    .addComponent(btnPromediar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnqNumMaProm)
                .addGap(9, 9, 9)
                .addComponent(btnNuMa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String tex=txtNum.getText();
        if(tex.compareTo("")!=0){
            x=true;
            int num=Integer.parseInt(txtNum.getText());
            Ingresar(num);
        }else{
            JOptionPane.showMessageDialog(this,"No se ingreso valor","ALERTA",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnPromediarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromediarActionPerformed
        txtA.setText("");
        if(x==true){
            y=true;
            Promediar();
            txtA.append("El promedio es: "+prom+"\n");
        }else{
            JOptionPane.showMessageDialog(this,"No se ingreso valor","ALERTA",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnPromediarActionPerformed

    private void btnqNumMaPromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnqNumMaPromActionPerformed
        if(x==true){
            if(y==true){
                CantNumerosMayorProm();
                txtA.append("La cantidad de números mayores que el promedio es: "+indice2+"\n");
            }else{
                JOptionPane.showMessageDialog(this,"No se promedio los valores","ALERTA",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this,"No se ingreso valor","ALERTA",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnqNumMaPromActionPerformed

    private void btnNuMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuMaActionPerformed
        if(x==true){
            if(y==true){
                CantNumerosMayorProm();
                MostrarNumMa();
            }else{
                JOptionPane.showMessageDialog(this,"No se promedio los valores","ALERTA",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this,"No se ingreso valor","ALERTA",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnNuMaActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnNuMa;
    private javax.swing.JButton btnPromediar;
    private javax.swing.JButton btnqNumMaProm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtA;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
}
