public class Manager {
    protected String[] billboards = new String[0];
    protected int limit;
    public Manager() {
        limit = 10;
    }
    public Manager(int limit) {
        this.limit = limit;
    }

    public void addNewMovie(String newBillBoard) {
        String[] tmp = new String[billboards.length + 1];
        for (int i = 0; i < billboards.length; i++) {
            tmp[i] = billboards[i];
        }
        tmp[tmp.length - 1] = newBillBoard;
        billboards = tmp;
    }

    public String[] findAll() {
        return billboards;
    }

    public String[] findLast() {
        int resultLength;
        if (billboards.length > limit) {
            resultLength = limit;
        } else {
            resultLength = billboards.length;
        }
          String[] reversed = new String[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = billboards[billboards.length - 1 - i];
        }
        return reversed;
    }

}
