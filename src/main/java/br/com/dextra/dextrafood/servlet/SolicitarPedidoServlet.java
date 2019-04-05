package br.com.dextra.dextrafood.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.synth.SynthSeparatorUI;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.dextra.dextrafood.controller.Pedido;
import br.com.dextra.dextrafood.model.Ingrediente;
import br.com.dextra.dextrafood.model.Lanche;

/**
 * Servlet implementation class SolicitarPedido
 */
@WebServlet(value = "/solicitar", name = "SolicitarPedidoServlet")
public class SolicitarPedidoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Pedido pedido = new Pedido();
	private Lanche lancheCustomizado = new Lanche();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SolicitarPedidoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setStatus(200);
        response.setHeader("Content-Type", "application/json");
        response.setContentType("application/json;charset=UTF-8");

        try {
  
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(this.lancheCustomizado);

            response.getWriter().print(json);
            
            
        }catch(Exception e) {
        	e.printStackTrace();
        }/*finally {
        	out.close();
        }*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		String ingredientes[] = request.getParameterValues("ingredientes");
        String descricao = request.getParameter("descricao");
        
        lancheCustomizado.getIngredientes().clear();
        
    	    lancheCustomizado.setDescricao(descricao);

		for(String ingrediente : ingredientes) {
			int quantidade = Integer.parseInt(request.getParameter("quantidade"+ingrediente));
			
			lancheCustomizado.adicionaIngrediente(pedido.montaIngrediente(ingrediente, quantidade));
		}
	    
	    response.sendRedirect("/resultado.html");
	    
	}

}
