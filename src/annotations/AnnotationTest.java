package annotations;

import java.lang.reflect.Method;

public class AnnotationTest 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		@SuppressWarnings("unchecked")
		Class<AnnotationTest> clazz=(Class<AnnotationTest>) Class.forName("annotations.AnnotationTest");
		
		for(Method method : clazz.getDeclaredMethods())
		{
			System.out.println(method.getName());
			CustomAnnotation annotation=method.getAnnotation(CustomAnnotation.class);
			
			if(annotation!=null)
			{
				System.out.println(annotation.name());
				System.out.println(annotation.age());
			}
		}
	}
	
	@CustomAnnotation(name="Ashu",age=10)
	public void test1()
	{
		System.out.println("test1");
	}
	
	@CustomAnnotation
	public void test2()
	{
		System.out.println("test2");
	}
}
