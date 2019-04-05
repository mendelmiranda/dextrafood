package br.com.dextra.dextrafood.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.dextra.dextrafood.controller.Cardapio;
import br.com.dextra.dextrafood.model.Lanche;

/**
 *
 * @author Wendell
 */
@WebServlet(value = "/cardapio", name = "CardapioServlet")
public class CardapioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Cardapio cardapio = new Cardapio();

    public CardapioServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(200);
        resp.setHeader("Content-Type", "application/json");
        resp.setContentType("application/json;charset=UTF-8");

        try {
            List<Lanche> lanches = cardapio.listaLancheDoCardapio();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(lanches);

            resp.getWriter().print(json);
            
            
        }catch(Exception e) {
        	e.printStackTrace();
        }/*finally {
        	out.close();
        }*/
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(201);
        String clientOrigin = req.getHeader("origin");
        resp.setHeader("Access-Control-Allow-Origin", clientOrigin);
        resp.setHeader("Access-Control-Allow-Methods", "POST");
        resp.setHeader("Access-Control-Allow-Headers", "Content-Type");
        resp.setHeader("Access-Control-Max-Age", "86400");

        resp.setHeader("Content-Type", "application/json");
        String nome = req.getParameter("nome");
        resp.getWriter().print("{\"message\": \"" + nome + "\"}");
        
        System.out.println("nome: "+nome);
        
        resp.getWriter().print("Nome: "+nome);
        
        //i ok redirect to message page about 
    }

}
