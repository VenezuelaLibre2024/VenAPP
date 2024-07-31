package p164ii;

import android.content.ContentResolver;
import android.provider.Settings;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.C9322n;

/* renamed from: ii.a */
/* loaded from: classes3.dex */
public final class C8002a implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: a */
    private MethodChannel f19475a;

    /* renamed from: b */
    private ContentResolver f19476b;

    /* renamed from: a */
    private final String m24579a() {
        ContentResolver contentResolver = this.f19476b;
        if (contentResolver == null) {
            C9322n.m27792p("contentResolver");
            contentResolver = null;
        }
        return Settings.Secure.getString(contentResolver, "android_id");
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C9322n.m27781e(flutterPluginBinding, "flutterPluginBinding");
        ContentResolver contentResolver = flutterPluginBinding.getApplicationContext().getContentResolver();
        C9322n.m27780d(contentResolver, "getContentResolver(...)");
        this.f19476b = contentResolver;
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "android_id");
        this.f19475a = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        MethodChannel methodChannel = this.f19475a;
        if (methodChannel == null) {
            C9322n.m27792p("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        C9322n.m27781e(call, "call");
        C9322n.m27781e(result, "result");
        if (C9322n.m27777a(call.method, "getId")) {
            result.success(m24579a());
        } else {
            result.notImplemented();
        }
    }
}
