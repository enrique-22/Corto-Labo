package modelo;

import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LN710Q
 */
public class Inscripciones extends JFrame {
    
public JLabel lblN_Inscripcion,lblNombre,lblEdad,lblPropietario,lblexistencia,lblRaza;

public JTextField Inscripcion,Edad,Propietario,raza;
        
public JComboBox Nombre;

ButtonGroup existencia  = new ButtonGroup();
public JRadioButton no;
public JRadioButton si;
public JTable resultados;

public JPanel table;

public JButton  create, insert, delete, update, search,clean;

private static final  int ANCHOC = 130, ALTOC = 30;

DefaultTableModel tm;

public Inscripciones(){
    
super ("Inscripciones");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(null);
agregarLabels();
formulario();
llenarTabla();
Container container = getContentPane();
container.add(lblN_Inscripcion);
container.add(lblNombre);
container.add(lblEdad);
container.add(lblPropietario);
container.add(lblexistencia);
container.add(lblRaza);
container.add(si);
container.add(no);
container.add(create);
container.add(insert);
container.add(delete);
container.add(update);
container.add(search);
container.add(clean);
container.add(table);
setSize(600,600);
eventos();




}

    private void agregarLabels() {
        lblN_Inscripcion = new JLabel("Inscripcion");
        lblNombre = new JLabel("Nombre");
        lblEdad = new JLabel("Edad");
        lblPropietario = new JLabel("Propietario");
        lblexistencia = new JLabel("Existencia");
        lblRaza = new JLabel("Raza");
        lblN_Inscripcion.setBounds(10,10, ANCHOC,ALTOC);
        lblNombre.setBounds(10,30,ANCHOC, ALTOC);
        lblEdad.setBounds(10,40, ANCHOC, ALTOC);
        lblPropietario.setBounds(10, 50, ANCHOC, ALTOC);
        lblexistencia.setBounds(10, 60, ANCHOC, ALTOC);
        lblRaza.setBounds(10, 80, ANCHOC,ALTOC);
        
    }

    private void formulario() {
       Inscripcion = new JTextField();
       Edad = new JTextField();
       Propietario = new JTextField();
       
       si = new JRadioButton("si",true);
       no = new JRadioButton("no");
       resultados = new JTable();
       create = new JButton("create");
       insert =  new JButton("insert");
       delete = new JButton("delete");
       update = new JButton("update");
       search = new JButton("search");
       clean = new JButton("clean");
       
       Inscripcion.setBounds(140,10,ANCHOC,ALTOC);
       Edad.setBounds(140,60,ANCHOC,ALTOC);
       Propietario.setBounds(140,100,ANCHOC,ALTOC);
       si.setBounds(140,140,40, ALTOC);
       no.setBounds(210,140,40,ALTOC);
       
       create.setBounds(300,10,ANCHOC,ALTOC);
       insert.setBounds(20,210,ANCHOC,ALTOC);
       delete.setBounds(150,210,ANCHOC,ALTOC);
       update.setBounds(140,210,ANCHOC,ALTOC);
       search.setBounds(150,210,ANCHOC,ALTOC);
       clean.setBounds(170,210,ANCHOC,ALTOC);
       resultados = new JTable();
       table.setBounds(10,250,500,200);
       table.add(new JScrollPane(resultados));
       
    }

    private void llenarTabla() {
        tm = new DefaultTableModel(){
            public Class<?> getColumnaClass(int column){
                switch(column){
                    case 0:
                        return String.class;
                    case 1:
                        return String.class;
                    case 2:
                        return String.class;
                    default:
                
                return Boolean.class;
                }
            }
            
             private void eventos() {
             };

