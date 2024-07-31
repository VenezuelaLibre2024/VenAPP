package dj;

import java.util.concurrent.Callable;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p186jj.InterfaceC9073a;
import p186jj.InterfaceC9074b;
import p186jj.InterfaceC9076d;
import p186jj.InterfaceC9077e;
import p186jj.InterfaceC9079g;
import p224lj.C9512a;
import p224lj.C9513b;
import p241mj.InterfaceC9592b;
import p241mj.InterfaceC9594d;
import p317qj.C10496b;
import p317qj.C10497c;
import p317qj.C10498d;
import p317qj.C10499e;
import p317qj.C10501g;
import p317qj.C10502h;
import p317qj.C10506l;
import p317qj.C10507m;
import p317qj.C10508n;
import p317qj.C10509o;
import p317qj.C10510p;
import p317qj.C10511q;
import p317qj.C10512r;
import p317qj.C10513s;
import p317qj.C10514t;
import p317qj.C10515u;
import p317qj.C10516v;
import p317qj.CallableC10503i;
import p471yj.C12727a;

/* renamed from: dj.j */
/* loaded from: classes3.dex */
public abstract class AbstractC6985j<T> implements InterfaceC6989n<T> {
    /* renamed from: A */
    public static <T1, T2, R> AbstractC6985j<R> m20250A(InterfaceC6989n<? extends T1> interfaceC6989n, InterfaceC6989n<? extends T2> interfaceC6989n2, InterfaceC9074b<? super T1, ? super T2, ? extends R> interfaceC9074b) {
        C9513b.m28324d(interfaceC6989n, "source1 is null");
        C9513b.m28324d(interfaceC6989n2, "source2 is null");
        return m20251B(C9512a.m28315g(interfaceC9074b), interfaceC6989n, interfaceC6989n2);
    }

    /* renamed from: B */
    public static <T, R> AbstractC6985j<R> m20251B(InterfaceC9077e<? super Object[], ? extends R> interfaceC9077e, InterfaceC6989n<? extends T>... interfaceC6989nArr) {
        C9513b.m28324d(interfaceC6989nArr, "sources is null");
        if (interfaceC6989nArr.length == 0) {
            return m20253g();
        }
        C9513b.m28324d(interfaceC9077e, "zipper is null");
        return C12727a.m41990l(new C10516v(interfaceC6989nArr, interfaceC9077e));
    }

    /* renamed from: b */
    public static <T> AbstractC6985j<T> m20252b(InterfaceC6988m<T> interfaceC6988m) {
        C9513b.m28324d(interfaceC6988m, "onSubscribe is null");
        return C12727a.m41990l(new C10497c(interfaceC6988m));
    }

    /* renamed from: g */
    public static <T> AbstractC6985j<T> m20253g() {
        return C12727a.m41990l(C10498d.f26095a);
    }

    /* renamed from: l */
    public static <T> AbstractC6985j<T> m20254l(Callable<? extends T> callable) {
        C9513b.m28324d(callable, "callable is null");
        return C12727a.m41990l(new CallableC10503i(callable));
    }

    /* renamed from: n */
    public static <T> AbstractC6985j<T> m20255n(T t10) {
        C9513b.m28324d(t10, "item is null");
        return C12727a.m41990l(new C10507m(t10));
    }

