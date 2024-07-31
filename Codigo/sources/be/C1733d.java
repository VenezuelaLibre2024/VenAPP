package be;

import android.app.Application;
import p029bk.InterfaceC1806a;
import p043ce.InterfaceC1956a;
import p106fe.InterfaceC7337f;
import p254nd.InterfaceC9708d;
import p485zb.C12867g;
import p487zd.C12897d;
import p487zd.C12938l0;
import p487zd.C12947n;
import p487zd.C12966q3;
import p487zd.C12971r3;
import p487zd.C12987v2;

/* renamed from: be.d */
/* loaded from: classes.dex */
public class C1733d {

    /* renamed from: a */
    private final C12867g f7353a;

    /* renamed from: b */
    private final InterfaceC7337f f7354b;

    /* renamed from: c */
    private final InterfaceC1956a f7355c;

    public C1733d(C12867g c12867g, InterfaceC7337f interfaceC7337f, InterfaceC1956a interfaceC1956a) {
        this.f7353a = c12867g;
        this.f7354b = interfaceC7337f;
        this.f7355c = interfaceC1956a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C12897d m9368a(InterfaceC1806a<C12938l0> interfaceC1806a, Application application, C12987v2 c12987v2) {
        return new C12897d(interfaceC1806a, this.f7353a, application, this.f7355c, c12987v2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C12947n m9369b(C12966q3 c12966q3, InterfaceC9708d interfaceC9708d) {
        return new C12947n(this.f7353a, c12966q3, interfaceC9708d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C12867g m9370c() {
        return this.f7353a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InterfaceC7337f m9371d() {
        return this.f7354b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C12966q3 m9372e() {
        return new C12966q3(this.f7353a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C12971r3 m9373f(C12966q3 c12966q3) {
        return new C12971r3(c12966q3);
    }
}
