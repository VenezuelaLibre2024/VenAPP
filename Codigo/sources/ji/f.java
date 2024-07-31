package ji;

import android.content.Context;
import android.net.ConnectivityManager;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes3.dex */
public class f implements FlutterPlugin {

    /* renamed from: a, reason: collision with root package name */
    private MethodChannel f19982a;

    /* renamed from: b, reason: collision with root package name */
    private EventChannel f19983b;

    /* renamed from: c, reason: collision with root package name */
    private d f19984c;

    private void a(BinaryMessenger binaryMessenger, Context context) {
        this.f19982a = new MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/connectivity");
        this.f19983b = new EventChannel(binaryMessenger, "dev.fluttercommunity.plus/connectivity_status");
        a aVar = new a((ConnectivityManager) context.getSystemService("connectivity"));
        e eVar = new e(aVar);
        this.f19984c = new d(context, aVar);
        this.f19982a.setMethodCallHandler(eVar);
        this.f19983b.setStreamHandler(this.f19984c);
    }

    private void b() {
        this.f19982a.setMethodCallHandler(null);
        this.f19983b.setStreamHandler(null);
        this.f19984c.onCancel(null);
        this.f19982a = null;
        this.f19983b = null;
        this.f19984c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        a(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        b();
    }
}
