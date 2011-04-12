import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class CalculatorInterface extends JFrame implements ActionListener
{
	private CalculatorFunctions calculator;
	
	private JMenu arithmeticMenu;
		private JMenuItem addMenuItem, subtractMenuItem, multiplyMenuItem, divideMenuItem, modMenuItem, exitMenuItem;
	private JMenu exponentialMenu;
		private JMenuItem powerMenuItem, squareRootMenuItem, logMenuItem,lnMenuItem;
	private JMenu trigMenu;
		private JMenuItem trigInstructionMenuItem, sinMenuItem, cosMenuItem, tanMenuItem, cotMenuItem, secMenuItem, cscMenuItem;
	private JMenu probabilityMenu;
		private JMenuItem factorialMenuItem, nCrMenuItem, nPrMenuItem;
	private JMenu exitMenu;	

	public CalculatorInterface()
	{
		super("Calculator");
		
		arithmeticMenu = new JMenu("Arithmetic");
		exponentialMenu = new JMenu("Exponential Functions");
		trigMenu = new JMenu("Trigonometric Functions");
		probabilityMenu = new JMenu("Probability");
		exitMenu = new JMenu("Exit");
		
		addMenuItem = new JMenuItem("Add");
		subtractMenuItem = new JMenuItem("Subtract");
		multiplyMenuItem = new JMenuItem("Multiply");
		divideMenuItem = new JMenuItem("Divide");
		modMenuItem = new JMenuItem("Modular (Number1 mod Number2)");
		
		powerMenuItem = new JMenuItem("Power (Number1^Number2)");
		squareRootMenuItem = new JMenuItem("Square Root (Number 1 is argument)");
		logMenuItem = new JMenuItem("Logarithm (Number 1 is argument, Number 2 is base)");
		lnMenuItem = new JMenuItem("Natural Logarithm (Number 1 is argument)");
		
		trigInstructionMenuItem = new JMenuItem("Note: Number 1 is argument");
		sinMenuItem = new JMenuItem("Sine");
		cosMenuItem = new JMenuItem("Cosine");
		tanMenuItem = new JMenuItem("Tangent");
		cotMenuItem = new JMenuItem("Cotangent");
		secMenuItem = new JMenuItem("Secant");
		cscMenuItem = new JMenuItem("Cosecant");
		
		factorialMenuItem = new JMenuItem("Factorial");
		nPrMenuItem = new JMenuItem("Permutations");
		nCrMenuItem = new JMenuItem("Combinations");
		
		exitMenuItem = new JMenuItem("Exit Calculator");
		
		arithmeticMenu.add(addMenuItem);
		arithmeticMenu.add(subtractMenuItem);
		arithmeticMenu.add(multiplyMenuItem);
		arithmeticMenu.add(divideMenuItem);
		arithmeticMenu.add(modMenuItem);
		
		exponentialMenu.add(powerMenuItem);
		exponentialMenu.add(squareRootMenuItem);
		exponentialMenu.add(logMenuItem);
		exponentialMenu.add(lnMenuItem);
		
		trigMenu.add(trigInstructionMenuItem);
		trigMenu.addSeparator();
		trigMenu.add(sinMenuItem);
		trigMenu.add(cosMenuItem);
		trigMenu.add(tanMenuItem);
		trigMenu.add(cotMenuItem);
		trigMenu.add(secMenuItem);
		trigMenu.add(cscMenuItem);
		
		probabilityMenu.add(factorialMenuItem);
		probabilityMenu.add(nPrMenuItem);
		probabilityMenu.add(nCrMenuItem);

		exitMenu.add(exitMenuItem);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(arithmeticMenu);
		menuBar.add(exponentialMenu);
		menuBar.add(trigMenu);
		menuBar.add(probabilityMenu);
		menuBar.add(exitMenu);
		
		for(int i = 0; i<menuBar.getMenuCount();i++)
		{
			JMenu currentMenu1 = menuBar.getMenu(i);
			for(int j = 0; j<currentMenu1.getItemCount();j++)
			{
				JMenuItem currentItem = currentMenu1.getItem(j);
				if(currentItem != null)
				{
					currentItem.addActionListener(this);
				}
			}
		}
		
		setJMenuBar(menuBar);
		
		calculator = new CalculatorFunctions();
		getContentPane().add(calculator);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == addMenuItem)
		{
			calculator.add();
		}
		
		if(e.getSource() == subtractMenuItem)
		{
			calculator.subtract();
		}
		
		if(e.getSource() == multiplyMenuItem)
		{
			calculator.multiply();
		}
		
		if(e.getSource() == divideMenuItem)
		{
			calculator.divide();
		}
		
		if(e.getSource() == modMenuItem)
		{
			calculator.mod();
		}
		
		if(e.getSource() == powerMenuItem)
		{
			calculator.power();
		}
		
		if(e.getSource() == squareRootMenuItem)
		{
			calculator.squareRoot();
		}
		
		if(e.getSource() == logMenuItem)
		{
			calculator.log();
		}
		
		if(e.getSource() == lnMenuItem)
		{
			calculator.ln();
		}
		
		if(e.getSource() == sinMenuItem)
		{
			calculator.sin();
		}
		
		if(e.getSource() == cosMenuItem)
		{
			calculator.cos();
		}
		
		if(e.getSource() == tanMenuItem)
		{
			calculator.tan();
		}
		
		if(e.getSource() == cotMenuItem)
		{
			calculator.cot();
		}
		
		if(e.getSource() == secMenuItem)
		{
			calculator.sec();
		}
		
		if(e.getSource() == cscMenuItem)
		{
			calculator.csc();
		}
		
		if(e.getSource() == factorialMenuItem)
		{
			calculator.factorial();
		}
		
		if(e.getSource() == nPrMenuItem)
		{
			calculator.nPr();
		}
		
		if (e.getSource() == nCrMenuItem)
		{
			calculator.nCr();
		}
		
		if(e.getSource() == exitMenuItem)
		{
			dispose();
			System.exit(0);
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		CalculatorInterface cf = new CalculatorInterface();
		cf.show();
	}

}
