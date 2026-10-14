import java.util.*;

public class codesmells {
    static String name = "";
    static int age;
    static boolean flag = false;
    static ArrayList<String> arr = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name:");
        name = sc.nextLine();

        System.out.println("Enter employee age:");
        age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter employee type (full/part/contract):");
        String type = sc.nextLine();

        int salary = getSalary(age, type);
        int bonus = 0;

        if (type.equals("full")) {
            bonus = 2000;
        } else if (type.equals("part")) {
            bonus = 500;
        } else if (type.equals("contract")) {
            bonus = 1000;
        } else {
            bonus = 0;
        }

        arr.add(name);
        arr.add(type);

        int x = 0;
        if (age > 18) {
            x = 1;
        }
        if (x == 1) {
            System.out.println("Employee is adult");
        }

        System.out.println("Employee name: " + name);
        System.out.println("Employee age: " + age);
        System.out.println("Employee type: " + type);
        System.out.println("Base salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total pay: " + (salary + bonus));

        processEmployee(name, age, type, salary, bonus);
        printReport();
        printReport();
        doTask(name, age, type, salary, bonus);
        doTask(name, age, type, salary, bonus);

        sc.close();
    }

    static int getSalary(int a, String t) {
        int salary = 0;

        if (t.equals("full")) {
            if (a < 18) {
                salary = 2000;
            } else if (a >= 18 && a < 30) {
                salary = 4000;
            } else if (a >= 30 && a < 50) {
                salary = 6000;
            } else {
                salary = 8000;
            }
        } else if (t.equals("part")) {
            if (a < 18) {
                salary = 1000;
            } else if (a >= 18 && a < 30) {
                salary = 2200;
            } else if (a >= 30 && a < 50) {
                salary = 3000;
            } else {
                salary = 3500;
            }
        } else if (t.equals("contract")) {
            if (a < 18) {
                salary = 1500;
            } else if (a >= 18 && a < 30) {
                salary = 2500;
            } else if (a >= 30 && a < 50) {
                salary = 4500;
            } else {
                salary = 5500;
            }
        } else {
            salary = 0;
        }

        return salary;
    }

    static void processEmployee(String n, int a, String t, int salary, int bonus) {
        if (n != null) {
            if (a > 0) {
                if (t.equals("full") || t.equals("part") || t.equals("contract")) {
                    if (flag == false) {
                        System.out.println("Processing employee...");
                        System.out.println("Name: " + n);
                        System.out.println("Age: " + a);
                        System.out.println("Type: " + t);
                        System.out.println("Salary: " + salary);
                        System.out.println("Bonus: " + bonus);
                        flag = true;
                    }
                }
            }
        }
    }

    static void printReport() {
        if (arr.size() > 0) {
            String x = "";
            for (int i = 0; i < arr.size(); i++) {
                x = x + arr.get(i) + ", ";
            }
            System.out.println("Report: " + x);
        } else {
            System.out.println("No employees found");
        }

        if (age > 18) {
            System.out.println("Adult report printed");
        } else {
            System.out.println("Minor report printed");
        }

        for (int i = 0; i < 100; i += 1) {
            if (i % 2 == 0) {
                System.out.println("Loop step: " + i);
            }
        }
    }

    static void doTask(String empName, int ageValue, String typeValue, int salary, int bonus) {
        int result = 0;
        if (empName.equals("")) {
            result = 0;
        } else {
            result = 1;
        }

        if (ageValue < 18) {
            result = result + 10;
        } else if (ageValue >= 18 && ageValue < 30) {
            result = result + 20;
        } else if (ageValue >= 30 && ageValue < 50) {
            result = result + 30;
        } else {
            result = result + 40;
        }

        if (typeValue.equals("full")) {
            result = result + 100;
        } else if (typeValue.equals("part")) {
            result = result + 50;
        } else if (typeValue.equals("contract")) {
            result = result + 75;
        } else {
            result = result + 1;
        }

        if (salary > 0) {
            result = result + salary;
        }

        if (bonus > 0) {
            result = result + bonus;
        }

        if (result > 200) {
            System.out.println("Task successful");
        } else {
            System.out.println("Task not successful");
        }

        if (result > 500) {
            if (result > 1000) {
                if (result > 2000) {
                    if (result > 5000) {
                        System.out.println("Very large result");
                    } else {
                        System.out.println("Large result");
                    }
                } else {
                    System.out.println("Medium result");
                }
            } else {
                System.out.println("Small result");
            }
        }
    }
}
