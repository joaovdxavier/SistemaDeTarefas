package com.example.SistemaDeTarefas.managedBeans;

import com.example.SistemaDeTarefas.db.TarefaDAO;
import com.example.SistemaDeTarefas.model.Tarefa;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class TarefaBean {
    private TarefaDAO tarefaDAO = new TarefaDAO();
    private Tarefa tarefa = new Tarefa();

    public String envia(){
        tarefa = tarefaDAO.getTarefaPorTitulo(tarefa.getTitulo());

        if(tarefa == null){
            tarefa = new Tarefa();
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Nenhuma tarefa encontrada."
                            , "Erro ao exibir")
            );
            return null;
        }else{
            return "/main";
        }
    }

    public Tarefa getTarefa(){
        return this.tarefa;
    }

    public void setTarefa(Tarefa t){
        this.tarefa = t;
    }
}
