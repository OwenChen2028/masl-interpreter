/* shift assignment */

recipient: "John", "Joe", "James", "Jessie".
shift: "day", "night".

Randomize recipient.

Begin Template shiftMail:
`Dear {recipient (i)},

Come in for the {shift (i Mod 2 + 1)} shift tomorrow.

Sincerely,
Jeffery`
End Template.

Begin Loop, Incrementing i, Repeat 4 Times:
    Generate shiftMail.
End Loop.