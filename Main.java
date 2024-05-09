import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {

    public static final int MARGIN_DEFUALT = 5;

    public static void main(String[] args) {


        Random random = new Random();
        JFrame myWindow = new JFrame();
        JPanel panel = new JPanel();
        myWindow.setSize(600,400);
        myWindow.setLocationRelativeTo(null);
        myWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myWindow.setTitle("Windows 12");
        myWindow.setVisible(true);
        myWindow.setLayout(null);
        JButton button = new JButton();
        button.setText("Check");
        button.setBounds(100,100,200,50);
        //JTextField textField = new JTextField();
        //JTextArea text = new JTextArea("Hello");

        button.addActionListener((event)->myWindow.add(null));
                //button.setText("Clicked"),
                ;


        panel.setLayout(new FlowLayout(FlowLayout.CENTER,10 , 5));

        JCheckBox checkBox = new JCheckBox("Yellow");
        panel.add(checkBox);
        panel.add(button);
        myWindow.add(button);

        /*
        myWindow.setBackground(Color.black);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,5) );
        panel.setBackground(Color.RED);
        myWindow.add(panel,BorderLayout.CENTER);*/
/*
        JButton button = new JButton();
        button.setText("No");

        button.setBounds(225,300,80,50);
        myWindow.add(button);
        JButton button2 = new JButton();
        button2.setText("Yes");
        button2.setBounds(button.getX()+button.getWidth()+ MARGIN_DEFUALT,button.getY(),button.getWidth(),button.getHeight());
       // button.setBounds(200,200,50,50);

        myWindow.add(button2);

        JButton button4 = addButton(button);

        myWindow.add(button4);

        JTextField textField = new JTextField();
        JTextArea text = new JTextArea("Hello");
        myWindow.add(text);
        textField.setVisible(true);

        textField.setBounds(50,50,100,100);

       button2.addActionListener((event) ->
                button.setVisible((!button.isVisible())));

       button.addActionListener((event) -> myWindow.add(textField));
            //button2.setVisible(!button2.isVisible()));

*/



    }

    public static JButton addButton(JButton button)
    {
        int index = 0;
        JButton buttonToAdd = new JButton();
        buttonToAdd.setText("Button "+index);
        buttonToAdd.setBounds(button.getX()-button.getWidth()- MARGIN_DEFUALT,button.getY(),button.getWidth(),button.getHeight());
       // buttonToAdd.setBounds(100,100,50,50);


        return buttonToAdd;

    }

}