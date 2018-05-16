package com.mpxds.mprest.domain.xml.atox;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Aluno")
public class Aluno {
	//
	@XmlElement(name="nome")
	private String nome;

	@XmlElement(name="idade")
	private int idade;

	@XmlElement(name="matricula")
	private int matricula;
	
//	private AlunoTurma alunoTurma;

	@XmlElement(name="AlunoTurma")
	private List<AlunoTurma> alunoTurmas = new ArrayList<>();
	
	// ---
	
	public Aluno() {
	}
	
	public Aluno(String nome, int idade, int matricula, List<AlunoTurma> alunoTurmas) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
		this.alunoTurmas = alunoTurmas;
	}
	 
	public String getNome() { return nome; }
	
	public int getIdade() { return idade; }
	
	public int getMatricula() { return matricula; }
	
//	public AlunoTurma getAlunoTurma() { return alunoTurma; }
	
	public List<AlunoTurma> getAlunoTurmas() { return alunoTurmas; }
    public void add(AlunoTurma alunoTurma) {
    	alunoTurmas.add(alunoTurma);
    }
 
	@Override
	public String toString() {
		//
		return "Aluno[Nome: " + this.nome + " - Idade: " + this.idade + " - Matricula: " + this.matricula +
				" - AlunoTurmas: " + alunoTurmas.size() + 
//				" - " + alunoTurma.toString() + 
				"]Aluno";
  	}

}