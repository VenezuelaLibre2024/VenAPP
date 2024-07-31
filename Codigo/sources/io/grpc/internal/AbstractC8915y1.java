package io.grpc.internal;

import io.grpc.internal.InterfaceC8864j2;
import io.grpc.internal.InterfaceC8892r;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p082eb.C7155k;
import p082eb.C7159o;
import vi.AbstractC11925k;
import vi.C11915g1;
import vi.C11946t;
import vi.C11950v;
import vi.C11953w0;
import vi.C11955x0;
import vi.ExecutorC11927k1;
import vi.InterfaceC11934n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.grpc.internal.y1 */
/* loaded from: classes3.dex */
public abstract class AbstractC8915y1<ReqT> implements InterfaceC8889q {

    /* renamed from: A */
    static final C11953w0.g<String> f21013A;

    /* renamed from: B */
    static final C11953w0.g<String> f21014B;

    /* renamed from: C */
    private static final C11915g1 f21015C;

    /* renamed from: D */
    private static Random f21016D;

    /* renamed from: a */
    private final C11955x0<ReqT, ?> f21017a;

    /* renamed from: b */
    private final Executor f21018b;

    /* renamed from: d */
    private final ScheduledExecutorService f21020d;

    /* renamed from: e */
    private final C11953w0 f21021e;

    /* renamed from: f */
    private final C8918z1 f21022f;

    /* renamed from: g */
    private final C8896s0 f21023g;

    /* renamed from: h */
    private final boolean f21024h;

    /* renamed from: j */
    private final t f21026j;

    /* renamed from: k */
    private final long f21027k;

    /* renamed from: l */
    private final long f21028l;

    /* renamed from: m */
    private final c0 f21029m;

    /* renamed from: s */
    private C11915g1 f21035s;

    /* renamed from: t */
    private long f21036t;

    /* renamed from: u */
    private InterfaceC8892r f21037u;

    /* renamed from: v */
    private u f21038v;

    /* renamed from: w */
    private u f21039w;

    /* renamed from: x */
    private long f21040x;

    /* renamed from: y */
    private C11915g1 f21041y;

    /* renamed from: z */
    private boolean f21042z;

    /* renamed from: c */
    private final Executor f21019c = new ExecutorC11927k1(new a());

    /* renamed from: i */
    private final Object f21025i = new Object();

    /* renamed from: n */
    private final C8908w0 f21030n = new C8908w0();

    /* renamed from: o */
    private volatile z f21031o = new z(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);

    /* renamed from: p */
    private final AtomicBoolean f21032p = new AtomicBoolean();

    /* renamed from: q */
    private final AtomicInteger f21033q = new AtomicInteger();

    /* renamed from: r */
    private final AtomicInteger f21034r = new AtomicInteger();

