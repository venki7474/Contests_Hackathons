import java.util.*;
class Cirqueue{
	int[] que;
	int front;
	int rear;
	int size;
	int count;
	Cirqueue (int size) {
		this.size = size;
		que = new int[size];
		front = -1;
		rear = -1;
		count = 0;
	}

	public void enQueue(int element) {
		if (isEmpty()) {
			front++;
			rear++;
			que[rear] = element;
			count++;
		} else if (!isFull()) {
			rear++;
			rear = (rear + size) % size;
			que[rear] = element;
			count++;
		} else {
			System.out.println("Queue is full");
		}
		print();
	}

	public void deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else if (!isEmpty()) {
			front++;
			front = (front + size) % size;
			count--;
		} else if (front == rear) {
			front = -1;
			rear = -1;
			count--;
		}
		print();
	}

	public boolean isEmpty() {
		if (front == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (count == size) {
			return true;
		}
		return false;
	}

	public int getFront() {
		return que[front];
	}

	public void print() {
		int i = front;
			while(i != rear) {
				System.out.print(que[i] + " ");
				i = (i + 1) % size;
			}
		System.out.println(que[rear]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int size = sc.nextInt(); sc.nextLine();
			Cirqueue myQue1 = new Cirqueue(5);
			String str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str, ",");
			while (st.hasMoreTokens()) {
				String token = st.nextToken();
				StringTokenizer st1 = new StringTokenizer(token, " ");
				while(st1.hasMoreTokens()){
					String tk1 = st1.nextToken();
					int value = 0;
					if (st1.hasMoreTokens()){
						value = Integer.parseInt(st1.nextToken());
					}
					if (tk1.equals("enqueue")) {
						myQue1.enQueue(value);
					}
					if (tk1.equals("dequeue")) {
						myQue1.deQueue();
					}
				}
			}
	}
}