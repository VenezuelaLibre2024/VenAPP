package ni;

import defpackage.d;
import defpackage.g;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class c implements FlutterPlugin, g, ActivityAware {

    /* renamed from: a, reason: collision with root package name */
    private b f21978a;

    @Override // defpackage.g
    public void a(d msg) {
        n.e(msg, "msg");
        b bVar = this.f21978a;
        n.b(bVar);
        bVar.d(msg);
    }

    @Override // defpackage.g
    public defpackage.b isEnabled() {
        b bVar = this.f21978a;
        n.b(bVar);
        return bVar.b();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        n.e(binding, "binding");
        b bVar = this.f21978a;
        if (bVar == null) {
            return;
        }
        bVar.c(binding.getActivity());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        n.e(flutterPluginBinding, "flutterPluginBinding");
        g.a aVar = g.f15258g;
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        n.d(binaryMessenger, "getBinaryMessenger(...)");
        aVar.d(binaryMessenger, this);
        this.f21978a = new b();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        b bVar = this.f21978a;
        if (bVar == null) {
            return;
        }
        bVar.c(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        g.a aVar = g.f15258g;
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        n.d(binaryMessenger, "getBinaryMessenger(...)");
        aVar.d(binaryMessenger, null);
        this.f21978a = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        n.e(binding, "binding");
        onAttachedToActivity(binding);
    }
}
