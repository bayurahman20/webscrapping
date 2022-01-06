import com.devbayu.services.ProductService;
import com.devbayu.services.ProductServiceImpl;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        ProductServiceImpl productService = new ProductServiceImpl();
        productService.getData();
    }
}
