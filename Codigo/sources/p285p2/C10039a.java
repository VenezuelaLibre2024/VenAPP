package p285p2;

import android.content.Context;
import android.provider.Settings;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.C9322n;
import p315qh.C10492b;

/* renamed from: p2.a */
/* loaded from: classes.dex */
public final class C10039a implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: a */
    private Context f24678a;

    /* renamed from: b */
    private MethodChannel f24679b;

    /* renamed from: a */
    private final boolean m29960a() {
        Context context = this.f24678a;
        if (context == null) {
            C9322n.m27792p("context");
            context = null;
        }
        return Settings.Secure.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        this.f24679b = new MethodChannel(binding.getBinaryMessenger(), "flutter_jailbreak_detection");
        Context applicationContext = binding.getApplicationContext();
        C9322n.m27780d(applicationContext, "getApplicationContext(...)");
        this.f24678a = applicationContext;
        MethodChannel methodChannel = this.f24679b;
        if (methodChannel == null) {
            C9322n.m27792p("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        C9322n.m27781e(binding, "binding");
        MethodChannel methodChannel = this.f24679b;
        if (methodChannel == null) {
            C9322n.m27792p("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        C10492b c10492b;
        boolean m29960a;
        C9322n.m27781e(call, "call");
        C9322n.m27781e(result, "result");
        Context context = null;
        if (call.method.equals("jailbroken")) {
            Context context2 = this.f24678a;
            if (context2 == null) {
                C9322n.m27792p("context");
            } else {
                context = context2;
            }
            c10492b = new C10492b(context);
        } else if (call.method.equals("developerMode")) {
            m29960a = m29960a();
            result.success(Boolean.valueOf(m29960a));
        } else {
            if (!call.method.equals("rooted")) {
                result.notImplemented();
                return;
            }
            Context context3 = this.f24678a;
            if (context3 == null) {
                C9322n.m27792p("context");
            } else {
                context = context3;
            }
            c10492b = new C10492b(context);
        }
        m29960a = c10492b.m31560n();
        result.success(Boolean.valueOf(m29960a));
    }
}
