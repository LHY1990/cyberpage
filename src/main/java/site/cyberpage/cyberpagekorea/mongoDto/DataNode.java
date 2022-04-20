package site.cyberpage.cyberpagekorea.mongoDto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DataNode {
    String link;
    String writer;
    int view;
    int likes;
    int money;
}
