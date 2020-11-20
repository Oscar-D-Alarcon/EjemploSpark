/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplospark;
import com.google.gson.Gson;
import com.todo.controllers.TaskController;
import com.todo.routes.TaskRoute;
import static spark.Spark.*;


        
/**
 *
 * @author Yo mero
 */
public class Main {
    public static void main(String[] args){
        new TaskRoute(new TaskController());
    }            
}
