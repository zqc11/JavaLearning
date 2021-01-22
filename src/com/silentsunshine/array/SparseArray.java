package com.silentsunshine.array;

/**
 * @Auther: zhouqichun
 * @Date: 2021/1/16 - 01 - 16 - 20:47
 * @Description: com.silentsunshine.array
 * @version: 1.0
 */

public class SparseArray {
    /**
     * 这个方法输出传入的数组
     * @param a 传入的数组
     */
    public static void printArray(int[][] a){
        for (int[] row : a) {
            for (int data : row) {
                System.out.print(data + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 将传入的数组转换为稀疏数组
     * 稀疏数组的第一行为：原始数组的行数 列数 有效值个数
     * 其他行为：该有效值在原始数组中的行 列 有效值
     * @param origin 原始数组
     * @return 返回转换后的稀疏数组
     */
    public static int[][] originArrayToSparse(int[][] origin){
        //无效数值
        int uselessValue = 0;
        //有效值的个数
        int count = 0;
        //稀疏数组的行数
        int sparseArrayRow = 0;
        //稀疏数组的列数
        int sparseArrayCol = 0;
        //找到有效数值的个数
        for (int[] row : origin) {
            sparseArrayRow++;
            sparseArrayCol = row.length;
            for (int data : row) {
                if (data != uselessValue){
                    count++;
                }
            }
            }
        int[][] outArray = new int[count+1][3];
        outArray[0][0] = sparseArrayRow;
        outArray[0][1] = sparseArrayCol;
        outArray[0][2] = count;
        count = 0;
        for (int i = 0; i < sparseArrayRow; i++) {
            for (int i1 = 0; i1 < sparseArrayCol; i1++) {
                if (origin[i][i1] != uselessValue){
                    count++;
                    outArray[count][0] = i;
                    outArray[count][1] = i1;
                    outArray[count][2] = origin[i][i1];
                }
            }
        }
        return outArray;
    }

    /**
     * 该方法将稀疏数组转换成原始数组
     * @param sparseArray 传入的稀疏数组
     * @return 返回转换后的原始数组
     */
    public static int[][] sparseArrayToOrigin(int[][] sparseArray){
        int[][] originArray = new int[sparseArray[0][0]][sparseArray[0][1]];
        int i = sparseArray[0][2];
        for (int i1 = 1; i1 < i; i1++) {
            originArray[sparseArray[i1][0]][sparseArray[i1][1]] = sparseArray[i1][2];
        }
        return originArray;
    }

    public static void main(String[] args) {
        int[][] originArray = new int[11][11];
        originArray[3][1] = 1;
        originArray[0][6] = 2;
        //打印原数组
        SparseArray.printArray(originArray);
        //声明稀疏数组
        int[][] sparseArray;
        //转换成稀疏数组
        sparseArray = SparseArray.originArrayToSparse(originArray);
        //打印稀疏数组
        SparseArray.printArray(sparseArray);
        //声明稀疏数组转换成的原始数组
        int[][] origin2;
        //转换后的原数组
        origin2 = sparseArrayToOrigin(sparseArray);
        //打印原数组
        SparseArray.printArray(origin2);
    }
}
