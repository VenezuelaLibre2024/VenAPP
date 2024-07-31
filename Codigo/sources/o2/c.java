package o2;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;

/* loaded from: classes.dex */
public class c implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware {

    /* renamed from: a, reason: collision with root package name */
    private final a f22151a = new a();

    /* renamed from: b, reason: collision with root package name */
    private ActivityPluginBinding f22152b;

    /* renamed from: c, reason: collision with root package name */
    private MethodChannel f22153c;

    private void a(ActivityPluginBinding activityPluginBinding) {
        this.f22152b = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this.f22151a.f22143b);
    }

    private void b() {
        this.f22152b.removeActivityResultListener(this.f22151a.f22143b);
        this.f22152b = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        a(activityPluginBinding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "app.meedu/flutter_facebook_auth");
        this.f22153c = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        b();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        b();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f22153c.setMethodCallHandler(null);
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
                this.f22151a.c(result);
                return;
            case 1:
                this.f22151a.e(result);
                return;
            case 2:
                List<String> list = (List) methodCall.argument("permissions");
                this.f22151a.g((String) methodCall.argument("loginBehavior"));
                this.f22151a.f(this.f22152b.getActivity(), list, result);
                return;
            case 3:
                this.f22151a.a(this.f22152b.getActivity(), result);
                return;
            case 4:
                this.f22151a.d((String) methodCall.argument("fields"), result);
                return;
            default:
                result.notImplemented();
                return;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        a(activityPluginBinding);
    }
}
