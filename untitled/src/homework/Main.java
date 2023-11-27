package homework;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("orange");
        basket.add("lemon");
        basket.add("orange");
        basket.add("lemon");
        basket.add("orange");
        basket.add("lemon");
        basket.add("orange");
        basket.add("lemon");
        basket.add("strawberry");
        System.out.println("count: " + basket.count());
        System.out.println("has oranges: " + basket.find("orange"));
        System.out.println("has lemons: " + basket.find("lemon"));
        System.out.println("number of uniques: " + basket.uniqueFruitsCount());
        System.out.println("deleted orange: " + basket.remove("orange"));
        System.out.println("deleted lemon: " + basket.remove("lemon"));
        System.out.println("deleted strawberry : " + basket.remove("strawberry"));
        System.out.println("count: " + basket.count());

        System.out.println("====================================================================");
        Buchet buq = new Buchet();
        buq.add("rose");
        buq.add("rose");
        buq.add("rose");
        buq.add("tulip");
        buq.add("tulip");
        buq.add("rose");
        buq.add("rose");
        buq.add("tulip");
        buq.add("tulip");
        buq.add("tulip");
        buq.add("tulip");
        buq.add("tulip");
        buq.add("tulip");
        buq.add("tulip");
        System.out.println("Size: " + buq.getAll().size());
        buq.remove("tulip");
        System.out.println("Size: " + buq.getAll().size());
        System.out.println("====================================================================");

        Person p1 = new Person("John", "manager", 22);
        Person p2 = new Person("Alex", "carpenter", 33);
        Person p3 = new Person("Bruce", "driver", 44);
        Person p4 = new Person("Robert", "plumber", 47);
        Company company = new Company();
        company.employ(p1);
        company.employ(p2);
        company.employ(p3);
        company.employ(p4);
        System.out.println(company.getManager());
        System.out.println(company.getPersonByName("Alex"));
        System.out.println(company.getPersonsOlderThan(39));
        System.out.println(company.getPersons("manager"));
    }
}