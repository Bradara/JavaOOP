package Avatar.Nations;

import Avatar.Benders.Bender;
import Avatar.Monuments.Monument;

public class EarthNation extends Nation{
    private static Nation earthNation = new EarthNation();

    private EarthNation(){
        super();
    }

    public static Nation getInstance() {
        return earthNation;
    }

    public static String getStatus(){
        StringBuilder sb = new StringBuilder();
        sb.append("Earth Nation\n");
        if (earthNation.getBenders().size() > 0) {
            sb.append("Benders:\n");
            for (Bender bender : earthNation.getBenders()) {
                sb.append("###").append(bender);
            }
        } else{
            sb.append("Benders: None\n");
        }

        if (earthNation.getMonuments().size()>0) {
            sb.append("Monuments:\n");
            for (Monument monument : earthNation.getMonuments()) {
                sb.append("###").append(monument);
            }
        } else {
            sb.append("Monuments: None\n");
        }

        return sb.toString();
    }
}
