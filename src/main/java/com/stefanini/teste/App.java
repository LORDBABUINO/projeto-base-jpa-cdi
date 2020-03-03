package com.stefanini.teste;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.inject.Inject;

import com.stefanini.model.Perfil;
import com.stefanini.model.Pessoa;
import com.stefanini.servico.PerfilServico;
import com.stefanini.servico.PessoaServico;

public class App {

	@Inject
	private PessoaServico servico;

	@Inject
	private PerfilServico perfilServico;

	public static void main(String[] args) {
		// CONFIGURACAO PARA INICIAR O CONTAINER PARA GERENCIAMENTO DO CDI
		SeContainerInitializer initializer = SeContainerInitializer.newInstance();
		try (final SeContainer container = initializer.initialize()) {
			App app = container.select(App.class).get();
			app.executar();
		}
	}

	public void executar() {
		buscarTodos();
//		encontrar();
//		salvar();
//		remover();
	}
	
	
	private void remover() {
		servico.remover(5L);
	}

	private void encontrar() {
		Optional<Pessoa> pessoa = servico.encontrar(5L);
		if (pessoa.isPresent()) {
			System.out.println("Pessoa encontrada");
			System.out.println(pessoa.get());
		} else {
			System.out.println("Pessoa não encontrada");
		}
	}

	private void buscarTodos() {
		servico.getList().ifPresent(i -> {
			i.forEach(b -> {
				System.out.println(b);
			});
		});
		perfilServico.getList().ifPresent(i -> {
			i.forEach(b -> {
				System.out.println(b);
			});
		});
//		System.out.println();
	}

	public void salvar() {

		Pessoa pessoa = new Pessoa("JOAO", "joao@email.com", LocalDate.of(1995, 8, 24), true);
		servico.salvar(pessoa);

		Perfil perfil = new Perfil("jorge", "descrição do perfil do jorge", new Date(), new Date());
		perfilServico.salvar(perfil);
	}

}
