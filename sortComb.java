import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.management.RuntimeErrorException;
import javax.swing.JPanel;
import javax.swing.text.AbstractDocument.Content;

public class HomeWork {

	static int[] sortCombArray(int[] arr){
		int y = 0, i = 0;
		int size = arr.length;
		y = (int)((size - 1) / 1.247);
		int k = y;
		for (i = 0; i < size;){
			if (k != 0){
				int temp = arr[i];
				if (arr[i] > arr[k]){
					arr[i] = arr[k];
					arr[k] = temp;
				}
				i++;
				k++;
				if (k == size){
					i = 0;
					k = (int)(y / 1.247);
					y = k;
				}	
			}
			else 
				break;
		}
		return arr;
	}

	static void initArray(int[] arr){
		for (int i = 0; i < arr.length; i++){
			Random r = new Random();
			arr[i] = r.nextInt(5000);
		}
	}
	
	static void printArray(int[] arr){
		for (int i = 0; i < arr.length; i++){
			if (i < arr.length - 1)
				System.out.print(arr[i] + ",");
			else
				System.out.print(arr[i]);
		}
		System.out.println();
	}

	static ArrayList<Integer> sortCombList(ArrayList<Integer> list){
		int y = 0, i = 0;
		int size = list.size();
		y = (int)((size - 1) / 1.247);
		int k = y;
		for (i = 0; i < size;){
			if (k != 0){
				int temp = list.get(i).intValue();
				if (list.get(i).intValue() > list.get(k).intValue()){
					list.set(i, list.get(k).intValue());
					list.set(k, temp);
				}
				i++;
				k++;
				if (k == size){
					i = 0;
					k = (int)(y / 1.247);
					y = k;
				}	
			}
			else 
				break;
		}
		return list;
	}
	
	static void initArrayList(ArrayList<Integer> list, int size){
		for (int i = 0; i < size; i++){
			Random r = new Random();
			list.add(r.nextInt(5000));
		}
	}
	
	static void printArrayList(ArrayList<Integer> list){
		int i = 0;
		for (Integer val : list){
			if (i != list.size())
				System.out.print(val + ",");
			else
				System.out.print(val);
			i++;
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] arr = new int[100000];
		long time = System.currentTimeMillis();
		initArrayList(list, 100000);
		System.out.println("�������� ������:");
		printArrayList(list);
		sortCombList(list);
		System.out.println("����� ����������� �� ���������� ������- " + (System.currentTimeMillis() - time));
		printArrayList(list);
		System.out.println("�������� ������:");
		initArray(arr);
		printArray(arr);
		System.out.println("���������� ������� ������� \"���������\":");
		time = System.currentTimeMillis();
		sortCombArray(arr);
		System.out.println("����� ����������� �� ���������� ������� - " + (System.currentTimeMillis() - time));
		printArray(arr);
	}

}
