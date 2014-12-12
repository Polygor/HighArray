/**
 * Created by Polygor on 31.08.14.
 */
class HighArrayApp
{
public static void main (String[] args)
{
int maxSize = 100; // Array Size
HighArray arr;     // Array link
arr = new HighArray(maxSize); // Creation of Array

    arr.insert(77);            // 10 elements inserting
    arr.insert(99);
    arr.insert(44);
    arr.insert(55);
    arr.insert(22);
    arr.insert(88);
    arr.insert(11);
    arr.insert(00);
    arr.insert(66);
    arr.insert(33);

    arr.display(); // Output of Elements

    int searchKey = 99; // Searching of Element
    if (arr.find(searchKey) )
    System.out.println ("Found " + searchKey);
    else
    System.out.println ("Can't find " + searchKey);

    arr.delete (00); // Deleting of 3 elements
    arr.delete (55);
    arr.delete (99);

    arr.display();  // Repeating output
}
} // End of HighArrayApp class
////////////////////////////////////////////////////////////////

