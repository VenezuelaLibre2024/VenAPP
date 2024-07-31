package androidx.camera.core.impl;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.C0742c;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.concurrent.atomic.AtomicInteger;
import p002a0.C0009f;
import p407w.C12029o0;
import p474z.C12747a;

/* renamed from: androidx.camera.core.impl.r0 */
/* loaded from: classes.dex */
public abstract class AbstractC0661r0 {

    /* renamed from: k */
    public static final Size f2904k = new Size(0, 0);

    /* renamed from: l */
    private static final boolean f2905l = C12029o0.m38643f("DeferrableSurface");

    /* renamed from: m */
    private static final AtomicInteger f2906m = new AtomicInteger(0);

    /* renamed from: n */
    private static final AtomicInteger f2907n = new AtomicInteger(0);

    /* renamed from: a */
    private final Object f2908a;

    /* renamed from: b */
    private int f2909b;

    /* renamed from: c */
    private boolean f2910c;

    /* renamed from: d */
    private C0742c.a<Void> f2911d;

    /* renamed from: e */
    private final InterfaceFutureC5920f<Void> f2912e;

    /* renamed from: f */
    private C0742c.a<Void> f2913f;

    /* renamed from: g */
    private final InterfaceFutureC5920f<Void> f2914g;

    /* renamed from: h */
    private final Size f2915h;

    /* renamed from: i */
    private final int f2916i;

    /* renamed from: j */
    Class<?> f2917j;

    /* renamed from: androidx.camera.core.impl.r0$a */
    /* loaded from: classes.dex */
    public static final class a extends Exception {

        /* renamed from: a */
        AbstractC0661r0 f2918a;

        public a(String str, AbstractC0661r0 abstractC0661r0) {
            super(str);
            this.f2918a = abstractC0661r0;
        }

        /* renamed from: a */
        public AbstractC0661r0 m3234a() {
            return this.f2918a;
        }
    }

    /* renamed from: androidx.camera.core.impl.r0$b */
    /* loaded from: classes.dex */
    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public AbstractC0661r0() {
        this(f2904k, 0);
    }

