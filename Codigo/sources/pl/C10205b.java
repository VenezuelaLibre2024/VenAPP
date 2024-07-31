package pl;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformViewRegistry;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: pl.b */
/* loaded from: classes3.dex */
public final class C10205b implements FlutterPlugin, ActivityAware {

    /* renamed from: a */
    public static final a f25218a = new a(null);

    /* renamed from: pl.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        C9322n.m27781e(activityPluginBinding, "activityPluginBinding");
        C10209f c10209f = C10209f.f25237a;
        c10209f.m30551c(activityPluginBinding.getActivity());
        c10209f.m30552d(activityPluginBinding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C9322n.m27781e(flutterPluginBinding, "flutterPluginBinding");
        PlatformViewRegistry platformViewRegistry = flutterPluginBinding.getPlatformViewRegistry();
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        C9322n.m27780d(binaryMessenger, "getBinaryMessenger(...)");
        platformViewRegistry.registerViewFactory("net.touchcapture.qr.flutterqr/qrview", new C10207d(binaryMessenger));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        C10209f c10209f = C10209f.f25237a;
        c10209f.m30551c(null);
        c10209f.m30552d(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        C10209f c10209f = C10209f.f25237a;
        c10209f.m30551c(null);
        c10209f.m30552d(null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        C9322n.m27781e(activityPluginBinding, "activityPluginBinding");
        C10209f c10209f = C10209f.f25237a;
        c10209f.m30551c(activityPluginBinding.getActivity());
        c10209f.m30552d(activityPluginBinding);
    }
}
