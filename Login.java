import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Login extends JFrame
{ 
    private HashMap<Integer, char[]> users = new HashMap<>();
    private Person person;
    private User user;
    private boolean newUser;
    private Container c;
    private JPanel loginMenu;
	private JPanel newUserMenu;
	private JPanel contentPane;  
	private JLabel userPrompt;
	private JLabel passPrompt;
	private JLabel newUserLabel;
	private JTextField userText;
	private JPasswordField passText;   
	private JButton loginButton;
	private JButton newUserButton;
	private JButton createButton;
	private JButton previousButton;

	public Login()
 	{
        newUser = false;
        setTitle("Login") ;
        setSize(300, 100) ;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        setLocationRelativeTo(null);
        buildLoginMenu(newUser);
        setContentPane(loginMenu) ;
        c = getContentPane();
        c.setBackground(new Color(222, 140, 247));
        setResizable(false);
        setVisible(true) ;
    }
    public void setUsers(HashMap<Integer, char []> users)
    {

        this.users = users;
    }
    private HashMap<Integer, char []> getUsers()
    {
        return users;
    }
    private void buildLoginMenu(boolean newUser)
    {
        userPrompt = new JLabel("Username-") ;
        passPrompt = new JLabel("Password-");
        userText = new JTextField(15) ;
        passText = new JPasswordField(15) ;
        loginButton = new JButton("Login");
        loginButton.addActionListener(new LoginButtonListener()) ;
        newUserButton = new JButton("New User?");
        newUserButton.addActionListener(new NewUserButtonListener());
        createButton = new JButton("Create");
        createButton.addActionListener(new CreateButtonListener());
        loginMenu = new JPanel();
        previousButton = new JButton("Previous");
        previousButton.addActionListener(new PrevButtonListener());

        userText.setBounds(70,30,150,20);
        passText.setBounds(70,65,150,20);
        loginButton.setBounds(110,100,80,20);
        newUserButton.setBounds(110,135,80,20);
        userPrompt.setBounds(20,28,100,20);
        passPrompt.setBounds(20,63,80,20);
        createButton.setBounds(110,100,80,20);
        previousButton.setBounds(110,135,80,20);

        loginMenu.add(userPrompt);
        loginMenu.add(userText);
        loginMenu.add(passPrompt);
        loginMenu.add(passText);
        if (newUser)
        {
            loginMenu.add(createButton);
            loginMenu.add(previousButton);
        }
        else
        {          
            loginMenu.add(loginButton);
            loginMenu.add(newUserButton);
        }

      
    }
    public void changePanel(JPanel panel)
    {
        getContentPane().removeAll();
        setContentPane(panel);
        c = getContentPane();
        c.setBackground(new Color(222, 140, 247));
        validate(); 
    }
    private class LoginButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int userName = Integer.parseInt(userText.getText());
            char [] pass = passText.getPassword() ;
            // if ((getUsers().get(userName) != null) && (Arrays.equals(pass, getUsers().get(userName))))
            // {
            //    
            // }
            // else
            // {
            //     JOptionPane.showMessageDialog(null, "Login error", "Error", JOptionPane.ERROR_MESSAGE);
            //     userText.setText("");
            //     passText.setText("");
            // }  
        }  
    } 
    private class NewUserButtonListener implements ActionListener
    {
  
        public void actionPerformed(ActionEvent e)
        {    
           newUser = true;
           buildLoginMenu(newUser); 
           JOptionPane.showMessageDialog(null,"Enter a new user name (Employee ID) and password");
           changePanel(loginMenu);
        }


    }
    private class CreateButtonListener implements ActionListener
    {
  
        public void actionPerformed(ActionEvent e)
        {    
            int userName = Integer.parseInt(userText.getText());
            char [] pass = passText.getPassword();
        

            if (getUsers().get(userName) != null)
            {
                JOptionPane.showMessageDialog(null,"User already exists", "Error",
                JOptionPane.ERROR_MESSAGE);
                userText.setText("");
                passText.setText("");
            }
            else
            {
                newUser = false;
                buildLoginMenu(newUser);

                getUsers().put(userName, pass);
            
                JOptionPane.showMessageDialog(null,"Account Created!");
                changePanel(loginMenu);
            }  

        }
    }
    private class PrevButtonListener implements ActionListener
    {
  
      public void actionPerformed(ActionEvent e)
      {   
          newUser = false;
          buildLoginMenu(newUser); 
          changePanel(loginMenu);    
      }
    }
    public static void main(String[] args)        
    {
            new Login();
    }

   
	
}
