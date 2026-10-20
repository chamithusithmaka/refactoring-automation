import java.util.*;

public class codesmells {
    private static final int DEFAULT_PORT_2 = 5000;

    private static final int THRESHOLD_LIMIT_200 = 200;

    private static final int THRESHOLD_LIMIT_75 = 75;

    private static final int THRESHOLD_LIMIT_40 = 40;

    private static final int THRESHOLD_LIMIT_20 = 20;

    private static final int THRESHOLD_LIMIT_10 = 10;

    private static final int THRESHOLD_LIMIT_100 = 100;

    private static final int THRESHOLD_LIMIT_5500 = 5500;

    private static final int THRESHOLD_LIMIT_4500 = 4500;

    private static final int THRESHOLD_LIMIT_2500 = 2500;

    private static final int THRESHOLD_LIMIT_1500 = 1500;

    private static final int THRESHOLD_LIMIT_3500 = 3500;

    private static final int THRESHOLD_LIMIT_3000 = 3000;

    private static final int THRESHOLD_LIMIT_2200 = 2200;

    private static final int DEFAULT_PORT = 8000;

    private static final int THRESHOLD_LIMIT_6000 = 6000;

    private static final int THRESHOLD_LIMIT_50 = 50;

    private static final int THRESHOLD_LIMIT_4000 = 4000;

    private static final int THRESHOLD_LIMIT_30 = 30;

    private static final int THRESHOLD_LIMIT_18 = 18;

    private static final int THRESHOLD_LIMIT_1000 = 1000;

    private static final int THRESHOLD_LIMIT_500 = 500;

    private static final int THRESHOLD_LIMIT_2000 = 2000;

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
        int bonus = extracted_main(type);
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
    private static int extracted_main(String type) {
        int bonus = 0;

        if (type.equals("full")) {
            bonus = THRESHOLD_LIMIT_2000;
        } else if (type.equals("part")) {
            bonus = THRESHOLD_LIMIT_500;
        } else if (type.equals("contract")) {
            bonus = THRESHOLD_LIMIT_1000;
        } else {
            bonus = 0;
        }

        arr.add(name);
        arr.add(type);

        int x = 0;
        if (age > THRESHOLD_LIMIT_18) {
            x = 1;
        }
        if (x == 1) {
            System.out.println("Employee is adult");
        }

        System.out.println("Employee name: " + name);
        return bonus;
    }


    static int getSalary(int a, String t) {
        int salary = extracted_getSalary(a, t);

        return salary;
    }
    private static int extracted_getSalary(int a, String t) {
        int salary = extracted_extracted_getSalary(a, t);
        return salary;
    }
    private static int extracted_extracted_getSalary(int a, String t) {
        int salary = 0;

        if (t.equals("full")) {
            if (a < THRESHOLD_LIMIT_18) {
                salary = THRESHOLD_LIMIT_2000;
            } else if (a >= THRESHOLD_LIMIT_18 && a < THRESHOLD_LIMIT_30) {
                salary = THRESHOLD_LIMIT_4000;
            } else if (a >= THRESHOLD_LIMIT_30 && a < THRESHOLD_LIMIT_50) {
                salary = THRESHOLD_LIMIT_6000;
            } else {
                salary = DEFAULT_PORT;
            }
        } else if (t.equals("part")) {
            if (a < THRESHOLD_LIMIT_18) {
                salary = THRESHOLD_LIMIT_1000;
            } else if (a >= THRESHOLD_LIMIT_18 && a < THRESHOLD_LIMIT_30) {
                salary = THRESHOLD_LIMIT_2200;
            } else if (a >= THRESHOLD_LIMIT_30 && a < THRESHOLD_LIMIT_50) {
                salary = THRESHOLD_LIMIT_3000;
            } else {
                salary = THRESHOLD_LIMIT_3500;
            }
        } else if (t.equals("contract")) {
            if (a < THRESHOLD_LIMIT_18) {
                salary = THRESHOLD_LIMIT_1500;
            } else if (a >= THRESHOLD_LIMIT_18 && a < THRESHOLD_LIMIT_30) {
                salary = THRESHOLD_LIMIT_2500;
            } else if (a >= THRESHOLD_LIMIT_30 && a < THRESHOLD_LIMIT_50) {
                salary = THRESHOLD_LIMIT_4500;
            } else {
                salary = THRESHOLD_LIMIT_5500;
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

        if (age > THRESHOLD_LIMIT_18) {
            System.out.println("Adult report printed");
        } else {
            System.out.println("Minor report printed");
        }

        for (int i = 0; i < THRESHOLD_LIMIT_100; i += 1) {
            if (i % 2 == 0) {
                System.out.println("Loop step: " + i);
            }
        }
    }

    static void doTask(String empName, int ageValue, String typeValue, int salary, int bonus) {
        int result = 0;
        extracted_doTask(ageValue, bonus, empName, result, salary, typeValue);
    }
    private static void extracted_doTask(int ageValue, int bonus, String empName, int result, int salary, String typeValue) {
        if (empName.equals("")) {
            result = 0;
        } else {
            result = 1;
        }

        extracted_extracted_doTask(ageValue, bonus, result, salary, typeValue);
    }
    private static void extracted_extracted_doTask(int ageValue, int bonus, int result, int salary, String typeValue) {
        if (ageValue < THRESHOLD_LIMIT_18) {
            result = result + THRESHOLD_LIMIT_10;
        } else if (ageValue >= THRESHOLD_LIMIT_18 && ageValue < THRESHOLD_LIMIT_30) {
            result = result + THRESHOLD_LIMIT_20;
        } else if (ageValue >= THRESHOLD_LIMIT_30 && ageValue < THRESHOLD_LIMIT_50) {
            result = result + THRESHOLD_LIMIT_30;
        } else {
            result = result + THRESHOLD_LIMIT_40;
        }

        if (typeValue.equals("full")) {
            result = result + THRESHOLD_LIMIT_100;
        } else if (typeValue.equals("part")) {
            result = result + THRESHOLD_LIMIT_50;
        } else if (typeValue.equals("contract")) {
            result = result + THRESHOLD_LIMIT_75;
        } else {
            result = result + 1;
        }

        if (salary > 0) {
            result = result + salary;
        }

        if (bonus > 0) {
            result = result + bonus;
        }

        if (result > THRESHOLD_LIMIT_200) {
            System.out.println("Task successful");
        } else {
            System.out.println("Task not successful");
        }

        if (result > THRESHOLD_LIMIT_500) {
            if (result > THRESHOLD_LIMIT_1000) {
                if (result > THRESHOLD_LIMIT_2000) {
                    if (result > DEFAULT_PORT_2) {
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
