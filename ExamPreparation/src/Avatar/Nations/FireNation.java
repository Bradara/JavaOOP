package Avatar.Nations;

import Avatar.Benders.Bender;
import Avatar.Monuments.Monument;

public class FireNation extends Nation{
    private static Nation fireNation = new FireNation();

    private FireNation(){
        super();
    }

    public static Nation getInstance() {
        return fireNation;
    }

    public static String getStatus(){
        StringBuilder sb = new StringBuilder();
        sb.append("Fire Nation\n");
        if (fireNation.getBenders().size() > 0) {
            sb.append("Benders:\n");
            for (Bender bender : fireNation.getBenders()) {
                sb.append("###").append(bender);
            }
        } else{
            sb.append("Benders: None\n");
        }

        if (fireNation.getMonuments().size()>0) {
            sb.append("Monuments:\n");
            for (Monument monument : fireNation.getMonuments()) {
                sb.append("###").append(monument);
            }
        }else {
            sb.append("Monuments: None\n");
        }

        return sb.toString();
    }
}
