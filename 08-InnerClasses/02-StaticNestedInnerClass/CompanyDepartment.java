public class CompanyDepartment {
    static class Department
    {
        String departmentName;
        int departmentEmployees;
        public void departmentDetails(String departmentName, int departmentEmployees)
        {
          this.departmentName=departmentName;
          this.departmentEmployees=departmentEmployees;
          System.out.println("Department Name.."+this.departmentName);
          System.out.println("Number of Employees.."+this.departmentEmployees);
        }
    }
    public static void main(String[] args) {
        CompanyDepartment.Department d1=new Department();
        d1.departmentDetails("Hotel Management",68);
    }
    
}
