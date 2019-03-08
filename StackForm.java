class StackForm
{
    public static void main(String[] args)
    {
        Stack stack = new Stack();
        stack.push(29);
        stack.push(2);
        stack.push(10);
        System.out.println(stack.pop());
        System.out.println(stack.toString());
    }
}
