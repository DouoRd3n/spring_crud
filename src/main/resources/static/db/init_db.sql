CREATE TABLE order_table
(
    id                                        SERIAL primary key,
    plumes                                    text,
    referral                                  text,
    objectName                                text,
    objectAdress                              text,
    application_date                          timestamp,
    the_reason_for_the_application            text,
    who_created_the_application               text,
    electrician_that_accepted_the_application text,
    application_result                        text,
    note                                      text,
    user_id                                   int


)
