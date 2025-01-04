package com.example.coffeecatalogue;

public class Item{
    String heading;
    String description;
    int image;

    public Item(String heading, String description, int image){


        this.heading = heading;
        this.description = description;


        this.image = image;
    }



    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}


