/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_2023.i;

/**
 *
 * @author USMP
 */
public class Formulario extends javax.swing.JFrame {
Usuario[]usu=new Usuario[9999];
int indice=0;
    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
    }
    public int Buscar(int dat){
        for(int c=0;c<indice;c++){
            if(dat==usu[c].getCod_usu()){
                return c;
            }  
        }
        return -1;
    }
    public boolean codigoRepetido(int cod){
        for(int c=indice-1;c>=0;c--){
            if(cod==usu[c].getCod_usu()){
                return true;
            }  
        }
        return false;
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
        jLabel2 = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnListUser = new javax.swing.JButton();
        txtTipo = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("NOMBRE DEL USUARIO");

        btnRegistro.setText("REGISTRAR");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        txtA.setColumns(20);
        txtA.setRows(5);
        jScrollPane1.setViewportView(txtA);

        jLabel3.setText("TIPO DE CLIENTE");

        btnListar.setText("LISTAR");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnAgregar.setText("AGREGAR PRODUCTOS");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnListUser.setText("LISTA DE PRODUCTOS DEL USUARIO");
        btnListUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListUserActionPerformed(evt);
            }
        });

        btnCalcular.setText("CALCULAR TOTAL");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnListar)
                                    .addComponent(btnRegistro))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnListar, btnRegistro});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistro))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnListar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
       txtA.setText("LISTA DE USUARIO");
       for(int c=0;c<indice;c++){
           txtA.append("\nCODIGO: "+usu[c].getCod_usu() +" - NOMBRE: "+usu[c].getNom_usu()+ " - TIPO: "+usu[c].getTipo());
       }
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        int c;
        do{
            c=Utilitario.generarAleatorio(100, 200);
        }while(codigoRepetido(c));
        String n=txtNombre.getText().toUpperCase();
        String m=txtTipo.getText().toUpperCase();
        if((!n.trim().equals(""))&&(!m.trim().equals(""))){
            char t=m.toUpperCase().charAt(0);
            switch(t){
                case 'N':usu[indice]=new Per_Natural(c, n, t);indice++;break;
                case 'J':usu[indice]=new Per_Juridica(c, n, t);indice++;break;
                default: Utilitario.mensaje("ERROR SOLO SE PERMITEN N Y J EN EL CAMPO DE TIPO DE PERSONA");
            }
        }else{
            Utilitario.mensaje("CAMPO VACIO");
        }
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int c=Integer.parseInt(Utilitario.ingreso("INGRESE CODIGO DEL USUARIO"));
        if(Buscar(c)>=0){
            int p=Buscar(c);
            Usuario u=usu[p];
            int q=Integer.parseInt(Utilitario.ingreso("INGRESE CANTIDAD DE PRODUCTOS"));
            u.setP(q);
            for(int i=0;i<u.getP().length;i++){
                int pre=Integer.parseInt(Utilitario.ingreso("INGRESE PRECIO DEL PRODUCTO N° "+(i+1)));
                u.getP()[u.getIndice_p()]=pre;
                u.setIndice_p(1);
            }
        }else{
            Utilitario.mensaje("USUARIO NO ENCONTRADO");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnListUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListUserActionPerformed
        int c=Integer.parseInt(Utilitario.ingreso("INGRESE CODIGO DEL USUARIO"));
        if(Buscar(c)>=0){
            int p=Buscar(c);
            Usuario u=usu[p];
            if(u.getIndice_p()>0){
                txtA.setText("CODIGO: "+u.getCod_usu()+" - NOMBRE: "+u.getNom_usu()+" - TIPO: "+u.getTipo()+"\n");
                for(int i=0;i<u.getIndice_p();i++){
                    txtA.append("PRECIO PROD. N° "+(i+1)+": "+u.getP()[i]+"\n");
                }
            }else{
                Utilitario.mensaje("USUARIO SIN PRODUCTOS");
            }
        }else{
            Utilitario.mensaje("USUARIO NO ENCONTRADO");
        }
    }//GEN-LAST:event_btnListUserActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int c=Integer.parseInt(Utilitario.ingreso("INGRESE CODIGO DEL USUARIO"));
        if(Buscar(c)>=0){
            int p=Buscar(c);
            Usuario u=usu[p];
            if(u.getIndice_p()>0){
                txtA.setText(null);
                txtA.append("CODIGO: "+u.getCod_usu()+"\n"+"NOMBRE: "+u.getNom_usu()+"\nTIPO: "+u.getTipo()+"\nTOTAL A PAGAR: "+u.descuento());
                
            }else{
                Utilitario.mensaje("USUARIO SIN PRODUCTOS");
            }
        }else{
            Utilitario.mensaje("USUARIO NO ENCONTRADO");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnListUser;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtA;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
