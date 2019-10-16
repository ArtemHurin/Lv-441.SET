package Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Search {
    int mapSize = 10;
    boolean finded = false;
    boolean first = false;
    boolean last = false;
    String[][] map = {{" "," "," "," "," "," "," "," "," "," "},
                      {" "," "," ","X"," ","X"," "," ","X"," "},
                      {" ","X","X"," "," "," ","X"," "," "," "},
                      {" "," "," "," ","X"," "," "," "," "," "},
                      {" "," "," "," ","X"," "," ","X"," "," "},
                      {" "," ","X"," "," ","X"," "," "," "," "},
                      {" "," ","X"," "," "," "," "," ","X"," "},
                      {" "," ","X","X"," ","X"," ","X"," "," "},
                      {" "," "," ","X"," "," "," "," "," "," "},
                      {" "," "," "," "," "," ","X"," "," "," "}};

    //[0] is X, [1] is Y
    Point start = new Point();
    Point end = new Point();

    //test
    Point fStart = new Point();
    Point fEnd = new Point();

    ArrayDeque<Point> path = new ArrayDeque<Point>();
    ArrayList<Point> startPath = new ArrayList<Point>();
    ArrayList<Point> endPath = new ArrayList<Point>();


    ArrayList<Point> A = new ArrayList<Point>();
    ArrayList<Point> B = new ArrayList<Point>();


    public Search(int sX, int sY, int eX, int eY)
    {
        printMap();
        diSearch(new Point(sX,sY),new Point(eX,eY));
    }

    public void diSearch(Point start, Point end)
    {
        map[start.X][start.Y]="@";
        map[end.X][end.Y]="@";

        printMap();

        startPath.add(start);
        endPath.add(end);

        int step = 1;
        while(!finded)
        {
            int startSize = startPath.size();
            int endSize = endPath.size();

            //from start
            for(int i=0; i<startSize; i++)
            {
                checkFree(startPath.get(i), startPath, step, A);
                //A.add(startPath.get(i));
            }
            //from end
            for(int i=0; i<endSize; i++)
            {
                checkFree(endPath.get(i), endPath, step, B);
                //B.add(endPath.get(i));
            }
            step++;

            if (step>1000)
            {
                finded=true;
                System.out.println("Stek owerflow");
            }
        }

        while(!first && !last)
        {
            //from start
            if (path.getFirst().X==start.X && path.getFirst().Y==start.Y)
            {
                first=true;
            }
            else
            {
                checkBack(path.getFirst(),A,'f');
            }

            //from end
            if ((path.getLast().X==end.X && path.getLast().Y==end.Y))
            {
                last=true;
            }
            else
            {
                checkBack(path.getLast(), B,'l');
            }


            step++;
            if (step>1000)
            {
                System.out.println("Stek owerflow 2");
            }

            printMap();
        }

        if (first && last)
        {
            createPath();
        }
    }

    private void checkFree(Point point, ArrayList path, int step, ArrayList checked)
    {
        //up
        if (point.Y-1>=0)
        {
            if (map[point.X][point.Y - 1].equals(" "))
            {
                path.add(new Point(point.X, point.Y - 1));
                map[point.X][point.Y - 1] = Integer.toString(step);
            }
            else if (!map[point.X][point.Y - 1].equals("X") && !checked.contains(point))
            {
                this.finded = true;

                fStart.X = point.X;
                fStart.Y = point.Y;

                fEnd.X = point.X;
                fEnd.Y = point.Y - 1;

                this.path.addFirst(fStart);
                this.path.addLast(fEnd);

                //Delete checked point
                checked.add(point);
                //path.remove(point);
                return;
            }
        }

        //right
        if (point.X+1<=9)
        {
            if (map[point.X + 1][point.Y].equals(" "))
            {
                path.add(new Point(point.X + 1, point.Y));
                map[point.X + 1][point.Y] = Integer.toString(step);
            }
            else if (!map[point.X + 1][point.Y].equals("X") && !checked.contains(point))
            {
                this.finded = true;

                fStart.X = point.X;
                fStart.Y = point.Y;

                fEnd.X = point.X + 1;
                fEnd.Y = point.Y;

                this.path.addFirst(fStart);
                this.path.addLast(fEnd);

                //Delete checked point
                checked.add(point);
                //path.remove(point);

                return;
            }
        }

        //down
        if (point.Y+1<=9)
        {
            if (map[point.X][point.Y + 1].equals(" "))
            {
                path.add(new Point(point.X, point.Y + 1));
                map[point.X][point.Y + 1] = Integer.toString(step);
            }
            else if (!map[point.X][point.Y + 1].equals("X") && !checked.contains(point))
            {
                this.finded = true;

                fStart.X = point.X;
                fStart.Y = point.Y;

                fEnd.X = point.X;
                fEnd.Y = point.Y + 1;

                this.path.addFirst(fStart);
                this.path.addLast(fEnd);

                //Delete checked point
                checked.add(point);
                //path.remove(point);

                return;
            }
        }


        //left
        if (point.X-1>=0)
        {
            if (map[point.X - 1][point.Y].equals(" "))
            {
                path.add(new Point(point.X - 1, point.Y));
                map[point.X - 1][point.Y] = Integer.toString(step);
            }
            else if (!map[point.X - 1][point.Y].equals("X") && !checked.contains(point))
            {
                this.finded = true;

                fStart.X = point.X;
                fStart.Y = point.Y;

                fEnd.X = point.X - 1;
                fEnd.Y = point.Y;

                this.path.addFirst(fStart);
                this.path.addLast(fEnd);

                //Delete checked point
                checked.add(point);
                //path.remove(point);

                return;
            }
        }

        //Delete checked point
        checked.add(point);
        //path.remove(point);
    }

    private void checkBack(Point point, ArrayList wave, char side)
    {
        int num = Integer.parseInt(map[point.X][point.Y]);
        int up = 100;
        int right = 100;
        int down = 100;
        int left = 100;

        if (!map[point.X][point.Y-1].equals("X") && !map[point.X][point.Y-1].equals("@") && !map[point.X][point.Y-1].equals(" "))
        {
            up = Integer.parseInt(map[point.X][point.Y - 1]);
        }

        if (!map[point.X+1][point.Y].equals("X") && !map[point.X+1][point.Y].equals("@") && !map[point.X+1][point.Y].equals(" "))
        {
            right = Integer.parseInt(map[point.X+1][point.Y]);
        }

        if (!map[point.X][point.Y+1].equals("X") && !map[point.X][point.Y+1].equals("@") && !map[point.X][point.Y+1].equals(" "))
        {
            down = Integer.parseInt(map[point.X][point.Y+1]);
        }

        if (!map[point.X-1][point.Y].equals("X") && !map[point.X-1][point.Y].equals("@") && !map[point.X-1][point.Y].equals(" "))
        {
            left = Integer.parseInt(map[point.X-1][point.Y]);
        }

        //up
        if((up<num) && wave.contains(Integer.toString(up)))
        {
            if (side=='l')
            {
                path.addFirst(new Point(point.X,point.Y-1));
            }
            else
            {
                path.addLast(new Point(point.X,point.Y-1));
            }
            return;
        }

        //right
        if((right<num) && wave.contains(Integer.toString(right)))
        {
            if (side=='l')
            {
                path.addFirst(new Point(point.X+1,point.Y));
            }
            else
            {
                path.addLast(new Point(point.X+1,point.Y));
            }
            return;
        }

        //down
        if((down<num) && wave.contains(Integer.toString(down)))
        {
            if (side=='l')
            {
                path.addFirst(new Point(point.X,point.Y+1));
            }
            else
            {
                path.addLast(new Point(point.X,point.Y+1));
            }
            return;
        }

        //left
        if((left<num) && wave.contains(Integer.toString(left)))
        {
            if (side=='l')
            {
                path.addFirst(new Point(point.X-1,point.Y));
            }
            else
            {
                path.addLast(new Point(point.X-1,point.Y));
            }
            return;
        }

        System.out.println("Problem here");
    }


    private void createPath()
    {
        startPath.removeAll(startPath);
        endPath.removeAll(endPath);
        //ArrayList<Point> partOne = new ArrayList<Point>();
        //ArrayList<Point> partTwo = new ArrayList<Point>();

        while(path.peekFirst()!=null)
        {
            startPath.add(path.pollFirst());
        }

        while(path.peekLast()!=null)
        {
            endPath.add(path.pollLast());
        }
    }

    private void showPath()
    {
        System.out.println("Your path:");
        for(int i=0; i<startPath.size(); i++)
        {
            System.out.printf("[%d,%d], ",startPath.get(i).X,endPath.get(i).Y);
        }

        for(int i=endPath.size()-1; i>=0; i--)
        {
            System.out.printf("[%d,%d], ",endPath.get(i).X,endPath.get(i).Y);
        }
    }

    private void printMap()
    {
        System.out.println("---------------------");
        for(int i=0; i<mapSize; i++)
        {

            for (int j=0; j<mapSize; j++)
            {
                System.out.print(map[i][j]);
            }
            System.out.print('\n');
        }
    }
}
