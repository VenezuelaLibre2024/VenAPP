package ai;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* renamed from: ai.d */
/* loaded from: classes3.dex */
public class C0120d extends AbstractC0117a {

    /* renamed from: a */
    public final a f514a;

    /* renamed from: b */
    final MethodCall f515b;

    /* renamed from: ai.d$a */
    /* loaded from: classes3.dex */
    class a implements InterfaceC0122f {

        /* renamed from: a */
        final MethodChannel.Result f516a;

        a(MethodChannel.Result result) {
            this.f516a = result;
        }

        @Override // ai.InterfaceC0122f
        public void error(String str, String str2, Object obj) {
            this.f516a.error(str, str2, obj);
        }

        @Override // ai.InterfaceC0122f
        public void success(Object obj) {
            this.f516a.success(obj);
        }
    }

    public C0120d(MethodCall methodCall, MethodChannel.Result result) {
        this.f515b = methodCall;
        this.f514a = new a(result);
    }

    @Override // ai.InterfaceC0121e
    /* renamed from: a */
    public <T> T mo565a(String str) {
        return (T) this.f515b.argument(str);
    }

    @Override // ai.InterfaceC0121e
    /* renamed from: c */
    public boolean mo566c(String str) {
        return this.f515b.hasArgument(str);
    }

    @Override // ai.InterfaceC0121e
    public String getMethod() {
        return this.f515b.method;
    }

    @Override // ai.AbstractC0117a
    /* renamed from: l */
    public InterfaceC0122f mo555l() {
        return this.f514a;
    }
}
