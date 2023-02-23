import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Lab 3");
        JPanel root = new JPanel();
        root.setLayout(new GridLayout(1, 2));


        JPanel content = new JPanel();
        //content.setLayout(new BorderLayout());
        content.setLayout(new GridLayout(2, 1));
        root.add(content);

        JPanel empty_panel = new JPanel();
        root.add(empty_panel);


        JTextField input_panel = new JTextField();
        //input_panel.setPreferredSize(new Dimension(125, 10));
        //input_panel.setBounds(0,0,125,40);

        content.add(input_panel);






        JPanel calculator = new JPanel();


        ArrayList<String> string = new ArrayList<>();

        for (Integer i = 1; i < 10; i++){
            JButton button = new JButton(String.valueOf(i));
            Integer finalI = i;
            button.addActionListener(e -> {
                input_panel.setText(String.valueOf(finalI));

            });
            calculator.add(button);
        }
        JButton C_button = new JButton("C");
        C_button.addActionListener(e -> {
            input_panel.setText("");
        });
        calculator.add(C_button);


        JButton zero_button = new JButton(String.valueOf(0));
        zero_button.addActionListener(e -> {
            input_panel.setText("0");
        });
        calculator.add(zero_button);


        JButton plus_button = new JButton("+");
        plus_button.addActionListener(e -> {
            input_panel.setText("+");
        });
        calculator.add(plus_button);



        for (Integer i = 0; i < 3; i++){
            JButton button = new JButton();
            button.setVisible(false);

            calculator.add(button);

        }


        calculator.setLayout(new GridLayout(5, 3));
        input_panel.setBounds(0,40,125,200);

        content.add(calculator);


        /**
        JPanel empty_box = new JPanel();
        empty_box.setPreferredSize(new Dimension(125, 10));
        content.add(empty_box);**/








        //calculator.setLayout(new BorderLayout());


        frame.setSize(270, 285);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //frame.setLayout(null);
        frame.getContentPane().add(root);

    }
}