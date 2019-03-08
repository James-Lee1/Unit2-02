/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Mar 2019
 * Created for: ICS4U
 * This program creates a stack and pushes three numbers to it, and pops
 * the last value
 *
 ****************************************************************************/

import java.util.ArrayList;

class Stack {

    private final ArrayList<Integer> myStack = new ArrayList<Integer>();
    private static String update = "";

    public void push(int number)
    {
        myStack.add(number);
    }

    public String pop() 
    {
        //removes top value from stack
        int top = myStack.size()-1;
        myStack.remove(top);
        update = "Value was removed.";
        return update; 
    }

    public String toString()
    {
        String output = "";

        for (Integer count : myStack)
        {
            output += count + "\n";
        }

        return output.toString();
    }
}
