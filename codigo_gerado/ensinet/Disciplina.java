package ensinet;


/**
* @generated
*/
public class Disciplina {
    
    /**
    * @generated
    */
    private long idDisciplina;
    
    
    /**
    * @generated
    */
    private Set<Estudante> estudante;
    
    /**
    * @generated
    */
    private Educador educador;
    
    /**
    * @generated
    */
    private Set<Aula> aula;
    
    

    /**
    * @generated
    */
    private long getIdDisciplina() {
        return this.idDisciplina;
    }
    
    /**
    * @generated
    */
    private long setIdDisciplina(long idDisciplina) {
        this.idDisciplina = idDisciplina;
    }
    
    
    
    /**
    * @generated
    */
    public Educador getEducador() {
        return this.educador;
    }
    
    /**
    * @generated
    */
    public Educador setEducador(Educador educador) {
        this.educador = educador;
    }
    
    
    /**
    * @generated
    */
    public Set<Estudante> getEstudante() {
        if (this.estudante == null) {
            this.estudante = new HashSet<Estudante>();
        }
        return this.estudante;
    }
    
    /**
    * @generated
    */
    public Set<Estudante> setEstudante(Estudante estudante) {
        this.estudante = estudante;
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
    public static boolean existeDisciplina(long idDisciplina) {
        //TODO
        return false;
    }
    
    
}
