package kr.or.kmgs.website.opensite;

import kr.or.kmgs.website.opensite.dto.CarouselImage;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.awt.*;

@Repository
public class WebRepository {

    private final DataSource dataSource;

    public WebRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
