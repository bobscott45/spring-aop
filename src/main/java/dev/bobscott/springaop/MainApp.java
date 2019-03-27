package dev.bobscott.springaop;

import dev.bobscott.springaop.dao.AccountDAO;
import dev.bobscott.springaop.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO mempershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

        accountDAO.addAccount();
        mempershipDAO.addAccount();

        context.close();
    }
}
