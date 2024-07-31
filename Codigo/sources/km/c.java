package km;

import android.app.Activity;
import androidx.appcompat.app.g;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes3.dex */
public class c implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware {

    /* renamed from: a, reason: collision with root package name */
    private b f20731a;

    /* renamed from: b, reason: collision with root package name */
    private ActivityPluginBinding f20732b;

    static {
        g.I(true);
    }

    private void b(BinaryMessenger binaryMessenger) {
        new MethodChannel(binaryMessenger, "plugins.hunghd.vn/image_cropper").setMethodCallHandler(this);
    }

    public b a(Activity activity) {
        b bVar = new b(activity);
        this.f20731a = bVar;
        return bVar;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        a(activityPluginBinding.getActivity());
        this.f20732b = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this.f20731a);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        b(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f20732b.removeActivityResultListener(this.f20731a);
        this.f20732b = null;
        this.f20731a = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals("cropImage")) {
            this.f20731a.j(methodCall, result);
        } else if (methodCall.method.equals("recoverImage")) {
            this.f20731a.h(methodCall, result);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
