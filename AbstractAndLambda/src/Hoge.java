import java.util.function.BiFunction;

public class Hoge extends AbstractHoge {

    //足し算
    public void printlnSum(Integer x, Integer y){
        BiFunction<Integer, Integer, Integer> cal = (a, b) -> a + b;
        super.execute(x, y, cal);
    }

    @Override
    protected void checkParam(Integer x, Integer y) throws FailedCheckException {
        if(x < y){
            throw new FailedCheckException("第一引数は第二引数以上を入力してください。");
        }
    }
}