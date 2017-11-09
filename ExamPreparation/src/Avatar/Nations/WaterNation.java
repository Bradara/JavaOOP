package Avatar.Nations;

import Avatar.Benders.Bender;
import Avatar.Monuments.Monument;

public class WaterNation extends Nation{

    private static Nation waterNation = new WaterNation();

    private WaterNation(){
        super();
    }

    public static Nation getInstance() {
        return waterNation;
    }

    public static String getStatus(){
        StringBuilder sb = new StringBuilder();
        sb.append("Water Nation\n");
        if (waterNation.getBenders().size() > 0) {
            sb.append("Benders:\n");
            for (Bender bender : waterNation.getBenders()) {
                sb.append("###").append(bender);
            }
        } else{
            sb.append("Benders: None\n");
        }

        if (waterNation.getMonuments().size()>0) {
            sb.append("Monuments:\n");
            for (Monument monument : waterNation.getMonuments()) {
                sb.append("###").append(monument);
            }
        } else {
            sb.append("Monuments: None\n");
        }

        return sb.toString();
    }
}
