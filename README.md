# AssessmentTestAndroidBinar
Fatih Naufal

1. Layout
2. Android manifest
3. A.onCreate - A.onStart - A.onPause - B.onCreate - B.onStart B.OnResume - A.OnStop
4. startActivity method
5. muncul toast "in Background"
6. it should be android.permission.CALL_PHONE
7. 
public class MethodAnagram
{
    static void cekAnagram(String s1, String s2)
    {

        String copyOfs1 = s1.replaceAll("\\s", "");
 
        String copyOfs2 = s2.replaceAll("\\s", "");
 
        boolean status = true;
 
        if(copyOfs1.length() != copyOfs2.length())
        {

            status = false;
        }
        else
        {
            
            char[] s1Array = copyOfs1.toLowerCase().toCharArray();
 
            char[] s2Array = copyOfs2.toLowerCase().toCharArray();
 
            Arrays.sort(s1Array);
 
            Arrays.sort(s2Array);
 
            status = Arrays.equals(s1Array, s2Array);
        }
 
        if(status)
        {
            System.out.println(s1+" and "+s2+" adalah anagram");
        }
        else
        {
            System.out.println(s1+" and "+s2+" bukan anagram");
        }
    }

8. 
public class Duplikat
{
  private static String input;
  
  public static boolean cekKarakter(String kal, char x)
  {
  
     boolean ketemu=false;
     for (int i=0; i <kal.length(); i++)
     {
        if (kal.charAt(i)==x)
        {
           ketemu=true;
           break;
        }      
      }
      return ketemu;
  }
 
  public static String newInput(String input)
  {
      String kalimat="";
      for (int i=0; i <input.length(); i++)
      {
         if (!cekKarakter(kalimat, input.charAt(i)))
            kalimat+=input.charAt(i);
      }
      return kalimat;
  }
  
  public static void main(String args[])
  {
     System.out.print("Masukkan kata atau kalimat : ");
     
     Scanner obj = new Scanner(System.in);
     
     input=obj.nextLine();
 
     System.out.println("\n"+(newInput(input)));
  }
}
