package pl;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformViewRegistry;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class b implements FlutterPlugin, ActivityAware {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23279a = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        n.e(activityPluginBinding, "activityPluginBinding");
        f fVar = f.f23298a;
        fVar.c(activityPluginBinding.getActivity());
        fVar.d(activityPluginBinding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        n.e(flutterPluginBinding, "flutterPluginBinding");
        PlatformViewRegistry platformViewRegistry = flutterPluginBinding.getPlatformViewRegistry();
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        n.d(binaryMessenger, "getBinaryMessenger(...)");
        platformViewRegistry.registerViewFactory("net.touchcapture.qr.flutterqr/qrview", new d(binaryMessenger));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        f fVar = f.f23298a;
        fVar.c(null);
        fVar.d(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        f fVar = f.f23298a;
        fVar.c(null);
        fVar.d(null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        n.e(activityPluginBinding, "activityPluginBinding");
        f fVar = f.f23298a;
        fVar.c(activityPluginBinding.getActivity());
        fVar.d(activityPluginBinding);
    }
}
