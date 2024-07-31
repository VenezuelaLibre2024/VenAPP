package km;

import android.app.Activity;
import androidx.appcompat.app.AbstractC0224g;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* renamed from: km.c */
/* loaded from: classes3.dex */
public class C9294c implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware {

    /* renamed from: a */
    private C9293b f22553a;

    /* renamed from: b */
    private ActivityPluginBinding f22554b;

    static {
        AbstractC0224g.m918I(true);
    }

    /* renamed from: b */
    private void m27737b(BinaryMessenger binaryMessenger) {
        new MethodChannel(binaryMessenger, "plugins.hunghd.vn/image_cropper").setMethodCallHandler(this);
    }

    /* renamed from: a */
    public C9293b m27738a(Activity activity) {
        C9293b c9293b = new C9293b(activity);
        this.f22553a = c9293b;
        return c9293b;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        m27738a(activityPluginBinding.getActivity());
        this.f22554b = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this.f22553a);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m27737b(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f22554b.removeActivityResultListener(this.f22553a);
        this.f22554b = null;
        this.f22553a = null;
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
            this.f22553a.m27736j(methodCall, result);
        } else if (methodCall.method.equals("recoverImage")) {
            this.f22553a.m27735h(methodCall, result);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
