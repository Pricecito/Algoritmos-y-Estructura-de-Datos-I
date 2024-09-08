/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

/**
 *
 * @author JM Gutierrez
 */
public class Interfaz extends javax.swing.JFrame {
CentralTelefonica vLlamadas[]=new CentralTelefonica[99999];
int pos[]=new int [vLlamadas.length],indP=0;
char tLlamada[]=new char[vLlamadas.length];
double costos[]=new double[vLlamadas.length];
int indice=0,cl=0,cp=0;

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
    }
    public double rLocal(){
        double rL=0;
        for(int c=0;c<indice;c++){
            if(tLlamada[c]=='L'){
                rL+=costos[c];
            }
        }
        return rL;
    }
    public double rProvin(){
        double rP=0;
        for(int c=0;c<indice;c++){
            if(tLlamada[c]=='P'){
                rP+=costos[c];
            }
        }
        return rP;
    }
    public double rTotal(){
        double rT=0;
        for(int c=0;c<indice;c++){
            rT+=costos[c];
        }
        return rT;
    }
    public void MostrarDatos(){
        String num=Utilitario.getMensaje("Inserte Número que desea buscar:");
        boolean x=false;
        for(int c=0;c<indice;c++){
            if(vLlamadas[c].getnDestino().equals(num)){
                pos[c]=c;
                indP++;
                x=true;
            }
        }
        if(x){
           txtA.setText("Resultados "+num+"\n");
           for(int i=0;i<indP;i++){
                txtA.append("   Origen: "+vLlamadas[pos[i]].getnOrigen()+"\n");
                if(tLlamada[i]=='L'){
                    txtA.append("   Tipos: Local\n");
                } else {
                    txtA.append("   Tipo: Provincial\n");
                }
                txtA.append("   Duración: "+vLlamadas[pos[i]].getDuracion()+" segundos\n");
                txtA.append("   Costo: S/."+costos[i]+"\n\n"); 
           }
        }else{
            Utilitario.setMensajeError("NO SE ENCONTRO EL NÚMERO");
        }
    }
    public void MostrarLlamadas(){
        txtA.setText("Cantidad de llamadas\n");
        txtA.append("   Cantidad de llamadas Locales: "+cl+"\n");
        txtA.append("   Monto recaudado: "+rLocal()+"\n");
        txtA.append("   Cantidad de llamadas Provinciales: "+cp+"\n");
        txtA.append("   Monto recaudado: "+rProvin()+"\n");
        txtA.append("   Monto Total: "+rTotal()+"\n");
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
        txtOrigen = new javax.swing.JTextField();
        cboTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA = new javax.swing.JTextArea();
        btnRegistrar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("N. Origen:");

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Locales", "Provinciales" }));

        jLabel2.setText("Tipo:");

        jLabel3.setText("N. Destino:");

        jLabel4.setText("Duracion (segundos):");

        txtA.setColumns(20);
        txtA.setRows(5);
        jScrollPane1.setViewportView(txtA);

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnMostrar.setText("MOSTRAR");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jLabel5.setText("Hora (formato 24 horas):");

        jLabel6.setText(":");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtOrigen, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(txtDestino)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDuracion))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        int m=Integer.parseInt(Utilitario.getMensaje("1. Datos de una llamada\n2.Cant. de llamadas y reacudacion\nColocar alternativa:"));
        switch(m){
            case 1:MostrarDatos();break;                    
            case 2:MostrarLlamadas();break;
            default:Utilitario.setMensajeError("LA RESPUESTA NO COINCIDE CON NINGUNA OPCION!!!!");
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String t1=txtOrigen.getText().trim(),t2=txtDestino.getText().trim(),t3=txtDuracion.getText().trim(),t4=txtHora.getText().trim(),t5=txtMin.getText().trim();
        if(t1.equals("")!=true&&t2.equals("")!=true&&t3.equals("")!=true&&t4.equals("")!=true&&t5.equals("")!=true){
            int h=Integer.parseInt(t4);
            int m=Integer.parseInt(t5);
            if(h<24&&m<60){
                int tipo=cboTipo.getSelectedIndex();
                String Or=t1,Des=t2;
                int dur=Integer.parseInt(t3);
                switch(tipo){ 
                    case 0: Locales A=new Locales(Or,Des,dur);
                            vLlamadas[indice]=A;
                            tLlamada[indice]='L';
                            costos[indice]=A.CalcularCosto();
                            indice++;cl++;
                            break;
                    default:Provincias B=new Provincias(Or,Des,dur,h);
                            vLlamadas[indice]=B;
                            tLlamada[indice]='P';
                            costos[indice]=B.CalcularCosto();
                            indice++;cp++; 
                } 
            }else{
                Utilitario.setMensaje("La hora es incorrecta");
            }
        }else{
           Utilitario.setMensajeError("Los espacios tiene que estar llenados!!!!!!");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtA;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMin;
    private javax.swing.JTextField txtOrigen;
    // End of variables declaration//GEN-END:variables
}