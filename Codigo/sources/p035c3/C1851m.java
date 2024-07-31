package p035c3;

import android.app.Activity;
import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;

/* renamed from: c3.m */
/* loaded from: classes.dex */
public final class C1851m implements FlutterPlugin, ActivityAware {

    /* renamed from: a */
    private final C1855q f7768a = new C1855q();

    /* renamed from: b */
    private MethodChannel f7769b;

    /* renamed from: c */
    private PluginRegistry.Registrar f7770c;

    /* renamed from: d */
    private ActivityPluginBinding f7771d;

    /* renamed from: e */
    private C1850l f7772e;

    /* renamed from: a */
    private void m9884a() {
        ActivityPluginBinding activityPluginBinding = this.f7771d;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this.f7768a);
            this.f7771d.removeRequestPermissionsResultListener(this.f7768a);
        }
    }

    /* renamed from: b */
    private void m9885b() {
        PluginRegistry.Registrar registrar = this.f7770c;
        if (registrar != null) {
            registrar.addActivityResultListener(this.f7768a);
            this.f7770c.addRequestPermissionsResultListener(this.f7768a);
            return;
        }
        ActivityPluginBinding activityPluginBinding = this.f7771d;
        if (activityPluginBinding != null) {
            activityPluginBinding.addActivityResultListener(this.f7768a);
            this.f7771d.addRequestPermissionsResultListener(this.f7768a);
        }
    }

    /* renamed from: c */
    private void m9886c(Context context, BinaryMessenger binaryMessenger) {
        this.f7769b = new MethodChannel(binaryMessenger, "flutter.baseflow.com/permissions/methods");
        C1850l c1850l = new C1850l(context, new C1839a(), this.f7768a, new C1859u());
        this.f7772e = c1850l;
        this.f7769b.setMethodCallHandler(c1850l);
    }

    /* renamed from: d */
    private void m9887d(Activity activity) {
        C1850l c1850l = this.f7772e;
        if (c1850l != null) {
            c1850l.m9883i(activity);
        }
    }

    /* renamed from: e */
    private void m9888e() {
        this.f7769b.setMethodCallHandler(null);
        this.f7769b = null;
        this.f7772e = null;
    }

    /* renamed from: f */
    private void m9889f() {
        C1850l c1850l = this.f7772e;
        if (c1850l != null) {
            c1850l.m9883i(null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        m9887d(activityPluginBinding.getActivity());
        this.f7771d = activityPluginBinding;
        m9885b();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m9886c(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        m9889f();
        m9884a();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m9888e();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
