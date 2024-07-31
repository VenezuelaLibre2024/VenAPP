package gi;

import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;

/* renamed from: gi.d */
/* loaded from: classes3.dex */
public class C7575d implements FlutterPlugin, ActivityAware, PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: a */
    private FlutterPlugin.FlutterPluginBinding f17911a;

    /* renamed from: b */
    private ActivityPluginBinding f17912b;

    /* renamed from: c */
    private MethodChannel f17913c;

    /* renamed from: d */
    private C7572a f17914d;

    /* renamed from: e */
    private C7574c f17915e;

    /* renamed from: a */
    private void m23013a(Context context, BinaryMessenger binaryMessenger, PluginRegistry.Registrar registrar, ActivityPluginBinding activityPluginBinding) {
        this.f17913c = new MethodChannel(binaryMessenger, "com.zt.shareextend/share_extend");
        C7574c c7574c = new C7574c(context);
        this.f17915e = c7574c;
        C7572a c7572a = new C7572a(c7574c);
        this.f17914d = c7572a;
        this.f17913c.setMethodCallHandler(c7572a);
        if (registrar != null) {
            registrar.addRequestPermissionsResultListener(this);
        } else {
            activityPluginBinding.addRequestPermissionsResultListener(this);
        }
    }

    /* renamed from: b */
    private void m23014b() {
        this.f17912b.removeRequestPermissionsResultListener(this);
        this.f17912b = null;
        this.f17913c.setMethodCallHandler(null);
        this.f17913c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f17912b = activityPluginBinding;
        m23013a(activityPluginBinding.getActivity(), this.f17911a.getBinaryMessenger(), null, this.f17912b);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f17911a = flutterPluginBinding;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        m23014b();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f17911a = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 == 100 && iArr.length > 0 && iArr[0] == 0) {
            this.f17915e.m23011c();
        }
        return false;
    }
}
