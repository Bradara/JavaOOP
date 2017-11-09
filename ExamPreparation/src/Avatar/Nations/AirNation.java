package Avatar.Nations;

import Avatar.Benders.Bender;
import Avatar.Monuments.Monument;

public class AirNation extends Nation{

    private static Nation airNation = new AirNation();

    private AirNation(){
        super();
    }

    public static Nation getInstance() {
        return airNation;
    }


    public static String getStatus(){
        StringBuilder sb = new StringBuilder();
        sb.append("Air Nation\n");
        if (airNation.getBenders().size() > 0) {
            sb.append("Benders:\n");
            for (Bender bender : airNation.getBenders()) {
                sb.append("###").append(bender);
            }
        } else{
            sb.append("Benders: None\n");
        }

        if (airNation.getMonuments().size()>0) {
            sb.append("Monuments:\n");
            for (Monument monument : airNation.getMonuments()) {
                sb.append("###").append(monument);
            }
        } else {
            sb.append("Monuments: None\n");
        }

        return sb.toString();
    }
}
