import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonDemo extends JFrame implements ActionListener {

    private JRadioButton bird, cat, dog, rabbit, pig;
    private JLabel imageLabel;

    public RadioButtonDemo() {

        setTitle("RadioButtonDemo");
        setSize(600, 400);
        setLocationRelativeTo(null); // center screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Radio Buttons
        bird = new JRadioButton("Bird");
        cat = new JRadioButton("Cat");
        dog = new JRadioButton("Dog");
        rabbit = new JRadioButton("Rabbit");
        pig = new JRadioButton("Pig");

        // Grouping
        ButtonGroup group = new ButtonGroup();
        group.add(bird);
        group.add(cat);
        group.add(dog);
        group.add(rabbit);
        group.add(pig);

        // Panel for radio buttons
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(5, 1));
        radioPanel.add(bird);
        radioPanel.add(cat);
        radioPanel.add(dog);
        radioPanel.add(rabbit);
        radioPanel.add(pig);

        // Image display
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        // Add action listeners
        bird.addActionListener(this);
        cat.addActionListener(this);
        dog.addActionListener(this);
        rabbit.addActionListener(this);
        pig.addActionListener(this);

        add(radioPanel, BorderLayout.WEST);
        add(imageLabel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String selectedPet = "";

        if (bird.isSelected()) {
            selectedPet = "Bird";
            imageLabel.setIcon(new ImageIcon("BIRD IMMAGE.jpg"));
        } 
        else if (cat.isSelected()) {
            selectedPet = "Cat";
            imageLabel.setIcon(new ImageIcon("CAT IMmAGE.jpg"));
        } 
        else if (dog.isSelected()) {
            selectedPet = "Dog";
            imageLabel.setIcon(new ImageIcon("DOG IMMAGE.jpg"));
        } 
        else if (rabbit.isSelected()) {
            selectedPet = "Rabbit";
            imageLabel.setIcon(new ImageIcon("RABBIT IMMAGE.jpg"));
        } 
        else if (pig.isSelected()) {
            selectedPet = "Pig";
            imageLabel.setIcon(new ImageIcon("PIG IMMAGE.jpg"));
        }

        JOptionPane.showMessageDialog(this, 
            "You selected: " + selectedPet);
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}