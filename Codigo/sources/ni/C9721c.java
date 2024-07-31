package ni;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import kotlin.jvm.internal.C9322n;
import p000.C1589b;
import p000.C6803d;
import p000.InterfaceC7376g;

/* renamed from: ni.c */
/* loaded from: classes3.dex */
public final class C9721c implements FlutterPlugin, InterfaceC7376g, ActivityAware {

    /* renamed from: a */
    private C9720b f23911a;

    @Override // p000.InterfaceC7376g
    /* renamed from: a */
    public void mo22252a(C6803d msg) {
        C9322n.m27781e(msg, "msg");
        C9720b c9720b = this.f23911a;
        C9322n.m27778b(c9720b);
        c9720b.m29152d(msg);
    }

    @Override // p000.InterfaceC7376g
    public C1589b isEnabled() {
        C9720b c9720b = this.f23911a;
        C9322n.m27778b(c9720b);
        return c9720b.m29150b();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        C9720b c9720b = this.f23911a;
        if (c9720b == null) {
            return;
        }
        c9720b.m29151c(binding.getActivity());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C9322n.m27781e(flutterPluginBinding, "flutterPluginBinding");
        InterfaceC7376g.a aVar = InterfaceC7376g.f16681g;
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        C9322n.m27780d(binaryMessenger, "getBinaryMessenger(...)");
        aVar.m22258d(binaryMessenger, this);
        this.f23911a = new C9720b();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        C9720b c9720b = this.f23911a;
        if (c9720b == null) {
            return;
        }
        c9720b.m29151c(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        InterfaceC7376g.a aVar = InterfaceC7376g.f16681g;
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        C9322n.m27780d(binaryMessenger, "getBinaryMessenger(...)");
        aVar.m22258d(binaryMessenger, null);
        this.f23911a = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        onAttachedToActivity(binding);
    }
}
