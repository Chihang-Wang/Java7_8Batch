package homework8_3;

public class homework8_3 {
    /*

    Saga:
    The Saga pattern provides transaction management using a sequence of local transactions.
    A local transaction is the atomic work effort performed by a saga participant.
    Each local transaction updates the database and publishes a message or event to trigger the next local transaction in the saga.
    If a local transaction fails, the saga executes a series of compensating transactions that undo the changes that were made by the preceding local transactions.

    In Saga patterns:

    Compensable transactions are transactions that can potentially be reversed by processing another transaction with the opposite effect.
    A pivot transaction is the go/no-go point in a saga. If the pivot transaction commits, the saga runs until completion. A pivot transaction can be a transaction that is neither compensable nor retryable,
    or it can be the last compensable transaction or the first retryable transaction in the saga.
    Retryable transactions are transactions that follow the pivot transaction and are guaranteed to succeed.
    There are two common saga implementation approaches, choreography and orchestration. Each approach has its own set of challenges and technologies to coordinate the workflow.

    Choreography is a way to coordinate sagas where participants exchange events without a centralized point of control.
    With choreography, each local transaction publishes domain events that trigger local transactions in other services

    Orchestration is a way to coordinate sagas where a centralized controller tells the saga participants what local transactions to execute.
    The saga orchestrator handles all the transactions and tells the participants which operation to perform based on events.
    The orchestrator executes saga requests, stores and interprets the states of each task, and handles failure recovery with compensating transactions.



    * 2pc vs Saga:
    * In my understanding (not a big user of 2PC since I consider it limiting):

    Typically, 2PC is for immediate transactions.
    Typically, Sagas are for long running transactions.
    Use cases are obvious afterwards:

    2PC can allow you to commit the whole transaction in a request or so, spanning this request across systems and networks.
    Assuming each participating system and network follows the protocol, you can commit or rollback the entire transaction seamlessly.
    Saga allows you split transaction into multiple steps, spanning long periods of times (not necessarily systems and networks).
    Example:

    2PC: Save Customer for every received Invoice request, while both are managed by 2 different systems.
    Sagas: Book a flight itinerary consisting of several connecting flights, while each individual flight is operated by different airlines.
    I personally consider Saga capable of doing what 2PC can do. Opposite is not accurate.

    I think Sagas are universal, while 2PC involves platform/vendor lockdown.

    * */
}
