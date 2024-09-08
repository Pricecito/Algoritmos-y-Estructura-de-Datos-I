/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_2023.ii;

public class Formulario extends javax.swing.JFrame {
    Persona vec[]=new Persona[1000000];
    int indice=0;
    
    public Formulario() {
        initComponents();
    }
    public int Buscar(int codigo){
        for(int c=0;c<indice;c++){
            if(vec[c].getCodigo()==codigo){
                return c;
            }
        }
        return -1;
    }
    public void Eliminar(int pos){
        for(int c=pos;c<indice-1;c++){
            vec[c]=vec[c+1];
        }
        indice--;
        Persona aux[]=new Persona[vec.length];
        for(int i=0;i<indice;i++){
            aux[i]=vec[i];
        }
        vec=aux;
    }
    public void Mostrar_Persona(int i){
        int min=0;
        int max=0;
        boolean x;
        txtA.setText(null);
        switch(i){
            case 1: 
                min=1000;
                max=1199;
                break;
            case 2: 
                boolean x1;
                int t;
                do{
                    x1=false;
                    t=Integer.parseInt(Herramientas.ingreso("1.DOCENTE TIEMPO COMPLETO\n2.DOCENTE TIEMPO PARCIAL"));
                    switch(t){
                        case 1: min=1200;
                                max=1299;
                            break;
                        case 2: min=1300;
                                max=1399;                            
                            break;
                        default: Herramientas.mensaje("ERROR DE INGRESO");x1=true;
                    }
                }while(x1);
                break;
            case 3:min=1400; 
                   max=1499;
                break;
            default:Herramientas.mensaje("ERROR DE INGRESO");
        }
        for(int c=0;c<indice;c++){
            if(vec[c].getCodigo()>=min&&vec[c].getCodigo()<=max){
               txtA.append(vec[c].Mostrar());
            }
            
        }
    }
    public boolean verificarCodigo(int codigo){
        for(int c=indice-1;c>=0;c--){
            if(vec[c].getCodigo()==codigo){
                return true;
            }
        }
        return false;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA = new javax.swing.JTextArea();
        btnRegistrar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnPension = new javax.swing.JButton();
        btnSalario = new javax.swing.JButton();
        btnSueldo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("USMP");

        txtA.setColumns(20);
        txtA.setRows(5);
        jScrollPane1.setViewportView(txtA);

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnImprimir.setText("IMPRIMIR");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnPension.setText("PENSION DEL ALUMNO");
        btnPension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPensionActionPerformed(evt);
            }
        });

        btnSalario.setText("SALARIO DEL DOCENTE");
        btnSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalarioActionPerformed(evt);
            }
        });

        btnSueldo.setText("SUELDO DEL ADMINISTRATIVO");
        btnSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSueldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPension, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSueldo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnImprimir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEliminar, btnImprimir, btnPension, btnRegistrar, btnSalario, btnSueldo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(19, 19, 19)
                        .addComponent(btnImprimir)
                        .addGap(19, 19, 19)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(btnPension)
                        .addGap(19, 19, 19)
                        .addComponent(btnSalario)
                        .addGap(19, 19, 19)
                        .addComponent(btnSueldo)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String n=Herramientas.ingreso("INGRESE NOMBRE Y APELLIDOS").toUpperCase();
        String s=Herramientas.ingreso("INGRESE SEXO").toUpperCase();
        int e=Integer.parseInt(Herramientas.ingreso("INGRESE EDAD"));
        int codigo;
        int x=Integer.parseInt(Herramientas.ingreso("INGRESE QUE DESEA REGISTRAR\n1.ALUMNO\n2.DOCENTE\n3.ADMINISTRATIVO"));
        switch(x){
            case 1: 
                    do{
                        codigo=Herramientas.generaAleatiorio(1000,1199);
                    }while(verificarCodigo(codigo));
                    boolean y;
                    String carrera;
                    do{
                        y=false;
                        carrera=Herramientas.ingreso("INGRESE CARRERA").toUpperCase();
                        switch(carrera){
                        case "PSICOLOGIA":
                        case "ODONTOLOGIA":
                        case "ARQUITECTURA":
                            break;
                        default:y=true;
                        Herramientas.mensaje("SOLAMENTE SE PERMITE INGRESAR LAS CARRERAS DE ODONTOLOGIA, PSICOLOGIA O ARQUITECTURA ERROR EN EL INGRESO");
                        }
                    }while(y);
                    int creditos=Integer.parseInt(Herramientas.ingreso("INGRESE CREDITOS"));
                    vec[indice]=new Alumno(carrera, creditos, n, s, e, codigo);indice++;
                    Herramientas.mensaje("SE REGISTRO ALUMNO");
                    
                break;
            case 2: boolean x1;
                    String grado;
                    do{
                        x1=false;
                        int r=Integer.parseInt(Herramientas.ingreso("1.BACHILLER\n2.MAGISTER\n3.DOCTOR"));
                        switch(r){
                            case 1:grado="BACHILLER";
                            case 2:grado="MAGISTER";
                            case 3:grado="DOCTOR";
                                break;
                            default: Herramientas.mensaje("ERROR DE INGRESO");x1=true; grado=null;
                        }
                    }while(x1);
                    int t;
                    do{
                        x1=false;
                        t=Integer.parseInt(Herramientas.ingreso("1.DOCENTE TIEMPO COMPLETO\n2.DOCENTE TIEMPO PARCIAL"));
                        boolean x2;
                        switch(t){
                            case 1: 
                                String periodo;
                                do{
                                    periodo=Herramientas.ingreso("PERIODO DEL CONTRATO:").toUpperCase();
                                    x2=false;
                                    switch(periodo){
                                        case "ANUAL":
                                        case "SEMESTRAL":break;
                                        default: x2=true;Herramientas.mensaje("ERROR DE INGRESO");
                                    }
                                }while(x2);
                                do{
                                    codigo=Herramientas.generaAleatiorio(1200,1299);
                                }while(verificarCodigo(codigo));
                                vec[indice]=new Docente_TC(periodo, 40, grado, n,s, e, codigo); 
                                indice++;
                                break;
                            case 2: String unidad=Herramientas.ingreso("UNIDAD ACADEMICAS:");
                                do{
                                    codigo=Herramientas.generaAleatiorio(1300,1399);
                                }while(verificarCodigo(codigo));
                                vec[indice]=new Docente_TC(unidad, Herramientas.generaAleatiorio(1,39), grado, n,s, e, codigo);
                                indice++;
                                break;
                            default: Herramientas.mensaje("ERROR DE INGRESO");x1=true;
                        }
                    }while(x1);
                    Herramientas.mensaje("SE REGISTRO UN DOCENTE");
                break;
            case 3:boolean x2;
                do{
                    codigo=Herramientas.generaAleatiorio(1400,1499);
                }while(verificarCodigo(codigo));
                String area=Herramientas.ingreso("INGRESE AREA:").toUpperCase();
                int hora=Integer.parseInt(Herramientas.ingreso("INGRESE HORAS TRABAJADAS:"));
                double pago=Double.parseDouble(Herramientas.ingreso("INGRESE PAGO POR HORAS TRABAJADAS:"));
                vec[indice]=new Administrativo(area, hora, pago, n, s, e, codigo);
                indice++;
                Herramientas.mensaje("SE REGISTRO UN ADMINISTRATIVO");
                break;
            default:Herramientas.mensaje("ERROR DE INGRESO");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        int x=Integer.parseInt(Herramientas.ingreso("INGRESE QUE DESEA MOSTRAR\n1.ALUMNO\n2.DOCENTE\n3.ADMINISTRATIVO"));
        Mostrar_Persona(x);
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int codigo=Integer.parseInt(Herramientas.ingreso("CODIGO DEL USUARIO:"));
        int pos=Buscar(codigo);
        if(pos>=0){
            Eliminar(pos);
            Herramientas.mensaje("USUARIO ELIMINADO");
        }else{
            Herramientas.mensaje("USUARIO NO ENCONTRADO");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnPensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPensionActionPerformed
        int codigo=Integer.parseInt(Herramientas.ingreso("INGRESE CODIGO:"));
        if(codigo>=1000&&codigo<=1199){
            int pos=Buscar(codigo);
            if(pos>=0){
                Alumno a=(Alumno)vec[pos];
                double pension=a.Calcular();
                double cuota=Math.round((pension/5)*100.00)/100.;
                Herramientas.mensaje("La pension del alumno es: "+pension+"\ny su cuota mensual es de "+cuota);
            }else{
                Herramientas.mensaje("ALUMNO NO ENCONTRADO");
            }
        }else{
            Herramientas.mensaje("EL CODIGO NO PERTENECE A UN ALUMNO");
        }
    }//GEN-LAST:event_btnPensionActionPerformed

    private void btnSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalarioActionPerformed
       int codigo=Integer.parseInt(Herramientas.ingreso("INGRESE CODIGO:"));
        if(codigo>=1200&&codigo<=1399){
            int pos=Buscar(codigo);
            if(pos>=0){
                double salario;
                if(vec[pos].getCodigo()<=1299){
                    Docente_TC d=(Docente_TC)vec[pos];                                 
                    salario=d.Salario();
                }else{
                    Docente_TP d=(Docente_TP)vec[pos];
                    salario=d.Salario();
                }
                Herramientas.mensaje("El salario del docente es: "+salario);
            }else{
                Herramientas.mensaje("DOCENTE NO ENCONTRADO");
            }
        }else{
            Herramientas.mensaje("EL CODIGO NO PERTENECE A UN DOCENTE");
        }
    }//GEN-LAST:event_btnSalarioActionPerformed

    private void btnSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSueldoActionPerformed
        int codigo=Integer.parseInt(Herramientas.ingreso("INGRESE CODIGO:"));
        if(codigo>=1400&&codigo<=1499){
            int pos=Buscar(codigo);
            if(pos>=0){
                Administrativo a=(Administrativo)vec[pos];
                Herramientas.mensaje("El sueldo del Administrativo es: "+a.Sueldo());
            }else{
                Herramientas.mensaje("ADMINISTRATIVO NO ENCONTRADO");
            }
        }else{
            Herramientas.mensaje("EL CODIGO NO PERTENECE A UN ADMINISTRATIVO");
        }
    }//GEN-LAST:event_btnSueldoActionPerformed

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
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnPension;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalario;
    private javax.swing.JButton btnSueldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtA;
    // End of variables declaration//GEN-END:variables
}
