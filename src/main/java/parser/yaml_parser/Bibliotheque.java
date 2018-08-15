package parser.yaml_parser;

import java.util.List;

public class Bibliotheque {

	 
	    
		private String name;
		private String version;
		private String description;
	    private Dependencies dependencies ;
	    private List<String> transformers;
	    private DevDependencies devDependencies;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getVersion() {
			return version;
		}
		public void setVersion(String version) {
			this.version = version;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public List<String> getTransformers() {
			return transformers;
		}
		public void setTransformers(List<String> transformers) {
			this.transformers = transformers;
		}
		
	    public Dependencies getDependencies() {
			return dependencies;
		}
		public void setDependencies(Dependencies dependencies) {
			this.dependencies = dependencies;
		}
		
	      
	    

		public DevDependencies getDevDependencies() {
			return devDependencies;
		}
		public void setDevDependencies(DevDependencies devDependencies) {
			this.devDependencies = devDependencies;
		}
		public Bibliotheque(String name, String version, String description, Dependencies dependencies,
				List<String> transformers) {
			super();
			this.name = name;
			this.version = version;
			this.description = description;
			this.dependencies = dependencies;
			this.transformers = transformers;
		}
		public Bibliotheque() {
			super();
		}
	     }
