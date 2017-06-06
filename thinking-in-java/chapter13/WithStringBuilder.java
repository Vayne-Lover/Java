class WithStringBuilder{
  public static void main(String[] args){
    String[] fields = {"Hi", "Ha", "Ya"};
    StringBuilder builder = new StringBuilder();
    for(String w:fields){
      builder.append(w);      
    }
    String result = builder.toString();
    System.out.println(result);
  }
}
