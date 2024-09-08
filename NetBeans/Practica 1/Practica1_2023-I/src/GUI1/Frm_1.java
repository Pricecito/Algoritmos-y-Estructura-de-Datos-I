

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI1;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Frm_1 extends javax.swing.JFrame {
int vecA[]=new int[Integer.parseInt(JOptionPane.showInputDialog(this,"Cantidad de alumnos del curso","Entrada",JOptionPane.QUESTION_MESSAGE))];
int indiceA=0;
int vecB[]=new int [vecA.length],indiceB=0;
int cPar=0,cInPar=0,cNbus;
int vecPos[]=new int[vecA.length],indicePos;
/**
     * Creates new form Frm_2
     */
    public Frm_1() {
        initComponents();
    }
    public void Registrar(int edad){
        if(edad>=15){
        if(indiceA<vecA.length){
            vecA[indiceA]=edad;
            indiceA++; 
        }else{
            JOptionPane.showMessageDialog(this, "VECTOR LLENO!!!!!");
        }
        }else{
            JOptionPane.showMessageDialog(this, "EDAD NO VALIDA");
        }
    }
    public void Buscar(int nBus){
        boolean x=false;
        String posiciones="";
        cNbus=0;
        indicePos=0; 
        for(int j=0;j<indiceA;j++){
            if(vecA[j]==nBus){
                x=true;
                cNbus++;
                vecPos[indicePos]=j;
                indicePos++;
            }
        }
        if(x==true){
            for(int c=0;c<indicePos;c++){
                if(c<indicePos-1){
                    posiciones+=String.valueOf(vecPos[c])+", ";
                }else{
                    posiciones+=String.valueOf(vecPos[c]);
                }
            }
            JOptionPane.showMessageDialog(this, "El NUMERO SE ENCUENTRA EN LAS POSICIONES: "+posiciones+" y se repite "+cNbus+" veces");
        }else{
            JOptionPane.showMessageDialog(this, "NUMERO NO ENCONTRADO","RESULTADO",JOptionPane.WARNING_MESSAGE);
        }
    }
    public void Eliminar(int veli){
        boolean y=false;
        for(int i=0;i<indiceA;i++){
            if(vecA[i]==veli){
                y=true;
                for(int j=i;j<indiceA-1;j++){
                    vecA[j]=vecA[j+1];
                }
                indiceA--;
                i=-1; 
            }
        }
        if(y==true){
            int aux[]=new int[vecA.length];
                for(int c=0;c<indiceA;c++){
                        aux[c]=vecA[c];
                }
            vecA=aux;
            JOptionPane.showMessageDialog(this, "El numero fue eliminado");
        }else{
           JOptionPane.showMessageDialog(this, "El numero buscado no existe");
        }
    }//---------------------------------------------------------------------------------------------------------------------------------
    // Eliminación individual (un solo elemento) SEGURO
    /*boolean y=false;
        int pos;
        for(int i=0;i<indice;i++){
            if(veli==vec[i]){
                pos=i;
                y=true;
                for(int j=pos;j<indice-1;j++){
                    vec[j]=vec[j+1];
                }        
            }
        }
        if(y==true){
            int aux[]=new int[4];
                for(int c=0;c<indice-1;c++){
                    aux[c]=vec[c];
                }
            vec=aux;
            indice--;
            JOptionPane.showMessageDialog(this, "El numero fue eliminado");
        }else{
           JOptionPane.showMessageDialog(this, "El numero buscado no existe");
        }*/
    public void Ordenar(){
        int pos=0;
        for(int i=0;i<indiceA;i++){
            if(vecA[i]%2!=0){
                vecB[indiceB]=vecA[i];
                indiceB++;
            }
        }
        pos=indiceB;
        for(int i=0;i<indiceB-1;i++){
            for(int j=i+1;j<indiceB;j++){
                if(vecB[i]>=vecB[j]){
                int aux=vecB[i];
                vecB[i]=vecB[j];
                vecB[j]=aux;
                }
            }
        }
        for(int i=0;i<indiceA;i++){
            if(vecA[i]%2==0){
                vecB[indiceB]=vecA[i];
                indiceB++;
            }
        }
        for(int i=pos;i<indiceB-1;i++){
            for(int j=pos+1;j<indiceB;j++){
                if(vecB[i]>=vecB[j]){
                    int aux=vecB[i];
                    vecB[i]=vecB[j];
                    vecB[j]=aux;
                }
            }
        }
    }
    public void MostrarA(){
        txtVecA.setText(null);
            for(int i=0;i<indiceA;i++){
            txtVecA.append("POS "+i+": "+vecA[i]+"\n");
        }
    }
    public void MostrarB(){
        txtVecB.setText(null);
        for(int i=0;i<indiceB;i++){
            if(i<indiceB-1){
                txtVecB.append(vecB[i]+"; ");
            }else{
                txtVecB.append(vecB[i]+"");
            }
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

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        txteEli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txteBus = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtVecA = new javax.swing.JTextArea();
        btnBuscar = new javax.swing.JButton();
        btnMostrarA = new javax.swing.JButton();
        btnMostrarB = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtVecB = new javax.swing.JTextArea();

        jLabel2.setText("jLabel2");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnOrdenar.setText("ORDENAR DESCENDENTEMENTE");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR EDAD");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Edad:");

        jLabel3.setText("Ingrese edad a eliminar:");

        jLabel4.setText("Buscar edad:");

        txtVecA.setColumns(20);
        txtVecA.setRows(5);
        jScrollPane1.setViewportView(txtVecA);

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnMostrarA.setText("Mostrar A");
        btnMostrarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarAActionPerformed(evt);
            }
        });

        btnMostrarB.setText("Mostrar B");
        btnMostrarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarBActionPerformed(evt);
            }
        });

        txtVecB.setColumns(20);
        txtVecB.setRows(5);
        jScrollPane2.setViewportView(txtVecB);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarA)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(txteEli)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txteBus)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMostrarB)
                        .addGap(14, 56, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnMostrarA)
                    .addComponent(btnMostrarB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txteBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addGap(1, 1, 1)
                        .addComponent(btnOrdenar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txteEli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String tex=txteBus.getText();
        if(tex.compareTo("")!=0){
            int nBus=Integer.parseInt(txteBus.getText());
            Buscar(nBus);
        }else{
            JOptionPane.showMessageDialog(this, "NO SE INSERTO EDAD A BUSCAR","ALERTA",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String tex=txtEdad.getText();
        if(tex.compareTo("")!=0){
            int edad=Integer.parseInt(txtEdad.getText());
            Registrar(edad);
            MostrarA();
        }else{
            JOptionPane.showMessageDialog(this, "NO SE INSERTO EDAD","ALERTA",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        Ordenar();
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String tex=txteEli.getText();
        if(tex.compareTo("")!=0){
            int eEli=Integer.parseInt(txteEli.getText());
            Eliminar(eEli);
            MostrarA();
        }else{
            JOptionPane.showMessageDialog(this, "NO SE INSERTO EDAD","ALERTA",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMostrarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarAActionPerformed
        MostrarA();
    }//GEN-LAST:event_btnMostrarAActionPerformed

    private void btnMostrarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarBActionPerformed
        MostrarB();
    }//GEN-LAST:event_btnMostrarBActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrarA;
    private javax.swing.JButton btnMostrarB;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextArea txtVecA;
    private javax.swing.JTextArea txtVecB;
    private javax.swing.JTextField txteBus;
    private javax.swing.JTextField txteEli;
    // End of variables declaration//GEN-END:variables
}
