package p456y3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C2117c;
import com.bumptech.glide.C2118d;
import com.bumptech.glide.EnumC2121g;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p006a4.InterfaceC0032c;
import p036c4.C1866g;
import p036c4.C1871l;
import p055d4.AbstractC6844c;
import p055d4.C6843b;
import p129h3.EnumC7617a;
import p171j3.C8964k;
import p171j3.C8970q;
import p171j3.InterfaceC8975v;
import p346s3.C10789g;
import p478z3.InterfaceC12797c;
import p478z3.InterfaceC12798d;

/* renamed from: y3.k */
/* loaded from: classes.dex */
public final class C12596k<R> implements InterfaceC12590e, InterfaceC12797c, InterfaceC12595j {

    /* renamed from: E */
    private static final boolean f34143E = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A */
    private int f34144A;

    /* renamed from: B */
    private int f34145B;

    /* renamed from: C */
    private boolean f34146C;

    /* renamed from: D */
    private RuntimeException f34147D;

    /* renamed from: a */
    private int f34148a;

    /* renamed from: b */
    private final String f34149b;

    /* renamed from: c */
    private final AbstractC6844c f34150c;

    /* renamed from: d */
    private final Object f34151d;

    /* renamed from: e */
    private final InterfaceC12593h<R> f34152e;

    /* renamed from: f */
    private final InterfaceC12591f f34153f;

    /* renamed from: g */
    private final Context f34154g;

    /* renamed from: h */
    private final C2118d f34155h;

    /* renamed from: i */
    private final Object f34156i;

    /* renamed from: j */
    private final Class<R> f34157j;

    /* renamed from: k */
    private final AbstractC12586a<?> f34158k;

    /* renamed from: l */
    private final int f34159l;

    /* renamed from: m */
    private final int f34160m;

    /* renamed from: n */
    private final EnumC2121g f34161n;

    /* renamed from: o */
    private final InterfaceC12798d<R> f34162o;

    /* renamed from: p */
    private final List<InterfaceC12593h<R>> f34163p;

    /* renamed from: q */
    private final InterfaceC0032c<? super R> f34164q;

    /* renamed from: r */
    private final Executor f34165r;

    /* renamed from: s */
    private InterfaceC8975v<R> f34166s;

    /* renamed from: t */
    private C8964k.d f34167t;

    /* renamed from: u */
    private long f34168u;

    /* renamed from: v */
    private volatile C8964k f34169v;

    /* renamed from: w */
    private a f34170w;

    /* renamed from: x */
    private Drawable f34171x;

    /* renamed from: y */
    private Drawable f34172y;

