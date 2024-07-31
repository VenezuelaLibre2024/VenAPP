package ii;

import android.content.ContentResolver;
import android.provider.Settings;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class a implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    private MethodChannel f17812a;

    /* renamed from: b, reason: collision with root package name */
    private ContentResolver f17813b;

    private final String a() {
        ContentResolver contentResolver = this.f17813b;
        if (contentResolver == null) {
            n.p("contentResolver");
            contentResolver = null;
        }
        return Settings.Secure.getString(contentResolver, "android_id");
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        n.e(flutterPluginBinding, "flutterPluginBinding");
        ContentResolver contentResolver = flutterPluginBinding.getApplicationContext().getContentResolver();
        n.d(contentResolver, "getContentResolver(...)");
        this.f17813b = contentResolver;
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "android_id");
        this.f17812a = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        MethodChannel methodChannel = this.f17812a;
        if (methodChannel == null) {
            n.p("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        n.e(call, "call");
        n.e(result, "result");
        if (n.a(call.method, "getId")) {
            result.success(a());
        } else {
            result.notImplemented();
        }
    }
}
