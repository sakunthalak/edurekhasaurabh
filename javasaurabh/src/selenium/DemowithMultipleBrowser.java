package selenium;

public class DemowithMultipleBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WorkingwithMultipleBrowser mb=new WorkingwithMultipleBrowser();
		mb.invokebrowser("firefox");
		mb.navigatecommands();
		System.out.println(mb.gettitle());
		mb.closebrowser();
	}

}
