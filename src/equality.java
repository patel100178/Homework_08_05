public class equality {
public static void  equality_checking_two_arrays(int[] a, int[] b){
  boolean  equalOrNot = true;
  if(a.length == b.length){
  for (int i  = 0; i < a.length; i++){
  if(a[i] != b[i]){
  equalOrNot = false;
  }
  }
  }
  if  (equalOrNot)
  {
  System.out.println("Two arrays are equal.");
  }
  else
  {
  System.out.println("Two  arrays are not equal.");
  }
 }

 public static void  main(String[] args)
 {
  int[] array1 =  {2, 5, 6, 8, 11};
  int[] array2 =  {2, 5, 7, 8, 11};
  equality_checking_two_arrays(array1,  array2);

 }
}