package MicroC_language;

/**
 * Created by root on 11/28/16.
 */
public interface AbstractWorklist<LabelTuple> {


    void push(LabelTuple edge);

    LabelTuple pop();

    Integer size();
}
