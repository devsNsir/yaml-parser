package parser.yaml_parser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
       
        App app= new App();
        
        Bibliotheque bib = app.readYaml();
        
    }
    /**
     * @return
     * @throws IOException
     */
    public   Bibliotheque readYaml() throws IOException {
    	Bibliotheque res=new Bibliotheque();
    	Dependencies dep = new Dependencies();
    	DevDependencies devDep= new DevDependencies();
    
    	File file = new File(this.getClass().getClassLoader().getResource("exo.yaml").getFile());
    	Files.lines(Paths.get(file.getPath()))
             .map(line -> line.split("\\n")) // Stream<String[]>
             .flatMap(Arrays::stream) // Stream<String>
             .distinct() ;// Stream<String>
        	 
         String name = Files.lines(Paths.get(file.getPath())).filter(p -> p.contains("name:"))
                    .map(p -> p.split(":")[1]).reduce((id1, id2) -> id2).orElse(null);
         String version = Files.lines(Paths.get(file.getPath())).filter(p -> p.contains("version:"))
                 .map(p -> p.split(":")[1]).reduce((id1, id2) -> id2).orElse(null);
         String description = Files.lines(Paths.get(file.getPath())).filter(p -> p.contains("description:"))
                 .map(p -> p.split(":")[1]).reduce((id1, id2) -> id2).orElse(null);
         String args = Files.lines(Paths.get(file.getPath())).filter(p -> p.contains("args:"))
                 .map(p -> p.split(":")[1]).reduce((id1, id2) -> id2).orElse(null);
         String browser = Files.lines(Paths.get(file.getPath())).filter(p -> p.contains("browser:"))
                 .map(p -> p.split(":")[1]).reduce((id1, id2) -> id2).orElse(null);
         String geo = Files.lines(Paths.get(file.getPath())).filter(p -> p.contains("geo:"))
                 .map(p -> p.split(":")[1]).reduce((id1, id2) -> id2).orElse(null);
         String shelf = Files.lines(Paths.get(file.getPath())).filter(p -> p.contains("shelf:"))
                 .map(p -> p.split(":")[1]).reduce((id1, id2) -> id2).orElse(null);
         String shelf_web_socket = Files.lines(Paths.get(file.getPath())).filter(p -> p.contains("shelf_web_socket:"))
                 .map(p -> p.split(":")[1]).reduce((id1, id2) -> id2).orElse(null);
         String shelf_static = Files.lines(Paths.get(file.getPath())).filter(p -> p.contains("shelf_static:"))
                 .map(p -> p.split(":")[1]).reduce((id1, id2) -> id2).orElse(null);
         String xml_rpc = Files.lines(Paths.get(file.getPath())).filter(p -> p.contains("xml_rpc:"))
                 .map(p -> p.split(":")[1]).reduce((id1, id2) -> id2).orElse(null);
         String google_maps = Files.lines(Paths.get(file.getPath())).filter(p -> p.contains("google_maps:"))
                 .map(p -> p.split(":")[1]).reduce((id1, id2) -> id2).orElse(null);
         String dart_to_js_script_rewriter = Files.lines(Paths.get(file.getPath())).filter(p -> p.contains("dart_to_js_script_rewriter:"))
                 .map(p -> p.split(":")[1]).reduce((id1, id2) -> id2).orElse(null);
         List<String> transformer = Files.lines(Paths.get(file.getPath())).filter(p -> p.contains("- "))
                 .map(p -> p.split("-")[1]).collect(Collectors.toList());
         List<String> transformers = new ArrayList<>();
         transformers.addAll( transformer);

         System.out.println(name);
         res.setName(name);
         System.out.println(version);
         res.setName(version);
         System.out.println(description);
         res.setName(description);
         System.out.println(args);
         dep.setArgs(args);
         System.out.println(browser);
         dep.setBrowser(browser);
         System.out.println(geo);
         dep.setGeo(geo);
         System.out.println(shelf);
         dep.setShelf(shelf);
         System.out.println(shelf_web_socket);
         dep.setShelf_web_socket(shelf_web_socket);
         System.out.println(shelf_static);
         dep.setShelf_static(shelf_static);
         System.out.println(xml_rpc);
         dep.setXml_rpc(xml_rpc);
         System.out.println(google_maps);
         dep.setGoogle_maps(google_maps);
         System.out.println(dart_to_js_script_rewriter);
         dep.setDart_to_js_script_rewriter(dart_to_js_script_rewriter);
         System.out.println(transformer);
         
         res.setTransformers(transformers);
         res.setDependencies(dep);
      
            
         return res;
        
    }

  
    
}
