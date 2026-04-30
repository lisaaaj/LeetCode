class Foo {

private Semaphore secondGate = new Semaphore(0);
private Semaphore thirdGate = new Semaphore(0);

    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
       
        printFirst.run();
        secondGate.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        secondGate.acquire();
        printSecond.run();
        thirdGate.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        thirdGate.acquire();
        printThird.run();
    }
}
