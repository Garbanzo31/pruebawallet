package pe.edu.upc.vwalletweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.vwalletweb.dtos.MenuDTO;
import pe.edu.upc.vwalletweb.dtos.MenuDisponiblePorSedeDTO;
import pe.edu.upc.vwalletweb.dtos.MenusCarosDTO;
import pe.edu.upc.vwalletweb.entities.Menu;
import pe.edu.upc.vwalletweb.serviceinterfaces.IMenuService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private IMenuService mS;

    @PostMapping
    public void registrar(@RequestBody MenuDTO menuDTO) {
        ModelMapper r = new ModelMapper();
        Menu menu = r.map(menuDTO, Menu.class);
        mS.insert(menu);
    }

    @PutMapping()
    public void modificar(@RequestBody MenuDTO menuDTO) {
        ModelMapper m = new ModelMapper();
        Menu menu = m.map(menuDTO, Menu.class);
        mS.insert(menu);
    }

    @GetMapping
    public List<MenuDTO> list() {
        return mS.list().stream().map(y -> {
            ModelMapper l = new ModelMapper();
            return l.map(y, MenuDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        mS.delete(id);
    }

    @GetMapping("/MenuDisponiblePorSede")
    public List<MenuDisponiblePorSedeDTO> MenuDisponiblePorSede() {
        List<String[]> menusedefilaLista = mS.MenuDisponiblePorSede();
        List<MenuDisponiblePorSedeDTO> dtoLista = new ArrayList<>();
        for (String[] columna : menusedefilaLista) {
            MenuDisponiblePorSedeDTO dto = new MenuDisponiblePorSedeDTO();
            dto.setIdCafeteria(Integer.parseInt(columna[0]));
            dto.setIdMenu(Integer.parseInt(columna[1]));
            dto.setPrecioMenu(Float.parseFloat(columna[2]));
            dto.setEntrada(columna[3]);
            dto.setPlatoPrincipal(columna[4]);
            dto.setPostre(columna[5]);
            dto.setRefresco(columna[6]);
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/top")
    public List<MenusCarosDTO> menusCaros() {
        List<String[]> menusDeFilaLista = mS.menusCaros();
        List<MenusCarosDTO> dtoLista = new ArrayList<>();
        for (String[] columna : menusDeFilaLista) {
            MenusCarosDTO dto = new MenusCarosDTO();
            dto.setMenu(columna[0]);
            dto.setGasto(Float.parseFloat(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}