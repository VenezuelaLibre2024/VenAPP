package p322r1;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import ck.C2037v;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9998l;
import p391v1.InterfaceC11610i;
import p391v1.InterfaceC11611j;

/* renamed from: r1.c */
/* loaded from: classes.dex */
public final class C10582c {

    /* renamed from: m */
    public static final a f26620m = new a(null);

    /* renamed from: a */
    public InterfaceC11611j f26621a;

    /* renamed from: b */
    private final Handler f26622b;

    /* renamed from: c */
    private Runnable f26623c;

    /* renamed from: d */
    private final Object f26624d;

    /* renamed from: e */
    private long f26625e;

    /* renamed from: f */
    private final Executor f26626f;

    /* renamed from: g */
    private int f26627g;

    /* renamed from: h */
    private long f26628h;

    /* renamed from: i */
    private InterfaceC11610i f26629i;

    /* renamed from: j */
    private boolean f26630j;

    /* renamed from: k */
    private final Runnable f26631k;

    /* renamed from: l */
    private final Runnable f26632l;

    /* renamed from: r1.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C10582c(long j10, TimeUnit autoCloseTimeUnit, Executor autoCloseExecutor) {
        C9322n.m27781e(autoCloseTimeUnit, "autoCloseTimeUnit");
        C9322n.m27781e(autoCloseExecutor, "autoCloseExecutor");
        this.f26622b = new Handler(Looper.getMainLooper());
        this.f26624d = new Object();
        this.f26625e = autoCloseTimeUnit.toMillis(j10);
        this.f26626f = autoCloseExecutor;
        this.f26628h = SystemClock.uptimeMillis();
        this.f26631k = new Runnable() { // from class: r1.a
            @Override // java.lang.Runnable
            public final void run() {
                C10582c.m32118f(C10582c.this);
            }
        };
        this.f26632l = new Runnable() { // from class: r1.b
            @Override // java.lang.Runnable
            public final void run() {
                C10582c.m32117c(C10582c.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m32117c(C10582c this$0) {
        C2037v c2037v;
        C9322n.m27781e(this$0, "this$0");
        synchronized (this$0.f26624d) {
            if (SystemClock.uptimeMillis() - this$0.f26628h < this$0.f26625e) {
                return;
            }
            if (this$0.f26627g != 0) {
                return;
            }
            Runnable runnable = this$0.f26623c;
            if (runnable != null) {
                runnable.run();
                c2037v = C2037v.f8089a;
            } else {
                c2037v = null;
            }
            if (c2037v == null) {
                throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
            }
            InterfaceC11610i interfaceC11610i = this$0.f26629i;
            if (interfaceC11610i != null && interfaceC11610i.isOpen()) {
                interfaceC11610i.close();
            }
            this$0.f26629i = null;
            C2037v c2037v2 = C2037v.f8089a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m32118f(C10582c this$0) {
        C9322n.m27781e(this$0, "this$0");
        this$0.f26626f.execute(this$0.f26632l);
    }

    /* renamed from: d */
    public final void m32119d() {
        synchronized (this.f26624d) {
            this.f26630j = true;
            InterfaceC11610i interfaceC11610i = this.f26629i;
            if (interfaceC11610i != null) {
                interfaceC11610i.close();
            }
            this.f26629i = null;
            C2037v c2037v = C2037v.f8089a;
        }
    }

    /* renamed from: e */
    public final void m32120e() {
        synchronized (this.f26624d) {
            int i10 = this.f26627g;
            if (!(i10 > 0)) {
                throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement".toString());
            }
            int i11 = i10 - 1;
            this.f26627g = i11;
            if (i11 == 0) {
                if (this.f26629i == null) {
                    return;
                } else {
                    this.f26622b.postDelayed(this.f26631k, this.f26625e);
                }
            }
            C2037v c2037v = C2037v.f8089a;
        }
    }

    /* renamed from: g */
    public final <V> V m32121g(InterfaceC9998l<? super InterfaceC11610i, ? extends V> block) {
        C9322n.m27781e(block, "block");
        try {
            return block.invoke(m32124j());
        } finally {
            m32120e();
        }
    }

    /* renamed from: h */
    public final InterfaceC11610i m32122h() {
        return this.f26629i;
    }

    /* renamed from: i */
    public final InterfaceC11611j m32123i() {
        InterfaceC11611j interfaceC11611j = this.f26621a;
        if (interfaceC11611j != null) {
            return interfaceC11611j;
        }
        C9322n.m27792p("delegateOpenHelper");
        return null;
    }

    /* renamed from: j */
    public final InterfaceC11610i m32124j() {
        synchronized (this.f26624d) {
            this.f26622b.removeCallbacks(this.f26631k);
            this.f26627g++;
            if (!(!this.f26630j)) {
                throw new IllegalStateException("Attempting to open already closed database.".toString());
            }
            InterfaceC11610i interfaceC11610i = this.f26629i;
            if (interfaceC11610i != null && interfaceC11610i.isOpen()) {
                return interfaceC11610i;
            }
            InterfaceC11610i mo32112Q0 = m32123i().mo32112Q0();
            this.f26629i = mo32112Q0;
            return mo32112Q0;
        }
    }

    /* renamed from: k */
    public final void m32125k(InterfaceC11611j delegateOpenHelper) {
        C9322n.m27781e(delegateOpenHelper, "delegateOpenHelper");
        m32128n(delegateOpenHelper);
    }

    /* renamed from: l */
    public final boolean m32126l() {
        return !this.f26630j;
    }

    /* renamed from: m */
    public final void m32127m(Runnable onAutoClose) {
        C9322n.m27781e(onAutoClose, "onAutoClose");
        this.f26623c = onAutoClose;
    }

    /* renamed from: n */
    public final void m32128n(InterfaceC11611j interfaceC11611j) {
        C9322n.m27781e(interfaceC11611j, "<set-?>");
        this.f26621a = interfaceC11611j;
    }
}
