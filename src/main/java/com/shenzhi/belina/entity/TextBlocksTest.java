package com.shenzhi.belina.entity;

import org.junit.jupiter.api.Test;

public class TextBlocksTest {

    @Test
    public void test1() {
        String text1 = "The Sound of silence\n" +
                "Hello darkness , my old friend\n" +
                "I 've come to talk with you again\n";

        System.out.println(text1);
        System.out.println();
        //   jdk13
        String text = """
                The Sound of silence
                Hello darkness , my old friend
                I 've come to talk with you again
                """;
        System.out.println(text);
        System.out.println(text1.length());
        System.out.println(text.length());
    }

    //html
    @Test
    public void test2(){
        String html1 = "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>java14新特性</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <p>hello,atguigu</p>\n" +
                "</body>\n" +
                "</html>";
        //jdk13中的新特性：
        String html2 = """
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <title>java14新特性</title>
                </head>
                <body>
                    <p>hello,atguigu</p>
                </body>
                </html>
                """;
        System.out.println(html1+html2);
    }

    //json
    @Test
    public void test3() {
        //jdk13之前的写法
        String myJson = "{\n" +
                "    \"name\":\"Song Hongkang\",\n" +
                "     \"address\":\"www.atguigu.com\",\n" +
                "    \"email\":\"shkstart@126.com\"\n" +
                "}";
        StringBuilder filePath = new StringBuilder();

        //jdk13的新特性
        String myJson1 = """
                {
                    "name":"Song Hongkang",
                     "address":"www.atguigu.com",
                    "email":"shkstart@126.com"
                }""";
        System.out.println(myJson1);
    }

    //sql
    @Test
    public void test4(){
        String sql = "SELECT id,NAME,email\n" +
                "FROM customers\n" +
                "WHERE id > 4\n" +
                "ORDER BY email DESC";
        System.out.println(sql);
        //jdk13新特性：
        String sql1 = """
                SELECT id,NAME,email
                FROM customers
                WHERE id > 4
                ORDER BY email DESC
                """;
        System.out.println();
        System.out.println(sql1);
    }
    //jdk14新特性
    @Test
    public void test5(){
        String sql1 = """
                SELECT id,NAME,email
                FROM customers
                WHERE id > 4
                ORDER BY email DESC
                """;
        System.out.println(sql1);

        // \:取消换行操作
        // \s:表示一个空格
        String sql2 = """
                SELECT id,NAME,email \
                FROM customers\s\
                WHERE id > 4 \
                ORDER BY email DESC\
                """;
        String sql3 = """
                select id,name,email \
                from customers\s\
                where id > 4\
                order by emial \s desc
                """;

        System.out.println(sql2);
        System.out.println(sql3);
        System.out.println(sql2.length());
    }
}


