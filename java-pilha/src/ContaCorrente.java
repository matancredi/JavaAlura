
public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numero) {
    	// Passando os atributos no super, estamos escolhendo qual construtor da classe m�e iremos utilizar
    	super(agencia, numero);
    }
    
    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
	
    //Overrride confere se a fun��o existe mesmo na classe m�e para ser sobreescrita e retorna erro se tiver alguma coisa errada
    @Override
    public boolean saca(double valor) {
    	// Cada saque vai custar 20 centavos se a conta for corrente
    	double valorASacar = valor + 0.2;
    	return super.saca(valorASacar);
    }
}
