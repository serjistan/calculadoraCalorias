/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calorias;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author serjistan
 */
public class CaloriasInterfaz extends javax.swing.JFrame {

    /**
     * Creates new form CaloriasInterfaz
     */
    public CaloriasInterfaz() {
        initComponents();
    }
    
    /**
     * @param sexo is the sex of the gender marked on the radioButtons
     * @param peso is the weight entered on the textField
     * @param altura is the height entered on the textField
     * @param edad is the age entered on the textField
     * @param factorActividad is the grade of physical activity marked on the radioButtons
     * @return it returns a double, calculated on the Harris-Benedict formula
     */
    
    public static double calcularCalorias(char sexo, int peso, int altura, int edad, double factorActividad){
        //We declare all the variables
        double resultado = 0, calculo, varPeso, varAltura, varEdad;

        //if the gender marked is 'mujer' we establish some parameters
        if (sexo == 'M'){
            varPeso = 9.6 * peso;
            varAltura = 1.8 * altura;
            varEdad = 4.7 * edad;
            
            calculo = 655 + varPeso + varAltura + varEdad;
            resultado = calculo * factorActividad;
            
        //in the other hand, if the gender is 'hombre', we establish other parameters    
        }else{
            varPeso = 13.7 * peso;
            varAltura = 5 * altura;
            varEdad = 6.8 * edad;
            
            //right here we do the calculation
            calculo = 66 + varPeso + varAltura + varEdad;
            resultado = calculo * factorActividad;
        }
        return resultado;
    }
    
