package exercicio.teste;
//https://github.com/junit-team/junit4/wiki/exception-testing
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import exercicio.Valores;

public class ValoresTeste {
    
	Valores res; //
	
	@Before //Fazer com que esse método seja iniciado antes de cada método
	public void setup(){
		res = new Valores();
		for(int i=1;i< 10;i++){
			res.ins(i);
		}
	}
	
	//Testando o metodo ins() 
	@Test
	public void testaSeValorPodeSerInserido(){
		assertTrue("O valor não foi inserido",res.ins(9));
	}
	
	@Test
	public void testaSeValorMenorOuIgual_a_ZeroPodeSerInserido() {
		assertFalse("O valor foi inserido",res.ins(-3));
	}
	@Test
	public void testaSeQtdAcimaQueDezPodeSerInserido(){
		res.ins(5);
		assertFalse("O valor foi inserido", res.ins(11));
	}
	
	//Testando o método del()
	@Test
	public void testaRemoverValor(){ 
		assertEquals("O valor não foi removido", 1, res.del(0));
	}
	@Test
	public void testaRemoverValorPosicaoMenorQueZero(){ 
		assertEquals("O valor foi removido", -1, res.del(-1));
	}
	@Test
	public void testaRemoverValorPosicaoMaiorQueDez(){ //A posição vai de 0 a 9
		res.ins(5);
		assertEquals("O valor foi removido", -1, res.del(10));
	}

	//Testando o métdo size()
	@Test
	public void testaTamanhoDoArray(){
		assertEquals("O tamanho está diferente",9,res.size());
	}
	
	//Testando o método mean()
	@Test
	public void testaMediaInteira(){
		assertEquals("A média está diferente",5,res.mean(),0);
	}
	@Test
	public void testaMediaFracionada(){
		res.ins(10);
		assertEquals("A média está diferente",5.5,res.mean(),0);
	}
	@After
	@Test
	public void testaSeRetornoEZeroCasoArrayForIgualAZero(){
		res = new Valores();
		assertEquals("O array é zero mas o retorno não é zero",0,res.mean(),0);
	}
	
	//Testando o método greater()
	@Test
	public void testaSeMaxEstaCorreto(){
		assertEquals("O maior valor está diferente",9,res.greater());
	}
	
	//Testando o método lower()
	@Test
	public void testaSeMinEstaCorreto(){
		assertEquals("O menor valor está diferente",1,res.lower());
	}


}
