package LambdaDemo;

public class BlockSearchDemo1 {
    public static void main(String[] args) {
        int arr[] = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};
        int key = 73;

        Block block1 = new Block(21, 0, 5);
        Block block2 = new Block(45, 6, 11);
        Block block3 = new Block(73, 12, 17);

        Block blockArr[] = {block1, block2, block3};
        int index = getIndex(blockArr, arr, key);
        System.out.println(index);
    }

    private static int getIndex(Block[] blockArr, int[] arr, int key) {
        int indexBlock = findIndexBlock(blockArr, key);
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

    private static int findIndexBlock(Block[] blockArr, int key) {
        for (int i = 0; i < blockArr.length; i++) {
            if (key <= blockArr[i].getMax()) {
                return i;
            }
        }
        return -1;
    }
}

class Block {
    private int max;
    private int startIndex;
    private int endIndex;

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

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public Block() {
    }
}
