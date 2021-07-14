public class Project  extends Book implements IKho{
    private int pageProject;
    private String statusProject;
    private int yearProject;
    public Project(int id, String name, String publishing, int year, int pageProject, String statusProject,
            int yearProject) {
        super(id, name, publishing, year);
        this.pageProject = pageProject;
        this.statusProject = statusProject;
        this.yearProject = yearProject;
    }
    public int getPageProject() {
        return pageProject;
    }
    public void setPageProject(int pageProject) {
        this.pageProject = pageProject;
    }
    public String getStatusProject() {
        return statusProject;
    }
    public void setStatusProject(String statusProject) {
        this.statusProject = statusProject;
    }
    public int getYearProject() {
        return yearProject;
    }
    public void setYearProject(int yearProject) {
        this.yearProject = yearProject;
    }
    @Override
    public String location() {
        if (pageProject <= 500) {
            return "Tầng 1";
        }
        if (pageProject > 500) {
            return "Tầng 2";
        }
        return null;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() +"-"+pageProject+" trang -"+statusProject+"-Năm bảo vệ : "+yearProject+"-"+location();
    }
    
}
