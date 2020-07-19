package epam.exception;


import org.apache.logging.log4j.LogManager;

public class second {
	double rr=0;
	private static final org.apache.logging.log4j.Logger LOGG1 =LogManager.getLogger(HouseDefining.class);
	double cost(String ss,double r,String y)
	{
		if (ss.equals("StandardMaterials"))
		{
			
			
			rr=rr+(1200*r);
			
			LOGG1.info(rr);
			LOGG1.error("There will be corrrection");
			LOGG1.warn("there is something wrong in code");
			LOGG1.fatal("there is any case of abort");
				
		}
		
		else if (ss.equals("above standard materials"))
		{
			
			rr=rr+(1500*r);
				LOGG1.info(rr);
			LOGG1.error("There will be corrrection");
			LOGG1.warn("wrong  code");
			LOGG1.fatal("abort");
			
		}
		else
		{
			if (y.equals("fully automated house" ))
			{rr=rr+(2500*r);
			}
			else
			{
				rr=rr+(1800*r);
			}
				LOGG1.info(rr);
			LOGG1.error(" corrrection will be there");
			LOGG1.warn("wrong code");
			LOGG1.fatal("abort there");
			
			
		}
		
		
	return(rr);	
	}

}