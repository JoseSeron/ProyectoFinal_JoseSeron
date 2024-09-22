
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 * ------COMENTARIOS------ Detalles de cosas que se me pueden olvidar
 *
 * RellenarLayeredPane() -para poder manejar todo en base al ArrayList botones.
 * asi
 *
 * TODO LOS CONTENEDORES DEBEN TRABAJA EN BASE A LOS ARRAYLIST - para poder
 * guardar un solo arreglo de arraylist y cargar todo
 *
 *
 * forma de poner texto multilinea en botones es con html
 * "<html>linea1<br>linea2</html>"
 *
 * @author joser
 */
public class jFPrincipal extends javax.swing.JFrame {

    public jFPrincipal() {
        initComponents();

        //formate inicial de jb_colorFuente
//        JLabel label1 = createDraggableLabel("label", 100, 100);
//        jLayeredPane1.add(label1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpum_elemDiagramaFlujo = new javax.swing.JPopupMenu();
        jmi_elemDiagFljCambiarColor = new javax.swing.JMenuItem();
        jmi_elemDiagFlujoEliminarBoton = new javax.swing.JMenuItem();
        jmi_elemDiagFlCopiar = new javax.swing.JMenuItem();
        jmi_elemDiagFlujoModificarFuente = new javax.swing.JMenuItem();
        jmi_elemDiagFlujoEditarPropiedades = new javax.swing.JMenuItem();
        jd_crearVariable = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtf_nombreNuevaVariable = new javax.swing.JTextField();
        jcb_tipoNuevaVariable = new javax.swing.JComboBox<>();
        jb_agregarVariable = new javax.swing.JButton();
        jd_crearOperacion = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jcb_crearOperacionVar1 = new javax.swing.JComboBox<>();
        jcb_crearOperacionOperador = new javax.swing.JComboBox<>();
        jcb_crearOperacionVar2 = new javax.swing.JComboBox<>();
        jcb_crearOperacionResultado = new javax.swing.JComboBox<>();
        jb_dialogCrearOperacion = new javax.swing.JButton();
        jb_dialogCrearOperacionModPropiedades = new javax.swing.JButton();
        jd_crearIf = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jcb_crearIfVar1 = new javax.swing.JComboBox<>();
        jcb_crearIfComparador = new javax.swing.JComboBox<>();
        jcb_crearIfVar2 = new javax.swing.JComboBox<>();
        jb_dialogAgregarIf = new javax.swing.JButton();
        jb_dialogCrearIfModPropiedades = new javax.swing.JButton();
        jd_crearFor = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jb_dialogAgregarFor = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jcb_crearForComparador = new javax.swing.JComboBox<>();
        jcb_crearForFactor = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jtf_crearForLimite = new javax.swing.JTextField();
        jtf_crearForInicio = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jb_dialogCrearForModPropiedades = new javax.swing.JButton();
        jd_crearWhile = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jcb_crearWhileVar1 = new javax.swing.JComboBox<>();
        jcb_crearWhileComparador = new javax.swing.JComboBox<>();
        jcb_crearWhileVar2 = new javax.swing.JComboBox<>();
        jb_dialogAgregarWhile = new javax.swing.JButton();
        jb_dialogCrearWhileModPropiedades = new javax.swing.JButton();
        jd_crearSout = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jcb_crearSoutVariable = new javax.swing.JComboBox<>();
        jb_dialogCrearSoutAgregar = new javax.swing.JButton();
        jb_dialogCrearSoutModPropiedades = new javax.swing.JButton();
        jd_codigo = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jta_codigoGenerado = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jb_salirDialogCodigo = new javax.swing.JButton();
        jd_modificarFuenteBoton = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jcb_tipoDeFuente = new javax.swing.JComboBox<>();
        js_tamanioFuente = new javax.swing.JSpinner();
        jcb_estiloFuente = new javax.swing.JComboBox<>();
        jtf_ejemploFuente = new javax.swing.JTextField();
        jb_aceptarCambioFuente = new javax.swing.JButton();
        jpum_opcionesArbol = new javax.swing.JPopupMenu();
        jmi_agregarPropiedad = new javax.swing.JMenuItem();
        jmi_agregarMetodo = new javax.swing.JMenuItem();
        jmi_eliminarPropiedad = new javax.swing.JMenuItem();
        jmi_eliminarMetodo = new javax.swing.JMenuItem();
        jmi_eliminarArbol = new javax.swing.JMenuItem();
        jmi_cambiarNombreClase = new javax.swing.JMenuItem();
        jmi_cambiarNombreMetodo = new javax.swing.JMenuItem();
        jtp_diagramaCodigo = new javax.swing.JTabbedPane();
        jp_Diagrama = new javax.swing.JPanel();
        jp_variables = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_variables = new javax.swing.JList<>();
        jb_mostrarDialogAgregarVariable = new javax.swing.JButton();
        jp_diagramaOpciones = new javax.swing.JPanel();
        jb_opcionesInicio = new javax.swing.JButton();
        jb_opcionesDeclarar = new javax.swing.JButton();
        jb_opcionesIf = new javax.swing.JButton();
        jb_opcionesFor = new javax.swing.JButton();
        jb_opcionesWhile = new javax.swing.JButton();
        jb_opcionesSout = new javax.swing.JButton();
        jb_opcionesFin = new javax.swing.JButton();
        jb_opcionesConectorX = new javax.swing.JButton();
        jb_opcionesConectorY = new javax.swing.JButton();
        jb_generarCodigoFlujo = new javax.swing.JButton();
        jb_pegarElementoDiagramaFlujo = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jlp_diagramaFlujo = new javax.swing.JLayeredPane();
        jp_clases = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_arbolClasesGeneradas = new javax.swing.JTree();
        jLabel6 = new javax.swing.JLabel();
        jb_crearClase = new javax.swing.JButton();
        jb_definirHerencia = new javax.swing.JButton();
        jb_pegarClase = new javax.swing.JButton();
        jb_generarCodigoClases = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlp_diagramaClases = new javax.swing.JLayeredPane();
        jmb_principal = new javax.swing.JMenuBar();
        jm_principalArchivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jmi_archivoNuevo = new javax.swing.JMenuItem();
        jm_principalExportar = new javax.swing.JMenu();
        jmi_exportarPDF = new javax.swing.JMenuItem();

        jpum_elemDiagramaFlujo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jpum_elemDiagramaFlujoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jmi_elemDiagFljCambiarColor.setText("Cambiar Color");
        jmi_elemDiagFljCambiarColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_elemDiagFljCambiarColorActionPerformed(evt);
            }
        });
        jpum_elemDiagramaFlujo.add(jmi_elemDiagFljCambiarColor);

        jmi_elemDiagFlujoEliminarBoton.setText("Eliminar Boton");
        jmi_elemDiagFlujoEliminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_elemDiagFlujoEliminarBotonActionPerformed(evt);
            }
        });
        jpum_elemDiagramaFlujo.add(jmi_elemDiagFlujoEliminarBoton);

        jmi_elemDiagFlCopiar.setText("Copiar");
        jmi_elemDiagFlCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_elemDiagFlCopiarActionPerformed(evt);
            }
        });
        jpum_elemDiagramaFlujo.add(jmi_elemDiagFlCopiar);

        jmi_elemDiagFlujoModificarFuente.setText("Modificar Fuente");
        jmi_elemDiagFlujoModificarFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_elemDiagFlujoModificarFuenteActionPerformed(evt);
            }
        });
        jpum_elemDiagramaFlujo.add(jmi_elemDiagFlujoModificarFuente);

        jmi_elemDiagFlujoEditarPropiedades.setText("Editar Propiedades");
        jmi_elemDiagFlujoEditarPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_elemDiagFlujoEditarPropiedadesActionPerformed(evt);
            }
        });
        jpum_elemDiagramaFlujo.add(jmi_elemDiagFlujoEditarPropiedades);

        jd_crearVariable.setTitle("Agregar Variable");
        jd_crearVariable.setMinimumSize(new java.awt.Dimension(350, 300));
        jd_crearVariable.setModal(true);
        jd_crearVariable.setResizable(false);

        jPanel3.setMinimumSize(new java.awt.Dimension(350, 300));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Tipo:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Nombre:");

        jcb_tipoNuevaVariable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "int", "char", "string", "short", "double", "boolean" }));

        jb_agregarVariable.setText("Agregar");
        jb_agregarVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregarVariableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_nombreNuevaVariable)
                            .addComponent(jcb_tipoNuevaVariable, 0, 175, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jb_agregarVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtf_nombreNuevaVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcb_tipoNuevaVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jb_agregarVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout jd_crearVariableLayout = new javax.swing.GroupLayout(jd_crearVariable.getContentPane());
        jd_crearVariable.getContentPane().setLayout(jd_crearVariableLayout);
        jd_crearVariableLayout.setHorizontalGroup(
            jd_crearVariableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_crearVariableLayout.setVerticalGroup(
            jd_crearVariableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_crearVariable.getAccessibleContext().setAccessibleDescription("");
        jd_crearVariable.getAccessibleContext().setAccessibleParent(this);

        jd_crearOperacion.setTitle("Operacion");
        jd_crearOperacion.setMinimumSize(new java.awt.Dimension(530, 160));
        jd_crearOperacion.setModal(true);
        jd_crearOperacion.setPreferredSize(new java.awt.Dimension(530, 160));

        jPanel4.setMinimumSize(new java.awt.Dimension(530, 150));
        jPanel4.setName(""); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(530, 150));

        jLabel10.setText("Variable 1");

        jLabel11.setText("Operacion");

        jLabel12.setText("Variable 2");

        jLabel13.setText("Resultado");

        jcb_crearOperacionVar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_crearOperacionVar1ActionPerformed(evt);
            }
        });

        jcb_crearOperacionOperador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "/", "*" }));

        jb_dialogCrearOperacion.setText("Crear");
        jb_dialogCrearOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_dialogCrearOperacionActionPerformed(evt);
            }
        });

        jb_dialogCrearOperacionModPropiedades.setText("Aceptar");
        jb_dialogCrearOperacionModPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_dialogCrearOperacionModPropiedadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jcb_crearOperacionVar1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel10)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jcb_crearOperacionOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_crearOperacionVar2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_crearOperacionResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel12)
                                .addGap(92, 92, 92)
                                .addComponent(jLabel13))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jb_dialogCrearOperacionModPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_dialogCrearOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_crearOperacionVar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_crearOperacionOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_crearOperacionVar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_crearOperacionResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_dialogCrearOperacion)
                    .addComponent(jb_dialogCrearOperacionModPropiedades))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_crearOperacionLayout = new javax.swing.GroupLayout(jd_crearOperacion.getContentPane());
        jd_crearOperacion.getContentPane().setLayout(jd_crearOperacionLayout);
        jd_crearOperacionLayout.setHorizontalGroup(
            jd_crearOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_crearOperacionLayout.setVerticalGroup(
            jd_crearOperacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );

        jd_crearOperacion.getAccessibleContext().setAccessibleParent(this);

        jd_crearIf.setTitle("Decision If");
        jd_crearIf.setMinimumSize(new java.awt.Dimension(390, 160));
        jd_crearIf.setModal(true);
        jd_crearIf.setPreferredSize(new java.awt.Dimension(390, 160));

        jPanel5.setMinimumSize(new java.awt.Dimension(530, 150));
        jPanel5.setName(""); // NOI18N

        jLabel14.setText("Variable 1");

        jLabel15.setText("Comparador");

        jLabel16.setText("Variable 2");

        jcb_crearIfVar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_crearIfVar1ActionPerformed(evt);
            }
        });

        jcb_crearIfComparador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", "!=", "<", ">" }));

        jb_dialogAgregarIf.setText("Agregar");
        jb_dialogAgregarIf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_dialogAgregarIfActionPerformed(evt);
            }
        });

        jb_dialogCrearIfModPropiedades.setText("Aceptar");
        jb_dialogCrearIfModPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_dialogCrearIfModPropiedadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jcb_crearIfVar1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14)
                                .addGap(54, 54, 54)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jcb_crearIfComparador, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_crearIfVar2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel16))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jb_dialogCrearIfModPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_dialogAgregarIf, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_crearIfVar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_crearIfComparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_crearIfVar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_dialogAgregarIf)
                    .addComponent(jb_dialogCrearIfModPropiedades))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_crearIfLayout = new javax.swing.GroupLayout(jd_crearIf.getContentPane());
        jd_crearIf.getContentPane().setLayout(jd_crearIfLayout);
        jd_crearIfLayout.setHorizontalGroup(
            jd_crearIfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearIfLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jd_crearIfLayout.setVerticalGroup(
            jd_crearIfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_crearFor.setTitle("Ciclo For");
        jd_crearFor.setMinimumSize(new java.awt.Dimension(400, 180));
        jd_crearFor.setModal(true);

        jPanel6.setMinimumSize(new java.awt.Dimension(390, 160));
        jPanel6.setName(""); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(390, 160));

        jb_dialogAgregarFor.setText("Agregar");
        jb_dialogAgregarFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_dialogAgregarForActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setText("; i");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("for ( int i =");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setText("; i");

        jcb_crearForComparador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< ", "> ", ">= ", "<= " }));

        jcb_crearForFactor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "++", "--" }));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setText(")");

        jtf_crearForLimite.setText("10");

        jtf_crearForInicio.setText("0");

        jLabel17.setText("Ejemplo:   for( int i = 0  ;  i < 10 ; i ++ )");

        jb_dialogCrearForModPropiedades.setText("Aceptar");
        jb_dialogCrearForModPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_dialogCrearForModPropiedadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_crearForInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcb_crearForComparador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_crearForLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcb_crearForFactor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jb_dialogCrearForModPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_dialogAgregarFor, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jcb_crearForComparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_crearForFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jtf_crearForLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_crearForInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_dialogAgregarFor)
                    .addComponent(jb_dialogCrearForModPropiedades))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_crearForLayout = new javax.swing.GroupLayout(jd_crearFor.getContentPane());
        jd_crearFor.getContentPane().setLayout(jd_crearForLayout);
        jd_crearForLayout.setHorizontalGroup(
            jd_crearForLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearForLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_crearForLayout.setVerticalGroup(
            jd_crearForLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jd_crearFor.getAccessibleContext().setAccessibleParent(this);

        jd_crearWhile.setTitle("Ciclo While");
        jd_crearWhile.setMinimumSize(new java.awt.Dimension(390, 160));
        jd_crearWhile.setModal(true);
        jd_crearWhile.setPreferredSize(new java.awt.Dimension(390, 160));

        jPanel7.setMinimumSize(new java.awt.Dimension(530, 150));
        jPanel7.setName(""); // NOI18N

        jLabel18.setText("Variable 1");

        jLabel19.setText("Comparador");

        jLabel20.setText("Variable 2");

        jcb_crearWhileVar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_crearWhileVar1ActionPerformed(evt);
            }
        });

        jcb_crearWhileComparador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<", ">", "<=", ">=" }));

        jb_dialogAgregarWhile.setText("Agregar");
        jb_dialogAgregarWhile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_dialogAgregarWhileActionPerformed(evt);
            }
        });

        jb_dialogCrearWhileModPropiedades.setText("Aceptar");
        jb_dialogCrearWhileModPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_dialogCrearWhileModPropiedadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jcb_crearWhileVar1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel18)
                                .addGap(54, 54, 54)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jcb_crearWhileComparador, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_crearWhileVar2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel20))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jb_dialogCrearWhileModPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_dialogAgregarWhile, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_crearWhileVar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_crearWhileComparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_crearWhileVar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_dialogAgregarWhile)
                    .addComponent(jb_dialogCrearWhileModPropiedades))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_crearWhileLayout = new javax.swing.GroupLayout(jd_crearWhile.getContentPane());
        jd_crearWhile.getContentPane().setLayout(jd_crearWhileLayout);
        jd_crearWhileLayout.setHorizontalGroup(
            jd_crearWhileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearWhileLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jd_crearWhileLayout.setVerticalGroup(
            jd_crearWhileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_crearSout.setTitle("Imprimir Variable");
        jd_crearSout.setMinimumSize(new java.awt.Dimension(310, 130));
        jd_crearSout.setModal(true);
        jd_crearSout.setResizable(false);

        jPanel8.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanel8.setName(""); // NOI18N
        jPanel8.setPreferredSize(new java.awt.Dimension(300, 100));

        jLabel25.setText("Variable a imprimir:");

        jcb_crearSoutVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_crearSoutVariableActionPerformed(evt);
            }
        });

        jb_dialogCrearSoutAgregar.setText("Agregar");
        jb_dialogCrearSoutAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_dialogCrearSoutAgregarActionPerformed(evt);
            }
        });

        jb_dialogCrearSoutModPropiedades.setText("Aceptar");
        jb_dialogCrearSoutModPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_dialogCrearSoutModPropiedadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jcb_crearSoutVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_dialogCrearSoutModPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_dialogCrearSoutAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_crearSoutVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_dialogCrearSoutAgregar)
                    .addComponent(jb_dialogCrearSoutModPropiedades))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_crearSoutLayout = new javax.swing.GroupLayout(jd_crearSout.getContentPane());
        jd_crearSout.getContentPane().setLayout(jd_crearSoutLayout);
        jd_crearSoutLayout.setHorizontalGroup(
            jd_crearSoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearSoutLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_crearSoutLayout.setVerticalGroup(
            jd_crearSoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_codigo.setMinimumSize(new java.awt.Dimension(600, 600));
        jd_codigo.setModal(true);
        jd_codigo.setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(550, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(550, 600));
        jPanel2.setVerifyInputWhenFocusTarget(false);

        jScrollPane5.setMinimumSize(new java.awt.Dimension(234, 100));
        jScrollPane5.setPreferredSize(new java.awt.Dimension(234, 100));

        jta_codigoGenerado.setEditable(false);
        jta_codigoGenerado.setColumns(20);
        jta_codigoGenerado.setRows(5);
        jScrollPane5.setViewportView(jta_codigoGenerado);

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 48)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CODIGO");

        jb_salirDialogCodigo.setText("Salir");
        jb_salirDialogCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salirDialogCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_salirDialogCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jb_salirDialogCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(288, 288, 288))
        );

        javax.swing.GroupLayout jd_codigoLayout = new javax.swing.GroupLayout(jd_codigo.getContentPane());
        jd_codigo.getContentPane().setLayout(jd_codigoLayout);
        jd_codigoLayout.setHorizontalGroup(
            jd_codigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );
        jd_codigoLayout.setVerticalGroup(
            jd_codigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );

        jd_modificarFuenteBoton.setTitle("Modificar Fuente");
        jd_modificarFuenteBoton.setMinimumSize(new java.awt.Dimension(290, 283));
        jd_modificarFuenteBoton.setModal(true);
        jd_modificarFuenteBoton.setPreferredSize(new java.awt.Dimension(290, 283));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Tipo de Fuente:");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Tamaño:");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText("Estilo:");

        jcb_tipoDeFuente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segoe UI", "Comic Sans MS", "Consolas", "Times New Roman" }));
        jcb_tipoDeFuente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_tipoDeFuenteItemStateChanged(evt);
            }
        });

        js_tamanioFuente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                js_tamanioFuenteStateChanged(evt);
            }
        });
        js_tamanioFuente.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                js_tamanioFuentePropertyChange(evt);
            }
        });

        jcb_estiloFuente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Negrita", "Italica" }));
        jcb_estiloFuente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_estiloFuenteItemStateChanged(evt);
            }
        });

        jtf_ejemploFuente.setText("Lorem ipsum dolor sit amet");

        jb_aceptarCambioFuente.setText("Aceptar");
        jb_aceptarCambioFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_aceptarCambioFuenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtf_ejemploFuente)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcb_tipoDeFuente, 0, 1, Short.MAX_VALUE)
                            .addComponent(jcb_estiloFuente, 0, 129, Short.MAX_VALUE)
                            .addComponent(js_tamanioFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jb_aceptarCambioFuente, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jcb_tipoDeFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(js_tamanioFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jcb_estiloFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jtf_ejemploFuente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_aceptarCambioFuente, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jd_modificarFuenteBotonLayout = new javax.swing.GroupLayout(jd_modificarFuenteBoton.getContentPane());
        jd_modificarFuenteBoton.getContentPane().setLayout(jd_modificarFuenteBotonLayout);
        jd_modificarFuenteBotonLayout.setHorizontalGroup(
            jd_modificarFuenteBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_modificarFuenteBotonLayout.setVerticalGroup(
            jd_modificarFuenteBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jmi_agregarPropiedad.setText("Agregar Propiedad");
        jpum_opcionesArbol.add(jmi_agregarPropiedad);

        jmi_agregarMetodo.setText("Agregar Metodo");
        jpum_opcionesArbol.add(jmi_agregarMetodo);

        jmi_eliminarPropiedad.setText("Eliminar Propiedad");
        jpum_opcionesArbol.add(jmi_eliminarPropiedad);

        jmi_eliminarMetodo.setText("Eliminar Metodo");
        jpum_opcionesArbol.add(jmi_eliminarMetodo);

        jmi_eliminarArbol.setText("Eliminar Arbol");
        jpum_opcionesArbol.add(jmi_eliminarArbol);

        jmi_cambiarNombreClase.setText("Cambiar Nombre Clase");
        jpum_opcionesArbol.add(jmi_cambiarNombreClase);

        jmi_cambiarNombreMetodo.setText("Cambiar Nombre Metodo");
        jpum_opcionesArbol.add(jmi_cambiarNombreMetodo);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jp_variables.setBackground(new java.awt.Color(204, 204, 255));
        jp_variables.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("VARIABLES");

        jScrollPane1.setViewportView(jl_variables);

        jb_mostrarDialogAgregarVariable.setText("Agregar Variable");
        jb_mostrarDialogAgregarVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mostrarDialogAgregarVariableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_variablesLayout = new javax.swing.GroupLayout(jp_variables);
        jp_variables.setLayout(jp_variablesLayout);
        jp_variablesLayout.setHorizontalGroup(
            jp_variablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_variablesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_variablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jp_variablesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jp_variablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_mostrarDialogAgregarVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_variablesLayout.setVerticalGroup(
            jp_variablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_variablesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_mostrarDialogAgregarVariable)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jp_diagramaOpciones.setBackground(new java.awt.Color(255, 204, 255));
        jp_diagramaOpciones.setMinimumSize(new java.awt.Dimension(1112, 137));

        jb_opcionesInicio.setForeground(new java.awt.Color(0, 0, 0));
        jb_opcionesInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/inicio.png"))); // NOI18N
        jb_opcionesInicio.setText("INICIO");
        jb_opcionesInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_opcionesInicio.setPreferredSize(new java.awt.Dimension(118, 118));
        jb_opcionesInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_opcionesInicioActionPerformed(evt);
            }
        });
        jp_diagramaOpciones.add(jb_opcionesInicio);

        jb_opcionesDeclarar.setForeground(new java.awt.Color(0, 0, 0));
        jb_opcionesDeclarar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/declarar.png"))); // NOI18N
        jb_opcionesDeclarar.setText("DECLARAR OP.");
        jb_opcionesDeclarar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_opcionesDeclarar.setPreferredSize(new java.awt.Dimension(118, 118));
        jb_opcionesDeclarar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_opcionesDeclararActionPerformed(evt);
            }
        });
        jp_diagramaOpciones.add(jb_opcionesDeclarar);

        jb_opcionesIf.setForeground(new java.awt.Color(0, 0, 0));
        jb_opcionesIf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/if.png"))); // NOI18N
        jb_opcionesIf.setText("IF");
        jb_opcionesIf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_opcionesIf.setPreferredSize(new java.awt.Dimension(118, 118));
        jb_opcionesIf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_opcionesIfActionPerformed(evt);
            }
        });
        jp_diagramaOpciones.add(jb_opcionesIf);

        jb_opcionesFor.setForeground(new java.awt.Color(0, 0, 0));
        jb_opcionesFor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/for.png"))); // NOI18N
        jb_opcionesFor.setText("FOR");
        jb_opcionesFor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_opcionesFor.setPreferredSize(new java.awt.Dimension(118, 118));
        jb_opcionesFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_opcionesForActionPerformed(evt);
            }
        });
        jp_diagramaOpciones.add(jb_opcionesFor);

        jb_opcionesWhile.setForeground(new java.awt.Color(0, 0, 0));
        jb_opcionesWhile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/while.png"))); // NOI18N
        jb_opcionesWhile.setText("WHILE");
        jb_opcionesWhile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_opcionesWhile.setPreferredSize(new java.awt.Dimension(118, 118));
        jb_opcionesWhile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_opcionesWhileActionPerformed(evt);
            }
        });
        jp_diagramaOpciones.add(jb_opcionesWhile);

        jb_opcionesSout.setForeground(new java.awt.Color(0, 0, 0));
        jb_opcionesSout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/sout.png"))); // NOI18N
        jb_opcionesSout.setText("S.O.U.T");
        jb_opcionesSout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_opcionesSout.setPreferredSize(new java.awt.Dimension(118, 118));
        jb_opcionesSout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_opcionesSoutActionPerformed(evt);
            }
        });
        jp_diagramaOpciones.add(jb_opcionesSout);

        jb_opcionesFin.setForeground(new java.awt.Color(0, 0, 0));
        jb_opcionesFin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/fin.png"))); // NOI18N
        jb_opcionesFin.setText("FIN");
        jb_opcionesFin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_opcionesFin.setPreferredSize(new java.awt.Dimension(118, 118));
        jb_opcionesFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_opcionesFinActionPerformed(evt);
            }
        });
        jp_diagramaOpciones.add(jb_opcionesFin);

        jb_opcionesConectorX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/x.png"))); // NOI18N
        jb_opcionesConectorX.setText("CONECTOR X");
        jb_opcionesConectorX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_opcionesConectorX.setPreferredSize(new java.awt.Dimension(118, 118));
        jb_opcionesConectorX.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jp_diagramaOpciones.add(jb_opcionesConectorX);

        jb_opcionesConectorY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/y.png"))); // NOI18N
        jb_opcionesConectorY.setText("CONECTOR Y");
        jb_opcionesConectorY.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_opcionesConectorY.setPreferredSize(new java.awt.Dimension(118, 118));
        jp_diagramaOpciones.add(jb_opcionesConectorY);

        jb_generarCodigoFlujo.setText("Generar Codigo");
        jb_generarCodigoFlujo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_generarCodigoFlujoActionPerformed(evt);
            }
        });

        jb_pegarElementoDiagramaFlujo.setText("Pegar");
        jb_pegarElementoDiagramaFlujo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_pegarElementoDiagramaFlujoActionPerformed(evt);
            }
        });

        jlp_diagramaFlujo.setBackground(new java.awt.Color(204, 255, 204));
        jlp_diagramaFlujo.setForeground(new java.awt.Color(255, 255, 255));
        jlp_diagramaFlujo.setOpaque(true);
        jScrollPane4.setViewportView(jlp_diagramaFlujo);
        jlp_diagramaFlujo.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout jp_DiagramaLayout = new javax.swing.GroupLayout(jp_Diagrama);
        jp_Diagrama.setLayout(jp_DiagramaLayout);
        jp_DiagramaLayout.setHorizontalGroup(
            jp_DiagramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_DiagramaLayout.createSequentialGroup()
                .addGroup(jp_DiagramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_diagramaOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_DiagramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_generarCodigoFlujo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_DiagramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jp_variables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_pegarElementoDiagramaFlujo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jp_DiagramaLayout.setVerticalGroup(
            jp_DiagramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_DiagramaLayout.createSequentialGroup()
                .addGroup(jp_DiagramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_DiagramaLayout.createSequentialGroup()
                        .addComponent(jp_diagramaOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4))
                    .addGroup(jp_DiagramaLayout.createSequentialGroup()
                        .addComponent(jp_variables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jb_pegarElementoDiagramaFlujo, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_generarCodigoFlujo, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
        );

        jtp_diagramaCodigo.addTab("Diagrama de Flujo", jp_Diagrama);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jt_arbolClasesGeneradas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jt_arbolClasesGeneradas.setForeground(new java.awt.Color(255, 255, 255));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Clases Generadas");
        jt_arbolClasesGeneradas.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(jt_arbolClasesGeneradas);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CLASES");

        jb_crearClase.setText("Crear Clase");
        jb_crearClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearClaseActionPerformed(evt);
            }
        });

        jb_definirHerencia.setText("Definir Herencia");

        jb_pegarClase.setText("Pegar");
        jb_pegarClase.setMaximumSize(new java.awt.Dimension(115, 23));
        jb_pegarClase.setMinimumSize(new java.awt.Dimension(115, 23));
        jb_pegarClase.setPreferredSize(new java.awt.Dimension(115, 23));

        jb_generarCodigoClases.setText("Generar Codigo");
        jb_generarCodigoClases.setMaximumSize(new java.awt.Dimension(115, 23));
        jb_generarCodigoClases.setMinimumSize(new java.awt.Dimension(115, 23));
        jb_generarCodigoClases.setPreferredSize(new java.awt.Dimension(115, 23));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_crearClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_definirHerencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_pegarClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_generarCodigoClases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jb_crearClase, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_definirHerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_generarCodigoClases, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_pegarClase, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jlp_diagramaClases.setBackground(new java.awt.Color(204, 255, 204));
        jlp_diagramaClases.setForeground(new java.awt.Color(255, 255, 255));
        jlp_diagramaClases.setOpaque(true);
        jScrollPane3.setViewportView(jlp_diagramaClases);

        javax.swing.GroupLayout jp_clasesLayout = new javax.swing.GroupLayout(jp_clases);
        jp_clases.setLayout(jp_clasesLayout);
        jp_clasesLayout.setHorizontalGroup(
            jp_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_clasesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1106, Short.MAX_VALUE)
                .addContainerGap())
        );
        jp_clasesLayout.setVerticalGroup(
            jp_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_clasesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jtp_diagramaCodigo.addTab("Diagrama de Clases", jp_clases);

        jm_principalArchivo.setText("Archivo");

        jMenuItem1.setText("Guardar");
        jm_principalArchivo.add(jMenuItem1);

        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jm_principalArchivo.add(jMenuItem2);

        jmi_archivoNuevo.setText("Nuevo");
        jm_principalArchivo.add(jmi_archivoNuevo);

        jmb_principal.add(jm_principalArchivo);

        jm_principalExportar.setText("Exportar");

        jmi_exportarPDF.setText("Exportar PDF");
        jm_principalExportar.add(jmi_exportarPDF);

        jmb_principal.add(jm_principalExportar);

        setJMenuBar(jmb_principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtp_diagramaCodigo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jtp_diagramaCodigo)
                .addContainerGap())
        );

        jtp_diagramaCodigo.getAccessibleContext().setAccessibleName("Diagrama");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jb_opcionesInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_opcionesInicioActionPerformed
        // BOTON INICIO
        boolean inicioExiste = false;
        for (JButton boton : botonesDiagramaFlujo) {
            if (boton instanceof BotonInicio) {
                JOptionPane.showMessageDialog(jlp_diagramaFlujo, "Solo puede existir 1\n"
                        + "inicio por programa");
                inicioExiste = true;
                break;
            }
        }

        if (!inicioExiste) {
            BotonInicio nuevoInicio = (BotonInicio) convertirABotonArrastrable(new BotonInicio());
            botonesDiagramaFlujo.add(nuevoInicio);
            llenarJLayeredPane(jlp_diagramaFlujo, botonesDiagramaFlujo);
            contBotonesInicio++;
            jlp_diagramaFlujo.repaint();
        }


    }//GEN-LAST:event_jb_opcionesInicioActionPerformed

    private void jb_generarCodigoFlujoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_generarCodigoFlujoActionPerformed

        //1. Añadir todas las lineas de codigo al jta basandose en el arraylist
        //2. mostrar la ventana con el texto lleno
        jd_codigo.setLocationRelativeTo(this);
        jta_codigoGenerado.setText("");

        jta_codigoGenerado.append("//Declaracion Variables\n");
        for (String variable : listaVariables) {
            String tipo = variable.split("\\)")[0].substring(1);
            String nombre = variable.split("\\)")[1];
            jta_codigoGenerado.append(tipo + " ");
            jta_codigoGenerado.append(nombre + " ;\n");
        }
        jta_codigoGenerado.append("\n\n");
        for (JButton boton : botonesDiagramaFlujo) {
            jta_codigoGenerado.append(boton.toString());
        }
        jd_codigo.setVisible(true);


    }//GEN-LAST:event_jb_generarCodigoFlujoActionPerformed

    private void jb_opcionesDeclararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_opcionesDeclararActionPerformed

        jb_dialogCrearOperacion.setVisible(true);
        jb_dialogCrearOperacionModPropiedades.setVisible(false);

        if (listaVariables.size() <= 0) {
            JOptionPane.showMessageDialog(this, "No hay variables");
        } else {

            jd_crearOperacion.setLocationRelativeTo(this);

            //limpiar cbs
            jcb_crearOperacionResultado.removeAllItems();
            jcb_crearOperacionVar1.removeAllItems();
            jcb_crearOperacionVar2.removeAllItems();

            //llenar cb
            for (String variable : listaVariables) {
                jcb_crearOperacionVar1.addItem(variable);
                jcb_crearOperacionVar2.addItem(variable);
                jcb_crearOperacionResultado.addItem(variable);
            }

            //actualizar cbs 
            jcb_crearOperacionVar1.repaint();
            jcb_crearOperacionVar2.repaint();
            jcb_crearOperacionResultado.repaint();

            // mostrar dialog de crear operacion
            jd_crearOperacion.setVisible(true);
        }


    }//GEN-LAST:event_jb_opcionesDeclararActionPerformed

    private void jb_mostrarDialogAgregarVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mostrarDialogAgregarVariableActionPerformed

        //mostrar ventana de agregar variable
        jd_crearVariable.setLocationRelativeTo(this);
        jd_crearVariable.setVisible(true);

    }//GEN-LAST:event_jb_mostrarDialogAgregarVariableActionPerformed

    private void jb_agregarVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregarVariableActionPerformed
        // AGREGAR VARIABLE
        // Crear String variable
        // Agregar a arrayList variables
        // actualizar modelo

        if (jtf_nombreNuevaVariable.getText().isBlank()) {
            JOptionPane.showMessageDialog(jd_crearVariable, "Llenar todos los campos");
        } else {
            String nuevaVariable = "("
                    + jcb_tipoNuevaVariable.getSelectedItem()
                    + ")"
                    + jtf_nombreNuevaVariable.getText();

            listaVariables.add(nuevaVariable);

            jtf_nombreNuevaVariable.setText("");
            jd_crearVariable.setVisible(false);
            llenarJList(jl_variables);
            jl_variables.repaint();

        }


    }//GEN-LAST:event_jb_agregarVariableActionPerformed

    private void jb_opcionesFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_opcionesFinActionPerformed
        // BOTON FIN

        boolean finExiste = false;
        for (JButton boton : botonesDiagramaFlujo) {
            if (boton instanceof BotonFin) {
                JOptionPane.showMessageDialog(jlp_diagramaFlujo, "Solo puede existir 1\n"
                        + "fin por programa");
                finExiste = true;
                break;
            }
        }

        if (!finExiste) {
            BotonFin nuevoFin = (BotonFin) convertirABotonArrastrable(new BotonFin());
            botonesDiagramaFlujo.add(nuevoFin);
            contBotonesFin++;
            llenarJLayeredPane(jlp_diagramaFlujo, botonesDiagramaFlujo);
            jlp_diagramaFlujo.repaint();
        }


    }//GEN-LAST:event_jb_opcionesFinActionPerformed

    private void jcb_crearOperacionVar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_crearOperacionVar1ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jcb_crearOperacionVar1ActionPerformed

    private void jb_dialogCrearOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_dialogCrearOperacionActionPerformed
        // CREAR NUEVA OPERACION
        //nuevo boton usando los datos del dialog
        BotonDeclararOperacion nuevaOperacion = (BotonDeclararOperacion) convertirABotonArrastrable(new BotonDeclararOperacion(
                (String) jcb_crearOperacionVar1.getSelectedItem(),
                (String) jcb_crearOperacionVar2.getSelectedItem(),
                (String) jcb_crearOperacionOperador.getSelectedItem(),
                (String) jcb_crearOperacionResultado.getSelectedItem()));

        botonesDiagramaFlujo.add(nuevaOperacion);
        llenarJLayeredPane(jlp_diagramaFlujo, botonesDiagramaFlujo);
        jlp_diagramaFlujo.repaint();
        jd_crearOperacion.setVisible(false);


    }//GEN-LAST:event_jb_dialogCrearOperacionActionPerformed

    private void jcb_crearIfVar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_crearIfVar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_crearIfVar1ActionPerformed

    private void jb_dialogAgregarIfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_dialogAgregarIfActionPerformed

        //nuevo boton If
        BotonIf nuevoIf = (BotonIf) convertirABotonArrastrable(new BotonIf(
                (String) jcb_crearIfVar1.getSelectedItem(),
                (String) jcb_crearIfComparador.getSelectedItem(),
                (String) jcb_crearIfVar2.getSelectedItem()));

        //añadir a lista
        botonesDiagramaFlujo.add(nuevoIf);

        //añadir al diagrama
        llenarJLayeredPane(jlp_diagramaFlujo, botonesDiagramaFlujo);
        jlp_diagramaFlujo.repaint();

        //esconder dialog
        jd_crearIf.setVisible(false);

    }//GEN-LAST:event_jb_dialogAgregarIfActionPerformed

    private void jb_opcionesIfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_opcionesIfActionPerformed
        // TODO add your handling code here:

        //botoncillo
        jb_dialogAgregarIf.setVisible(true);
        jb_dialogCrearIfModPropiedades.setVisible(false);

        if (listaVariables.size() >= 2) {
            jd_crearIf.setLocationRelativeTo(this);

            //limpiar cbs
            jcb_crearIfVar1.removeAllItems();
            jcb_crearIfVar2.removeAllItems();

            //llenar cbs
            for (String variable : listaVariables) {
                jcb_crearIfVar1.addItem(variable);
                jcb_crearIfVar2.addItem(variable);
            }

            jcb_crearIfVar1.repaint();
            jcb_crearIfVar2.repaint();

            jd_crearIf.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No hay suficiente variables");
        }
    }//GEN-LAST:event_jb_opcionesIfActionPerformed

    private void jb_dialogAgregarForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_dialogAgregarForActionPerformed
        //FUNCIONALIDAD AÑADIR FOR  

        //nuevo boton for
        BotonFor nuevoFor;
        nuevoFor = (BotonFor) convertirABotonArrastrable(
                new BotonFor(jtf_crearForInicio.getText(),
                        jtf_crearForLimite.getText(),
                        (String) jcb_crearForComparador.getSelectedItem(),
                        (String) jcb_crearForFactor.getSelectedItem()));

        //añadir a array
        botonesDiagramaFlujo.add(nuevoFor);

        //añadir a diagrama
        llenarJLayeredPane(jlp_diagramaFlujo, botonesDiagramaFlujo);
        jlp_diagramaFlujo.repaint();

        //esconder dialog
        jd_crearFor.setVisible(false);

    }//GEN-LAST:event_jb_dialogAgregarForActionPerformed

    private void jb_opcionesForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_opcionesForActionPerformed
        // MOSTRAR DIALOG CREAR FOR

        //confi botoncillos
        jb_dialogAgregarFor.setVisible(true);
        jb_dialogCrearForModPropiedades.setVisible(false);

        jd_crearFor.setLocationRelativeTo(this);
        jd_crearFor.setVisible(true);
    }//GEN-LAST:event_jb_opcionesForActionPerformed

    private void jcb_crearWhileVar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_crearWhileVar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_crearWhileVar1ActionPerformed

    private void jb_dialogAgregarWhileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_dialogAgregarWhileActionPerformed
        // Crear botonwhile nuevo
        BotonWhile nuevoWhile = (BotonWhile) convertirABotonArrastrable(new BotonWhile(
                (String) jcb_crearWhileVar1.getSelectedItem(),
                (String) jcb_crearWhileVar2.getSelectedItem(),
                (String) jcb_crearWhileComparador.getSelectedItem()));

        //añadir a lista
        botonesDiagramaFlujo.add(nuevoWhile);

        //añadir a diagrama
        llenarJLayeredPane(jlp_diagramaFlujo, botonesDiagramaFlujo);
        jlp_diagramaFlujo.repaint();

        //esconder dialog
        jd_crearWhile.setVisible(false);

    }//GEN-LAST:event_jb_dialogAgregarWhileActionPerformed

    private void jcb_crearSoutVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_crearSoutVariableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_crearSoutVariableActionPerformed

    private void jb_dialogCrearSoutAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_dialogCrearSoutAgregarActionPerformed
        // crear boton
        BotonSout nuevoSout = (BotonSout) convertirABotonArrastrable(new BotonSout(
                (String) jcb_crearSoutVariable.getSelectedItem()));

        botonesDiagramaFlujo.add(nuevoSout);

        llenarJLayeredPane(jlp_diagramaFlujo, botonesDiagramaFlujo);
        jlp_diagramaFlujo.repaint();

        jd_crearSout.setVisible(false);

    }//GEN-LAST:event_jb_dialogCrearSoutAgregarActionPerformed

    private void jb_opcionesSoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_opcionesSoutActionPerformed
        // mostrar dialog sout

        //botoncillos
        jb_dialogCrearSoutAgregar.setVisible(true);
        jb_dialogCrearSoutModPropiedades.setVisible(false);

        if (listaVariables.size() < 1) {
            JOptionPane.showMessageDialog(this, "No hay suficientes variables");

        } else {
            jd_crearSout.setLocationRelativeTo(this);
            jcb_crearSoutVariable.removeAllItems();
            for (String variable : listaVariables) {
                jcb_crearSoutVariable.addItem(variable);
            }
            jd_crearSout.setVisible(true);
        }

    }//GEN-LAST:event_jb_opcionesSoutActionPerformed

    private void jb_opcionesWhileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_opcionesWhileActionPerformed
        // TODO add your handling code here:
        //botoncillos
        jb_dialogAgregarWhile.setVisible(true);
        jb_dialogCrearWhileModPropiedades.setVisible(false);

        if (listaVariables.size() >= 2) {
            jd_crearIf.setLocationRelativeTo(this);
            //limpiar cbs
            jcb_crearWhileVar1.removeAllItems();
            jcb_crearWhileVar2.removeAllItems();
            //llenar cbs
            for (String variable : listaVariables) {
                jcb_crearWhileVar1.addItem(variable);
                jcb_crearWhileVar2.addItem(variable);
            }
            jcb_crearWhileVar1.repaint();
            jcb_crearWhileVar2.repaint();
            jd_crearWhile.setLocationRelativeTo(this);
            jd_crearWhile.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No hay suficiente variables");
        }
    }//GEN-LAST:event_jb_opcionesWhileActionPerformed

    private void jmi_elemDiagFljCambiarColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_elemDiagFljCambiarColorActionPerformed
        // Pop up Menu en diagrama Flujo - Cambiar Color

        for (JButton jButton : botonesDiagramaFlujo) {
            System.out.println(evt.getSource().toString());
            if (botonPop.equals(jButton)) {
                Color nuevoColor = JColorChooser.showDialog(this, "Color Boton", jButton.getBackground());

                if (nuevoColor != null) {
                    jButton.setBackground(nuevoColor);
                }
            }
        }
        llenarJLayeredPane(jlp_diagramaFlujo, botonesDiagramaFlujo);
        jlp_diagramaFlujo.repaint();

    }//GEN-LAST:event_jmi_elemDiagFljCambiarColorActionPerformed

    private void jpum_elemDiagramaFlujoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jpum_elemDiagramaFlujoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jpum_elemDiagramaFlujoAncestorAdded

    private void jmi_elemDiagFlujoEliminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_elemDiagFlujoEliminarBotonActionPerformed
        // eliminar boton
        //0 = yes
        //1 = no
        int index = -1;
        if (JOptionPane.showConfirmDialog(this, "Seguro?") == 0) {

            for (JButton boton : botonesDiagramaFlujo) {
                if (botonPop.equals(boton)) {
                    index = botonesDiagramaFlujo.indexOf(boton);
                    break;
                }
            }

            if (index != -1) {
                botonesDiagramaFlujo.remove(index);
                llenarJLayeredPane(jlp_diagramaFlujo, botonesDiagramaFlujo);
                jlp_diagramaFlujo.repaint();

                JOptionPane.showMessageDialog(this, "Boton eliminado.");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Boton no encontrado");
        }

    }//GEN-LAST:event_jmi_elemDiagFlujoEliminarBotonActionPerformed

    private void jmi_elemDiagFlCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_elemDiagFlCopiarActionPerformed
        // TODO add your handling code here:
        botonParaPegar = null;
        // JButton botonPop es el boton original

        if (botonPop instanceof BotonDeclararOperacion) {
            BotonDeclararOperacion copiaOperacion = (BotonDeclararOperacion) botonPop;
            BotonDeclararOperacion copiaOperacionNueva = new BotonDeclararOperacion(
                    copiaOperacion.getVariable1(),
                    copiaOperacion.getVariable2(),
                    copiaOperacion.getOperacion(),
                    copiaOperacion.getResultado());
            botonParaPegar = copiaOperacionNueva;
        } else if (botonPop instanceof BotonIf) {
            BotonIf copiaIf = (BotonIf) botonPop;
            BotonIf copiaIfNuevo = new BotonIf(
                    copiaIf.getVariable1(),
                    copiaIf.getComparador(),
                    copiaIf.getVariable2());
            botonParaPegar = copiaIfNuevo;
        } else if (botonPop instanceof BotonWhile) {
            BotonWhile copiaWhile = (BotonWhile) botonPop;
            BotonWhile copiaWhileNuevo = new BotonWhile(
                    copiaWhile.getVariable1(),
                    copiaWhile.getVariable2(),
                    copiaWhile.getComparador());
            botonParaPegar = copiaWhileNuevo;
        } else if (botonPop instanceof BotonFor) {
            BotonFor copiaFor = (BotonFor) botonPop;
            BotonFor copiaForNuevo = new BotonFor(
                    copiaFor.getInicio(),
                    copiaFor.getLimite(),
                    copiaFor.getComparador(),
                    copiaFor.getFactor());
            botonParaPegar = copiaForNuevo;
        } else if (botonPop instanceof BotonSout) {
            BotonSout copiaSout = (BotonSout) botonPop;
            BotonSout copiaSoutNuevo = new BotonSout(copiaSout.getVariable());
            botonParaPegar = copiaSoutNuevo;
        }

        botonParaPegar.setBounds(botonPop.getX() + 15, botonPop.getY() + 15, botonPop.getWidth(), botonPop.getHeight());
        botonParaPegar.setText(botonPop.getText());
        botonParaPegar.setIcon(botonPop.getIcon());
        botonParaPegar.setBackground(botonPop.getBackground());
        botonParaPegar.setHorizontalTextPosition(botonPop.getHorizontalTextPosition());

        //al final botonParaPegar debe tener todo
    }//GEN-LAST:event_jmi_elemDiagFlCopiarActionPerformed

    private void jb_pegarElementoDiagramaFlujoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_pegarElementoDiagramaFlujoActionPerformed
        // añadir botonParaPegar
        if (botonParaPegar != null) {

            botonesDiagramaFlujo.add(convertirABotonArrastrable(botonParaPegar));
            llenarJLayeredPane(jlp_diagramaFlujo, botonesDiagramaFlujo);
            jlp_diagramaFlujo.repaint();
            botonParaPegar = null;
        }


    }//GEN-LAST:event_jb_pegarElementoDiagramaFlujoActionPerformed

    private void jb_salirDialogCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirDialogCodigoActionPerformed
        // TODO add your handling code here:
        jd_codigo.setVisible(false);
    }//GEN-LAST:event_jb_salirDialogCodigoActionPerformed

    private void jmi_elemDiagFlujoModificarFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_elemDiagFlujoModificarFuenteActionPerformed
        // Actualizar componente de jd_ModFuente
        // Mostrar jd_modFuente

        Font fuenteActual = botonPop.getFont();
        jcb_tipoDeFuente.setSelectedItem(fuenteActual.getFontName());
        js_tamanioFuente.setValue(fuenteActual.getSize());
        jcb_estiloFuente.setSelectedIndex(fuenteActual.getStyle());

        jd_modificarFuenteBoton.setLocationRelativeTo(this);
        jd_modificarFuenteBoton.setVisible(true);


    }//GEN-LAST:event_jmi_elemDiagFlujoModificarFuenteActionPerformed

    private void jcb_tipoDeFuenteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_tipoDeFuenteItemStateChanged
        // state changed tipo de fuente, modificar jtf ejemplo
        Font fuente = new Font(
                (String) jcb_tipoDeFuente.getSelectedItem(),
                jcb_estiloFuente.getSelectedIndex(),
                (int) js_tamanioFuente.getValue());

        jtf_ejemploFuente.setFont(fuente);
        jtf_ejemploFuente.repaint();
    }//GEN-LAST:event_jcb_tipoDeFuenteItemStateChanged

    private void js_tamanioFuentePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_js_tamanioFuentePropertyChange


    }//GEN-LAST:event_js_tamanioFuentePropertyChange

    private void js_tamanioFuenteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_js_tamanioFuenteStateChanged
        // cambiar tamaño de fuente en el jtf ejemplo
        Font fuenteActual = jtf_ejemploFuente.getFont();
        int tamañoNuevo = (int) js_tamanioFuente.getValue();
        Font fuenteNueva = fuenteActual.deriveFont((float) tamañoNuevo);
        jtf_ejemploFuente.setFont(fuenteNueva);
        jtf_ejemploFuente.repaint();
    }//GEN-LAST:event_js_tamanioFuenteStateChanged

    private void jcb_estiloFuenteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_estiloFuenteItemStateChanged
        // cambia estilo de fuente del ejemplo

        Font fuenteActual = jtf_ejemploFuente.getFont();
        Font fuenteNueva = fuenteActual.deriveFont(jcb_estiloFuente.getSelectedIndex());
        jtf_ejemploFuente.setFont(fuenteNueva);
        jtf_ejemploFuente.repaint();

    }//GEN-LAST:event_jcb_estiloFuenteItemStateChanged

    private void jb_aceptarCambioFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_aceptarCambioFuenteActionPerformed
        // setear fuente del ejemplo al boton
        botonPop.setFont(jtf_ejemploFuente.getFont());
        jd_modificarFuenteBoton.setVisible(false);

    }//GEN-LAST:event_jb_aceptarCambioFuenteActionPerformed

    private void jmi_elemDiagFlujoEditarPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_elemDiagFlujoEditarPropiedadesActionPerformed
        // identificar tipo de boton
        // llenar dialog correspondiento con sus propiedades
        // pasar todos los nuevos campos al boton

        if (botonPop instanceof BotonDeclararOperacion) {
            //crear boton clase correcta para acceder a los getters
            BotonDeclararOperacion botonTemp = (BotonDeclararOperacion) botonPop;

            //setear elementos a los datos correctos
            jcb_crearOperacionVar1.setSelectedItem(botonTemp.getVariable1());
            jcb_crearOperacionVar2.setSelectedItem(botonTemp.getVariable2());
            jcb_crearOperacionResultado.setSelectedItem(botonTemp.getResultado());
            jcb_crearOperacionOperador.setSelectedItem(botonTemp.getOperacion());

            //mostrar boton
            jb_dialogCrearOperacionModPropiedades.setVisible(true);
            jb_dialogCrearOperacion.setVisible(false);

            //mostrar dialog
            jd_crearOperacion.setVisible(true);

        } else if (botonPop instanceof BotonIf) {
            //mostrar boton
            jb_dialogAgregarIf.setVisible(false);
            jb_dialogCrearIfModPropiedades.setVisible(true);

            //actualizar datos
            BotonIf botonTemp = (BotonIf) botonPop;
            jcb_crearIfVar1.setSelectedItem(botonTemp.getVariable1());
            jcb_crearIfVar2.setSelectedItem(botonTemp.getVariable2());
            jcb_crearIfComparador.setSelectedItem(botonTemp.getComparador());

            //mostrar dialog
            jd_crearIf.setVisible(true);

        } else if (botonPop instanceof BotonFor) {
            //mostrar boton
            jb_dialogCrearForModPropiedades.setVisible(true);
            jb_dialogAgregarFor.setVisible(false);

            //actualizar datos
            BotonFor botonTemp = (BotonFor) botonPop;
            jcb_crearForComparador.setSelectedItem(botonTemp.getComparador());
            jcb_crearForFactor.setSelectedItem(botonTemp.getFactor());
            jtf_crearForInicio.setText(botonTemp.getInicio());
            jtf_crearForLimite.setText(botonTemp.getLimite());

            //mostrar dialog
            jd_crearFor.setVisible(true);

        } else if (botonPop instanceof BotonWhile) {
            //mostrar boton
            jb_dialogAgregarWhile.setVisible(false);
            jb_dialogCrearWhileModPropiedades.setVisible(true);

            //actualizar datos
            BotonWhile botonTemp = (BotonWhile) botonPop;
            jcb_crearWhileVar1.setSelectedItem((String) botonTemp.getVariable1());
            jcb_crearWhileVar2.setSelectedItem((String) botonTemp.getVariable2());
            jcb_crearWhileComparador.setSelectedItem((String) botonTemp.getComparador());

            //mostrar dialog
            jd_crearWhile.setVisible(true);

        } else if (botonPop instanceof BotonSout) {
            //mostrar boton
            jb_dialogCrearSoutAgregar.setVisible(false);
            jb_dialogCrearSoutModPropiedades.setVisible(true);

            //actualizar datos
            BotonSout botonTemp = (BotonSout) botonPop;
            jcb_crearSoutVariable.setSelectedItem(botonTemp.getVariable());

            //mostrar dialog
            jd_crearSout.setVisible(true);
        }


    }//GEN-LAST:event_jmi_elemDiagFlujoEditarPropiedadesActionPerformed

    private void jb_dialogCrearOperacionModPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_dialogCrearOperacionModPropiedadesActionPerformed
        // TODO add your handling code here:

        //castear botonPop
        BotonDeclararOperacion botontemp = (BotonDeclararOperacion) botonPop;

        //setear propiedades
        botontemp.setVariable1((String) jcb_crearOperacionVar1.getSelectedItem());
        botontemp.setVariable2((String) jcb_crearOperacionVar2.getSelectedItem());
        botontemp.setOperacion((String) jcb_crearOperacionOperador.getSelectedItem());
        botontemp.setResultado((String) jcb_crearOperacionResultado.getSelectedItem());
        botontemp.setText(
                (String) jcb_crearOperacionVar1.getSelectedItem(),
                (String) jcb_crearOperacionVar2.getSelectedItem(),
                (String) jcb_crearOperacionOperador.getSelectedItem(),
                (String) jcb_crearOperacionResultado.getSelectedItem());

        jd_crearOperacion.setVisible(false);

        llenarJLayeredPane(jlp_diagramaFlujo, botonesDiagramaFlujo);
        jlp_diagramaFlujo.repaint();
    }//GEN-LAST:event_jb_dialogCrearOperacionModPropiedadesActionPerformed

    private void jb_dialogCrearIfModPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_dialogCrearIfModPropiedadesActionPerformed
        // mod propiedades boton if

        //castear botonPop
        BotonIf botonTemp = (BotonIf) botonPop;

        //asiganar datos
        botonTemp.setVariable1((String) jcb_crearIfVar1.getSelectedItem());
        botonTemp.setVariable2((String) jcb_crearIfVar2.getSelectedItem());
        botonTemp.setComparador((String) jcb_crearIfComparador.getSelectedItem());
        botonTemp.setText(
                (String) jcb_crearIfVar1.getSelectedItem(),
                (String) jcb_crearIfComparador.getSelectedItem(),
                (String) jcb_crearIfVar2.getSelectedItem());

        //ocultar dialog
        jd_crearIf.setVisible(false);

        //actualizar panel
        llenarJLayeredPane(jlp_diagramaFlujo, botonesDiagramaFlujo);
        jlp_diagramaFlujo.repaint();
    }//GEN-LAST:event_jb_dialogCrearIfModPropiedadesActionPerformed

    private void jb_dialogCrearForModPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_dialogCrearForModPropiedadesActionPerformed
        // mod propiedades boton for

        //castear botonPop
        BotonFor botonTemp = (BotonFor) botonPop;

        //asignar datos
        botonTemp.setComparador((String) jcb_crearForComparador.getSelectedItem());
        botonTemp.setFactor((String) jcb_crearForFactor.getSelectedItem());
        botonTemp.setInicio(jtf_crearForInicio.getText());
        botonTemp.setLimite(jtf_crearForLimite.getText());
        botonTemp.setText(
                jtf_crearForInicio.getText(),
                jtf_crearForLimite.getText(),
                (String) jcb_crearForComparador.getSelectedItem(),
                (String) jcb_crearForFactor.getSelectedItem());

        //ocultar dialog
        jd_crearFor.setVisible(false);

        //actualizar panel
        llenarJLayeredPane(jlp_diagramaFlujo, botonesDiagramaFlujo);
        jlp_diagramaFlujo.repaint();
    }//GEN-LAST:event_jb_dialogCrearForModPropiedadesActionPerformed

    private void jb_dialogCrearWhileModPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_dialogCrearWhileModPropiedadesActionPerformed
        //mod propiedades boton while
        //caster boton
        BotonWhile botonTemp = (BotonWhile) botonPop;

        //asignar datos
        botonTemp.setVariable1((String) jcb_crearWhileVar1.getSelectedItem());
        botonTemp.setVariable2((String) jcb_crearWhileVar2.getSelectedItem());
        botonTemp.setComparador((String) jcb_crearWhileComparador.getSelectedItem());
        botonTemp.setText(
                (String) jcb_crearWhileVar1.getSelectedItem(),
                (String) jcb_crearWhileVar2.getSelectedItem(),
                (String) jcb_crearWhileComparador.getSelectedItem());

        //ocultar dialog
        jd_crearWhile.setVisible(false);

        //actualizar panel
        llenarJLayeredPane(jlp_diagramaFlujo, botonesDiagramaFlujo);
        jlp_diagramaFlujo.repaint();
    }//GEN-LAST:event_jb_dialogCrearWhileModPropiedadesActionPerformed

    private void jb_dialogCrearSoutModPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_dialogCrearSoutModPropiedadesActionPerformed
        // mod propiedades boton sout

        //catear boton
        BotonSout botonTemp = (BotonSout) botonPop;

        //asignar datos
        botonTemp.setVariable((String) jcb_crearSoutVariable.getSelectedItem());
        botonTemp.setText((String) jcb_crearSoutVariable.getSelectedItem());

        //ocultar dialog
        jd_crearSout.setVisible(false);

        //actualizar panel
        llenarJLayeredPane(jlp_diagramaFlujo, botonesDiagramaFlujo);
        jlp_diagramaFlujo.repaint();
    }//GEN-LAST:event_jb_dialogCrearSoutModPropiedadesActionPerformed

    private void jb_crearClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearClaseActionPerformed
        String nombreNuevaClase = JOptionPane.showInputDialog("Nombre de la nueva clase:");

        // meter a arbol principal
        // agregarNodoClaseAlArbolPrincipal(nombreNuevaClase, jt_arbolClasesGeneradas);
        // nuevo arbol arrastrable y pasar a arreglo
        JTree nuevoArbol = crearArbolArrastrable(new NodoClase(nombreNuevaClase));
        listaArboles.add(nuevoArbol);

        // actualizar panel
        llenarJLayeredPane(jlp_diagramaClases, listaArboles);

        //recargar arbol principal
        actualizarArbolPrincipal(jt_arbolClasesGeneradas, listaArboles);

        // repaints
        jt_arbolClasesGeneradas.revalidate();
        jt_arbolClasesGeneradas.repaint();
        jlp_diagramaClases.revalidate();
        jlp_diagramaClases.repaint();
    }//GEN-LAST:event_jb_crearClaseActionPerformed

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
            java.util.logging.Logger.getLogger(jFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFPrincipal().setVisible(true);
            }
        });
    }

    public JList llenarJList(JList lista) {
        DefaultListModel modeloLista = new DefaultListModel();

        for (String variable : listaVariables) {
            modeloLista.addElement(variable);
        }

        //jtf_nombreNuevaVariable.setText("");
        //jd_crearVariable.setVisible(false);
        lista.setModel(modeloLista);

        return lista;

    }

    public JLayeredPane llenarJLayeredPane(JLayeredPane panel, ArrayList lista) {
        panel.removeAll();
        for (Object objeto : lista) {
            panel.add((Component) objeto);
        }

        return panel;
    }

    //convertir boton arrastrable
    public JButton convertirABotonArrastrable(JButton boton) {

        final Point[] ubicacionClick = new Point[1];

        boton.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {

                if (e.getButton() == 3) {
                    botonPop = null;
                    botonPop = boton;
                    if (boton instanceof BotonInicio || boton instanceof BotonFin) {
                        //ya que inicio y fin no tienen propiedades y tampoco se pueden repetir
                        //se desahabilitan las opciones correspondientes
                        jmi_elemDiagFlCopiar.setEnabled(false);
                        jmi_elemDiagFlujoEditarPropiedades.setEnabled(false);

                    } else {
                        jmi_elemDiagFlCopiar.setEnabled(true);
                        jmi_elemDiagFlujoEditarPropiedades.setEnabled(true);
                    }
                    jpum_elemDiagramaFlujo.show(e.getComponent(), e.getX(), e.getY());

                }
            }

            public void mousePressed(MouseEvent e) {
                ubicacionClick[0] = e.getPoint();

            }
        });

        boton.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // pos actual
                int thisX = boton.getLocation().x;
                int thisY = boton.getLocation().y;

                // cuanto se mueve
                int xMoved = e.getX() - ubicacionClick[0].x;
                int yMoved = e.getY() - ubicacionClick[0].y;

                // setear nueva ubicacion
                int newX = thisX + xMoved;
                int newY = thisY + yMoved;
                boton.setLocation(newX, newY);
            }
        });

        return boton;
    }

    public JTree convertirAArbolArrastrable(JTree arbol) {

        final Point[] ubicacionClick = new Point[1];  //forma concisa de guardar x y y

        arbol.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {

                //mostrar opciones del pop up dependiento de en que nodo se desplego 
                if (e.getButton() == 3) { //evento para mostrar el popupmenu
                    arbolPop = null;
                    arbolPop = arbol; //guarda el arbol seleccionado para poder usarlo en cualquier lado

                    //activar todos los botones
                    jmi_agregarPropiedad.setEnabled(true);
                    jmi_agregarMetodo.setEnabled(true);
                    jmi_eliminarPropiedad.setEnabled(true);
                    jmi_eliminarMetodo.setEnabled(true);
                    jmi_eliminarArbol.setEnabled(true);
                    jmi_cambiarNombreClase.setEnabled(true);
                    jmi_cambiarNombreMetodo.setEnabled(true);

                    //si no hay nada seleccionado o la raiz esta selecionada
                    if (arbolPop.getSelectionPath() == null
                            || arbolPop.getSelectionPath().getLastPathComponent() instanceof NodoClase) {
                        System.out.println("instance of nodoclase");
                        //activar y desactivar botones correspondientes
                        jmi_eliminarPropiedad.setEnabled(false);
                        jmi_eliminarMetodo.setEnabled(false);
                        jmi_cambiarNombreMetodo.setEnabled(false);

                    } //si esta selecionado una propiedad
                    else if (arbolPop.getSelectionPath().getLastPathComponent() instanceof Propiedad) {
                        //activar y desactivar botones correspondientes
                        jmi_eliminarMetodo.setEnabled(false);
                        jmi_cambiarNombreMetodo.setEnabled(false);
                    }//si esta seleccionado un metodo 
                    else if (arbolPop.getSelectionPath().getLastPathComponent() instanceof Metodo) {
                        //desactivar opciones
                        jmi_eliminarPropiedad.setEnabled(false);
                    }

                    jpum_opcionesArbol.show(e.getComponent(), e.getX(), e.getY());

                }
            }

            public void mousePressed(MouseEvent e) {
                ubicacionClick[0] = e.getPoint();

            }
        });

        arbol.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // pos actual
                int thisX = arbol.getLocation().x;
                int thisY = arbol.getLocation().y;

                // cuanto se mueve
                int xMoved = e.getX() - ubicacionClick[0].x;
                int yMoved = e.getY() - ubicacionClick[0].y;

                // setear nueva ubicacion
                int newX = thisX + xMoved;
                int newY = thisY + yMoved;
                arbol.setLocation(newX, newY);
            }
        });

        return arbol;
    }

    private void agregarNodoClaseAlArbolPrincipal(String nombreClase, JTree arbol) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) arbol.getModel().getRoot();
        NodoClase nuevaClase = new NodoClase(nombreClase);
        raiz.add(nuevaClase);

        // Recargar el modelo del árbol
        DefaultTreeModel modelo = (DefaultTreeModel) arbol.getModel();
        modelo.reload(raiz);
    }

    private JTree crearArbolArrastrable(NodoClase nodoRaiz) {
        JTree nuevoArbol = convertirAArbolArrastrable(new JTree(nodoRaiz));
        JScrollPane scroll = new JScrollPane(nuevoArbol);
        nuevoArbol.setBounds(100, 100, 170, 200);
        return nuevoArbol;
    }

    private void actualizarArbolPrincipal(JTree arbolPrincipal, ArrayList<JTree> listaArboles) {
        // raiz principal
        DefaultMutableTreeNode raizPrincipal = (DefaultMutableTreeNode) arbolPrincipal.getModel().getRoot();

        // limpiar
        raizPrincipal.removeAllChildren();

        // cargar clases a la raiz
        for (JTree arbol : listaArboles) {

            DefaultMutableTreeNode raizDelArbol = (DefaultMutableTreeNode) arbol.getModel().getRoot();

            raizPrincipal.add(raizDelArbol);
        }

        //actualizar vistar
        DefaultTreeModel modeloPrincipal = (DefaultTreeModel) arbolPrincipal.getModel();
        modeloPrincipal.reload(raizPrincipal);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jb_aceptarCambioFuente;
    private javax.swing.JButton jb_agregarVariable;
    private javax.swing.JButton jb_crearClase;
    private javax.swing.JButton jb_definirHerencia;
    private javax.swing.JButton jb_dialogAgregarFor;
    private javax.swing.JButton jb_dialogAgregarIf;
    private javax.swing.JButton jb_dialogAgregarWhile;
    private javax.swing.JButton jb_dialogCrearForModPropiedades;
    private javax.swing.JButton jb_dialogCrearIfModPropiedades;
    private javax.swing.JButton jb_dialogCrearOperacion;
    private javax.swing.JButton jb_dialogCrearOperacionModPropiedades;
    private javax.swing.JButton jb_dialogCrearSoutAgregar;
    private javax.swing.JButton jb_dialogCrearSoutModPropiedades;
    private javax.swing.JButton jb_dialogCrearWhileModPropiedades;
    private javax.swing.JButton jb_generarCodigoClases;
    private javax.swing.JButton jb_generarCodigoFlujo;
    private javax.swing.JButton jb_mostrarDialogAgregarVariable;
    private javax.swing.JButton jb_opcionesConectorX;
    private javax.swing.JButton jb_opcionesConectorY;
    private javax.swing.JButton jb_opcionesDeclarar;
    private javax.swing.JButton jb_opcionesFin;
    private javax.swing.JButton jb_opcionesFor;
    private javax.swing.JButton jb_opcionesIf;
    private javax.swing.JButton jb_opcionesInicio;
    private javax.swing.JButton jb_opcionesSout;
    private javax.swing.JButton jb_opcionesWhile;
    private javax.swing.JButton jb_pegarClase;
    private javax.swing.JButton jb_pegarElementoDiagramaFlujo;
    private javax.swing.JButton jb_salirDialogCodigo;
    private javax.swing.JComboBox<String> jcb_crearForComparador;
    private javax.swing.JComboBox<String> jcb_crearForFactor;
    private javax.swing.JComboBox<String> jcb_crearIfComparador;
    private javax.swing.JComboBox<String> jcb_crearIfVar1;
    private javax.swing.JComboBox<String> jcb_crearIfVar2;
    private javax.swing.JComboBox<String> jcb_crearOperacionOperador;
    private javax.swing.JComboBox<String> jcb_crearOperacionResultado;
    private javax.swing.JComboBox<String> jcb_crearOperacionVar1;
    private javax.swing.JComboBox<String> jcb_crearOperacionVar2;
    private javax.swing.JComboBox<String> jcb_crearSoutVariable;
    private javax.swing.JComboBox<String> jcb_crearWhileComparador;
    private javax.swing.JComboBox<String> jcb_crearWhileVar1;
    private javax.swing.JComboBox<String> jcb_crearWhileVar2;
    private javax.swing.JComboBox<String> jcb_estiloFuente;
    private javax.swing.JComboBox<String> jcb_tipoDeFuente;
    private javax.swing.JComboBox<String> jcb_tipoNuevaVariable;
    private javax.swing.JDialog jd_codigo;
    private javax.swing.JDialog jd_crearFor;
    private javax.swing.JDialog jd_crearIf;
    private javax.swing.JDialog jd_crearOperacion;
    private javax.swing.JDialog jd_crearSout;
    private javax.swing.JDialog jd_crearVariable;
    private javax.swing.JDialog jd_crearWhile;
    private javax.swing.JDialog jd_modificarFuenteBoton;
    private javax.swing.JList<String> jl_variables;
    private javax.swing.JLayeredPane jlp_diagramaClases;
    private javax.swing.JLayeredPane jlp_diagramaFlujo;
    private javax.swing.JMenu jm_principalArchivo;
    private javax.swing.JMenu jm_principalExportar;
    private javax.swing.JMenuBar jmb_principal;
    private javax.swing.JMenuItem jmi_agregarMetodo;
    private javax.swing.JMenuItem jmi_agregarPropiedad;
    private javax.swing.JMenuItem jmi_archivoNuevo;
    private javax.swing.JMenuItem jmi_cambiarNombreClase;
    private javax.swing.JMenuItem jmi_cambiarNombreMetodo;
    private javax.swing.JMenuItem jmi_elemDiagFlCopiar;
    private javax.swing.JMenuItem jmi_elemDiagFljCambiarColor;
    private javax.swing.JMenuItem jmi_elemDiagFlujoEditarPropiedades;
    private javax.swing.JMenuItem jmi_elemDiagFlujoEliminarBoton;
    private javax.swing.JMenuItem jmi_elemDiagFlujoModificarFuente;
    private javax.swing.JMenuItem jmi_eliminarArbol;
    private javax.swing.JMenuItem jmi_eliminarMetodo;
    private javax.swing.JMenuItem jmi_eliminarPropiedad;
    private javax.swing.JMenuItem jmi_exportarPDF;
    private javax.swing.JPanel jp_Diagrama;
    private javax.swing.JPanel jp_clases;
    private javax.swing.JPanel jp_diagramaOpciones;
    private javax.swing.JPanel jp_variables;
    private javax.swing.JPopupMenu jpum_elemDiagramaFlujo;
    private javax.swing.JPopupMenu jpum_opcionesArbol;
    private javax.swing.JSpinner js_tamanioFuente;
    private javax.swing.JTree jt_arbolClasesGeneradas;
    private javax.swing.JTextArea jta_codigoGenerado;
    private javax.swing.JTextField jtf_crearForInicio;
    private javax.swing.JTextField jtf_crearForLimite;
    private javax.swing.JTextField jtf_ejemploFuente;
    private javax.swing.JTextField jtf_nombreNuevaVariable;
    private javax.swing.JTabbedPane jtp_diagramaCodigo;
    // End of variables declaration//GEN-END:variables
    private ArrayList<JButton> botonesDiagramaFlujo = new ArrayList();
    private ArrayList<String> listaVariables = new ArrayList();
    private ArrayList<JTree> listaArboles = new ArrayList();
    private int contBotonesInicio = 0;
    private int contBotonesFin = 0;
    private JButton botonPop; //se carga el boton para las opciones de popup menu
    private JButton botonParaPegar;
    private JTree arbolPop;
}
