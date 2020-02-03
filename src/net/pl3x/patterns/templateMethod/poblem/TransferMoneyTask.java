package net.pl3x.patterns.templateMethod.poblem;

/*
 * There is a problem with this type of implementation
 * -> Repetitive code
 *
 * Constantly adding private fields and initializing it inside a constructor
 *
 * Second problem is, no one is forcing you to follow a structure
 * -> This can cause problems if you join a company that is requiring you to follow the 4 principles of OOP
 */
public class TransferMoneyTask {
    private AuditTrail auditTrail;

    /*
     * Initialize private field with this constructor
     */
    public TransferMoneyTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    /*
     * Every time we want to perform a task, we should ask who is performing this task
     * We want to sort this information in an 'AuditTrail'
     */
    public void execute() {
        auditTrail.record();

        // Have logic for transfer money between account
        System.out.println("Transfer Moeny.");
    }
}
