package checkbox;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Checkbox extends JFrame implements ActionListener{

    JPanel p1,p2,p3;
    JButton bRaz,bstate;
    JCheckBox c_circle,c_triangle,c_square;
    public Checkbox(){
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        bRaz = new JButton("RAZ");
        bstate = new JButton("STATE");
        c_circle =new JCheckBox("CIRCLE");
        c_triangle =new JCheckBox("TRAINGLE");
        c_square =new JCheckBox("SQUARE");
        this.add(p1,BorderLayout.NORTH);
        this.add(p2,BorderLayout.CENTER);
        this.add(p3,BorderLayout.SOUTH);
        p1.add(bRaz,BorderLayout.CENTER);
        p2.setLayout(new GridLayout(1,3));
        p2.add(c_circle);
        p2.add(c_triangle);
        p2.add(c_square);
        p3.add(bstate,BorderLayout.CENTER);
        p1.setBackground(Color.BLACK);
        p2.setBackground(Color.BLUE);
        p3.setBackground(Color.ORANGE);
        bRaz.addActionListener(this);
        bstate.addActionListener(this);
        c_circle.addActionListener(this);
        c_triangle.addActionListener(this);
        c_square.addActionListener(this);
        this.setTitle("Checkbox");
        this.setVisible(true);
        this.setSize(400,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//exit ot close
        this.setLocationRelativeTo(null);//open in the center of th screen
        this.setResizable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==bstate){//if the user click on bstate button
            if (c_circle.isSelected()){
                System.out.println("cirecle is selected");
            }
            if (c_triangle.isSelected()){
                System.out.println("triangle is selected");
            }
            if (c_square.isSelected()){
                System.out.println("square is selected");
            }
        }
        if (e.getSource()==bRaz){
            c_circle.setSelected(false);
            c_triangle.setSelected(false);
            c_square.setSelected(false);
        }
    }
}
