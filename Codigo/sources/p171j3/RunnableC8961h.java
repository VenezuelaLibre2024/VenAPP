package p171j3;

import android.os.Build;
import android.util.Log;
import androidx.core.util.InterfaceC0981e;
import com.bumptech.glide.C2118d;
import com.bumptech.glide.C2122h;
import com.bumptech.glide.EnumC2121g;
import com.bumptech.glide.load.data.InterfaceC2133d;
import com.bumptech.glide.load.data.InterfaceC2134e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p036c4.C1866g;
import p055d4.AbstractC6844c;
import p055d4.C6842a;
import p055d4.C6843b;
import p129h3.C7623g;
import p129h3.C7624h;
import p129h3.EnumC7617a;
import p129h3.EnumC7619c;
import p129h3.InterfaceC7622f;
import p129h3.InterfaceC7627k;
import p129h3.InterfaceC7628l;
import p171j3.C8962i;
import p171j3.InterfaceC8959f;
import p212l3.InterfaceC9375a;
import p302q3.C10251q;

/* renamed from: j3.h */
/* loaded from: classes.dex */
class RunnableC8961h<R> implements InterfaceC8959f.a, Runnable, Comparable<RunnableC8961h<?>>, C6842a.f {

    /* renamed from: A */
    private b<R> f21340A;

    /* renamed from: B */
    private int f21341B;

    /* renamed from: C */
    private h f21342C;

    /* renamed from: D */
    private g f21343D;

    /* renamed from: E */
    private long f21344E;

    /* renamed from: F */
    private boolean f21345F;

    /* renamed from: G */
    private Object f21346G;

    /* renamed from: H */
    private Thread f21347H;

    /* renamed from: I */
    private InterfaceC7622f f21348I;

    /* renamed from: J */
    private InterfaceC7622f f21349J;

    /* renamed from: K */
    private Object f21350K;

    /* renamed from: L */
    private EnumC7617a f21351L;

    /* renamed from: M */
    private InterfaceC2133d<?> f21352M;

    /* renamed from: N */
    private volatile InterfaceC8959f f21353N;

    /* renamed from: O */
    private volatile boolean f21354O;

    /* renamed from: P */
    private volatile boolean f21355P;

    /* renamed from: Q */
    private boolean f21356Q;

    /* renamed from: d */
    private final e f21360d;

    /* renamed from: e */
    private final InterfaceC0981e<RunnableC8961h<?>> f21361e;

    /* renamed from: s */
    private C2118d f21364s;

    /* renamed from: t */
    private InterfaceC7622f f21365t;

    /* renamed from: u */
    private EnumC2121g f21366u;

    /* renamed from: v */
    private C8967n f21367v;

    /* renamed from: w */
    private int f21368w;

    /* renamed from: x */
    private int f21369x;

    /* renamed from: y */
    private AbstractC8963j f21370y;

    /* renamed from: z */
    private C7624h f21371z;

    /* renamed from: a */
    private final C8960g<R> f21357a = new C8960g<>();

    /* renamed from: b */
    private final List<Throwable> f21358b = new ArrayList();

    /* renamed from: c */
    private final AbstractC6844c f21359c = AbstractC6844c.m19780a();

    /* renamed from: f */
    private final d<?> f21362f = new d<>();

    /* renamed from: r */
    private final f f21363r = new f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j3.h$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21372a;

        /* renamed from: b */
        static final /* synthetic */ int[] f21373b;

        /* renamed from: c */
        static final /* synthetic */ int[] f21374c;

