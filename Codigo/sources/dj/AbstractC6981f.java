package dj;

import com.google.android.gms.common.api.C5101a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import im.InterfaceC8014a;
import im.InterfaceC8015b;
import im.InterfaceC8016c;
import java.util.Comparator;
import java.util.List;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p165ij.AbstractC8003a;
import p186jj.InterfaceC9073a;
import p186jj.InterfaceC9076d;
import p186jj.InterfaceC9077e;
import p186jj.InterfaceC9079g;
import p224lj.C9512a;
import p224lj.C9513b;
import p241mj.InterfaceCallableC9598h;
import p297pj.C10176b;
import p297pj.C10177c;
import p297pj.C10178d;
import p297pj.C10180f;
import p297pj.C10181g;
import p297pj.C10182h;
import p297pj.C10183i;
import p297pj.C10184j;
import p297pj.C10185k;
import p297pj.C10186l;
import p297pj.C10187m;
import p297pj.C10190p;
import p297pj.C10191q;
import p297pj.C10192r;
import p297pj.C10193s;
import p297pj.C10194t;
import p297pj.C10196v;
import p297pj.C10197w;
import p297pj.C10198x;
import p297pj.C10200z;
import p297pj.EnumC10189o;
import p404vj.C11962c;
import p404vj.C11963d;
import p449xj.EnumC12503f;
import p471yj.C12727a;

/* renamed from: dj.f */
/* loaded from: classes3.dex */
public abstract class AbstractC6981f<T> implements InterfaceC8014a<T> {

    /* renamed from: a */
    static final int f15557a = Math.max(1, Integer.getInteger("rx2.buffer-size", RecognitionOptions.ITF).intValue());

    /* renamed from: b */
    public static int m20213b() {
        return f15557a;
    }

    /* renamed from: e */
    public static <T> AbstractC6981f<T> m20214e(InterfaceC6983h<T> interfaceC6983h, EnumC6976a enumC6976a) {
        C9513b.m28324d(interfaceC6983h, "source is null");
        C9513b.m28324d(enumC6976a, "mode is null");
        return C12727a.m41989k(new C10177c(interfaceC6983h, enumC6976a));
    }

    /* renamed from: f */
    private AbstractC6981f<T> m20215f(InterfaceC9076d<? super T> interfaceC9076d, InterfaceC9076d<? super Throwable> interfaceC9076d2, InterfaceC9073a interfaceC9073a, InterfaceC9073a interfaceC9073a2) {
        C9513b.m28324d(interfaceC9076d, "onNext is null");
        C9513b.m28324d(interfaceC9076d2, "onError is null");
        C9513b.m28324d(interfaceC9073a, "onComplete is null");
        C9513b.m28324d(interfaceC9073a2, "onAfterTerminate is null");
        return C12727a.m41989k(new C10178d(this, interfaceC9076d, interfaceC9076d2, interfaceC9073a, interfaceC9073a2));
    }

    /* renamed from: i */
    public static <T> AbstractC6981f<T> m20216i() {
        return C12727a.m41989k(C10181g.f25056b);
    }

    /* renamed from: r */
    public static <T> AbstractC6981f<T> m20217r(T... tArr) {
        C9513b.m28324d(tArr, "items is null");
        return tArr.length == 0 ? m20216i() : tArr.length == 1 ? m20219t(tArr[0]) : C12727a.m41989k(new C10186l(tArr));
    }

    /* renamed from: s */
    public static <T> AbstractC6981f<T> m20218s(Iterable<? extends T> iterable) {
        C9513b.m28324d(iterable, "source is null");
        return C12727a.m41989k(new C10187m(iterable));
    }

    /* renamed from: t */
    public static <T> AbstractC6981f<T> m20219t(T t10) {
        C9513b.m28324d(t10, "item is null");
        return C12727a.m41989k(new C10190p(t10));
    }

    /* renamed from: v */
    public static <T> AbstractC6981f<T> m20220v(InterfaceC8014a<? extends T> interfaceC8014a, InterfaceC8014a<? extends T> interfaceC8014a2, InterfaceC8014a<? extends T> interfaceC8014a3) {
        C9513b.m28324d(interfaceC8014a, "source1 is null");
        C9513b.m28324d(interfaceC8014a2, "source2 is null");
        C9513b.m28324d(interfaceC8014a3, "source3 is null");
        return m20217r(interfaceC8014a, interfaceC8014a2, interfaceC8014a3).m20238l(C9512a.m28312d(), false, 3);
    }

