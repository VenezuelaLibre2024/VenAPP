package p278oi;

import android.app.Activity;
import ck.C2037v;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.view.TextureRegistry;
import kotlin.jvm.internal.C9319k;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9998l;

/* renamed from: oi.z */
/* loaded from: classes3.dex */
public final class C9978z implements FlutterPlugin, ActivityAware {

    /* renamed from: a */
    private ActivityPluginBinding f24589a;

    /* renamed from: b */
    private FlutterPlugin.FlutterPluginBinding f24590b;

    /* renamed from: c */
    private C9973u f24591c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oi.z$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a extends C9319k implements InterfaceC9998l<PluginRegistry.RequestPermissionsResultListener, C2037v> {
        a(Object obj) {
            super(1, obj, ActivityPluginBinding.class, "addRequestPermissionsResultListener", "addRequestPermissionsResultListener(Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;)V", 0);
        }

        /* renamed from: a */
        public final void m29833a(PluginRegistry.RequestPermissionsResultListener p02) {
            C9322n.m27781e(p02, "p0");
            ((ActivityPluginBinding) this.receiver).addRequestPermissionsResultListener(p02);
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ C2037v invoke(PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener) {
            m29833a(requestPermissionsResultListener);
            return C2037v.f8089a;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        C9322n.m27781e(activityPluginBinding, "activityPluginBinding");
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.f24590b;
        C9322n.m27778b(flutterPluginBinding);
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        C9322n.m27780d(binaryMessenger, "getBinaryMessenger(...)");
        Activity activity = activityPluginBinding.getActivity();
        C9322n.m27780d(activity, "getActivity(...)");
        C9955d c9955d = new C9955d(binaryMessenger);
        C9976x c9976x = new C9976x();
        a aVar = new a(activityPluginBinding);
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding2 = this.f24590b;
        C9322n.m27778b(flutterPluginBinding2);
        TextureRegistry textureRegistry = flutterPluginBinding2.getTextureRegistry();
        C9322n.m27780d(textureRegistry, "getTextureRegistry(...)");
        this.f24591c = new C9973u(activity, c9955d, binaryMessenger, c9976x, aVar, textureRegistry);
        this.f24589a = activityPluginBinding;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        this.f24590b = binding;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        C9973u c9973u = this.f24591c;
        if (c9973u != null) {
            ActivityPluginBinding activityPluginBinding = this.f24589a;
            C9322n.m27778b(activityPluginBinding);
            c9973u.m29813e(activityPluginBinding);
        }
        this.f24591c = null;
        this.f24589a = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        this.f24590b = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        onAttachedToActivity(binding);
    }
}
