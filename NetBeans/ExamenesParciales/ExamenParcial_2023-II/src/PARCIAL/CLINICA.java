/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PARCIAL;

import javax.swing.JOptionPane;

/**
 *
 * @author alumnoUSMP
 */
public class CLINICA extends javax.swing.JFrame {
    int []A=new int[10];
    String[]B=new String[10];
    char[]C=new char[10];
    String[]D=new String[10];
    int indice=0;
    /**
     * Creates new form Ejercicio
     */
    public CLINICA() {
        initComponents();
    }
    
    public int generarCodigo(){
        int n;
        do{
            n=(int)(Math.random()*(2000-1000+1)+1000);
        }while(verificarRepetido(n)||verificarPar(n));
        return n;
    }
    public char generarSexo(){
        int n=(int)(Math.random()*(1-0+1)+0);
        switch(n){
            case 0:return 'F';
            default:return 'M';
        }
    }
    public String generarEspecialidad(){
        int n=(int)(Math.random()*(4-1+1)+1);
        switch(n){
            case 1:return "GINECOLOGIA";
            case 2:return "NEUROLOGIA";
            case 3:return "MEDICINA";
            default:return "PEDIATRIA";
        }
    }
    public boolean verificarPar(int v){
        if(v%2!=0){
            return true;
        }else{
            return false;
        }
    }
    public boolean verificarRepetido(int v){
        for(int c=0;c<indice;c++){
            if(A[c]==v){
                return true;
            }
        }
        return false;
    }
    public void  mostrar(){
        txtCodigo.setText(null);
        txtListNombres.setText(null);
        txtSexo.setText(null);
        txtEspecialidad.setText(null);
        for(int c=0;c<indice;c++){
            txtCodigo.append(A[c]+"\n");
            txtListNombres.append(B[c]+"\n");
            txtSexo.append(C[c]+"\n");
            txtEspecialidad.append(D[c]+"\n");
        }
    }
    public void eliminar(int p){
        for(int c=p;c<indice-1;c++){
            A[c]=A[c+1];
            B[c]=B[c+1];
            C[c]=C[c+1];
            D[c]=D[c+1];
        }
        indice--;
        int auxA[]=new int[A.length];
        String auxB[]=new String[B.length];
        char auxC[]=new char[C.length];
        String auxD[]=new String[D.length];
        for(int c=p;c<indice;c++){
            auxA[c]=A[c];
            auxB[c]=B[c];
            auxC[c]=C[c];
            auxD[c]=D[c];
        }
        A=auxA;
        B=auxB;
        C=auxC;
        D=auxD;
    }
    public int buscar(int nbus){
        for(int c=0;c<indice;c++){
            if(A[c]==nbus){
                return c;
            }
        }
        return -1;
    }
    public void ordenar(){
        for(int c=0;c<indice;c++){
            for(int i=0;i<indice-1;i++){
                if(A[c]<A[i]){
                    int auxA=A[c];
                    A[c]=A[i];
                    A[i]=auxA;
                    String auxB=B[c];
                    B[c]=B[i];
                    B[i]=auxB;
                    char auxC=C[c];
                    C[c]=C[i];
                    C[i]=auxC;
                    String auxD=D[c];
                    D[c]=D[i];
                    D[i]=auxD;
                }
            }
        }
        
    }
    public int modificar (int p, int op){
        String t;
        switch(op){
            case 1:
                t=JOptionPane.showInputDialog("INGRESE SEXO");
                while (t.charAt(0)!='F'&&t.charAt(0)!='M'){
                   t=JOptionPane.showInputDialog("INGRESE SEXO NUEVAMENTE");
                }
                C[p]=t.toUpperCase().charAt(0);return 1;
                
            case 2:
                t=JOptionPane.showInputDialog("INGRESE ESPECIALIDAD");
                while ((t.equalsIgnoreCase("PEDIATRIA")||t.equalsIgnoreCase("GINECOLOGIA")||t.equalsIgnoreCase("NEUROLOGIA")||t.equalsIgnoreCase("MEDICINA"))==false){
                   t=JOptionPane.showInputDialog("INGRESE ESPECIALIDAD NUEVAMENTE");
                }
                D[p]=t.toUpperCase();return 1;
            default: return 0;
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

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCodigo = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtListNombres = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSexo = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtEspecialidad = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INGRESE APELLIDOS Y NOMBRES");

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtCodigo.setColumns(20);
        txtCodigo.setRows(5);
        jScrollPane1.setViewportView(txtCodigo);

        jLabel2.setText("CODIGO");

        jLabel3.setText("APELLIDOS Y NOMBRES");

        jLabel4.setText("SEXO");

        jLabel5.setText("ESPECIALIDAD");

        btnMostrar.setText("MOSTRAR");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnOrdenar.setText("ORDENAR");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        txtListNombres.setColumns(20);
        txtListNombres.setRows(5);
        jScrollPane2.setViewportView(txtListNombres);

        txtSexo.setColumns(20);
        txtSexo.setRows(5);
        jScrollPane3.setViewportView(txtSexo);

        txtEspecialidad.setColumns(20);
        txtEspecialidad.setRows(5);
        jScrollPane4.setViewportView(txtEspecialidad);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrar)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminar)
                                    .addComponent(btnMostrar)
                                    .addComponent(btnModificar)
                                    .addComponent(btnOrdenar)))
                            .addComponent(jLabel5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEliminar, btnModificar, btnMostrar, btnOrdenar, btnRegistrar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOrdenar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String t=txtNombre.getText();
        if(t.compareTo("")!=0){
            if(indice<A.length){
                A[indice]=generarCodigo();
                B[indice]=t.toUpperCase();
                C[indice]=generarSexo();
                D[indice]=generarEspecialidad();
                indice++;
                JOptionPane.showMessageDialog(null,"PACIENTE REGISTRADO");
            }else{
                JOptionPane.showMessageDialog(null,"NO MAS PACIENTES");
            }
        }else{
            JOptionPane.showMessageDialog(null,"INGRESE PACIENTE");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
         if(indice!=0){
             mostrar();
         }else{
              JOptionPane.showMessageDialog(null,"NO HAY PACIENTES");
         }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int n=Integer.parseInt(JOptionPane.showInputDialog("PACIENTE BUSCADO"));
        int p=buscar(n);
        if(p<=0){
            eliminar(p);
            JOptionPane.showMessageDialog(null,"PACIENTE ELIMINADO");
            mostrar();
        }else{
            JOptionPane.showMessageDialog(null,"PACIENTE NO ENCONTRADO","MENSAJE",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int n=Integer.parseInt(JOptionPane.showInputDialog("PACIENTE BUSCADO"));
        int p=buscar(n);
        if(p>=0){
            int op=Integer.parseInt(JOptionPane.showInputDialog("QUE MODIFCA: 1.SEXO - 2.ESPECIALIDAD"));
            if(modificar(p,op)!=0){
                JOptionPane.showMessageDialog(null,"PACIENTE REGISTRADO");
                mostrar();
            }else{
                JOptionPane.showMessageDialog(null,"ERROR AL MOMENTO DE MODIFICAR","MENSAJE",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"PACIENTE NO ENCONTRADO","MENSAJE",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        if(indice!=0){
            ordenar();
            mostrar();
         }else{
              JOptionPane.showMessageDialog(null,"NO HAY PACIENTES");
         }
    }//GEN-LAST:event_btnOrdenarActionPerformed

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
            java.util.logging.Logger.getLogger(CLINICA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CLINICA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CLINICA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CLINICA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CLINICA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtCodigo;
    private javax.swing.JTextArea txtEspecialidad;
    private javax.swing.JTextArea txtListNombres;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtSexo;
    // End of variables declaration//GEN-END:variables
}