    /* renamed from: io.grpc.internal.y1$a */
    /* loaded from: classes3.dex */
    class a implements Thread.UncaughtExceptionHandler {
        a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            throw C11915g1.m38137l(th2).m38147r("Uncaught exception in the SynchronizationContext. Re-thrown.").m38139d();
        }
    }

    /* renamed from: io.grpc.internal.y1$a0 */
    /* loaded from: classes3.dex */
    private final class a0 implements InterfaceC8892r {

        /* renamed from: a */
        final b0 f21044a;

        /* renamed from: io.grpc.internal.y1$a0$a */
        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C11953w0 f21046a;

            a(C11953w0 c11953w0) {
                this.f21046a = c11953w0;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC8915y1.this.f21037u.mo25291b(this.f21046a);
            }
        }

        /* renamed from: io.grpc.internal.y1$a0$b */
        /* loaded from: classes3.dex */
        class b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ b0 f21048a;

            /* renamed from: io.grpc.internal.y1$a0$b$a */
            /* loaded from: classes3.dex */
            class a implements Runnable {
                a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    b bVar = b.this;
                    AbstractC8915y1.this.m25977f0(bVar.f21048a);
                }
            }

            b(b0 b0Var) {
                this.f21048a = b0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC8915y1.this.f21018b.execute(new a());
            }
        }

        /* renamed from: io.grpc.internal.y1$a0$c */
        /* loaded from: classes3.dex */
        class c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ b0 f21051a;

            c(b0 b0Var) {
                this.f21051a = b0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC8915y1.this.m25977f0(this.f21051a);
            }
        }

        /* renamed from: io.grpc.internal.y1$a0$d */
        /* loaded from: classes3.dex */
        class d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ InterfaceC8864j2.a f21053a;

            d(InterfaceC8864j2.a aVar) {
                this.f21053a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC8915y1.this.f21037u.mo25290a(this.f21053a);
            }
        }

        /* renamed from: io.grpc.internal.y1$a0$e */
        /* loaded from: classes3.dex */
        class e implements Runnable {
            e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (AbstractC8915y1.this.f21042z) {
                    return;
                }
                AbstractC8915y1.this.f21037u.mo25292c();
            }
        }

        a0(b0 b0Var) {
            this.f21044a = b0Var;
        }

        /* renamed from: e */
        private Integer m25995e(C11953w0 c11953w0) {
            String str = (String) c11953w0.m38310g(AbstractC8915y1.f21014B);
            if (str == null) {
                return null;
            }
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        /* renamed from: f */
        private v m25996f(C11915g1 c11915g1, C11953w0 c11953w0) {
            Integer m25995e = m25995e(c11953w0);
            boolean z10 = !AbstractC8915y1.this.f21023g.f20883c.contains(c11915g1.m38143n());
            return new v((z10 || ((AbstractC8915y1.this.f21029m == null || (z10 && (m25995e == null || m25995e.intValue() >= 0))) ? false : AbstractC8915y1.this.f21029m.m26000b() ^ true)) ? false : true, m25995e);
        }

        /* renamed from: g */
        private x m25997g(C11915g1 c11915g1, C11953w0 c11953w0) {
            AbstractC8915y1 abstractC8915y1;
            long j10;
            long j11 = 0;
            boolean z10 = false;
            if (AbstractC8915y1.this.f21022f == null) {
                return new x(false, 0L);
            }
            boolean contains = AbstractC8915y1.this.f21022f.f21168f.contains(c11915g1.m38143n());
            Integer m25995e = m25995e(c11953w0);
            boolean z11 = (AbstractC8915y1.this.f21029m == null || (!contains && (m25995e == null || m25995e.intValue() >= 0))) ? false : !AbstractC8915y1.this.f21029m.m26000b();
            if (AbstractC8915y1.this.f21022f.f21163a > this.f21044a.f21061d + 1 && !z11) {
                if (m25995e == null) {
                    if (contains) {
                        j11 = (long) (AbstractC8915y1.this.f21040x * AbstractC8915y1.f21016D.nextDouble());
                        abstractC8915y1 = AbstractC8915y1.this;
                        j10 = Math.min((long) (abstractC8915y1.f21040x * AbstractC8915y1.this.f21022f.f21166d), AbstractC8915y1.this.f21022f.f21165c);
                        abstractC8915y1.f21040x = j10;
                        z10 = true;
                    }
                } else if (m25995e.intValue() >= 0) {
                    j11 = TimeUnit.MILLISECONDS.toNanos(m25995e.intValue());
                    abstractC8915y1 = AbstractC8915y1.this;
                    j10 = abstractC8915y1.f21022f.f21164b;
                    abstractC8915y1.f21040x = j10;
                    z10 = true;
                }
            }
            return new x(z10, j11);
        }

        @Override // io.grpc.internal.InterfaceC8864j2
        /* renamed from: a */
        public void mo25290a(InterfaceC8864j2.a aVar) {
            z zVar = AbstractC8915y1.this.f21031o;
            C7159o.m21319v(zVar.f21118f != null, "Headers should be received prior to messages.");
            if (zVar.f21118f != this.f21044a) {
                return;
            }
            AbstractC8915y1.this.f21019c.execute(new d(aVar));
        }

        @Override // io.grpc.internal.InterfaceC8892r
        /* renamed from: b */
        public void mo25291b(C11953w0 c11953w0) {
            AbstractC8915y1.this.m25974c0(this.f21044a);
            if (AbstractC8915y1.this.f21031o.f21118f == this.f21044a) {
                if (AbstractC8915y1.this.f21029m != null) {
                    AbstractC8915y1.this.f21029m.m26001c();
                }
                AbstractC8915y1.this.f21019c.execute(new a(c11953w0));
            }
        }

        @Override // io.grpc.internal.InterfaceC8864j2
        /* renamed from: c */
        public void mo25292c() {
            if (AbstractC8915y1.this.mo25195d()) {
                AbstractC8915y1.this.f21019c.execute(new e());
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:103:0x01cd, code lost:
        
            if (r5.f21045b.f21022f.f21163a != 1) goto L95;
         */
        @Override // io.grpc.internal.InterfaceC8892r
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo25293d(vi.C11915g1 r6, io.grpc.internal.InterfaceC8892r.a r7, vi.C11953w0 r8) {
            /*
                Method dump skipped, instructions count: 511
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.AbstractC8915y1.a0.mo25293d(vi.g1, io.grpc.internal.r$a, vi.w0):void");
        }
    }

    /* renamed from: io.grpc.internal.y1$b */
    /* loaded from: classes3.dex */
    class b implements r {

        /* renamed from: a */
        final /* synthetic */ String f21056a;

        b(String str) {
            this.f21056a = str;
        }

        @Override // io.grpc.internal.AbstractC8915y1.r
        /* renamed from: a */
        public void mo25998a(b0 b0Var) {
            b0Var.f21058a.mo25286l(this.f21056a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.y1$b0 */
    /* loaded from: classes3.dex */
    public static final class b0 {

        /* renamed from: a */
        InterfaceC8889q f21058a;

        /* renamed from: b */
        boolean f21059b;

        /* renamed from: c */
        boolean f21060c;

        /* renamed from: d */
        final int f21061d;

        b0(int i10) {
            this.f21061d = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.y1$c */
    /* loaded from: classes3.dex */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Collection f21062a;

        /* renamed from: b */
        final /* synthetic */ b0 f21063b;

        /* renamed from: c */
        final /* synthetic */ Future f21064c;

        /* renamed from: d */
        final /* synthetic */ Future f21065d;

        c(Collection collection, b0 b0Var, Future future, Future future2) {
            this.f21062a = collection;
            this.f21063b = b0Var;
            this.f21064c = future;
            this.f21065d = future2;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (b0 b0Var : this.f21062a) {
                if (b0Var != this.f21063b) {
                    b0Var.f21058a.mo25194c(AbstractC8915y1.f21015C);
                }
            }
            Future future = this.f21064c;
            if (future != null) {
                future.cancel(false);
            }
            Future future2 = this.f21065d;
            if (future2 != null) {
                future2.cancel(false);
            }
            AbstractC8915y1.this.mo25530j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.y1$c0 */
    /* loaded from: classes3.dex */
    public static final class c0 {

        /* renamed from: a */
        final int f21067a;

        /* renamed from: b */
        final int f21068b;

        /* renamed from: c */
        final int f21069c;

        /* renamed from: d */
        final AtomicInteger f21070d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c0(float f10, float f11) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f21070d = atomicInteger;
            this.f21069c = (int) (f11 * 1000.0f);
            int i10 = (int) (f10 * 1000.0f);
            this.f21067a = i10;
            this.f21068b = i10 / 2;
            atomicInteger.set(i10);
        }

        /* renamed from: a */
        boolean m25999a() {
            return this.f21070d.get() > this.f21068b;
        }

        /* renamed from: b */
        boolean m26000b() {
            int i10;
            int i11;
            do {
                i10 = this.f21070d.get();
                if (i10 == 0) {
                    return false;
                }
                i11 = i10 - 1000;
            } while (!this.f21070d.compareAndSet(i10, Math.max(i11, 0)));
            return i11 > this.f21068b;
        }

        /* renamed from: c */
        void m26001c() {
            int i10;
            int i11;
            do {
                i10 = this.f21070d.get();
                i11 = this.f21067a;
                if (i10 == i11) {
                    return;
                }
            } while (!this.f21070d.compareAndSet(i10, Math.min(this.f21069c + i10, i11)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c0)) {
                return false;
            }
            c0 c0Var = (c0) obj;
            return this.f21067a == c0Var.f21067a && this.f21069c == c0Var.f21069c;
        }

        public int hashCode() {
            return C7155k.m21290b(Integer.valueOf(this.f21067a), Integer.valueOf(this.f21069c));
        }
    }

    /* renamed from: io.grpc.internal.y1$d */
    /* loaded from: classes3.dex */
    class d implements r {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11934n f21071a;

        d(InterfaceC11934n interfaceC11934n) {
            this.f21071a = interfaceC11934n;
        }

        @Override // io.grpc.internal.AbstractC8915y1.r
        /* renamed from: a */
        public void mo25998a(b0 b0Var) {
            b0Var.f21058a.mo25282a(this.f21071a);
        }
    }

    /* renamed from: io.grpc.internal.y1$e */
    /* loaded from: classes3.dex */
    class e implements r {

        /* renamed from: a */
        final /* synthetic */ C11946t f21073a;

        e(C11946t c11946t) {
            this.f21073a = c11946t;
        }

        @Override // io.grpc.internal.AbstractC8915y1.r
        /* renamed from: a */
        public void mo25998a(b0 b0Var) {
            b0Var.f21058a.mo25198g(this.f21073a);
        }
    }

    /* renamed from: io.grpc.internal.y1$f */
    /* loaded from: classes3.dex */
    class f implements r {

        /* renamed from: a */
        final /* synthetic */ C11950v f21075a;

        f(C11950v c11950v) {
            this.f21075a = c11950v;
        }

        @Override // io.grpc.internal.AbstractC8915y1.r
        /* renamed from: a */
        public void mo25998a(b0 b0Var) {
            b0Var.f21058a.mo25200k(this.f21075a);
        }
    }

    /* renamed from: io.grpc.internal.y1$g */
    /* loaded from: classes3.dex */
    class g implements r {
        g() {
        }

        @Override // io.grpc.internal.AbstractC8915y1.r
        /* renamed from: a */
        public void mo25998a(b0 b0Var) {
            b0Var.f21058a.flush();
        }
    }

    /* renamed from: io.grpc.internal.y1$h */
    /* loaded from: classes3.dex */
    class h implements r {

        /* renamed from: a */
        final /* synthetic */ boolean f21078a;

        h(boolean z10) {
            this.f21078a = z10;
        }

        @Override // io.grpc.internal.AbstractC8915y1.r
        /* renamed from: a */
        public void mo25998a(b0 b0Var) {
            b0Var.f21058a.mo25199j(this.f21078a);
        }
    }

    /* renamed from: io.grpc.internal.y1$i */
    /* loaded from: classes3.dex */
    class i implements r {
        i() {
        }

        @Override // io.grpc.internal.AbstractC8915y1.r
        /* renamed from: a */
        public void mo25998a(b0 b0Var) {
            b0Var.f21058a.mo25202n();
        }
    }

    /* renamed from: io.grpc.internal.y1$j */
    /* loaded from: classes3.dex */
    class j implements r {

        /* renamed from: a */
        final /* synthetic */ int f21081a;

        j(int i10) {
            this.f21081a = i10;
        }

        @Override // io.grpc.internal.AbstractC8915y1.r
        /* renamed from: a */
        public void mo25998a(b0 b0Var) {
            b0Var.f21058a.mo25196e(this.f21081a);
        }
    }

    /* renamed from: io.grpc.internal.y1$k */
    /* loaded from: classes3.dex */
    class k implements r {

        /* renamed from: a */
        final /* synthetic */ int f21083a;

        k(int i10) {
            this.f21083a = i10;
        }

        @Override // io.grpc.internal.AbstractC8915y1.r
        /* renamed from: a */
        public void mo25998a(b0 b0Var) {
            b0Var.f21058a.mo25197f(this.f21083a);
        }
    }

    /* renamed from: io.grpc.internal.y1$l */
    /* loaded from: classes3.dex */
    class l implements r {
        l() {
        }

        @Override // io.grpc.internal.AbstractC8915y1.r
        /* renamed from: a */
        public void mo25998a(b0 b0Var) {
            b0Var.f21058a.mo25285i();
        }
    }

    /* renamed from: io.grpc.internal.y1$m */
    /* loaded from: classes3.dex */
    class m implements r {

        /* renamed from: a */
        final /* synthetic */ int f21086a;

        m(int i10) {
            this.f21086a = i10;
        }

        @Override // io.grpc.internal.AbstractC8915y1.r
        /* renamed from: a */
        public void mo25998a(b0 b0Var) {
            b0Var.f21058a.mo25283b(this.f21086a);
        }
    }

    /* renamed from: io.grpc.internal.y1$n */
    /* loaded from: classes3.dex */
    class n implements r {

        /* renamed from: a */
        final /* synthetic */ Object f21088a;

        n(Object obj) {
            this.f21088a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.grpc.internal.AbstractC8915y1.r
        /* renamed from: a */
        public void mo25998a(b0 b0Var) {
            b0Var.f21058a.mo25284h(AbstractC8915y1.this.f21017a.m38346j(this.f21088a));
            b0Var.f21058a.flush();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.y1$o */
    /* loaded from: classes3.dex */
    public class o extends AbstractC11925k.a {

        /* renamed from: a */
        final /* synthetic */ AbstractC11925k f21090a;

        o(AbstractC11925k abstractC11925k) {
            this.f21090a = abstractC11925k;
        }

        @Override // vi.AbstractC11925k.a
        /* renamed from: a */
        public AbstractC11925k mo9634a(AbstractC11925k.b bVar, C11953w0 c11953w0) {
            return this.f21090a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.y1$p */
    /* loaded from: classes3.dex */
    public class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC8915y1.this.f21042z) {
                return;
            }
            AbstractC8915y1.this.f21037u.mo25292c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.y1$q */
    /* loaded from: classes3.dex */
    public class q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11915g1 f21093a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC8892r.a f21094b;

        /* renamed from: c */
        final /* synthetic */ C11953w0 f21095c;

        q(C11915g1 c11915g1, InterfaceC8892r.a aVar, C11953w0 c11953w0) {
            this.f21093a = c11915g1;
            this.f21094b = aVar;
            this.f21095c = c11953w0;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC8915y1.this.f21042z = true;
            AbstractC8915y1.this.f21037u.mo25293d(this.f21093a, this.f21094b, this.f21095c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.y1$r */
    /* loaded from: classes3.dex */
    public interface r {
        /* renamed from: a */
        void mo25998a(b0 b0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.y1$s */
    /* loaded from: classes3.dex */
    public class s extends AbstractC11925k {

        /* renamed from: a */
        private final b0 f21097a;

        /* renamed from: b */
        long f21098b;

        s(b0 b0Var) {
            this.f21097a = b0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0073 A[Catch: all -> 0x0084, TryCatch #0 {, blocks: (B:8:0x0012, B:10:0x001c, B:13:0x0023, B:15:0x0032, B:17:0x0034, B:19:0x0041, B:20:0x0043, B:21:0x006d, B:23:0x0073, B:24:0x007b, B:30:0x0046, B:32:0x006a, B:33:0x0082), top: B:7:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
        @Override // vi.AbstractC11924j1
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo26002h(long r6) {
            /*
                r5 = this;
                io.grpc.internal.y1 r0 = io.grpc.internal.AbstractC8915y1.this
                io.grpc.internal.y1$z r0 = io.grpc.internal.AbstractC8915y1.m25961P(r0)
                io.grpc.internal.y1$b0 r0 = r0.f21118f
                if (r0 == 0) goto Lb
                return
            Lb:
                io.grpc.internal.y1 r0 = io.grpc.internal.AbstractC8915y1.this
                java.lang.Object r0 = io.grpc.internal.AbstractC8915y1.m25968W(r0)
                monitor-enter(r0)
                io.grpc.internal.y1 r1 = io.grpc.internal.AbstractC8915y1.this     // Catch: java.lang.Throwable -> L84
                io.grpc.internal.y1$z r1 = io.grpc.internal.AbstractC8915y1.m25961P(r1)     // Catch: java.lang.Throwable -> L84
                io.grpc.internal.y1$b0 r1 = r1.f21118f     // Catch: java.lang.Throwable -> L84
                if (r1 != 0) goto L82
                io.grpc.internal.y1$b0 r1 = r5.f21097a     // Catch: java.lang.Throwable -> L84
                boolean r1 = r1.f21059b     // Catch: java.lang.Throwable -> L84
                if (r1 == 0) goto L23
                goto L82
            L23:
                long r1 = r5.f21098b     // Catch: java.lang.Throwable -> L84
                long r1 = r1 + r6
                r5.f21098b = r1     // Catch: java.lang.Throwable -> L84
                io.grpc.internal.y1 r6 = io.grpc.internal.AbstractC8915y1.this     // Catch: java.lang.Throwable -> L84
                long r6 = io.grpc.internal.AbstractC8915y1.m25959N(r6)     // Catch: java.lang.Throwable -> L84
                int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r6 > 0) goto L34
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
                return
            L34:
                long r6 = r5.f21098b     // Catch: java.lang.Throwable -> L84
                io.grpc.internal.y1 r1 = io.grpc.internal.AbstractC8915y1.this     // Catch: java.lang.Throwable -> L84
                long r1 = io.grpc.internal.AbstractC8915y1.m25962Q(r1)     // Catch: java.lang.Throwable -> L84
                int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                r7 = 1
                if (r6 <= 0) goto L46
                io.grpc.internal.y1$b0 r6 = r5.f21097a     // Catch: java.lang.Throwable -> L84
            L43:
                r6.f21060c = r7     // Catch: java.lang.Throwable -> L84
                goto L6d
            L46:
                io.grpc.internal.y1 r6 = io.grpc.internal.AbstractC8915y1.this     // Catch: java.lang.Throwable -> L84
                io.grpc.internal.y1$t r6 = io.grpc.internal.AbstractC8915y1.m25964S(r6)     // Catch: java.lang.Throwable -> L84
                long r1 = r5.f21098b     // Catch: java.lang.Throwable -> L84
                io.grpc.internal.y1 r3 = io.grpc.internal.AbstractC8915y1.this     // Catch: java.lang.Throwable -> L84
                long r3 = io.grpc.internal.AbstractC8915y1.m25959N(r3)     // Catch: java.lang.Throwable -> L84
                long r1 = r1 - r3
                long r1 = r6.m26003a(r1)     // Catch: java.lang.Throwable -> L84
                io.grpc.internal.y1 r6 = io.grpc.internal.AbstractC8915y1.this     // Catch: java.lang.Throwable -> L84
                long r3 = r5.f21098b     // Catch: java.lang.Throwable -> L84
                io.grpc.internal.AbstractC8915y1.m25960O(r6, r3)     // Catch: java.lang.Throwable -> L84
                io.grpc.internal.y1 r6 = io.grpc.internal.AbstractC8915y1.this     // Catch: java.lang.Throwable -> L84
                long r3 = io.grpc.internal.AbstractC8915y1.m25965T(r6)     // Catch: java.lang.Throwable -> L84
                int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r6 <= 0) goto L6d
                io.grpc.internal.y1$b0 r6 = r5.f21097a     // Catch: java.lang.Throwable -> L84
                goto L43
            L6d:
                io.grpc.internal.y1$b0 r6 = r5.f21097a     // Catch: java.lang.Throwable -> L84
                boolean r7 = r6.f21060c     // Catch: java.lang.Throwable -> L84
                if (r7 == 0) goto L7a
                io.grpc.internal.y1 r7 = io.grpc.internal.AbstractC8915y1.this     // Catch: java.lang.Throwable -> L84
                java.lang.Runnable r6 = io.grpc.internal.AbstractC8915y1.m25966U(r7, r6)     // Catch: java.lang.Throwable -> L84
                goto L7b
            L7a:
                r6 = 0
            L7b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
                if (r6 == 0) goto L81
                r6.run()
            L81:
                return
            L82:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
                return
            L84:
                r6 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.AbstractC8915y1.s.mo26002h(long):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.y1$t */
    /* loaded from: classes3.dex */
    public static final class t {

        /* renamed from: a */
        private final AtomicLong f21100a = new AtomicLong();

        /* renamed from: a */
        long m26003a(long j10) {
            return this.f21100a.addAndGet(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.y1$u */
    /* loaded from: classes3.dex */
    public static final class u {

        /* renamed from: a */
        final Object f21101a;

        /* renamed from: b */
        Future<?> f21102b;

        /* renamed from: c */
        boolean f21103c;

        u(Object obj) {
            this.f21101a = obj;
        }

        /* renamed from: a */
        boolean m26004a() {
            return this.f21103c;
        }

        /* renamed from: b */
        Future<?> m26005b() {
            this.f21103c = true;
            return this.f21102b;
        }

        /* renamed from: c */
        void m26006c(Future<?> future) {
            synchronized (this.f21101a) {
                if (!this.f21103c) {
                    this.f21102b = future;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.y1$v */
    /* loaded from: classes3.dex */
    public static final class v {

        /* renamed from: a */
        final boolean f21104a;

        /* renamed from: b */
        final Integer f21105b;

        public v(boolean z10, Integer num) {
            this.f21104a = z10;
            this.f21105b = num;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.y1$w */
    /* loaded from: classes3.dex */
    public final class w implements Runnable {

        /* renamed from: a */
        final u f21106a;

        /* renamed from: io.grpc.internal.y1$w$a */
        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ b0 f21108a;

            a(b0 b0Var) {
                this.f21108a = b0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                u uVar;
                AbstractC8915y1 abstractC8915y1;
                boolean z10;
                synchronized (AbstractC8915y1.this.f21025i) {
                    uVar = null;
                    if (w.this.f21106a.m26004a()) {
                        z10 = true;
                    } else {
                        AbstractC8915y1 abstractC8915y12 = AbstractC8915y1.this;
                        abstractC8915y12.f21031o = abstractC8915y12.f21031o.m26007a(this.f21108a);
                        AbstractC8915y1 abstractC8915y13 = AbstractC8915y1.this;
                        if (abstractC8915y13.m25979h0(abstractC8915y13.f21031o) && (AbstractC8915y1.this.f21029m == null || AbstractC8915y1.this.f21029m.m25999a())) {
                            abstractC8915y1 = AbstractC8915y1.this;
                            uVar = new u(abstractC8915y1.f21025i);
                        } else {
                            AbstractC8915y1 abstractC8915y14 = AbstractC8915y1.this;
                            abstractC8915y14.f21031o = abstractC8915y14.f21031o.m26010d();
                            abstractC8915y1 = AbstractC8915y1.this;
                        }
                        abstractC8915y1.f21039w = uVar;
                        z10 = false;
                    }
                }
                if (z10) {
                    this.f21108a.f21058a.mo25194c(C11915g1.f31535g.m38147r("Unneeded hedging"));
                    return;
                }
                if (uVar != null) {
                    uVar.m26006c(AbstractC8915y1.this.f21020d.schedule(new w(uVar), AbstractC8915y1.this.f21023g.f20882b, TimeUnit.NANOSECONDS));
                }
                AbstractC8915y1.this.m25977f0(this.f21108a);
            }
        }

        w(u uVar) {
            this.f21106a = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC8915y1 abstractC8915y1 = AbstractC8915y1.this;
            b0 m25975d0 = abstractC8915y1.m25975d0(abstractC8915y1.f21031o.f21117e, false);
            if (m25975d0 == null) {
                return;
            }
            AbstractC8915y1.this.f21018b.execute(new a(m25975d0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.y1$x */
    /* loaded from: classes3.dex */
    public static final class x {

        /* renamed from: a */
        final boolean f21110a;

        /* renamed from: b */
        final long f21111b;

        x(boolean z10, long j10) {
            this.f21110a = z10;
            this.f21111b = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.y1$y */
    /* loaded from: classes3.dex */
    public class y implements r {
        y() {
        }

        @Override // io.grpc.internal.AbstractC8915y1.r
        /* renamed from: a */
        public void mo25998a(b0 b0Var) {
            b0Var.f21058a.mo25203o(new a0(b0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.y1$z */
    /* loaded from: classes3.dex */
    public static final class z {

        /* renamed from: a */
        final boolean f21113a;

        /* renamed from: b */
        final List<r> f21114b;

        /* renamed from: c */
        final Collection<b0> f21115c;

        /* renamed from: d */
        final Collection<b0> f21116d;

        /* renamed from: e */
        final int f21117e;

        /* renamed from: f */
        final b0 f21118f;

        /* renamed from: g */
        final boolean f21119g;

        /* renamed from: h */
        final boolean f21120h;

        z(List<r> list, Collection<b0> collection, Collection<b0> collection2, b0 b0Var, boolean z10, boolean z11, boolean z12, int i10) {
            this.f21114b = list;
            this.f21115c = (Collection) C7159o.m21313p(collection, "drainedSubstreams");
            this.f21118f = b0Var;
            this.f21116d = collection2;
            this.f21119g = z10;
            this.f21113a = z11;
            this.f21120h = z12;
            this.f21117e = i10;
            C7159o.m21319v(!z11 || list == null, "passThrough should imply buffer is null");
            C7159o.m21319v((z11 && b0Var == null) ? false : true, "passThrough should imply winningSubstream != null");
            C7159o.m21319v(!z11 || (collection.size() == 1 && collection.contains(b0Var)) || (collection.size() == 0 && b0Var.f21059b), "passThrough should imply winningSubstream is drained");
            C7159o.m21319v((z10 && b0Var == null) ? false : true, "cancelled should imply committed");
        }

        /* renamed from: a */
        z m26007a(b0 b0Var) {
            Collection unmodifiableCollection;
            C7159o.m21319v(!this.f21120h, "hedging frozen");
            C7159o.m21319v(this.f21118f == null, "already committed");
            if (this.f21116d == null) {
                unmodifiableCollection = Collections.singleton(b0Var);
            } else {
                ArrayList arrayList = new ArrayList(this.f21116d);
                arrayList.add(b0Var);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            return new z(this.f21114b, this.f21115c, unmodifiableCollection, this.f21118f, this.f21119g, this.f21113a, this.f21120h, this.f21117e + 1);
        }

        /* renamed from: b */
        z m26008b() {
            return new z(this.f21114b, this.f21115c, this.f21116d, this.f21118f, true, this.f21113a, this.f21120h, this.f21117e);
        }

        /* renamed from: c */
        z m26009c(b0 b0Var) {
            List<r> list;
            Collection emptyList;
            boolean z10;
            C7159o.m21319v(this.f21118f == null, "Already committed");
            List<r> list2 = this.f21114b;
            if (this.f21115c.contains(b0Var)) {
                emptyList = Collections.singleton(b0Var);
                z10 = true;
                list = null;
            } else {
                list = list2;
                emptyList = Collections.emptyList();
                z10 = false;
            }
            return new z(list, emptyList, this.f21116d, b0Var, this.f21119g, z10, this.f21120h, this.f21117e);
        }

        /* renamed from: d */
        z m26010d() {
            return this.f21120h ? this : new z(this.f21114b, this.f21115c, this.f21116d, this.f21118f, this.f21119g, this.f21113a, true, this.f21117e);
        }

        /* renamed from: e */
        z m26011e(b0 b0Var) {
            ArrayList arrayList = new ArrayList(this.f21116d);
            arrayList.remove(b0Var);
            return new z(this.f21114b, this.f21115c, Collections.unmodifiableCollection(arrayList), this.f21118f, this.f21119g, this.f21113a, this.f21120h, this.f21117e);
        }

        /* renamed from: f */
        z m26012f(b0 b0Var, b0 b0Var2) {
            ArrayList arrayList = new ArrayList(this.f21116d);
            arrayList.remove(b0Var);
            arrayList.add(b0Var2);
            return new z(this.f21114b, this.f21115c, Collections.unmodifiableCollection(arrayList), this.f21118f, this.f21119g, this.f21113a, this.f21120h, this.f21117e);
        }

        /* renamed from: g */
        z m26013g(b0 b0Var) {
            b0Var.f21059b = true;
            if (!this.f21115c.contains(b0Var)) {
                return this;
            }
            ArrayList arrayList = new ArrayList(this.f21115c);
            arrayList.remove(b0Var);
            return new z(this.f21114b, Collections.unmodifiableCollection(arrayList), this.f21116d, this.f21118f, this.f21119g, this.f21113a, this.f21120h, this.f21117e);
        }

        /* renamed from: h */
        z m26014h(b0 b0Var) {
            Collection unmodifiableCollection;
            C7159o.m21319v(!this.f21113a, "Already passThrough");
            if (b0Var.f21059b) {
                unmodifiableCollection = this.f21115c;
            } else if (this.f21115c.isEmpty()) {
                unmodifiableCollection = Collections.singletonList(b0Var);
            } else {
                ArrayList arrayList = new ArrayList(this.f21115c);
                arrayList.add(b0Var);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            Collection collection = unmodifiableCollection;
            b0 b0Var2 = this.f21118f;
            boolean z10 = b0Var2 != null;
            List<r> list = this.f21114b;
            if (z10) {
                C7159o.m21319v(b0Var2 == b0Var, "Another RPC attempt has already committed");
                list = null;
            }
            return new z(list, collection, this.f21116d, this.f21118f, this.f21119g, z10, this.f21120h, this.f21117e);
        }
    }

    static {
        C11953w0.d<String> dVar = C11953w0.f31660e;
        f21013A = C11953w0.g.m38322e("grpc-previous-rpc-attempts", dVar);
        f21014B = C11953w0.g.m38322e("grpc-retry-pushback-ms", dVar);
        f21015C = C11915g1.f31535g.m38147r("Stream thrown away because RetriableStream committed");
        f21016D = new Random();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8915y1(C11955x0<ReqT, ?> c11955x0, C11953w0 c11953w0, t tVar, long j10, long j11, Executor executor, ScheduledExecutorService scheduledExecutorService, C8918z1 c8918z1, C8896s0 c8896s0, c0 c0Var) {
        this.f21017a = c11955x0;
        this.f21026j = tVar;
        this.f21027k = j10;
        this.f21028l = j11;
        this.f21018b = executor;
        this.f21020d = scheduledExecutorService;
        this.f21021e = c11953w0;
        this.f21022f = c8918z1;
        if (c8918z1 != null) {
            this.f21040x = c8918z1.f21164b;
        }
        this.f21023g = c8896s0;
        C7159o.m21302e(c8918z1 == null || c8896s0 == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.f21024h = c8896s0 != null;
        this.f21029m = c0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public Runnable m25973b0(b0 b0Var) {
        Future<?> future;
        Future<?> future2;
        synchronized (this.f21025i) {
            if (this.f21031o.f21118f != null) {
                return null;
            }
            Collection<b0> collection = this.f21031o.f21115c;
            this.f21031o = this.f21031o.m26009c(b0Var);
            this.f21026j.m26003a(-this.f21036t);
            u uVar = this.f21038v;
            if (uVar != null) {
                Future<?> m26005b = uVar.m26005b();
                this.f21038v = null;
                future = m26005b;
            } else {
                future = null;
            }
            u uVar2 = this.f21039w;
            if (uVar2 != null) {
                Future<?> m26005b2 = uVar2.m26005b();
                this.f21039w = null;
                future2 = m26005b2;
            } else {
                future2 = null;
            }
            return new c(collection, b0Var, future, future2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public void m25974c0(b0 b0Var) {
        Runnable m25973b0 = m25973b0(b0Var);
        if (m25973b0 != null) {
            m25973b0.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public b0 m25975d0(int i10, boolean z10) {
        int i11;
        do {
            i11 = this.f21034r.get();
            if (i11 < 0) {
                return null;
            }
        } while (!this.f21034r.compareAndSet(i11, i11 + 1));
        b0 b0Var = new b0(i10);
        b0Var.f21058a = mo25529i0(m25994o0(this.f21021e, i10), new o(new s(b0Var)), i10, z10);
        return b0Var;
    }

    /* renamed from: e0 */
    private void m25976e0(r rVar) {
        Collection<b0> collection;
        synchronized (this.f21025i) {
            if (!this.f21031o.f21113a) {
                this.f21031o.f21114b.add(rVar);
            }
            collection = this.f21031o.f21115c;
        }
        Iterator<b0> it = collection.iterator();
        while (it.hasNext()) {
            rVar.mo25998a(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        r8.f21019c.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r0 = r9.f21058a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r8.f21031o.f21118f != r9) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        r9 = r8.f21041y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        r0.mo25194c(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        r9 = io.grpc.internal.AbstractC8915y1.f21015C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        if (r2.hasNext() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        r4 = (io.grpc.internal.AbstractC8915y1.r) r2.next();
        r4.mo25998a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008f, code lost:
    
        if ((r4 instanceof io.grpc.internal.AbstractC8915y1.y) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        if (r0 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0094, code lost:
    
        r4 = r8.f21031o;
        r5 = r4.f21118f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        if (r5 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        if (r5 == r9) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        if (r4.f21119g == false) goto L69;
     */
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m25977f0(io.grpc.internal.AbstractC8915y1.b0 r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L4:
            java.lang.Object r4 = r8.f21025i
            monitor-enter(r4)
            io.grpc.internal.y1$z r5 = r8.f21031o     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L18
            io.grpc.internal.y1$b0 r6 = r5.f21118f     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L13
            if (r6 == r9) goto L13
        L11:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La4
            goto L34
        L13:
            boolean r6 = r5.f21119g     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L18
            goto L11
        L18:
            java.util.List<io.grpc.internal.y1$r> r6 = r5.f21114b     // Catch: java.lang.Throwable -> La4
            int r6 = r6.size()     // Catch: java.lang.Throwable -> La4
            if (r2 != r6) goto L4d
            io.grpc.internal.y1$z r0 = r5.m26014h(r9)     // Catch: java.lang.Throwable -> La4
            r8.f21031o = r0     // Catch: java.lang.Throwable -> La4
            boolean r0 = r8.mo25195d()     // Catch: java.lang.Throwable -> La4
            if (r0 != 0) goto L2e
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La4
            return
        L2e:
            io.grpc.internal.y1$p r1 = new io.grpc.internal.y1$p     // Catch: java.lang.Throwable -> La4
            r1.<init>()     // Catch: java.lang.Throwable -> La4
            goto L11
        L34:
            if (r1 == 0) goto L3c
            java.util.concurrent.Executor r9 = r8.f21019c
            r9.execute(r1)
            return
        L3c:
            io.grpc.internal.q r0 = r9.f21058a
            io.grpc.internal.y1$z r1 = r8.f21031o
            io.grpc.internal.y1$b0 r1 = r1.f21118f
            if (r1 != r9) goto L47
            vi.g1 r9 = r8.f21041y
            goto L49
        L47:
            vi.g1 r9 = io.grpc.internal.AbstractC8915y1.f21015C
        L49:
            r0.mo25194c(r9)
            return
        L4d:
            boolean r6 = r9.f21059b     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L53
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La4
            return
        L53:
            int r6 = r2 + 128
            java.util.List<io.grpc.internal.y1$r> r7 = r5.f21114b     // Catch: java.lang.Throwable -> La4
            int r7 = r7.size()     // Catch: java.lang.Throwable -> La4
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> La4
            if (r3 != 0) goto L6d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La4
            java.util.List<io.grpc.internal.y1$r> r5 = r5.f21114b     // Catch: java.lang.Throwable -> La4
            java.util.List r2 = r5.subList(r2, r6)     // Catch: java.lang.Throwable -> La4
            r3.<init>(r2)     // Catch: java.lang.Throwable -> La4
            goto L79
        L6d:
            r3.clear()     // Catch: java.lang.Throwable -> La4
            java.util.List<io.grpc.internal.y1$r> r5 = r5.f21114b     // Catch: java.lang.Throwable -> La4
            java.util.List r2 = r5.subList(r2, r6)     // Catch: java.lang.Throwable -> La4
            r3.addAll(r2)     // Catch: java.lang.Throwable -> La4
        L79:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La4
            java.util.Iterator r2 = r3.iterator()
        L7e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto La1
            java.lang.Object r4 = r2.next()
            io.grpc.internal.y1$r r4 = (io.grpc.internal.AbstractC8915y1.r) r4
            r4.mo25998a(r9)
            boolean r4 = r4 instanceof io.grpc.internal.AbstractC8915y1.y
            if (r4 == 0) goto L92
            r0 = 1
        L92:
            if (r0 == 0) goto L7e
            io.grpc.internal.y1$z r4 = r8.f21031o
            io.grpc.internal.y1$b0 r5 = r4.f21118f
            if (r5 == 0) goto L9d
            if (r5 == r9) goto L9d
            goto La1
        L9d:
            boolean r4 = r4.f21119g
            if (r4 == 0) goto L7e
        La1:
            r2 = r6
            goto L4
        La4:
            r9 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La4
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.AbstractC8915y1.m25977f0(io.grpc.internal.y1$b0):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public void m25978g0() {
        Future<?> future;
        synchronized (this.f21025i) {
            u uVar = this.f21039w;
            future = null;
            if (uVar != null) {
                Future<?> m26005b = uVar.m26005b();
                this.f21039w = null;
                future = m26005b;
            }
            this.f21031o = this.f21031o.m26010d();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public boolean m25979h0(z zVar) {
        return zVar.f21118f == null && zVar.f21117e < this.f21023g.f20881a && !zVar.f21120h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public void m25980l0(Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            m25978g0();
            return;
        }
        synchronized (this.f21025i) {
            u uVar = this.f21039w;
            if (uVar == null) {
                return;
            }
            Future<?> m26005b = uVar.m26005b();
            u uVar2 = new u(this.f21025i);
            this.f21039w = uVar2;
            if (m26005b != null) {
                m26005b.cancel(false);
            }
            uVar2.m26006c(this.f21020d.schedule(new w(uVar2), num.intValue(), TimeUnit.MILLISECONDS));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public void m25981m0(C11915g1 c11915g1, InterfaceC8892r.a aVar, C11953w0 c11953w0) {
        this.f21019c.execute(new q(c11915g1, aVar, c11953w0));
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    /* renamed from: a */
    public final void mo25282a(InterfaceC11934n interfaceC11934n) {
        m25976e0(new d(interfaceC11934n));
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    /* renamed from: b */
    public final void mo25283b(int i10) {
        z zVar = this.f21031o;
        if (zVar.f21113a) {
            zVar.f21118f.f21058a.mo25283b(i10);
        } else {
            m25976e0(new m(i10));
        }
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: c */
    public final void mo25194c(C11915g1 c11915g1) {
        b0 b0Var;
        b0 b0Var2 = new b0(0);
        b0Var2.f21058a = new C8879n1();
        Runnable m25973b0 = m25973b0(b0Var2);
        if (m25973b0 != null) {
            this.f21035s = c11915g1;
            m25973b0.run();
            if (this.f21034r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                m25981m0(c11915g1, InterfaceC8892r.a.PROCESSED, new C11953w0());
                return;
            }
            return;
        }
        synchronized (this.f21025i) {
            if (this.f21031o.f21115c.contains(this.f21031o.f21118f)) {
                b0Var = this.f21031o.f21118f;
            } else {
                this.f21041y = c11915g1;
                b0Var = null;
            }
            this.f21031o = this.f21031o.m26008b();
        }
        if (b0Var != null) {
            b0Var.f21058a.mo25194c(c11915g1);
        }
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    /* renamed from: d */
    public final boolean mo25195d() {
        Iterator<b0> it = this.f21031o.f21115c.iterator();
        while (it.hasNext()) {
            if (it.next().f21058a.mo25195d()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: e */
    public final void mo25196e(int i10) {
        m25976e0(new j(i10));
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: f */
    public final void mo25197f(int i10) {
        m25976e0(new k(i10));
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    public final void flush() {
        z zVar = this.f21031o;
        if (zVar.f21113a) {
            zVar.f21118f.f21058a.flush();
        } else {
            m25976e0(new g());
        }
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: g */
    public final void mo25198g(C11946t c11946t) {
        m25976e0(new e(c11946t));
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    /* renamed from: h */
    public final void mo25284h(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    /* renamed from: i */
    public void mo25285i() {
        m25976e0(new l());
    }

    /* renamed from: i0 */
    abstract InterfaceC8889q mo25529i0(C11953w0 c11953w0, AbstractC11925k.a aVar, int i10, boolean z10);

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: j */
    public final void mo25199j(boolean z10) {
        m25976e0(new h(z10));
    }

    /* renamed from: j0 */
    abstract void mo25530j0();

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: k */
    public final void mo25200k(C11950v c11950v) {
        m25976e0(new f(c11950v));
    }

    /* renamed from: k0 */
    abstract C11915g1 mo25531k0();

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: l */
    public final void mo25286l(String str) {
        m25976e0(new b(str));
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: m */
    public void mo25201m(C8908w0 c8908w0) {
        z zVar;
        C8908w0 c8908w02;
        String str;
        synchronized (this.f21025i) {
            c8908w0.m25876b("closed", this.f21030n);
            zVar = this.f21031o;
        }
        if (zVar.f21118f != null) {
            c8908w02 = new C8908w0();
            zVar.f21118f.f21058a.mo25201m(c8908w02);
            str = "committed";
        } else {
            c8908w02 = new C8908w0();
            for (b0 b0Var : zVar.f21115c) {
                C8908w0 c8908w03 = new C8908w0();
                b0Var.f21058a.mo25201m(c8908w03);
                c8908w02.m25875a(c8908w03);
            }
            str = "open";
        }
        c8908w0.m25876b(str, c8908w02);
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: n */
    public final void mo25202n() {
        m25976e0(new i());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n0 */
    public final void m25993n0(ReqT reqt) {
        z zVar = this.f21031o;
        if (zVar.f21113a) {
            zVar.f21118f.f21058a.mo25284h(this.f21017a.m38346j(reqt));
        } else {
            m25976e0(new n(reqt));
        }
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: o */
    public final void mo25203o(InterfaceC8892r interfaceC8892r) {
        u uVar;
        c0 c0Var;
        this.f21037u = interfaceC8892r;
        C11915g1 mo25531k0 = mo25531k0();
        if (mo25531k0 != null) {
            mo25194c(mo25531k0);
            return;
        }
        synchronized (this.f21025i) {
            this.f21031o.f21114b.add(new y());
        }
        b0 m25975d0 = m25975d0(0, false);
        if (m25975d0 == null) {
            return;
        }
        if (this.f21024h) {
            synchronized (this.f21025i) {
                this.f21031o = this.f21031o.m26007a(m25975d0);
                if (m25979h0(this.f21031o) && ((c0Var = this.f21029m) == null || c0Var.m25999a())) {
                    uVar = new u(this.f21025i);
                    this.f21039w = uVar;
                } else {
                    uVar = null;
                }
            }
            if (uVar != null) {
                uVar.m26006c(this.f21020d.schedule(new w(uVar), this.f21023g.f20882b, TimeUnit.NANOSECONDS));
            }
        }
        m25977f0(m25975d0);
    }

    /* renamed from: o0 */
    final C11953w0 m25994o0(C11953w0 c11953w0, int i10) {
        C11953w0 c11953w02 = new C11953w0();
        c11953w02.m38312l(c11953w0);
        if (i10 > 0) {
            c11953w02.m38313o(f21013A, String.valueOf(i10));
        }
        return c11953w02;
    }
}
