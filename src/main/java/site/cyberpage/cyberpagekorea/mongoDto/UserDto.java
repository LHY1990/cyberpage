package site.cyberpage.cyberpagekorea.mongoDto;


import lombok.Data;

@Data
public class UserDto {

    private String name;
    private int age;

    @Override
    public String toString(){
        return "결과 : "+name+", "+age+" 출력완료";
    }
}
