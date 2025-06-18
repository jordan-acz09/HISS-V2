package refdefcwk; 
import java.io.*;
/**
 * Enumeration class JobType - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum JobType implements Serializable
{
    DESIGN(" Design"), INSTALLATION(" Installation"), MAINTENANCE (" Maintenance");
    private String type;
    
    private JobType(String ty)
    {
        type = ty;
    }
    
    public String toString()
    {
        return type;
    }
}
