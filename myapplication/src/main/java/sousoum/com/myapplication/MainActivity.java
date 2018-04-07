package sousoum.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import sousoum.com.userlib.DependencyInfo;
import sousoum.com.userlib.DependencyInfoKt;

public class MainActivity extends AppCompatActivity {
    private final DependencyInfoKt mDependencyInfoKt = new DependencyInfoKt();

    private final DependencyInfo mDependencyInfo = new DependencyInfo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDependencyInfoKt.getDependencyVersion();
        mDependencyInfoKt.useDependencyFunction();

        mDependencyInfo.getDependencyVersion();
        mDependencyInfo.useDependencyFunction();
    }
}
