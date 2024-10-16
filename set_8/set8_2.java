package set_8;
import java.util.*;
class product
{
    String name;
    int price;
    double rating;

    product(String name , int price , double rating)
    {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String toString() {
        return " Product{name='" + name + "', price=" + price + ", rating=" + rating + "}";
    }

    public static product[] sort_name( product[] arr)
    {
        product[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr, Comparator.comparing(p -> p.name));
        return sortedArr;
    }

    public static product[] sort_price( product[] arr)
    {
        product[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr, Comparator.comparingInt(p -> p.price));
        return sortedArr;
    }

    public static product[] sort_rating( product[] arr)
    {
        product[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr, Comparator.comparingDouble(p -> p.rating));
        return sortedArr;
    }
}

public class set8_2 {
    public static void main(String[] args)
    {
        product[] PRODUCTS = {
            new product("Laptop", 1000, 4.5),
            new product("Phone", 500, 4.7),
            new product("Tablet", 300, 4.3),
            new product("Monitor", 200, 4.6),
            new product("Mouse", 25, 4.1)
        };

        product[] sortbyname = product.sort_name(PRODUCTS);
        product[] sortbyprice = product.sort_price(PRODUCTS);
        product[] sortbyrating = product.sort_rating(PRODUCTS);

        System.out.println(" Not Sort :");
        for (product p : PRODUCTS) { System.out.println(p); }
        System.out.println();

        System.out.println(" Sort By Name :");
        for (product q : sortbyname) { System.out.println(q); }
        System.out.println();

        System.out.println(" Sort By Price :");
        for (product r : sortbyprice) { System.out.println(r); }
        System.out.println();

        System.out.println(" Sort By Rating :");
        for (product s : sortbyrating) { System.out.println(s); }
        System.out.println();
    }
}
