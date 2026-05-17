package day05_conditionalstatement_loops_array;

public class Array {
    public static void main(String[] args){
        //배열
        int[] score = {80,70,90,67};
        System.out.println("1번 학생의 점수는: " + score[0]);
        System.out.println("2번 학생의 점수는: " + score[1]);
        System.out.println("3번 학생의 점수는: " + score[2]);
        System.out.println("4번 학생의 점수는: " + score[3]);

        //2차원 배열
        int x = 1;
        int[][] matrix = new int[3][3];
        for (int i  = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = x++;
            }
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }


    }
}
