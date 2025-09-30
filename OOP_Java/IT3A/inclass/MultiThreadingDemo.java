public class MultiThreadingDemo {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("Main thread is running...");

    ThreadA threadA = new ThreadA();
    ThreadB threadB = new ThreadB();
    ThreadC threadC = new ThreadC();
    threadA.setPriority(5);
    threadB.setPriority(8);
    threadC.setPriority(3);
    threadA.start();
    // threadA.join();
    threadB.start();
    // threadB.join();
    threadC.start();

    System.out.println("Main thread ends execution.");
  }
}

class ThreadA extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 20; i++) {
      System.out.println("Thread A is running... " + i);
    }
  }
}

class ThreadB extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 20; i++) {
      System.out.println("Thread B is running... " + i);
    }
  }
}

class ThreadC extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 20; i++) {
      System.out.println("Thread C is running... " + i);
    }
  }
}
