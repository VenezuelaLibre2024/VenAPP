package p361t6;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.facebook.ads.AdError;
import com.google.common.collect.AbstractC5907w;
import com.google.common.collect.C5862c1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p082eb.InterfaceC7166v;
import p120g8.C7499q;
import p216l7.C9400a;
import p216l7.C9405f;
import p307q8.AbstractC10294a0;
import p307q8.C10296b0;
import p307q8.InterfaceC10312r;
import p351s8.C10829k;
import p351s8.InterfaceC10817e;
import p361t6.AbstractC11018d4;
import p361t6.C10999a3;
import p361t6.C11010c2;
import p361t6.C11070m3;
import p361t6.C11096s;
import p361t6.InterfaceC11090q3;
import p363t8.C11137a;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.InterfaceC11143d;
import p363t8.InterfaceC11165o;
import p376u6.C11391m3;
import p376u6.InterfaceC11327a;
import p397v7.C11686b;
import p397v7.C11700f1;
import p397v7.InterfaceC11684a0;
import p397v7.InterfaceC11734v0;
import p397v7.InterfaceC11738x0;
import p397v7.InterfaceC11739y;
import p436x6.InterfaceC12320n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: t6.q1 */
/* loaded from: classes.dex */
public final class C11088q1 implements Handler.Callback, InterfaceC11739y.a, AbstractC10294a0.a, C10999a3.d, C11096s.a, C11070m3.a {

    /* renamed from: A */
    private final ArrayList<d> f28610A;

    /* renamed from: B */
    private final InterfaceC11143d f28611B;

    /* renamed from: C */
    private final f f28612C;

    /* renamed from: D */
    private final C11064l2 f28613D;

    /* renamed from: E */
    private final C10999a3 f28614E;

    /* renamed from: F */
    private final InterfaceC11133z1 f28615F;

    /* renamed from: G */
    private final long f28616G;

    /* renamed from: H */
    private C11110u3 f28617H;

    /* renamed from: I */
    private C11035g3 f28618I;

    /* renamed from: J */
    private e f28619J;

    /* renamed from: K */
    private boolean f28620K;

    /* renamed from: L */
    private boolean f28621L;

    /* renamed from: M */
    private boolean f28622M;

    /* renamed from: N */
    private boolean f28623N;

    /* renamed from: O */
    private boolean f28624O;

    /* renamed from: P */
    private int f28625P;

    /* renamed from: Q */
    private boolean f28626Q;

    /* renamed from: R */
    private boolean f28627R;

    /* renamed from: S */
    private boolean f28628S;

    /* renamed from: T */
    private boolean f28629T;

    /* renamed from: U */
    private int f28630U;

    /* renamed from: V */
    private h f28631V;

    /* renamed from: W */
    private long f28632W;

    /* renamed from: X */
    private int f28633X;

    /* renamed from: Y */
    private boolean f28634Y;

    /* renamed from: Z */
    private C11121x f28635Z;

    /* renamed from: a */
    private final InterfaceC11090q3[] f28636a;

    /* renamed from: a0 */
    private long f28637a0;

    /* renamed from: b */
    private final Set<InterfaceC11090q3> f28638b;

    /* renamed from: b0 */
    private long f28639b0 = -9223372036854775807L;

    /* renamed from: c */
    private final InterfaceC11095r3[] f28640c;

    /* renamed from: d */
    private final AbstractC10294a0 f28641d;

    /* renamed from: e */
    private final C10296b0 f28642e;

    /* renamed from: f */
    private final InterfaceC10998a2 f28643f;

    /* renamed from: r */
    private final InterfaceC10817e f28644r;

    /* renamed from: s */
    private final InterfaceC11165o f28645s;

    /* renamed from: t */
    private final HandlerThread f28646t;

    /* renamed from: u */
    private final Looper f28647u;

    /* renamed from: v */
    private final AbstractC11018d4.d f28648v;

    /* renamed from: w */
    private final AbstractC11018d4.b f28649w;

    /* renamed from: x */
    private final long f28650x;

    /* renamed from: y */
    private final boolean f28651y;

