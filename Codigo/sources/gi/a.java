package gi;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;

/* loaded from: classes3.dex */
public class a implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    private c f16270a;

    public a(c cVar) {
        this.f16270a = cVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (!"share".equals(methodCall.method)) {
            result.notImplemented();
        } else {
            if (!(methodCall.arguments instanceof Map)) {
                throw new IllegalArgumentException("Map argument expected");
            }
            this.f16270a.d(methodCall);
            result.success(null);
        }
    }
}
