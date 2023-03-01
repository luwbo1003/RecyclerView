package com.example.ex3;

import java.util.ArrayList;

public class PhotoData {
    public static ArrayList<Photo> generatePhotoData(){
        ArrayList<Photo> photos = new ArrayList<>();

        photos.add(new Photo(0,"https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Walt_Disney_Studios_Alameda_Entrance.jpg/384px-Walt_Disney_Studios_Alameda_Entrance.jpg", "Walt Disney", "Công ty Walt Disney, hay thường được biết đến với tên Disney, là tập đoàn giải trí và truyền thông đa phương tiện lớn nhất thế giới. Được thành lập ngày 16 tháng 10 năm 1923 bởi anh em Walt và Roy O."));
        photos.add(new Photo(1,"https://lh3.googleusercontent.com/p/AF1QipOagifCrSJ5DjgBJXQU3bpX1Rcqhe8uUUAoWHWY=s680-w680-h510", "Disneyland", "Công viên Disneyland là công viên giải trí đầu tiên thuộc Công ty Walt Disney được xây dựng dựa trên hai công viên giải trí tại Disneyland Resort ở Anaheim, California và khai trương vào ngày 17 tháng 7 năm 1955."));
        photos.add(new Photo(2,"https://congthuong.vn/stores/news_dataimages/2022/102022/30/08/cartoon-networks20221030083916.jpg?rt=20221030083917?221030085217", "Cartoon Network", "Cartoon Network là một kênh truyền hình cáp và truyền hình vệ tinh cơ bản của Mỹ được sở hữu bởi Time Warner thông qua các công ty con của Turner Broadcasting System. Kênh phát sóng chủ yếu về chương trình dành cho trẻ em. Cartoon Network còn một công ty con là Boomerang."));
        photos.add(new Photo(3,"https://upload.wikimedia.org/wikipedia/vi/d/d2/Studio_Ghibli.gif", "Ghibli Studio", "Công ty cổ phần Studio Ghibli là một hãng phim hoạt hình Nhật Bản có trụ sở tại Koganei, Tokyo, Nhật Bản. Hãng được biết đến nhiều nhất qua việc sản xuất ra các bộ phim anime, ngoài ra hãng cũng sản xuất một vài phim ngắn, các quảng cáo trên truyền hình và một phim hoạt hình nhiều tập chiếu trên truyền hình."));
        photos.add(new Photo(4,"https://cdn.mos.cms.futurecdn.net/bZ7CoDbLP5qM376iLJyxRG.jpg", "Pixar", "Pixar Animation Studios là hãng phim hoạt hình nổi tiếng của Hoa Kỳ có trụ sở chính tại Emeryville, California."));
        photos.add(new Photo(5,"https://static.wikia.nocookie.net/closinglogogroup/images/0/02/DreamWorks_SKG_1997_Logo.png/revision/latest?cb=20161015065642", "DreamWorks", "DreamWorks Pictures, hay DreamWorks SKG là một hãng phim Hoa Kỳ chuyên sản xuất và phân phối phim điện ảnh, trò chơi điện tử và chương trình truyền hình. DreamWorks bắt đầu hoạt động từ năm 1994 và được điều hành bởi Steven Spielberg, Jeffrey Katzenberg và David Geffen."));
        photos.add(new Photo(6,"https://kenh14cdn.com/thumb_w/650/2016/1-1468729458339.jpg", "Illumination", "Illumination là một xưởng phim hoạt hình máy tính của Mỹ, được thành lập bởi Chris Meledandri vào năm 2007. Illumination thuộc sở hữu của Meledandri và thương hiệu Illumination do Universal Pictures đồng sở hữu, một bộ phận của Comcast thông qua công ty con NBCUniversal thuộc sở hữu hoàn toàn của nó."));

        return photos;
    }

    public static Photo getPhotoFromId(int id){
        ArrayList<Photo> phs = generatePhotoData();
        for (int i = 0; i< phs.size(); i++)
            if (phs.get(i).getId() == id)
                return phs.get(i);
        return null;
    }
}
