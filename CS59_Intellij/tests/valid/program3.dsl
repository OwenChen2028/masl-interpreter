/* task assignment */

recipient: "John", "Joe", "James", "Jessie".
project: "website", "desktop app".
platform: "Mac", "Windows".

Randomize recipient.

Begin Template taskMail:
`Dear {recipient (c)},

Your task is to create a {project (i)} for {platform (j)}.

Sincerely,
Jeffery`
End Template.

c = 1.

Begin Loop, Incrementing i, Repeat 2 Times:
    Begin Loop, Incrementing j, Repeat 2 Times:
        Generate taskMail.
        Increment c.
    End Loop.
End Loop.