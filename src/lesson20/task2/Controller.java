package lesson20.task2;

import lesson20.task2.exception.LimitExceeded;

public class Controller {
    private TransactionDAO transactionDAO = new TransactionDAO();


    public Transaction save(Transaction transaction) {
        return transactionDAO.save(transaction);
    }

    public Transaction[] transactionList() {
        return transactionDAO.transactionList();
    }

    public Transaction[] transactionList(String city) {
        return transactionDAO.transactionList(city);
    }

    public Transaction[] transactionList(int amount) {
        return transactionDAO.transactionList(amount);
    }
}
