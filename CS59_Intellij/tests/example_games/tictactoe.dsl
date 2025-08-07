/* tic tac toe */

grid: "0", "0", "0",
      "0", "0", "0",
      "0", "0", "0".

mapping: " ", "X", "O".

Begin Template output:
` {mapping (grid (1) + 1)} | {mapping (grid (2) + 1)} | {mapping (grid (3) + 1)}
---+---+---
 {mapping (grid (4) + 1)} | {mapping (grid (5) + 1)} | {mapping (grid (6) + 1)}
---+---+---
 {mapping (grid (7) + 1)} | {mapping (grid (8) + 1)} | {mapping (grid (9) + 1)}`
End Template.

Begin Template winMsg:
`Player {player} wins!`
End Template.

player = 1.
active = 1.

Begin Loop, While active:
    /* handle IO */
    Write output.
    Write "".
    Read input.
    Write "".

    Begin Check, If input >= 1:
        Begin Check, If input <= 9:
            Begin Check, If grid (input) Is 0:
                /* place marker */
                Set grid To player At input.

                /* check for win */
                offset = 0.
                Begin Loop, Repeat 3 Times:
                    Begin Check, If active:
                        Begin Check, If grid (1 + offset) Is player:
                            Begin Check, If grid (2 + offset) Is player:
                                Begin Check, If grid (3 + offset) Is player:
                                    Write output.
                                    Write "".
                                    Write winMsg.
                                    active = 0.
                                End Check.
                            End Check.
                        End Check.
                    End Check.
                    Increment offset.
                End Loop.
                offset = 0.
                Begin Loop, Repeat 3 Times:
                    Begin Check, If active:
                        Begin Check, If grid (1 + offset) Is player:
                            Begin Check, If grid (4 + offset) Is player:
                                Begin Check, If grid (7 + offset) Is player:
                                    Write output.
                                    Write "".
                                    Write winMsg.
                                    active = 0.
                                End Check.
                            End Check.
                        End Check.
                    End Check.
                    Increment offset.
                End Loop.
                Begin Check, If active:
                    Begin Check, If grid (1) Is player:
                        Begin Check, If grid (5) Is player:
                            Begin Check, If grid (9) Is player:
                                Write output.
                                Write "".
                                Write winMsg.
                                active = 0.
                            End Check.
                        End Check.
                    End Check.
                End Check.
                Begin Check, If active:
                    Begin Check, If grid (3) Is player:
                        Begin Check, If grid (5) Is player:
                            Begin Check, If grid (7) Is player:
                                Write output.
                                Write "".
                                Write winMsg.
                                active = 0.
                            End Check.
                        End Check.
                    End Check.
                End Check.

                Begin Check, If active:
                    /* check for draw */
                    full = 1.
                    index = 1.
                    Begin Loop, Repeat 9 Times:
                        Begin Check, If grid (index) Is 0:
                            full = 0.
                        End Check.
                        Increment index.
                    End Loop.
                    Begin Check, If full:
                        active = 0.
                        Write output.
                        Write "".
                        Write "Both players tie.".
                    End Check.

                    /* toggle player */
                    player = player Mod 2 + 1.
                End Check.
            End Check.
        End Check.
    End Check.
End Loop.