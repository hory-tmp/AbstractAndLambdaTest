import java.util.function.BiFunction;

abstract public class AbstractHoge {
    void execute(Integer x, Integer y, BiFunction<Integer, Integer, Integer> cal){
        try{
            //前処理
            checkParam(x, y);
            //中間処理
            Integer result = cal.apply(x, y);
            //後処理
            System.out.println("計算結果:" + result);
        }
        catch (FailedCheckException e){
            //入力値チェックで例外出たらエラーメッセージ
            System.out.println(e.getMessage());
        }
    }

    abstract protected void checkParam(Integer x, Integer y) throws FailedCheckException;
}