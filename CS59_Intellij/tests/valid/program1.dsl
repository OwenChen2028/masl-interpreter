/* valid: personalized recipients */

recipient: "John", "Joe", "James", "Jessie".

Begin Template mail:
`Dear {recipient (i)},

This is an email, personalized to you.

Sincerely,
Jeffery`
End Template.

i = 1.
Begin Loop,
Repeat 4 Times:
    Generate mail.
    Increment i.
End Loop.