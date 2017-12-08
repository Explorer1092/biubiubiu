package util;


import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.util.ArrayList;
import java.util.List;


public class AssertionListener extends TestListenerAdapter {

    @Override
    public void onTestStart(ITestResult result) {
        Assertion.flag = true;
        Assertion.errors.clear();
    }

    @Override
    public void onTestFailure(ITestResult tr){
        this.handleAssertion(tr);
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        this.handleAssertion(tr);
    }

    @Override
    public void onTestSuccess(ITestResult tr){
        this.handleAssertion(tr);
    }

    private int index =0;

    private void handleAssertion(ITestResult tr) {
        if (!Assertion.flag) {
            Throwable throwable = tr.getThrowable();
            if (throwable == null) {
                throwable = new Throwable();
            }
            StackTraceElement[] traces = throwable.getStackTrace();
            StackTraceElement[] alliance = new StackTraceElement[0];

            for (Error e : Assertion.errors) {
                StackTraceElement[] errorTraces = e.getStackTrace();
                StackTraceElement[] et = this.getKeyStackTrace(tr, errorTraces);
                StackTraceElement[] message = new StackTraceElement[]{new StackTraceElement("message : "+e.getMessage()+" in method : ", tr.getMethod().getMethodName(), tr.getTestClass().getRealClass().getSimpleName(), index)};
                index =0;
                alliance = this.merge(alliance, message);
                alliance = this.merge(alliance, et);

            }
            if(traces!=null){
                traces = this.getKeyStackTrace(tr, traces);
                alliance = this.merge(alliance, traces);
            }
            throwable.setStackTrace(alliance);
            tr.setThrowable(throwable);
            Assertion.flag = true;
            Assertion.errors.clear();
            tr.setStatus(ITestResult.FAILURE);

        }
    }
    private StackTraceElement[] getKeyStackTrace(ITestResult tr, StackTraceElement[] stackTraceElements){
        List<StackTraceElement> ets = new ArrayList<>();
        for (StackTraceElement stackTraceElement : stackTraceElements) {
            if(stackTraceElement.getClassName().equals(tr.getTestClass().getName())){
                ets.add(stackTraceElement);
                index = stackTraceElement.getLineNumber();
            }
        }
        StackTraceElement[] et = new StackTraceElement[ets.size()];
        for (int i = 0; i < et.length; i++) {
            et[i] = ets.get(i);
        }
        return et;
    }

    private StackTraceElement[] merge(StackTraceElement[] traces1, StackTraceElement[] traces2){
        StackTraceElement[] ste = new StackTraceElement[traces1.length+traces2.length];
        int i = 0;
        while (i < traces1.length) {
            ste[i] = traces1[i];
            i++;
        }
        i = 0;
        while (i < traces2.length) {
            ste[traces1.length+i] = traces2[i];
            i++;
        }
        return ste;
    }

}
