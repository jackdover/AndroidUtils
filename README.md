# AndroidUtils

## How to use

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //初始化log, 如果不初始化, 将使用 DLog 的默认样式  (无头, 无框)
        DLogUtils.initDLog(this);
    }
}

### 注意: 自定义MyApplication在清单文件中的指定

<application
        android:name=".MyApplication"
        
        
### 喜好配置, 可以直接在 DLogUtils.initDLog() 中设置即可


