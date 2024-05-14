package Tugas8.src.analisis;

    public class Hero {
        private String name;
        private double health;
        Hero(String name, double health) {
            this.name = name;
            this.health = health;
        }
        
        //getter
        public double getHealth(){
            return this.health;
        }

        public String getName(){
            return this.name;
        }

        //setter
        public void setName(String name){
            this.name = name;
        }

        public void setHealth(double health){
            this.health = health;
        }

        //method umum
        public void display(){
            System.out.println(this.name + " is a regular hero.");
        }
}

