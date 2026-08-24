public class CollegeLibrary {
    static class Library
    {
        String libraryName;
        int totalBooks;
        public void libraryDetail(String libraryName, int totalBooks)
    {
        this.libraryName=libraryName;
        this.totalBooks=totalBooks;
        System.out.println("Library Name.."+this.libraryName);
        System.out.println("Total Books.."+this.totalBooks);
    }  
  }
    public static void main(String[] args) {
          CollegeLibrary. Library L1=new Library();
            L1.libraryDetail("House of Dragons",1200);
        
    }
}
