import javax.swing.*;
import java.awt.*;


@SuppressWarnings("serial")
public class CalculatorFunctions extends JPanel
{
	private JTextField number1TextField;
	private JTextField number2TextField;
	private JLabel solutionLabel;
	
	public CalculatorFunctions()
	{
		super(new GridLayout(3,2));
		number1TextField = new JTextField(10);
		number2TextField = new JTextField(10);
		solutionLabel = new JLabel();
		
		add(new JLabel("Number 1:"));
		add(number1TextField);
		add(new JLabel("Number 2:"));
		add(number2TextField);
		add(new JLabel("Solution:"));
		add(solutionLabel);
	}

	public void add()
	{
		int number1 = Integer.parseInt(number1TextField.getText());
		int number2 = Integer.parseInt(number2TextField.getText());
		int solution = number1 + number2;
		
		solutionLabel.setText("" + solution);
	}
	
	public void subtract()
	{
		int number1 = Integer.parseInt(number1TextField.getText());
		int number2 = Integer.parseInt(number2TextField.getText());
		int solution = number1 - number2;
		
		solutionLabel.setText("" + solution);
	}
	
	public void multiply()
	{
		int number1 = Integer.parseInt(number1TextField.getText());
		int number2 = Integer.parseInt(number2TextField.getText());
		int solution = number1 * number2;
		
		solutionLabel.setText("" + solution);
	}
	
	public void divide()
	{
		int number1 = Integer.parseInt(number1TextField.getText());
		int number2 = Integer.parseInt(number2TextField.getText());
		double solution = (double) number1 / number2;
			
		solutionLabel.setText("" + solution);
	}
	
	public void mod()
	{
		int number1 = Integer.parseInt(number1TextField.getText());
		int number2 = Integer.parseInt(number2TextField.getText());
		int solution = number1%number2;
			
		solutionLabel.setText("" + solution);
	}
	
	public void power()
	{
		int number1 = Integer.parseInt(number1TextField.getText());
		int number2 = Integer.parseInt(number2TextField.getText());
		double solution = Math.pow(number1, number2);
			
		solutionLabel.setText("" + solution);
	}
	
	public void squareRoot()
	{
		int number1 = Integer.parseInt(number1TextField.getText());
		double solution = Math.sqrt(number1);
		
		solutionLabel.setText("" + solution);
	}
	
	public void log()
	{
		int number1 = Integer.parseInt(number1TextField.getText());
		int number2 = Integer.parseInt(number2TextField.getText());
		double solution = Math.log(number1)/Math.log(number2);
		
		solutionLabel.setText("" + solution);
	}
	
	public void ln()
	{
		int number1 = Integer.parseInt(number1TextField.getText());
		double solution = Math.log(number1);
		
		solutionLabel.setText("" + solution);
	}
	
	public void sin()
	{
		int number1 = Integer.parseInt(number1TextField.getText());
		double solution = (double) Math.sin(number1);
			
		solutionLabel.setText("" + solution);
	}
	
	public void cos()
	{
		int number1 = Integer.parseInt(number1TextField.getText());
		double solution = (double) Math.cos(number1);
			
		solutionLabel.setText("" + solution);
	}
	
	public void tan()
	{
		int number1 = Integer.parseInt(number1TextField.getText());
		double solution = (double) Math.tan(number1);
			
		solutionLabel.setText("" + solution);
	}
	
	public void cot()
	{
		int number1 = Integer.parseInt(number1TextField.getText());
		double solution = (double) 1/Math.tan(number1);
			
		solutionLabel.setText("" + solution);
	}
	
	public void sec()
	{
		int number1 = Integer.parseInt(number1TextField.getText());
		double solution = (double) 1/Math.cos(number1);
			
		solutionLabel.setText("" + solution);
	}
	
	public void csc()
	{
		int number1 = Integer.parseInt(number1TextField.getText());
		double solution = (double) 1/Math.sin(number1);
			
		solutionLabel.setText("" + solution);
	}
	
	public static long factorialCalculation(int n)
	{
		if(n < 0)
			return (Long) null;
		if(n == 0)
			return (long) 1;
		if(n > 0)
			return n*factorialCalculation(n-1);
		return 1;
	}
	
	public void factorial()
	{
		int number1 = Integer.parseInt(number1TextField.getText());
		long solution = factorialCalculation(number1);
		
		solutionLabel.setText("" + solution);
		 
	}
	
	public void nPr()
	{
		int number1 = Integer.parseInt(number1TextField.getText());
		int number2 = Integer.parseInt(number2TextField.getText());
		long solution = factorialCalculation(number1)/factorialCalculation(number1 - number2);
		
		solutionLabel.setText("" + solution);
	}
	
	public void nCr()
	{
		int number1 = Integer.parseInt(number1TextField.getText());
		int number2 = Integer.parseInt(number2TextField.getText());
		long solution = factorialCalculation(number1)/(factorialCalculation(number1 - number2)*factorialCalculation(number2));
		
		solutionLabel.setText("" + solution);
	}


}
