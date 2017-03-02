<?php 
	public class Person {
		private var $name;
		private var $address;
		private var $phone;
		private var $email;

		public function __construct($name, 
									$address, 
									$phone, 
									$email)
		{
			$this->name = $name;
			$this->address = $address;
			$this->phone = $phone; 
			$this->email = $email;

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

	} 
?>