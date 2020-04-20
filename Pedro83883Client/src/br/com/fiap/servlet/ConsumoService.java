package br.com.fiap.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.service.ProdutoServiceStub;
import br.com.fiap.service.ProdutoServiceStub.Cadastrar;
import br.com.fiap.service.ProdutoServiceStub.CadastrarResponse;
import br.com.fiap.service.ProdutoServiceStub.Listar;
import br.com.fiap.service.ProdutoServiceStub.ListarResponse;
import br.com.fiap.service.ProdutoServiceStub.Produto;


/**
 * Servlet implementation class ConsumoService
 */
public class ConsumoService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsumoService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProdutoServiceStub pss = new ProdutoServiceStub();

		Cadastrar c = new Cadastrar();

		c.setNome(request.getParameter("name"));
		c.setDesc(request.getParameter("desc"));
		c.setFabricante(request.getParameter("fab"));
		c.setValor(Double.parseDouble(request.getParameter("val")));

		CadastrarResponse cr = pss.cadastrar(c);

		int i = cr.get_return();
		
		request.setAttribute("resp", i);
		
		Listar l = new Listar();
		
		ListarResponse lr = pss.listar(l);
		
		Produto[] p = lr.get_return();

		request.setAttribute("Lista", p);
		
		request.getRequestDispatcher("Index.jsp").forward(request, response);
	}

}