    /* renamed from: A */
    public final AbstractC6981f<T> m20221A() {
        return C12727a.m41989k(new C10194t(this));
    }

    /* renamed from: B */
    public final AbstractC6981f<T> m20222B() {
        return C12727a.m41989k(new C10196v(this));
    }

    /* renamed from: C */
    public final AbstractC8003a<T> m20223C() {
        return m20224D(m20213b());
    }

    /* renamed from: D */
    public final AbstractC8003a<T> m20224D(int i10) {
        C9513b.m28325e(i10, "bufferSize");
        return C10197w.m30511M(this, i10);
    }

    /* renamed from: E */
    public final AbstractC6981f<T> m20225E(Comparator<? super T> comparator) {
        C9513b.m28324d(comparator, "sortFunction");
        return m20230J().m20312l().m20244u(C9512a.m28314f(comparator)).m20240n(C9512a.m28312d());
    }

    /* renamed from: F */
    public final InterfaceC7578b m20226F(InterfaceC9076d<? super T> interfaceC9076d) {
        return m20227G(interfaceC9076d, C9512a.f23118f, C9512a.f23115c, EnumC10189o.INSTANCE);
    }

    /* renamed from: G */
    public final InterfaceC7578b m20227G(InterfaceC9076d<? super T> interfaceC9076d, InterfaceC9076d<? super Throwable> interfaceC9076d2, InterfaceC9073a interfaceC9073a, InterfaceC9076d<? super InterfaceC8016c> interfaceC9076d3) {
        C9513b.m28324d(interfaceC9076d, "onNext is null");
        C9513b.m28324d(interfaceC9076d2, "onError is null");
        C9513b.m28324d(interfaceC9073a, "onComplete is null");
        C9513b.m28324d(interfaceC9076d3, "onSubscribe is null");
        C11962c c11962c = new C11962c(interfaceC9076d, interfaceC9076d2, interfaceC9073a, interfaceC9076d3);
        m20228H(c11962c);
        return c11962c;
    }

