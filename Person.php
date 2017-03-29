<?php 

public class Person {
	private $id;
	private $name;
	private $address;
	private $phone;
	private $email;

	public function __construct($id,
				    $name, 
				    $address, 				
				    $phone, 
				    $email)
		
	{
		$this->id = $id;
		$this->name = $name;
		$this->address = $address;
		$this->phone = $phone; 
		$this->email = $email;

	}
	public function set_id($id)
	{
		$this->id = $id;
	}
	public function get_id()
	{
		return $this->id;
	}

	public function set_name($name) 
	{ 
		$this->name = $name;  
	}

	public function get_name() 
	{
		return $this->name;
	}

	public function set_address($address)
	{
		$this->address = $address;
	}

	public function get_address()
	{
		return $this->address;
	}

	public function set_phone($phone)
	{
		$this->phone = $phone;
	}

	public function get_phone()
	{
		return $this->phone;
	}

	public function set_email($email)
	{
		$this->email = $email;
	}

	public function get_email()
	{
		return $this->email
	}
	public function userLogin($user, $pass)
{
    if( $this->checkUser($user) && $this->checkPass($pass) )
    {
        $_SESSION['memberName'] = $this->user;
        return true;
    }
    else
    {
        $this->setError("Invalid username/password");
    }
}

} 

?>
