/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

/**
 *
 * @author Administrator
 */
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.JPopupMenu;
import com.sun.java.swing.plaf.motif.MotifLookAndFeel;

public class ProjectLibrary extends JFrame implements ActionListener
{
	JTextField id,phno,name,add,city,padd,eadd,class1,shift,progress,dat;
       
	JTextField bookTF,authorTF,priceTF,bcodeTF;
	JTextField cdcodeTF,cdtitleTF,cdisbnTF,cdeditionTF,cdpubTF;
	Container c;
	JButton search,save,delete,exit,update;
	JButton searBook,saveNow,update1;
	JButton cdsearch,cdsave,cddelete,cdexit,cdupdate;
	JLabel cdlogo,cdcode,cdtitle,cdisbn,cdedit,cdpub;
	JOptionPane jp = new JOptionPane();
	JMenuBar menuBar,menuBar1;	
	JMenu menu1,menu2; 
	JMenuItem menuItemN,menuItemB,menuItemC,menuItemH,menuItemA,menuItemE;
	Cursor cur;

	public ProjectLibrary()
	{
		super("Library Record System");
		c = getContentPane(); c.setBackground(new Color(14,58,119));
		c.setLayout(null); 
		setBounds(0,0,850,590);
		setFont(new Font("verdana",3,14));
		cur = new Cursor(Cursor.CROSSHAIR_CURSOR);
		setCursor(cur);
	//	ImageIcon coll = new ImageIcon("collicon.gif");
	//	JLabel LogoColl = new JLabel(coll);
              //  JLabel label=new JLabel(new ImageIcon("librarybanner.jpg"));
               // label.setBounds(0,0,100,50);
		menuBar = new JMenuBar(); 	
		menu1 = new JMenu("Library");	menu1.setBackground(Color.white);
		menu1.setMnemonic('L');
		menu2 = new JMenu("Help"); 	
		menu2.setMnemonic('H');	menu2.setBackground(Color.white);
		//menu1.setMnemonic(KeyEvent.VK_D);
		
		menuItemN = new JMenuItem("New"); menuItemN.setBackground(Color.white);
		menuItemN.setMnemonic('N');
        		menuItemB = new JMenuItem("Books"); 	menuItemB.setBackground(Color.white);
        		menuItemB.setMnemonic('B');
		menuItemC = new JMenuItem("CD's");menuItemC.setBackground(Color.white);
		menuItemC.setMnemonic('C');
		menuItemE = new JMenuItem("Exit"); menuItemE.setBackground(Color.white);
		menuItemE.setMnemonic('E');
		menuItemH = new JMenuItem("Help library"); menuItemH.setBackground(Color.white);
		menuItemH.setMnemonic('E');
		menuItemA = new JMenuItem("About LRS");
		setJMenuBar(menuBar);
				
                Font f=new Font("Courier New",Font.ITALIC,38);
                JLabel j2=new JLabel("'KEEP CALM AND DISAPPEAR IN BOOKS..'"); j2.setForeground(Color.CYAN); j2.setFont(f);
               // j2.setBackground(Color.red);
		JLabel lDate = new JLabel("Issue Of Date :");  lDate.setForeground(Color.yellow);
		JLabel ph = new JLabel("Enter Phone Number :"); ph.setForeground(Color.yellow);
		JLabel lname = new JLabel("Student's Name :"); lname.setForeground(Color.yellow);
		JLabel address = new JLabel("Student's Address :");	address.setForeground(Color.yellow);
		JLabel lid = new JLabel("Book Code :"); lid.setForeground(Color.yellow);
		JLabel lcity = new JLabel("City :"); lcity.setForeground(Color.yellow);
		JLabel pad = new JLabel("Permenent Address :"); pad.setForeground(Color.yellow);

		        JLabel leadd = new JLabel("Email Address :"); leadd.setForeground(Color.yellow);
		        JLabel lclass = new JLabel("Class :"); lclass.setForeground(Color.yellow);
		        JLabel lshift = new JLabel("Section :"); lshift.setForeground(Color.yellow);
		        JLabel lprogress = new JLabel("RollNo :"); lprogress.setForeground(Color.yellow);
		       // ImageIcon next = new ImageIcon("next.gif");
		        JLabel next1 = new JLabel();
		      //  ImageIcon previous = new ImageIcon("Back.gif");
		        JLabel previous1 = new JLabel();

                     //   JLabel j2=new JLabel(new ImageIcon("C:\\Users\\Administrator\\Project.jpg"));
                        
			//ImageIcon background = new ImageIcon("backg.jpg");
			JLabel img = new JLabel();

			//ImageIcon college = new ImageIcon();
			JLabel colLogo = new JLabel();
		
			//ImageIcon LineStraight = new ImageIcon("lineh.gif");
			JLabel Line = new JLabel();

                        Font font = new Font("Courier", Font.BOLD,12);
		dat = new JTextField(""); dat.setForeground(Color.black); dat.setBackground(Color.white);
                dat.setFont(font);
                
		phno = new JTextField(); phno.setForeground(Color.black); phno.setBackground(Color.white);
                phno.setFont(font);
		name = new JTextField(); name.setForeground(Color.black); name.setBackground(Color.white);name.setFont(font);
		add = new JTextField();  add.setForeground(Color.black); add.setBackground(Color.white);add.setFont(font);

		        eadd = new JTextField();eadd.setFont(font);
                        eadd.setForeground(Color.black); eadd.setBackground(Color.white);
		        city = new JTextField();city.setFont(font);		city.setForeground(Color.black); city.setBackground(Color.white);
		         padd = new JTextField();padd.setFont(font);		 padd.setForeground(Color.black);  padd.setBackground(Color.white);
		        id = new JTextField();	id.setFont(font);	id.setForeground(Color.black); id.setBackground(Color.white);
		        class1 = new JTextField();class1.setFont(font);		class1.setForeground(Color.black); class1.setBackground(Color.white);
		        shift = new JTextField();shift.setFont(font);		 shift.setForeground(Color.black); shift.setBackground(Color.white);
		        progress = new JTextField();progress.setFont(font);	progress.setForeground(Color.black);  progress.setBackground(Color.white);
		
        search = new JButton("Search");  search.setForeground(Color.white); search.setBackground(Color.pink);
        save = new JButton("Save"); save.setForeground(Color.white); save.setBackground(Color.pink);
        delete = new JButton("Delete"); delete.setForeground(Color.white); delete.setBackground(Color.pink);
        exit = new JButton("Exit"); exit.setForeground(Color.white); exit.setBackground(Color.pink);
        update = new JButton("Update"); update.setForeground(Color.white); update.setBackground(Color.pink);

			search.setToolTipText("Search the record");	
			save.setToolTipText("Save the record");	
			delete.setToolTipText("Delete the record");	
			exit.setToolTipText("Exit from the library");	
			update.setToolTipText("Update the record");	
                        
	
                        j2.setBounds(0,10,850,200);
			lDate.setBounds(80,135,670,150);
			//LogoColl.setBounds(380,20,670,150);
			lid.setBounds(80,240,150,20);
			ph.setBounds(400,245,150,20);
			lname.setBounds(80,285,150,20);
			address.setBounds(400,290,150,20);
			lcity.setBounds(400,330,150,20);
			pad.setBounds(400,375,150,20);
			leadd.setBounds(400,415,150,20);
			lclass.setBounds(80,330,150,20);
			lshift.setBounds(80,380,150,20);
			lprogress.setBounds(80,415,150,20);
			next1.setBounds(650,478,180,54);
			previous1.setBounds(10,478,190,54);
			img.setBounds(90,100,20,40);
			colLogo.setBounds(3,0,790,142);
			Line.setBounds(2,2,48,1000);
			
			dat.setBounds(220,190,152,26);
			id.setBounds(220,235,152,26);
			phno.setBounds(550,245,152,26);
			name.setBounds(220,280,152,26);
			add.setBounds(550,290,152,26);
	        		city.setBounds(550,330,152,26);
			padd.setBounds(550,370,152,26);
			eadd.setBounds(550,410,152,26);
			class1.setBounds(220,325,152,26);
			shift.setBounds(220,370,152,26);
			progress.setBounds(220,415,152,26);

			search.setBounds(160,490,105,30);
			save.setBounds(270,490,90,30);
			delete.setBounds(363,490,95,30);
			update.setBounds(460,490,110,30);
			exit.setBounds(575,490,95,30);
		
			menu1.add(menuItemN);
			menu1.add(menuItemB);
			menu1.add(menuItemC);
			menu1.add(menuItemE);
			menuBar.add(menu1);
		
			menu2.add(menuItemH);
			menu2.add(menuItemA);
			menuBar.add(menu2);
		
			save.addActionListener(this);
			search.addActionListener(this);
        			delete.addActionListener(this);
			update.addActionListener(this);
			exit.addActionListener(this);
			menuItemN.addActionListener(this);
			menuItemB.addActionListener(this);
			menuItemC.addActionListener(this);
			menuItemH.addActionListener(this);
			menuItemA.addActionListener(this);
			menuItemE.addActionListener(this);
			c.add(j2);		
			c.add(search);
			c.add(save );
			c.add(delete);
			c.add(exit);
			c.add(update);
			//c.add(LogoColl);
			c.add(lDate);
			c.add(ph);
			c.add(lname);
			c.add(address);
			c.add(lid);
			c.add(lcity);
			c.add(pad);
			c.add(leadd);
			c.add(lclass);
			c.add(lshift);
			c.add(lprogress);
			c.add(next1);
			c.add(previous1);
			c.add(img);
			c.add(colLogo);	
			c.add(dat);
			c.add(phno);
			c.add(name);
			c.add(add);
			c.add(city);
			c.add(padd);
			c.add(id);
			c.add(eadd);
			c.add(class1);
			c.add(progress);
			c.add(shift);
			c.add(Line);
		       // c.add(label);
		
        next1.addMouseListener(new MouseAdapter()
	    {
			public void mousePressed(MouseEvent me)
			{
				int a = Integer.parseInt(id.getText());
				a++;
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
				    Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","honey","honeyjain");
				    PreparedStatement ps=c.prepareStatement("select * from Directory where Id=?");
                                    ps.setInt(1,a);

				    ResultSet rs = ps.executeQuery();
			                     while(rs.next())
				    {		
						dat.setText(rs.getString("DateToday"));
						id.setText(rs.getString("Id"));
						name.setText(rs.getString("Name"));
						add.setText(rs.getString("Address"));
						class1.setText(rs.getString("Class"));
						progress.setText(rs.getString("Progress"));
						shift.setText(rs.getString("Shift"));
						city.setText(rs.getString("City"));
						padd.setText(rs.getString("Permenent_Address"));
						phno.setText(rs.getString("PhoneNo"));
						eadd.setText(rs.getString("eaddress"));
						
				  }
					c.close();
					//st.close();
			 }
			catch(ClassNotFoundException cnf)
			{

				System.out.println("Cnf Exception");
			}
			catch(SQLException sql)
			{
				System.out.println(sql);
			}
		
		}
     	 });

