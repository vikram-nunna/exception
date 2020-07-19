package epam.exception;
import java.util.logging.Logger;
import org.apache.logging.log4j.LogManager;
public class first {
		
		private static final org.apache.logging.log4j.Logger LOGGER =LogManager.getLogger(Defining.class);
		
		public double simple(double prin,double  in,double  per )
		{
			double y=(prin*in*per)/100;
			LOGGER.info(y);
			LOGGER.error("corrrection will be there");
			LOGGER.warn("wrong  code");
			LOGGER.fatal(" abort");return y;
		}
		public double  compound(double p,double  in,double  per )
		{
			double  y2=p*(Math.pow((1+(in/100)),per));
			y2=y2-p;
			
			LOGGER.info(y2);
			LOGGER.error("There will be corrrection");
			LOGGER.warn("there is something wrong in code");
			LOGGER.fatal("there is any case of abort");
			return y2;
		
		}
		

	}
}
