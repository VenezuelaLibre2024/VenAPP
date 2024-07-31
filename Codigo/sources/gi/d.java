package gi;

import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;

/* loaded from: classes3.dex */
public class d implements FlutterPlugin, ActivityAware, PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: a, reason: collision with root package name */
    private FlutterPlugin.FlutterPluginBinding f16274a;

    /* renamed from: b, reason: collision with root package name */
    private ActivityPluginBinding f16275b;

    /* renamed from: c, reason: collision with root package name */
    private MethodChannel f16276c;

    /* renamed from: d, reason: collision with root package name */
    private a f16277d;

    /* renamed from: e, reason: collision with root package name */
    private c f16278e;

    private void a(Context context, BinaryMessenger binaryMessenger, PluginRegistry.Registrar registrar, ActivityPluginBinding activityPluginBinding) {
        this.f16276c = new MethodChannel(binaryMessenger, "com.zt.shareextend/share_extend");
        c cVar = new c(context);
        this.f16278e = cVar;
        a aVar = new a(cVar);
        this.f16277d = aVar;
        this.f16276c.setMethodCallHandler(aVar);
        if (registrar != null) {
            registrar.addRequestPermissionsResultListener(this);
        } else {
            activityPluginBinding.addRequestPermissionsResultListener(this);
        }
    }

    private void b() {
        this.f16275b.removeRequestPermissionsResultListener(this);
        this.f16275b = null;
        this.f16276c.setMethodCallHandler(null);
        this.f16276c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f16275b = activityPluginBinding;
        a(activityPluginBinding.getActivity(), this.f16274a.getBinaryMessenger(), null, this.f16275b);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f16274a = flutterPluginBinding;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        b();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f16274a = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 == 100 && iArr.length > 0 && iArr[0] == 0) {
            this.f16278e.c();
        }
        return false;
    }
}
