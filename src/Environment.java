import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.naming.NoPermissionException;

public class Environment {
    private String lastDeployTime = "";
    private String upDuration = "100";
    private String currentUri = "";
    private String type = "";

    public Environment(String type){
        this.type = type;
    }

    public void deploy() throws NoPermissionException {
        if(this.type == "PROD"){
            throw new NoPermissionException();
        }

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        this.lastDeployTime = dtf.format(now).toString();

        this.upDuration = "0";

        System.out.println("New version is ready");
    }

    public String[] listEnvs() {
        return new String[] { "QA", "DEV", "PROD" };
    }

    public String getLastDeployTime() {
        return lastDeployTime;
    }

    public String getUpDuration() {
        return upDuration;
    }

    public String getCurrentUri() {
        return currentUri;
    }

    public String getType() {
        return type;
    }
}
