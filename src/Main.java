import java.util.ArrayList;
public class Main {



    public static void main(String[] args) {

        ArrayList<DiccionarioMes> mesesDias = new ArrayList<DiccionarioMes>();

        DiccionarioMes enero = new DiccionarioMes(1,31);
        mesesDias.add(enero);
        DiccionarioMes febrero = new DiccionarioMes(2,28);
        mesesDias.add(febrero);
        DiccionarioMes marzo = new DiccionarioMes(3,31);
        mesesDias.add(marzo);
        DiccionarioMes abril = new DiccionarioMes(4,30);
        mesesDias.add(abril);
        DiccionarioMes mayo = new DiccionarioMes(5,31);
        mesesDias.add(mayo);
        DiccionarioMes junio = new DiccionarioMes(6,30);
        mesesDias.add(junio);
        DiccionarioMes julio = new DiccionarioMes(7,31);
        mesesDias.add(julio);
        DiccionarioMes agosto = new DiccionarioMes(8,31);
        mesesDias.add(agosto);
        DiccionarioMes septiembre = new DiccionarioMes(9,30);
        mesesDias.add(septiembre);
        DiccionarioMes octubre = new DiccionarioMes(10,31);
        mesesDias.add(octubre);
        DiccionarioMes noviembre = new DiccionarioMes(11,30);
        mesesDias.add(noviembre);
        DiccionarioMes diciembre = new DiccionarioMes(12,31);
        mesesDias.add(diciembre);

        Fecha f1 = new Fecha();
        f1.getDate();
        f1.validarFecha(mesesDias);
        while (f1.validarFecha(mesesDias)!=true){
            System.out.println("Fecha invalida, por favor ingrese una nueva");
            f1.getDate();
        }
        if(f1.validarFecha(mesesDias)){ System.out.println("Fecha Valida"); }
        System.out.println("Formato Latino: "+f1.formaLat());
        System.out.println("Formato Gringo: "+f1.formaGrin());

        Fecha f2 = new Fecha();
        f2.fechaAprobacion(f1,mesesDias);
        System.out.println("Formato Latino: "+f2.formaLat());
        System.out.println("Formato Gringo: "+f2.formaGrin());
        System.out.println(f2.validarFecha(mesesDias));

    }
}