    /* renamed from: z */
    private Drawable f34173z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y3.k$a */
    /* loaded from: classes.dex */
    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private C12596k(Context context, C2118d c2118d, Object obj, Object obj2, Class<R> cls, AbstractC12586a<?> abstractC12586a, int i10, int i11, EnumC2121g enumC2121g, InterfaceC12798d<R> interfaceC12798d, InterfaceC12593h<R> interfaceC12593h, List<InterfaceC12593h<R>> list, InterfaceC12591f interfaceC12591f, C8964k c8964k, InterfaceC0032c<? super R> interfaceC0032c, Executor executor) {
        this.f34149b = f34143E ? String.valueOf(super.hashCode()) : null;
        this.f34150c = AbstractC6844c.m19780a();
        this.f34151d = obj;
        this.f34154g = context;
        this.f34155h = c2118d;
        this.f34156i = obj2;
        this.f34157j = cls;
        this.f34158k = abstractC12586a;
        this.f34159l = i10;
        this.f34160m = i11;
        this.f34161n = enumC2121g;
        this.f34162o = interfaceC12798d;
        this.f34152e = interfaceC12593h;
        this.f34163p = list;
        this.f34153f = interfaceC12591f;
        this.f34169v = c8964k;
        this.f34164q = interfaceC0032c;
        this.f34165r = executor;
        this.f34170w = a.PENDING;
        if (this.f34147D == null && c2118d.m10668f().m10671a(C2117c.c.class)) {
            this.f34147D = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: A */
    private void m41408A(InterfaceC8975v<R> interfaceC8975v, R r10, EnumC7617a enumC7617a, boolean z10) {
        boolean z11;
        boolean m41419s = m41419s();
        this.f34170w = a.COMPLETE;
        this.f34166s = interfaceC8975v;
        if (this.f34155h.m10669g() <= 3) {
            Log.d("Glide", "Finished loading " + r10.getClass().getSimpleName() + " from " + enumC7617a + " for " + this.f34156i + " with size [" + this.f34144A + "x" + this.f34145B + "] in " + C1866g.m9933a(this.f34168u) + " ms");
        }
        m41424x();
        boolean z12 = true;
        this.f34146C = true;
        try {
            List<InterfaceC12593h<R>> list = this.f34163p;
            if (list != null) {
                Iterator<InterfaceC12593h<R>> it = list.iterator();
                z11 = false;
                while (it.hasNext()) {
                    z11 |= it.next().mo36135c(r10, this.f34156i, this.f34162o, enumC7617a, m41419s);
                }
            } else {
                z11 = false;
            }
            InterfaceC12593h<R> interfaceC12593h = this.f34152e;
            if (interfaceC12593h == null || !interfaceC12593h.mo36135c(r10, this.f34156i, this.f34162o, enumC7617a, m41419s)) {
                z12 = false;
            }
            if (!(z12 | z11)) {
                this.f34162o.mo35350b(r10, this.f34164q.mo103a(enumC7617a, m41419s));
            }
            this.f34146C = false;
            C6843b.m19779f("GlideRequest", this.f34148a);
        } catch (Throwable th2) {
            this.f34146C = false;
            throw th2;
        }
    }

    /* renamed from: B */
    private void m41409B() {
        if (m41412l()) {
            Drawable m41417q = this.f34156i == null ? m41417q() : null;
            if (m41417q == null) {
                m41417q = m41416p();
            }
            if (m41417q == null) {
                m41417q = m41418r();
            }
            this.f34162o.mo36109j(m41417q);
        }
    }

    /* renamed from: i */
    private void m41410i() {
        if (this.f34146C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: k */
    private boolean m41411k() {
        InterfaceC12591f interfaceC12591f = this.f34153f;
        return interfaceC12591f == null || interfaceC12591f.mo41382b(this);
    }

    /* renamed from: l */
    private boolean m41412l() {
        InterfaceC12591f interfaceC12591f = this.f34153f;
        return interfaceC12591f == null || interfaceC12591f.mo41389i(this);
    }

    /* renamed from: m */
    private boolean m41413m() {
        InterfaceC12591f interfaceC12591f = this.f34153f;
        return interfaceC12591f == null || interfaceC12591f.mo41386f(this);
    }

    /* renamed from: n */
    private void m41414n() {
        m41410i();
        this.f34150c.mo19782c();
        this.f34162o.mo41395a(this);
        C8964k.d dVar = this.f34167t;
        if (dVar != null) {
            dVar.m26282a();
            this.f34167t = null;
        }
    }

    /* renamed from: o */
    private void m41415o(Object obj) {
        List<InterfaceC12593h<R>> list = this.f34163p;
        if (list == null) {
            return;
        }
        for (InterfaceC12593h<R> interfaceC12593h : list) {
            if (interfaceC12593h instanceof AbstractC12588c) {
                ((AbstractC12588c) interfaceC12593h).m41392a(obj);
            }
        }
    }

    /* renamed from: p */
    private Drawable m41416p() {
        if (this.f34171x == null) {
            Drawable m41364k = this.f34158k.m41364k();
            this.f34171x = m41364k;
            if (m41364k == null && this.f34158k.m41363j() > 0) {
                this.f34171x = m41420t(this.f34158k.m41363j());
            }
        }
        return this.f34171x;
    }

    /* renamed from: q */
    private Drawable m41417q() {
        if (this.f34173z == null) {
            Drawable m41365l = this.f34158k.m41365l();
            this.f34173z = m41365l;
            if (m41365l == null && this.f34158k.m41366m() > 0) {
                this.f34173z = m41420t(this.f34158k.m41366m());
            }
        }
        return this.f34173z;
    }

    /* renamed from: r */
    private Drawable m41418r() {
        if (this.f34172y == null) {
            Drawable m41371t = this.f34158k.m41371t();
            this.f34172y = m41371t;
            if (m41371t == null && this.f34158k.m41372u() > 0) {
                this.f34172y = m41420t(this.f34158k.m41372u());
            }
        }
        return this.f34172y;
    }

    /* renamed from: s */
    private boolean m41419s() {
        InterfaceC12591f interfaceC12591f = this.f34153f;
        return interfaceC12591f == null || !interfaceC12591f.getRoot().mo41381a();
    }

    /* renamed from: t */
    private Drawable m41420t(int i10) {
        return C10789g.m32875a(this.f34154g, i10, this.f34158k.m41332A() != null ? this.f34158k.m41332A() : this.f34154g.getTheme());
    }

    /* renamed from: u */
    private void m41421u(String str) {
        Log.v("GlideRequest", str + " this: " + this.f34149b);
    }

    /* renamed from: v */
    private static int m41422v(int i10, float f10) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * i10);
    }

    /* renamed from: w */
    private void m41423w() {
        InterfaceC12591f interfaceC12591f = this.f34153f;
        if (interfaceC12591f != null) {
            interfaceC12591f.mo41384d(this);
        }
    }

    /* renamed from: x */
    private void m41424x() {
        InterfaceC12591f interfaceC12591f = this.f34153f;
        if (interfaceC12591f != null) {
            interfaceC12591f.mo41383c(this);
        }
    }

    /* renamed from: y */
    public static <R> C12596k<R> m41425y(Context context, C2118d c2118d, Object obj, Object obj2, Class<R> cls, AbstractC12586a<?> abstractC12586a, int i10, int i11, EnumC2121g enumC2121g, InterfaceC12798d<R> interfaceC12798d, InterfaceC12593h<R> interfaceC12593h, List<InterfaceC12593h<R>> list, InterfaceC12591f interfaceC12591f, C8964k c8964k, InterfaceC0032c<? super R> interfaceC0032c, Executor executor) {
        return new C12596k<>(context, c2118d, obj, obj2, cls, abstractC12586a, i10, i11, enumC2121g, interfaceC12798d, interfaceC12593h, list, interfaceC12591f, c8964k, interfaceC0032c, executor);
    }

    /* renamed from: z */
    private void m41426z(C8970q c8970q, int i10) {
        boolean z10;
        this.f34150c.mo19782c();
        synchronized (this.f34151d) {
            c8970q.m26322k(this.f34147D);
            int m10669g = this.f34155h.m10669g();
            if (m10669g <= i10) {
                Log.w("Glide", "Load failed for [" + this.f34156i + "] with dimensions [" + this.f34144A + "x" + this.f34145B + "]", c8970q);
                if (m10669g <= 4) {
                    c8970q.m26319g("Glide");
                }
            }
            this.f34167t = null;
            this.f34170w = a.FAILED;
            m41423w();
            boolean z11 = true;
            this.f34146C = true;
            try {
                List<InterfaceC12593h<R>> list = this.f34163p;
                if (list != null) {
                    Iterator<InterfaceC12593h<R>> it = list.iterator();
                    z10 = false;
                    while (it.hasNext()) {
                        z10 |= it.next().mo36136d(c8970q, this.f34156i, this.f34162o, m41419s());
                    }
                } else {
                    z10 = false;
                }
                InterfaceC12593h<R> interfaceC12593h = this.f34152e;
                if (interfaceC12593h == null || !interfaceC12593h.mo36136d(c8970q, this.f34156i, this.f34162o, m41419s())) {
                    z11 = false;
                }
                if (!(z10 | z11)) {
                    m41409B();
                }
                this.f34146C = false;
                C6843b.m19779f("GlideRequest", this.f34148a);
            } catch (Throwable th2) {
                this.f34146C = false;
                throw th2;
            }
        }
    }

    @Override // p456y3.InterfaceC12590e
    /* renamed from: a */
    public boolean mo41381a() {
        boolean z10;
        synchronized (this.f34151d) {
            z10 = this.f34170w == a.COMPLETE;
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p456y3.InterfaceC12595j
    /* renamed from: b */
    public void mo41405b(InterfaceC8975v<?> interfaceC8975v, EnumC7617a enumC7617a, boolean z10) {
        this.f34150c.mo19782c();
        InterfaceC8975v<?> interfaceC8975v2 = null;
        try {
            synchronized (this.f34151d) {
                try {
                    this.f34167t = null;
                    if (interfaceC8975v == null) {
                        mo41406c(new C8970q("Expected to receive a Resource<R> with an object of " + this.f34157j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = interfaceC8975v.get();
                    try {
                        if (obj != null && this.f34157j.isAssignableFrom(obj.getClass())) {
                            if (m41413m()) {
                                m41408A(interfaceC8975v, obj, enumC7617a, z10);
                                return;
                            }
                            this.f34166s = null;
                            this.f34170w = a.COMPLETE;
                            C6843b.m19779f("GlideRequest", this.f34148a);
                            this.f34169v.m26277l(interfaceC8975v);
                            return;
                        }
                        this.f34166s = null;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected to receive an object of ");
                        sb2.append(this.f34157j);
                        sb2.append(" but instead got ");
                        sb2.append(obj != null ? obj.getClass() : "");
                        sb2.append("{");
                        sb2.append(obj);
                        sb2.append("} inside Resource{");
                        sb2.append(interfaceC8975v);
                        sb2.append("}.");
                        sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        mo41406c(new C8970q(sb2.toString()));
                        this.f34169v.m26277l(interfaceC8975v);
                    } catch (Throwable th2) {
                        interfaceC8975v2 = interfaceC8975v;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (interfaceC8975v2 != null) {
                this.f34169v.m26277l(interfaceC8975v2);
            }
            throw th4;
        }
    }

    @Override // p456y3.InterfaceC12595j
    /* renamed from: c */
    public void mo41406c(C8970q c8970q) {
        m41426z(c8970q, 5);
    }

    @Override // p456y3.InterfaceC12590e
    public void clear() {
        synchronized (this.f34151d) {
            m41410i();
            this.f34150c.mo19782c();
            a aVar = this.f34170w;
            a aVar2 = a.CLEARED;
            if (aVar == aVar2) {
                return;
            }
            m41414n();
            InterfaceC8975v<R> interfaceC8975v = this.f34166s;
            if (interfaceC8975v != null) {
                this.f34166s = null;
            } else {
                interfaceC8975v = null;
            }
            if (m41411k()) {
                this.f34162o.mo35353g(m41418r());
            }
            C6843b.m19779f("GlideRequest", this.f34148a);
            this.f34170w = aVar2;
            if (interfaceC8975v != null) {
                this.f34169v.m26277l(interfaceC8975v);
            }
        }
    }

    @Override // p478z3.InterfaceC12797c
    /* renamed from: d */
    public void mo41427d(int i10, int i11) {
        Object obj;
        this.f34150c.mo19782c();
        Object obj2 = this.f34151d;
        synchronized (obj2) {
            try {
                try {
                    boolean z10 = f34143E;
                    if (z10) {
                        m41421u("Got onSizeReady in " + C1866g.m9933a(this.f34168u));
                    }
                    if (this.f34170w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        this.f34170w = aVar;
                        float m41376z = this.f34158k.m41376z();
                        this.f34144A = m41422v(i10, m41376z);
                        this.f34145B = m41422v(i11, m41376z);
                        if (z10) {
                            m41421u("finished setup for calling load in " + C1866g.m9933a(this.f34168u));
                        }
                        obj = obj2;
                        try {
                            this.f34167t = this.f34169v.m26276g(this.f34155h, this.f34156i, this.f34158k.m41375x(), this.f34144A, this.f34145B, this.f34158k.m41374w(), this.f34157j, this.f34161n, this.f34158k.m41362i(), this.f34158k.m41333B(), this.f34158k.m41340K(), this.f34158k.m41339H(), this.f34158k.m41368q(), this.f34158k.m41337F(), this.f34158k.m41335D(), this.f34158k.m41334C(), this.f34158k.m41367p(), this, this.f34165r);
                            if (this.f34170w != aVar) {
                                this.f34167t = null;
                            }
                            if (z10) {
                                m41421u("finished onSizeReady in " + C1866g.m9933a(this.f34168u));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // p456y3.InterfaceC12590e
    /* renamed from: e */
    public boolean mo41385e() {
        boolean z10;
        synchronized (this.f34151d) {
            z10 = this.f34170w == a.CLEARED;
        }
        return z10;
    }

    @Override // p456y3.InterfaceC12595j
    /* renamed from: f */
    public Object mo41407f() {
        this.f34150c.mo19782c();
        return this.f34151d;
    }

    @Override // p456y3.InterfaceC12590e
    /* renamed from: g */
    public boolean mo41387g() {
        boolean z10;
        synchronized (this.f34151d) {
            z10 = this.f34170w == a.COMPLETE;
        }
        return z10;
    }

    @Override // p456y3.InterfaceC12590e
    /* renamed from: h */
    public boolean mo41388h(InterfaceC12590e interfaceC12590e) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        AbstractC12586a<?> abstractC12586a;
        EnumC2121g enumC2121g;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class<R> cls2;
        AbstractC12586a<?> abstractC12586a2;
        EnumC2121g enumC2121g2;
        int size2;
        if (!(interfaceC12590e instanceof C12596k)) {
            return false;
        }
        synchronized (this.f34151d) {
            i10 = this.f34159l;
            i11 = this.f34160m;
            obj = this.f34156i;
            cls = this.f34157j;
            abstractC12586a = this.f34158k;
            enumC2121g = this.f34161n;
            List<InterfaceC12593h<R>> list = this.f34163p;
            size = list != null ? list.size() : 0;
        }
        C12596k c12596k = (C12596k) interfaceC12590e;
        synchronized (c12596k.f34151d) {
            i12 = c12596k.f34159l;
            i13 = c12596k.f34160m;
            obj2 = c12596k.f34156i;
            cls2 = c12596k.f34157j;
            abstractC12586a2 = c12596k.f34158k;
            enumC2121g2 = c12596k.f34161n;
            List<InterfaceC12593h<R>> list2 = c12596k.f34163p;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i10 == i12 && i11 == i13 && C1871l.m9954c(obj, obj2) && cls.equals(cls2) && abstractC12586a.equals(abstractC12586a2) && enumC2121g == enumC2121g2 && size == size2;
    }

    @Override // p456y3.InterfaceC12590e
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f34151d) {
            a aVar = this.f34170w;
            z10 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
        }
        return z10;
    }

    @Override // p456y3.InterfaceC12590e
    /* renamed from: j */
    public void mo41390j() {
        synchronized (this.f34151d) {
            m41410i();
            this.f34150c.mo19782c();
            this.f34168u = C1866g.m9934b();
            Object obj = this.f34156i;
            if (obj == null) {
                if (C1871l.m9971t(this.f34159l, this.f34160m)) {
                    this.f34144A = this.f34159l;
                    this.f34145B = this.f34160m;
                }
                m41426z(new C8970q("Received null model"), m41417q() == null ? 5 : 3);
                return;
            }
            a aVar = this.f34170w;
            a aVar2 = a.RUNNING;
            if (aVar == aVar2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (aVar == a.COMPLETE) {
                mo41405b(this.f34166s, EnumC7617a.MEMORY_CACHE, false);
                return;
            }
            m41415o(obj);
            this.f34148a = C6843b.m19775b("GlideRequest");
            a aVar3 = a.WAITING_FOR_SIZE;
            this.f34170w = aVar3;
            if (C1871l.m9971t(this.f34159l, this.f34160m)) {
                mo41427d(this.f34159l, this.f34160m);
            } else {
                this.f34162o.mo41399i(this);
            }
            a aVar4 = this.f34170w;
            if ((aVar4 == aVar2 || aVar4 == aVar3) && m41412l()) {
                this.f34162o.mo41396e(m41418r());
            }
            if (f34143E) {
                m41421u("finished run method in " + C1866g.m9933a(this.f34168u));
            }
        }
    }

    @Override // p456y3.InterfaceC12590e
    public void pause() {
        synchronized (this.f34151d) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f34151d) {
            obj = this.f34156i;
            cls = this.f34157j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
