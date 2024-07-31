package ji;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes3.dex */
class e implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    private final a f19981a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(a aVar) {
        this.f19981a = aVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if ("check".equals(methodCall.method)) {
            result.success(this.f19981a.b());
        } else {
            result.notImplemented();
        }
    }
}
