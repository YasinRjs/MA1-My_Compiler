import java.util.*;

public class GenericStack<Template> {
    private ArrayList<Template> stack = new ArrayList<Template>();
    private int topOfStack = 0;

    public void push(Template elem){
        stack.add(topOfStack++, elem);
    }

    public Template pop(){
        return stack.remove(--topOfStack);
    }

    public boolean empty(){
        return topOfStack==0;
    }
}
