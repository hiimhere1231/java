def createBoard(board):
    for i in range(0, 3):
        temp = []
        for j in range(0, 3):
            temp.append(" - ")
        board.append(temp)

def printBoard(board):
    for i in range(0, 3):
        for j in range(0, 3):
            print(board[i][j], end='')
        print()

board = [] 
createBoard(board)
printBoard(board)