    public AbstractC0661r0(Size size, int i10) {
        this.f2908a = new Object();
        this.f2909b = 0;
        this.f2910c = false;
        this.f2915h = size;
        this.f2916i = i10;
        InterfaceFutureC5920f<Void> m3752a = C0742c.m3752a(new C0742c.c() { // from class: androidx.camera.core.impl.o0
            @Override // androidx.concurrent.futures.C0742c.c
            /* renamed from: a */
            public final Object mo14a(C0742c.a aVar) {
                Object m3219n;
                m3219n = AbstractC0661r0.this.m3219n(aVar);
                return m3219n;
            }
        });
        this.f2912e = m3752a;
        this.f2914g = C0742c.m3752a(new C0742c.c() { // from class: androidx.camera.core.impl.p0
            @Override // androidx.concurrent.futures.C0742c.c
            /* renamed from: a */
            public final Object mo14a(C0742c.a aVar) {
                Object m3220o;
                m3220o = AbstractC0661r0.this.m3220o(aVar);
                return m3220o;
            }
        });
        if (C12029o0.m38643f("DeferrableSurface")) {
            m3222q("Surface created", f2907n.incrementAndGet(), f2906m.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            m3752a.addListener(new Runnable() { // from class: androidx.camera.core.impl.q0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC0661r0.this.m3221p(stackTraceString);
                }
            }, C12747a.m42280a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m3219n(C0742c.a aVar) {
        synchronized (this.f2908a) {
            this.f2911d = aVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m3220o(C0742c.a aVar) {
        synchronized (this.f2908a) {
            this.f2913f = aVar;
        }
        return "DeferrableSurface-close(" + this + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m3221p(String str) {
        try {
            this.f2912e.get();
            m3222q("Surface terminated", f2907n.decrementAndGet(), f2906m.get());
        } catch (Exception e10) {
            C12029o0.m38640c("DeferrableSurface", "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.f2908a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, Boolean.valueOf(this.f2910c), Integer.valueOf(this.f2909b)), e10);
            }
        }
    }

    /* renamed from: q */
    private void m3222q(String str, int i10, int i11) {
        if (!f2905l && C12029o0.m38643f("DeferrableSurface")) {
            C12029o0.m38638a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        C12029o0.m38638a("DeferrableSurface", str + "[total_surfaces=" + i10 + ", used_surfaces=" + i11 + "](" + this + "}");
    }

    /* renamed from: d */
    public void m3223d() {
        C0742c.a<Void> aVar;
        synchronized (this.f2908a) {
            if (this.f2910c) {
                aVar = null;
            } else {
                this.f2910c = true;
                this.f2913f.m3756c(null);
                if (this.f2909b == 0) {
                    aVar = this.f2911d;
                    this.f2911d = null;
                } else {
                    aVar = null;
                }
                if (C12029o0.m38643f("DeferrableSurface")) {
                    C12029o0.m38638a("DeferrableSurface", "surface closed,  useCount=" + this.f2909b + " closed=true " + this);
                }
            }
        }
        if (aVar != null) {
            aVar.m3756c(null);
        }
    }

    /* renamed from: e */
    public void m3224e() {
        C0742c.a<Void> aVar;
        synchronized (this.f2908a) {
            int i10 = this.f2909b;
            if (i10 == 0) {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            int i11 = i10 - 1;
            this.f2909b = i11;
            if (i11 == 0 && this.f2910c) {
                aVar = this.f2911d;
                this.f2911d = null;
            } else {
                aVar = null;
            }
            if (C12029o0.m38643f("DeferrableSurface")) {
                C12029o0.m38638a("DeferrableSurface", "use count-1,  useCount=" + this.f2909b + " closed=" + this.f2910c + " " + this);
                if (this.f2909b == 0) {
                    m3222q("Surface no longer in use", f2907n.get(), f2906m.decrementAndGet());
                }
            }
        }
        if (aVar != null) {
            aVar.m3756c(null);
        }
    }

    /* renamed from: f */
    public InterfaceFutureC5920f<Void> m3225f() {
        return C0009f.m24j(this.f2914g);
    }

    /* renamed from: g */
    public Class<?> m3226g() {
        return this.f2917j;
    }

    /* renamed from: h */
    public Size m3227h() {
        return this.f2915h;
    }

    /* renamed from: i */
    public int m3228i() {
        return this.f2916i;
    }

    /* renamed from: j */
    public final InterfaceFutureC5920f<Surface> m3229j() {
        synchronized (this.f2908a) {
            if (this.f2910c) {
                return C0009f.m20f(new a("DeferrableSurface already closed.", this));
            }
            return mo2981r();
        }
    }

    /* renamed from: k */
    public InterfaceFutureC5920f<Void> m3230k() {
        return C0009f.m24j(this.f2912e);
    }

    /* renamed from: l */
    public void m3231l() {
        synchronized (this.f2908a) {
            int i10 = this.f2909b;
            if (i10 == 0 && this.f2910c) {
                throw new a("Cannot begin use on a closed surface.", this);
            }
            this.f2909b = i10 + 1;
            if (C12029o0.m38643f("DeferrableSurface")) {
                if (this.f2909b == 1) {
                    m3222q("New surface in use", f2907n.get(), f2906m.incrementAndGet());
                }
                C12029o0.m38638a("DeferrableSurface", "use count+1, useCount=" + this.f2909b + " " + this);
            }
        }
    }

    /* renamed from: m */
    public boolean m3232m() {
        boolean z10;
        synchronized (this.f2908a) {
            z10 = this.f2910c;
        }
        return z10;
    }

    /* renamed from: r */
    protected abstract InterfaceFutureC5920f<Surface> mo2981r();

    /* renamed from: s */
    public void m3233s(Class<?> cls) {
        this.f2917j = cls;
    }
}
