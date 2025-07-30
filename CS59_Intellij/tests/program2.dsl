recipient: "John", "Joe", "James", "Jessie".
shift: "day", "night".

Begin Template mail:
`Dear {recipient (i)},
Come in for the {shift (i Mod 2 + 1)} shift tomorrow.`
End Template.

i = 1.
Begin Loop, Repeat [recipient ("Count")] Times:
    Generate mail.
    Increment i.
End Loop.