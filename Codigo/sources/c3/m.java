package c3;

import android.app.Activity;
import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;

/* loaded from: classes.dex */
public final class m implements FlutterPlugin, ActivityAware {

    /* renamed from: a, reason: collision with root package name */
    private final q f6819a = new q();

    /* renamed from: b, reason: collision with root package name */
    private MethodChannel f6820b;

    /* renamed from: c, reason: collision with root package name */
    private PluginRegistry.Registrar f6821c;

    /* renamed from: d, reason: collision with root package name */
    private ActivityPluginBinding f6822d;

    /* renamed from: e, reason: collision with root package name */
    private l f6823e;

    private void a() {
        ActivityPluginBinding activityPluginBinding = this.f6822d;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this.f6819a);
            this.f6822d.removeRequestPermissionsResultListener(this.f6819a);
        }
    }

    private void b() {
        PluginRegistry.Registrar registrar = this.f6821c;
        if (registrar != null) {
            registrar.addActivityResultListener(this.f6819a);
            this.f6821c.addRequestPermissionsResultListener(this.f6819a);
            return;
        }
        ActivityPluginBinding activityPluginBinding = this.f6822d;
        if (activityPluginBinding != null) {
            activityPluginBinding.addActivityResultListener(this.f6819a);
            this.f6822d.addRequestPermissionsResultListener(this.f6819a);
        }
    }

    private void c(Context context, BinaryMessenger binaryMessenger) {
        this.f6820b = new MethodChannel(binaryMessenger, "flutter.baseflow.com/permissions/methods");
        l lVar = new l(context, new a(), this.f6819a, new u());
        this.f6823e = lVar;
        this.f6820b.setMethodCallHandler(lVar);
    }

    private void d(Activity activity) {
        l lVar = this.f6823e;
        if (lVar != null) {
            lVar.i(activity);
        }
    }

    private void e() {
        this.f6820b.setMethodCallHandler(null);
        this.f6820b = null;
        this.f6823e = null;
    }

    private void f() {
        l lVar = this.f6823e;
        if (lVar != null) {
            lVar.i(null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        d(activityPluginBinding.getActivity());
        this.f6822d = activityPluginBinding;
        b();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        c(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        f();
        a();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        e();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
