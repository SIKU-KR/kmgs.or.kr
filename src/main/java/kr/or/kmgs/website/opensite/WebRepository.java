package kr.or.kmgs.website.opensite;

import kr.or.kmgs.website.opensite.dto.MainNotice;
import kr.or.kmgs.website.opensite.dto.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;


@Repository
public class WebRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public WebRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<String> readCarouselImages() {
        final String sql = "SELECT url FROM Image WHERE type='carousel' ORDER BY num";
        return jdbcTemplate.queryForList(sql, String.class);
    }

    public List<MainNotice> readNotice() {
        final String sql = "SELECT title, content FROM TitleAndContent \n" +
                "WHERE type = 'notice' AND expired_at IS NULL OR expired_at >= CONVERT_TZ(CURDATE(), '+00:00', '+09:00')";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            MainNotice notice = new MainNotice();
            notice.setTitle(rs.getString("title"));
            notice.setContent(rs.getString("content"));
            return notice;
        });
    }

    public String readPresidentImage() {
        final String sql = "SELECT url FROM Image WHERE type='president'";
        return jdbcTemplate.queryForObject(sql, String.class);
    }

    public String[] readPresidentInfo() {
        final String sql = "SELECT title, content FROM TitleAndContent WHERE type = 'president'";

        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
            String title = rs.getString("title");
            String content = rs.getString("content");
            return new String[]{title, content};
        });
    }

    public List<Member> readMembers() {
        final String sql = "SELECT position, name, organization FROM Member ORDER BY num";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Member member = new Member();
            member.setName(rs.getString("name"));
            member.setOrganization(rs.getString("organization"));
            member.setPosition(rs.getString("position"));
            return member;
        });
    }

}
