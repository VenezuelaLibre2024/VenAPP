package p338ri;

import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import p207kl.C9291c;

/* renamed from: ri.a */
/* loaded from: classes3.dex */
public class C10709a implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: a */
    private Context f27071a;

    /* renamed from: b */
    private MethodChannel f27072b;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "g123k/flutter_app_badger");
        this.f27072b = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f27071a = flutterPluginBinding.getApplicationContext();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f27072b.setMethodCallHandler(null);
        this.f27071a = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals("updateBadgeCount")) {
            C9291c.m27713a(this.f27071a, Integer.valueOf(methodCall.argument("count").toString()).intValue());
        } else {
            if (!methodCall.method.equals("removeBadge")) {
                if (methodCall.method.equals("isAppBadgeSupported")) {
                    result.success(Boolean.valueOf(C9291c.m27716d(this.f27071a)));
                    return;
                } else {
                    result.notImplemented();
                    return;
                }
            }
            C9291c.m27717e(this.f27071a);
        }
        result.success(null);
    }
}
