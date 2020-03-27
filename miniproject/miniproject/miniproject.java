package miniproject;

import java.util.Calendar;

import java.util.Date;

import javax.swing.JOptionPane;

import java.applet.Applet;
import java.awt.*;  
import java.awt.event.*;
import java.text.SimpleDateFormat; 

class Timechecker extends miniproject implements Runnable 
{ 
    public void run() 
    { 
        try
        { 
        	while(true) {
        		miniproject mp = new miniproject(); 
        		mp.checktime();
        	}
        		
  
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
}



public class miniproject extends Applet implements ActionListener{  
	TextField tf1,tf3,tf4;  
	public static int emin, ehours,flag=0;
	public static int hours[]=new int[10],min[]=new int[10], over[]=new int[10], i=0;
	public static String names[]=new String[10];
	private final static int DIALOG_ICON = JOptionPane.INFORMATION_MESSAGE;
    Button b2;  
	   Label l1,l2,l3,l4,hrsl,minl;
	   Choice choice,choice1;

	   Frame f= new Frame("Label Example");  
	   public static TextArea area=new TextArea("Welcome to javatpoint");
		Button clearButton=new Button("clear");
		SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss a");;
		Date date;
		Calendar now = Calendar.getInstance();
		

		

public void init(){  
    	l1=new Label("Task name:");  
    	l1.setBounds(20,45, 80,30);  
    	l2=new Label("Set Time");  
    	l2.setBounds(20,94, 80,30); 
    	hrsl=new Label("Hours");  
    	hrsl.setBounds(77,118, 80,30);  
    	minl=new Label("Minutes");  
    	minl.setBounds(160,118, 80,30);  
    	
    	
        tf1=new TextField();  
        tf1.setBounds(80,50,150,20);  
       // tf2=new TextField();  
       // tf2.setBounds(80,96,50,20);  
        tf4=new TextField();  
        tf4.setBounds(160,96,50,20);
        
        area=new TextArea();  
        area.setBounds(20,150,300,300);  
        area.setEditable(false);    
        b2=new Button("Submit");  
        b2.setBounds(140,480,100,50); 
        b2.setBackground(new Color(244,101,65));
        b2.setForeground(Color.black);
        b2.setFont(new Font("Arial",Font.BOLD,15));
        b2.addActionListener(this);  
        choice=new Choice(); 
        choice1=new Choice(); 

        
        for(int i=1;i<=12;i++) {
        	String s=Integer.toString(i);
        	choice.add(s);
        	 choice.setForeground(Color.BLACK);
             choice.setSize(180, 180);
            choice.setBounds(80,96,50,20);   
        	} 
        for(int j=1;j<=60;j++) {
        	String s=Integer.toString(j);
        	choice1.add(s);
        	 choice1.setForeground(Color.BLACK);
             choice1.setSize(180, 180);
            choice1.setBounds(160,96,50,20);   
        	} 
       
       
        f.add(choice);
        f.add(choice1);
        f.add(tf1);
        f.add(tf4);
        f.add(b2); 
        f.add(l1);
        f.add(l2);
        f.add(hrsl);
        f.add(minl);
       
        f.add(area);
    
     
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Mohammad\\Pictures\\remindericon.png");  
        f.setIconImage(icon); 

        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);              

        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
	    clearButton.setBounds(20,480,100,50);
	    clearButton.setBackground(new Color(244,101,65));
	    clearButton.setForeground(Color.black);
	    clearButton.setFont(new Font("Arial",Font.BOLD,15));
	    f.add(clearButton);
	    
	    clearButton.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		if(e.getSource()==clearButton){
	    			tf1.setText(" ");
	    			
	    			
	    		}
	    	}
	    });
    } 
    
    public void actionPerformed(ActionEvent e) {  
   
      	String s1=tf1.getText();  
        String s5=choice.getSelectedItem(); 
        this.names[this.i]=s1;
        this.ehours=Integer.parseInt(s5);
        this.hours[this.i]=this.ehours;
        this.over[this.i]=0;
        String s6=choice1.getSelectedItem(); 
        this.emin=Integer.parseInt(s6);
        this.min[this.i]=this.emin;
        this.i = this.i +1;
        date = new Date();
        String pa = area.getText();
        pa=pa+"\nyou have a task  "+s1+"   on: "+s5+":"+s6;
        area.setText(pa);
        Timechecker object = new Timechecker(); 
        Thread t= new Thread(object);
        t.start();
        
        
    }
    
 public void checktime() {
    	
    	int h=now.get(Calendar.HOUR); 
    	int m=now.get(Calendar.MINUTE);
    	
    	for(int j = 0; j<=this.i;j++) {
	        if(h>=this.hours[j] && m>=this.min[j]) {
	        	if(this.over[j]!=1) {
		        		this.over[j]=1;
		        		if(this.names[j]!=null) {
		            	String pa = area.getText();
		                pa=pa+"\n"+this.names[j]+" Time is over";
		                area.setText(pa);
		                JOptionPane.showMessageDialog(miniproject.this, "YOU HAVE A "+this.names[j], "notification", DIALOG_ICON);
	        		}
	        	}
	        	
	        }
    	}
}
}
 