package br.com.dextra.dextrafood.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.dextra.dextrafood.controller.Cardapio;
import br.com.dextra.dextrafood.model.Ingrediente;
import br.com.dextra.dextrafood.model.Lanche;

/**
 *
 * @author Wendell
 */
@WebServlet(value = "/ingredientes", name = "IngredientesServlet")
public class IngredientesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Cardapio cardapio = new Cardapio();

    public IngredientesServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(200);
        resp.setHeader("Content-Type", "application/json");
        resp.setContentType("application/json;charset=UTF-8");

        try {
            List<Ingrediente> ingredientes = cardapio.listaDeIngredientes();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(ingredientes);

            resp.getWriter().print(json);
            
            
        }catch(Exception e) {
        	e.printStackTrace();
        }/*finally {
        	out.close();
        }*/
    }

    

}
