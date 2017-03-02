<?php 
	public class User extends Person {
		private var $id;
		private var $userName;
		private var $rank;
		private var $score;
		

		public function __construct($name,
									$address,
									$phone,
									$email,
									$id,
									$userName, 
									$rank, 
									$score)
		
		{
			$this->id = $id;
			$this->userName = $userName;
			$this->rank = $rank;
			$this->score = $score; 
			

			parent::__construct($name, $address, $phone, $email);

		}

		public function set_id($id) 
		{ 
			$this->id = $id;  
 		}
 
   		public function get_id() 
   		{
			return $this->id;
		}

		public function set_userName($userName)
		{
			$this->userName = $userName;
		}

		public function get_userName()
		{
			return $this->userName;
		}

		public function set_rank($rank)
		{
			$this->rank = $rank;
		}

		public function get_rank()
		{
			return $this->rank;
		}

		public function set_score($score)
		{
			$this->score = $score;
		}

		public function get_score()
		{
			return $this->score;
		}

	} 
?>
