public class User extends Person
{
	public int id;
	public String rank;
	public int score;
	public String userName;

	public User(String name,
				String address,
				String phone,
				String email,
				int id,
				String userName, 
				String rank,
				int score)
	{
		super(name, address, phone, email);
		this.id = id;
		this.userName = userName;
		this.rank = rank;
		this.score = score;
		

	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getID()
	{
		return id;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getUserName()
	{
		return userName ;
	}
	public void setRank(String rank)
	{
		this.rank = rank;
	}
	public String getRank()
	{
		return rank;

	}
	public void setScore(int score)
	{
		this.score = score;
	} 
	public int getScore()
	{
		return score;
	}
 	public String toString()
	{
		String str = 
		String.format("Personal Information%n%nFull Name: %s%nAddress: %s%nPhone Number: %s%nEmail: %s%n%n",
						getName(), getAddress(), getPhone(), getEmail())
		+ String.format("ID: %d%nUser Name: %s%nRank: %s Score: %d",
						getID(), getUserName(), getRank(), getScore()); 
		return str ; 
	}

	
}