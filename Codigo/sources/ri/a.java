package ri;

import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kl.c;

/* loaded from: classes3.dex */
public class a implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: a, reason: collision with root package name */
    private Context f24955a;

    /* renamed from: b, reason: collision with root package name */
    private MethodChannel f24956b;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "g123k/flutter_app_badger");
        this.f24956b = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f24955a = flutterPluginBinding.getApplicationContext();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f24956b.setMethodCallHandler(null);
        this.f24955a = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals("updateBadgeCount")) {
            c.a(this.f24955a, Integer.valueOf(methodCall.argument("count").toString()).intValue());
        } else {
            if (!methodCall.method.equals("removeBadge")) {
                if (methodCall.method.equals("isAppBadgeSupported")) {
                    result.success(Boolean.valueOf(c.d(this.f24955a)));
                    return;
                } else {
                    result.notImplemented();
                    return;
                }
            }
            c.e(this.f24955a);
        }
        result.success(null);
    }
}
