package Stack;

import java.util.ArrayList;

class StackOfStrings {
    private ArrayList<String> data;

    StackOfStrings(){
        this.data = new ArrayList<>();
    }

    void push(String s){
        this.data.add(s);
    }

    String pop(){
        int index = this.data.size()-1;
        return this.data.remove(index);
    }

    String peek(){
        return this.data.get(this.data.size()-1);
    }

    boolean isEmpty(){
       return this.data.size() == 0;
    }
}
