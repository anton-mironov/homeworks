package New_HWs.Tests;

public class Main {
    public static void main(String[] args) {
        Service service = new Service(new DB());
        System.out.println(service.getPersonScore("vasya"));
    }

    static class MyDB extends DB {
        private DB db = new DB();

        @Override
        public Person getById(Integer id) {
            return db.getById(id);
        }

        @Override
        public Person getByName(String name) {
            return new Person()
                    .setId(1)
                    .setName(name)
                    .setGamePlayed(100)
                    .setNumberOfWins(10);
        }
    }
}
