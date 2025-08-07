/* welcome to snake */

grid: "0","0","0","0","0",
      "0","0","0","0","0",
      "0","0","2","0","0",
      "0","0","1","0","0",
      "0","0","0","0","0".

mapping: "*", ".", "#", "#",
         "#", "#", "#", "#", "#", "#",
         "#", "#", "#", "#", "#", "#",
         "#", "#", "#", "#", "#", "#",
         "#", "#", "#", "#", "#", "#".

Begin Template output:
`{mapping (grid(1) + 2)} {mapping (grid(2) + 2)} {mapping (grid(3) + 2)} {mapping (grid(4) + 2)} {mapping (grid(5) + 2)}
{mapping (grid(6) + 2)} {mapping (grid(7) + 2)} {mapping (grid(8) + 2)} {mapping (grid(9) + 2)} {mapping (grid(10) + 2)}
{mapping (grid(11) + 2)} {mapping (grid(12) + 2)} {mapping (grid(13) + 2)} {mapping (grid(14) + 2)} {mapping (grid(15) + 2)}
{mapping (grid(16) + 2)} {mapping (grid(17) + 2)} {mapping (grid(18) + 2)} {mapping (grid(19) + 2)} {mapping (grid(20) + 2)}
{mapping (grid(21) + 2)} {mapping (grid(22) + 2)} {mapping (grid(23) + 2)} {mapping (grid(24) + 2)} {mapping (grid(25) + 2)}`
End Template.

numbers: "1","2","3","4","5","6","7","8","9","10",
         "11","12","13","14","15","16","17","18","19","20",
         "21","22","23","24","25".

/* snake properties */
headX = 3.
headY = 3.
dirX = 0.
dirY = -1.
length = 2.

/* game properties */
eaten = 1.
active = 1.

Begin Loop, While active:
    /* find fruit location */
    Begin Check, If eaten:
        Shuffle numbers.
        index = 1.
        Begin Loop, While grid (numbers (index)) Isn't 0:
            Increment index.
        End Loop.
        Set grid To "-1" At numbers (index).
        eaten = 0.
    End Check.

    /* manage IO */
    Write output.
    Write "".
    Read input.
    Write "".

    /* process input */
    Begin Check, If input Is 2: /* down */
        Begin Check, If dirY Isn't -1:
            dirX = 0.
            dirY = 1.
        End Check.
    End Check.
    Begin Check, If input Is 8: /* up */
        Begin Check, If dirY Isn't 1:
            dirX = 0.
            dirY = -1.
        End Check.
    End Check.
    Begin Check, If input Is 4: /* left */
        Begin Check, If dirX Isn't 1:
            dirX = -1.
            dirY = 0.
        End Check.
    End Check.
    Begin Check, If input Is 6: /* right */
        Begin Check, If dirX Isn't -1:
            dirX = 1.
            dirY = 0.
        End Check.
    End Check.

    /* calculate head pos */
    headX = headX + dirX.
    headY = headY + dirY.
    gridPos = 5 * headY - 5 + headX.

    /* check out of bounds */
    Begin Check, If headX <= 0:
        Write "You lose!".
        active = 0.
    End Check.
    Begin Check, If headY <= 0:
        Write "You lose!".
        active = 0.
    End Check.
    Begin Check, If headX > 5:
        Write "You lose!".
        active = 0.
    End Check.
    Begin Check, If headY > 5:
        Write "You lose!".
        active = 0.
    End Check.

    Begin Check, If active:
        /* check for fruit */
        shorten = 1.
        Begin Check, If grid (gridPos) Is -1:
            Increment length.
            eaten = 1.
            shorten = 0.
        End Check.

        /* check for win */
        Begin Check, If length Is 25:
            Set grid To length At gridPos.
            Write output.
            Write "".
            Write "You win!".
            active = 0.
        End Check.

        Begin Check, If active:
            /* shorten snake tail */
            Begin Check, If shorten:
                index = 1.
                Begin Loop, Repeat 25 Times:
                    value = grid (index).
                    Decrement value.
                    Begin Check, If value >= 0:
                        Set grid To value At index.
                    End Check.
                    Increment index.
                End Loop.
            End Check.

            /* check collision */
            Begin Check, If grid (gridPos) > 0:
                Write "You lose!".
                active = 0.
            End Check.

            /* place snake head */
            Set grid To length At gridPos.
        End Check.
    End Check.
End Loop.