    public void limpiarCampos(){
        //this method reset all the fields on the app
        pesoTexto.setText("");
        alturaTexto.setText("");
        edadTexto.setText("");
        caloriasTotal.setText("");
        caloriasBajar.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        pesoTexto = new javax.swing.JTextField();
        alturaTexto = new javax.swing.JTextField();
        edadTexto = new javax.swing.JTextField();
        botonMujer = new javax.swing.JRadioButton();
        botonHombre = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        actividadLigera = new javax.swing.JRadioButton();
        actividadModerada = new javax.swing.JRadioButton();
        actividadIntensa = new javax.swing.JRadioButton();
        actividadAlta = new javax.swing.JRadioButton();
        botonSalida = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        botonCalcular = new javax.swing.JButton();
        limpiarParametros = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        caloriasTotal = new javax.swing.JTextField();
        sedentaria = new javax.swing.JRadioButton();
        caloriasBajar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pesoTexto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pesoTextoFocusLost(evt);
            }
        });

        alturaTexto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                alturaTextoFocusLost(evt);
            }
        });

        edadTexto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edadTextoFocusLost(evt);
            }
        });

        buttonGroup1.add(botonMujer);
        botonMujer.setText("Mujer");
        botonMujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMujerActionPerformed(evt);
            }
        });

        buttonGroup1.add(botonHombre);
        botonHombre.setText("Hombre");

        jLabel1.setText("Peso (en KG)");

        jLabel2.setText("Altura (en cm)");

        jLabel3.setText("Edad");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Factor de actividad (selecciona una de las 5)");

        buttonGroup2.add(actividadLigera);
        actividadLigera.setText("Actividad ligera (hace actividad físisca 1 a 3 veces por semana)");
        actividadLigera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actividadLigeraActionPerformed(evt);
            }
        });

        buttonGroup2.add(actividadModerada);
        actividadModerada.setText("Actividad moderada (hace actividad físisca 3 a 5 veces por semana)");

        buttonGroup2.add(actividadIntensa);
        actividadIntensa.setText("Actividad intensa (hace actividad física 6 a 7 veces por semana)");

        buttonGroup2.add(actividadAlta);
        actividadAlta.setText("Actividad extremadamente alta (atletas profesionales mucha actividad física)");

        botonSalida.setBackground(new java.awt.Color(153, 153, 255));
        botonSalida.setText("SALIR");
        botonSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalidaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("INTRODUCE LOS SIGUIENTES PARÁMETROS");

        botonCalcular.setText("CALCULAR CALORÍAS");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        limpiarParametros.setText("LIMPIAR PARÁMETROS");
        limpiarParametros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarParametrosActionPerformed(evt);
            }
        });

        jLabel6.setText("Calorías para el metabolismo basal (TBM)");

        caloriasTotal.setEditable(false);

        buttonGroup2.add(sedentaria);
        sedentaria.setText("Personas sedentarias (hace poca actividad física)");

        caloriasBajar.setEditable(false);

        jLabel7.setText("Calorías a consumir para bajar peso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sedentaria)
                            .addComponent(actividadAlta)
                            .addComponent(actividadIntensa)
                            .addComponent(actividadModerada)
                            .addComponent(jLabel4)
                            .addComponent(actividadLigera)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(alturaTexto)
                                            .addComponent(pesoTexto)
                                            .addComponent(edadTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonMujer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botonHombre)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonCalcular)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(limpiarParametros))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(caloriasTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                            .addComponent(caloriasBajar))))))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(botonCalcular)
                    .addComponent(limpiarParametros))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonMujer)
                            .addComponent(botonHombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pesoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alturaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edadTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sedentaria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(actividadLigera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(actividadModerada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(actividadIntensa))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(caloriasTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caloriasBajar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actividadAlta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMujerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMujerActionPerformed

    private void actividadLigeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actividadLigeraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actividadLigeraActionPerformed

    private void botonSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalidaActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_botonSalidaActionPerformed

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        
        //if all the data are selected, the botonCalcular shows the calories you have to eat diary, if not, a message shows that 
        //all the information that the app needs isn't marked or typed
        if (botonMujer.isSelected() || botonHombre.isSelected() && !"".equals(pesoTexto.getText()) && !"".equals(alturaTexto.getText()) && !"".equals(edadTexto.getText()) && actividadLigera.isSelected() || actividadModerada.isSelected() || actividadIntensa.isSelected() || sedentaria.isSelected()){
           char sexo;
        double actividad = 0;
        
        if (botonMujer.isSelected()) {
            sexo = 'M';
        } else if (botonHombre.isSelected()) {
            sexo = 'M';
        } else {
            sexo = '0';
        }
        
        if (actividadLigera.isSelected()) {
            actividad = 1.375;
        } else if (actividadModerada.isSelected()) {
            actividad = 1.55;
        } else if (actividadIntensa.isSelected()) {
            actividad = 1.725;
        } else if (actividadAlta.isSelected()) {
            actividad = 1.9;
        } else if (sedentaria.isSelected()) {
            actividad = 1.2;
        }
        
        int caloriasTotales = (int) CaloriasInterfaz.calcularCalorias(sexo, Integer.parseInt(pesoTexto.getText()), Integer.parseInt(alturaTexto.getText()), Integer.parseInt(edadTexto.getText()), actividad);
        int caloriasBajadas = (int) ((int) caloriasTotales*0.8);        
        caloriasTotal.setText(String.valueOf(caloriasTotales));
        caloriasBajar.setText(String.valueOf(caloriasBajadas)); 
        }else{
            showMessageDialog(null, "No se han seleccionado todos los campos necesarios para el cálculo.");
        }
        
        
        
    }//GEN-LAST:event_botonCalcularActionPerformed

    private void limpiarParametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarParametrosActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_limpiarParametrosActionPerformed

    
    //We want to avoid every error, so we try to do a Integer conversion over a textField. If they can't be converted
    //a message shows about change the text typed and return the focus
    private void pesoTextoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pesoTextoFocusLost
        try{
            Integer.parseInt(pesoTexto.getText());
        }catch (NumberFormatException e){
            showMessageDialog(null, "Los carácteres introducidos no tienen un formato numérico.");
            pesoTexto.requestFocus();
        }
    }//GEN-LAST:event_pesoTextoFocusLost

    private void alturaTextoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_alturaTextoFocusLost
        try{
            Integer.parseInt(alturaTexto.getText());
        }catch (NumberFormatException e){
            showMessageDialog(null, "Los carácteres introducidos no tienen un formato numérico.");
            alturaTexto.requestFocus();
        }
    }//GEN-LAST:event_alturaTextoFocusLost

    private void edadTextoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edadTextoFocusLost
        try{
            Integer.parseInt(edadTexto.getText());
        }catch (NumberFormatException e){
            showMessageDialog(null, "Los carácteres introducidos no tienen un formato numérico.");
            edadTexto.requestFocus();
        }
    }//GEN-LAST:event_edadTextoFocusLost

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
            java.util.logging.Logger.getLogger(CaloriasInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaloriasInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaloriasInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaloriasInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaloriasInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton actividadAlta;
    private javax.swing.JRadioButton actividadIntensa;
    private javax.swing.JRadioButton actividadLigera;
    private javax.swing.JRadioButton actividadModerada;
    private javax.swing.JTextField alturaTexto;
    private javax.swing.JButton botonCalcular;
    private javax.swing.JRadioButton botonHombre;
    private javax.swing.JRadioButton botonMujer;
    private javax.swing.JButton botonSalida;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField caloriasBajar;
    private javax.swing.JTextField caloriasTotal;
    private javax.swing.JTextField edadTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton limpiarParametros;
    private javax.swing.JTextField pesoTexto;
    private javax.swing.JRadioButton sedentaria;
    // End of variables declaration//GEN-END:variables
}