    /* renamed from: z */
    private final C11096s f28652z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t6.q1$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC11090q3.a {
        a() {
        }

        @Override // p361t6.InterfaceC11090q3.a
        /* renamed from: a */
        public void mo34434a() {
            C11088q1.this.f28628S = true;
        }

        @Override // p361t6.InterfaceC11090q3.a
        /* renamed from: b */
        public void mo34435b() {
            C11088q1.this.f28645s.mo34779i(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t6.q1$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final List<C10999a3.c> f28654a;

        /* renamed from: b */
        private final InterfaceC11738x0 f28655b;

        /* renamed from: c */
        private final int f28656c;

        /* renamed from: d */
        private final long f28657d;

        private b(List<C10999a3.c> list, InterfaceC11738x0 interfaceC11738x0, int i10, long j10) {
            this.f28654a = list;
            this.f28655b = interfaceC11738x0;
            this.f28656c = i10;
            this.f28657d = j10;
        }

        /* synthetic */ b(List list, InterfaceC11738x0 interfaceC11738x0, int i10, long j10, a aVar) {
            this(list, interfaceC11738x0, i10, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t6.q1$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final int f28658a;

        /* renamed from: b */
        public final int f28659b;

        /* renamed from: c */
        public final int f28660c;

        /* renamed from: d */
        public final InterfaceC11738x0 f28661d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t6.q1$d */
    /* loaded from: classes.dex */
    public static final class d implements Comparable<d> {

        /* renamed from: a */
        public final C11070m3 f28662a;

        /* renamed from: b */
        public int f28663b;

        /* renamed from: c */
        public long f28664c;

        /* renamed from: d */
        public Object f28665d;

        public d(C11070m3 c11070m3) {
            this.f28662a = c11070m3;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f28665d;
            if ((obj == null) != (dVar.f28665d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f28663b - dVar.f28663b;
            return i10 != 0 ? i10 : C11172r0.m34938o(this.f28664c, dVar.f28664c);
        }

        /* renamed from: h */
        public void m34441h(int i10, long j10, Object obj) {
            this.f28663b = i10;
            this.f28664c = j10;
            this.f28665d = obj;
        }
    }

    /* renamed from: t6.q1$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        private boolean f28666a;

        /* renamed from: b */
        public C11035g3 f28667b;

        /* renamed from: c */
        public int f28668c;

        /* renamed from: d */
        public boolean f28669d;

        /* renamed from: e */
        public int f28670e;

        /* renamed from: f */
        public boolean f28671f;

        /* renamed from: g */
        public int f28672g;

        public e(C11035g3 c11035g3) {
            this.f28667b = c11035g3;
        }

        /* renamed from: b */
        public void m34443b(int i10) {
            this.f28666a |= i10 > 0;
            this.f28668c += i10;
        }

        /* renamed from: c */
        public void m34444c(int i10) {
            this.f28666a = true;
            this.f28671f = true;
            this.f28672g = i10;
        }

        /* renamed from: d */
        public void m34445d(C11035g3 c11035g3) {
            this.f28666a |= this.f28667b != c11035g3;
            this.f28667b = c11035g3;
        }

        /* renamed from: e */
        public void m34446e(int i10) {
            if (this.f28669d && this.f28670e != 5) {
                C11137a.m34599a(i10 == 5);
                return;
            }
            this.f28666a = true;
            this.f28669d = true;
            this.f28670e = i10;
        }
    }

    /* renamed from: t6.q1$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        void mo34447a(e eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t6.q1$g */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a */
        public final InterfaceC11684a0.b f28673a;

        /* renamed from: b */
        public final long f28674b;

        /* renamed from: c */
        public final long f28675c;

        /* renamed from: d */
        public final boolean f28676d;

        /* renamed from: e */
        public final boolean f28677e;

        /* renamed from: f */
        public final boolean f28678f;

        public g(InterfaceC11684a0.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f28673a = bVar;
            this.f28674b = j10;
            this.f28675c = j11;
            this.f28676d = z10;
            this.f28677e = z11;
            this.f28678f = z12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t6.q1$h */
    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a */
        public final AbstractC11018d4 f28679a;

        /* renamed from: b */
        public final int f28680b;

        /* renamed from: c */
        public final long f28681c;

        public h(AbstractC11018d4 abstractC11018d4, int i10, long j10) {
            this.f28679a = abstractC11018d4;
            this.f28680b = i10;
            this.f28681c = j10;
        }
    }

    public C11088q1(InterfaceC11090q3[] interfaceC11090q3Arr, AbstractC10294a0 abstractC10294a0, C10296b0 c10296b0, InterfaceC10998a2 interfaceC10998a2, InterfaceC10817e interfaceC10817e, int i10, boolean z10, InterfaceC11327a interfaceC11327a, C11110u3 c11110u3, InterfaceC11133z1 interfaceC11133z1, long j10, boolean z11, Looper looper, InterfaceC11143d interfaceC11143d, f fVar, C11391m3 c11391m3, Looper looper2) {
        this.f28612C = fVar;
        this.f28636a = interfaceC11090q3Arr;
        this.f28641d = abstractC10294a0;
        this.f28642e = c10296b0;
        this.f28643f = interfaceC10998a2;
        this.f28644r = interfaceC10817e;
        this.f28625P = i10;
        this.f28626Q = z10;
        this.f28617H = c11110u3;
        this.f28615F = interfaceC11133z1;
        this.f28616G = j10;
        this.f28637a0 = j10;
        this.f28621L = z11;
        this.f28611B = interfaceC11143d;
        this.f28650x = interfaceC10998a2.mo33634b();
        this.f28651y = interfaceC10998a2.mo33633a();
        C11035g3 m34045j = C11035g3.m34045j(c10296b0);
        this.f28618I = m34045j;
        this.f28619J = new e(m34045j);
        this.f28640c = new InterfaceC11095r3[interfaceC11090q3Arr.length];
        for (int i11 = 0; i11 < interfaceC11090q3Arr.length; i11++) {
            interfaceC11090q3Arr[i11].mo34251s(i11, c11391m3);
            this.f28640c[i11] = interfaceC11090q3Arr[i11].mo34252u();
        }
        this.f28652z = new C11096s(this, interfaceC11143d);
        this.f28610A = new ArrayList<>();
        this.f28638b = C5862c1.m14778h();
        this.f28648v = new AbstractC11018d4.d();
        this.f28649w = new AbstractC11018d4.b();
        abstractC10294a0.m30868b(this, interfaceC10817e);
        this.f28634Y = true;
        InterfaceC11165o mo34623c = interfaceC11143d.mo34623c(looper, null);
        this.f28613D = new C11064l2(interfaceC11327a, mo34623c);
        this.f28614E = new C10999a3(this, interfaceC11327a, mo34623c, c11391m3);
        if (looper2 != null) {
            this.f28646t = null;
            this.f28647u = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.f28646t = handlerThread;
            handlerThread.start();
            this.f28647u = handlerThread.getLooper();
        }
        this.f28645s = interfaceC11143d.mo34623c(this.f28647u, this);
    }

    /* renamed from: A */
    private Pair<InterfaceC11684a0.b, Long> m34319A(AbstractC11018d4 abstractC11018d4) {
        if (abstractC11018d4.m34005v()) {
            return Pair.create(C11035g3.m34046k(), 0L);
        }
        Pair<Object, Long> m34002o = abstractC11018d4.m34002o(this.f28648v, this.f28649w, abstractC11018d4.mo33625f(this.f28626Q), -9223372036854775807L);
        InterfaceC11684a0.b m34270B = this.f28613D.m34270B(abstractC11018d4, m34002o.first, 0L);
        long longValue = ((Long) m34002o.second).longValue();
        if (m34270B.m37106b()) {
            abstractC11018d4.mo33628m(m34270B.f30974a, this.f28649w);
            longValue = m34270B.f30976c == this.f28649w.m34020o(m34270B.f30975b) ? this.f28649w.m34016k() : 0L;
        }
        return Pair.create(m34270B, Long.valueOf(longValue));
    }

    /* renamed from: B0 */
    private void m34320B0(boolean z10) {
        InterfaceC11684a0.b bVar = this.f28613D.m34281p().f28414f.f28461a;
        long m34326E0 = m34326E0(bVar, this.f28618I.f28301r, true, false);
        if (m34326E0 != this.f28618I.f28301r) {
            C11035g3 c11035g3 = this.f28618I;
            this.f28618I = m34339L(bVar, m34326E0, c11035g3.f28286c, c11035g3.f28287d, z10, 5);
        }
    }

    /* renamed from: C */
    private long m34321C() {
        return m34323D(this.f28618I.f28299p);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ac A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:6:0x00a2, B:8:0x00ac, B:15:0x00b2, B:17:0x00b8, B:18:0x00bb, B:19:0x00c1, B:21:0x00cb, B:23:0x00d3, B:27:0x00db, B:28:0x00e5, B:30:0x00f5, B:34:0x00ff, B:37:0x0111, B:40:0x011a), top: B:5:0x00a2 }] */
    /* renamed from: C0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m34322C0(p361t6.C11088q1.h r19) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p361t6.C11088q1.m34322C0(t6.q1$h):void");
    }

    /* renamed from: D */
    private long m34323D(long j10) {
        C11046i2 m34279j = this.f28613D.m34279j();
        if (m34279j == null) {
            return 0L;
        }
        return Math.max(0L, j10 - m34279j.m34157y(this.f28632W));
    }

    /* renamed from: D0 */
    private long m34324D0(InterfaceC11684a0.b bVar, long j10, boolean z10) {
        return m34326E0(bVar, j10, this.f28613D.m34281p() != this.f28613D.m34282q(), z10);
    }

    /* renamed from: E */
    private void m34325E(InterfaceC11739y interfaceC11739y) {
        if (this.f28613D.m34284v(interfaceC11739y)) {
            this.f28613D.m34285y(this.f28632W);
            m34355V();
        }
    }

    /* renamed from: E0 */
    private long m34326E0(InterfaceC11684a0.b bVar, long j10, boolean z10, boolean z11) {
        m34382i1();
        this.f28623N = false;
        if (z11 || this.f28618I.f28288e == 3) {
            m34364Z0(2);
        }
        C11046i2 m34281p = this.f28613D.m34281p();
        C11046i2 c11046i2 = m34281p;
        while (c11046i2 != null && !bVar.equals(c11046i2.f28414f.f28461a)) {
            c11046i2 = c11046i2.m34144j();
        }
        if (z10 || m34281p != c11046i2 || (c11046i2 != null && c11046i2.m34158z(j10) < 0)) {
            for (InterfaceC11090q3 interfaceC11090q3 : this.f28636a) {
                m34395o(interfaceC11090q3);
            }
            if (c11046i2 != null) {
                while (this.f28613D.m34281p() != c11046i2) {
                    this.f28613D.m34275b();
                }
                this.f28613D.m34286z(c11046i2);
                c11046i2.m34156x(1000000000000L);
                m34403r();
            }
        }
        C11064l2 c11064l2 = this.f28613D;
        if (c11046i2 != null) {
            c11064l2.m34286z(c11046i2);
            if (!c11046i2.f28412d) {
                c11046i2.f28414f = c11046i2.f28414f.m34193b(j10);
            } else if (c11046i2.f28413e) {
                long mo251j = c11046i2.f28409a.mo251j(j10);
                c11046i2.f28409a.mo256s(mo251j - this.f28650x, this.f28651y);
                j10 = mo251j;
            }
            m34406s0(j10);
            m34355V();
        } else {
            c11064l2.m34277f();
            m34406s0(j10);
        }
        m34329G(false);
        this.f28645s.mo34779i(2);
        return j10;
    }

    /* renamed from: F */
    private void m34327F(IOException iOException, int i10) {
        C11121x m34568h = C11121x.m34568h(iOException, i10);
        C11046i2 m34281p = this.f28613D.m34281p();
        if (m34281p != null) {
            m34568h = m34568h.m34572f(m34281p.f28414f.f28461a);
        }
        C11173s.m34965d("ExoPlayerImplInternal", "Playback error", m34568h);
        m34381h1(false, false);
        this.f28618I = this.f28618I.m34051e(m34568h);
    }

    /* renamed from: F0 */
    private void m34328F0(C11070m3 c11070m3) {
        if (c11070m3.m34293f() == -9223372036854775807L) {
            m34330G0(c11070m3);
            return;
        }
        if (this.f28618I.f28284a.m34005v()) {
            this.f28610A.add(new d(c11070m3));
            return;
        }
        d dVar = new d(c11070m3);
        AbstractC11018d4 abstractC11018d4 = this.f28618I.f28284a;
        if (!m34409u0(dVar, abstractC11018d4, abstractC11018d4, this.f28625P, this.f28626Q, this.f28648v, this.f28649w)) {
            c11070m3.m34298k(false);
        } else {
            this.f28610A.add(dVar);
            Collections.sort(this.f28610A);
        }
    }

    /* renamed from: G */
    private void m34329G(boolean z10) {
        C11046i2 m34279j = this.f28613D.m34279j();
        InterfaceC11684a0.b bVar = m34279j == null ? this.f28618I.f28285b : m34279j.f28414f.f28461a;
        boolean z11 = !this.f28618I.f28294k.equals(bVar);
        if (z11) {
            this.f28618I = this.f28618I.m34048b(bVar);
        }
        C11035g3 c11035g3 = this.f28618I;
        c11035g3.f28299p = m34279j == null ? c11035g3.f28301r : m34279j.m34143i();
        this.f28618I.f28300q = m34321C();
        if ((z11 || z10) && m34279j != null && m34279j.f28412d) {
            m34387k1(m34279j.m34148n(), m34279j.m34149o());
        }
    }

    /* renamed from: G0 */
    private void m34330G0(C11070m3 c11070m3) {
        if (c11070m3.m34290c() != this.f28647u) {
            this.f28645s.mo34774d(15, c11070m3).mo34784a();
            return;
        }
        m34393n(c11070m3);
        int i10 = this.f28618I.f28288e;
        if (i10 == 3 || i10 == 2) {
            this.f28645s.mo34779i(2);
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
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m34331H(p361t6.AbstractC11018d4 r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p361t6.C11088q1.m34331H(t6.d4, boolean):void");
    }

    /* renamed from: H0 */
    private void m34332H0(final C11070m3 c11070m3) {
        Looper m34290c = c11070m3.m34290c();
        if (m34290c.getThread().isAlive()) {
            this.f28611B.mo34623c(m34290c, null).mo34778h(new Runnable() { // from class: t6.p1
                @Override // java.lang.Runnable
                public final void run() {
                    C11088q1.this.m34354U(c11070m3);
                }
            });
        } else {
            C11173s.m34970i("TAG", "Trying to send message on a dead thread.");
            c11070m3.m34298k(false);
        }
    }

    /* renamed from: I */
    private void m34333I(InterfaceC11739y interfaceC11739y) {
        if (this.f28613D.m34284v(interfaceC11739y)) {
            C11046i2 m34279j = this.f28613D.m34279j();
            m34279j.m34150p(this.f28652z.mo34466c().f28428a, this.f28618I.f28284a);
            m34387k1(m34279j.m34148n(), m34279j.m34149o());
            if (m34279j == this.f28613D.m34281p()) {
                m34406s0(m34279j.f28414f.f28462b);
                m34403r();
                C11035g3 c11035g3 = this.f28618I;
                InterfaceC11684a0.b bVar = c11035g3.f28285b;
                long j10 = m34279j.f28414f.f28462b;
                this.f28618I = m34339L(bVar, j10, c11035g3.f28286c, j10, false, 5);
            }
            m34355V();
        }
    }

    /* renamed from: I0 */
    private void m34334I0(long j10) {
        for (InterfaceC11090q3 interfaceC11090q3 : this.f28636a) {
            if (interfaceC11090q3.mo34246h() != null) {
                m34336J0(interfaceC11090q3, j10);
            }
        }
    }

    /* renamed from: J */
    private void m34335J(C11047i3 c11047i3, float f10, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                this.f28619J.m34443b(1);
            }
            this.f28618I = this.f28618I.m34052f(c11047i3);
        }
        m34397o1(c11047i3.f28428a);
        for (InterfaceC11090q3 interfaceC11090q3 : this.f28636a) {
            if (interfaceC11090q3 != null) {
                interfaceC11090q3.mo27376x(f10, c11047i3.f28428a);
            }
        }
    }

    /* renamed from: J0 */
    private void m34336J0(InterfaceC11090q3 interfaceC11090q3, long j10) {
        interfaceC11090q3.mo34248k();
        if (interfaceC11090q3 instanceof C7499q) {
            ((C7499q) interfaceC11090q3).m22837i0(j10);
        }
    }

    /* renamed from: K */
    private void m34337K(C11047i3 c11047i3, boolean z10) {
        m34335J(c11047i3, c11047i3.f28428a, true, z10);
    }

    /* renamed from: K0 */
    private void m34338K0(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.f28627R != z10) {
            this.f28627R = z10;
            if (!z10) {
                for (InterfaceC11090q3 interfaceC11090q3 : this.f28636a) {
                    if (!m34348Q(interfaceC11090q3) && this.f28638b.remove(interfaceC11090q3)) {
                        interfaceC11090q3.reset();
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
    /* renamed from: L */
    private C11035g3 m34339L(InterfaceC11684a0.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        List list;
        C11700f1 c11700f1;
        C10296b0 c10296b0;
        this.f28634Y = (!this.f28634Y && j10 == this.f28618I.f28301r && bVar.equals(this.f28618I.f28285b)) ? false : true;
        m34404r0();
        C11035g3 c11035g3 = this.f28618I;
        C11700f1 c11700f12 = c11035g3.f28291h;
        C10296b0 c10296b02 = c11035g3.f28292i;
        List list2 = c11035g3.f28293j;
        if (this.f28614E.m33666s()) {
            C11046i2 m34281p = this.f28613D.m34281p();
            C11700f1 m34148n = m34281p == null ? C11700f1.f30689d : m34281p.m34148n();
            C10296b0 m34149o = m34281p == null ? this.f28642e : m34281p.m34149o();
            List m34410v = m34410v(m34149o.f25596c);
            if (m34281p != null) {
                C11052j2 c11052j2 = m34281p.f28414f;
                if (c11052j2.f28463c != j11) {
                    m34281p.f28414f = c11052j2.m34192a(j11);
                }
            }
            c11700f1 = m34148n;
            c10296b0 = m34149o;
            list = m34410v;
        } else if (bVar.equals(this.f28618I.f28285b)) {
            list = list2;
            c11700f1 = c11700f12;
            c10296b0 = c10296b02;
        } else {
            c11700f1 = C11700f1.f30689d;
            c10296b0 = this.f28642e;
            list = AbstractC5907w.m15081v();
        }
        if (z10) {
            this.f28619J.m34446e(i10);
        }
        return this.f28618I.m34049c(bVar, j10, j11, j12, m34321C(), c11700f1, c10296b0, list);
    }

    /* renamed from: L0 */
    private void m34340L0(C11047i3 c11047i3) {
        this.f28645s.mo34782l(16);
        this.f28652z.mo34465b(c11047i3);
    }

    /* renamed from: M */
    private boolean m34341M(InterfaceC11090q3 interfaceC11090q3, C11046i2 c11046i2) {
        C11046i2 m34144j = c11046i2.m34144j();
        return c11046i2.f28414f.f28466f && m34144j.f28412d && ((interfaceC11090q3 instanceof C7499q) || (interfaceC11090q3 instanceof C9405f) || interfaceC11090q3.mo34231C() >= m34144j.m34147m());
    }

    /* renamed from: M0 */
    private void m34342M0(b bVar) {
        this.f28619J.m34443b(1);
        if (bVar.f28656c != -1) {
            this.f28631V = new h(new C11075n3(bVar.f28654a, bVar.f28655b), bVar.f28656c, bVar.f28657d);
        }
        m34331H(this.f28614E.m33660C(bVar.f28654a, bVar.f28655b), false);
    }

    /* renamed from: N */
    private boolean m34343N() {
        C11046i2 m34282q = this.f28613D.m34282q();
        if (!m34282q.f28412d) {
            return false;
        }
        int i10 = 0;
        while (true) {
            InterfaceC11090q3[] interfaceC11090q3Arr = this.f28636a;
            if (i10 >= interfaceC11090q3Arr.length) {
                return true;
            }
            InterfaceC11090q3 interfaceC11090q3 = interfaceC11090q3Arr[i10];
            InterfaceC11734v0 interfaceC11734v0 = m34282q.f28411c[i10];
            if (interfaceC11090q3.mo34246h() != interfaceC11734v0 || (interfaceC11734v0 != null && !interfaceC11090q3.mo34247i() && !m34341M(interfaceC11090q3, m34282q))) {
                break;
            }
            i10++;
        }
        return false;
    }

    /* renamed from: O */
    private static boolean m34344O(boolean z10, InterfaceC11684a0.b bVar, long j10, InterfaceC11684a0.b bVar2, AbstractC11018d4.b bVar3, long j11) {
        if (!z10 && j10 == j11 && bVar.f30974a.equals(bVar2.f30974a)) {
            return (bVar.m37106b() && bVar3.m34026u(bVar.f30975b)) ? (bVar3.m34017l(bVar.f30975b, bVar.f30976c) == 4 || bVar3.m34017l(bVar.f30975b, bVar.f30976c) == 2) ? false : true : bVar2.m37106b() && bVar3.m34026u(bVar2.f30975b);
        }
        return false;
    }

    /* renamed from: O0 */
    private void m34345O0(boolean z10) {
        if (z10 == this.f28629T) {
            return;
        }
        this.f28629T = z10;
        if (z10 || !this.f28618I.f28298o) {
            return;
        }
        this.f28645s.mo34779i(2);
    }

    /* renamed from: P */
    private boolean m34346P() {
        C11046i2 m34279j = this.f28613D.m34279j();
        return (m34279j == null || m34279j.m34145k() == Long.MIN_VALUE) ? false : true;
    }

    /* renamed from: P0 */
    private void m34347P0(boolean z10) {
        this.f28621L = z10;
        m34404r0();
        if (!this.f28622M || this.f28613D.m34282q() == this.f28613D.m34281p()) {
            return;
        }
        m34320B0(true);
        m34329G(false);
    }

    /* renamed from: Q */
    private static boolean m34348Q(InterfaceC11090q3 interfaceC11090q3) {
        return interfaceC11090q3.getState() != 0;
    }

    /* renamed from: R */
    private boolean m34349R() {
        C11046i2 m34281p = this.f28613D.m34281p();
        long j10 = m34281p.f28414f.f28465e;
        return m34281p.f28412d && (j10 == -9223372036854775807L || this.f28618I.f28301r < j10 || !m34370c1());
    }

    /* renamed from: R0 */
    private void m34350R0(boolean z10, int i10, boolean z11, int i11) {
        this.f28619J.m34443b(z11 ? 1 : 0);
        this.f28619J.m34444c(i11);
        this.f28618I = this.f28618I.m34050d(z10, i10);
        this.f28623N = false;
        m34377f0(z10);
        if (!m34370c1()) {
            m34382i1();
            m34392m1();
            return;
        }
        int i12 = this.f28618I.f28288e;
        if (i12 == 3) {
            m34378f1();
        } else if (i12 != 2) {
            return;
        }
        this.f28645s.mo34779i(2);
    }

    /* renamed from: S */
    private static boolean m34351S(C11035g3 c11035g3, AbstractC11018d4.b bVar) {
        InterfaceC11684a0.b bVar2 = c11035g3.f28285b;
        AbstractC11018d4 abstractC11018d4 = c11035g3.f28284a;
        return abstractC11018d4.m34005v() || abstractC11018d4.mo33628m(bVar2.f30974a, bVar).f28230f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ Boolean m34352T() {
        return Boolean.valueOf(this.f28620K);
    }

    /* renamed from: T0 */
    private void m34353T0(C11047i3 c11047i3) {
        m34340L0(c11047i3);
        m34337K(this.f28652z.mo34466c(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ void m34354U(C11070m3 c11070m3) {
        try {
            m34393n(c11070m3);
        } catch (C11121x e10) {
            C11173s.m34965d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: V */
    private void m34355V() {
        boolean m34368b1 = m34368b1();
        this.f28624O = m34368b1;
        if (m34368b1) {
            this.f28613D.m34279j().m34142d(this.f28632W);
        }
        m34385j1();
    }

    /* renamed from: V0 */
    private void m34356V0(int i10) {
        this.f28625P = i10;
        if (!this.f28613D.m34273G(this.f28618I.f28284a, i10)) {
            m34320B0(true);
        }
        m34329G(false);
    }

    /* renamed from: W */
    private void m34357W() {
        this.f28619J.m34445d(this.f28618I);
        if (this.f28619J.f28666a) {
            this.f28612C.mo34447a(this.f28619J);
            this.f28619J = new e(this.f28618I);
        }
    }

    /* renamed from: W0 */
    private void m34358W0(C11110u3 c11110u3) {
        this.f28617H = c11110u3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        r3 = r7.f28610A.get(r1 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (r3 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        r4 = r3.f28663b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r4 > r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r4 != r0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r3.f28664c <= r8) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r1 >= r7.f28610A.size()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        r3 = r7.f28610A.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r3 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r3.f28665d == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        r4 = r3.f28663b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r4 < r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (r4 != r0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if (r3.f28664c > r8) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (r3 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r3.f28665d == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        if (r3.f28663b != r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
    
        r4 = r3.f28664c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        if (r4 <= r8) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        if (r4 > r10) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        m34330G0(r3.f28662a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
    
        if (r3.f28662a.m34289b() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ae, code lost:
    
        if (r3.f28662a.m34297j() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bf, code lost:
    
        if (r1 >= r7.f28610A.size()) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ca, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c1, code lost:
    
        r3 = r7.f28610A.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b4, code lost:
    
        r7.f28610A.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cc, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d3, code lost:
    
        if (r3.f28662a.m34289b() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e2, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dd, code lost:
    
        r7.f28610A.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e3, code lost:
    
        r7.f28633X = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x007c, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0084, code lost:
    
        if (r1 >= r7.f28610A.size()) goto L26;
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
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m34359X(long r8, long r10) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p361t6.C11088q1.m34359X(long, long):void");
    }

    /* renamed from: X0 */
    private void m34360X0(boolean z10) {
        this.f28626Q = z10;
        if (!this.f28613D.m34274H(this.f28618I.f28284a, z10)) {
            m34320B0(true);
        }
        m34329G(false);
    }

    /* renamed from: Y */
    private void m34361Y() {
        C11052j2 m34280o;
        this.f28613D.m34285y(this.f28632W);
        if (this.f28613D.m34271D() && (m34280o = this.f28613D.m34280o(this.f28632W, this.f28618I)) != null) {
            C11046i2 m34278g = this.f28613D.m34278g(this.f28640c, this.f28641d, this.f28643f.mo33636d(), this.f28614E, m34280o, this.f28642e);
            m34278g.f28409a.mo252k(this, m34280o.f28462b);
            if (this.f28613D.m34281p() == m34278g) {
                m34406s0(m34280o.f28462b);
            }
            m34329G(false);
        }
        if (!this.f28624O) {
            m34355V();
        } else {
            this.f28624O = m34346P();
            m34385j1();
        }
    }

    /* renamed from: Y0 */
    private void m34362Y0(InterfaceC11738x0 interfaceC11738x0) {
        this.f28619J.m34443b(1);
        m34331H(this.f28614E.m33661D(interfaceC11738x0), false);
    }

    /* renamed from: Z */
    private void m34363Z() {
        boolean z10;
        boolean z11 = false;
        while (m34366a1()) {
            if (z11) {
                m34357W();
            }
            C11046i2 c11046i2 = (C11046i2) C11137a.m34603e(this.f28613D.m34275b());
            if (this.f28618I.f28285b.f30974a.equals(c11046i2.f28414f.f28461a.f30974a)) {
                InterfaceC11684a0.b bVar = this.f28618I.f28285b;
                if (bVar.f30975b == -1) {
                    InterfaceC11684a0.b bVar2 = c11046i2.f28414f.f28461a;
                    if (bVar2.f30975b == -1 && bVar.f30978e != bVar2.f30978e) {
                        z10 = true;
                        C11052j2 c11052j2 = c11046i2.f28414f;
                        InterfaceC11684a0.b bVar3 = c11052j2.f28461a;
                        long j10 = c11052j2.f28462b;
                        this.f28618I = m34339L(bVar3, j10, c11052j2.f28463c, j10, !z10, 0);
                        m34404r0();
                        m34392m1();
                        z11 = true;
                    }
                }
            }
            z10 = false;
            C11052j2 c11052j22 = c11046i2.f28414f;
            InterfaceC11684a0.b bVar32 = c11052j22.f28461a;
            long j102 = c11052j22.f28462b;
            this.f28618I = m34339L(bVar32, j102, c11052j22.f28463c, j102, !z10, 0);
            m34404r0();
            m34392m1();
            z11 = true;
        }
    }

    /* renamed from: Z0 */
    private void m34364Z0(int i10) {
        C11035g3 c11035g3 = this.f28618I;
        if (c11035g3.f28288e != i10) {
            if (i10 != 2) {
                this.f28639b0 = -9223372036854775807L;
            }
            this.f28618I = c11035g3.m34053g(i10);
        }
    }

    /* renamed from: a0 */
    private void m34365a0() {
        C11046i2 m34282q = this.f28613D.m34282q();
        if (m34282q == null) {
            return;
        }
        int i10 = 0;
        if (m34282q.m34144j() != null && !this.f28622M) {
            if (m34343N()) {
                if (m34282q.m34144j().f28412d || this.f28632W >= m34282q.m34144j().m34147m()) {
                    C10296b0 m34149o = m34282q.m34149o();
                    C11046i2 m34276c = this.f28613D.m34276c();
                    C10296b0 m34149o2 = m34276c.m34149o();
                    AbstractC11018d4 abstractC11018d4 = this.f28618I.f28284a;
                    m34394n1(abstractC11018d4, m34276c.f28414f.f28461a, abstractC11018d4, m34282q.f28414f.f28461a, -9223372036854775807L, false);
                    if (m34276c.f28412d && m34276c.f28409a.mo253l() != -9223372036854775807L) {
                        m34334I0(m34276c.m34147m());
                        return;
                    }
                    for (int i11 = 0; i11 < this.f28636a.length; i11++) {
                        boolean m30878c = m34149o.m30878c(i11);
                        boolean m30878c2 = m34149o2.m30878c(i11);
                        if (m30878c && !this.f28636a[i11].mo34250r()) {
                            boolean z10 = this.f28640c[i11].mo34245g() == -2;
                            C11100s3 c11100s3 = m34149o.f25595b[i11];
                            C11100s3 c11100s32 = m34149o2.f25595b[i11];
                            if (!m30878c2 || !c11100s32.equals(c11100s3) || z10) {
                                m34336J0(this.f28636a[i11], m34276c.m34147m());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!m34282q.f28414f.f28469i && !this.f28622M) {
            return;
        }
        while (true) {
            InterfaceC11090q3[] interfaceC11090q3Arr = this.f28636a;
            if (i10 >= interfaceC11090q3Arr.length) {
                return;
            }
            InterfaceC11090q3 interfaceC11090q3 = interfaceC11090q3Arr[i10];
            InterfaceC11734v0 interfaceC11734v0 = m34282q.f28411c[i10];
            if (interfaceC11734v0 != null && interfaceC11090q3.mo34246h() == interfaceC11734v0 && interfaceC11090q3.mo34247i()) {
                long j10 = m34282q.f28414f.f28465e;
                m34336J0(interfaceC11090q3, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : m34282q.m34146l() + m34282q.f28414f.f28465e);
            }
            i10++;
        }
    }

    /* renamed from: a1 */
    private boolean m34366a1() {
        C11046i2 m34281p;
        C11046i2 m34144j;
        return m34370c1() && !this.f28622M && (m34281p = this.f28613D.m34281p()) != null && (m34144j = m34281p.m34144j()) != null && this.f28632W >= m34144j.m34147m() && m34144j.f28415g;
    }

    /* renamed from: b0 */
    private void m34367b0() {
        C11046i2 m34282q = this.f28613D.m34282q();
        if (m34282q == null || this.f28613D.m34281p() == m34282q || m34282q.f28415g || !m34396o0()) {
            return;
        }
        m34403r();
    }

    /* renamed from: b1 */
    private boolean m34368b1() {
        if (!m34346P()) {
            return false;
        }
        C11046i2 m34279j = this.f28613D.m34279j();
        long m34323D = m34323D(m34279j.m34145k());
        long m34157y = m34279j == this.f28613D.m34281p() ? m34279j.m34157y(this.f28632W) : m34279j.m34157y(this.f28632W) - m34279j.f28414f.f28462b;
        boolean mo33640h = this.f28643f.mo33640h(m34157y, m34323D, this.f28652z.mo34466c().f28428a);
        if (mo33640h || m34323D >= 500000) {
            return mo33640h;
        }
        if (this.f28650x <= 0 && !this.f28651y) {
            return mo33640h;
        }
        this.f28613D.m34281p().f28409a.mo256s(this.f28618I.f28301r, false);
        return this.f28643f.mo33640h(m34157y, m34323D, this.f28652z.mo34466c().f28428a);
    }

    /* renamed from: c0 */
    private void m34369c0() {
        m34331H(this.f28614E.m33664i(), true);
    }

    /* renamed from: c1 */
    private boolean m34370c1() {
        C11035g3 c11035g3 = this.f28618I;
        return c11035g3.f28295l && c11035g3.f28296m == 0;
    }

    /* renamed from: d0 */
    private void m34371d0(c cVar) {
        this.f28619J.m34443b(1);
        m34331H(this.f28614E.m33667v(cVar.f28658a, cVar.f28659b, cVar.f28660c, cVar.f28661d), false);
    }

    /* renamed from: d1 */
    private boolean m34372d1(boolean z10) {
        if (this.f28630U == 0) {
            return m34349R();
        }
        if (!z10) {
            return false;
        }
        C11035g3 c11035g3 = this.f28618I;
        if (!c11035g3.f28290g) {
            return true;
        }
        long mo34314c = m34375e1(c11035g3.f28284a, this.f28613D.m34281p().f28414f.f28461a) ? this.f28615F.mo34314c() : -9223372036854775807L;
        C11046i2 m34279j = this.f28613D.m34279j();
        return (m34279j.m34151q() && m34279j.f28414f.f28469i) || (m34279j.f28414f.f28461a.m37106b() && !m34279j.f28412d) || this.f28643f.mo33635c(m34321C(), this.f28652z.mo34466c().f28428a, this.f28623N, mo34314c);
    }

    /* renamed from: e0 */
    private void m34374e0() {
        for (C11046i2 m34281p = this.f28613D.m34281p(); m34281p != null; m34281p = m34281p.m34144j()) {
            for (InterfaceC10312r interfaceC10312r : m34281p.m34149o().f25596c) {
                if (interfaceC10312r != null) {
                    interfaceC10312r.mo31034n();
                }
            }
        }
    }

    /* renamed from: e1 */
    private boolean m34375e1(AbstractC11018d4 abstractC11018d4, InterfaceC11684a0.b bVar) {
        if (bVar.m37106b() || abstractC11018d4.m34005v()) {
            return false;
        }
        abstractC11018d4.m34004s(abstractC11018d4.mo33628m(bVar.f30974a, this.f28649w).f28227c, this.f28648v);
        if (!this.f28648v.m34036i()) {
            return false;
        }
        AbstractC11018d4.d dVar = this.f28648v;
        return dVar.f28263t && dVar.f28260f != -9223372036854775807L;
    }

    /* renamed from: f0 */
    private void m34377f0(boolean z10) {
        for (C11046i2 m34281p = this.f28613D.m34281p(); m34281p != null; m34281p = m34281p.m34144j()) {
            for (InterfaceC10312r interfaceC10312r : m34281p.m34149o().f25596c) {
                if (interfaceC10312r != null) {
                    interfaceC10312r.mo31035o(z10);
                }
            }
        }
    }

    /* renamed from: f1 */
    private void m34378f1() {
        this.f28623N = false;
        this.f28652z.m34469g();
        for (InterfaceC11090q3 interfaceC11090q3 : this.f28636a) {
            if (m34348Q(interfaceC11090q3)) {
                interfaceC11090q3.start();
            }
        }
    }

    /* renamed from: g0 */
    private void m34380g0() {
        for (C11046i2 m34281p = this.f28613D.m34281p(); m34281p != null; m34281p = m34281p.m34144j()) {
            for (InterfaceC10312r interfaceC10312r : m34281p.m34149o().f25596c) {
                if (interfaceC10312r != null) {
                    interfaceC10312r.mo31036u();
                }
            }
        }
    }

    /* renamed from: h1 */
    private void m34381h1(boolean z10, boolean z11) {
        m34402q0(z10 || !this.f28627R, false, true, false);
        this.f28619J.m34443b(z11 ? 1 : 0);
        this.f28643f.mo33637e();
        m34364Z0(1);
    }

    /* renamed from: i1 */
    private void m34382i1() {
        this.f28652z.m34470h();
        for (InterfaceC11090q3 interfaceC11090q3 : this.f28636a) {
            if (m34348Q(interfaceC11090q3)) {
                m34407t(interfaceC11090q3);
            }
        }
    }

    /* renamed from: j0 */
    private void m34384j0() {
        this.f28619J.m34443b(1);
        m34402q0(false, false, false, true);
        this.f28643f.onPrepared();
        m34364Z0(this.f28618I.f28284a.m34005v() ? 4 : 2);
        this.f28614E.m33668w(this.f28644r.mo32958d());
        this.f28645s.mo34779i(2);
    }

    /* renamed from: j1 */
    private void m34385j1() {
        C11046i2 m34279j = this.f28613D.m34279j();
        boolean z10 = this.f28624O || (m34279j != null && m34279j.f28409a.isLoading());
        C11035g3 c11035g3 = this.f28618I;
        if (z10 != c11035g3.f28290g) {
            this.f28618I = c11035g3.m34047a(z10);
        }
    }

    /* renamed from: k */
    private void m34386k(b bVar, int i10) {
        this.f28619J.m34443b(1);
        C10999a3 c10999a3 = this.f28614E;
        if (i10 == -1) {
            i10 = c10999a3.m33665q();
        }
        m34331H(c10999a3.m33662f(i10, bVar.f28654a, bVar.f28655b), false);
    }

    /* renamed from: k1 */
    private void m34387k1(C11700f1 c11700f1, C10296b0 c10296b0) {
        this.f28643f.mo33638f(this.f28636a, c11700f1, c10296b0.f25596c);
    }

    /* renamed from: l0 */
    private void m34388l0() {
        m34402q0(true, false, true, false);
        this.f28643f.mo33639g();
        m34364Z0(1);
        HandlerThread handlerThread = this.f28646t;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.f28620K = true;
            notifyAll();
        }
    }

    /* renamed from: l1 */
    private void m34389l1() {
        if (this.f28618I.f28284a.m34005v() || !this.f28614E.m33666s()) {
            return;
        }
        m34361Y();
        m34365a0();
        m34367b0();
        m34363Z();
    }

    /* renamed from: m */
    private void m34390m() {
        m34320B0(true);
    }

    /* renamed from: m0 */
    private void m34391m0(int i10, int i11, InterfaceC11738x0 interfaceC11738x0) {
        this.f28619J.m34443b(1);
        m34331H(this.f28614E.m33659A(i10, i11, interfaceC11738x0), false);
    }

    /* renamed from: m1 */
    private void m34392m1() {
        C11046i2 m34281p = this.f28613D.m34281p();
        if (m34281p == null) {
            return;
        }
        long mo253l = m34281p.f28412d ? m34281p.f28409a.mo253l() : -9223372036854775807L;
        if (mo253l != -9223372036854775807L) {
            m34406s0(mo253l);
            if (mo253l != this.f28618I.f28301r) {
                C11035g3 c11035g3 = this.f28618I;
                this.f28618I = m34339L(c11035g3.f28285b, mo253l, c11035g3.f28286c, mo253l, true, 5);
            }
        } else {
            long m34471i = this.f28652z.m34471i(m34281p != this.f28613D.m34282q());
            this.f28632W = m34471i;
            long m34157y = m34281p.m34157y(m34471i);
            m34359X(this.f28618I.f28301r, m34157y);
            this.f28618I.f28301r = m34157y;
        }
        this.f28618I.f28299p = this.f28613D.m34279j().m34143i();
        this.f28618I.f28300q = m34321C();
        C11035g3 c11035g32 = this.f28618I;
        if (c11035g32.f28295l && c11035g32.f28288e == 3 && m34375e1(c11035g32.f28284a, c11035g32.f28285b) && this.f28618I.f28297n.f28428a == 1.0f) {
            float mo34313b = this.f28615F.mo34313b(m34412w(), m34321C());
            if (this.f28652z.mo34466c().f28428a != mo34313b) {
                m34340L0(this.f28618I.f28297n.m34162e(mo34313b));
                m34335J(this.f28618I.f28297n, this.f28652z.mo34466c().f28428a, false, false);
            }
        }
    }

    /* renamed from: n */
    private void m34393n(C11070m3 c11070m3) {
        if (c11070m3.m34297j()) {
            return;
        }
        try {
            c11070m3.m34294g().mo33992p(c11070m3.m34296i(), c11070m3.m34292e());
        } finally {
            c11070m3.m34298k(true);
        }
    }

    /* renamed from: n1 */
    private void m34394n1(AbstractC11018d4 abstractC11018d4, InterfaceC11684a0.b bVar, AbstractC11018d4 abstractC11018d42, InterfaceC11684a0.b bVar2, long j10, boolean z10) {
        if (!m34375e1(abstractC11018d4, bVar)) {
            C11047i3 c11047i3 = bVar.m37106b() ? C11047i3.f28424d : this.f28618I.f28297n;
            if (this.f28652z.mo34466c().equals(c11047i3)) {
                return;
            }
            m34340L0(c11047i3);
            m34335J(this.f28618I.f28297n, c11047i3.f28428a, false, false);
            return;
        }
        abstractC11018d4.m34004s(abstractC11018d4.mo33628m(bVar.f30974a, this.f28649w).f28227c, this.f28648v);
        this.f28615F.mo34312a((C11010c2.g) C11172r0.m34928j(this.f28648v.f28265v));
        if (j10 != -9223372036854775807L) {
            this.f28615F.mo34316e(m34416y(abstractC11018d4, bVar.f30974a, j10));
            return;
        }
        if (!C11172r0.m34914c(!abstractC11018d42.m34005v() ? abstractC11018d42.m34004s(abstractC11018d42.mo33628m(bVar2.f30974a, this.f28649w).f28227c, this.f28648v).f28255a : null, this.f28648v.f28255a) || z10) {
            this.f28615F.mo34316e(-9223372036854775807L);
        }
    }

    /* renamed from: o */
    private void m34395o(InterfaceC11090q3 interfaceC11090q3) {
        if (m34348Q(interfaceC11090q3)) {
            this.f28652z.m34464a(interfaceC11090q3);
            m34407t(interfaceC11090q3);
            interfaceC11090q3.mo34244f();
            this.f28630U--;
        }
    }

    /* renamed from: o0 */
    private boolean m34396o0() {
        C11046i2 m34282q = this.f28613D.m34282q();
        C10296b0 m34149o = m34282q.m34149o();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            InterfaceC11090q3[] interfaceC11090q3Arr = this.f28636a;
            if (i10 >= interfaceC11090q3Arr.length) {
                return !z10;
            }
            InterfaceC11090q3 interfaceC11090q3 = interfaceC11090q3Arr[i10];
            if (m34348Q(interfaceC11090q3)) {
                boolean z11 = interfaceC11090q3.mo34246h() != m34282q.f28411c[i10];
                if (!m34149o.m30878c(i10) || z11) {
                    if (!interfaceC11090q3.mo34250r()) {
                        interfaceC11090q3.mo34229A(m34414x(m34149o.f25596c[i10]), m34282q.f28411c[i10], m34282q.m34147m(), m34282q.m34146l());
                    } else if (interfaceC11090q3.mo22836e()) {
                        m34395o(interfaceC11090q3);
                    } else {
                        z10 = true;
                    }
                }
            }
            i10++;
        }
    }

    /* renamed from: o1 */
    private void m34397o1(float f10) {
        for (C11046i2 m34281p = this.f28613D.m34281p(); m34281p != null; m34281p = m34281p.m34144j()) {
            for (InterfaceC10312r interfaceC10312r : m34281p.m34149o().f25596c) {
                if (interfaceC10312r != null) {
                    interfaceC10312r.mo30861l(f10);
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
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m34398p() {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p361t6.C11088q1.m34398p():void");
    }

    /* renamed from: p0 */
    private void m34399p0() {
        float f10 = this.f28652z.mo34466c().f28428a;
        C11046i2 m34282q = this.f28613D.m34282q();
        boolean z10 = true;
        for (C11046i2 m34281p = this.f28613D.m34281p(); m34281p != null && m34281p.f28412d; m34281p = m34281p.m34144j()) {
            C10296b0 m34154v = m34281p.m34154v(f10, this.f28618I.f28284a);
            if (!m34154v.m30876a(m34281p.m34149o())) {
                C11064l2 c11064l2 = this.f28613D;
                if (z10) {
                    C11046i2 m34281p2 = c11064l2.m34281p();
                    boolean m34286z = this.f28613D.m34286z(m34281p2);
                    boolean[] zArr = new boolean[this.f28636a.length];
                    long m34141b = m34281p2.m34141b(m34154v, this.f28618I.f28301r, m34286z, zArr);
                    C11035g3 c11035g3 = this.f28618I;
                    boolean z11 = (c11035g3.f28288e == 4 || m34141b == c11035g3.f28301r) ? false : true;
                    C11035g3 c11035g32 = this.f28618I;
                    this.f28618I = m34339L(c11035g32.f28285b, m34141b, c11035g32.f28286c, c11035g32.f28287d, z11, 5);
                    if (z11) {
                        m34406s0(m34141b);
                    }
                    boolean[] zArr2 = new boolean[this.f28636a.length];
                    int i10 = 0;
                    while (true) {
                        InterfaceC11090q3[] interfaceC11090q3Arr = this.f28636a;
                        if (i10 >= interfaceC11090q3Arr.length) {
                            break;
                        }
                        InterfaceC11090q3 interfaceC11090q3 = interfaceC11090q3Arr[i10];
                        boolean m34348Q = m34348Q(interfaceC11090q3);
                        zArr2[i10] = m34348Q;
                        InterfaceC11734v0 interfaceC11734v0 = m34281p2.f28411c[i10];
                        if (m34348Q) {
                            if (interfaceC11734v0 != interfaceC11090q3.mo34246h()) {
                                m34395o(interfaceC11090q3);
                            } else if (zArr[i10]) {
                                interfaceC11090q3.mo34232D(this.f28632W);
                            }
                        }
                        i10++;
                    }
                    m34405s(zArr2);
                } else {
                    c11064l2.m34286z(m34281p);
                    if (m34281p.f28412d) {
                        m34281p.m34140a(m34154v, Math.max(m34281p.f28414f.f28462b, m34281p.m34157y(this.f28632W)), false);
                    }
                }
                m34329G(true);
                if (this.f28618I.f28288e != 4) {
                    m34355V();
                    m34392m1();
                    this.f28645s.mo34779i(2);
                    return;
                }
                return;
            }
            if (m34281p == m34282q) {
                z10 = false;
            }
        }
    }

    /* renamed from: p1 */
    private synchronized void m34400p1(InterfaceC7166v<Boolean> interfaceC7166v, long j10) {
        long mo34622b = this.f28611B.mo34622b() + j10;
        boolean z10 = false;
        while (!interfaceC7166v.get().booleanValue() && j10 > 0) {
            try {
                this.f28611B.mo34624d();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = mo34622b - this.f28611B.mo34622b();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: q */
    private void m34401q(int i10, boolean z10) {
        InterfaceC11090q3 interfaceC11090q3 = this.f28636a[i10];
        if (m34348Q(interfaceC11090q3)) {
            return;
        }
        C11046i2 m34282q = this.f28613D.m34282q();
        boolean z11 = m34282q == this.f28613D.m34281p();
        C10296b0 m34149o = m34282q.m34149o();
        C11100s3 c11100s3 = m34149o.f25595b[i10];
        C11108u1[] m34414x = m34414x(m34149o.f25596c[i10]);
        boolean z12 = m34370c1() && this.f28618I.f28288e == 3;
        boolean z13 = !z10 && z12;
        this.f28630U++;
        this.f28638b.add(interfaceC11090q3);
        interfaceC11090q3.mo34230B(c11100s3, m34414x, m34282q.f28411c[i10], this.f28632W, z13, z11, m34282q.m34147m(), m34282q.m34146l());
        interfaceC11090q3.mo33992p(11, new a());
        this.f28652z.m34467d(interfaceC11090q3);
        if (z12) {
            interfaceC11090q3.start();
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
    /* renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m34402q0(boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p361t6.C11088q1.m34402q0(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: r */
    private void m34403r() {
        m34405s(new boolean[this.f28636a.length]);
    }

    /* renamed from: r0 */
    private void m34404r0() {
        C11046i2 m34281p = this.f28613D.m34281p();
        this.f28622M = m34281p != null && m34281p.f28414f.f28468h && this.f28621L;
    }

    /* renamed from: s */
    private void m34405s(boolean[] zArr) {
        C11046i2 m34282q = this.f28613D.m34282q();
        C10296b0 m34149o = m34282q.m34149o();
        for (int i10 = 0; i10 < this.f28636a.length; i10++) {
            if (!m34149o.m30878c(i10) && this.f28638b.remove(this.f28636a[i10])) {
                this.f28636a[i10].reset();
            }
        }
        for (int i11 = 0; i11 < this.f28636a.length; i11++) {
            if (m34149o.m30878c(i11)) {
                m34401q(i11, zArr[i11]);
            }
        }
        m34282q.f28415g = true;
    }

    /* renamed from: s0 */
    private void m34406s0(long j10) {
        C11046i2 m34281p = this.f28613D.m34281p();
        long m34158z = m34281p == null ? j10 + 1000000000000L : m34281p.m34158z(j10);
        this.f28632W = m34158z;
        this.f28652z.m34468e(m34158z);
        for (InterfaceC11090q3 interfaceC11090q3 : this.f28636a) {
            if (m34348Q(interfaceC11090q3)) {
                interfaceC11090q3.mo34232D(this.f28632W);
            }
        }
        m34374e0();
    }

    /* renamed from: t */
    private void m34407t(InterfaceC11090q3 interfaceC11090q3) {
        if (interfaceC11090q3.getState() == 2) {
            interfaceC11090q3.stop();
        }
    }

    /* renamed from: t0 */
    private static void m34408t0(AbstractC11018d4 abstractC11018d4, d dVar, AbstractC11018d4.d dVar2, AbstractC11018d4.b bVar) {
        int i10 = abstractC11018d4.m34004s(abstractC11018d4.mo33628m(dVar.f28665d, bVar).f28227c, dVar2).f28253A;
        Object obj = abstractC11018d4.mo11857l(i10, bVar, true).f28226b;
        long j10 = bVar.f28228d;
        dVar.m34441h(i10, j10 != -9223372036854775807L ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    /* renamed from: u0 */
    private static boolean m34409u0(d dVar, AbstractC11018d4 abstractC11018d4, AbstractC11018d4 abstractC11018d42, int i10, boolean z10, AbstractC11018d4.d dVar2, AbstractC11018d4.b bVar) {
        Object obj = dVar.f28665d;
        if (obj == null) {
            Pair<Object, Long> m34415x0 = m34415x0(abstractC11018d4, new h(dVar.f28662a.m34295h(), dVar.f28662a.m34291d(), dVar.f28662a.m34293f() == Long.MIN_VALUE ? -9223372036854775807L : C11172r0.m34861C0(dVar.f28662a.m34293f())), false, i10, z10, dVar2, bVar);
            if (m34415x0 == null) {
                return false;
            }
            dVar.m34441h(abstractC11018d4.mo11856g(m34415x0.first), ((Long) m34415x0.second).longValue(), m34415x0.first);
            if (dVar.f28662a.m34293f() == Long.MIN_VALUE) {
                m34408t0(abstractC11018d4, dVar, dVar2, bVar);
            }
            return true;
        }
        int mo11856g = abstractC11018d4.mo11856g(obj);
        if (mo11856g == -1) {
            return false;
        }
        if (dVar.f28662a.m34293f() == Long.MIN_VALUE) {
            m34408t0(abstractC11018d4, dVar, dVar2, bVar);
            return true;
        }
        dVar.f28663b = mo11856g;
        abstractC11018d42.mo33628m(dVar.f28665d, bVar);
        if (bVar.f28230f && abstractC11018d42.m34004s(bVar.f28227c, dVar2).f28269z == abstractC11018d42.mo11856g(dVar.f28665d)) {
            Pair<Object, Long> m34002o = abstractC11018d4.m34002o(dVar2, bVar, abstractC11018d4.mo33628m(dVar.f28665d, bVar).f28227c, dVar.f28664c + bVar.m34023r());
            dVar.m34441h(abstractC11018d4.mo11856g(m34002o.first), ((Long) m34002o.second).longValue(), m34002o.first);
        }
        return true;
    }

    /* renamed from: v */
    private AbstractC5907w<C9400a> m34410v(InterfaceC10312r[] interfaceC10312rArr) {
        AbstractC5907w.a aVar = new AbstractC5907w.a();
        boolean z10 = false;
        for (InterfaceC10312r interfaceC10312r : interfaceC10312rArr) {
            if (interfaceC10312r != null) {
                C9400a c9400a = interfaceC10312r.mo30881a(0).f28795u;
                if (c9400a == null) {
                    aVar.mo14724a(new C9400a(new C9400a.b[0]));
                } else {
                    aVar.mo14724a(c9400a);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.m15094k() : AbstractC5907w.m15081v();
    }

    /* renamed from: v0 */
    private void m34411v0(AbstractC11018d4 abstractC11018d4, AbstractC11018d4 abstractC11018d42) {
        if (abstractC11018d4.m34005v() && abstractC11018d42.m34005v()) {
            return;
        }
        for (int size = this.f28610A.size() - 1; size >= 0; size--) {
            if (!m34409u0(this.f28610A.get(size), abstractC11018d4, abstractC11018d42, this.f28625P, this.f28626Q, this.f28648v, this.f28649w)) {
                this.f28610A.get(size).f28662a.m34298k(false);
                this.f28610A.remove(size);
            }
        }
        Collections.sort(this.f28610A);
    }

    /* renamed from: w */
    private long m34412w() {
        C11035g3 c11035g3 = this.f28618I;
        return m34416y(c11035g3.f28284a, c11035g3.f28285b.f30974a, c11035g3.f28301r);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0175  */
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p361t6.C11088q1.g m34413w0(p361t6.AbstractC11018d4 r30, p361t6.C11035g3 r31, p361t6.C11088q1.h r32, p361t6.C11064l2 r33, int r34, boolean r35, p361t6.AbstractC11018d4.d r36, p361t6.AbstractC11018d4.b r37) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p361t6.C11088q1.m34413w0(t6.d4, t6.g3, t6.q1$h, t6.l2, int, boolean, t6.d4$d, t6.d4$b):t6.q1$g");
    }

    /* renamed from: x */
    private static C11108u1[] m34414x(InterfaceC10312r interfaceC10312r) {
        int length = interfaceC10312r != null ? interfaceC10312r.length() : 0;
        C11108u1[] c11108u1Arr = new C11108u1[length];
        for (int i10 = 0; i10 < length; i10++) {
            c11108u1Arr[i10] = interfaceC10312r.mo30881a(i10);
        }
        return c11108u1Arr;
    }

    /* renamed from: x0 */
    private static Pair<Object, Long> m34415x0(AbstractC11018d4 abstractC11018d4, h hVar, boolean z10, int i10, boolean z11, AbstractC11018d4.d dVar, AbstractC11018d4.b bVar) {
        Pair<Object, Long> m34002o;
        Object m34417y0;
        AbstractC11018d4 abstractC11018d42 = hVar.f28679a;
        if (abstractC11018d4.m34005v()) {
            return null;
        }
        AbstractC11018d4 abstractC11018d43 = abstractC11018d42.m34005v() ? abstractC11018d4 : abstractC11018d42;
        try {
            m34002o = abstractC11018d43.m34002o(dVar, bVar, hVar.f28680b, hVar.f28681c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (abstractC11018d4.equals(abstractC11018d43)) {
            return m34002o;
        }
        if (abstractC11018d4.mo11856g(m34002o.first) != -1) {
            return (abstractC11018d43.mo33628m(m34002o.first, bVar).f28230f && abstractC11018d43.m34004s(bVar.f28227c, dVar).f28269z == abstractC11018d43.mo11856g(m34002o.first)) ? abstractC11018d4.m34002o(dVar, bVar, abstractC11018d4.mo33628m(m34002o.first, bVar).f28227c, hVar.f28681c) : m34002o;
        }
        if (z10 && (m34417y0 = m34417y0(dVar, bVar, i10, z11, m34002o.first, abstractC11018d43, abstractC11018d4)) != null) {
            return abstractC11018d4.m34002o(dVar, bVar, abstractC11018d4.mo33628m(m34417y0, bVar).f28227c, -9223372036854775807L);
        }
        return null;
    }

    /* renamed from: y */
    private long m34416y(AbstractC11018d4 abstractC11018d4, Object obj, long j10) {
        abstractC11018d4.m34004s(abstractC11018d4.mo33628m(obj, this.f28649w).f28227c, this.f28648v);
        AbstractC11018d4.d dVar = this.f28648v;
        if (dVar.f28260f != -9223372036854775807L && dVar.m34036i()) {
            AbstractC11018d4.d dVar2 = this.f28648v;
            if (dVar2.f28263t) {
                return C11172r0.m34861C0(dVar2.m34031d() - this.f28648v.f28260f) - (j10 + this.f28649w.m34023r());
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y0 */
    public static Object m34417y0(AbstractC11018d4.d dVar, AbstractC11018d4.b bVar, int i10, boolean z10, Object obj, AbstractC11018d4 abstractC11018d4, AbstractC11018d4 abstractC11018d42) {
        int mo11856g = abstractC11018d4.mo11856g(obj);
        int mo11858n = abstractC11018d4.mo11858n();
        int i11 = mo11856g;
        int i12 = -1;
        for (int i13 = 0; i13 < mo11858n && i12 == -1; i13++) {
            i11 = abstractC11018d4.m34000i(i11, bVar, dVar, i10, z10);
            if (i11 == -1) {
                break;
            }
            i12 = abstractC11018d42.mo11856g(abstractC11018d4.mo11859r(i11));
        }
        if (i12 == -1) {
            return null;
        }
        return abstractC11018d42.mo11859r(i12);
    }

    /* renamed from: z */
    private long m34418z() {
        C11046i2 m34282q = this.f28613D.m34282q();
        if (m34282q == null) {
            return 0L;
        }
        long m34146l = m34282q.m34146l();
        if (!m34282q.f28412d) {
            return m34146l;
        }
        int i10 = 0;
        while (true) {
            InterfaceC11090q3[] interfaceC11090q3Arr = this.f28636a;
            if (i10 >= interfaceC11090q3Arr.length) {
                return m34146l;
            }
            if (m34348Q(interfaceC11090q3Arr[i10]) && this.f28636a[i10].mo34246h() == m34282q.f28411c[i10]) {
                long mo34231C = this.f28636a[i10].mo34231C();
                if (mo34231C == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                m34146l = Math.max(mo34231C, m34146l);
            }
            i10++;
        }
    }

    /* renamed from: z0 */
    private void m34419z0(long j10, long j11) {
        this.f28645s.mo34780j(2, j10 + j11);
    }

    /* renamed from: A0 */
    public void m34420A0(AbstractC11018d4 abstractC11018d4, int i10, long j10) {
        this.f28645s.mo34774d(3, new h(abstractC11018d4, i10, j10)).mo34784a();
    }

    /* renamed from: B */
    public Looper m34421B() {
        return this.f28647u;
    }

    /* renamed from: N0 */
    public void m34422N0(List<C10999a3.c> list, int i10, long j10, InterfaceC11738x0 interfaceC11738x0) {
        this.f28645s.mo34774d(17, new b(list, interfaceC11738x0, i10, j10, null)).mo34784a();
    }

    /* renamed from: Q0 */
    public void m34423Q0(boolean z10, int i10) {
        this.f28645s.mo34777g(1, z10 ? 1 : 0, i10).mo34784a();
    }

    /* renamed from: S0 */
    public void m34424S0(C11047i3 c11047i3) {
        this.f28645s.mo34774d(4, c11047i3).mo34784a();
    }

    /* renamed from: U0 */
    public void m34425U0(int i10) {
        this.f28645s.mo34777g(11, i10, 0).mo34784a();
    }

    @Override // p307q8.AbstractC10294a0.a
    /* renamed from: b */
    public void mo30875b() {
        this.f28645s.mo34779i(10);
    }

    @Override // p361t6.C10999a3.d
    /* renamed from: c */
    public void mo33711c() {
        this.f28645s.mo34779i(22);
    }

    @Override // p361t6.C11070m3.a
    /* renamed from: d */
    public synchronized void mo34302d(C11070m3 c11070m3) {
        if (!this.f28620K && this.f28647u.getThread().isAlive()) {
            this.f28645s.mo34774d(14, c11070m3).mo34784a();
            return;
        }
        C11173s.m34970i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        c11070m3.m34298k(false);
    }

    /* renamed from: g1 */
    public void m34426g1() {
        this.f28645s.mo34771a(6).mo34784a();
    }

    @Override // p397v7.InterfaceC11739y.a
    /* renamed from: h */
    public void mo34427h(InterfaceC11739y interfaceC11739y) {
        this.f28645s.mo34774d(8, interfaceC11739y).mo34784a();
    }

    @Override // p397v7.InterfaceC11736w0.a
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void mo258a(InterfaceC11739y interfaceC11739y) {
        this.f28645s.mo34774d(9, interfaceC11739y).mo34784a();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10;
        C11046i2 m34282q;
        int i11;
        IOException iOException;
        int i12 = AdError.NETWORK_ERROR_CODE;
        try {
            switch (message.what) {
                case 0:
                    m34384j0();
                    break;
                case 1:
                    m34350R0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    m34398p();
                    break;
                case 3:
                    m34322C0((h) message.obj);
                    break;
                case 4:
                    m34353T0((C11047i3) message.obj);
                    break;
                case 5:
                    m34358W0((C11110u3) message.obj);
                    break;
                case 6:
                    m34381h1(false, true);
                    break;
                case 7:
                    m34388l0();
                    return true;
                case 8:
                    m34333I((InterfaceC11739y) message.obj);
                    break;
                case 9:
                    m34325E((InterfaceC11739y) message.obj);
                    break;
                case 10:
                    m34399p0();
                    break;
                case 11:
                    m34356V0(message.arg1);
                    break;
                case 12:
                    m34360X0(message.arg1 != 0);
                    break;
                case 13:
                    m34338K0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    m34328F0((C11070m3) message.obj);
                    break;
                case 15:
                    m34332H0((C11070m3) message.obj);
                    break;
                case 16:
                    m34337K((C11047i3) message.obj, false);
                    break;
                case 17:
                    m34342M0((b) message.obj);
                    break;
                case 18:
                    m34386k((b) message.obj, message.arg1);
                    break;
                case 19:
                    m34371d0((c) message.obj);
                    break;
                case 20:
                    m34391m0(message.arg1, message.arg2, (InterfaceC11738x0) message.obj);
                    break;
                case 21:
                    m34362Y0((InterfaceC11738x0) message.obj);
                    break;
                case 22:
                    m34369c0();
                    break;
                case 23:
                    m34347P0(message.arg1 != 0);
                    break;
                case 24:
                    m34345O0(message.arg1 == 1);
                    break;
                case 25:
                    m34390m();
                    break;
                default:
                    return false;
            }
        } catch (C10829k e10) {
            i10 = e10.f27384a;
            iOException = e10;
            m34327F(iOException, i10);
        } catch (C11005b3 e11) {
            int i13 = e11.f28009b;
            if (i13 == 1) {
                i11 = e11.f28008a ? AdError.MEDIATION_ERROR_CODE : 3003;
            } else {
                if (i13 == 4) {
                    i11 = e11.f28008a ? 3002 : 3004;
                }
                m34327F(e11, i12);
            }
            i12 = i11;
            m34327F(e11, i12);
        } catch (C11686b e12) {
            i10 = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
            iOException = e12;
            m34327F(iOException, i10);
        } catch (IOException e13) {
            i10 = AdError.SERVER_ERROR_CODE;
            iOException = e13;
            m34327F(iOException, i10);
        } catch (RuntimeException e14) {
            if ((e14 instanceof IllegalStateException) || (e14 instanceof IllegalArgumentException)) {
                i12 = 1004;
            }
            e = C11121x.m34570j(e14, i12);
            C11173s.m34965d("ExoPlayerImplInternal", "Playback error", e);
            m34381h1(true, false);
            this.f28618I = this.f28618I.m34051e(e);
        } catch (C11121x e15) {
            e = e15;
            if (e.f28872t == 1 && (m34282q = this.f28613D.m34282q()) != null) {
                e = e.m34572f(m34282q.f28414f.f28461a);
            }
            if (e.f28878z && this.f28635Z == null) {
                C11173s.m34971j("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f28635Z = e;
                InterfaceC11165o interfaceC11165o = this.f28645s;
                interfaceC11165o.mo34781k(interfaceC11165o.mo34774d(25, e));
            } else {
                C11121x c11121x = this.f28635Z;
                if (c11121x != null) {
                    c11121x.addSuppressed(e);
                    e = this.f28635Z;
                }
                C11173s.m34965d("ExoPlayerImplInternal", "Playback error", e);
                m34381h1(true, false);
                this.f28618I = this.f28618I.m34051e(e);
            }
        } catch (InterfaceC12320n.a e16) {
            i10 = e16.f33062a;
            iOException = e16;
            m34327F(iOException, i10);
        }
        m34357W();
        return true;
    }

    /* renamed from: i0 */
    public void m34429i0() {
        this.f28645s.mo34771a(0).mo34784a();
    }

    /* renamed from: k0 */
    public synchronized boolean m34430k0() {
        if (!this.f28620K && this.f28647u.getThread().isAlive()) {
            this.f28645s.mo34779i(7);
            m34400p1(new InterfaceC7166v() { // from class: t6.o1
                @Override // p082eb.InterfaceC7166v
                public final Object get() {
                    Boolean m34352T;
                    m34352T = C11088q1.this.m34352T();
                    return m34352T;
                }
            }, this.f28616G);
            return this.f28620K;
        }
        return true;
    }

    /* renamed from: l */
    public void m34431l(int i10, List<C10999a3.c> list, InterfaceC11738x0 interfaceC11738x0) {
        this.f28645s.mo34773c(18, i10, 0, new b(list, interfaceC11738x0, -1, -9223372036854775807L, null)).mo34784a();
    }

    /* renamed from: n0 */
    public void m34432n0(int i10, int i11, InterfaceC11738x0 interfaceC11738x0) {
        this.f28645s.mo34773c(20, i10, i11, interfaceC11738x0).mo34784a();
    }

    @Override // p361t6.C11096s.a
    public void onPlaybackParametersChanged(C11047i3 c11047i3) {
        this.f28645s.mo34774d(16, c11047i3).mo34784a();
    }

    /* renamed from: u */
    public void m34433u(long j10) {
        this.f28637a0 = j10;
    }
}
