package com.example.SistemaDeTarefas.db;

import com.example.SistemaDeTarefas.model.Tarefa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

public class TarefaDAO {
    private EntityManagerFactory factory = Persistence
            .createEntityManagerFactory("tarefas");
    private EntityManager em = factory.createEntityManager();

    public Tarefa getTarefaPorTitulo(String tituloQuery){
        try{
            Tarefa tarefa = (Tarefa) em
                    .createQuery(
                            "SELECT t FROM Tarefa t WHERE t.titulo = :tituloQuery"
                    )
                    .setParameter("tituloQuery", tituloQuery)
                    .getSingleResult();

            return tarefa;
        }catch(NoResultException ex){
            return null;
        }
    }

    public boolean adicionarTarefa(Tarefa t){
        try{
            em.persist(t);
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    public boolean deletarTarefa(Tarefa t){
        try{
            em.remove(t);
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }
}
