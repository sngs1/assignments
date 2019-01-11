package myPack;

public interface Stack {
	 void push(int I);
     int pop();
}

class FixedStack implements Stack
{
        private int stack[ ];
        private int tos;
        FixedStack(int size)
        {
                stack=new int[size];
                tos=-1;
        }
        public void push(int item)
        {
                if(tos==stack.length-1)
                {
                        System.out.println("Stack Overflows");
                        int t[ ]=new int[stack.length * 2];
                        for(int i=0;i<stack.length;i++)
                                t[i]=stack[i];
                        stack=t;
                        stack[++tos]=item;
                }
                else
                        stack[++tos]=item;
        }
        public int pop()
        {
                if(tos<0)
                {
                        System.out.println("Stack Underflows");
                        return 0;
                }
                else
                        return stack[tos--];
        }
}
class VariableStack implements Stack
{
        private int varStack[ ];
        private int tos;
        VariableStack(int size)
        {
        	varStack=new int[size];
                tos=-1;
        }
        public void push(int item)
        {
                if(tos==varStack.length-1)
                {
                        System.out.println("Stack Overflows.");
                        int t[ ]=new int[varStack.length * 2];
                        for(int i=0;i<varStack.length;i++)
                                t[i]=varStack[i];
                        varStack=t;
                        varStack[++tos]=item;
                }
                else
                	varStack[++tos]=item;
        }
        public int pop()
        {
                if(tos<0)
                {
                        System.out.println("Stack Underflows.");
                        return 0;
                }
                else
                        return varStack[tos--];
        }
}
class StackTest
{
        public static void main(String args[ ])
        {
                FixedStack fs=new FixedStack(3);
                VariableStack ds=new VariableStack(5);
                Stack myStack;
                for(int i=0;i<3;i++)
                        fs.push(i);
                System.out.println("Fixed length Stack Contents are.");
                for(int i=0;i<3;i++)
                        System.out.println(fs.pop());
                for(int i=0;i<7;i++)
                        ds.push(i);
                System.out.println("Dynamic length Stack Contents are");
                for(int i=0;i<7;i++)
                        System.out.println(ds.pop());
                myStack=fs;
                for(int i=0;i<3;i++)
                	myStack.push(i);
                System.out.println("Fixed length Stack Contents using interface reference");
                for(int i=0;i<3;i++)
                        System.out.println(myStack.pop());
                myStack=ds;
                for(int i=0;i<7;i++)
                	myStack.push(i);
                System.out.println("Dynamic length Stack Contents using interface reference");
                for(int i=0;i<7;i++)
                        System.out.println(myStack.pop());
        }
}