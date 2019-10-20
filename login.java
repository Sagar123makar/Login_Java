import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class NextPage extends JFrame
 {
   NextPage()
  {
  setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
  setTitle("Welcome");
  setSize(400, 200);
   }


class Login extends JFrame implements ActionListener{
	JButton Submit;
	JPanel panel;
	JLabel label1, label2;
	final JTextField text1, text2;

	Login(){
		label1= new JLabel();
		label2= new JLabel();

		label1.setText("Username");
		label2.setText("Password");

		text1= new JTextField(15);
		text2= new JPasswordField(15);

		Submit= new JButton();
		panel= new JPanel(new GridLayout(3,1));
		panel.add(label1);
		panel.add(label2);
		panel.add(text1);
		panel.add(text2);
		panel.add(Submit);
		add(panel, BorderLayout.CENTER);
		Submit.addActionListener(this);
		setTitle("LOGIN FORM");
	}

	public void actionPerformed(ActionEvent ae){
		String value1= text1.getText();
		String value2= text2.getText();
		if (value1.equals("I am Hero.") && value2.equals("Yes")){
			NextPage page=new NextPage();
			page.setVisible(true);
			JLabel label=new JLabel("Hero you are welcomed.");
			page.getContentPane().add(label);
		}
		else{
			System.out.println("Enter 'I am Hero.' and 'Yes'. Try it!!! ");
			JOptionPane.showMessageDialog(this, "Incorrect login or Password.", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	class LoginOpen{
		public void main(String args[]){
			try{
				Login frame= new Login();
				frame.setSize(300,100);
				frame.setVisible(true);
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
	}
}
}
