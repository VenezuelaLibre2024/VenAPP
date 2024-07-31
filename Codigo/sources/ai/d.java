package ai;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes3.dex */
public class d extends ai.a {

    /* renamed from: a, reason: collision with root package name */
    public final a f449a;

    /* renamed from: b, reason: collision with root package name */
    final MethodCall f450b;

    /* loaded from: classes3.dex */
    class a implements f {

        /* renamed from: a, reason: collision with root package name */
        final MethodChannel.Result f451a;

        a(MethodChannel.Result result) {
            this.f451a = result;
        }

        @Override // ai.f
        public void error(String str, String str2, Object obj) {
            this.f451a.error(str, str2, obj);
        }

        @Override // ai.f
        public void success(Object obj) {
            this.f451a.success(obj);
        }
    }

    public d(MethodCall methodCall, MethodChannel.Result result) {
        this.f450b = methodCall;
        this.f449a = new a(result);
    }

    @Override // ai.e
    public <T> T a(String str) {
        return (T) this.f450b.argument(str);
    }

    @Override // ai.e
    public boolean c(String str) {
        return this.f450b.hasArgument(str);
    }

    @Override // ai.e
    public String getMethod() {
        return this.f450b.method;
    }

    @Override // ai.a
    public f l() {
        return this.f449a;
    }
}
