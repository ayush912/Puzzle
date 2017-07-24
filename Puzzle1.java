
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Puzzle1 implements ActionListener
{
	JButton b[];
	JButton bt;
	
	Puzzle1()
	{
		int i;
		JFrame f = new JFrame("Puzzle");
		b = new JButton[9];
		bt = new JButton("Start");
		bt.setFocusable(false);
		bt.setContentAreaFilled(true);
		
		for(i=0;i<b.length-1;i++)
		{
			String val = String.valueOf(i+1);
			b[i] = new JButton(val);
						
		}
		b[i] = new JButton(" ");
		
		for(i=0;i<b.length;i++)
		{
			b[i].setFocusable(false);
		}
		
		f.setLayout(null);	
		bt.setBounds(100,25,100,50);
		f.add(bt);
		f.setResizable(false);
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b[0].setBounds(0,100,100,100);
		f.add(b[0]);
		b[1].setBounds(100,100,100,100);
		f.add(b[1]);
		b[2].setBounds(200,100,100,100);
		f.add(b[2]);
		b[3].setBounds(0,200,100,100);
		f.add(b[3]);
		b[4].setBounds(100,200,100,100);
		f.add(b[4]);
		b[5].setBounds(200,200,100,100);
		f.add(b[5]);
		b[6].setBounds(0,300,100,100);
		f.add(b[6]);
		b[7].setBounds(100,300,100,100);
		f.add(b[7]);
		b[8].setBounds(200,300,100,100);
		f.add(b[8]);
		
		f.setSize(306,432);
		f.show();
		
		for(i=0;i<b.length;i++)
		{
			b[i].addActionListener(this);
		}
			
		bt.addActionListener(this);
				
	}

	public void actionPerformed(ActionEvent e)
	{
		String a0 = b[0].getLabel();
		String a1 = b[1].getLabel();
		String a2 = b[2].getLabel();
		String a3 = b[3].getLabel();
		String a4 = b[4].getLabel();
		String a5 = b[5].getLabel();
		String a6 = b[6].getLabel();
		String a7 = b[7].getLabel();
		String a8 = b[8].getLabel();
		String temp;
		
		if(e.getSource()==b[0])
		{
			if(a1 == " ")
			{
				temp = a0;
				a0 = a1;
				a1 = temp;
				b[0].setLabel(a0);
				b[1].setLabel(a1);
			
			}
			if(a3 == " ")
			{
				temp = a0;
				a0 = a3;
				a3 = temp;
				b[0].setLabel(a0);
				b[3].setLabel(a3);
			
			}
		}
			
		if(e.getSource()==b[1])
		{
			if(a0 == " ")
			{
				temp = a1;
				a1 = a0;
				a0 = temp;
				b[1].setLabel(a1);
				b[0].setLabel(a0);
			
			}
			if(a4 == " ")
			{
				temp = a1;
				a1 = a4;
				a4 = temp;
				b[1].setLabel(a1);
				b[4].setLabel(a4);
			
			}
			if(a2 == " ")
			{
				temp = a1;
				a1 = a2;
				a2 = temp;
				b[1].setLabel(a1);
				b[2].setLabel(a2);
			
			}
			
		}

		if(e.getSource()==b[2])
		{
			if(a1 == " ")
			{
				temp = a2;
				a2 = a1;
				a1 = temp;
				b[2].setLabel(a2);
				b[1].setLabel(a1);
			
			}
			if(a5 == " ")
			{
				temp = a2;
				a2 = a5;
				a5 = temp;
				b[2].setLabel(a2);
				b[5].setLabel(a5);
			
			}
		}
		
		if(e.getSource()==b[3])
		{
			if(a0 == " ")
			{
				temp = a3;
				a3 = a0;
				a0 = temp;
				b[3].setLabel(a3);
				b[0].setLabel(a0);
			
			}
			if(a4 == " ")
			{
				temp = a3;
				a3 = a4;
				a4 = temp;
				b[3].setLabel(a3);
				b[4].setLabel(a4);
			
			}
			if(a6 == " ")
			{
				temp = a3;
				a3 = a6;
				a6 = temp;
				b[3].setLabel(a3);
				b[6].setLabel(a6);
			
			}
			
		}
		
		if(e.getSource()==b[4])
		{
			if(a1 == " ")
			{
				temp = a4;
				a4 = a1;
				a1 = temp;
				b[4].setLabel(a4);
				b[1].setLabel(a1);
			
			}
			if(a3 == " ")
			{
				temp = a4;
				a4 = a3;
				a3 = temp;
				b[4].setLabel(a4);
				b[3].setLabel(a3);
			
			}
			if(a5 == " ")
			{
				temp = a4;
				a4 = a5;
				a5 = temp;
				b[4].setLabel(a4);
				b[5].setLabel(a5);
			
			}
			if(a7 == " ")
			{
				temp = a4;
				a4 = a7;
				a7 = temp;
				b[4].setLabel(a4);
				b[7].setLabel(a7);
			
			}
			
		}
		
		if(e.getSource()==b[5])
		{
			if(a2 == " ")
			{
				temp = a5;
				a5 = a2;
				a2 = temp;
				b[5].setLabel(a5);
				b[2].setLabel(a2);
			
			}
			if(a4 == " ")
			{
				temp = a5;
				a5 = a4;
				a4 = temp;
				b[5].setLabel(a5);
				b[4].setLabel(a4);
			
			}
			if(a8 == " ")
			{
				temp = a5;
				a5 = a8;
				a8 = temp;
				b[5].setLabel(a5);
				b[8].setLabel(a8);
			
			}
			
		}
		
		if(e.getSource()==b[6])
		{
			if(a3 == " ")
			{
				temp = a6;
				a6 = a3;
				a3 = temp;
				b[6].setLabel(a6);
				b[3].setLabel(a3);
			
			}
			if(a7 == " ")
			{
				temp = a6;
				a6 = a7;
				a7 = temp;
				b[6].setLabel(a6);
				b[7].setLabel(a7);
			
			}
		}
		
		if(e.getSource()==b[7])
		{
			if(a6 == " ")
			{
				temp = a7;
				a7 = a6;
				a6 = temp;
				b[7].setLabel(a7);
				b[6].setLabel(a6);
			
			}
			if(a4 == " ")
			{
				temp = a7;
				a7 = a4;
				a4 = temp;
				b[7].setLabel(a7);
				b[4].setLabel(a4);
			
			}
			if(a8 == " ")
			{
				temp = a7;
				a7 = a8;
				a8 = temp;
				b[7].setLabel(a7);
				b[8].setLabel(a8);
			
			}
			
		}
		
		if(e.getSource()==b[8])
		{
			if(a5 == " ")
			{
				temp = a8;
				a8 = a5;
				a5 = temp;
				b[8].setLabel(a8);
				b[5].setLabel(a5);
			
			}
			if(a7 == " ")
			{
				temp = a8;
				a8 = a7;
				a7 = temp;
				b[8].setLabel(a8);
				b[7].setLabel(a7);
			
			}
		}

		if(e.getSource()==bt)
		{
			
			int ar[] = {1,2,3,4,5,6,7,8};
	
			Random random = new Random();

			for(int i=0;i<8;i++)
			{
			int j1 = random.nextInt(ar.length);
			int j2 = random.nextInt(ar.length);
			int tmp = ar[j1];
			ar[j1] = ar[j2];
			ar[j2] = tmp;
			}
	
			for(int i=0;i<ar.length;i++)
			{
			
			
			String val = String.valueOf(ar[i]);
			b[i].setLabel(val);
			}
			b[8].setLabel(" ");
			
			
		}
	}
	
	void answer()
	{
		while(true)
		{
		String c[] = new String[9];
		 c[0] = b[0].getLabel();
		 c[1] = b[1].getLabel();
		 c[2] = b[2].getLabel();
		 c[3] = b[3].getLabel();
		 c[4] = b[4].getLabel();
		 c[5] = b[5].getLabel();
		 c[6] = b[6].getLabel();
		 c[7] = b[7].getLabel();
		 c[8] = b[8].getLabel();
			
			
				String ct1 = Integer.toString(1);
				String ct2 = Integer.toString(2);
				String ct3 = Integer.toString(3);
				String ct4 = Integer.toString(4);
				String ct5 = Integer.toString(5);
				String ct6 = Integer.toString(6);
				String ct7 = Integer.toString(7);
				String ct8 = Integer.toString(8);
				
				boolean bl1 = c[0].equals(ct1);
				boolean bl2 = c[1].equals(ct2);
				boolean bl3 = c[2].equals(ct3);
				boolean bl4 = c[3].equals(ct4);
				boolean bl5 = c[4].equals(ct5);
				boolean bl6 = c[5].equals(ct6);
				boolean bl7 = c[6].equals(ct7);
				boolean bl8 = c[7].equals(ct8);
				boolean bl9 = c[8].equals(" ");
				
				
				if((bl1 == true)&&(bl2 == true)&&(bl3 == true)&&(bl4 == true)&&(bl5 == true)&&(bl6 == true)&&(bl7 == true)&&(bl8 == true)&&(bl9 == true))
				{
					for(int j=0;j<b.length;j++)
					{
	
					String bong = Integer.toString(j+1);
					b[j].setLabel(bong);
					
					}
				
				}
					
			
		
		}
	}
	
			
	public static void main(String args[])
	{
		Puzzle1 ob = new Puzzle1();
		ob.answer();
	
	
	}

}

