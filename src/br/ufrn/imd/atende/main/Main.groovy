package br.ufrn.imd.atende.main

import br.ufrn.imd.atende.modelo.*
import br.ufrn.imd.atende.dao.*

class Main {
	static main(args) {
		def readln = javax.swing.JOptionPane.&showInputDialog
		def a = readln 'Digite o numero referente ao seu perfil:\n1-Gerente\n2-Suporte\n3-Usuario: '
			
		/* Uma opcao
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
		print "Digite o numero referente ao seu perfil:\n1-Gerente\n2-Suporte\n3-Usuario\nOpcao: "
		def a = br.readLine()*/
		
		if(a=="1"){ //Gerente
			def b = readln 'Acao:\n1-Cadastrar Usuario\n2-Remover Usuario\n3-Alterar Usuario\n4-Listar Chamados\n5-Atribuir chamado a um responsavel: '
			if(b=="1"){
				Usuario user = new Usuario()
				user.login = readln 'Digite o Login:'
				user.perfil = readln 'Digite o perfil:'
				user.senha = readln 'Digite a senha:'
				ListaUsuario.add(user)
			}
			else if(b=="2"){

			}
			else if(b=="3"){
				
			}
			else if(b=="4"){
				
			}
			else if(b=="5"){
				
			}
		}
		else if(a=="2"){ //Suporte
			def b = readln 'Acao:\n1-Listar meus chamados\n2-Movimentar chamado: '
	 
		}
		else if(a=="3"){ //Usuario
			def b = readln 'Acao:\n1-Listar meus chamados\n2-Abrir chamado: '
			
		}
		else {
			println "Opcao invalida."
		}
	}
}
