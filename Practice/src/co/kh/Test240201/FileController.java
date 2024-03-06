package co.kh.Test240201;

public class FileController {
	FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		boolean check = false;
		if (fd.checkName(file)) {
			check = true;
		}
		return check;
	}
	
	public void fileSave(String file, StringBuilder sb) {
		fd.fileSave(file, sb.toString());
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		sb.append(fd.fileOpen(file));
		return sb;
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		String s = sb.toString();
		fd.fileEdit(file, s);
	}
}
