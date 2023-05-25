package Ejemplo84;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;

    public VentanaPrincipal() {
        super("Ejemplo de Ventana con Botones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Crear el contenedor
        Container contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());

        // Crear los botones
        boton1 = new JButton("Cilindro");
        boton2 = new JButton("Pirámide");
        boton3 = new JButton("Esfera");
        boton4= new JButton("Cubo");

        // Agregar el ActionListener a los botones
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        boton4.addActionListener(this);

        // Agregar los botones al contenedor
        contenedor.add(boton1);
        contenedor.add(boton2);
        contenedor.add(boton3);
        contenedor.add(boton4);
    }

    public void actionPerformed(ActionEvent e) {
        // Manejar los eventos de acción de los botones
        if (e.getSource() == boton1) {
            VentanaCilindro ventanaCilindro = new VentanaCilindro();
            ventanaCilindro.setVisible(true);
        } else if (e.getSource() == boton2) {
            VentanaPiramide ventanaPiramide = new VentanaPiramide();
            ventanaPiramide.setVisible(true);
        } else if (e.getSource() == boton3) {
            VentanaEsfera ventanaEsfera = new VentanaEsfera();
            ventanaEsfera.setVisible(true);
        }else if (e.getSource() == boton4) {
            VentanaCubo ventanaCubo = new VentanaCubo();
            ventanaCubo.setVisible(true);
        }
    }

    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
}
