package Test1;

public class ServiceLogic<T> {

	private T[] array;

	public ServiceLogic() {
		// TODO Auto-generated constructor stub
	}

	public ServiceLogic(T[] array) {
		this.array = array;
	}

	public ServiceLogic(int size) {
		array = creatArray(size);
	}

	public void add(T t) {
		increase();
		array[array.length - 1] = t;
	}

	public void replace(int index, T t) {
		array[index] = t;
	}

		public void print() {
		if (array == null)
			return;

		for (T t : array) {
			System.out.println(t);
		}
	}

	@SuppressWarnings("unchecked")
	private T[] creatArray(int size) {
		return (T[]) new Object[size];
	}

	private void increase() {
		if (array == null) {
			array = creatArray(1);
		} else {
			T[] tmp = creatArray(array.length + 1);
			for (int i = 0; i < array.length; i++) {
				tmp[i] = array[i];
			}
			array = tmp;
		}
	}


	public void replace(String s, String b) {
		// TODO Auto-generated method stub
		
	}
	
}