        static {
            int[] iArr = new int[EnumC7619c.values().length];
            f21374c = iArr;
            try {
                iArr[EnumC7619c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21374c[EnumC7619c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[h.values().length];
            f21373b = iArr2;
            try {
                iArr2[h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21373b[h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21373b[h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21373b[h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21373b[h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f21372a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21372a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21372a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j3.h$b */
    /* loaded from: classes.dex */
    public interface b<R> {
        /* renamed from: b */
        void mo26244b(InterfaceC8975v<R> interfaceC8975v, EnumC7617a enumC7617a, boolean z10);

        /* renamed from: c */
        void mo26245c(C8970q c8970q);

        /* renamed from: d */
        void mo26246d(RunnableC8961h<?> runnableC8961h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j3.h$c */
    /* loaded from: classes.dex */
    public final class c<Z> implements C8962i.a<Z> {

        /* renamed from: a */
        private final EnumC7617a f21375a;

        c(EnumC7617a enumC7617a) {
            this.f21375a = enumC7617a;
        }

        @Override // p171j3.C8962i.a
        /* renamed from: a */
        public InterfaceC8975v<Z> mo26247a(InterfaceC8975v<Z> interfaceC8975v) {
            return RunnableC8961h.this.m26238D(this.f21375a, interfaceC8975v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j3.h$d */
    /* loaded from: classes.dex */
    public static class d<Z> {

        /* renamed from: a */
        private InterfaceC7622f f21377a;

        /* renamed from: b */
        private InterfaceC7627k<Z> f21378b;

        /* renamed from: c */
        private C8974u<Z> f21379c;

        d() {
        }

        /* renamed from: a */
        void m26248a() {
            this.f21377a = null;
            this.f21378b = null;
            this.f21379c = null;
        }

        /* renamed from: b */
        void m26249b(e eVar, C7624h c7624h) {
            C6843b.m19774a("DecodeJob.encode");
            try {
                eVar.mo26252a().mo27892a(this.f21377a, new C8958e(this.f21378b, this.f21379c, c7624h));
            } finally {
                this.f21379c.m26333d();
                C6843b.m19778e();
            }
        }

        /* renamed from: c */
        boolean m26250c() {
            return this.f21379c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        <X> void m26251d(InterfaceC7622f interfaceC7622f, InterfaceC7627k<X> interfaceC7627k, C8974u<X> c8974u) {
            this.f21377a = interfaceC7622f;
            this.f21378b = interfaceC7627k;
            this.f21379c = c8974u;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j3.h$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        InterfaceC9375a mo26252a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j3.h$f */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        private boolean f21380a;

        /* renamed from: b */
        private boolean f21381b;

        /* renamed from: c */
        private boolean f21382c;

        f() {
        }

        /* renamed from: a */
        private boolean m26253a(boolean z10) {
            return (this.f21382c || z10 || this.f21381b) && this.f21380a;
        }

        /* renamed from: b */
        synchronized boolean m26254b() {
            this.f21381b = true;
            return m26253a(false);
        }

        /* renamed from: c */
        synchronized boolean m26255c() {
            this.f21382c = true;
            return m26253a(false);
        }

        /* renamed from: d */
        synchronized boolean m26256d(boolean z10) {
            this.f21380a = true;
            return m26253a(z10);
        }

        /* renamed from: e */
        synchronized void m26257e() {
            this.f21381b = false;
            this.f21380a = false;
            this.f21382c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j3.h$g */
    /* loaded from: classes.dex */
    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j3.h$h */
    /* loaded from: classes.dex */
    public enum h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC8961h(e eVar, InterfaceC0981e<RunnableC8961h<?>> interfaceC0981e) {
        this.f21360d = eVar;
        this.f21361e = interfaceC0981e;
    }

    /* renamed from: A */
    private void m26218A() {
        m26226K();
        this.f21340A.mo26245c(new C8970q("Failed to load resource", new ArrayList(this.f21358b)));
        m26220C();
    }

    /* renamed from: B */
    private void m26219B() {
        if (this.f21363r.m26254b()) {
            m26221F();
        }
    }

    /* renamed from: C */
    private void m26220C() {
        if (this.f21363r.m26255c()) {
            m26221F();
        }
    }

    /* renamed from: F */
    private void m26221F() {
        this.f21363r.m26257e();
        this.f21362f.m26248a();
        this.f21357a.m26193a();
        this.f21354O = false;
        this.f21364s = null;
        this.f21365t = null;
        this.f21371z = null;
        this.f21366u = null;
        this.f21367v = null;
        this.f21340A = null;
        this.f21342C = null;
        this.f21353N = null;
        this.f21347H = null;
        this.f21348I = null;
        this.f21350K = null;
        this.f21351L = null;
        this.f21352M = null;
        this.f21344E = 0L;
        this.f21355P = false;
        this.f21346G = null;
        this.f21358b.clear();
        this.f21361e.mo4820a(this);
    }

    /* renamed from: G */
    private void m26222G(g gVar) {
        this.f21343D = gVar;
        this.f21340A.mo26246d(this);
    }

    /* renamed from: H */
    private void m26223H() {
        this.f21347H = Thread.currentThread();
        this.f21344E = C1866g.m9934b();
        boolean z10 = false;
        while (!this.f21355P && this.f21353N != null && !(z10 = this.f21353N.mo26188a())) {
            this.f21342C = m26231s(this.f21342C);
            this.f21353N = m26230r();
            if (this.f21342C == h.SOURCE) {
                m26222G(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f21342C == h.FINISHED || this.f21355P) && !z10) {
            m26218A();
        }
    }

    /* renamed from: I */
    private <Data, ResourceType> InterfaceC8975v<R> m26224I(Data data, EnumC7617a enumC7617a, C8973t<Data, ResourceType, R> c8973t) {
        C7624h m26232t = m26232t(enumC7617a);
        InterfaceC2134e<Data> m10685l = this.f21364s.m10670h().m10685l(data);
        try {
            return c8973t.m26329a(m10685l, m26232t, this.f21368w, this.f21369x, new c(enumC7617a));
        } finally {
            m10685l.mo10755b();
        }
    }

    /* renamed from: J */
    private void m26225J() {
        int i10 = a.f21372a[this.f21343D.ordinal()];
        if (i10 == 1) {
            this.f21342C = m26231s(h.INITIALIZE);
            this.f21353N = m26230r();
        } else if (i10 != 2) {
            if (i10 == 3) {
                m26229q();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f21343D);
        }
        m26223H();
    }

    /* renamed from: K */
    private void m26226K() {
        Throwable th2;
        this.f21359c.mo19782c();
        if (!this.f21354O) {
            this.f21354O = true;
            return;
        }
        if (this.f21358b.isEmpty()) {
            th2 = null;
        } else {
            List<Throwable> list = this.f21358b;
            th2 = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th2);
    }

    /* renamed from: o */
    private <Data> InterfaceC8975v<R> m26227o(InterfaceC2133d<?> interfaceC2133d, Data data, EnumC7617a enumC7617a) {
        if (data == null) {
            interfaceC2133d.mo10765b();
            return null;
        }
        try {
            long m9934b = C1866g.m9934b();
            InterfaceC8975v<R> m26228p = m26228p(data, enumC7617a);
            if (Log.isLoggable("DecodeJob", 2)) {
                m26234w("Decoded result " + m26228p, m9934b);
            }
            return m26228p;
        } finally {
            interfaceC2133d.mo10765b();
        }
    }

    /* renamed from: p */
    private <Data> InterfaceC8975v<R> m26228p(Data data, EnumC7617a enumC7617a) {
        return m26224I(data, enumC7617a, this.f21357a.m26200h(data.getClass()));
    }

    /* renamed from: q */
    private void m26229q() {
        InterfaceC8975v<R> interfaceC8975v;
        if (Log.isLoggable("DecodeJob", 2)) {
            m26235x("Retrieved data", this.f21344E, "data: " + this.f21350K + ", cache key: " + this.f21348I + ", fetcher: " + this.f21352M);
        }
        try {
            interfaceC8975v = m26227o(this.f21352M, this.f21350K, this.f21351L);
        } catch (C8970q e10) {
            e10.m26320i(this.f21349J, this.f21351L);
            this.f21358b.add(e10);
            interfaceC8975v = null;
        }
        if (interfaceC8975v != null) {
            m26237z(interfaceC8975v, this.f21351L, this.f21356Q);
        } else {
            m26223H();
        }
    }

    /* renamed from: r */
    private InterfaceC8959f m26230r() {
        int i10 = a.f21373b[this.f21342C.ordinal()];
        if (i10 == 1) {
            return new C8976w(this.f21357a, this);
        }
        if (i10 == 2) {
            return new C8956c(this.f21357a, this);
        }
        if (i10 == 3) {
            return new C8979z(this.f21357a, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f21342C);
    }

    /* renamed from: s */
    private h m26231s(h hVar) {
        int i10 = a.f21373b[hVar.ordinal()];
        if (i10 == 1) {
            return this.f21370y.mo26261a() ? h.DATA_CACHE : m26231s(h.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.f21345F ? h.FINISHED : h.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return h.FINISHED;
        }
        if (i10 == 5) {
            return this.f21370y.mo26262b() ? h.RESOURCE_CACHE : m26231s(h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + hVar);
    }

    /* renamed from: t */
    private C7624h m26232t(EnumC7617a enumC7617a) {
        C7624h c7624h = this.f21371z;
        if (Build.VERSION.SDK_INT < 26) {
            return c7624h;
        }
        boolean z10 = enumC7617a == EnumC7617a.RESOURCE_DISK_CACHE || this.f21357a.m26216x();
        C7623g<Boolean> c7623g = C10251q.f25427j;
        Boolean bool = (Boolean) c7624h.m23147c(c7623g);
        if (bool != null && (!bool.booleanValue() || z10)) {
            return c7624h;
        }
        C7624h c7624h2 = new C7624h();
        c7624h2.m23148d(this.f21371z);
        c7624h2.m23150f(c7623g, Boolean.valueOf(z10));
        return c7624h2;
    }

    /* renamed from: u */
    private int m26233u() {
        return this.f21366u.ordinal();
    }

    /* renamed from: w */
    private void m26234w(String str, long j10) {
        m26235x(str, j10, null);
    }

    /* renamed from: x */
    private void m26235x(String str, long j10, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(C1866g.m9933a(j10));
        sb2.append(", load key: ");
        sb2.append(this.f21367v);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb2.toString());
    }

    /* renamed from: y */
    private void m26236y(InterfaceC8975v<R> interfaceC8975v, EnumC7617a enumC7617a, boolean z10) {
        m26226K();
        this.f21340A.mo26244b(interfaceC8975v, enumC7617a, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    private void m26237z(InterfaceC8975v<R> interfaceC8975v, EnumC7617a enumC7617a, boolean z10) {
        C8974u c8974u;
        C6843b.m19774a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (interfaceC8975v instanceof InterfaceC8971r) {
                ((InterfaceC8971r) interfaceC8975v).initialize();
            }
            if (this.f21362f.m26250c()) {
                interfaceC8975v = C8974u.m26331b(interfaceC8975v);
                c8974u = interfaceC8975v;
            } else {
                c8974u = 0;
            }
            m26236y(interfaceC8975v, enumC7617a, z10);
            this.f21342C = h.ENCODE;
            try {
                if (this.f21362f.m26250c()) {
                    this.f21362f.m26249b(this.f21360d, this.f21371z);
                }
                m26219B();
            } finally {
                if (c8974u != 0) {
                    c8974u.m26333d();
                }
            }
        } finally {
            C6843b.m19778e();
        }
    }

    /* renamed from: D */
    <Z> InterfaceC8975v<Z> m26238D(EnumC7617a enumC7617a, InterfaceC8975v<Z> interfaceC8975v) {
        InterfaceC8975v<Z> interfaceC8975v2;
        InterfaceC7628l<Z> interfaceC7628l;
        EnumC7619c enumC7619c;
        InterfaceC7622f c8957d;
        Class<?> cls = interfaceC8975v.get().getClass();
        InterfaceC7627k<Z> interfaceC7627k = null;
        if (enumC7617a != EnumC7617a.RESOURCE_DISK_CACHE) {
            InterfaceC7628l<Z> m26211s = this.f21357a.m26211s(cls);
            interfaceC7628l = m26211s;
            interfaceC8975v2 = m26211s.mo23154a(this.f21364s, interfaceC8975v, this.f21368w, this.f21369x);
        } else {
            interfaceC8975v2 = interfaceC8975v;
            interfaceC7628l = null;
        }
        if (!interfaceC8975v.equals(interfaceC8975v2)) {
            interfaceC8975v.mo26310q();
        }
        if (this.f21357a.m26215w(interfaceC8975v2)) {
            interfaceC7627k = this.f21357a.m26206n(interfaceC8975v2);
            enumC7619c = interfaceC7627k.mo23153a(this.f21371z);
        } else {
            enumC7619c = EnumC7619c.NONE;
        }
        InterfaceC7627k interfaceC7627k2 = interfaceC7627k;
        if (!this.f21370y.mo26264d(!this.f21357a.m26217y(this.f21348I), enumC7617a, enumC7619c)) {
            return interfaceC8975v2;
        }
        if (interfaceC7627k2 == null) {
            throw new C2122h.d(interfaceC8975v2.get().getClass());
        }
        int i10 = a.f21374c[enumC7619c.ordinal()];
        if (i10 == 1) {
            c8957d = new C8957d(this.f21348I, this.f21365t);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + enumC7619c);
            }
            c8957d = new C8977x(this.f21357a.m26194b(), this.f21348I, this.f21365t, this.f21368w, this.f21369x, interfaceC7628l, cls, this.f21371z);
        }
        C8974u m26331b = C8974u.m26331b(interfaceC8975v2);
        this.f21362f.m26251d(c8957d, interfaceC7627k2, m26331b);
        return m26331b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m26239E(boolean z10) {
        if (this.f21363r.m26256d(z10)) {
            m26221F();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public boolean m26240L() {
        h m26231s = m26231s(h.INITIALIZE);
        return m26231s == h.RESOURCE_CACHE || m26231s == h.DATA_CACHE;
    }

    @Override // p171j3.InterfaceC8959f.a
    /* renamed from: b */
    public void mo26190b(InterfaceC7622f interfaceC7622f, Object obj, InterfaceC2133d<?> interfaceC2133d, EnumC7617a enumC7617a, InterfaceC7622f interfaceC7622f2) {
        this.f21348I = interfaceC7622f;
        this.f21350K = obj;
        this.f21352M = interfaceC2133d;
        this.f21351L = enumC7617a;
        this.f21349J = interfaceC7622f2;
        this.f21356Q = interfaceC7622f != this.f21357a.m26195c().get(0);
        if (Thread.currentThread() != this.f21347H) {
            m26222G(g.DECODE_DATA);
            return;
        }
        C6843b.m19774a("DecodeJob.decodeFromRetrievedData");
        try {
            m26229q();
        } finally {
            C6843b.m19778e();
        }
    }

    @Override // p055d4.C6842a.f
    /* renamed from: h */
    public AbstractC6844c mo19773h() {
        return this.f21359c;
    }

    @Override // p171j3.InterfaceC8959f.a
    /* renamed from: i */
    public void mo26191i(InterfaceC7622f interfaceC7622f, Exception exc, InterfaceC2133d<?> interfaceC2133d, EnumC7617a enumC7617a) {
        interfaceC2133d.mo10765b();
        C8970q c8970q = new C8970q("Fetching data failed", exc);
        c8970q.m26321j(interfaceC7622f, enumC7617a, interfaceC2133d.mo10760a());
        this.f21358b.add(c8970q);
        if (Thread.currentThread() != this.f21347H) {
            m26222G(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            m26223H();
        }
    }

    @Override // p171j3.InterfaceC8959f.a
    /* renamed from: l */
    public void mo26192l() {
        m26222G(g.SWITCH_TO_SOURCE_SERVICE);
    }

    /* renamed from: m */
    public void m26241m() {
        this.f21355P = true;
        InterfaceC8959f interfaceC8959f = this.f21353N;
        if (interfaceC8959f != null) {
            interfaceC8959f.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(RunnableC8961h<?> runnableC8961h) {
        int m26233u = m26233u() - runnableC8961h.m26233u();
        return m26233u == 0 ? this.f21341B - runnableC8961h.f21341B : m26233u;
    }

    @Override // java.lang.Runnable
    public void run() {
        C6843b.m19776c("DecodeJob#run(reason=%s, model=%s)", this.f21343D, this.f21346G);
        InterfaceC2133d<?> interfaceC2133d = this.f21352M;
        try {
            try {
                try {
                    if (this.f21355P) {
                        m26218A();
                        if (interfaceC2133d != null) {
                            interfaceC2133d.mo10765b();
                        }
                        C6843b.m19778e();
                        return;
                    }
                    m26225J();
                    if (interfaceC2133d != null) {
                        interfaceC2133d.mo10765b();
                    }
                    C6843b.m19778e();
                } catch (Throwable th2) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f21355P + ", stage: " + this.f21342C, th2);
                    }
                    if (this.f21342C != h.ENCODE) {
                        this.f21358b.add(th2);
                        m26218A();
                    }
                    if (!this.f21355P) {
                        throw th2;
                    }
                    throw th2;
                }
            } catch (C8955b e10) {
                throw e10;
            }
        } catch (Throwable th3) {
            if (interfaceC2133d != null) {
                interfaceC2133d.mo10765b();
            }
            C6843b.m19778e();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public RunnableC8961h<R> m26243v(C2118d c2118d, Object obj, C8967n c8967n, InterfaceC7622f interfaceC7622f, int i10, int i11, Class<?> cls, Class<R> cls2, EnumC2121g enumC2121g, AbstractC8963j abstractC8963j, Map<Class<?>, InterfaceC7628l<?>> map, boolean z10, boolean z11, boolean z12, C7624h c7624h, b<R> bVar, int i12) {
        this.f21357a.m26214v(c2118d, obj, interfaceC7622f, i10, i11, abstractC8963j, cls, cls2, enumC2121g, c7624h, map, z10, z11, this.f21360d);
        this.f21364s = c2118d;
        this.f21365t = interfaceC7622f;
        this.f21366u = enumC2121g;
        this.f21367v = c8967n;
        this.f21368w = i10;
        this.f21369x = i11;
        this.f21370y = abstractC8963j;
        this.f21345F = z12;
        this.f21371z = c7624h;
        this.f21340A = bVar;
        this.f21341B = i12;
        this.f21343D = g.INITIALIZE;
        this.f21346G = obj;
        return this;
    }
}
