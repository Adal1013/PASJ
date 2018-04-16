import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {



    public static void main(String[] args) {

        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,31);
        map.put(2,28);
        map.put(3,31);
        map.put(4,30);
        map.put(5,31);
        map.put(6,30);
        map.put(7,31);
        map.put(8,31);
        map.put(9,30);
        map.put(10,31);
        map.put(11,30);
        map.put(12,31);

        Fecha f1 = new Fecha();
        f1.getDate();
        f1.validarFecha(map);
        while (f1.validarFecha(map)!=true){
            System.out.println("Fecha invalida, por favor ingrese una nueva");
            f1.getDate();
        }
        if(f1.validarFecha(map)){ System.out.println("Fecha Valida"); }
        System.out.println("Formato Latino: "+f1.formaLat());
        System.out.println("Formato Gringo: "+f1.formaGrin());

        Fecha f2 = new Fecha();
        f2.fechaAprobacion(f1,map);
        System.out.println("Formato Latino: "+f2.formaLat());
        System.out.println("Formato Gringo: "+f2.formaGrin());
        System.out.println(f2.validarFecha(map));

    }
}
