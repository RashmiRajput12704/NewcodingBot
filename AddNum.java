import java.awt.*;
import java.awt.event.*;
public class AddNum extends Frame implements ActionListener
{
	Label lblfn,lblsn;
	TextField txtfn,txtsn,txtres;
	Button btnadd;
	public AddNum(String title)
	{
		super(title);
		lblfn=new Lable("FirstNo");
		lblsn=new Lable("SecondNo");
		btnadd=new Button("Add");
		txtfn=new TextField(50);
		txtsn=new TextField(50);
		txtres=new TextField(50);
		setLayout(null);
		lblfn.setBounds(100,100,100,50);
		txtfn.setBounds(300,100,100,50);
		lblsn.setBounds(100,250,100,50);
		txtsn.setBounds(300,250,100,50);
		btnadd.setBounds(100,400,100,50);
		txtres.setBounds(300,400,100,50);
		add(lblfn);
		add(txtfn);
		add(lblsn);
		add(txtsn);
		add(btnadd);
		add(txtres);
		btnadd.addActionListener(this);
			addWindowListener(new X());
	}
 		class X extends WindowAdapter
		 {

			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		 }
		public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSourse()==btnadd)
				{
					int a= Integer.parseInt(txtfn.getText());
					int b= Integer.parseInt(txtsn.getText());
					int c= a+b;
					txtres.setText(""+c);
				}
				
			}
		public static void main(String args[])
			{
				AddNum addnum=new AddNum("Add 2 numbers");
				addnum.setSize(800,800);
				addnum.setVisible(true);
			}
}