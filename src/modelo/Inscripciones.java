/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;

/**
 *
 * @author LN710Q
 */
public class Inscripciones extends JFrame {
    
public JLabel lblN_Inscripcion,lblNombre,lblEdad,lblPropietario,lblexistencia,lblRaza;

public JComboBox Nombre;

ButtonGroup existencia  = new ButtonGroup();
public JRadioButton no;
public JRadioButton si;
public JTable resultados;

public JPanel table;

public JButton create, insert, delete, update, search;


    
}
