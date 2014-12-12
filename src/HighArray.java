/**
 * Created by Polygor on 31.08.14.
 */
class HighArray
{
private long[] a; // Link on Array "a"
private int nElems; //Amount of array elements
//------------------------------------------------------------------------|
public HighArray (int max)  //Constructor
{
a = new long[max]; // Creation of Array
nElems = 0; // No elements yet
}
//------------------------------------------------------------------------|
public boolean find (long searchKey)
{                                  //Searching key Value
int j;
for (j=0; j<nElems; j++)          //ForEachElement
if (a[j] == searchKey)            //searchKey found?
break;
if (j == nElems)             //Last element reached?
return false;               //yes
else
return true;               //no
}
//------------------------------------------------------------------------|
public void insert (long value)  //Inserting of array elements
{
a[nElems] = value;   // Inserting itself
nElems++;            // Increasing Size
}
//-----------------------------------------------------------------------|
public boolean delete (long value)
{
int j;
for (j=0; j<nElems; j++) // Searching key value
if (value == a[j])
break;
if (j==nElems) // search key no found
return false;
else          //search key found
{
for (int k=j; k<nElems; k++) //Moving next elements
a[k] = a[k+1];
nElems--;         //Decreasing size
return true;
}
}
//-----------------------------------------------------------------------|
public void display ()        // Output of array elements
{
for (int j=0; j<nElems; j++) // For Each Element
System.out.print(a[j] + " "); //Output
System.out.println("");
}
//-----------------------------------------------------------------------
} // End of HighArray java class




























