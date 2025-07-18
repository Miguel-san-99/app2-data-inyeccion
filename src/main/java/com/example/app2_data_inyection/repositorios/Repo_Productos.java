package com.example.app2_data_inyection.repositorios;

import com.example.app2_data_inyection.models.Producto;
import java.util.Arrays;
import java.util.List;

public class Repo_Productos {
    List<Producto> datos;

    public Repo_Productos() {
    }

    public Repo_Productos(List<Producto> datos) {
        this.datos = Arrays.asList(new Producto(001L, "Disco duro 1tb", 500),
                                                 new Producto(002L, "Mouse", 400),
                                                 new Producto(003L, "Memoria USB 20gb", 300));
    }
    
    public List<Producto> findAll(){
        return datos;
    }
    
    public Producto buscarId(Long idProducto){
        return datos.stream().filter(p->p.getIdProducto().equals(idProducto)).findFirst().orElse(null);
    }
    
}
