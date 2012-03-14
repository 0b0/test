//: test/x.java
package test;

import java.util.Date;

/** Komentarz do klasy
 * @see nil
 */
public class x {
    /** Komentarz do skladowej.
     * Link do {@link test.nil#pusta_zmienna pustej zmiennej}
     */
    public int i;
    
    /** Komentarz do metody */
    public void f() {}
    
    /** Komentarz odnosnie
    * <pre>
    * System.out.println(new Date());
    * </pre>
    */
    public static void data() {
        System.out.println(new Date());
    }
    
    /** Przyklad <em>listy</em>:
    * <ol>
    * <li> Element pierwszy
    * <li> Element drugi
    * <li> Element trzeci
    * </ol>
    */
    public static void lista(){
        int[] list = {0,1,2,3,4,5,6,7,8,9};
    }
    
    public static void main(String[] args) {
        data();
        lista();
        /* test comment4 */
    }
}
///:~