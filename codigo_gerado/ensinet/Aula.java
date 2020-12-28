package ensinet;
import java.io.File; 


/**
* @generated
*/
public class Aula {
    
    /**
    * @generated
    */
    private long idAula;
    
    /**
    * @generated
    */
    private long idDisciplina;
    
    /**
    * @generated
    */
    private int numeroAvaliacoesPositivas;
    
    /**
    * @generated
    */
    private int numeroAvaliacoesNegativas;
    
    
    /**
    * @generated
    */
    private Disciplina disciplina;
    
    /**
    * @generated
    */
    private Educador educador;
    
    

    /**
    * @generated
    */
    private long getIdAula() {
        return this.idAula;
    }
    
    /**
    * @generated
    */
    private long setIdAula(long idAula) {
        this.idAula = idAula;
    }
    
    
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
    private int getNumeroAvaliacoesPositivas() {
        return this.numeroAvaliacoesPositivas;
    }
    
    /**
    * @generated
    */
    private int setNumeroAvaliacoesPositivas(int numeroAvaliacoesPositivas) {
        this.numeroAvaliacoesPositivas = numeroAvaliacoesPositivas;
    }
    
    
    /**
    * @generated
    */
    private int getNumeroAvaliacoesNegativas() {
        return this.numeroAvaliacoesNegativas;
    }
    
    /**
    * @generated
    */
    private int setNumeroAvaliacoesNegativas(int numeroAvaliacoesNegativas) {
        this.numeroAvaliacoesNegativas = numeroAvaliacoesNegativas;
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
    public Disciplina getDisciplina() {
        return this.disciplina;
    }
    
    /**
    * @generated
    */
    public Disciplina setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public static boolean verificaFormatoVideo(File video) {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public static boolean existeAula(long idAula) {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public boolean verificaSePrivada() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public void exibirVideo() {
        //TODO
        return;
    }
    
    /**
    * @generated
    */
    public void exibirMsgErro(String mensagem) {
        //TODO
        return;
    }
    
    
}
