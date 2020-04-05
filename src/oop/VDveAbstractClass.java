package oop;

public class VDveAbstractClass {
    abstract class hinhHoc {
        abstract float chuVi();

        abstract float dienTich();
    }

    class hinhTron extends hinhHoc {
        float r;

        public hinhTron(float r) {
            this.r = r;
        }

        @Override
        float dienTich() {
            return 3.14f * r * r;
        }

        @Override
        float chuVi() {
            return 2 * r * 3.14f;
        }

        public void display() {
            System.out.println("Chu vi" + chuVi());
            System.out.println("Dien tich" + dienTich());
        }
    }

    public static void main(String[] args) {
        hinhTron Tron = new hinhTron(3)
    }



}
