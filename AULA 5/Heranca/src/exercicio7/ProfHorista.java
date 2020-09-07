package exercicio7;
import exercicio5.Professor;
public class ProfHorista extends Professor{
    private int horasTrabalhadas;
    private float valorHora;
    
    public void setHorastrabalhadas(int horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public int getHorastrabalhadas(){
        return this.horasTrabalhadas;
    }
}
