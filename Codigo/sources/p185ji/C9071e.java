package p185ji;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* renamed from: ji.e */
/* loaded from: classes3.dex */
class C9071e implements MethodChannel.MethodCallHandler {

    /* renamed from: a */
    private final C9067a f21760a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9071e(C9067a c9067a) {
        this.f21760a = c9067a;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if ("check".equals(methodCall.method)) {
            result.success(this.f21760a.m26672b());
        } else {
            result.notImplemented();
        }
    }
}
