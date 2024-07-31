package h4;

import android.app.ActivityManager;
import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes.dex */
public class a implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    private MethodChannel f16376a;

    /* renamed from: b, reason: collision with root package name */
    private Context f16377b;

    private long a() {
        ActivityManager activityManager = (ActivityManager) this.f16377b.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f16377b = flutterPluginBinding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "dev/system_info_plus");
        this.f16376a = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f16376a.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals("getMemorySpace")) {
            result.success(Integer.valueOf((int) (a() / 1048576)));
        } else {
            result.notImplemented();
        }
    }
}
