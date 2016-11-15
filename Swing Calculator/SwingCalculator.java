package swing.calculator;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingCalculator extends JFrame{
    
    JButton but1, but2, but3, but4, but5, but6, but7, but8, but9, but0, butPlus,
            butMinus, butMultiply, butDivide, clearAll, butEquals;
    JTextField textResult;
    double num1=0, num2=0, result=0;
    int operator;
    
    public static void main(String[] args){
        
        new SwingCalculator();
    
    }
    
    public SwingCalculator(){
        
        this.setSize(400,400);
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("Calculator");
		
	JPanel thePanel = new JPanel();
        setGridBagLayout(thePanel);
        
        this.add(thePanel);
	this.setVisible(true);
    
    } // END OF SwingCalculator CONSTRUCTOR
    
    public void setGridBagLayout(JPanel panel) {
        
        panel.setLayout(new GridBagLayout());
        
        GridBagConstraints gridConstraints = new GridBagConstraints();
	gridConstraints.gridx = 1;
	gridConstraints.gridy = 1;
        gridConstraints.gridwidth = 1;
	gridConstraints.gridheight = 1;
        gridConstraints.weightx = 50;
	gridConstraints.weighty = 100;
        gridConstraints.insets = new Insets(5,5,5,5);
	gridConstraints.anchor = GridBagConstraints.CENTER;
        gridConstraints.fill = GridBagConstraints.BOTH;
        
        textResult = new JTextField();
        textResult.setColumns(20);
	Font font = new Font("Helvetica", Font.PLAIN, 18);
        textResult.setFont(font);
        
        ListenForButton lForButton = new ListenForButton();
	
        but1 = new JButton("1");
        but1.addActionListener(lForButton);
        
	but2 = new JButton("2");
        but2.addActionListener(lForButton);
        
	but3 = new JButton("3");
        but3.addActionListener(lForButton);
        
	but4 = new JButton("4");
        but4.addActionListener(lForButton);
        
	but5 = new JButton("5");
        but5.addActionListener(lForButton);
	
        but6 = new JButton("6");
	but6.addActionListener(lForButton);
        
        but7 = new JButton("7");
        but7.addActionListener(lForButton);
	
        but8 = new JButton("8");
	but8.addActionListener(lForButton);
        
        but9 = new JButton("9");
        but9.addActionListener(lForButton);
        
        but0 = new JButton("0");
        but0.addActionListener(lForButton);
	
        butPlus = new JButton("+");
        butPlus.addActionListener(lForButton);
        
	butMinus = new JButton("-");
        butMinus.addActionListener(lForButton);
        
        butMultiply = new JButton("*");
        butMultiply.addActionListener(lForButton);
        
        butDivide = new JButton("/");
        butDivide.addActionListener(lForButton);
        
        butEquals = new JButton("=");
        butEquals.addActionListener(lForButton);
        
	clearAll = new JButton("C");
        clearAll.addActionListener(lForButton);
        
	
        panel.add(clearAll,gridConstraints);
	gridConstraints.gridwidth = 20;
	gridConstraints.gridx = 5;
	panel.add(textResult,gridConstraints);
	gridConstraints.gridwidth = 1;
	gridConstraints.gridx = 1;
	gridConstraints.gridy = 2;
	panel.add(but1,gridConstraints);
	gridConstraints.gridx = 5;
	panel.add(but2,gridConstraints);
	gridConstraints.gridx = 9;
	panel.add(but3,gridConstraints);
	gridConstraints.gridx = 1;
	gridConstraints.gridy = 3;
	panel.add(but4,gridConstraints);
	gridConstraints.gridx = 5;
	panel.add(but5,gridConstraints);
	gridConstraints.gridx = 9;
	panel.add(but6,gridConstraints);
	gridConstraints.gridx = 1;
	gridConstraints.gridy = 4;
	panel.add(but7,gridConstraints);
	gridConstraints.gridx = 5;
	panel.add(but8,gridConstraints);
	gridConstraints.gridx = 9;
	panel.add(but9,gridConstraints);
	gridConstraints.gridx = 1;
	gridConstraints.gridy = 5;
	panel.add(but0,gridConstraints);
	gridConstraints.gridx = 5;
	panel.add(butPlus,gridConstraints);
	gridConstraints.gridx = 9;
	panel.add(butMinus,gridConstraints);
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 6;
        panel.add(butDivide, gridConstraints);
        gridConstraints.gridx = 5;
        panel.add(butMultiply, gridConstraints);
        gridConstraints.gridx = 9;
        panel.add(butEquals, gridConstraints);
        
    
    }
    
    private class ListenForButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource() == but1) {
                textResult.setText(textResult.getText().concat("1"));
            }
            if(e.getSource() == but2) {
                textResult.setText(textResult.getText().concat("2"));
            }
            if(e.getSource() == but3) {
                textResult.setText(textResult.getText().concat("3"));
            }
            if(e.getSource() == but4) {
                textResult.setText(textResult.getText().concat("4"));
            }
            if(e.getSource() == but5) {
                textResult.setText(textResult.getText().concat("5"));
            }
            if(e.getSource() == but6) {
                textResult.setText(textResult.getText().concat("6"));
            }
            if(e.getSource() == but7) {
                textResult.setText(textResult.getText().concat("7"));
            }
            if(e.getSource() == but8) {
                textResult.setText(textResult.getText().concat("8"));
            }
            if(e.getSource() == but9) {
                textResult.setText(textResult.getText().concat("9"));
            }
            if(e.getSource() == but0) {
                textResult.setText(textResult.getText().concat("0"));
            }
            
            if(e.getSource() == butPlus) {
                num1 = Double.parseDouble(textResult.getText());
                operator = 1;
                textResult.setText("");
            }
            if(e.getSource() == butMinus) {
                num1 = Double.parseDouble(textResult.getText());
                operator = 2;
                textResult.setText("");
            }
            if(e.getSource() == butMultiply) {
                num1 = num1 = Double.parseDouble(textResult.getText());
                operator = 3;
                textResult.setText("");
            }
            if(e.getSource() == butDivide) {
                num1 = num1 = Double.parseDouble(textResult.getText());
                operator = 4;
                textResult.setText("");
            }
            
            if(e.getSource() == butEquals) {
                num2 = Double.parseDouble(textResult.getText());
                switch(operator) {
                    case 1:
                        result = num1 + num2;
                        break;
                    case 2:
                        result = num1 - num2;
                        break;
                    case 3:
                        result = num1 * num2;
                        break;
                    case 4:
                        result = num1 / num2;
                        break;
                }
                textResult.setText("" + result);
            }
            
            if(e.getSource() == clearAll) {
                textResult.setText("");
                num1 = 0;
                num2 = 0;
            }
              
        }
        
    }
	
} // END OF SwingCalculator CLASS