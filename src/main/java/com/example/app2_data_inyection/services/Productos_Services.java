package com.example.app2_data_inyection.services;

import com.example.app2_data_inyection.models.Producto;
import com.example.app2_data_inyection.repositorios.Repo_Productos;
import java.util.List;

public class Productos_Services {
    private Repo_Productos repositorio = new Repo_Productos();
    public List<Producto> findAll(){
        return repositorio.findAll();
    }
    public Producto buscarId(Long idProducto){
        return repositorio.buscarId(idProducto);
    }
}
