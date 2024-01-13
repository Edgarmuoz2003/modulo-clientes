
package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import Config.Conexion;
import Entidad.Cliente;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Controlador {
    Conexion con = new Conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar());
    ModelAndView mav = new ModelAndView();
    int id;
    List datos;
    
    
    @RequestMapping("index.htm")
    public ModelAndView Listar(){
        String sql = "select * from clientes";
        datos = this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista", datos);
        mav.setViewName("index");
        return mav;
    }
    
    @RequestMapping(value = "agregar.htm", method = RequestMethod.GET)
    public ModelAndView Agregar(){
        mav.addObject(new Cliente());
        mav.setViewName("agregar");
        return mav;
    }
    
    @RequestMapping(value = "agregar.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(Cliente c){
        String sql="insert into clientes(ID, RazonSocial, TELEFONO, DIRECCION) values(?,?,?,?)";
        this.jdbcTemplate.update(sql, c.getID(), c.getRazonSocial(), c.getTELEFONO(), c.getDIRECCION());
        return new ModelAndView("redirect:/index.htm");
    }
    
    @RequestMapping(value = "editar.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        String sql = "select * from clientes where id=" + id;
        datos = this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista", datos);
        mav.setViewName("Editar");
        return mav;
    }
    
    @RequestMapping(value = "editar.htm", method = RequestMethod.POST)
    public ModelAndView editar(Cliente c){
        String sql="update clientes set ID=?, RazonSocial=?, TELEFONO=?, DIRECCION=? where id=" +id;
        this.jdbcTemplate.update(sql, c.getID(), c.getRazonSocial(), c.getTELEFONO(), c.getDIRECCION());
        return new ModelAndView("redirect:/index.htm");
    }
    
    @RequestMapping(value = "eliminar.htm")
    public ModelAndView eliminar(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        String sql="delete from clientes where id=" +id;
        this.jdbcTemplate.update(sql);
        return new ModelAndView("redirect:/index.htm");
    }
}
