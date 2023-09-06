import ghidra.app.script.GhidraScript;

public class HelloWorld extends GhidraScript 
{
	@Override
    public void run() throws Exception 
	{
    	println("Hello world");
    }

}
