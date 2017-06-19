public enum OzWitch{
    EAST("east"),
    SOUTH("south"),
    WEST("west"),
    NORTH("north");

    private String description;

    OzWitch(String des){
        this.description = des;
    }

    public String getDescription(){ 
        return description;
    }

    public static void main(String[] args){
        for(OzWitch o : OzWitch.values()){
            System.out.println(o + ": " + o.getDescription());
        }
    }
}