package parser.yaml_parser;

public class Dependencies {

		 private String args;
		 private String browser;
	     private String geo;

	     private String shelf;
	     private String shelf_web_socket;
	     private String shelf_static;
	     private String xml_rpc;
	     private String google_maps;
	     private String dart_to_js_script_rewriter;
	     
		public Dependencies(String args, String browser, String geo, String shelf, String shelf_web_socket,
				String shelf_static, String xml_rpc, String google_maps, String dart_to_js_script_rewriter) {
			super();
			this.args = args;
			this.browser = browser;
			this.geo = geo;
			this.shelf = shelf;
			this.shelf_web_socket = shelf_web_socket;
			this.shelf_static = shelf_static;
			this.xml_rpc = xml_rpc;
			this.google_maps = google_maps;
			this.dart_to_js_script_rewriter = dart_to_js_script_rewriter;
		}
		public Dependencies() {
			super();
		}
		public String getArgs() {
			return args;
		}
		public void setArgs(String args) {
			this.args = args;
		}
		public String getBrowser() {
			return browser;
		}
		public void setBrowser(String browser) {
			this.browser = browser;
		}
		public String getGeo() {
			return geo;
		}
		public void setGeo(String geo) {
			this.geo = geo;
		}
		public String getShelf() {
			return geo;
		}
		public void setShelf(String shelf) {
			this.shelf = shelf;
		}
		public String getShelf_web_socket() {
			return shelf_web_socket;
		}
		
		public void setShelf_web_socket(String shelf_web_socket) {
			this.shelf_web_socket = shelf_web_socket;
		}
		public String getShelf_static() {
			return shelf_static;
		}
		public void setShelf_static(String shelf_static) {
			this.shelf_static = shelf_static;
		}
		public String getXml_rpc() {
			return xml_rpc;
		}
		public void setXml_rpc(String xml_rpc) {
			this.xml_rpc = xml_rpc;
		}
		public String getGoogle_maps() {
			return google_maps;
		}
		public void setGoogle_maps(String google_maps) {
			this.google_maps = google_maps;
		}
		public String getDart_to_js_script_rewriter() {
			return dart_to_js_script_rewriter;
		}
		public void setDart_to_js_script_rewriter(String dart_to_js_script_rewriter) {
			this.dart_to_js_script_rewriter = dart_to_js_script_rewriter;
		}
		
	     
	     }
