package exercise.chapter_16;

public class AvocardoSituation {

    public static void main(String[] args){
        // 장보기전

        int milks = 0; // 우유 0개
        int avocardos = 0; // 아보카도 0개
        boolean isExistAvocardo = true; // 아보카도 존재 여부

        // 장보기
        if(isExistAvocardo){
            milks = 6;
        } else {
            milks = 1;
        }

        // 집으로 돌아오기
        String comment = String.format("아내야, 장보고 돌아왔어 아보카도 %d개, 우유 %d개 사왔어", avocardos, milks);
        System.out.println(comment);

    }
}
