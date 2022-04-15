package edu.drexel.se320;

// Hamcrest
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.lessThan;

// Core JUnit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class Testing {

    @Test
    public void test1() {
        assertEquals(0, 0);
    }

    @Test
    public void int_array(){
        Integer[] arr = { 0, 1, 2 };
        assertEquals(1, BinarySearch.find(arr, 1));
    }

    @Test
    public void string_array(){
        String[] arr2 = { "a", "b", "c", "foo" };
        assertEquals(2, BinarySearch.find(arr2, "c"));
    }

    @Test
    public void duplicate_int(){
        Integer[] arr = { 0, 0, 1, 2, 4, 4, 5, 6 };
        assertEquals(4, BinarySearch.find(arr, 4));
    }

    @Test
    public void duplicate_string(){
        String[] arr = { "a", "a", "b", "c", "f", "g", "h"};
        assertEquals(1, BinarySearch.find(arr, "a"));
    }

    @Test
    public void duplicates_only_int(){
        Integer[] arr = { 2, 2, 2, 2};
        assertEquals(2, BinarySearch.find(arr, 2));
    }

    @Test
    public void duplicates_only_string(){
        String[] arr = { "j", "j", "j", "j"};
        assertEquals(2, BinarySearch.find(arr, "j"));
    }

    @Test
    public void even_num_int_elements(){
        Integer[] arr = { 0, 1, 2, 3 };
        assertEquals(2, BinarySearch.find(arr, 2));
    }

    @Test
    public void even_num_string_elements(){
        String[] arr = { "a", "b", "c", "d", "e", "f" };
        assertEquals(4, BinarySearch.find(arr, "e"));
    }

    @Test
    public void middle_index_int_array(){
        Integer[] arr = { 0, 1, 2, 3, 4 };
        assertEquals(2, BinarySearch.find(arr, 2));
    }

    @Test
    public void first_index_int_array(){
        Integer[] arr = { 0, 1, 2, 3, 4 };
        assertEquals(0, BinarySearch.find(arr, 0));
    }

    @Test
    public void last_index_int_array(){
        Integer[] arr = { 0, 1, 2, 3, 4 };
        assertEquals(4, BinarySearch.find(arr, 4));
    }

    @Test
    public void middle_index_string_array(){
        String[] arr = { "a", "b", "c", "d", "e", };
        assertEquals(2, BinarySearch.find(arr, "c"));
    }

    @Test
    public void first_index_string_array(){
        String[] arr = { "a", "b", "c", "d", "e", "f" };
        assertEquals(0, BinarySearch.find(arr, "a"));
    }

    @Test
    public void last_index_string_array(){
        String[] arr = { "a", "b", "c", "d", "e", "f" };
        assertEquals(5, BinarySearch.find(arr, "f"));
    }

    @Test
    public void float_array(){
        Float[] arr = { .1f, 1.23131f, 2.2f, 3.3f, 4.4f  };
        assertEquals(1, BinarySearch.find(arr, 1.23131f));
    }

    @Test
    public void double_array(){
        Double[] arr = { 0.1, 1.1, 2.2, 3.3, 4.4  };
        assertEquals(0, BinarySearch.find(arr, 0.1));
    }

    @Test
    public void boolean_array(){
        Boolean[] arr = {true, true, false, false, true};
        assertEquals(4, BinarySearch.find(arr, true));
    }

    @Test
    public void no_such_int_element_in_array(){
        Integer[] arr = { 0, 1, 2, 3, 4 };
        Exception exception = assertThrows(NoSuchElementException.class,
                () -> {BinarySearch.find(arr, 20); });
        assertEquals("Array is not properly sorted or no such element exist in array" , exception.getMessage());
    }

    @Test
    public void no_such_string_element_in_array(){
        String[] arr = {"a", "f", "h", "p", "z"};
        Exception exception = assertThrows(NoSuchElementException.class,
                () -> {BinarySearch.find(arr, "c"); });
        assertEquals("Array is not properly sorted or no such element exist in array" , exception.getMessage());
    }

    @Test
    public void no_element_in_array(){
        String[] arr = {};
        Exception exception = assertThrows(NoSuchElementException.class,
                () -> {BinarySearch.find(arr, "c"); });
        assertEquals("Array is not properly sorted or no such element exist in array" , exception.getMessage());
    }

    @Test
    public void look_for_null_element_in_array(){
        Integer[] arr = {0, 1, 2, 3, 4};
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> {BinarySearch.find(arr, null); });
        assertEquals("The argument is invalid" , exception.getMessage());
    }

    @Test
    public void null_element_in_array(){
        Integer[] arr = {0, 1 , null, 3, 4};
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> {BinarySearch.find(arr, 0); });
        assertEquals("The argument is invalid" , exception.getMessage());
    }

    @Test
    public void unsorted_array(){
        Integer[] arr = { 0, 3, 4, 1, 2};
        Exception exception = assertThrows(NoSuchElementException.class,
                () -> {BinarySearch.find(arr, 1); });
        assertEquals("Array is not properly sorted or no such element exist in array" , exception.getMessage());
    }

    @Test
    public void lower_out_of_bound(){
        Integer[] arr = {0, 1, 2, 3, 4};
        Exception exception = assertThrows(NoSuchElementException.class,
                () -> {BinarySearch.find(arr, -1); });
        assertEquals("Array is not properly sorted or no such element exist in array" , exception.getMessage());
    }

    @Test
    public void upper_out_of_bound(){
        Integer[] arr = {0, 1, 2, 3, 4};
        Exception exception = assertThrows(NoSuchElementException.class,
                () -> {BinarySearch.find(arr, 100); });
        assertEquals("Array is not properly sorted or no such element exist in array" , exception.getMessage());
    }






}

