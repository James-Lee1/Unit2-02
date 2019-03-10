/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Mar 2019
 * Created for: ICS4U
 * This program uses the class Stack, and pushes three numbers to it, and
 * pops the last value in the stack
 *
 ****************************************************************************/

class StackForm
{
    public static void main(String[] args)
    {
        // Instantiates stack
        Stack stack = new Stack();

        // Pushes 3 numbers
        stack.push(29);
        stack.push(2);
        stack.push(10);

        // Pops last number
        System.out.println(stack.pop());

        // Prints out the whole stack
        System.out.println(stack.toString());
    }
}
