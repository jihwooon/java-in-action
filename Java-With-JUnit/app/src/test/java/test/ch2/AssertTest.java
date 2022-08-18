package test.ch2;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.Is.isA;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class AssertTest {

    class Account {
        int balance;
        String name;

        Account(String name) {
            this.name = name;
        }

        public int getBalance() {
            return balance;
        }

        public String getName() {
            return name;
        }

        public boolean hasPositiveBalance() {
            return balance > 0;
        }

        void deposit(int dollars) {
            balance += dollars;
        }

        void withdraw(int dollars) {
            if (balance < dollars) {
                throw new InsufficientFundsException("balance only " + balance);
            }
        }
    }

    class InsufficientFundsException extends RuntimeException {

        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    class Customer {
        List<Account> accounts = new ArrayList<>();

        void add(Account account) {
            accounts.add(account);
        }

        Iterator<Account> getAccounts() {
            return accounts.iterator();
        }
    }

    private Account account;

    @Before
    public void createAccount() {
        account = new Account("an account name");
    }

    @Test
    public void hasPositiveBalance() {
        account.deposit(50);
        assertTrue(account.hasPositiveBalance());
    }

    @Test
    public void depositIncreaseBalance_hamcrestAssertTrue() {
        account.deposit(50);
        assertThat(account.getBalance() > 0, is(true));
    }

    @Ignore
    @Test
    public void comparesCollectionsPassing() {
        assertThat(Arrays.asList(new String[]{"a"}),
                equalTo(Arrays.asList(new String[]{"a"})));
    }

    @Ignore
    @Test
    public void assertFailure() {
        assertFalse(account.getName().startsWith("xyz"));
    }

    @Test
    public void variousMatcherTests() {
        Account account = new Account("my big fan acct");
        assertThat(account.getName(), is(equalTo("my big fan acct")));

        assertThat(account.getName(), allOf(startsWith("my"), endsWith("acct")));

        assertThat(account.getName(), not(equalTo("plunderings")));

        assertThat(account.getName(), is(not(nullValue())));
        assertThat(account.getName(), is(notNullValue()));

        assertThat(account.getName(), isA(String.class));

        assertThat(account.getName(), is(notNullValue()));
        assertThat(account.getName(), equalTo("my big fan acct"));

    }

    @Test
    public void moreMatcherTests() {
        Account account = new Account(null);
        assertThat(account.getName(), is(nullValue()));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void items() {
        ArrayList<String> names = new ArrayList<>();
        names.add("More");
        names.add("Larry");
        names.add("Curly");

        assertThat(names, hasItem("Curly"));

        assertThat(names, hasItems("Curly", "Larry"));

        assertThat(names, hasItem(endsWith("y")));

        assertThat(names, hasItems(endsWith("y"), startsWith("C")));

        assertThat(names, not(everyItem(endsWith("y"))));

    }

}