	previous1.addMouseListener(new MouseAdapter()
	    {
		public void mousePressed(MouseEvent me)
		{
				int a = Integer.parseInt(id.getText());
				a--;
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
				    Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","honey","honeyjain");
				   PreparedStatement ps=c.prepareStatement("select * from Directory where Id=?");
                                    ps.setInt(1,a);

				    ResultSet rs = ps.executeQuery();

		                    		while(rs.next())
				    {		dat.setText(rs.getString("DateToday"));
						id.setText(rs.getString("Id"));
						name.setText(rs.getString("Name"));
						add.setText(rs.getString("Address"));
						class1.setText(rs.getString("Class"));
						progress.setText(rs.getString("Progress"));
						shift.setText(rs.getString("Shift"));
						city.setText(rs.getString("City"));
						padd.setText(rs.getString("Permenent_Address"));
						phno.setText(rs.getString("PhoneNo"));
						eadd.setText(rs.getString("eaddress"));
						
				      }
				      c.close();
				    //  st.close();
				}
				catch(ClassNotFoundException cnf)
				{
					System.out.println("Cnf Exception");
				}
				catch(SQLException sql)
				{
					System.out.println(sql);
				}


			}
	});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
		
	public void actionPerformed(ActionEvent ae)
	{	
		String str1=(String)ae.getActionCommand();
		Object source = ae.getSource();
		if(source==menuItemA)
		{
			JFrame aboutus = new JFrame("About us");
			aboutus.setSize(700,500);
			aboutus.getContentPane().setLayout(null);
			//ImageIcon design = new ImageIcon("about.png");
			JLabel cover = new JLabel();
			aboutus.getContentPane().add(cover);
			cover.setBounds(5,0,685,500);
			aboutus.setVisible(true);
		}
		if(source==menuItemN)	
		{
			id.setEditable(true);
			phno.setEditable(true);
			name.setEditable(true);
			add.setEditable(true);
			city.setEditable(true);
			padd.setEditable(true);
			eadd.setEditable(true);
			class1.setEditable(true);
			shift.setEditable(true);
			progress.setEditable(true);
			dat.setEditable(true);
			
			id.setText(null);
			phno.setText(null);
			name.setText(null);
			add.setText(null);
			city.setText(null);
			padd.setText(null);
			eadd.setText(null);
			class1.setText(null);
			shift.setText(null);
			progress.setText(null);
			dat.setText(null);
			
		}
		if(source==menuItemB)
		{
				JFrame book=new JFrame("Book's available in library");
				book.setSize(660,560);
				book.getContentPane().setLayout(null);
				book.getContentPane().setBackground(new Color(14,58,119));
				book.getContentPane().setForeground(Color.white);
				book.setResizable(false);
                               // JLabel q=new JLabel("BOOKS");q.setForeground(Color.pink);
                               // book.getContentPane().add(q);
				JLabel BookName = new JLabel("Book Name:");BookName.setForeground(Color.yellow);
				book.getContentPane().add(BookName);
				JLabel AuthorName = new JLabel("Author Name:");AuthorName.setForeground(Color.yellow);
				book.getContentPane().add(AuthorName);
				JLabel Pri = new JLabel("Price:");Pri.setForeground(Color.yellow);
				book.getContentPane().add(Pri);
				JLabel Bcode = new JLabel("Book Code:");Bcode.setForeground(Color.yellow);
				book.getContentPane().add(Bcode);
				
                                  Font font = new Font("Courier", Font.BOLD,12);
                                
				bookTF = new JTextField(10);
                                bookTF.setFont(font);
				book.getContentPane().add(bookTF);
				authorTF = new JTextField(10);
                                authorTF.setFont(font);
				book.getContentPane().add(authorTF);
				priceTF = new JTextField(5);     
                                priceTF.setFont(font);
				book.getContentPane().add(priceTF);
				bcodeTF = new JTextField(5);
                                bcodeTF.setFont(font);
				book.getContentPane().add(bcodeTF);
                                
                                JLabel q=new JLabel(new ImageIcon("librarybanner.jpg"));
                                book.getContentPane().add(q);

				//ImageIcon logobook = new ImageIcon("logoBook.jpg");
				JLabel logoBook = new JLabel();  
				book.getContentPane().add(logoBook);

				searBook = new JButton("Search");
				book.getContentPane().add(searBook);
				
				saveNow = new JButton("Save");
				book.getContentPane().add(saveNow);
			
				update1 = new JButton("Update");
				book.getContentPane().add(update1);
                                
                                searBook.setToolTipText("Search the book record");searBook.setBackground(Color.pink);
			saveNow.setToolTipText("Save the book record");	saveNow.setBackground(Color.pink);
			//delete.setToolTipText("Delete the record");	
			//exit.setToolTipText("Exit from the library");	
			update1.setToolTipText("Update the book record");update1.setBackground(Color.pink);

				q.setBounds(0,0,650,230);
				logoBook.setBounds(0,0,650,171);
				Bcode.setBounds(33,248,112,30);
				BookName.setBounds(33,298,112,30);
				AuthorName.setBounds(30,360,112,30);
				Pri.setBounds(31,420,112,30);
				
				bcodeTF.setBounds(123,250,100,20);
				bookTF.setBounds(123,305,262,20);
				authorTF.setBounds(123,365,262,20);
				priceTF.setBounds(123,425,100,20);
				saveNow.setBounds(280,500,111,30);
				update1.setBounds(400,500,111,30);
				searBook.setBounds(160,500,111,30);
				saveNow.addActionListener(this);
				update1.addActionListener(this);
				searBook.addActionListener(this);
				
				book.setVisible(true);	
			}
			if(source==menuItemE)
			{
				System.exit(0);
				jp = new JOptionPane();
			}			
			if(source==saveNow)
			{
				try
 				{
				    Class.forName("oracle.jdbc.driver.OracleDriver");
				    Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","honey","honeyjain");
				   // Statement st = c.createStatement();
				
				    PreparedStatement ps = c.prepareStatement("Insert into Book values(?,?,?,?)");
					ps.setString(1,bcodeTF.getText());
					ps.setString(2,bookTF.getText());
					ps.setString(3,authorTF.getText());
					ps.setString(4,priceTF.getText());
					
				                ps.executeUpdate();
				                jp.showMessageDialog(this,"Record Inserted Successfully","SUCCESS",jp.INFORMATION_MESSAGE);

					c.close();
					//st.close();
			 	}
				catch(ClassNotFoundException cnf)
				{System.out.println("Cnf Exception");}
				catch(SQLException sql)
				{jp.showMessageDialog(this,"Record Already Exists","EXCEPTION",jp.ERROR_MESSAGE);}
			}
       			if(source==update1)
			{
			            try
			               {		
					  Class.forName("oracle.jdbc.driver.OracleDriver");
					    Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","honey","honeyjain");
					   // Statement st = c.createStatement();
			
				PreparedStatement ps=c.prepareStatement ("Update Book set BookName=? , AuthorName=? , Price=? where BookCode=?"); 
					
					ps.setString(1,bookTF.getText());		
					ps.setString(2,authorTF.getText());
					ps.setInt(3,Integer.parseInt(priceTF.getText()));
                                        ps.setString(4,bcodeTF.getText());
					ps.executeUpdate();
				jp.showMessageDialog(this,"Record Updated Successfully","SUCCESS",jp.INFORMATION_MESSAGE);
				c.close();
				//st.close();
			 }
			catch(ClassNotFoundException cnf)
			{System.out.println("Cnf Exception");}
			catch(SQLException sql)
			{jp.showMessageDialog(this,sql,"EXCEPTION",jp.ERROR_MESSAGE);}
		}    
		      	if(source==menuItemC)
			{	
				JFrame cd=new JFrame("CD's available in library");
				cd.setSize(510,540);	
				cd.getContentPane().setLayout(null);
				cd.getContentPane().setBackground(new Color(14,58,119));
				cd.getContentPane().setLayout(null);
				cd.setResizable(false);
                                
                                JLabel j1=new JLabel(new ImageIcon("pic.jpg"));
                                cd.getContentPane().add(j1);

				//ImageIcon backg = new ImageIcon("CDLABEL.PNG");
				JLabel cdlogo = new JLabel();
				cd.getContentPane().add(cdlogo);  
	
				cdcode = new JLabel("CD Code:"); cdcode.setForeground(Color.yellow);
				cdtitle = new JLabel("Title:"); cdtitle.setForeground(Color.yellow);
				cdisbn = new JLabel("ISBN NO:"); cdisbn .setForeground(Color.yellow);		
				cdedit = new JLabel("Edition:");	cdedit .setForeground(Color.yellow);
				cdpub = new JLabel("Publication:");cdpub .setForeground(Color.yellow);
				
                                
                                  Font font = new Font("Courier", Font.BOLD,12);
				cdcodeTF = new JTextField();
                                cdcodeTF.setFont(font);
				cdtitleTF = new JTextField();
                                cdtitleTF.setFont(font);
				cdisbnTF = new JTextField();
                                cdisbnTF.setFont(font);
				cdeditionTF = new JTextField();
                                cdeditionTF.setFont(font);
				cdpubTF = new JTextField();
				cdpubTF.setFont(font);
                                
				cdsearch = new JButton("Search");cdsearch.setBackground(Color.pink);
				cdsave = new JButton("Save");cdsave.setBackground(Color.pink);
				cddelete = new JButton("Delete");cddelete.setBackground(Color.pink);
				cdupdate = new JButton("Update");cdupdate.setBackground(Color.pink);
				cdexit = new JButton("Exit");cdexit.setBackground(Color.pink);
                                
                                cdsearch.setToolTipText("Search the cd record");	
			cdsave.setToolTipText("Save the cd record");	
			cddelete.setToolTipText("Delete the cd record");	
			cdexit.setToolTipText("Exit from the library");	
			cdupdate.setToolTipText("Update the cd record");
		
				cd.getContentPane().add(cdcode);
				cd.getContentPane().add(cdtitle);
				cd.getContentPane().add(cdisbn);
		 		cd.getContentPane().add(cdedit);
				cd.getContentPane().add(cdpub);
				
				cd.getContentPane().add(cdcodeTF);
				cd.getContentPane().add(cdtitleTF);
				cd.getContentPane().add(cdisbnTF);
				cd.getContentPane().add(cdeditionTF);
				cd.getContentPane().add(cdpubTF);
				
				cd.getContentPane().add(cdsearch);
				cd.getContentPane().add(cdsave);
				cd.getContentPane().add(cddelete);
				cd.getContentPane().add(cdupdate);
				cd.getContentPane().add(cdexit);
                                
				j1.setBounds(0,0,510,110);
				cdlogo.setBounds(1,0,500,100);
				cdcode.setBounds(50,120,210,25);
				cdtitle.setBounds(50,160,210,25);
				cdisbn.setBounds(50,200,210,25);
				cdedit.setBounds(50,240,210,25);
				cdpub.setBounds(50,280,210,25);
				
				cdcodeTF.setBounds(150,120,210,25);
				cdtitleTF.setBounds(150,160,210,25);
				cdisbnTF.setBounds(150,200,210,25);
				cdeditionTF.setBounds(150,240,210,25);
				cdpubTF.setBounds(150,280,210,25);

				cdsearch.setBounds(0,420,98,25);
				cdsave.setBounds(100,420,98,25);
				cddelete.setBounds(200,420,98,25);
				cdupdate.setBounds(300,420,98,25);
				cdexit.setBounds(400,420,98,25);

				cdsearch.addActionListener(this);	
				cdsave.addActionListener(this);
				cddelete.addActionListener(this);
				cdexit.addActionListener(this);
				cdupdate.addActionListener(this);
				cd.setVisible(true);
 			}
			
			if(source==cdsearch)
			{
				try
				{
                                        String s1=cdcodeTF.getText();
					Class.forName("oracle.jdbc.driver.OracleDriver");
				       	Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","honey","honeyjain");
		                           		//Statement st = c.createStatement();
                                       PreparedStatement ps=c.prepareStatement("select * from CD where cdcode=?");
                                       ps.setString(1,s1);
					ResultSet rs = ps.executeQuery();
				       while(rs.next())
		       			{	
						    cdtitleTF.setText(rs.getString("Title"));
						    cdisbnTF.setText(rs.getString("IsbnNO"));
					    	    cdeditionTF.setText(rs.getString("Edition"));
						    cdpubTF.setText(rs.getString("Publication"));
						       
		      			}
		    	    		c.close();
			        		//st.close();
				  }
				  catch(ClassNotFoundException cnf)
				  {
					jp.showMessageDialog(this,cnf,"EXCEPTION",jp.ERROR_MESSAGE);
					System.out.println("Cnf Exception");
		 		   }
				catch(SQLException sql)
		  		{
				    	jp.showMessageDialog(this,sql,"EXCEPTION",jp.ERROR_MESSAGE);
				  }
		
	  		}
		
			if(source==cdsave)
			{
				try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
			    Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","honey","honeyjain");
			   // Statement st = c.createStatement();
			    PreparedStatement ps  = c.prepareStatement("Insert into CD values(?,?,?,?,?)");
			
					ps.setString(1,cdcodeTF.getText());
					ps.setString(2,cdtitleTF.getText());
					ps.setString(3,cdisbnTF.getText());
					ps.setString(4,cdeditionTF.getText());
					ps.setString(5,cdpubTF.getText());
					ps.executeUpdate();
		jp.showMessageDialog(this,"Record Inserted Successfully","SUCCESS",jp.INFORMATION_MESSAGE);

				c.close();
				//st.close();
			 }
			catch(ClassNotFoundException cnf)
			{
				System.out.println("Cnf Exception");
			}
			catch(SQLException sql)
			{
				jp.showMessageDialog(this,"Record Already Exists","EXCEPTION",jp.ERROR_MESSAGE);
			}
				
		}				
		
		if(source==cddelete)
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
			    Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","honey","honeyjain");
			    //Statement st = c.createStatement();
			    PreparedStatement ps=c.prepareStatement("Delete from CD where CdCode=?");
                            ps.setString(1,cdcodeTF.getText());
				ps.executeUpdate();
				jp.showMessageDialog(this,"Record Deleted Successfully","SUCCESS",jp.INFORMATION_MESSAGE);
				c.close();
				//st.close();
			 }
			catch(ClassNotFoundException cnf)
			{
				System.out.println("Cnf Exception");
			}
			catch(SQLException sql)
			{
				jp.showMessageDialog(this,sql,"EXCEPTION",jp.ERROR_MESSAGE);

			}
			
		}
		if(source==cdupdate)
		{
			try
			      {
			
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			    Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","honey","honeyjain");
			  //  Statement st = c.createStatement();
			PreparedStatement ps=c.prepareStatement ("Update CD set Title=?, IsbnNO=?, Edition=?, Publication=?  where CdCode=?");
					
					ps.setString(1,cdtitleTF.getText());		
					ps.setString(2,cdisbnTF.getText());
					ps.setString(3,cdeditionTF.getText());
					ps.setString(4,cdpubTF.getText());
                                        ps.setString(5,cdcodeTF.getText());
					ps.executeUpdate();
				jp.showMessageDialog(this,"Record Updated Successfully","SUCCESS",jp.INFORMATION_MESSAGE);
				c.close();
				//st.close();
			 }
			catch(ClassNotFoundException cnf)
			{
				System.out.println("Cnf Exception");
			}
			catch(SQLException sql)
			{
				jp.showMessageDialog(this,sql,"EXCEPTION",jp.ERROR_MESSAGE);
			}
				
		}
		if(source==cdexit)
		{
			System.exit(0);
		}
		if(source==menuItemH)
		{
				JFrame help=new JFrame("Help ?");
				help.setSize(800,730);	
				help.getContentPane().setBackground(new Color(14,58,119));
				help.getContentPane().setLayout(null);
				help.setResizable(false);
				//ImageIcon hl = new ImageIcon("helpLib.png");
				JLabel logoCD = new JLabel();
				help.getContentPane().add(logoCD);  
				logoCD.setBounds(0,0,800,540);
				help.setVisible(true);
 		}
		if(source==searBook)
		{			
	                            try
			{

			Class.forName("oracle.jdbc.driver.OracleDriver");
		       	Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","honey","honeyjain");
			      // Statement st = c.createStatement();
                              PreparedStatement ps=c.prepareStatement("select * from Book where BookCode=?");
                              ps.setString(1,bcodeTF.getText());
			       ResultSet rs = ps.executeQuery();
			       while(rs.next())
		       		{	
				    bookTF.setText(rs.getString("BookName"));	
			    	    authorTF.setText(rs.getString("AuthorName"));
				    priceTF.setText(rs.getString("Price"));
			    	    /*add.setText(rs.getString("Address"));
				    class1.setText(rs.getString("Class"));
				    progress.setText(rs.getString("Progress"));
				    phno.setText(rs.getString("PhoneNo"));
				    shift.setText(rs.getString("Shift"));
				    city.setText(rs.getString("City"));
				    padd.setText(rs.getString("Permenent_Address"));
				    eadd.setText(rs.getString("eaddress"));*/
				    
		      		}
		        	c.close();
		        	//st.close();
		  }
		  catch(ClassNotFoundException cnf)
		  {
			jp.showMessageDialog(this,cnf,"EXCEPTION",jp.ERROR_MESSAGE);
			System.out.println("Cnf Exception");
		}
		catch(SQLException sql)
		  {
		    	jp.showMessageDialog(this,sql,"EXCEPTION",jp.ERROR_MESSAGE);
		  }
		
	  }
	
		if(str1.equals("Search"))
		{
    		try
		    {
		       Class.forName("oracle.jdbc.driver.OracleDriver");
		       Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","honey","honeyjain");
		      // Statement st = c.createStatement();
                      PreparedStatement ps=c.prepareStatement("select * from Directory where Id=?");
                      ps.setString(1,id.getText());
		       ResultSet rs = ps.executeQuery();

		       while(rs.next())
		       {		   dat.setText(rs.getString("DateToday"));	
			    	    id.setText(rs.getString("Id"));
				    name.setText(rs.getString("Name"));
			    	    add.setText(rs.getString("Address"));
				    class1.setText(rs.getString("Class"));
				    progress.setText(rs.getString("Progress"));
				    phno.setText(rs.getString("PhoneNo"));
				    shift.setText(rs.getString("Shift"));
				    city.setText(rs.getString("City"));
				    padd.setText(rs.getString("Permenent_Address"));
				    eadd.setText(rs.getString("eaddress"));
				    
		      }
		        	c.close();
		        	//st.close();
		  }
		  catch(ClassNotFoundException cnf)
		  {
		    	jp.showMessageDialog(this,cnf,"EXCEPTION",jp.ERROR_MESSAGE);
		    	System.out.println("Cnf Exception");
		  }
		  catch(SQLException sql)
		  {
		    	jp.showMessageDialog(this,sql,"EXCEPTION",jp.ERROR_MESSAGE);
		  }
	  }

		if(str1.equals("Save"))
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
			    Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","honey","honeyjain");
			  //  Statement st = c.createStatement();
			    PreparedStatement ps  = c.prepareStatement("Insert into Directory values(?,?,?,?,?,?,?,?,?,?,?)");
			
					ps.setString(1,dat.getText());
					ps.setString(2,id.getText());
					ps.setString(3,name.getText());
					ps.setString(4,class1.getText());
					ps.setString(5,shift.getText());
					ps.setString(6,progress.getText());
					ps.setString(7,add.getText());
					ps.setString(8,city.getText());
					ps.setString(9,padd.getText());
					ps.setString(10,phno.getText());
					ps.setString(11,eadd.getText());
				                    ps.executeUpdate();
		jp.showMessageDialog(this,"Record Inserted Successfully","SUCCESS",jp.INFORMATION_MESSAGE);

				c.close();
				//st.close();
			 }
			catch(ClassNotFoundException cnf)
			{
				System.out.println("Cnf Exception");
			}
			catch(SQLException sql)
			{
				jp.showMessageDialog(this,sql,"EXCEPTION",jp.ERROR_MESSAGE);
			}
		}
		if(str1.equals("Delete"))
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
			    Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","honey","honeyjain");
			   // Statement st = c.createStatement();
			    PreparedStatement ps=c.prepareStatement("Delete from Directory where Id=?");
                            ps.setString(1,id.getText());
				ps.executeUpdate();
				jp.showMessageDialog(this,"Record Deleted Successfully","SUCCESS",jp.INFORMATION_MESSAGE);
				c.close();
				//st.close();
			 }
			catch(ClassNotFoundException cnf)
			{
				System.out.println("Cnf Exception");
			}
			catch(SQLException sql)
			{
				jp.showMessageDialog(this,sql,"EXCEPTION",jp.ERROR_MESSAGE);

			}
		}
		if(str1.equals("Update"))
		{
		      try
		      {
			
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			    Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","honey","honeyjain");
			   // Statement st = c.createStatement();
			//PreparedStatement ps=c.prepareStatement ("Update Directory set  Date=?,Name=?,Class=?,Shift=?,Progress=?,Address=?,City=?,Permenent_Address=?,PhoneNo=?,eaddress=?  where Id="+id.getText());
		PreparedStatement ps=c.prepareStatement ("Update Directory set Name=?, Class=?, Shift=?, Progress=?, Address=?, City=?, Permenent_Address=?, PhoneNo=?, eaddress=?, DateToday=? where Id=?");
					
					ps.setString(1,name.getText());		
					ps.setString(2,class1.getText());
					ps.setString(3,shift.getText());
					ps.setString(4,progress.getText());
					ps.setString(5,add.getText());
					ps.setString(6,city.getText());
					ps.setString(7,padd.getText());
					ps.setString(8,phno.getText());
					ps.setString(9,eadd.getText());
					ps.setString(10,dat.getText());
                                        ps.setString(11,id.getText());
					ps.executeUpdate();
				jp.showMessageDialog(this,"Record Updated Successfully","SUCCESS",jp.INFORMATION_MESSAGE);
				c.close();
				//st.close();
			 }
			catch(ClassNotFoundException cnf)
			{
				System.out.println("Cnf Exception");
			}
			catch(SQLException sql)
			{
				jp.showMessageDialog(this,sql,"EXCEPTION",jp.ERROR_MESSAGE);
			}
		}
		if(str1.equals("Exit"))
		{
			System.exit(0);
		}
	  }
		
	public static void main(String arg[])
 	{
 		 ProjectLibrary p4 = new ProjectLibrary();
		 p4.setResizable(false);

	 }

}
