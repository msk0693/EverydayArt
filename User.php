<?php 

public class User extends Person {
	private $userName;
	private $rank;
	private $currentPoints;
	private $totalPoints;
	

	public function __construct($id,
								$name,
								$address,
								$phone,
								$email, 
								$userName,
								$rank,
								$totalPoints,
								$currentPoints)
	
	{
		
		$this->userName = $userName;
		$this->rank = $rank;
		$this->totalPoints = $totalPoints; 
		$this->currentPoints = $currentPoints;
		

		parent::__construct($id, $name, $address, $phone, $email);

	}


	public function setUserName($userName)
	{
		$this->userName = $userName;
	}

	public function getUserName()
	{
		return $this->userName;
	}

	public function setRank($rank)
	{
		$this->rank = $rank;
	}

	public function getRank()
	{
		return $this->rank;
	}

	public function setTotal($totalPoints)
	{
		$this->totalPoints = $totalPoints;
	}
	public function getTotal()
	{
		return $this->totalPoints;
	}
	public function setCurrent($currentPoints)
	{
		$this->currentPoints = $currentPoints;
	}
	public function getCurrent()
	{
		return $this->currentPoints;
	}

} 

?>
