package miniproject;
import javazoom.jl.decoder.JavaLayerException;

import java.applet.Applet;
import javazoom.jl.player.Player;
import java.awt.TrayIcon.MessageType;
//import java.applet.AudioClip;
import java.util.Calendar;
import java.util.Date;
import java.applet.AudioClip;
import javax.swing.JOptionPane;
import java.awt.*;  
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat; 
@SuppressWarnings({ "serial", "deprecation" })
class Timechecker extends mininprojecttrydate implements Runnable 
{ 
    public void run() 
    { 
        try
        { 
        	while(true) {
        		mininprojecttrydate mp = new mininprojecttrydate(); 
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

@SuppressWarnings("deprecation")
public class mininprojecttrydate extends Applet implements ActionListener{  
	TextField tf1,tf3,tf4;  
	private static final long serialVersionUID=1l;
	public static int emin, ehours,flag=0,edates,emonhts;
	public static int hours[]=new int[100],min[]=new int[100], over[]=new int[100],dates[]=new int[100],mon[]=new int[100], i=0;
	public static String names[]=new String[10];
	public static String names1[]=new String[12];
	public static String mont[]=new String[15];
	AudioClip ac=null;
	int t=0;
static int jan=31;
	static	int feb=29;
	static int mar=30;
	static	int apr=31;
	static int may=30;
	static int june=30;
	static int jul=31;
	static int aug=31;
	static int sep=30;static int oct=31;static int nov=30;static int dec=31;
	//AudioClip ac=null;
	//private static 
	Button b2,b3;  
	   Label l1,l2,l3,l4,hrsl,minl,mnts,da;
	   Choice choice,choice1,choice2,choice3,choice4;
	   Frame f= new Frame("TASK REMAINDER");  
	   public static TextArea area=new TextArea("Welcome to javatpoint");
		Button clearButton=new Button("clear");
		SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss a");;
		Date date;
		Calendar now = Calendar.getInstance();
		@SuppressWarnings("unused")
public void init() throws ArrayIndexOutOfBoundsException{  
    	l1=new Label("Task name:");  
    	l1.setBounds(20,45, 80,30);  
    	l2=new Label("Set Time");  
    	l2.setBounds(20,94, 80,30); 
    	hrsl=new Label("Hours");  
    	hrsl.setBounds(77,118, 80,30);  
    	minl=new Label("Minutes");  
    	minl.setBounds(160,118, 80,30);
    	mnts=new Label("months");  
    	mnts.setBounds(240,118, 80,30);
    	da=new Label("Date");  
    	da.setBounds(320,118, 80,30); 
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
        b3=new Button("Set date");  
     /*   b3.setBounds(280,100,50,20);
        b3.setBackground(new Color(244,101,65));
        b3.setForeground(Color.black);
        b3.setFont(new Font("Arial",Font.BOLD,15));
        b3.addActionListener(this);  */
        choice=new Choice(); 
        choice1=new Choice(); 
        choice2=new Choice(); 
        choice3=new Choice(); 
  	  choice4=new Choice(); 
  	  for(int i=1;i<=24;i++) {
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
       // ArrayList<String> monthsList = new ArrayList<String>();
    //    DateFormatSymbols dfs = new DateFormatSymbols();       
      //  String[] arrayOfMonthsNames = dfs.getMonths();
        for(int l=1;l<=12;l++) {
        	String s12=Integer.toString(l);

        	choice2.add(s12);
       	 choice2.setForeground(Color.BLACK);
            choice2.setSize(180, 180);
           choice2.setBounds(240,96,50,20); }
        for(int k=1;k<=31;k++) {
        	String s=Integer.toString(k);
        	choice3.add(s);
        	 choice3.setForeground(Color.BLACK);
             choice3.setSize(180, 180);
            choice3.setBounds(320,96,50,20);   
        	}
        
           
       /*    choice3.setForeground(Color.BLACK);
           choice3.setSize(180, 180);
          choice3.setBounds(240,96,50,20);
        	
        	monthsList .add(months[k]);
        	  
        	}*/
      /*  b3.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {       
         String data =choice2.getItem(choice2.getSelectedIndex());  
         
       // String s7=choice2.getSelectedItem(); 
        if(data.equals("March")) {
         	for(int hmm=0;hmm<=jan;hmm++) {
             	String dt=Integer.toString(hmm);

         		choice4.add(dt);
         	 choice4.setForeground(Color.BLACK);
              choice4.setSize(180, 180);
             choice4.setBounds(300,96,50,20); }}
            }  
        });  */ 
        f.add(choice);
        f.add(choice1);
        f.add(choice2);

        f.add(choice3);

        f.add(tf1);
        f.add(tf4);
        f.add(da);
        f.add(b2); 
        f.add(l1);
        f.add(b3); 

        f.add(l2);
        f.add(hrsl);
        f.add(minl);
       
        f.add(mnts);

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
    	  choice4=new Choice(); 
      	String s1=tf1.getText();  
        String s5=choice.getSelectedItem(); 
        String s27=choice2.getSelectedItem();
        String s53=choice3.getSelectedItem(); 

    
        mininprojecttrydate.names[mininprojecttrydate.i]=s1;
        mininprojecttrydate.ehours=Integer.parseInt(s5);
        mininprojecttrydate.hours[mininprojecttrydate.i]=mininprojecttrydate.ehours;
        mininprojecttrydate.ehours=Integer.parseInt(s53);
        mininprojecttrydate.dates[mininprojecttrydate.i]=mininprojecttrydate.edates;
        mininprojecttrydate.ehours=Integer.parseInt(s27);
        mininprojecttrydate.mon[mininprojecttrydate.i]=mininprojecttrydate.emonhts;
        mininprojecttrydate.over[mininprojecttrydate.i]=0;
        String s6=choice1.getSelectedItem(); 
        mininprojecttrydate.emin=Integer.parseInt(s6);
        mininprojecttrydate.min[mininprojecttrydate.i]=mininprojecttrydate.emin;
        mininprojecttrydate.i = mininprojecttrydate.i +1;
        date = new Date();
        String pa = area.getText();
        pa=pa+"\nyou have a task  "+s1+"   on: "+s5+":"+s6+":"+s53+":"+s27;
        area.setText(pa);
        Timechecker object = new Timechecker(); 
        Thread t= new Thread(object);
        t.start();
        
        
    }
    public void checktime() {
    	int h=now.get(Calendar.HOUR); 
    	int m=now.get(Calendar.MINUTE);
    	int dat=now.get(Calendar.DATE);
    	int monnn=now.get(Calendar.MONTH);
    	h+=12;
    
for(int j = 0; j<=mininprojecttrydate.i;j++) {
    		  if(dat>=mininprojecttrydate.dates[j] && monnn>=mininprojecttrydate.mon[j] ) {
	        if(h>=mininprojecttrydate.hours[j] && m>=mininprojecttrydate.min[j]){
	        	if(mininprojecttrydate.over[j]!=1) {
		        		mininprojecttrydate.over[j]=1;
		        		if(mininprojecttrydate.names[j]!=null) {
		            	String pa = area.getText();
		            	try { FileInputStream fileInputStream= new FileInputStream("C:\\Users\\Mohammad\\Downloads\\notification.mp3");
		            	Player player= new Player(fileInputStream);
		            	player.play();
		            //	System.out.println("song is playing");
		            	
		            	}catch (FileNotFoundException e){e.printStackTrace();}catch (JavaLayerException e) {e.printStackTrace();}
		            	//ac=getAudioClip(getDocumentBase(),"notification.wav");
		            	//ac.play(); t=1;
		            	try{
		            	    SystemTray tray = SystemTray.getSystemTray();

		            	    Image image = Toolkit.getDefaultToolkit().createImage("C:\\Users\\Mohammad\\Pictures\\remindericon.png");
		            	    //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));
		            	 //   System.out.println(dat);
		            	    TrayIcon trayIcon = new TrayIcon(image, "Java AWT Tray Demo");
		            	    trayIcon.setImageAutoSize(true);
		            	    trayIcon.setToolTip("System tray icon demo");
		            	    tray.add(trayIcon);
	            	    trayIcon.displayMessage("YOU HAVE A TASK:",mininprojecttrydate.names[j] , MessageType.INFO);
		            	  
		            	}catch(Exception ex){
		            	    System.err.print(ex);
		            	}
		                pa=pa+"\n"+mininprojecttrydate.names[j]+" TASK AND TIME is over";
		                area.setText(pa);

		              //  getAudioClip(getDocumentBase(),"notification.wav");
		                JOptionPane.showMessageDialog(mininprojecttrydate.this, "YOU HAVE A TASK:"+mininprojecttrydate.names[j], "notification", WIDTH);

		        		}
		                
	        		}
	        	}
	        	
	        }
    	}
 
 }}

 