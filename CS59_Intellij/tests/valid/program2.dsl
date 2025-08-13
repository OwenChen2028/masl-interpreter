/* valid: shift assignment */

recipient: "John", "Joe", "James", "Jessie".
shift: "day", "night".

Randomize recipient.

Begin Template mail:
`Dear {recipient (i)},

Come in for the {shift (i Mod 2 + 1)} shift tomorrow.

Sincerely,
Jeffery`
End Template.

i = 1.
Begin Loop,
Repeat 4 Times:
    Generate mail.
    Increment i.
End Loop.