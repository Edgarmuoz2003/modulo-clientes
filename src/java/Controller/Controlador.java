
package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import Config.Conexion;
import Entidad.Cliente;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Controlador {
    Conexion con = new Conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar());
    ModelAndView mav = new ModelAndView();
    
    
    @RequestMapping("index.htm")
    public ModelAndView Listar(){
        String sql = "select * from clientes";
        List datos = this.jdbcTemplate.queryForList(sql);
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
}
