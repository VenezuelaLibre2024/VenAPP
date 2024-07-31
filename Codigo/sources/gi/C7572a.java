package gi;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;

/* renamed from: gi.a */
/* loaded from: classes3.dex */
public class C7572a implements MethodChannel.MethodCallHandler {

    /* renamed from: a */
    private C7574c f17907a;

    public C7572a(C7574c c7574c) {
        this.f17907a = c7574c;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (!"share".equals(methodCall.method)) {
            result.notImplemented();
        } else {
            if (!(methodCall.arguments instanceof Map)) {
                throw new IllegalArgumentException("Map argument expected");
            }
            this.f17907a.m23012d(methodCall);
            result.success(null);
        }
    }
}
