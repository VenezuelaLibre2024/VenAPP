package p494zk;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import p124gk.InterfaceC7587f;
import p427wk.InterfaceC12228d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zk.b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C13040b2 {
    /* renamed from: a */
    public static final InterfaceC13131y m43052a(InterfaceC13125w1 interfaceC13125w1) {
        return new C13137z1(interfaceC13125w1);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC13131y m43053b(InterfaceC13125w1 interfaceC13125w1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC13125w1 = null;
        }
        return C13035a2.m43042a(interfaceC13125w1);
    }

    /* renamed from: c */
    public static final void m43054c(InterfaceC7587f interfaceC7587f, CancellationException cancellationException) {
        InterfaceC13125w1 interfaceC13125w1 = (InterfaceC13125w1) interfaceC7587f.mo20647b(InterfaceC13125w1.f35491q);
        if (interfaceC13125w1 != null) {
            interfaceC13125w1.mo43108O(cancellationException);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m43055d(InterfaceC7587f interfaceC7587f, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        C13035a2.m43044c(interfaceC7587f, cancellationException);
    }

    /* renamed from: e */
    public static final void m43056e(InterfaceC7587f interfaceC7587f, CancellationException cancellationException) {
        InterfaceC12228d<InterfaceC13125w1> mo43118i;
        InterfaceC13125w1 interfaceC13125w1 = (InterfaceC13125w1) interfaceC7587f.mo20647b(InterfaceC13125w1.f35491q);
        if (interfaceC13125w1 == null || (mo43118i = interfaceC13125w1.mo43118i()) == null) {
            return;
        }
        Iterator<InterfaceC13125w1> it = mo43118i.iterator();
        while (it.hasNext()) {
            it.next().mo43108O(cancellationException);
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m43057f(InterfaceC7587f interfaceC7587f, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        C13035a2.m43046e(interfaceC7587f, cancellationException);
    }

    /* renamed from: g */
    public static final InterfaceC13044c1 m43058g(InterfaceC13125w1 interfaceC13125w1, InterfaceC13044c1 interfaceC13044c1) {
        return interfaceC13125w1.mo43109R(new C13053e1(interfaceC13044c1));
    }

    /* renamed from: h */
    public static final void m43059h(InterfaceC7587f interfaceC7587f) {
        InterfaceC13125w1 interfaceC13125w1 = (InterfaceC13125w1) interfaceC7587f.mo20647b(InterfaceC13125w1.f35491q);
        if (interfaceC13125w1 != null) {
            C13035a2.m43050i(interfaceC13125w1);
        }
    }

    /* renamed from: i */
    public static final void m43060i(InterfaceC13125w1 interfaceC13125w1) {
        if (!interfaceC13125w1.mo43033a()) {
            throw interfaceC13125w1.mo43123n();
        }
    }

    /* renamed from: j */
    public static final InterfaceC13125w1 m43061j(InterfaceC7587f interfaceC7587f) {
        InterfaceC13125w1 interfaceC13125w1 = (InterfaceC13125w1) interfaceC7587f.mo20647b(InterfaceC13125w1.f35491q);
        if (interfaceC13125w1 != null) {
            return interfaceC13125w1;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC7587f).toString());
    }
}
