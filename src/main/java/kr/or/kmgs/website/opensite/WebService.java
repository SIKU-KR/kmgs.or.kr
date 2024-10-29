package kr.or.kmgs.website.opensite;

import kr.or.kmgs.website.opensite.dto.CarouselImage;
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

    public List<CarouselImage> getCarouselImages() {
        List<CarouselImage> carouselImages = new ArrayList<>();

        // 여기에 비즈니스 로직 추가
        carouselImages.add(new CarouselImage("https://storage.cloud.google.com/kmgs-storage/carousels/1.webp"));
        carouselImages.add(new CarouselImage("https://storage.cloud.google.com/kmgs-storage/carousels/2.webp"));
        carouselImages.add(new CarouselImage("https://storage.cloud.google.com/kmgs-storage/carousels/3.webp"));
        carouselImages.add(new CarouselImage("https://storage.cloud.google.com/kmgs-storage/carousels/4.webp"));

        return carouselImages;
    }

    public List<MainNotice> getMainNotices() {
        List<MainNotice> mainNotices = new ArrayList<>();

        mainNotices.add(new MainNotice("14th Asian Microgravity Symposium in India", """
                2022년도에 제주도에서 개최되었던 AMS가 올해는 인도 첸나이에서 개최됩니다. 많은 관심과 \u200B참석 부탁드립니다.<br/>
                가. 2024 아시안 마이크로그래비티 심포지움<br/>1) 일 시: 2024년 12월 1일~6일<br/>2) 장 소: IIT Madras, Chennai,
                India<br/>3) 초록마감 : 2024년 8월 18일 (연장되었으며, 8월
                20일부터 acceptance 확인) Early bird registration : 2024년 9월 20일<br/>4) 학회웹사이트 :
                https://web.iitm.ac.in/AMS2024/<br/>5) 관련 정보는 학회소식 게시판에 추가로 있습니다."""));

        return mainNotices;
    }

    public President getPresidentInfo() {
        return new President("https://storage.cloud.google.com/kmgs-storage/president.webp",
                "학회장 인사말 / 회장 이근우",
                """
                안녕하십니까?<br/><br/>
                2024년 한국마이크로중력학회 9대 회장을 맡게 된 한국표준과학연구원 (KRISS)의 이근우입니다.<br/><br/>
                지난 몇 년 간의 코로나 상황에도 불구하고, 전임 회장이신 회장님과 학회 임원 및 회원들께서 보여주신 노력과 헌신으로, 2022년 제13회 Asian Microgravity
                Symposium을 성공적으로 마친 것에
                감사와 경의를 표합니다. 또한 여기까지로 부족한 저를 학회 신임회장으로 선출해주신 것에 감사드리며, 최선을 다해 학회의 발전을 위해 봉사하고자 합니다.<br/><br/>
                2010년 본 학회가 설립된 후, 국내외 여러 연구환경의 변화에도 불구하고, 본 학회는 우주기술의 응용 및 연구에 대한 선도적 관심과 학술 활동을 유지해 왔습니다.
                우리나라는 이제 본격적인
                우주개발시대로 접어들기 시작하였고, 우주환경 중력 실험이 되어, 우주기술 응용연구의 전문성과 학문적 기여는 더욱 중요한 시기를 맞이하였습니다. 따라서, 저는 2024년 저의
                최종 목표로서 본
                학회가 이런 시대적 변화와 요구에 부합하는 학술단체로 성장하고 주어진 시대적 요구에 부응하기 위해 다음과 같은 활동을 하고자 합니다.<br/><br/>
                첫째, 학술기능강화입니다. 본 학회가 우주기술 응용 연구에 대한 열정과 희망으로 창립한 것을 이어서, 마이크로중력환경에서 발생하는 여러 자연적, 기술적 문제를 다루는
                전문학술심포지움의
                역할을 강화하고자 합니다. 이에 본 학회에서 다룰 수 있는 다양한 연구주제를 발굴 및 확대하기 위한 노력과, 새로운 편집판을 신설하여 2-3년 후 정식학술지로 등록 준비를
                하고자 합니다.<br/><br/>
                둘째, 연구기획 및 경쟁기능 강화입니다. 우주환경 중력 실험이 된 상황에서 우주환경에서 수행될 미션과 문제들을 선정하고 우리나라가 체계적인 우주개발을 수행할 수 있도록, 본
                학회에서 이를
                발굴 및 연결을 개선하고자 합니다.<br/><br/>
                셋째, 국제협력강화입니다. 현재 국내에서 수행하는 독자적인 마이크로중력 실험의 매우 영역이므로, 국제협력을 통한 연구 활동이 필수적입니다. 따라서, 학회차원에서 국제협력을
                강화하여 가능한
                연구 협동 기회를 지원하고자 합니다.<br/><br/>
                마지막으로 회원수 증대입니다. 더 많은 연구자와 전문가들이 우리의 학회에 가입하여 함께 지식을 나누고 협력할 수 있도록 노력하겠습니다.<br/><br/>
                이러한 목표를 달성하기 위해서는 우리 모두의 협력과 노력이 필요합니다. 부족하지만 제가 가진 경험과 지식을 활용해 최선을 다하고자 하며, 여러분의 적극적인 참여와 제안,
                그리고 협조를
                부탁드리며, 매년 더 나은 한국마이크로중력학회를 만들어 나가기 위해 노력하겠습니다.<br/><br/>
                이근우 올림
                """);
    }

    public List<Member> getMemberList() {
        List<Member> memberList = new ArrayList<>();

        memberList.add(new Member("회장", "이근우", "한국표준과학연구원"));
        memberList.add(new Member("기획부회장", "이주희", "KARI"));
        memberList.add(new Member("총무부회장", "박설현", "조선대"));
        memberList.add(new Member("학술부회장", "이창수", "충남대"));
        memberList.add(new Member("학술부회장", "이준호", "고려대"));
        memberList.add(new Member("편집부회장", "박준수", "연세대"));
        memberList.add(new Member("국제협력 및 사업부회장", "최기혁", "KARI"));
        memberList.add(new Member("감사", "김규성", "인하대"));
        memberList.add(new Member("기획이사", "강창우", "전북대"));
        memberList.add(new Member("기획이사", "이어진", "인하대"));
        memberList.add(new Member("기획이사", "이은주", "중앙대 의대"));
        memberList.add(new Member("총무이사", "김연규", "KARI"));
        memberList.add(new Member("학술이사", "이진일", "연세대"));
        memberList.add(new Member("학술이사", "조용찬", "한국표준과학연구원"));
        memberList.add(new Member("학술이사", "최재혁", "부경대"));

        return memberList;
    }

}
