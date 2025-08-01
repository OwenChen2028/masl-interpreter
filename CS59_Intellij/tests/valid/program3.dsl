/* valid: task assignment */

recipient: "John", "Joe", "James", "Jessie".
project: "website", "desktop app".
platform: "Mac", "Windows".

Begin Template mail:
`Dear {recipient (c)},
Your task is to create a {project (i)} for {platform (j)}.`
End Template.

c = 1.
i = 1.
Begin Loop,
Repeat project ("Count") Times:
    j = 1.
    Begin Loop,
    Repeat platform ("Count") Times:
        Generate mail.
        Increment c.
        Increment j.
    End Loop.
    Increment i.
End Loop.