package Repository;
import Entity.Team;
public class TeamRepository {

	
	//should return MI team details
	public static Team getMITeamDetails() {
		Team team = new Team();
		team.setId(101);
		team.setTeamName("Mumbai Indians");
		team.setCaptainName("Hardik Pandya");
        team.setCoachName("Jaywaedhan");
        team.setQualified(false);
        team.setnRR(2.3f);
        return team;
	}
  
	public static Team getCSKTeamDetails() {
		Team team = new Team();
		team.setId(102);
		team.setTeamName("Chennai Super Kings");
		team.setCaptainName("Ruturaj Gaikwad");
		team.setCoatchName("Stephen Fleming");
		team.setQualified(false);
		team.setnRR(1.8f);
		return team;
	}
	
	public static Team getKKRTeamDetails() {
		Team team = new Team();
		team.setId(103);
		team.setTeamName("Kolkata Knight Riders");
		team.setCaptainName("Shreyash Iyer");
		team.setCoatchName("Chandrakant Pandit");
		team.setQualified(false);
		team.setnRR(1.9f);
		
	}
	
	public static Team getRCBTeamDetails() {
		Team team = new Team();
		team.setId(104);
		team.setTeamName("Royal Challengers Banglore");
		team.setCaptainName("Virat Kolhi");
		team.setCoatchName("Sanjay Banger");
		team.setqualified(true);
		team.set.nRR(0.7f);
		
	}
	
	 public static Team getRRTeamDetails() {
	        Team team = new Team();
	        team.setId(105);
	        team.setTeamName("Rajasthan Royals");
	        team.setCaptainName("Sanju Samson");
	        team.setCoachName("Kumar Sangakkara");
	        team.setQualified(true);
	        team.setnRR(1.5f);
	        return team;
	    }
	  public static Team getSRHTeamDetails() {
	        Team team = new Team();
	        team.setId(106);
	        team.setTeamName("Sunrisers Hyderabad");
	        team.setCaptainName("Pat Cummins");
	        team.setCoachName("Daniel Vettori");
	        team.setQualified(false);
	        team.setnRR(0.6f);
	        return team;
	    }
	  
	  
	  public static Team getDCTeamDetails() {
	        Team team = new Team();
	        team.setId(107);
	        team.setTeamName("Delhi Capitals");
	        team.setCaptainName("Rishabh Pant");
	        team.setCoachName("Ricky Ponting");
	        team.setQualified(false);
	        team.setnRR(-0.3f);
	        return team;
	    }
	  
	  public static Team getPBKSTeamDetails() {
	        Team team = new Team();
	        team.setId(108);
	        team.setTeamName("Punjab Kings");
	        team.setCaptainName("Shikhar Dhawan");
	        team.setCoachName("Trevor Bayliss");
	        team.setQualified(false);
	        team.setnRR(-0.5f);
	        return team;
	    }
	  
	  public static Team getLSGTeamDetails() {
	        Team team = new Team();
	        team.setId(109);
	        team.setTeamName("Lucknow Super Giants");
	        team.setCaptainName("KL Rahul");
	        team.setCoachName("Andy Flower");
	        team.setQualified(false);
	        team.setnRR(0.2f);
	        return team;
	    }
	  
	  
	     public static Team getGTTeamDetails() {
        Team team = new Team();
        team.setId(110);
        team.setTeamName("Gujarat Titans");
        team.setCaptainName("Shubman Gill");
        team.setCoachName("Ashish Nehra");
        team.setQualified(true);
        team.setnRR(1.2f);
        return team;
    }
}
