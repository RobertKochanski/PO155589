package pl.edu.uwm.wmii.robertkochanski.laboratorium00.Cwiczenia10;
    public class Pair<T> {
        private T first;
        private T second;

        public Pair() {
            this.first = null;
            this.second = null;
        }

        public Pair(T var1, T var2) {
            this.first = var1;
            this.second = var2;
        }

        public T getFirst() {
            return this.first;
        }

        public T getSecond() {
            return this.second;
        }

        public void setFirst(T var1) {
            this.first = var1;
        }

        public void setSecond(T var1) {
            this.second = var1;
        }

        public void swap(){
            T temp = first;
            first = second;
            second = temp;
        }
}