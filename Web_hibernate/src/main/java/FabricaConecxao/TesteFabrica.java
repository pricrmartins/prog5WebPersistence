package FabricaConecxao;

import java.util.ArrayList;
import java.util.List;

import Dao.GenericDao;
import entity.Endereco;
import entity.Filme;
import entity.Usuario;

public class TesteFabrica {
	public static void main(String[] args) {

/*
		Usuario u = new Usuario();
		u.setNome("Maria");
		u.setCpf("12312312312");
		u.setSenha("123");
		Endereco e = new Endereco();
		u.setEndereco(e);
		e.setNomeRua("Rua 7 de setembro");
		e.setNumero("123");
		e.setComplemento("NDA");
		ArrayList<Filme> fs = new ArrayList<Filme>();
		Filme f = new Filme();
		f.setAno(1234);
		f.setNomeFilme("Aux1");
		fs.add(f);
		f = new Filme();
		f.setAno(1235);
		f.setNomeFilme("Aux2");
		fs.add(f);
		f = new Filme();
		f.setAno(1236);
		f.setNomeFilme("Aux3");
		fs.add(f);
		
		u.setFilmes(fs);
		
		GenericDao dao = new GenericDao();
		System.out.println(dao.salvar(u));
		*/
		
		/*
		GenericDao dao = new GenericDao();
		Usuario usuario = dao.carregarUsuario("12312312312");
		System.out.println("Usuario nome: "+usuario.getNome());
		List<Filme> fs = new ArrayList<Filme>();
		Filme f = new Filme();
		f.setAno(1234);
		f.setNomeFilme("a1");
		fs.add(f);
		f = new Filme();
		f.setAno(1235);
		f.setNomeFilme("a2");
		fs.add(f);
		f = new Filme();
		f.setAno(1236);
		f.setNomeFilme("a5");
		fs.add(f);
		
		fs = dao.adicionarFilme("12312312312", f);
		System.out.println("Filme nome: "+fs.size());*/
		GenericDao dao = new GenericDao();
		System.out.println(dao.removerFilme("0123456789","filme1"));
	}
}
