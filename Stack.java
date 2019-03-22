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

class Stack
{
    private static final ArrayList<Integer> myStack = new ArrayList<Integer>();

    // Adds integers onto stack
    public void push(int number)
    {
        myStack.add(number);
    }

    // Removes last value of stack
    public int pop()
    {
        //removes top value from stack
        int update = myStack.remove(myStack.size()-1);
        return update;
    }

    // Converts stack into a string
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
