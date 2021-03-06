package com.spinn3r.noxy.reverse;

import com.spinn3r.artemis.init.Initializer;

/**
 *
 */
public class Main {

    public static final String PRODUCT = "noxy";
    public static final String ROLE = "reverse";

    public static void main(String[] args) {

        try {

            Initializer initializer = new Initializer.Builder()
              .setRole(ROLE)
              .setProduct(PRODUCT)
              .setCaller(Main.class)
              .build();

            initializer.launch(new ReverseProxyServiceReferences());

            Thread.sleep( Long.MAX_VALUE );

        } catch (Exception e) {
            e.printStackTrace();
            System.exit( 1 );
        }

    }

}
