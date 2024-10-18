package array;

// + moi phan tu trong mang 2 chieu la mang 1 chieu, no giong nhu 1 bang
// + Tat ca phai cung kieu du lieu , kich thuoc co dinh
// + khi nao dung:  - luu du lieu theo dang bang hoac luoi, lam viec voi lich.
//                  - vi du: trong rap chieu phim thi co the quan li cho ngoi,

public class Array2D {
    public static void main(String[] args) {
        int[][] seats  = new int[5][10];

        seats[0][1] = 1;    // ghe tai hang 0 cot 1 da dat cho
        seats[1][2] = 1;    // ghe tai hang 1 cot 2 da dat cho

        System.out.println("So do cho ngoi: ");
        // vong lap j chay truoc, tại vi tri i = 0 thi se co 10 cot va j se lap qua ca 10 cot va in ra
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.printf("   " + seats[i][j]);
            }
            System.out.println();
        }

        if(seats[3][2] == 0){
            System.out.printf("Ghe hang 3 cot 2 trong");
        }else {
            System.out.printf("Ghe hang 3 cot 2 da duoc dat");
        }

    }

}
