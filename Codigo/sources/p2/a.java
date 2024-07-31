package p2;

import android.content.Context;
import android.provider.Settings;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.n;
import qh.b;

/* loaded from: classes.dex */
public final class a implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    private Context f22745a;

    /* renamed from: b, reason: collision with root package name */
    private MethodChannel f22746b;

    private final boolean a() {
        Context context = this.f22745a;
        if (context == null) {
            n.p("context");
            context = null;
        }
        return Settings.Secure.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        this.f22746b = new MethodChannel(binding.getBinaryMessenger(), "flutter_jailbreak_detection");
        Context applicationContext = binding.getApplicationContext();
        n.d(applicationContext, "getApplicationContext(...)");
        this.f22745a = applicationContext;
        MethodChannel methodChannel = this.f22746b;
        if (methodChannel == null) {
            n.p("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        n.e(binding, "binding");
        MethodChannel methodChannel = this.f22746b;
        if (methodChannel == null) {
            n.p("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        b bVar;
        boolean a10;
        n.e(call, "call");
        n.e(result, "result");
        Context context = null;
        if (call.method.equals("jailbroken")) {
            Context context2 = this.f22745a;
            if (context2 == null) {
                n.p("context");
            } else {
                context = context2;
            }
            bVar = new b(context);
        } else if (call.method.equals("developerMode")) {
            a10 = a();
            result.success(Boolean.valueOf(a10));
        } else {
            if (!call.method.equals("rooted")) {
                result.notImplemented();
                return;
            }
            Context context3 = this.f22745a;
            if (context3 == null) {
                n.p("context");
            } else {
                context = context3;
            }
            bVar = new b(context);
        }
        a10 = bVar.n();
        result.success(Boolean.valueOf(a10));
    }
}
