package lesson2_4;

public class AnimalTest {
    static class Animal {
        public static int countAnimals = 0;
        public Animal() {
            countAnimals++;
        }
        public void run(int distance) {
            System.out.println("Животное пробежало " + distance + " м.");
        }
        public void swim(int distance) {
            System.out.println("Животное проплыло " + distance + " м.");
        }
    }

    static class Dog extends Animal {
        public static int countDogs = 0;
        public Dog() {
            super();
            countDogs++;
        }
        @Override
        public void run(int distance) {
            if (distance <= 500) {
                System.out.println("Пес пробежал " + distance + " м.");
            } else {
                System.out.println("Пес не может пробежать так далеко.");
            }
        }
        @Override
        public void swim(int distance) {
            if (distance <= 10) {
                System.out.println("Пес проплыл " + distance + " м.");
            } else {
                System.out.println("Пес не может плавать так далеко.");
            }
        }
    }

    static class Cat extends Animal {
        public static int countCats = 0;
        private boolean satiety;
        private static final int MAX_RUN = 200;
        public Cat() {
            super();
            countCats++;
            this.satiety = false;
        }
        @Override
        public void run(int distance) {
            if (distance <= MAX_RUN) {
                System.out.println("Кот пробежал " + distance + " м.");
            } else {
                System.out.println("Кот не может пробежать так далеко.");
            }
        }
        @Override
        public void swim(int distance) {
            System.out.println("Кот не умеет плавать.");
        }
        public boolean eat(int foodAmount, Plate plate) {
            if (plate.getFood() >= foodAmount) {
                if (plate.decreaseFood(foodAmount)) {
                    this.satiety = true;
                    System.out.println("Кот покушал и стал сытым.");
                    return true;
                }
            } else {
                System.out.println("В миске недостаточно еды для кота.");
            }
            return false;
        }
        public boolean isSatiety() {
            return satiety;
        }
    }

    static class Plate {
        private int food;
        public Plate(int initialFood) {
            this.food = initialFood;
        }
        public int getFood() {
            return food;
        }
        public boolean decreaseFood(int amount) {
            if (amount <= food) {
                food -= amount;
                return true;
            } else {
                System.out.println("Недостаточно еды в миске.");
                return false;
            }
        }
        public void addFood(int amount) {
            if (amount > 0) {
                food += amount;
                System.out.println("Добавлено еды: " + amount + ". Текущий запас: " + food);
            }
        }
    }

    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
        }
        Plate plate = new Plate(50);
        System.out.println("Изначально в миске: " + plate.getFood() + " еды.");
        for (int i = 0; i < cats.length; i++) {
            System.out.println("Коту " + (i+1) + " trying to eat 10:");
            cats[i].eat(10, plate);
            System.out.println("Сытость кота " + (i+1) + ": " + cats[i].isSatiety());
        }
        System.out.println("Остаётся в миске: " + plate.getFood());
        plate.addFood(20);
        System.out.println("Теперь в миске: " + plate.getFood());
        for (int i = 0; i < cats.length; i++) {
            if (!cats[i].isSatiety()) {
                System.out.println("Коту " + (i+1) + " пытается съесть 15:");
                cats[i].eat(15, plate);
                System.out.println("Сытость кота " + (i+1) + ": " + cats[i].isSatiety());
            } else {
                System.out.println("Кот " + (i+1) + " уже сытый.");
            }
        }
        System.out.println("Количество животных: " + Animal.countAnimals);
        System.out.println("Количество котов: " + Cat.countCats);
        System.out.println("Количество собак: " + Dog.countDogs);
        Dog dog = new Dog();
        dog.run(300);
        dog.swim(5);
        dog.run(600);
        dog.swim(15);
        System.out.println("Общее число животных: " + Animal.countAnimals);
        System.out.println("Общее число собак: " + Dog.countDogs);
    }
}

