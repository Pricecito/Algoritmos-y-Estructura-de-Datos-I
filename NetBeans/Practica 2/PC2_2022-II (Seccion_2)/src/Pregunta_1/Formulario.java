/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pregunta_1;

import javax.swing.JOptionPane;

/**
 *
 * @author jmgut
 */
public class Formulario extends javax.swing.JFrame {
Car[]au=new Car[9999999];
Truck[]ca=new Truck[9999999];;
int indice_au=0;
int indice_ca=0;


    /**
     * Creates new form Formulatio
     */
    public Formulario() {
        initComponents();
    }
    public void mostrarCar(Car e){
        txtA.append("\nMATRICULA: "+e.getMatricula()+"\n");
        txtA.append("   MARCA: "+e.getMarca()+"\n");
        txtA.append("   MODELO: "+e.getModelo()+"\n");
        txtA.append("   CAPACIDAD DE TANQUE: "+e.getCap_tanque()+"\n");
        txtA.append("   VELOCIDAD: "+e.getVelocidad()+"\n");
    }
    public void mostrarTruck(Truck e){
        txtA.append("\nMATRICULA: "+e.getMatricula()+"\n");
        txtA.append("   MARCA: "+e.getMarca()+"\n");
        txtA.append("   MODELO: "+e.getModelo()+"\n");
        txtA.append("   CAPACIDAD DE TANQUE: "+e.getCap_tanque()+"\n");
        txtA.append("   TIPO: "+e.getTipo()+"\n");
        txtA.append("   CARGA: "+e.getCarga()+"\n");
    }
    public void modificarCar(){
        int mat=Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE MATRICULA"));
        int p=Buscar(mat,indice_au,au);
        if(p>=0){
            int mod=Integer.parseInt(JOptionPane.showInputDialog(null,"QUE DESEA MODIFICAR\n1.CAPACIDAD DE TANQUE\n2.VELOCIDAD"));
            switch(mod){
                case 1:int cap_tan=Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE CAPACIDAD DEL TANQUE"));
                        au[p].setCap_tanque(cap_tan);
                        JOptionPane.showMessageDialog(null,"SE MODIFICO LA CAPACIDAD DEL TANQUE","MENSAJE",JOptionPane.INFORMATION_MESSAGE);
                        break;
                case 2:int vel=Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE CAPACIDAD DEL TANQUE"));
                        au[p].setVelocidad(vel);
                        JOptionPane.showMessageDialog(null,"SE MODIFICO LA VELOCIDAD","MENSAJE",JOptionPane.INFORMATION_MESSAGE);
                        break;
                default :JOptionPane.showMessageDialog(null,"OPCION INCORRECTA, VUELVA A INGRESAR","ERROR",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO OBJETO","ERROR",JOptionPane.WARNING_MESSAGE);
        }
    }
    public void modificarTruck(){
        int mat=Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE MATRICULA"));
        int p=Buscar(mat,indice_ca,ca);
        if(p>=0){
            int mod=Integer.parseInt(JOptionPane.showInputDialog(null,"QUE DESEA MODIFICAR\n1.TIPO\n2.CARGA"));
            switch(mod){
                case 1: String t=JOptionPane.showInputDialog(null,"INGRESE TIPO");
                        ca[p].setTipo(t);
                        JOptionPane.showMessageDialog(null,"SE MODIFICO EL TIPO","MENSAJE",JOptionPane.INFORMATION_MESSAGE);
                        break;
                case 2:double car=Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE CARGA"));
                        ca[p].setCarga(car);
                        JOptionPane.showMessageDialog(null,"SE MODIFICO LA CARGA","MENSAJE",JOptionPane.INFORMATION_MESSAGE);
                        break;
                default :JOptionPane.showMessageDialog(null,"OPCION INCORRECTA, VUELVA A INGRESAR","ERROR",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO OBJETO","ERROR",JOptionPane.WARNING_MESSAGE);
        }
    }
    public int Buscar(int nbus,int indice,Vehicle[]v){
        int pos=-1;
        for(int i=0;i<indice;i++){
            if(v[i].matricula==nbus){
                pos=i;
            }
        }
        return pos;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCar = new javax.swing.JButton();
        btnTruck = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnCombustible = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCar.setText("CAR");
        btnCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarActionPerformed(evt);
            }
        });

        btnTruck.setText("TRUCK");
        btnTruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTruckActionPerformed(evt);
            }
        });

        btnMostrar.setText("MOSTRAR");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnCombustible.setText("COMBUSTIBLE");
        btnCombustible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombustibleActionPerformed(evt);
            }
        });

        txtA.setColumns(20);
        txtA.setRows(5);
        jScrollPane1.setViewportView(txtA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCombustible)
                    .addComponent(btnCar)
                    .addComponent(btnTruck)
                    .addComponent(btnMostrar)
                    .addComponent(btnModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCar, btnCombustible, btnModificar, btnMostrar, btnTruck});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTruck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCombustible))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTruckActionPerformed
        ca[indice_ca]=new Truck();
        indice_ca++;
        JOptionPane.showMessageDialog(null,"OBJETO TRUCK CREADO");
    }//GEN-LAST:event_btnTruckActionPerformed

    private void btnCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarActionPerformed
        au[indice_au]=new Car();
        indice_au++;
        JOptionPane.showMessageDialog(null,"OBJETO CAR CREADO");
    }//GEN-LAST:event_btnCarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int d=Integer.parseInt(JOptionPane.showInputDialog(null,"QUE DESEA MODIFICAR\n1.CAR\n2.TRUCK"));
        switch(d){
            case 1: if(indice_au>0){
                        modificarCar();
                    }else{
                        JOptionPane.showMessageDialog(null,"NO AGREGO NINGUN OBJETO","ERROR",JOptionPane.WARNING_MESSAGE);
                    }
                    break;
            case 2:if(indice_ca>0){
                        txtA.setText(null);
                        for(int c=0;c<indice_ca;c++){
                            mostrarTruck(ca[c]);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"NO HAY CAMIONES REGISTRADOS","ERROR",JOptionPane.WARNING_MESSAGE);
                    }
                    break;
            default:JOptionPane.showMessageDialog(null,"OPCION INCORRECTA, VUELVA A INGRESAR","ERROR",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        int d=Integer.parseInt(JOptionPane.showInputDialog(null,"QUE DESEA MOSTRAR\n1.CAR\n2.TRUCK"));
        switch(d){
            case 1: if(indice_au>0){
                        txtA.setText(null);
                        for(int c=0;c<indice_au;c++){
                            mostrarCar(au[c]);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"NO HAY AUTOS REGISTRADOS","ERROR",JOptionPane.WARNING_MESSAGE);
                    }
                    break;
            case 2:if(indice_ca>0){
                        txtA.setText(null);
                        for(int c=0;c<indice_ca;c++){
                            mostrarTruck(ca[c]);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"NO HAY CAMIONES REGISTRADOS","ERROR",JOptionPane.WARNING_MESSAGE);
                    }
                    break;
            default:JOptionPane.showMessageDialog(null,"OPCION INCORRECTA, VUELVA A INGRESAR","ERROR",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnCombustibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombustibleActionPerformed
        int t=Integer.parseInt(JOptionPane.showInputDialog(null,"CALCULAR COMBUSTIBLE DE\n1.CAR\n2.TRUCK"));
        switch(t){
            case 1:if(indice_au>0){
                        int mat=Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE MATRICULA"));
                        int p=Buscar(mat,indice_au,au);
                        au[p].combustible();
                    }else{
                        JOptionPane.showMessageDialog(null,"NO AGREGO NINGUN OBJETO","ERROR",JOptionPane.WARNING_MESSAGE);
                    }
                    break;
            case 2:if(indice_ca>0){
                        int mat=Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE MATRICULA"));
                        int p=Buscar(mat,indice_ca,ca);
                        ca[p].combustible();
                    }else{
                        JOptionPane.showMessageDialog(null,"NO AGREGO NINGUN OBJETO","ERROR",JOptionPane.WARNING_MESSAGE);
                    }
                    break;
            default:JOptionPane.showMessageDialog(null,"OPCION INCORRECTA, VUELVA A INGRESAR","ERROR",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCombustibleActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCar;
    private javax.swing.JButton btnCombustible;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnTruck;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtA;
    // End of variables declaration//GEN-END:variables
}
