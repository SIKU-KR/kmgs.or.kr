package kr.or.kmgs.website.opensite;

import kr.or.kmgs.website.opensite.dto.MainNotice;
import kr.or.kmgs.website.opensite.dto.Member;
import kr.or.kmgs.website.opensite.dto.President;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WebService {

    @Autowired WebRepository webRepository;
    private final String bucketURL = "https://storage.cloud.google.com/kmgs-storage/";

    public List<String> getCarouselImages() {
        List<String> images = webRepository.readCarouselImages();
        List<String> fullImageUrls = new ArrayList<>();

        for (String image : images) {
            fullImageUrls.add(bucketURL + image);
        }

        return fullImageUrls;
    }

    public List<MainNotice> getMainNotices() {
        return webRepository.readNotice();
    }

    public President getPresidentInfo() {
        String imageURL = bucketURL + webRepository.readPresidentImage();
        String[] info = webRepository.readPresidentInfo();
        return new President(imageURL, info[0], info[1]);
    }

    public List<Member> getMemberList() {
        return webRepository.readMembers();
    }

}
