package mazeRunner;

public class Main {

	public static void main(String[] args) {
		Maze maze = new Maze();
		maze.print();
	}
}

class Maze{
	private int[][] maze = {{1,1,1,1,1,1,1,1,1,1},
							{0,0,1,0,1,0,1,0,0,1},
							{1,0,1,0,0,0,1,0,1,1},
							{1,0,0,0,1,1,1,0,0,0},
							{1,0,1,0,0,0,0,0,1,1},
							{1,0,1,0,1,1,1,0,1,1},
							{1,0,1,0,1,0,0,0,1,1},
							{1,0,1,0,1,1,1,0,1,1},
							{1,0,1,0,0,0,1,0,0,1},
							{1,1,1,1,1,1,1,1,1,1}
						   };
	
	void print(){
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze.length; j++) 
				System.out.print(maze[i][j] == 1? "\u2588\u2588" : "  ");
			System.out.println();
		}
	}
}