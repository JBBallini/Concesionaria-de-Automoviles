
package igu;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Auto;
import logica.Controladora;

/**
 * @author Ballini Juan Bautista
 */

public class VerAutos extends javax.swing.JFrame {

    Controladora control = null;
    Principal pantallaPrincipal = null;
    
    public VerAutos() {
        control = new Controladora();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDatos = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(47, 54, 44));

        labelTitulo.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(187, 236, 100));
        labelTitulo.setText("Consultar Autos");

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Autor: Ballini Juan Bautista");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        btnEliminar.setBackground(new java.awt.Color(207, 93, 27));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\porokiin\\Documents\\NetBeansProjects\\automovil\\src\\main\\java\\igu\\imgs\\icon_delete.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tableDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tableDatos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tableDatos.setForeground(new java.awt.Color(0, 0, 0));
        tableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableDatos.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tableDatos);

        btnEditar.setBackground(new java.awt.Color(207, 93, 27));
        btnEditar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\porokiin\\Documents\\NetBeansProjects\\automovil\\src\\main\\java\\igu\\imgs\\icon_edit.png")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnVolver.setBackground(new java.awt.Color(207, 93, 27));
        btnVolver.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver.setIcon(new javax.swing.ImageIcon("C:\\Users\\porokiin\\Documents\\NetBeansProjects\\automovil\\src\\main\\java\\igu\\imgs\\icon_leftArrow.png")); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 783, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitulo)
                    .addComponent(btnVolver))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // ------------------ Botones ------------------ //
    
    //Botón Eliminar
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Controlo que la tabla no este vacía
        if (tableDatos.getRowCount() > 0){
            //Controlo que se haya seleccionado un registro
            if (tableDatos.getSelectedRow() != -1){
                //Traigo el iD del Auto de la tabla automoviles que este hubicado en la columna 0 de la fila seleccionada y lo almaceno en la variable
                int idAuto  = Integer.parseInt(String.valueOf(tableDatos.getValueAt(tableDatos.getSelectedRow(),0)));
                //Llamo al método para borrar el auto en la controladora
                control.borrarAuto(idAuto);
                mostrarMensaje("Auto Eliminado Correctamente", "Info", "Borrado de Auto");
                //Cargo la tabla con los datos actualizados
                cargarTabla();
            } else {
                mostrarMensaje("Auto No Seleccionado", "Error", "Error al Eliminar");
            }
        } else {
            mostrarMensaje("No hay registros que eliminar", "Error", "Error al Eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    //Botón Editar
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        if (tableDatos.getRowCount() > 0){
            //Controlo que se haya seleccionado un registro
            if (tableDatos.getSelectedRow() != -1){
                int idAuto  = Integer.parseInt(String.valueOf(tableDatos.getValueAt(tableDatos.getSelectedRow(),0)));
                
                EditarAuto pantallaModificarDatos = new EditarAuto(idAuto);
                pantallaModificarDatos.setVisible(true);
                pantallaModificarDatos.setLocationRelativeTo(null);
                this.dispose();
            } else {
                mostrarMensaje("Auto No Seleccionado", "Error", "Error al Editar");
            }
        } else {
            mostrarMensaje("No hay registros que editar", "Error", "Error al Editar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened
    
    //Botón Volver
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        pantallaPrincipal = new Principal();
        dispose();
        pantallaPrincipal.setVisible(true);
        pantallaPrincipal.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverActionPerformed

    // ------------------ Botones ------------------ //
    
    // ------------------ Otros Métodos ------------------ //
    
    //Creación y actualización de tabla
    private void cargarTabla() {
        
        //Definir el modelo de tabla a partir de la clase DefaultTableModel, es decir, ayuda a definir columnas y el resto del diseño
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            //No permito que las filas y columnas sean editables al interactuar directamente con ellas (no ovlidar el Override ya que es un método de DefaultTableModel)
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        //Establesco los nombres de las columnas
        String titulos[] = {"ID", "Modelo", "Marca", "Motor", "Color", "Patente", "Puertas"};
        //Seteo los nombres
        modeloTabla.setColumnIdentifiers(titulos);
        
        //Carga de datos desde la BD
        //Creo una lista para guardar los datos de los autos
        List <Auto> listaAutos = control.traerAutos();
        
        //Recorrer la lista y mostrar cada uno de los elementos de la tabla
        //Pregunto si la lista esta vacia o no y luego realizo la lógica
        if (listaAutos != null) {
            for (Auto auto : listaAutos) {
                //Guardo los datos de los autos en un array de tipo Object porque almaceno datos de diferentes tipos (Strings e ints)
                Object[] objeto = {auto.getId(), auto.getModelo(), auto.getMarca(), auto.getMotor(), auto.getColor(), auto.getPatente(), auto.getPuertas()};
                //Agrego el array como fila en la tabla
                modeloTabla.addRow(objeto);
            }
        }
        //Le asigno el modelo creado a la tabla
        tableDatos.setModel(modeloTabla);
    }

    //Mensajes de Información y Error
    public void mostrarMensaje(String mensaje, String tipoMensaje, String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipoMensaje.equals("Info") ){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } 
        else if (tipoMensaje.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    // ------------------ Otros Métodos ------------------ //
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tableDatos;
    // End of variables declaration//GEN-END:variables
}
