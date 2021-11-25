package com.company;

public class Engine {
   public void dispatch(Task task, int param){
        task.execute(param);
    }

    public void shutdown(){

    }


}
