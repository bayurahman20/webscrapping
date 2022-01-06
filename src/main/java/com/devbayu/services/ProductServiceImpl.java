package com.devbayu.services;

import com.devbayu.models.Product;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class ProductServiceImpl implements ProductService {

    @Override
    public void getData() throws IOException {
        Document document = Jsoup.connect("https://www.tokopedia.com/p/handphone-tablet/handphone?page=1").get();
        System.out.println(document.title());

        Elements elements = document.getElementsByClass("css-bk6tzz e1nlzfl3");

        try {
            PrintWriter writer = new PrintWriter("result.csv");
            StringBuffer header = new StringBuffer(" ");
            StringBuffer data = new StringBuffer(" ");
            Product product = new Product();

            header.append("Name Of Product,Description,Image,Price,Rating,Store\n");
            writer.write(header.toString());

            for (Element repository: elements) {
                product.setNameOfProduct(repository.getElementsByClass("css-1bjwylw").text());
                product.setDescription(product.getNameOfProduct());
                product.setImageLink(repository.getElementsByClass("css-t8frx0").toString());
                product.setPrice(repository.getElementsByClass("css-o5uqvq").text());
                product.setRating(repository.getElementsByClass("css-153qjw7").text());
                product.setNameOfMerchant(repository.getElementsByClass("css-1kr22w3").text());

                data.append(product.getNameOfProduct() == null ? " " : product.getNameOfProduct());
                data.append(",");
                data.append(product.getDescription() == null ? " " : product.getDescription());
                data.append(",");
                data.append(product.getImageLink() == null ? " " : product.getImageLink());
                data.append(",");
                data.append(product.getPrice() == null ? " " : product.getPrice());
                data.append(",");
                data.append(product.getRating() == null ? " " : product.getRating());
                data.append(",");
                data.append(product.getNameOfMerchant() == null ? " " : product.getNameOfMerchant());
                data.append(",");

                data.append("\n");
            }

            writer.write(data.toString());

            writer.close();
        } catch (FileNotFoundException error) {
            error.printStackTrace();
        }
    }
}
