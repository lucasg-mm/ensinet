package ensinet;


/**
* @generated
*/
public class Estudante extends Visitante {
    
    /**
    * @generated
    */
    private long idEstudante;
    
    /**
    * @generated
    */
    private String nome;
    
    /**
    * @generated
    */
    private String email;
    
    /**
    * @generated
    */
    private String senha;
    
    
    /**
    * @generated
    */
    private Set<Disciplina> disciplina;
    
    

    /**
    * @generated
    */
    private long getIdEstudante() {
        return this.idEstudante;
    }
    
    /**
    * @generated
    */
    private long setIdEstudante(long idEstudante) {
        this.idEstudante = idEstudante;
    }
    
    
    /**
    * @generated
    */
    private String getNome() {
        return this.nome;
    }
    
    /**
    * @generated
    */
    private String setNome(String nome) {
        this.nome = nome;
    }
    
    
    /**
    * @generated
    */
    private String getEmail() {
        return this.email;
    }
    
    /**
    * @generated
    */
    private String setEmail(String email) {
        this.email = email;
    }
    
    
    /**
    * @generated
    */
    private String getSenha() {
        return this.senha;
    }
    
    /**
    * @generated
    */
    private String setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    /**
    * @generated
    */
    public Set<Disciplina> getDisciplina() {
        if (this.disciplina == null) {
            this.disciplina = new HashSet<Disciplina>();
        }
        return this.disciplina;
    }
    
    /**
    * @generated
    */
    public Set<Disciplina> setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public boolean inserirDisciplinaMatriculadaNaBD(long idDisciplina) {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public int fazerMatricula(long idDisciplina) {
        //TODO
        return 0;
    }
    
    /**
    * @generated
    */
    public static boolean validarNome(String nome) {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public static boolean validarEmail(String email) {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public static boolean validarSenha(String senha) {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public boolean verificaMatriculado(long idDisciplina) {
        //TODO
        return false;
    }
    
    
}
