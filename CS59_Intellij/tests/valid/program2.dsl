/* valid: shift assignment */

recipient: "John", "Joe", "James", "Jessie".
shift: "day", "night".

Shuffle recipient.

Begin Template mail:
`Dear {recipient (i)},
Come in for the {shift (i Mod 2 + 1)} shift tomorrow.`
End Template.

i = 1.
Begin Loop,
Repeat 4 Times:
    Generate mail.
    Increment i.
End Loop.