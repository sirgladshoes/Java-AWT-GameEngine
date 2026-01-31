public class EngineMath {
    public static class Vector2{
        public double x, y;
        public Vector2(double x, double y){
            this.x = x;
            this.y = y;
        }
    } 

    public static class Rect{
        private double width, height;
        public Vector2 position;

        public Rect (double width, double height, Vector2 position){
            this.width = width;
            this.height = height;
            this.position = position;
        }

        public boolean isRectOverlaping(Rect other){
            if (position.x <= other.position.x && position.x + width >= other.position.x){
                if (position.y <= other.position.y && position.y + height >= other.position.y){
                    return true;
                }
            }
            if (other.position.x <= position.x && other.position.x + other.width >= position.x){
                if (other.position.y <= position.y && other.position.y + other.height >= position.y){
                    return true;
                }
            }
            return false;
        }
    }
}
