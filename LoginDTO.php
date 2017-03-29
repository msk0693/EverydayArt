<?php 

public class LogtinDTO {
	protected $id;
	protected $userName;
	protected $password;


	public function setId($id) 
	{
        $this->id = $id;
    }
    
    public function getId() 
    {
        return $this->id;
    }

    public function setUserName($userName) 
    {
        $this->userName = $userName;
    }
    
    public function getUserName() 
    {
        return $userName->userName;
    }

    public function setPassword($password) 
    {
        $this->password = $password;
    }
    
    public function getPassword() 
    {
        return $this->password;
    }
}

?>