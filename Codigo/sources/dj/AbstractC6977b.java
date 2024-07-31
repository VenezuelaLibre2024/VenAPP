package dj;

import java.util.concurrent.Callable;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p186jj.InterfaceC9073a;
import p186jj.InterfaceC9076d;
import p186jj.InterfaceC9077e;
import p186jj.InterfaceC9079g;
import p224lj.C9512a;
import p224lj.C9513b;
import p241mj.InterfaceC9593c;
import p256nj.C9726e;
import p279oj.C9979a;
import p279oj.C9980b;
import p279oj.C9981c;
import p279oj.C9982d;
import p279oj.C9983e;
import p279oj.C9984f;
import p279oj.C9985g;
import p279oj.C9986h;
import p317qj.C10504j;
import p471yj.C12727a;

/* renamed from: dj.b */
/* loaded from: classes3.dex */
public abstract class AbstractC6977b implements InterfaceC6979d {
    /* renamed from: d */
    public static AbstractC6977b m20192d() {
        return C12727a.m41988j(C9980b.f24597a);
    }

    /* renamed from: e */
    public static AbstractC6977b m20193e(InterfaceC6979d... interfaceC6979dArr) {
        C9513b.m28324d(interfaceC6979dArr, "sources is null");
        return interfaceC6979dArr.length == 0 ? m20192d() : interfaceC6979dArr.length == 1 ? m20198s(interfaceC6979dArr[0]) : C12727a.m41988j(new C9979a(interfaceC6979dArr));
    }

    /* renamed from: i */
    private AbstractC6977b m20194i(InterfaceC9076d<? super InterfaceC7578b> interfaceC9076d, InterfaceC9076d<? super Throwable> interfaceC9076d2, InterfaceC9073a interfaceC9073a, InterfaceC9073a interfaceC9073a2, InterfaceC9073a interfaceC9073a3, InterfaceC9073a interfaceC9073a4) {
        C9513b.m28324d(interfaceC9076d, "onSubscribe is null");
        C9513b.m28324d(interfaceC9076d2, "onError is null");
        C9513b.m28324d(interfaceC9073a, "onComplete is null");
        C9513b.m28324d(interfaceC9073a2, "onTerminate is null");
        C9513b.m28324d(interfaceC9073a3, "onAfterTerminate is null");
        C9513b.m28324d(interfaceC9073a4, "onDispose is null");
        return C12727a.m41988j(new C9985g(this, interfaceC9076d, interfaceC9076d2, interfaceC9073a, interfaceC9073a2, interfaceC9073a3, interfaceC9073a4));
    }

    /* renamed from: j */
    public static AbstractC6977b m20195j(InterfaceC9073a interfaceC9073a) {
        C9513b.m28324d(interfaceC9073a, "run is null");
        return C12727a.m41988j(new C9981c(interfaceC9073a));
    }

    /* renamed from: k */
    public static AbstractC6977b m20196k(Callable<?> callable) {
        C9513b.m28324d(callable, "callable is null");
        return C12727a.m41988j(new C9982d(callable));
    }

    /* renamed from: r */
    private static NullPointerException m20197r(Throwable th2) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th2);
        return nullPointerException;
    }

    /* renamed from: s */
    public static AbstractC6977b m20198s(InterfaceC6979d interfaceC6979d) {
        C9513b.m28324d(interfaceC6979d, "source is null");
        return interfaceC6979d instanceof AbstractC6977b ? C12727a.m41988j((AbstractC6977b) interfaceC6979d) : C12727a.m41988j(new C9983e(interfaceC6979d));
    }

    @Override // dj.InterfaceC6979d
    /* renamed from: a */
    public final void mo20199a(InterfaceC6978c interfaceC6978c) {
        C9513b.m28324d(interfaceC6978c, "s is null");
        try {
            mo20208p(C12727a.m41998t(this, interfaceC6978c));
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            C7744b.m23648b(th2);
            C12727a.m41995q(th2);
            throw m20197r(th2);
        }
    }

    /* renamed from: c */
    public final AbstractC6977b m20200c(InterfaceC6979d interfaceC6979d) {
        return m20201f(interfaceC6979d);
    }

    /* renamed from: f */
    public final AbstractC6977b m20201f(InterfaceC6979d interfaceC6979d) {
        C9513b.m28324d(interfaceC6979d, "other is null");
        return m20193e(this, interfaceC6979d);
    }

    /* renamed from: g */
    public final AbstractC6977b m20202g(InterfaceC9073a interfaceC9073a) {
        InterfaceC9076d<? super InterfaceC7578b> m28310b = C9512a.m28310b();
        InterfaceC9076d<? super Throwable> m28310b2 = C9512a.m28310b();
        InterfaceC9073a interfaceC9073a2 = C9512a.f23115c;
        return m20194i(m28310b, m28310b2, interfaceC9073a, interfaceC9073a2, interfaceC9073a2, interfaceC9073a2);
    }

    /* renamed from: h */
    public final AbstractC6977b m20203h(InterfaceC9076d<? super Throwable> interfaceC9076d) {
        InterfaceC9076d<? super InterfaceC7578b> m28310b = C9512a.m28310b();
        InterfaceC9073a interfaceC9073a = C9512a.f23115c;
        return m20194i(m28310b, interfaceC9076d, interfaceC9073a, interfaceC9073a, interfaceC9073a, interfaceC9073a);
    }

    /* renamed from: l */
    public final AbstractC6977b m20204l() {
        return m20205m(C9512a.m28309a());
    }

    /* renamed from: m */
    public final AbstractC6977b m20205m(InterfaceC9079g<? super Throwable> interfaceC9079g) {
        C9513b.m28324d(interfaceC9079g, "predicate is null");
        return C12727a.m41988j(new C9984f(this, interfaceC9079g));
    }

    /* renamed from: n */
    public final AbstractC6977b m20206n(InterfaceC9077e<? super Throwable, ? extends InterfaceC6979d> interfaceC9077e) {
        C9513b.m28324d(interfaceC9077e, "errorMapper is null");
        return C12727a.m41988j(new C9986h(this, interfaceC9077e));
    }

    /* renamed from: o */
    public final InterfaceC7578b m20207o() {
        C9726e c9726e = new C9726e();
        mo20199a(c9726e);
        return c9726e;
    }

    /* renamed from: p */
    protected abstract void mo20208p(InterfaceC6978c interfaceC6978c);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public final <T> AbstractC6985j<T> m20209q() {
        return this instanceof InterfaceC9593c ? ((InterfaceC9593c) this).mo28588a() : C12727a.m41990l(new C10504j(this));
    }
}
