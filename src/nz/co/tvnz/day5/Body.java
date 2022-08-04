package nz.co.tvnz.day5;

public class Body {
        public long idNum;
        public String name=null;
        public Body orbits=null;
        private static long nextId=0;

        {
            idNum=nextId++;
        }

        public Body(String bodyName,Body orbitsAround){
            name=bodyName;
            orbits=orbitsAround;
        }


}
