package p185ji;

import android.content.Context;
import android.net.ConnectivityManager;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;

/* renamed from: ji.f */
/* loaded from: classes3.dex */
public class C9072f implements FlutterPlugin {

    /* renamed from: a */
    private MethodChannel f21761a;

    /* renamed from: b */
    private EventChannel f21762b;

    /* renamed from: c */
    private C9070d f21763c;

    /* renamed from: a */
    private void m26681a(BinaryMessenger binaryMessenger, Context context) {
        this.f21761a = new MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/connectivity");
        this.f21762b = new EventChannel(binaryMessenger, "dev.fluttercommunity.plus/connectivity_status");
        C9067a c9067a = new C9067a((ConnectivityManager) context.getSystemService("connectivity"));
        C9071e c9071e = new C9071e(c9067a);
        this.f21763c = new C9070d(context, c9067a);
        this.f21761a.setMethodCallHandler(c9071e);
        this.f21762b.setStreamHandler(this.f21763c);
    }

    /* renamed from: b */
    private void m26682b() {
        this.f21761a.setMethodCallHandler(null);
        this.f21762b.setStreamHandler(null);
        this.f21763c.onCancel(null);
        this.f21761a = null;
        this.f21762b = null;
        this.f21763c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m26681a(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m26682b();
    }
}
