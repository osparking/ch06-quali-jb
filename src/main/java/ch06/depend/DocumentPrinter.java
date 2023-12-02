package ch06.depend;

public class DocumentPrinter {
	// [...]
	Document document = new Document();
	
	public void printDocument() {
		switch (document.getDocumentType()) {
		case WORD_DOCUMENT:
			printWORDDocument();
			break;
		case PDF_DOCUMENT:
			printPDFDocument();
			break;
		case TEXT_DOCUMENT:
			printTextDocument();
			break;
		default:
			printBinaryDocument();
			break;
		}
	}
	// [...]

	private void printBinaryDocument() {
		// TODO Auto-generated method stub
		
	}

	private void printTextDocument() {
		// TODO Auto-generated method stub
		
	}

	private void printPDFDocument() {
		// TODO Auto-generated method stub
		
	}

	private void printWORDDocument() {
		// TODO Auto-generated method stub
		
	}
}