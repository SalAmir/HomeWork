import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

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
	//
	static int[] sortShaker(int[] arr){
		int d = 0, t = arr.length - 1;
		while (t >= 0)
		{
			int temp = 0;
			for (int i = d; i < (t + 1); i++){
				temp = arr[i];
				if (i < t)
				{
					if (arr[i] > arr[i + 1]){
							arr[i] = arr[i + 1];
							arr[i + 1] = temp;
					}
				}
			}
			
			for (int k = t - 1; k >= d;  k--){
				temp = arr[k];
				if (k > d)
				{
					if (arr[k] < arr[k - 1]){
						arr[k] = arr[k - 1];
						arr[k - 1] = temp;
					}
				}
			}
			d++;
			t--;
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
	
	static ArrayList<Integer> sortShakerList(ArrayList<Integer> list){
		int d = 0, t = list.size() - 1;
		while (t >= 0)
		{
			int temp = 0;
			for (int i = d; i < (t + 1); i++){
				temp = list.get(i).intValue();
				if (i < t)
				{
					if (list.get(i).intValue() > list.get(i + 1).intValue()){
						list.set(i, list.get(i + 1).intValue());
						list.set(i + 1, temp);
					}
				}
			}
			
			for (int k = t - 1; k >= d;  k--){
				temp = list.get(k).intValue();
				if (k > d)
				{
					if (list.get(k).intValue() < list.get(k - 1).intValue()){
						list.set(k, list.get(k - 1).intValue());
						list.set(k - 1, temp);
					}
				}
			}
			d++;
			t--;
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
		int[] arr = new int[10000];
		//
		initArrayList(list, 10000);
		long time = System.currentTimeMillis();
		sortCombList(list);
		System.out.println("Время затраченное на сортировку списка \"Расческа\" - " + (System.currentTimeMillis() - time));

		System.out.println();

		initArrayList(list, 10000);
		time = System.currentTimeMillis();
		sortShakerList(list);
		System.out.println("Время затраченное на сортировку списка \"Шейкер\" - " + (System.currentTimeMillis() - time));

		System.out.println();
		
		initArray(arr);
		System.out.println("Сортировка массива методом \"Расческа\":");
		time = System.currentTimeMillis();
		sortCombArray(arr);
		System.out.println("Время затраченное на сортировку - " + (System.currentTimeMillis() - time));
		
		System.out.println();
		
		initArray(arr);
		System.out.println("Сортировка массива методом \"Шейкер\":");
		time = System.currentTimeMillis();
		sortShaker(arr);
		System.out.println("Время затраченное на сортировку - " + (System.currentTimeMillis() - time));
	}

}
