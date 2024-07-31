package t6;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.facebook.ads.AdError;
import com.google.common.collect.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import l7.a;
import q8.a0;
import t6.a3;
import t6.c2;
import t6.d4;
import t6.m3;
import t6.q3;
import t6.s;
import v7.a0;
import v7.y;
import x6.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q1 implements Handler.Callback, y.a, a0.a, a3.d, s.a, m3.a {
    private final ArrayList<d> A;
    private final t8.d B;
    private final f C;
    private final l2 D;
    private final a3 E;
    private final z1 F;
    private final long G;
    private u3 H;
    private g3 I;
    private e J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private int U;
    private h V;
    private long W;
    private int X;
    private boolean Y;
    private x Z;

    /* renamed from: a, reason: collision with root package name */
    private final q3[] f26383a;

    /* renamed from: a0, reason: collision with root package name */
    private long f26384a0;

    /* renamed from: b, reason: collision with root package name */
    private final Set<q3> f26385b;

    /* renamed from: b0, reason: collision with root package name */
    private long f26386b0 = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    private final r3[] f26387c;

    /* renamed from: d, reason: collision with root package name */
    private final q8.a0 f26388d;

    /* renamed from: e, reason: collision with root package name */
    private final q8.b0 f26389e;

    /* renamed from: f, reason: collision with root package name */
    private final a2 f26390f;

    /* renamed from: r, reason: collision with root package name */
    private final s8.e f26391r;

    /* renamed from: s, reason: collision with root package name */
    private final t8.o f26392s;

    /* renamed from: t, reason: collision with root package name */
    private final HandlerThread f26393t;

    /* renamed from: u, reason: collision with root package name */
    private final Looper f26394u;

    /* renamed from: v, reason: collision with root package name */
    private final d4.d f26395v;

    /* renamed from: w, reason: collision with root package name */
    private final d4.b f26396w;

    /* renamed from: x, reason: collision with root package name */
    private final long f26397x;

    /* renamed from: y, reason: collision with root package name */
    private final boolean f26398y;

    /* renamed from: z, reason: collision with root package name */
    private final s f26399z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements q3.a {
        a() {
        }

        @Override // t6.q3.a
        public void a() {
            q1.this.S = true;
        }

        @Override // t6.q3.a
        public void b() {
            q1.this.f26392s.i(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<a3.c> f26401a;

        /* renamed from: b, reason: collision with root package name */
        private final v7.x0 f26402b;

        /* renamed from: c, reason: collision with root package name */
        private final int f26403c;

        /* renamed from: d, reason: collision with root package name */
        private final long f26404d;

        private b(List<a3.c> list, v7.x0 x0Var, int i10, long j10) {
            this.f26401a = list;
            this.f26402b = x0Var;
            this.f26403c = i10;
            this.f26404d = j10;
        }

        /* synthetic */ b(List list, v7.x0 x0Var, int i10, long j10, a aVar) {
            this(list, x0Var, i10, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f26405a;

        /* renamed from: b, reason: collision with root package name */
        public final int f26406b;

        /* renamed from: c, reason: collision with root package name */
        public final int f26407c;

        /* renamed from: d, reason: collision with root package name */
        public final v7.x0 f26408d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d implements Comparable<d> {

        /* renamed from: a, reason: collision with root package name */
        public final m3 f26409a;

        /* renamed from: b, reason: collision with root package name */
        public int f26410b;

        /* renamed from: c, reason: collision with root package name */
        public long f26411c;

        /* renamed from: d, reason: collision with root package name */
        public Object f26412d;

        public d(m3 m3Var) {
            this.f26409a = m3Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f26412d;
            if ((obj == null) != (dVar.f26412d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f26410b - dVar.f26410b;
            return i10 != 0 ? i10 : t8.r0.o(this.f26411c, dVar.f26411c);
        }

        public void h(int i10, long j10, Object obj) {
            this.f26410b = i10;
            this.f26411c = j10;
            this.f26412d = obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private boolean f26413a;

        /* renamed from: b, reason: collision with root package name */
        public g3 f26414b;

        /* renamed from: c, reason: collision with root package name */
        public int f26415c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f26416d;

        /* renamed from: e, reason: collision with root package name */
        public int f26417e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f26418f;

        /* renamed from: g, reason: collision with root package name */
        public int f26419g;

        public e(g3 g3Var) {
            this.f26414b = g3Var;
        }

        public void b(int i10) {
            this.f26413a |= i10 > 0;
            this.f26415c += i10;
        }

        public void c(int i10) {
            this.f26413a = true;
            this.f26418f = true;
            this.f26419g = i10;
        }

        public void d(g3 g3Var) {
            this.f26413a |= this.f26414b != g3Var;
            this.f26414b = g3Var;
        }

        public void e(int i10) {
            if (this.f26416d && this.f26417e != 5) {
                t8.a.a(i10 == 5);
                return;
            }
            this.f26413a = true;
            this.f26416d = true;
            this.f26417e = i10;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(e eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final a0.b f26420a;

        /* renamed from: b, reason: collision with root package name */
        public final long f26421b;

        /* renamed from: c, reason: collision with root package name */
        public final long f26422c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f26423d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f26424e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f26425f;

        public g(a0.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f26420a = bVar;
            this.f26421b = j10;
            this.f26422c = j11;
            this.f26423d = z10;
            this.f26424e = z11;
            this.f26425f = z12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final d4 f26426a;

        /* renamed from: b, reason: collision with root package name */
        public final int f26427b;

        /* renamed from: c, reason: collision with root package name */
        public final long f26428c;

        public h(d4 d4Var, int i10, long j10) {
            this.f26426a = d4Var;
            this.f26427b = i10;
            this.f26428c = j10;
        }
    }

    public q1(q3[] q3VarArr, q8.a0 a0Var, q8.b0 b0Var, a2 a2Var, s8.e eVar, int i10, boolean z10, u6.a aVar, u3 u3Var, z1 z1Var, long j10, boolean z11, Looper looper, t8.d dVar, f fVar, u6.m3 m3Var, Looper looper2) {
        this.C = fVar;
        this.f26383a = q3VarArr;
        this.f26388d = a0Var;
        this.f26389e = b0Var;
        this.f26390f = a2Var;
        this.f26391r = eVar;
        this.P = i10;
        this.Q = z10;
        this.H = u3Var;
        this.F = z1Var;
        this.G = j10;
        this.f26384a0 = j10;
        this.L = z11;
        this.B = dVar;
        this.f26397x = a2Var.b();
        this.f26398y = a2Var.a();
        g3 j11 = g3.j(b0Var);
        this.I = j11;
        this.J = new e(j11);
        this.f26387c = new r3[q3VarArr.length];
        for (int i11 = 0; i11 < q3VarArr.length; i11++) {
            q3VarArr[i11].s(i11, m3Var);
            this.f26387c[i11] = q3VarArr[i11].u();
        }
        this.f26399z = new s(this, dVar);
        this.A = new ArrayList<>();
        this.f26385b = com.google.common.collect.c1.h();
        this.f26395v = new d4.d();
        this.f26396w = new d4.b();
        a0Var.b(this, eVar);
        this.Y = true;
        t8.o c10 = dVar.c(looper, null);
        this.D = new l2(aVar, c10);
        this.E = new a3(this, aVar, c10, m3Var);
        if (looper2 != null) {
            this.f26393t = null;
            this.f26394u = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.f26393t = handlerThread;
            handlerThread.start();
            this.f26394u = handlerThread.getLooper();
        }
        this.f26392s = dVar.c(this.f26394u, this);
    }

    private Pair<a0.b, Long> A(d4 d4Var) {
        if (d4Var.v()) {
            return Pair.create(g3.k(), 0L);
        }
        Pair<Object, Long> o10 = d4Var.o(this.f26395v, this.f26396w, d4Var.f(this.Q), -9223372036854775807L);
        a0.b B = this.D.B(d4Var, o10.first, 0L);
        long longValue = ((Long) o10.second).longValue();
        if (B.b()) {
            d4Var.m(B.f28543a, this.f26396w);
            longValue = B.f28545c == this.f26396w.o(B.f28544b) ? this.f26396w.k() : 0L;
        }
        return Pair.create(B, Long.valueOf(longValue));
    }

    private void B0(boolean z10) {
        a0.b bVar = this.D.p().f26190f.f26237a;
        long E0 = E0(bVar, this.I.f26112r, true, false);
        if (E0 != this.I.f26112r) {
            g3 g3Var = this.I;
            this.I = L(bVar, E0, g3Var.f26097c, g3Var.f26098d, z10, 5);
        }
    }

    private long C() {
        return D(this.I.f26110p);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ac A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:6:0x00a2, B:8:0x00ac, B:15:0x00b2, B:17:0x00b8, B:18:0x00bb, B:19:0x00c1, B:21:0x00cb, B:23:0x00d3, B:27:0x00db, B:28:0x00e5, B:30:0x00f5, B:34:0x00ff, B:37:0x0111, B:40:0x011a), top: B:5:0x00a2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void C0(t6.q1.h r19) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.q1.C0(t6.q1$h):void");
    }

    private long D(long j10) {
        i2 j11 = this.D.j();
        if (j11 == null) {
            return 0L;
        }
        return Math.max(0L, j10 - j11.y(this.W));
    }

    private long D0(a0.b bVar, long j10, boolean z10) {
        return E0(bVar, j10, this.D.p() != this.D.q(), z10);
    }

    private void E(v7.y yVar) {
        if (this.D.v(yVar)) {
            this.D.y(this.W);
            V();
        }
    }

    private long E0(a0.b bVar, long j10, boolean z10, boolean z11) {
        i1();
        this.N = false;
        if (z11 || this.I.f26099e == 3) {
            Z0(2);
        }
        i2 p10 = this.D.p();
        i2 i2Var = p10;
        while (i2Var != null && !bVar.equals(i2Var.f26190f.f26237a)) {
            i2Var = i2Var.j();
        }
        if (z10 || p10 != i2Var || (i2Var != null && i2Var.z(j10) < 0)) {
            for (q3 q3Var : this.f26383a) {
                o(q3Var);
            }
            if (i2Var != null) {
                while (this.D.p() != i2Var) {
                    this.D.b();
                }
                this.D.z(i2Var);
                i2Var.x(1000000000000L);
                r();
            }
        }
        l2 l2Var = this.D;
        if (i2Var != null) {
            l2Var.z(i2Var);
            if (!i2Var.f26188d) {
                i2Var.f26190f = i2Var.f26190f.b(j10);
            } else if (i2Var.f26189e) {
                long j11 = i2Var.f26185a.j(j10);
                i2Var.f26185a.s(j11 - this.f26397x, this.f26398y);
                j10 = j11;
            }
            s0(j10);
            V();
        } else {
            l2Var.f();
            s0(j10);
        }
        G(false);
        this.f26392s.i(2);
        return j10;
    }

    private void F(IOException iOException, int i10) {
        x h10 = x.h(iOException, i10);
        i2 p10 = this.D.p();
        if (p10 != null) {
            h10 = h10.f(p10.f26190f.f26237a);
        }
        t8.s.d("ExoPlayerImplInternal", "Playback error", h10);
        h1(false, false);
        this.I = this.I.e(h10);
    }

    private void F0(m3 m3Var) {
        if (m3Var.f() == -9223372036854775807L) {
            G0(m3Var);
            return;
        }
        if (this.I.f26095a.v()) {
            this.A.add(new d(m3Var));
            return;
        }
        d dVar = new d(m3Var);
        d4 d4Var = this.I.f26095a;
        if (!u0(dVar, d4Var, d4Var, this.P, this.Q, this.f26395v, this.f26396w)) {
            m3Var.k(false);
        } else {
            this.A.add(dVar);
            Collections.sort(this.A);
        }
    }

    private void G(boolean z10) {
        i2 j10 = this.D.j();
        a0.b bVar = j10 == null ? this.I.f26096b : j10.f26190f.f26237a;
        boolean z11 = !this.I.f26105k.equals(bVar);
        if (z11) {
            this.I = this.I.b(bVar);
        }
        g3 g3Var = this.I;
        g3Var.f26110p = j10 == null ? g3Var.f26112r : j10.i();
        this.I.f26111q = C();
        if ((z11 || z10) && j10 != null && j10.f26188d) {
            k1(j10.n(), j10.o());
        }
    }

    private void G0(m3 m3Var) {
        if (m3Var.c() != this.f26394u) {
            this.f26392s.d(15, m3Var).a();
            return;
        }
        n(m3Var);
        int i10 = this.I.f26099e;
        if (i10 == 3 || i10 == 2) {
            this.f26392s.i(2);
        }
    }

    /* JADX WARN: Not initialized variable reg: 25, insn: 0x0141: MOVE (r5 I:??[long, double]) = (r25 I:??[long, double]), block:B:109:0x0140 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void H(t6.d4 r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.q1.H(t6.d4, boolean):void");
    }

    private void H0(final m3 m3Var) {
        Looper c10 = m3Var.c();
        if (c10.getThread().isAlive()) {
            this.B.c(c10, null).h(new Runnable() { // from class: t6.p1
                @Override // java.lang.Runnable
                public final void run() {
                    q1.this.U(m3Var);
                }
            });
        } else {
            t8.s.i("TAG", "Trying to send message on a dead thread.");
            m3Var.k(false);
        }
    }

    private void I(v7.y yVar) {
        if (this.D.v(yVar)) {
            i2 j10 = this.D.j();
            j10.p(this.f26399z.c().f26204a, this.I.f26095a);
            k1(j10.n(), j10.o());
            if (j10 == this.D.p()) {
                s0(j10.f26190f.f26238b);
                r();
                g3 g3Var = this.I;
                a0.b bVar = g3Var.f26096b;
                long j11 = j10.f26190f.f26238b;
                this.I = L(bVar, j11, g3Var.f26097c, j11, false, 5);
            }
            V();
        }
    }

    private void I0(long j10) {
        for (q3 q3Var : this.f26383a) {
            if (q3Var.h() != null) {
                J0(q3Var, j10);
            }
        }
    }

    private void J(i3 i3Var, float f10, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                this.J.b(1);
            }
            this.I = this.I.f(i3Var);
        }
        o1(i3Var.f26204a);
        for (q3 q3Var : this.f26383a) {
            if (q3Var != null) {
                q3Var.x(f10, i3Var.f26204a);
            }
        }
    }

    private void J0(q3 q3Var, long j10) {
        q3Var.k();
        if (q3Var instanceof g8.q) {
            ((g8.q) q3Var).i0(j10);
        }
    }

    private void K(i3 i3Var, boolean z10) {
        J(i3Var, i3Var.f26204a, true, z10);
    }

    private void K0(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.R != z10) {
            this.R = z10;
            if (!z10) {
                for (q3 q3Var : this.f26383a) {
                    if (!Q(q3Var) && this.f26385b.remove(q3Var)) {
                        q3Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private g3 L(a0.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        List list;
        v7.f1 f1Var;
        q8.b0 b0Var;
        this.Y = (!this.Y && j10 == this.I.f26112r && bVar.equals(this.I.f26096b)) ? false : true;
        r0();
        g3 g3Var = this.I;
        v7.f1 f1Var2 = g3Var.f26102h;
        q8.b0 b0Var2 = g3Var.f26103i;
        List list2 = g3Var.f26104j;
        if (this.E.s()) {
            i2 p10 = this.D.p();
            v7.f1 n10 = p10 == null ? v7.f1.f28311d : p10.n();
            q8.b0 o10 = p10 == null ? this.f26389e : p10.o();
            List v10 = v(o10.f23628c);
            if (p10 != null) {
                j2 j2Var = p10.f26190f;
                if (j2Var.f26239c != j11) {
                    p10.f26190f = j2Var.a(j11);
                }
            }
            f1Var = n10;
            b0Var = o10;
            list = v10;
        } else if (bVar.equals(this.I.f26096b)) {
            list = list2;
            f1Var = f1Var2;
            b0Var = b0Var2;
        } else {
            f1Var = v7.f1.f28311d;
            b0Var = this.f26389e;
            list = com.google.common.collect.w.v();
        }
        if (z10) {
            this.J.e(i10);
        }
        return this.I.c(bVar, j10, j11, j12, C(), f1Var, b0Var, list);
    }

    private void L0(i3 i3Var) {
        this.f26392s.l(16);
        this.f26399z.b(i3Var);
    }

    private boolean M(q3 q3Var, i2 i2Var) {
        i2 j10 = i2Var.j();
        return i2Var.f26190f.f26242f && j10.f26188d && ((q3Var instanceof g8.q) || (q3Var instanceof l7.f) || q3Var.C() >= j10.m());
    }

    private void M0(b bVar) {
        this.J.b(1);
        if (bVar.f26403c != -1) {
            this.V = new h(new n3(bVar.f26401a, bVar.f26402b), bVar.f26403c, bVar.f26404d);
        }
        H(this.E.C(bVar.f26401a, bVar.f26402b), false);
    }

    private boolean N() {
        i2 q10 = this.D.q();
        if (!q10.f26188d) {
            return false;
        }
        int i10 = 0;
        while (true) {
            q3[] q3VarArr = this.f26383a;
            if (i10 >= q3VarArr.length) {
                return true;
            }
            q3 q3Var = q3VarArr[i10];
            v7.v0 v0Var = q10.f26187c[i10];
            if (q3Var.h() != v0Var || (v0Var != null && !q3Var.i() && !M(q3Var, q10))) {
                break;
            }
            i10++;
        }
        return false;
    }

    private static boolean O(boolean z10, a0.b bVar, long j10, a0.b bVar2, d4.b bVar3, long j11) {
        if (!z10 && j10 == j11 && bVar.f28543a.equals(bVar2.f28543a)) {
            return (bVar.b() && bVar3.u(bVar.f28544b)) ? (bVar3.l(bVar.f28544b, bVar.f28545c) == 4 || bVar3.l(bVar.f28544b, bVar.f28545c) == 2) ? false : true : bVar2.b() && bVar3.u(bVar2.f28544b);
        }
        return false;
    }

    private void O0(boolean z10) {
        if (z10 == this.T) {
            return;
        }
        this.T = z10;
        if (z10 || !this.I.f26109o) {
            return;
        }
        this.f26392s.i(2);
    }

    private boolean P() {
        i2 j10 = this.D.j();
        return (j10 == null || j10.k() == Long.MIN_VALUE) ? false : true;
    }

    private void P0(boolean z10) {
        this.L = z10;
        r0();
        if (!this.M || this.D.q() == this.D.p()) {
            return;
        }
        B0(true);
        G(false);
    }

    private static boolean Q(q3 q3Var) {
        return q3Var.getState() != 0;
    }

    private boolean R() {
        i2 p10 = this.D.p();
        long j10 = p10.f26190f.f26241e;
        return p10.f26188d && (j10 == -9223372036854775807L || this.I.f26112r < j10 || !c1());
    }

    private void R0(boolean z10, int i10, boolean z11, int i11) {
        this.J.b(z11 ? 1 : 0);
        this.J.c(i11);
        this.I = this.I.d(z10, i10);
        this.N = false;
        f0(z10);
        if (!c1()) {
            i1();
            m1();
            return;
        }
        int i12 = this.I.f26099e;
        if (i12 == 3) {
            f1();
        } else if (i12 != 2) {
            return;
        }
        this.f26392s.i(2);
    }

    private static boolean S(g3 g3Var, d4.b bVar) {
        a0.b bVar2 = g3Var.f26096b;
        d4 d4Var = g3Var.f26095a;
        return d4Var.v() || d4Var.m(bVar2.f28543a, bVar).f26060f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean T() {
        return Boolean.valueOf(this.K);
    }

    private void T0(i3 i3Var) {
        L0(i3Var);
        K(this.f26399z.c(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(m3 m3Var) {
        try {
            n(m3Var);
        } catch (x e10) {
            t8.s.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private void V() {
        boolean b12 = b1();
        this.O = b12;
        if (b12) {
            this.D.j().d(this.W);
        }
        j1();
    }

    private void V0(int i10) {
        this.P = i10;
        if (!this.D.G(this.I.f26095a, i10)) {
            B0(true);
        }
        G(false);
    }

    private void W() {
        this.J.d(this.I);
        if (this.J.f26413a) {
            this.C.a(this.J);
            this.J = new e(this.I);
        }
    }

    private void W0(u3 u3Var) {
        this.H = u3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        r3 = r7.A.get(r1 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (r3 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        r4 = r3.f26410b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r4 > r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r4 != r0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r3.f26411c <= r8) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r1 >= r7.A.size()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        r3 = r7.A.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r3 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r3.f26412d == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        r4 = r3.f26410b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r4 < r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (r4 != r0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if (r3.f26411c > r8) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (r3 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r3.f26412d == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        if (r3.f26410b != r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
    
        r4 = r3.f26411c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        if (r4 <= r8) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        if (r4 > r10) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        G0(r3.f26409a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
    
        if (r3.f26409a.b() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ae, code lost:
    
        if (r3.f26409a.j() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bf, code lost:
    
        if (r1 >= r7.A.size()) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ca, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c1, code lost:
    
        r3 = r7.A.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b4, code lost:
    
        r7.A.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cc, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d3, code lost:
    
        if (r3.f26409a.b() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e2, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dd, code lost:
    
        r7.A.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e3, code lost:
    
        r7.X = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x007c, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0084, code lost:
    
        if (r1 >= r7.A.size()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0069, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x006a, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0053, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0055, code lost:
    
        if (r1 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0044, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0045, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (r1 > 0) goto L12;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0055 -> B:10:0x0039). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0084 -> B:21:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void X(long r8, long r10) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.q1.X(long, long):void");
    }

    private void X0(boolean z10) {
        this.Q = z10;
        if (!this.D.H(this.I.f26095a, z10)) {
            B0(true);
        }
        G(false);
    }

    private void Y() {
        j2 o10;
        this.D.y(this.W);
        if (this.D.D() && (o10 = this.D.o(this.W, this.I)) != null) {
            i2 g10 = this.D.g(this.f26387c, this.f26388d, this.f26390f.d(), this.E, o10, this.f26389e);
            g10.f26185a.k(this, o10.f26238b);
            if (this.D.p() == g10) {
                s0(o10.f26238b);
            }
            G(false);
        }
        if (!this.O) {
            V();
        } else {
            this.O = P();
            j1();
        }
    }

    private void Y0(v7.x0 x0Var) {
        this.J.b(1);
        H(this.E.D(x0Var), false);
    }

    private void Z() {
        boolean z10;
        boolean z11 = false;
        while (a1()) {
            if (z11) {
                W();
            }
            i2 i2Var = (i2) t8.a.e(this.D.b());
            if (this.I.f26096b.f28543a.equals(i2Var.f26190f.f26237a.f28543a)) {
                a0.b bVar = this.I.f26096b;
                if (bVar.f28544b == -1) {
                    a0.b bVar2 = i2Var.f26190f.f26237a;
                    if (bVar2.f28544b == -1 && bVar.f28547e != bVar2.f28547e) {
                        z10 = true;
                        j2 j2Var = i2Var.f26190f;
                        a0.b bVar3 = j2Var.f26237a;
                        long j10 = j2Var.f26238b;
                        this.I = L(bVar3, j10, j2Var.f26239c, j10, !z10, 0);
                        r0();
                        m1();
                        z11 = true;
                    }
                }
            }
            z10 = false;
            j2 j2Var2 = i2Var.f26190f;
            a0.b bVar32 = j2Var2.f26237a;
            long j102 = j2Var2.f26238b;
            this.I = L(bVar32, j102, j2Var2.f26239c, j102, !z10, 0);
            r0();
            m1();
            z11 = true;
        }
    }

    private void Z0(int i10) {
        g3 g3Var = this.I;
        if (g3Var.f26099e != i10) {
            if (i10 != 2) {
                this.f26386b0 = -9223372036854775807L;
            }
            this.I = g3Var.g(i10);
        }
    }

    private void a0() {
        i2 q10 = this.D.q();
        if (q10 == null) {
            return;
        }
        int i10 = 0;
        if (q10.j() != null && !this.M) {
            if (N()) {
                if (q10.j().f26188d || this.W >= q10.j().m()) {
                    q8.b0 o10 = q10.o();
                    i2 c10 = this.D.c();
                    q8.b0 o11 = c10.o();
                    d4 d4Var = this.I.f26095a;
                    n1(d4Var, c10.f26190f.f26237a, d4Var, q10.f26190f.f26237a, -9223372036854775807L, false);
                    if (c10.f26188d && c10.f26185a.l() != -9223372036854775807L) {
                        I0(c10.m());
                        return;
                    }
                    for (int i11 = 0; i11 < this.f26383a.length; i11++) {
                        boolean c11 = o10.c(i11);
                        boolean c12 = o11.c(i11);
                        if (c11 && !this.f26383a[i11].r()) {
                            boolean z10 = this.f26387c[i11].g() == -2;
                            s3 s3Var = o10.f23627b[i11];
                            s3 s3Var2 = o11.f23627b[i11];
                            if (!c12 || !s3Var2.equals(s3Var) || z10) {
                                J0(this.f26383a[i11], c10.m());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!q10.f26190f.f26245i && !this.M) {
            return;
        }
        while (true) {
            q3[] q3VarArr = this.f26383a;
            if (i10 >= q3VarArr.length) {
                return;
            }
            q3 q3Var = q3VarArr[i10];
            v7.v0 v0Var = q10.f26187c[i10];
            if (v0Var != null && q3Var.h() == v0Var && q3Var.i()) {
                long j10 = q10.f26190f.f26241e;
                J0(q3Var, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : q10.l() + q10.f26190f.f26241e);
            }
            i10++;
        }
    }

    private boolean a1() {
        i2 p10;
        i2 j10;
        return c1() && !this.M && (p10 = this.D.p()) != null && (j10 = p10.j()) != null && this.W >= j10.m() && j10.f26191g;
    }

    private void b0() {
        i2 q10 = this.D.q();
        if (q10 == null || this.D.p() == q10 || q10.f26191g || !o0()) {
            return;
        }
        r();
    }

    private boolean b1() {
        if (!P()) {
            return false;
        }
        i2 j10 = this.D.j();
        long D = D(j10.k());
        long y10 = j10 == this.D.p() ? j10.y(this.W) : j10.y(this.W) - j10.f26190f.f26238b;
        boolean h10 = this.f26390f.h(y10, D, this.f26399z.c().f26204a);
        if (h10 || D >= 500000) {
            return h10;
        }
        if (this.f26397x <= 0 && !this.f26398y) {
            return h10;
        }
        this.D.p().f26185a.s(this.I.f26112r, false);
        return this.f26390f.h(y10, D, this.f26399z.c().f26204a);
    }

    private void c0() {
        H(this.E.i(), true);
    }

    private boolean c1() {
        g3 g3Var = this.I;
        return g3Var.f26106l && g3Var.f26107m == 0;
    }

    private void d0(c cVar) {
        this.J.b(1);
        H(this.E.v(cVar.f26405a, cVar.f26406b, cVar.f26407c, cVar.f26408d), false);
    }

    private boolean d1(boolean z10) {
        if (this.U == 0) {
            return R();
        }
        if (!z10) {
            return false;
        }
        g3 g3Var = this.I;
        if (!g3Var.f26101g) {
            return true;
        }
        long c10 = e1(g3Var.f26095a, this.D.p().f26190f.f26237a) ? this.F.c() : -9223372036854775807L;
        i2 j10 = this.D.j();
        return (j10.q() && j10.f26190f.f26245i) || (j10.f26190f.f26237a.b() && !j10.f26188d) || this.f26390f.c(C(), this.f26399z.c().f26204a, this.N, c10);
    }

    private void e0() {
        for (i2 p10 = this.D.p(); p10 != null; p10 = p10.j()) {
            for (q8.r rVar : p10.o().f23628c) {
                if (rVar != null) {
                    rVar.n();
                }
            }
        }
    }

    private boolean e1(d4 d4Var, a0.b bVar) {
        if (bVar.b() || d4Var.v()) {
            return false;
        }
        d4Var.s(d4Var.m(bVar.f28543a, this.f26396w).f26057c, this.f26395v);
        if (!this.f26395v.i()) {
            return false;
        }
        d4.d dVar = this.f26395v;
        return dVar.f26074t && dVar.f26071f != -9223372036854775807L;
    }

    private void f0(boolean z10) {
        for (i2 p10 = this.D.p(); p10 != null; p10 = p10.j()) {
            for (q8.r rVar : p10.o().f23628c) {
                if (rVar != null) {
                    rVar.o(z10);
                }
            }
        }
    }

    private void f1() {
        this.N = false;
        this.f26399z.g();
        for (q3 q3Var : this.f26383a) {
            if (Q(q3Var)) {
                q3Var.start();
            }
        }
    }

    private void g0() {
        for (i2 p10 = this.D.p(); p10 != null; p10 = p10.j()) {
            for (q8.r rVar : p10.o().f23628c) {
                if (rVar != null) {
                    rVar.u();
                }
            }
        }
    }

    private void h1(boolean z10, boolean z11) {
        q0(z10 || !this.R, false, true, false);
        this.J.b(z11 ? 1 : 0);
        this.f26390f.e();
        Z0(1);
    }

    private void i1() {
        this.f26399z.h();
        for (q3 q3Var : this.f26383a) {
            if (Q(q3Var)) {
                t(q3Var);
            }
        }
    }

    private void j0() {
        this.J.b(1);
        q0(false, false, false, true);
        this.f26390f.onPrepared();
        Z0(this.I.f26095a.v() ? 4 : 2);
        this.E.w(this.f26391r.d());
        this.f26392s.i(2);
    }

    private void j1() {
        i2 j10 = this.D.j();
        boolean z10 = this.O || (j10 != null && j10.f26185a.isLoading());
        g3 g3Var = this.I;
        if (z10 != g3Var.f26101g) {
            this.I = g3Var.a(z10);
        }
    }

    private void k(b bVar, int i10) {
        this.J.b(1);
        a3 a3Var = this.E;
        if (i10 == -1) {
            i10 = a3Var.q();
        }
        H(a3Var.f(i10, bVar.f26401a, bVar.f26402b), false);
    }

    private void k1(v7.f1 f1Var, q8.b0 b0Var) {
        this.f26390f.f(this.f26383a, f1Var, b0Var.f23628c);
    }

    private void l0() {
        q0(true, false, true, false);
        this.f26390f.g();
        Z0(1);
        HandlerThread handlerThread = this.f26393t;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.K = true;
            notifyAll();
        }
    }

    private void l1() {
        if (this.I.f26095a.v() || !this.E.s()) {
            return;
        }
        Y();
        a0();
        b0();
        Z();
    }

    private void m() {
        B0(true);
    }

    private void m0(int i10, int i11, v7.x0 x0Var) {
        this.J.b(1);
        H(this.E.A(i10, i11, x0Var), false);
    }

    private void m1() {
        i2 p10 = this.D.p();
        if (p10 == null) {
            return;
        }
        long l10 = p10.f26188d ? p10.f26185a.l() : -9223372036854775807L;
        if (l10 != -9223372036854775807L) {
            s0(l10);
            if (l10 != this.I.f26112r) {
                g3 g3Var = this.I;
                this.I = L(g3Var.f26096b, l10, g3Var.f26097c, l10, true, 5);
            }
        } else {
            long i10 = this.f26399z.i(p10 != this.D.q());
            this.W = i10;
            long y10 = p10.y(i10);
            X(this.I.f26112r, y10);
            this.I.f26112r = y10;
        }
        this.I.f26110p = this.D.j().i();
        this.I.f26111q = C();
        g3 g3Var2 = this.I;
        if (g3Var2.f26106l && g3Var2.f26099e == 3 && e1(g3Var2.f26095a, g3Var2.f26096b) && this.I.f26108n.f26204a == 1.0f) {
            float b10 = this.F.b(w(), C());
            if (this.f26399z.c().f26204a != b10) {
                L0(this.I.f26108n.e(b10));
                J(this.I.f26108n, this.f26399z.c().f26204a, false, false);
            }
        }
    }

    private void n(m3 m3Var) {
        if (m3Var.j()) {
            return;
        }
        try {
            m3Var.g().p(m3Var.i(), m3Var.e());
        } finally {
            m3Var.k(true);
        }
    }

    private void n1(d4 d4Var, a0.b bVar, d4 d4Var2, a0.b bVar2, long j10, boolean z10) {
        if (!e1(d4Var, bVar)) {
            i3 i3Var = bVar.b() ? i3.f26200d : this.I.f26108n;
            if (this.f26399z.c().equals(i3Var)) {
                return;
            }
            L0(i3Var);
            J(this.I.f26108n, i3Var.f26204a, false, false);
            return;
        }
        d4Var.s(d4Var.m(bVar.f28543a, this.f26396w).f26057c, this.f26395v);
        this.F.a((c2.g) t8.r0.j(this.f26395v.f26076v));
        if (j10 != -9223372036854775807L) {
            this.F.e(y(d4Var, bVar.f28543a, j10));
            return;
        }
        if (!t8.r0.c(!d4Var2.v() ? d4Var2.s(d4Var2.m(bVar2.f28543a, this.f26396w).f26057c, this.f26395v).f26066a : null, this.f26395v.f26066a) || z10) {
            this.F.e(-9223372036854775807L);
        }
    }

    private void o(q3 q3Var) {
        if (Q(q3Var)) {
            this.f26399z.a(q3Var);
            t(q3Var);
            q3Var.f();
            this.U--;
        }
    }

    private boolean o0() {
        i2 q10 = this.D.q();
        q8.b0 o10 = q10.o();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            q3[] q3VarArr = this.f26383a;
            if (i10 >= q3VarArr.length) {
                return !z10;
            }
            q3 q3Var = q3VarArr[i10];
            if (Q(q3Var)) {
                boolean z11 = q3Var.h() != q10.f26187c[i10];
                if (!o10.c(i10) || z11) {
                    if (!q3Var.r()) {
                        q3Var.A(x(o10.f23628c[i10]), q10.f26187c[i10], q10.m(), q10.l());
                    } else if (q3Var.e()) {
                        o(q3Var);
                    } else {
                        z10 = true;
                    }
                }
            }
            i10++;
        }
    }

    private void o1(float f10) {
        for (i2 p10 = this.D.p(); p10 != null; p10 = p10.j()) {
            for (q8.r rVar : p10.o().f23628c) {
                if (rVar != null) {
                    rVar.l(f10);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void p() {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.q1.p():void");
    }

    private void p0() {
        float f10 = this.f26399z.c().f26204a;
        i2 q10 = this.D.q();
        boolean z10 = true;
        for (i2 p10 = this.D.p(); p10 != null && p10.f26188d; p10 = p10.j()) {
            q8.b0 v10 = p10.v(f10, this.I.f26095a);
            if (!v10.a(p10.o())) {
                l2 l2Var = this.D;
                if (z10) {
                    i2 p11 = l2Var.p();
                    boolean z11 = this.D.z(p11);
                    boolean[] zArr = new boolean[this.f26383a.length];
                    long b10 = p11.b(v10, this.I.f26112r, z11, zArr);
                    g3 g3Var = this.I;
                    boolean z12 = (g3Var.f26099e == 4 || b10 == g3Var.f26112r) ? false : true;
                    g3 g3Var2 = this.I;
                    this.I = L(g3Var2.f26096b, b10, g3Var2.f26097c, g3Var2.f26098d, z12, 5);
                    if (z12) {
                        s0(b10);
                    }
                    boolean[] zArr2 = new boolean[this.f26383a.length];
                    int i10 = 0;
                    while (true) {
                        q3[] q3VarArr = this.f26383a;
                        if (i10 >= q3VarArr.length) {
                            break;
                        }
                        q3 q3Var = q3VarArr[i10];
                        boolean Q = Q(q3Var);
                        zArr2[i10] = Q;
                        v7.v0 v0Var = p11.f26187c[i10];
                        if (Q) {
                            if (v0Var != q3Var.h()) {
                                o(q3Var);
                            } else if (zArr[i10]) {
                                q3Var.D(this.W);
                            }
                        }
                        i10++;
                    }
                    s(zArr2);
                } else {
                    l2Var.z(p10);
                    if (p10.f26188d) {
                        p10.a(v10, Math.max(p10.f26190f.f26238b, p10.y(this.W)), false);
                    }
                }
                G(true);
                if (this.I.f26099e != 4) {
                    V();
                    m1();
                    this.f26392s.i(2);
                    return;
                }
                return;
            }
            if (p10 == q10) {
                z10 = false;
            }
        }
    }

    private synchronized void p1(eb.v<Boolean> vVar, long j10) {
        long b10 = this.B.b() + j10;
        boolean z10 = false;
        while (!vVar.get().booleanValue() && j10 > 0) {
            try {
                this.B.d();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = b10 - this.B.b();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private void q(int i10, boolean z10) {
        q3 q3Var = this.f26383a[i10];
        if (Q(q3Var)) {
            return;
        }
        i2 q10 = this.D.q();
        boolean z11 = q10 == this.D.p();
        q8.b0 o10 = q10.o();
        s3 s3Var = o10.f23627b[i10];
        u1[] x10 = x(o10.f23628c[i10]);
        boolean z12 = c1() && this.I.f26099e == 3;
        boolean z13 = !z10 && z12;
        this.U++;
        this.f26385b.add(q3Var);
        q3Var.B(s3Var, x10, q10.f26187c[i10], this.W, z13, z11, q10.m(), q10.l());
        q3Var.p(11, new a());
        this.f26399z.d(q3Var);
        if (z12) {
            q3Var.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void q0(boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.q1.q0(boolean, boolean, boolean, boolean):void");
    }

    private void r() {
        s(new boolean[this.f26383a.length]);
    }

    private void r0() {
        i2 p10 = this.D.p();
        this.M = p10 != null && p10.f26190f.f26244h && this.L;
    }

    private void s(boolean[] zArr) {
        i2 q10 = this.D.q();
        q8.b0 o10 = q10.o();
        for (int i10 = 0; i10 < this.f26383a.length; i10++) {
            if (!o10.c(i10) && this.f26385b.remove(this.f26383a[i10])) {
                this.f26383a[i10].reset();
            }
        }
        for (int i11 = 0; i11 < this.f26383a.length; i11++) {
            if (o10.c(i11)) {
                q(i11, zArr[i11]);
            }
        }
        q10.f26191g = true;
    }

    private void s0(long j10) {
        i2 p10 = this.D.p();
        long z10 = p10 == null ? j10 + 1000000000000L : p10.z(j10);
        this.W = z10;
        this.f26399z.e(z10);
        for (q3 q3Var : this.f26383a) {
            if (Q(q3Var)) {
                q3Var.D(this.W);
            }
        }
        e0();
    }

    private void t(q3 q3Var) {
        if (q3Var.getState() == 2) {
            q3Var.stop();
        }
    }

    private static void t0(d4 d4Var, d dVar, d4.d dVar2, d4.b bVar) {
        int i10 = d4Var.s(d4Var.m(dVar.f26412d, bVar).f26057c, dVar2).A;
        Object obj = d4Var.l(i10, bVar, true).f26056b;
        long j10 = bVar.f26058d;
        dVar.h(i10, j10 != -9223372036854775807L ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    private static boolean u0(d dVar, d4 d4Var, d4 d4Var2, int i10, boolean z10, d4.d dVar2, d4.b bVar) {
        Object obj = dVar.f26412d;
        if (obj == null) {
            Pair<Object, Long> x02 = x0(d4Var, new h(dVar.f26409a.h(), dVar.f26409a.d(), dVar.f26409a.f() == Long.MIN_VALUE ? -9223372036854775807L : t8.r0.C0(dVar.f26409a.f())), false, i10, z10, dVar2, bVar);
            if (x02 == null) {
                return false;
            }
            dVar.h(d4Var.g(x02.first), ((Long) x02.second).longValue(), x02.first);
            if (dVar.f26409a.f() == Long.MIN_VALUE) {
                t0(d4Var, dVar, dVar2, bVar);
            }
            return true;
        }
        int g10 = d4Var.g(obj);
        if (g10 == -1) {
            return false;
        }
        if (dVar.f26409a.f() == Long.MIN_VALUE) {
            t0(d4Var, dVar, dVar2, bVar);
            return true;
        }
        dVar.f26410b = g10;
        d4Var2.m(dVar.f26412d, bVar);
        if (bVar.f26060f && d4Var2.s(bVar.f26057c, dVar2).f26080z == d4Var2.g(dVar.f26412d)) {
            Pair<Object, Long> o10 = d4Var.o(dVar2, bVar, d4Var.m(dVar.f26412d, bVar).f26057c, dVar.f26411c + bVar.r());
            dVar.h(d4Var.g(o10.first), ((Long) o10.second).longValue(), o10.first);
        }
        return true;
    }

    private com.google.common.collect.w<l7.a> v(q8.r[] rVarArr) {
        w.a aVar = new w.a();
        boolean z10 = false;
        for (q8.r rVar : rVarArr) {
            if (rVar != null) {
                l7.a aVar2 = rVar.a(0).f26515u;
                if (aVar2 == null) {
                    aVar.a(new l7.a(new a.b[0]));
                } else {
                    aVar.a(aVar2);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.k() : com.google.common.collect.w.v();
    }

    private void v0(d4 d4Var, d4 d4Var2) {
        if (d4Var.v() && d4Var2.v()) {
            return;
        }
        for (int size = this.A.size() - 1; size >= 0; size--) {
            if (!u0(this.A.get(size), d4Var, d4Var2, this.P, this.Q, this.f26395v, this.f26396w)) {
                this.A.get(size).f26409a.k(false);
                this.A.remove(size);
            }
        }
        Collections.sort(this.A);
    }

    private long w() {
        g3 g3Var = this.I;
        return y(g3Var.f26095a, g3Var.f26096b.f28543a, g3Var.f26112r);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static t6.q1.g w0(t6.d4 r30, t6.g3 r31, t6.q1.h r32, t6.l2 r33, int r34, boolean r35, t6.d4.d r36, t6.d4.b r37) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.q1.w0(t6.d4, t6.g3, t6.q1$h, t6.l2, int, boolean, t6.d4$d, t6.d4$b):t6.q1$g");
    }

    private static u1[] x(q8.r rVar) {
        int length = rVar != null ? rVar.length() : 0;
        u1[] u1VarArr = new u1[length];
        for (int i10 = 0; i10 < length; i10++) {
            u1VarArr[i10] = rVar.a(i10);
        }
        return u1VarArr;
    }

    private static Pair<Object, Long> x0(d4 d4Var, h hVar, boolean z10, int i10, boolean z11, d4.d dVar, d4.b bVar) {
        Pair<Object, Long> o10;
        Object y02;
        d4 d4Var2 = hVar.f26426a;
        if (d4Var.v()) {
            return null;
        }
        d4 d4Var3 = d4Var2.v() ? d4Var : d4Var2;
        try {
            o10 = d4Var3.o(dVar, bVar, hVar.f26427b, hVar.f26428c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (d4Var.equals(d4Var3)) {
            return o10;
        }
        if (d4Var.g(o10.first) != -1) {
            return (d4Var3.m(o10.first, bVar).f26060f && d4Var3.s(bVar.f26057c, dVar).f26080z == d4Var3.g(o10.first)) ? d4Var.o(dVar, bVar, d4Var.m(o10.first, bVar).f26057c, hVar.f26428c) : o10;
        }
        if (z10 && (y02 = y0(dVar, bVar, i10, z11, o10.first, d4Var3, d4Var)) != null) {
            return d4Var.o(dVar, bVar, d4Var.m(y02, bVar).f26057c, -9223372036854775807L);
        }
        return null;
    }

    private long y(d4 d4Var, Object obj, long j10) {
        d4Var.s(d4Var.m(obj, this.f26396w).f26057c, this.f26395v);
        d4.d dVar = this.f26395v;
        if (dVar.f26071f != -9223372036854775807L && dVar.i()) {
            d4.d dVar2 = this.f26395v;
            if (dVar2.f26074t) {
                return t8.r0.C0(dVar2.d() - this.f26395v.f26071f) - (j10 + this.f26396w.r());
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object y0(d4.d dVar, d4.b bVar, int i10, boolean z10, Object obj, d4 d4Var, d4 d4Var2) {
        int g10 = d4Var.g(obj);
        int n10 = d4Var.n();
        int i11 = g10;
        int i12 = -1;
        for (int i13 = 0; i13 < n10 && i12 == -1; i13++) {
            i11 = d4Var.i(i11, bVar, dVar, i10, z10);
            if (i11 == -1) {
                break;
            }
            i12 = d4Var2.g(d4Var.r(i11));
        }
        if (i12 == -1) {
            return null;
        }
        return d4Var2.r(i12);
    }

    private long z() {
        i2 q10 = this.D.q();
        if (q10 == null) {
            return 0L;
        }
        long l10 = q10.l();
        if (!q10.f26188d) {
            return l10;
        }
        int i10 = 0;
        while (true) {
            q3[] q3VarArr = this.f26383a;
            if (i10 >= q3VarArr.length) {
                return l10;
            }
            if (Q(q3VarArr[i10]) && this.f26383a[i10].h() == q10.f26187c[i10]) {
                long C = this.f26383a[i10].C();
                if (C == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                l10 = Math.max(C, l10);
            }
            i10++;
        }
    }

    private void z0(long j10, long j11) {
        this.f26392s.j(2, j10 + j11);
    }

    public void A0(d4 d4Var, int i10, long j10) {
        this.f26392s.d(3, new h(d4Var, i10, j10)).a();
    }

    public Looper B() {
        return this.f26394u;
    }

    public void N0(List<a3.c> list, int i10, long j10, v7.x0 x0Var) {
        this.f26392s.d(17, new b(list, x0Var, i10, j10, null)).a();
    }

    public void Q0(boolean z10, int i10) {
        this.f26392s.g(1, z10 ? 1 : 0, i10).a();
    }

    public void S0(i3 i3Var) {
        this.f26392s.d(4, i3Var).a();
    }

    public void U0(int i10) {
        this.f26392s.g(11, i10, 0).a();
    }

    @Override // q8.a0.a
    public void b() {
        this.f26392s.i(10);
    }

    @Override // t6.a3.d
    public void c() {
        this.f26392s.i(22);
    }

    @Override // t6.m3.a
    public synchronized void d(m3 m3Var) {
        if (!this.K && this.f26394u.getThread().isAlive()) {
            this.f26392s.d(14, m3Var).a();
            return;
        }
        t8.s.i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        m3Var.k(false);
    }

    public void g1() {
        this.f26392s.a(6).a();
    }

    @Override // v7.y.a
    public void h(v7.y yVar) {
        this.f26392s.d(8, yVar).a();
    }

    @Override // v7.w0.a
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void a(v7.y yVar) {
        this.f26392s.d(9, yVar).a();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10;
        i2 q10;
        int i11;
        IOException iOException;
        int i12 = AdError.NETWORK_ERROR_CODE;
        try {
            switch (message.what) {
                case 0:
                    j0();
                    break;
                case 1:
                    R0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    p();
                    break;
                case 3:
                    C0((h) message.obj);
                    break;
                case 4:
                    T0((i3) message.obj);
                    break;
                case 5:
                    W0((u3) message.obj);
                    break;
                case 6:
                    h1(false, true);
                    break;
                case 7:
                    l0();
                    return true;
                case 8:
                    I((v7.y) message.obj);
                    break;
                case 9:
                    E((v7.y) message.obj);
                    break;
                case 10:
                    p0();
                    break;
                case 11:
                    V0(message.arg1);
                    break;
                case 12:
                    X0(message.arg1 != 0);
                    break;
                case 13:
                    K0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    F0((m3) message.obj);
                    break;
                case 15:
                    H0((m3) message.obj);
                    break;
                case 16:
                    K((i3) message.obj, false);
                    break;
                case 17:
                    M0((b) message.obj);
                    break;
                case 18:
                    k((b) message.obj, message.arg1);
                    break;
                case 19:
                    d0((c) message.obj);
                    break;
                case 20:
                    m0(message.arg1, message.arg2, (v7.x0) message.obj);
                    break;
                case 21:
                    Y0((v7.x0) message.obj);
                    break;
                case 22:
                    c0();
                    break;
                case 23:
                    P0(message.arg1 != 0);
                    break;
                case 24:
                    O0(message.arg1 == 1);
                    break;
                case 25:
                    m();
                    break;
                default:
                    return false;
            }
        } catch (s8.k e10) {
            i10 = e10.f25265a;
            iOException = e10;
            F(iOException, i10);
        } catch (b3 e11) {
            int i13 = e11.f25865b;
            if (i13 == 1) {
                i11 = e11.f25864a ? AdError.MEDIATION_ERROR_CODE : 3003;
            } else {
                if (i13 == 4) {
                    i11 = e11.f25864a ? 3002 : 3004;
                }
                F(e11, i12);
            }
            i12 = i11;
            F(e11, i12);
        } catch (v7.b e12) {
            i10 = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
            iOException = e12;
            F(iOException, i10);
        } catch (IOException e13) {
            i10 = AdError.SERVER_ERROR_CODE;
            iOException = e13;
            F(iOException, i10);
        } catch (RuntimeException e14) {
            if ((e14 instanceof IllegalStateException) || (e14 instanceof IllegalArgumentException)) {
                i12 = 1004;
            }
            e = x.j(e14, i12);
            t8.s.d("ExoPlayerImplInternal", "Playback error", e);
            h1(true, false);
            this.I = this.I.e(e);
        } catch (x e15) {
            e = e15;
            if (e.f26579t == 1 && (q10 = this.D.q()) != null) {
                e = e.f(q10.f26190f.f26237a);
            }
            if (e.f26585z && this.Z == null) {
                t8.s.j("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.Z = e;
                t8.o oVar = this.f26392s;
                oVar.k(oVar.d(25, e));
            } else {
                x xVar = this.Z;
                if (xVar != null) {
                    xVar.addSuppressed(e);
                    e = this.Z;
                }
                t8.s.d("ExoPlayerImplInternal", "Playback error", e);
                h1(true, false);
                this.I = this.I.e(e);
            }
        } catch (n.a e16) {
            i10 = e16.f30550a;
            iOException = e16;
            F(iOException, i10);
        }
        W();
        return true;
    }

    public void i0() {
        this.f26392s.a(0).a();
    }

    public synchronized boolean k0() {
        if (!this.K && this.f26394u.getThread().isAlive()) {
            this.f26392s.i(7);
            p1(new eb.v() { // from class: t6.o1
                @Override // eb.v
                public final Object get() {
                    Boolean T;
                    T = q1.this.T();
                    return T;
                }
            }, this.G);
            return this.K;
        }
        return true;
    }

    public void l(int i10, List<a3.c> list, v7.x0 x0Var) {
        this.f26392s.c(18, i10, 0, new b(list, x0Var, -1, -9223372036854775807L, null)).a();
    }

    public void n0(int i10, int i11, v7.x0 x0Var) {
        this.f26392s.c(20, i10, i11, x0Var).a();
    }

    @Override // t6.s.a
    public void onPlaybackParametersChanged(i3 i3Var) {
        this.f26392s.d(16, i3Var).a();
    }

    public void u(long j10) {
        this.f26384a0 = j10;
    }
}
