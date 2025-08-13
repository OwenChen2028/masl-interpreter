/* mail with RFC22 header */

recipient: "John", "Joe", "James", "Jessie".

Begin Template completeMail:
From: Jeffery@example.com
To: {recipient (i)}@example.com
Subject: testing

`Dear {recipient (i)},

This mail has a header.

Sincerely,
Jeffery`
End Template.

Begin Loop, Incrementing i, Repeat 4 Times:
    Generate completeMail.
End Loop.