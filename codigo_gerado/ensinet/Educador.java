package ensinet;
import java.io.File; 


/**
* @generated
*/
public class Educador extends Estudante {
    
    
    /**
    * @generated
    */
    private Disciplina disciplina;
    
    /**
    * @generated
    */
    private Set<Aula> aula;
    
    

    
    /**
    * @generated
    */
    public Disciplina getDisciplina() {
        return this.disciplina;
    }
    
    /**
    * @generated
    */
    public Disciplina setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    
    /**
    * @generated
    */
    public Set<Aula> getAula() {
        if (this.aula == null) {
            this.aula = new HashSet<Aula>();
        }
        return this.aula;
    }
    
    /**
    * @generated
    */
    public Set<Aula> setAula(Aula aula) {
        this.aula = aula;
    }
    
    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public int disponibilizarAula(String nomeDaAula, String descricao, File video, long idDisciplina) {
        //TODO
        return 0;
    }
    
    
}
