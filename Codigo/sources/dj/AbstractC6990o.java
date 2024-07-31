package dj;

import com.google.android.gms.common.api.C5101a;
import p145hj.C7744b;
import p186jj.InterfaceC9077e;
import p186jj.InterfaceC9079g;
import p224lj.C9512a;
import p224lj.C9513b;
import p241mj.InterfaceCallableC9598h;
import p297pj.C10188n;
import p297pj.C10195u;
import p339rj.C10712c;
import p339rj.C10713d;
import p339rj.C10714e;
import p339rj.C10715f;
import p339rj.C10717h;
import p339rj.C10718i;
import p339rj.C10719j;
import p339rj.C10720k;
import p339rj.C10721l;
import p339rj.C10722m;
import p471yj.C12727a;

/* renamed from: dj.o */
/* loaded from: classes3.dex */
public abstract class AbstractC6990o<T> implements InterfaceC6991p<T> {

    /* renamed from: dj.o$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15558a;

        static {
            int[] iArr = new int[EnumC6976a.values().length];
            f15558a = iArr;
            try {
                iArr[EnumC6976a.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15558a[EnumC6976a.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15558a[EnumC6976a.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15558a[EnumC6976a.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: f */
    public static int m20281f() {
        return AbstractC6981f.m20213b();
    }

    /* renamed from: h */
    public static <T> AbstractC6990o<T> m20282h() {
        return C12727a.m41991m(C10713d.f27085a);
    }

    /* renamed from: p */
    public static <T> AbstractC6990o<T> m20283p(Iterable<? extends T> iterable) {
        C9513b.m28324d(iterable, "source is null");
        return C12727a.m41991m(new C10718i(iterable));
    }

    /* renamed from: q */
    public static <T> AbstractC6990o<T> m20284q(T t10) {
        C9513b.m28324d(t10, "The item is null");
        return C12727a.m41991m(new C10719j(t10));
    }

    @Override // dj.InterfaceC6991p
    /* renamed from: d */
    public final void mo20285d(InterfaceC6992q<? super T> interfaceC6992q) {
        C9513b.m28324d(interfaceC6992q, "observer is null");
        try {
            InterfaceC6992q<? super T> m42000v = C12727a.m42000v(this, interfaceC6992q);
            C9513b.m28324d(m42000v, "Plugin returned null Observer");
            mo608s(m42000v);
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

    /* renamed from: e */
    public final AbstractC6994s<Boolean> m20286e(InterfaceC9079g<? super T> interfaceC9079g) {
        C9513b.m28324d(interfaceC9079g, "predicate is null");
        return C12727a.m41992n(new C10712c(this, interfaceC9079g));
    }

    /* renamed from: g */
    public final AbstractC6994s<Boolean> m20287g(Object obj) {
        C9513b.m28324d(obj, "element is null");
        return m20286e(C9512a.m28311c(obj));
    }

    /* renamed from: i */
    public final AbstractC6990o<T> m20288i(InterfaceC9079g<? super T> interfaceC9079g) {
        C9513b.m28324d(interfaceC9079g, "predicate is null");
        return C12727a.m41991m(new C10714e(this, interfaceC9079g));
    }

    /* renamed from: j */
    public final <R> AbstractC6990o<R> m20289j(InterfaceC9077e<? super T, ? extends InterfaceC6991p<? extends R>> interfaceC9077e) {
        return m20290k(interfaceC9077e, false);
    }

    /* renamed from: k */
    public final <R> AbstractC6990o<R> m20290k(InterfaceC9077e<? super T, ? extends InterfaceC6991p<? extends R>> interfaceC9077e, boolean z10) {
        return m20291l(interfaceC9077e, z10, C5101a.e.API_PRIORITY_OTHER);
    }

    /* renamed from: l */
    public final <R> AbstractC6990o<R> m20291l(InterfaceC9077e<? super T, ? extends InterfaceC6991p<? extends R>> interfaceC9077e, boolean z10, int i10) {
        return m20292m(interfaceC9077e, z10, i10, m20281f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public final <R> AbstractC6990o<R> m20292m(InterfaceC9077e<? super T, ? extends InterfaceC6991p<? extends R>> interfaceC9077e, boolean z10, int i10, int i11) {
        C9513b.m28324d(interfaceC9077e, "mapper is null");
        C9513b.m28325e(i10, "maxConcurrency");
        C9513b.m28325e(i11, "bufferSize");
        if (!(this instanceof InterfaceCallableC9598h)) {
            return C12727a.m41991m(new C10715f(this, interfaceC9077e, z10, i10, i11));
        }
        Object call = ((InterfaceCallableC9598h) this).call();
        return call == null ? m20282h() : C10721l.m32607a(call, interfaceC9077e);
    }

    /* renamed from: n */
    public final AbstractC6977b m20293n(InterfaceC9077e<? super T, ? extends InterfaceC6979d> interfaceC9077e) {
        return m20294o(interfaceC9077e, false);
    }

    /* renamed from: o */
    public final AbstractC6977b m20294o(InterfaceC9077e<? super T, ? extends InterfaceC6979d> interfaceC9077e, boolean z10) {
        C9513b.m28324d(interfaceC9077e, "mapper is null");
        return C12727a.m41988j(new C10717h(this, interfaceC9077e, z10));
    }

    /* renamed from: r */
    public final <R> AbstractC6990o<R> m20295r(InterfaceC9077e<? super T, ? extends R> interfaceC9077e) {
        C9513b.m28324d(interfaceC9077e, "mapper is null");
        return C12727a.m41991m(new C10720k(this, interfaceC9077e));
    }

    /* renamed from: s */
    protected abstract void mo608s(InterfaceC6992q<? super T> interfaceC6992q);

    /* renamed from: t */
    public final AbstractC6990o<T> m20296t(InterfaceC6991p<? extends T> interfaceC6991p) {
        C9513b.m28324d(interfaceC6991p, "other is null");
        return C12727a.m41991m(new C10722m(this, interfaceC6991p));
    }

    /* renamed from: u */
    public final AbstractC6981f<T> m20297u(EnumC6976a enumC6976a) {
        C10188n c10188n = new C10188n(this);
        int i10 = a.f15558a[enumC6976a.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? c10188n.m20247y() : C12727a.m41989k(new C10195u(c10188n)) : c10188n : c10188n.m20222B() : c10188n.m20221A();
    }
}