    /* renamed from: H */
    public final void m20228H(InterfaceC6984i<? super T> interfaceC6984i) {
        C9513b.m28324d(interfaceC6984i, "s is null");
        try {
            InterfaceC8015b<? super T> m42002x = C12727a.m42002x(this, interfaceC6984i);
            C9513b.m28324d(m42002x, "Plugin returned null Subscriber");
            mo20229I(m42002x);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            C7744b.m23648b(th2);
            C12727a.m41995q(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    /* renamed from: I */
    protected abstract void mo20229I(InterfaceC8015b<? super T> interfaceC8015b);

    /* renamed from: J */
    public final AbstractC6994s<List<T>> m20230J() {
        return C12727a.m41992n(new C10200z(this));
    }

    @Override // im.InterfaceC8014a
    /* renamed from: a */
    public final void mo20231a(InterfaceC8015b<? super T> interfaceC8015b) {
        if (interfaceC8015b instanceof InterfaceC6984i) {
            m20228H((InterfaceC6984i) interfaceC8015b);
        } else {
            C9513b.m28324d(interfaceC8015b, "s is null");
            m20228H(new C11963d(interfaceC8015b));
        }
    }

    /* renamed from: c */
    public final <R> AbstractC6981f<R> m20232c(InterfaceC9077e<? super T, ? extends InterfaceC8014a<? extends R>> interfaceC9077e) {
        return m20233d(interfaceC9077e, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final <R> AbstractC6981f<R> m20233d(InterfaceC9077e<? super T, ? extends InterfaceC8014a<? extends R>> interfaceC9077e, int i10) {
        C9513b.m28324d(interfaceC9077e, "mapper is null");
        C9513b.m28325e(i10, "prefetch");
        if (!(this instanceof InterfaceCallableC9598h)) {
            return C12727a.m41989k(new C10176b(this, interfaceC9077e, i10, EnumC12503f.IMMEDIATE));
        }
        Object call = ((InterfaceCallableC9598h) this).call();
        return call == null ? m20216i() : C10198x.m30516a(call, interfaceC9077e);
    }

    /* renamed from: g */
    public final AbstractC6981f<T> m20234g(InterfaceC9076d<? super T> interfaceC9076d) {
        InterfaceC9076d<? super Throwable> m28310b = C9512a.m28310b();
        InterfaceC9073a interfaceC9073a = C9512a.f23115c;
        return m20215f(interfaceC9076d, m28310b, interfaceC9073a, interfaceC9073a);
    }

    /* renamed from: h */
    public final AbstractC6985j<T> m20235h(long j10) {
        if (j10 >= 0) {
            return C12727a.m41990l(new C10180f(this, j10));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    /* renamed from: j */
    public final AbstractC6981f<T> m20236j(InterfaceC9079g<? super T> interfaceC9079g) {
        C9513b.m28324d(interfaceC9079g, "predicate is null");
        return C12727a.m41989k(new C10182h(this, interfaceC9079g));
    }

    /* renamed from: k */
    public final AbstractC6985j<T> m20237k() {
        return m20235h(0L);
    }

    /* renamed from: l */
    public final <R> AbstractC6981f<R> m20238l(InterfaceC9077e<? super T, ? extends InterfaceC8014a<? extends R>> interfaceC9077e, boolean z10, int i10) {
        return m20239m(interfaceC9077e, z10, i10, m20213b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public final <R> AbstractC6981f<R> m20239m(InterfaceC9077e<? super T, ? extends InterfaceC8014a<? extends R>> interfaceC9077e, boolean z10, int i10, int i11) {
        C9513b.m28324d(interfaceC9077e, "mapper is null");
        C9513b.m28325e(i10, "maxConcurrency");
        C9513b.m28325e(i11, "bufferSize");
        if (!(this instanceof InterfaceCallableC9598h)) {
            return C12727a.m41989k(new C10183i(this, interfaceC9077e, z10, i10, i11));
        }
        Object call = ((InterfaceCallableC9598h) this).call();
        return call == null ? m20216i() : C10198x.m30516a(call, interfaceC9077e);
    }

    /* renamed from: n */
    public final <U> AbstractC6981f<U> m20240n(InterfaceC9077e<? super T, ? extends Iterable<? extends U>> interfaceC9077e) {
        return m20241o(interfaceC9077e, m20213b());
    }

    /* renamed from: o */
    public final <U> AbstractC6981f<U> m20241o(InterfaceC9077e<? super T, ? extends Iterable<? extends U>> interfaceC9077e, int i10) {
        C9513b.m28324d(interfaceC9077e, "mapper is null");
        C9513b.m28325e(i10, "bufferSize");
        return C12727a.m41989k(new C10185k(this, interfaceC9077e, i10));
    }

    /* renamed from: p */
    public final <R> AbstractC6981f<R> m20242p(InterfaceC9077e<? super T, ? extends InterfaceC6989n<? extends R>> interfaceC9077e) {
        return m20243q(interfaceC9077e, false, C5101a.e.API_PRIORITY_OTHER);
    }

    /* renamed from: q */
    public final <R> AbstractC6981f<R> m20243q(InterfaceC9077e<? super T, ? extends InterfaceC6989n<? extends R>> interfaceC9077e, boolean z10, int i10) {
        C9513b.m28324d(interfaceC9077e, "mapper is null");
        C9513b.m28325e(i10, "maxConcurrency");
        return C12727a.m41989k(new C10184j(this, interfaceC9077e, z10, i10));
    }

    /* renamed from: u */
    public final <R> AbstractC6981f<R> m20244u(InterfaceC9077e<? super T, ? extends R> interfaceC9077e) {
        C9513b.m28324d(interfaceC9077e, "mapper is null");
        return C12727a.m41989k(new C10191q(this, interfaceC9077e));
    }

    /* renamed from: w */
    public final AbstractC6981f<T> m20245w(AbstractC6993r abstractC6993r) {
        return m20246x(abstractC6993r, false, m20213b());
    }

    /* renamed from: x */
    public final AbstractC6981f<T> m20246x(AbstractC6993r abstractC6993r, boolean z10, int i10) {
        C9513b.m28324d(abstractC6993r, "scheduler is null");
        C9513b.m28325e(i10, "bufferSize");
        return C12727a.m41989k(new C10192r(this, abstractC6993r, z10, i10));
    }

    /* renamed from: y */
    public final AbstractC6981f<T> m20247y() {
        return m20248z(m20213b(), false, true);
    }

    /* renamed from: z */
    public final AbstractC6981f<T> m20248z(int i10, boolean z10, boolean z11) {
        C9513b.m28325e(i10, "bufferSize");
        return C12727a.m41989k(new C10193s(this, i10, z11, z10, C9512a.f23115c));
    }
}
