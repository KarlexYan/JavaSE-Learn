package LambdaDemo;

public class BlockSearchDemo2 {
    public static void main(String[] args) {
        int[] arr = {27, 22, 30, 40, 36,
                13, 19, 16, 20,
                7, 10,
                43, 50, 48};
        int key = 10;

        BlockTask blockTask1 = new BlockTask(22, 40, 0, 4);
        BlockTask blockTask2 = new BlockTask(13, 20, 5, 8);
        BlockTask blockTask3 = new BlockTask(7, 10, 9, 10);
        BlockTask blockTask4 = new BlockTask(43, 50, 11, 13);

        BlockTask[] blockArr = {blockTask1, blockTask2, blockTask3, blockTask4};
        int index = getIndex(blockArr, arr, key);
        System.out.println(index);
    }

    private static int getIndex(BlockTask[] blockArr, int[] arr, int key) {
        int indexBlock = getIndexBlock(blockArr, key);
        if (indexBlock == -1) {
            return -1;
        }

        int startIndex = blockArr[indexBlock].getStartIndex();
        int endIndex = blockArr[indexBlock].getEndIndex();

        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    private static int getIndexBlock(BlockTask[] blockArr, int key) {
        for (int i = 0; i < blockArr.length; i++) {
            if (key >= blockArr[i].getMin() && key <= blockArr[i].getMax()) {
                return i;
            }
        }
        return -1;
    }
}

class BlockTask {
    private int min;
    private int max;
    private int startIndex;
    private int endIndex;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public BlockTask() {
    }

    public BlockTask(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }
}
