package tns.com.annotation;

//Custom Annotation
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnot1
{
	int sound();
}
class P
{
	@MyAnot1(sound = 20)
	public void display()
	{
		System.out.println("Custom Annotations");
	}
}

public class Example4 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		P obj=new P();
		Method m=obj.getClass().getMethod("display");
		MyAnot1 a=m.getAnnotation(MyAnot1.class);
		System.out.println(a.sound());
	}

}