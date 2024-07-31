package oi;

import android.app.Activity;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.view.TextureRegistry;

/* loaded from: classes3.dex */
public final class z implements FlutterPlugin, ActivityAware {

    /* renamed from: a, reason: collision with root package name */
    private ActivityPluginBinding f22656a;

    /* renamed from: b, reason: collision with root package name */
    private FlutterPlugin.FlutterPluginBinding f22657b;

    /* renamed from: c, reason: collision with root package name */
    private u f22658c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a extends kotlin.jvm.internal.k implements ok.l<PluginRegistry.RequestPermissionsResultListener, ck.v> {
        a(Object obj) {
            super(1, obj, ActivityPluginBinding.class, "addRequestPermissionsResultListener", "addRequestPermissionsResultListener(Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;)V", 0);
        }

        public final void a(PluginRegistry.RequestPermissionsResultListener p02) {
            kotlin.jvm.internal.n.e(p02, "p0");
            ((ActivityPluginBinding) this.receiver).addRequestPermissionsResultListener(p02);
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ ck.v invoke(PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener) {
            a(requestPermissionsResultListener);
            return ck.v.f7137a;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        kotlin.jvm.internal.n.e(activityPluginBinding, "activityPluginBinding");
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.f22657b;
        kotlin.jvm.internal.n.b(flutterPluginBinding);
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        kotlin.jvm.internal.n.d(binaryMessenger, "getBinaryMessenger(...)");
        Activity activity = activityPluginBinding.getActivity();
        kotlin.jvm.internal.n.d(activity, "getActivity(...)");
        d dVar = new d(binaryMessenger);
        x xVar = new x();
        a aVar = new a(activityPluginBinding);
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding2 = this.f22657b;
        kotlin.jvm.internal.n.b(flutterPluginBinding2);
        TextureRegistry textureRegistry = flutterPluginBinding2.getTextureRegistry();
        kotlin.jvm.internal.n.d(textureRegistry, "getTextureRegistry(...)");
        this.f22658c = new u(activity, dVar, binaryMessenger, xVar, aVar, textureRegistry);
        this.f22656a = activityPluginBinding;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.n.e(binding, "binding");
        this.f22657b = binding;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        u uVar = this.f22658c;
        if (uVar != null) {
            ActivityPluginBinding activityPluginBinding = this.f22656a;
            kotlin.jvm.internal.n.b(activityPluginBinding);
            uVar.e(activityPluginBinding);
        }
        this.f22658c = null;
        this.f22656a = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.n.e(binding, "binding");
        this.f22657b = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        kotlin.jvm.internal.n.e(binding, "binding");
        onAttachedToActivity(binding);
    }
}
