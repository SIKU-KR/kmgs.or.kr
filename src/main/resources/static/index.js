$(document).ready(function () {
    $(".tab-content").hide(); // 모든 탭 내용을 숨김
    $("#home-content").show(); // 기본적으로 홈 탭을 보여줌

    // 탭 클릭 시 처리하는 이벤트 핸들러
    $(".tab-link").on("click", function (e) {
        e.preventDefault();
        handleTabClick($(this)); // 클릭된 탭을 처리하는 메소드 호출
    });
});

// 탭 클릭 시 처리할 메소드
function handleTabClick(tabElement) {
    var clickedTab = tabElement.attr("id");
    hideAllContents(); // 모든 콘텐츠 숨김
    setActiveTab(tabElement); // 클릭된 탭을 활성화
    showCorrespondingContent(clickedTab); // 해당 탭 콘텐츠 표시
}

// 모든 탭 콘텐츠를 숨기는 메소드
function hideAllContents() {
    $(".tab-content").hide();
}

// 클릭된 탭을 활성화하는 메소드
function setActiveTab(tabElement) {
    $(".tab-link").removeClass("active");
    tabElement.addClass("active");
}

// 탭 ID에 따라 해당 콘텐츠를 보여주는 메소드
function showCorrespondingContent(tabId) {
    switch (tabId) {
        case "home-tab":
            $("#home-content").show();
            break;
        case "about-tab":
            $("#about-content").show();
            break;
        case "history-tab":
            $("#history-content").show();
            break;
        case "event-tab":
            $("#event-content").show();
            break;
        case "photo-tab":
            $("#photo-content").show();
            break;
        case "news-tab":
            $("#news-content").show();
            break;
        default:
            break;
    }
}
