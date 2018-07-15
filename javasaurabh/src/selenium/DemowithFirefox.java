package selenium;

public class DemowithFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WorkingwithFirefox wf=new WorkingwithFirefox();
		wf.invokebrowser();
		wf.navigatecommands();
		System.out.println(wf.gettitle());
		wf.closebrowser();
	}

}
