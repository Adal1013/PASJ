import java.util.ArrayList;
import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int year;

    public Fecha() {
        this.dia = 0;
        this.mes = 0;
        this.year = 0;
    }

    public void getDate(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el Dia: ");
        this.dia = read.nextInt();
        System.out.println("Ingrese el Mes: ");
        this.mes = read.nextInt();
        System.out.println("Ingrese el Año: ");
        this.year = read.nextInt();
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getYear() {
        return year;
    }

    public String formaLat() {
        return "(" + dia +"/" + mes +"/" + year + ")";
    }

    public String formaGrin() {
        return "(" + mes +"/" + dia +"/" + year + ")";
    }

    public boolean validarBisiesto() {
        if ((this.year % 4 == 0) && (this.year % 100 != 0 || this.year % 400 == 0)){
            return true;
        }else {
            return false;
        }
    }

    public boolean validarFecha(ArrayList<DiccionarioMes>diccionario){
        int aux = 0;
        for (DiccionarioMes elem:diccionario) {
            if(this.mes==elem.getNumMes()){
                aux = elem.getNumDia();
            }
        }
        if (this.year > 2099){
            return false;
        }else{
            if(this.mes < 1 || this.mes > 12){
                return false;
            }else{
                if(this.validarBisiesto()){
                    if(this.mes == 2){
                        if(this.dia > 29){
                            return false;
                        }
                    }else if(this.dia > aux){
                        return false;
                    }
                }else if(this.dia > aux){
                    return false;
                }
            }
        }
        return true;
    }

    public void fechaAprobacion(Fecha inicio, ArrayList<DiccionarioMes>diccionario){
        int auxDia = inicio.dia + 7;
        int auxMes = inicio.mes;
        int auxAnyo = inicio.year;
        int aux = 0;
        for (DiccionarioMes elem : diccionario) {
            if(inicio.mes == elem.getNumMes()){
                aux = elem.getNumDia();
            }
        }
        if(auxDia > aux){
            auxMes++;
            if (auxMes > 12){
                auxMes = 1;
                auxAnyo++;
            }
            if(inicio.validarBisiesto()){
                if (inicio.mes == 2){
                    auxDia = auxDia - aux - 1;
                }else {
                    auxDia = auxDia - aux;
                }
            }else {
                auxDia = auxDia - aux;
            }
        }

        this.dia=auxDia;
        this.mes=auxMes;
        this.year=auxAnyo;
    }
}
