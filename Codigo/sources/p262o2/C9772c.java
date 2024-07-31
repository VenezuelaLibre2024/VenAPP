package p262o2;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;

/* renamed from: o2.c */
/* loaded from: classes.dex */
public class C9772c implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware {

    /* renamed from: a */
    private final C9770a f24084a = new C9770a();

    /* renamed from: b */
    private ActivityPluginBinding f24085b;

    /* renamed from: c */
    private MethodChannel f24086c;

    /* renamed from: a */
    private void m29321a(ActivityPluginBinding activityPluginBinding) {
        this.f24085b = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this.f24084a.f24076b);
    }

    /* renamed from: b */
    private void m29322b() {
        this.f24085b.removeActivityResultListener(this.f24084a.f24076b);
        this.f24085b = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        m29321a(activityPluginBinding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "app.meedu/flutter_facebook_auth");
        this.f24086c = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        m29322b();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        m29322b();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f24086c.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1682957889:
                if (str.equals("getAccessToken")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1097360022:
                if (str.equals("logOut")) {
                    c10 = 1;
                    break;
                }
                break;
            case 103149417:
                if (str.equals("login")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1120441817:
                if (str.equals("expressLogin")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1810935691:
                if (str.equals("getUserData")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.f24084a.m29312c(result);
                return;
            case 1:
                this.f24084a.m29314e(result);
                return;
            case 2:
                List<String> list = (List) methodCall.argument("permissions");
                this.f24084a.m29316g((String) methodCall.argument("loginBehavior"));
                this.f24084a.m29315f(this.f24085b.getActivity(), list, result);
                return;
            case 3:
                this.f24084a.m29311a(this.f24085b.getActivity(), result);
                return;
            case 4:
                this.f24084a.m29313d((String) methodCall.argument("fields"), result);
                return;
            default:
                result.notImplemented();
                return;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        m29321a(activityPluginBinding);
    }
}
