/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFinal;

import javax.swing.JOptionPane;

/**
 *
 * @author jmgut
 */
public class Clinica extends javax.swing.JFrame {
Usuario []usu=new Usuario[999999];
int indice_usu;
    /**
     * Creates new form Interfaz
     */
    public Clinica() {
        initComponents();
    }
    public int Buscar(int bus){
        int pos=-1;
        for(int c=0;c<indice_usu;c++){
            if(usu[c].codigo==bus){
                pos=c;
            }
        }
        return pos;
    }
    public void Eliminar(int bus){
        int pos;
        for(int j=bus;j<indice_usu-1;j++){
            usu[j]=usu[j+1];
        }
        indice_usu--;
        Usuario aux[]=new Usuario[usu.length];
        for(int c=0;c<indice_usu;c++){
                aux[c]=usu[c];
        }
        usu=aux;
        JOptionPane.showMessageDialog(this, "USUARIO ELIMINADO");
    }
    public boolean codigoRepetido(int cod){
        boolean x=false;
        for(int c=indice_usu-1;c>=0;c--){
            if(cod==usu[c].getCodigo()){
                x=true;
            }  
        }
        return x;
    }
    public void Imprimir(int i){
        txtPaciente.setText(null);
        switch(i){
            case 1:for(int x=0;x<indice_usu;x++){
                        if(usu[x].codigo>=100&&usu[x].codigo<150){
                            txtPaciente.append("\nCODIGO: "+usu[x].codigo+"\n");
                            txtPaciente.append("NOMBRE: "+usu[x].getNombre()+"\n");
                            txtPaciente.append("APELLIDO: "+usu[x].getApellido()+"\n");
                            txtPaciente.append("SEXO: "+usu[x].getSexo()+"\n");
                        }
                    }
                    break;
            case 2:int c=Integer.parseInt(Herramientas.getMensaje("INGRESE CÓDIGO"));
                        if(c>=100&&c<150){
                            int p=Buscar(c);
                            if(p>=0){
                                Paciente P=(Paciente)usu[p];
                                txtPaciente.append("\nCODIGO: "+P.codigo+"\n");
                                txtPaciente.append("NOMBRE: "+P.getNombre()+"\n");
                                txtPaciente.append("APELLIDO: "+P.getApellido()+"\n");
                                txtPaciente.append("SEXO: "+P.getSexo()+"\n");
                                for(int j=0;j<P.getIndice();j++){
                                    txtPaciente.append("    CITA N°"+(j+1)+" --- "+P.getCitas()[j]+"\n");
                                }
                            }else{
                                Herramientas.setMensaje("EL PACIENTE NO ESTA REGISTRADO");
                            }
                        }else{
                            Herramientas.setMensaje("EL CODIGO NO ES DE UN PACIENTE");
                        }                      
                    break;
            default:Herramientas.setMensajeError("LA RESPUESTA NO PERTENECE A LAS ALTERNATIVAS");
        }
    }
    public void ImprimirPersonal(int i){
        txtPersonal.setText(null);
        switch(i){
            case 1:for(int x=0;x<indice_usu;x++){
                        if(usu[x].codigo>=150&&usu[x].codigo<200){
                            Medico M=(Medico)usu[x];
                            txtPersonal.append("\nCODIGO: "+M.codigo+"\n");
                            txtPersonal.append("NOMBRE: "+M.getNombre()+"\n");
                            txtPersonal.append("APELLIDO: "+M.getApellido()+"\n");
                            txtPersonal.append("SEXO: "+M.getSexo()+"\n");
                            txtPersonal.append("CENTRO: "+M.getCentro()+"\n");
                            txtPersonal.append("HORAS T.: "+M.getHrs_tra()+"\n");
                            txtPersonal.append("ESPECIALIDAD: "+M.getEspecialidad()+"\n");
                        }
                    }
                    break;
            case 2:for(int x=0;x<indice_usu;x++){
                        if(usu[x].codigo>=200&&usu[x].codigo<=249){
                            Enfermera E=(Enfermera)usu[x];
                            txtPersonal.append("\nCODIGO: "+E.codigo+"\n");
                            txtPersonal.append("NOMBRE: "+E.getNombre()+"\n");
                            txtPersonal.append("APELLIDO: "+E.getApellido()+"\n");
                            txtPersonal.append("SEXO: "+E.getSexo()+"\n");
                            txtPersonal.append("CENTRO: "+E.getCentro()+"\n");
                            txtPersonal.append("HORAS T.: "+E.getHrs_tra()+"\n");
                        }
                    }
                    break;
            default:Herramientas.setMensajeError("LA RESPUESTA NO PERTENECE A LAS ALTERNATIVAS");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnImpPaciente = new javax.swing.JButton();
        btnImpPersonal = new javax.swing.JButton();
        btnRegCitas = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPaciente = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPersonal = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NOMBRE");

        jLabel2.setText("APELLIDO");

        jLabel3.setText("SEXO");

        jLabel4.setText("PACIENTE");

        jLabel5.setText("PERSONAL");

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnImpPaciente.setText("IMPRIMIR PACIENTE");
        btnImpPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpPacienteActionPerformed(evt);
            }
        });

        btnImpPersonal.setText("IMPRIMIR PERSONAL");
        btnImpPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpPersonalActionPerformed(evt);
            }
        });

        btnRegCitas.setText("REGISTRAR CITAS");
        btnRegCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegCitasActionPerformed(evt);
            }
        });

        btnCalcular.setText("CALCULAR SALARIO");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR USUARIO");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtPaciente.setColumns(20);
        txtPaciente.setRows(5);
        jScrollPane2.setViewportView(txtPaciente);

        txtPersonal.setColumns(20);
        txtPersonal.setRows(5);
        jScrollPane3.setViewportView(txtPersonal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSexo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane2)
                                            .addComponent(btnImpPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnRegCitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnImpPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(67, 67, 67)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane2, jScrollPane3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImpPaciente)
                    .addComponent(btnImpPersonal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegCitas)
                    .addComponent(btnCalcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String t1=txtNombre.getText().trim(),t2=txtApellido.getText().trim(),t3=txtSexo.getText().trim();
        if(t1.compareTo("")!=0&&t2.compareTo("")!=0&&t3.compareTo("")!=0){
            int t=Integer.parseInt(Herramientas.getMensaje("1. PACIENTE\n2. MEDICO\n3. ENFERMERA"));
            String n=t1.toUpperCase();
            String a=t2.toUpperCase();
            String s=t3.toUpperCase();
            switch(t){
                case 1: int c1;
                        do{
                            c1=Herramientas.generarAleatorio(100,149);
                        }while(codigoRepetido(c1)==true);
                        Paciente P=new Paciente(c1,n,a,s);
                        usu[indice_usu]=P;indice_usu++;
                        P.mensaje();
                        break;
                case 2: int c2;
                        do{
                            c2=Herramientas.generarAleatorio(150,199);
                        }while(codigoRepetido(c2)==true);
                        Medico M=new Medico(c2,n,a,s);
                        usu[indice_usu]=M;indice_usu++;
                        M.setCentro(Herramientas.getMensaje("INGRESE CENTRO").toUpperCase());
                        M.setHrs_tra(Integer.parseInt(Herramientas.getMensaje("INGRESE HORAS TRABAJADAS")));
                        M.setEspecialidad(Herramientas.getMensaje("INGRESE ESPECIALIDAD").toUpperCase());
                        M.mensaje();
                        break;
                case 3: int c3;
                        do{
                            c3=Herramientas.generarAleatorio(200,249);
                        }while(codigoRepetido(c3)==true);
                        Enfermera E=new Enfermera(c3,n,a,s);
                        usu[indice_usu]=E;indice_usu++;
                        E.setCentro(Herramientas.getMensaje("INGRESE CENTRO").toUpperCase());
                        E.setHrs_tra(Integer.parseInt(Herramientas.getMensaje("INGRESE HORAS TRABAJADAS")));
                        E.mensaje();
                        break;
                default:Herramientas.setMensajeError("Se debe insertar una alternativa");
            }
        }else{
            Herramientas.setMensajeError("LOS RECUADROS TIENEN QUE ESTAR LLENADOS");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnImpPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpPacienteActionPerformed
        int r=Integer.parseInt(Herramientas.getMensaje("1.TODOS LOS PACIENTES\n2.POR CÓDIGO"));
        Imprimir(r);
    }//GEN-LAST:event_btnImpPacienteActionPerformed

    private void btnRegCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegCitasActionPerformed
        int cod=Integer.parseInt(Herramientas.getMensaje("INGRESE CODIGO"));
        if(cod>=100&&cod<150){
            int p=Buscar(cod);
            if(p>=0){
                Paciente P=(Paciente) usu[p];
                if(P.getIndice()<P.getCitas().length){
                    P.getCitas()[P.getIndice()]=Herramientas.getMensaje("INGRESE: FECHA Y HORA DE LA CITA\nEJEMPLO:10 mayo 2020, 15:00");
                    P.setIndice(1);
                }else{
                    Herramientas.setMensaje("LOS PACIENTES PUEDEN TENER MAXIMO 3 CITAS");
                }
            }else{
                Herramientas.setMensaje("EL PACIENTE NO ESTA REGISTRADO");
            }
        }else{
            Herramientas.setMensajeError("EL COODIGO NO ES DE UN PACIENTE");
        }
    }//GEN-LAST:event_btnRegCitasActionPerformed

    private void btnImpPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpPersonalActionPerformed
        int r=Integer.parseInt(Herramientas.getMensaje("1.MEDICO\n2.ENFERMERA"));
        ImprimirPersonal(r);
    }//GEN-LAST:event_btnImpPersonalActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int cod=Integer.parseInt(Herramientas.getMensaje("INGRESE CODIGO"));
        int p=Buscar(cod);
        if(p>=0){
            if(cod>=150&&cod<200){
                Medico M=(Medico)usu[p];
                M.Salario();
            }else if(cod>=200&cod<=249){
                Enfermera E=(Enfermera)usu[p];
                E.Salario();
            }
        }else{
            Herramientas.setMensajeError("PERSONAL NO REGISTRADO");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int c=Integer.parseInt(Herramientas.getMensaje("CODIGO DE USUARIO"));
        int p=Buscar(c);
        if(p>=0){
            Eliminar(p);
        }else{
            Herramientas.setMensajeError("PERSONAL NO REGISTRADO");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Clinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clinica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnImpPaciente;
    private javax.swing.JButton btnImpPersonal;
    private javax.swing.JButton btnRegCitas;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtPaciente;
    private javax.swing.JTextArea txtPersonal;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
