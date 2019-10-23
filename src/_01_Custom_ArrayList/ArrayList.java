package _01_Custom_ArrayList;

import javax.swing.JOptionPane;

import org.omg.CORBA.OBJ_ADAPTER;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] arr1;
	public ArrayList() {
	arr1 = (T[]) new Object[0];
	
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		if (loc > arr1.length - 1) {
			throw new IndexOutOfBoundsException();
		}
		return arr1[loc];
	}
	
	public void add(T val) {
		T[] arr2 = (T[]) new Object[arr1.length + 1];
		
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
			arr2[arr2.length - 1] = val;
			
			arr1 = arr2;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		if (loc > arr1.length - 1) {
			throw new IndexOutOfBoundsException();
		}
		T[] arr3 = (T[]) new Object[arr1.length + 1];
		for (int i = 0; i < loc; i++) {
			arr3[i] = arr1[i];
			
		}
	
		arr3[loc] = val;
		for (int i = loc; i < arr1.length; i++) {
			arr3[i + 1] = arr1[i];
		}
		arr1 = arr3;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		if (loc > arr1.length -1) {
			throw new IndexOutOfBoundsException();
		}
	arr1[loc] = val;
	
	
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		if (loc > arr1.length - 1) {
			throw new IndexOutOfBoundsException();
		}
	T[] arr4 = (T[]) new Object[arr1.length -1];
	for (int i = 0; i < loc; i++) {
		arr4[i] = arr1[i];
	}
	for (int i = loc; i < arr4.length; i++) {
	if (i >= loc) {
	 arr4[i] = arr1[i+1]; 
		
	}
	else if (i < loc) {
		arr1[i] = arr4[i];
	}	
	}
	arr1 = arr4;
	
	}
	
	public boolean contains(T val) {
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == val) {
				return true;
			}
		}
		
		
		return false;
	}

	public int size() {
		// TODO Auto-generated method stub
		
		return arr1.length;
	}
}