    @Override // dj.InterfaceC6989n
    /* renamed from: a */
    public final void mo20256a(InterfaceC6987l<? super T> interfaceC6987l) {
        C9513b.m28324d(interfaceC6987l, "observer is null");
        InterfaceC6987l<? super T> m41999u = C12727a.m41999u(this, interfaceC6987l);
        C9513b.m28324d(m41999u, "observer returned by the RxJavaPlugins hook is null");
        try {
            mo20271u(m41999u);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            C7744b.m23648b(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    /* renamed from: c */
    public final AbstractC6985j<T> m20257c(T t10) {
        C9513b.m28324d(t10, "item is null");
        return m20274x(m20255n(t10));
    }

    /* renamed from: e */
    public final AbstractC6985j<T> m20258e(InterfaceC9076d<? super Throwable> interfaceC9076d) {
        InterfaceC9076d m28310b = C9512a.m28310b();
        InterfaceC9076d m28310b2 = C9512a.m28310b();
        InterfaceC9076d interfaceC9076d2 = (InterfaceC9076d) C9513b.m28324d(interfaceC9076d, "onError is null");
        InterfaceC9073a interfaceC9073a = C9512a.f23115c;
        return C12727a.m41990l(new C10511q(this, m28310b, m28310b2, interfaceC9076d2, interfaceC9073a, interfaceC9073a, interfaceC9073a));
    }

    /* renamed from: f */
    public final AbstractC6985j<T> m20259f(InterfaceC9076d<? super T> interfaceC9076d) {
        InterfaceC9076d m28310b = C9512a.m28310b();
        InterfaceC9076d interfaceC9076d2 = (InterfaceC9076d) C9513b.m28324d(interfaceC9076d, "onSubscribe is null");
        InterfaceC9076d m28310b2 = C9512a.m28310b();
        InterfaceC9073a interfaceC9073a = C9512a.f23115c;
        return C12727a.m41990l(new C10511q(this, m28310b, interfaceC9076d2, m28310b2, interfaceC9073a, interfaceC9073a, interfaceC9073a));
    }

    /* renamed from: h */
    public final AbstractC6985j<T> m20260h(InterfaceC9079g<? super T> interfaceC9079g) {
        C9513b.m28324d(interfaceC9079g, "predicate is null");
        return C12727a.m41990l(new C10499e(this, interfaceC9079g));
    }

    /* renamed from: i */
    public final <R> AbstractC6985j<R> m20261i(InterfaceC9077e<? super T, ? extends InterfaceC6989n<? extends R>> interfaceC9077e) {
        C9513b.m28324d(interfaceC9077e, "mapper is null");
        return C12727a.m41990l(new C10502h(this, interfaceC9077e));
    }

    /* renamed from: j */
    public final AbstractC6977b m20262j(InterfaceC9077e<? super T, ? extends InterfaceC6979d> interfaceC9077e) {
        C9513b.m28324d(interfaceC9077e, "mapper is null");
        return C12727a.m41988j(new C10501g(this, interfaceC9077e));
    }

    /* renamed from: k */
    public final <R> AbstractC6990o<R> m20263k(InterfaceC9077e<? super T, ? extends InterfaceC6991p<? extends R>> interfaceC9077e) {
        return m20276z().m20289j(interfaceC9077e);
    }

    /* renamed from: m */
    public final AbstractC6994s<Boolean> m20264m() {
        return C12727a.m41992n(new C10506l(this));
    }

    /* renamed from: o */
    public final <R> AbstractC6985j<R> m20265o(InterfaceC9077e<? super T, ? extends R> interfaceC9077e) {
        C9513b.m28324d(interfaceC9077e, "mapper is null");
        return C12727a.m41990l(new C10508n(this, interfaceC9077e));
    }

    /* renamed from: p */
    public final AbstractC6985j<T> m20266p(AbstractC6993r abstractC6993r) {
        C9513b.m28324d(abstractC6993r, "scheduler is null");
        return C12727a.m41990l(new C10509o(this, abstractC6993r));
    }

    /* renamed from: q */
    public final AbstractC6985j<T> m20267q(InterfaceC6989n<? extends T> interfaceC6989n) {
        C9513b.m28324d(interfaceC6989n, "next is null");
        return m20268r(C9512a.m28313e(interfaceC6989n));
    }

    /* renamed from: r */
    public final AbstractC6985j<T> m20268r(InterfaceC9077e<? super Throwable, ? extends InterfaceC6989n<? extends T>> interfaceC9077e) {
        C9513b.m28324d(interfaceC9077e, "resumeFunction is null");
        return C12727a.m41990l(new C10510p(this, interfaceC9077e, true));
    }

    /* renamed from: s */
    public final InterfaceC7578b m20269s() {
        return m20270t(C9512a.m28310b(), C9512a.f23118f, C9512a.f23115c);
    }

    /* renamed from: t */
    public final InterfaceC7578b m20270t(InterfaceC9076d<? super T> interfaceC9076d, InterfaceC9076d<? super Throwable> interfaceC9076d2, InterfaceC9073a interfaceC9073a) {
        C9513b.m28324d(interfaceC9076d, "onSuccess is null");
        C9513b.m28324d(interfaceC9076d2, "onError is null");
        C9513b.m28324d(interfaceC9073a, "onComplete is null");
        return (InterfaceC7578b) m20273w(new C10496b(interfaceC9076d, interfaceC9076d2, interfaceC9073a));
    }

    /* renamed from: u */
    protected abstract void mo20271u(InterfaceC6987l<? super T> interfaceC6987l);

    /* renamed from: v */
    public final AbstractC6985j<T> m20272v(AbstractC6993r abstractC6993r) {
        C9513b.m28324d(abstractC6993r, "scheduler is null");
        return C12727a.m41990l(new C10512r(this, abstractC6993r));
    }

    /* renamed from: w */
    public final <E extends InterfaceC6987l<? super T>> E m20273w(E e10) {
        mo20256a(e10);
        return e10;
    }

    /* renamed from: x */
    public final AbstractC6985j<T> m20274x(InterfaceC6989n<? extends T> interfaceC6989n) {
        C9513b.m28324d(interfaceC6989n, "other is null");
        return C12727a.m41990l(new C10513s(this, interfaceC6989n));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public final AbstractC6981f<T> m20275y() {
        return this instanceof InterfaceC9592b ? ((InterfaceC9592b) this).mo28587d() : C12727a.m41989k(new C10514t(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public final AbstractC6990o<T> m20276z() {
        return this instanceof InterfaceC9594d ? ((InterfaceC9594d) this).mo28589b() : C12727a.m41991m(new C10515u(this));
    }
}
