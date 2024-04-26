public class myArrayList {
    public static int size;
    public static int[] elements;
    /*public myArrayList(int size){
        elements = new int[size];
    }*/

    public myArrayList(){
        elements = new int[100];
        size = 0;
    }

    public myArrayList(int num) {
        elements = new int [ num ];
        size = 0;
    }


    void insertFront(int val){
        /*this requires you to ‘shuffle down’ the elements in order to
        open up the first cell of the array for the new element. Don’t forget to increment the
        Size variable. If the array elements is full then print out the message "LIST IS FULL".*/
        if(size == elements.length){
            System.out.println("LIST IS FULL");
            System.exit(-1);
        }
        for(int i = size; i >= 1; i--){
            elements[i] = elements[i-1];
        }
        elements[0] = val;
        size++;
    }

    void insertRear(int val){
        /*place  the new item into elements[ Size ] and then increment
        Size. Again, print out an appropriate "LIST IS FULL" message if the
        list is, in fact, full prior to this call.*/
        if(size == elements.length){
            System.out.println("LIST IS FULL");
        }
        elements[size] = val;
            size++;


    }

    void insertPos(int val, int pos){
        /* you will need to shuffle down all of the elements
        starting at elements[ pos – 1 ] through elements[ Size -1 ] then place the new item into
        elements [ pos – 1 ] and increment the Size variable.   Note that you should check the
        value of pos to make sure that it is NOT greater than Size or less than or equal to 0. If
        it is greater than Size or less than or equal to 0, then print an error message and exit
        with  System.exit(-2); .*/

       if(size == elements.length){
            System.out.println("LIST IS FULL");
            System.exit(-1);
        }
        if(pos <= 0 || pos > elements.length){
            System.out.println("ERROR : NO SUCH POSITION IN LIST");
            System.exit(-2);
        }
        size++;
        for(int i = size; i >= pos; i--){
            elements[i] = elements[i-1];
        }

        elements[pos-1] = val;

    }

    int deleteFront(){
        /*make a copy of elements[ 0 ] and then shuffle all of the elements
        from elements[ 1 ] to elements[ Size – 1 ] up one position each. Then return the copied
        first element. Remember to decrement Size. */
        int copy = elements[0];
        for(int i = 1; i < size; i++){
            elements[i-1] = elements[i];
        }
        size--;
        return copy;
    }

    int deleteRear(){
        /*all you need to do is decrement the Size value and then return
        elements[ Size]  that’s all. Be sure you decrement before you return the element at the
        new Size value. */
        int copy = elements[size];
        size--;
        return copy;
    }

    int deletePos(int pos){
        /*you will need to make a copy of the value at
    elements[ pos – 1 ], shuffle up all of the values from elements[ pos ] through elements
    [Size – 1 ], decrement the Size variable and then return the copy that you made.*/
        int copy = elements[pos - 1];
        for(int i = pos; i < size; i++){
            elements[i-1] = elements[i];
        }
        size--;
        return copy;

    }

    void printList(){
        //walk through the array from elements[ 0 ] to elements[Size-1] and
        //print out each element one per line. If the array is empty print an appropriate
        //message.
        //if(?????)

        for(int i = 1; i <= size ; i++){
            System.out.println(i + " : " + elements[i-1]);
        }
    }

    boolean isEmpty(){
        // if Size == 0 then return true else return false
        if(size == 0)
            return true;
        else
            return false;
    }

    boolean isFull(){
        //returns true if the current elements[ ] array is Full otherwise it
        //returns false.
        if(size == elements.length)
            return true;
        else
            return false;
    }

    int getItem(int pos){
        // make sure that the given position actually exists and if so then
        //return  elements[ pos – 1 ] if the position does not exist then print an appropriate
        //error message (see sample output).
       //

       return elements[pos-1];
    }

    int getSize(){
        //simply return the value of the Size variable.
        return size;
    }
}
