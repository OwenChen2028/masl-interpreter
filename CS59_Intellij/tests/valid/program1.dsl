/* valid: personalized recipients */

recipient: "John", "Joe", "James", "Jessie".

Begin Template mail:
`Dear {recipient (i)},
This is an email, personalized to you.`
End Template.

i = 1.
Begin Loop, Repeat [recipient ("Count")] Times:
    Generate mail.
    Increment i.
End Loop.