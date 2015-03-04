public class HelloJNI 
{
   static {
      // hello.dll on Windows or libhello.so on Linux
      System.loadLibrary("hello"); 
   }
   private native void sayHello();
   private native void mousePosition();
 
   public static void main(String[] args) {
      // invoke the native method
      new HelloJNI().sayHello();  
      new HelloJNI().mousePosition();  
   }
}
