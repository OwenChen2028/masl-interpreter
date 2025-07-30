/* invalid: statements not terminated with . */
Begin Loop, Repeat [recipient ("Count")] Times:
    Generate mail
    Increment i
End Loop