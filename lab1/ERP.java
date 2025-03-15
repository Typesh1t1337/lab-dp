package lab1;

public class ERP {
        private User[] memory = new User[1000];
        private int sizeOfUsers = 0;


        public void addUser(User u) {
            if (sizeOfUsers < memory.length) {
                memory[sizeOfUsers] = u;
                sizeOfUsers++;
            }
        }


        public void printTeacher() {
            for (int i = 0; i < sizeOfUsers; i++) {
                if (memory[i] instanceof Teacher) {
                    System.out.println(memory[i].getUserData());
                }
            }
        }


        public void printStudent() {
            for (int i = 0; i < sizeOfUsers; i++) {
                if (memory[i] instanceof Student) {
                    System.out.println(memory[i].getUserData());
                }
            }
        }


        public void printUser(int index) {
            if (index >= 0 && index < sizeOfUsers) {
                System.out.println(memory[index].getUserData());
            } else {
                System.out.println("Error");
            }
        }
    }

