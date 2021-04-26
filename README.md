#LATIHAN 1

a)

<img width="296" alt="Latihan 1 (a)" src="https://user-images.githubusercontent.com/68811466/116033751-2c12e480-a68c-11eb-8fcd-1063a2b9fa3b.PNG">

b) 

<img width="596" alt="Latihan 1 (b)" src="https://user-images.githubusercontent.com/68811466/116034141-02a68880-a68d-11eb-93eb-0defe63de3e0.PNG">
Penjelasan : Terdapat 1 eror karena method tersebut terdapat body. Untuk mengatasinya bisa dihilangkan body dari method tersebut dan di override di class lain yang bukan class abstract, dimana pada kasus tersebut bisa dilakukan di class aeorPlane

c)

<img width="318" alt="Latihan 1 (c)" src="https://user-images.githubusercontent.com/68811466/116034157-0a662d00-a68d-11eb-9604-b2aab05ee548.PNG">

d) Pada langkah B mengapa outputnya eror? Hal dikarenakan pada method fuel terdapat body sedangkan untuk method abstract tidak bisa mempunyai body. Oleh sebab itu terjadi eror.
Sedangkan pada langkah C outputnya sudah tidak terjadi eror, hal ini dikarenakan pada method fuel di class aeroPlane sudah di override sehingga pada saat dijalankan program akan membaca method fuel pada class aeroPlane yang bukan berupa method abstract. 

#LATIHAN 2

a) 

<img width="487" alt="Latihan 2 (a)" src="https://user-images.githubusercontent.com/68811466/116038169-4c926d00-a693-11eb-9df2-ac577f2e1195.PNG">

b)

<img width="272" alt="Latihan 2 (b)" src="https://user-images.githubusercontent.com/68811466/116038184-51efb780-a693-11eb-9476-c6cd8bfd805c.PNG">

c)

<img width="317" alt="Latihan 2 (c)" src="https://user-images.githubusercontent.com/68811466/116038229-60d66a00-a693-11eb-9f5a-1cb6cd0325c0.PNG">
<img width="421" alt="Latihan 2 (c) 2" src="https://user-images.githubusercontent.com/68811466/116038203-56b46b80-a693-11eb-856a-b5892674cf2d.PNG">
Penjelasan : Terdapat 1 error karena method tersebut memerlukan nilai return

d)

<img width="469" alt="Latihan 2 (d)" src="https://user-images.githubusercontent.com/68811466/116038262-692ea500-a693-11eb-8c94-7b61ebfaa459.PNG">
Peenjelasan:

-Class Line bukan kelas abstract dan tidak mengoverride abstract method isEqual();
-Ketika eksekusi di main, tidak menemukan adanya method isEqual();
-Untuk mengatasi eror dapat dilakukan dengan menghapus 
public Boolean isEqual(Object a, Object b); pada class reletion.java , dan
System.out.println("Apakah Garis B == Garis A  "+b.isEqual(a, b));

#LATIHAN 3

<img width="281" alt="Latihan 3" src="https://user-images.githubusercontent.com/68811466/116041689-b1e85d00-a697-11eb-9fee-3c4824ab6197.PNG">

#LATIHAN 4

<img width="291" alt="Latihan 4" src="https://user-images.githubusercontent.com/68811466/116041706-b7de3e00-a697-11eb-98f1-fc4b94c7f70c.PNG">

#TUGAS PRAKTIKUM

<img width="561" alt="Praktikum Test Rect" src="https://user-images.githubusercontent.com/68811466/116041785-d6dcd000-a697-11eb-90a9-30998009631f.PNG">
<img width="346" alt="Output Test Rect" src="https://user-images.githubusercontent.com/68811466/116041799-dcd2b100-a697-11eb-8e58-72ae948102e1.PNG">

#TUGAS 1

<img width="167" alt="output tugas1" src="https://user-images.githubusercontent.com/68811466/116041808-e0663800-a697-11eb-960f-65e7e956ce85.PNG">
