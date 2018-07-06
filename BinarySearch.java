package com.Securiter;

public class BinarySearch {
    int BinarySearch(int searchArray[], int o) {

        //variable initialisation, the limits, 0 and the last item in an array.
        int l = 0;
        int r = searchArray.length - 1;

        while (l <= r) {

            //variable initialistion, the middle element of the binary search
            int m = l + (r - 1) / 2;

            //when the middle matches the choice int, return the index, because it's successful.
            if (searchArray[m] == o) {
                return m;
            }

            //if the inferior limit is bigger than the middle, move the inferior limit at the previous middle+1 in order to create a new array further up
            if (searchArray[m] < o) {
                l = m + 1;
            }

            //if
            else {
                r = m - 1;
            }
        }
        return -1;
    }

}
