package u6;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import t6.d4;
import u6.b;
import u6.l3;
import v7.a0;

/* loaded from: classes.dex */
public final class p1 implements l3 {

    /* renamed from: h, reason: collision with root package name */
    public static final eb.v<String> f27264h = new eb.v() { // from class: u6.o1
        @Override // eb.v
        public final Object get() {
            String k10;
            k10 = p1.k();
            return k10;
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final Random f27265i = new Random();

    /* renamed from: a, reason: collision with root package name */
    private final d4.d f27266a;

    /* renamed from: b, reason: collision with root package name */
    private final d4.b f27267b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, a> f27268c;

    /* renamed from: d, reason: collision with root package name */
    private final eb.v<String> f27269d;

    /* renamed from: e, reason: collision with root package name */
    private l3.a f27270e;

    /* renamed from: f, reason: collision with root package name */
    private d4 f27271f;

    /* renamed from: g, reason: collision with root package name */
    private String f27272g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f27273a;

        /* renamed from: b, reason: collision with root package name */
        private int f27274b;

        /* renamed from: c, reason: collision with root package name */
        private long f27275c;

        /* renamed from: d, reason: collision with root package name */
        private a0.b f27276d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f27277e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f27278f;

        public a(String str, int i10, a0.b bVar) {
            this.f27273a = str;
            this.f27274b = i10;
            this.f27275c = bVar == null ? -1L : bVar.f28546d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f27276d = bVar;
        }

        private int l(d4 d4Var, d4 d4Var2, int i10) {
            if (i10 >= d4Var.u()) {
                if (i10 < d4Var2.u()) {
                    return i10;
                }
                return -1;
            }
            d4Var.s(i10, p1.this.f27266a);
            for (int i11 = p1.this.f27266a.f26080z; i11 <= p1.this.f27266a.A; i11++) {
                int g10 = d4Var2.g(d4Var.r(i11));
                if (g10 != -1) {
                    return d4Var2.k(g10, p1.this.f27267b).f26057c;
                }
            }
            return -1;
        }

        public boolean i(int i10, a0.b bVar) {
            if (bVar == null) {
                return i10 == this.f27274b;
            }
            a0.b bVar2 = this.f27276d;
            return bVar2 == null ? !bVar.b() && bVar.f28546d == this.f27275c : bVar.f28546d == bVar2.f28546d && bVar.f28544b == bVar2.f28544b && bVar.f28545c == bVar2.f28545c;
        }

        public boolean j(b.a aVar) {
            a0.b bVar = aVar.f27117d;
            if (bVar == null) {
                return this.f27274b != aVar.f27116c;
            }
            long j10 = this.f27275c;
            if (j10 == -1) {
                return false;
            }
            if (bVar.f28546d > j10) {
                return true;
            }
            if (this.f27276d == null) {
                return false;
            }
            int g10 = aVar.f27115b.g(bVar.f28543a);
            int g11 = aVar.f27115b.g(this.f27276d.f28543a);
            a0.b bVar2 = aVar.f27117d;
            if (bVar2.f28546d < this.f27276d.f28546d || g10 < g11) {
                return false;
            }
            if (g10 > g11) {
                return true;
            }
            boolean b10 = bVar2.b();
            a0.b bVar3 = aVar.f27117d;
            if (!b10) {
                int i10 = bVar3.f28547e;
                return i10 == -1 || i10 > this.f27276d.f28544b;
            }
            int i11 = bVar3.f28544b;
            int i12 = bVar3.f28545c;
            a0.b bVar4 = this.f27276d;
            int i13 = bVar4.f28544b;
            if (i11 <= i13) {
                return i11 == i13 && i12 > bVar4.f28545c;
            }
            return true;
        }

        public void k(int i10, a0.b bVar) {
            if (this.f27275c == -1 && i10 == this.f27274b && bVar != null) {
                this.f27275c = bVar.f28546d;
            }
        }

        public boolean m(d4 d4Var, d4 d4Var2) {
            int l10 = l(d4Var, d4Var2, this.f27274b);
            this.f27274b = l10;
            if (l10 == -1) {
                return false;
            }
            a0.b bVar = this.f27276d;
            return bVar == null || d4Var2.g(bVar.f28543a) != -1;
        }
    }

    public p1() {
        this(f27264h);
    }

    public p1(eb.v<String> vVar) {
        this.f27269d = vVar;
        this.f27266a = new d4.d();
        this.f27267b = new d4.b();
        this.f27268c = new HashMap<>();
        this.f27271f = d4.f26044a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String k() {
        byte[] bArr = new byte[12];
        f27265i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private a l(int i10, a0.b bVar) {
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.f27268c.values()) {
            aVar2.k(i10, bVar);
            if (aVar2.i(i10, bVar)) {
                long j11 = aVar2.f27275c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (j11 == j10 && ((a) t8.r0.j(aVar)).f27276d != null && aVar2.f27276d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.f27269d.get();
        a aVar3 = new a(str, i10, bVar);
        this.f27268c.put(str, aVar3);
        return aVar3;
    }

    private void m(b.a aVar) {
        if (aVar.f27115b.v()) {
            this.f27272g = null;
            return;
        }
        a aVar2 = this.f27268c.get(this.f27272g);
        a l10 = l(aVar.f27116c, aVar.f27117d);
        this.f27272g = l10.f27273a;
        f(aVar);
        a0.b bVar = aVar.f27117d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f27275c == aVar.f27117d.f28546d && aVar2.f27276d != null && aVar2.f27276d.f28544b == aVar.f27117d.f28544b && aVar2.f27276d.f28545c == aVar.f27117d.f28545c) {
            return;
        }
        a0.b bVar2 = aVar.f27117d;
        this.f27270e.j0(aVar, l(aVar.f27116c, new a0.b(bVar2.f28543a, bVar2.f28546d)).f27273a, l10.f27273a);
    }

    @Override // u6.l3
    public synchronized String a() {
        return this.f27272g;
    }

    @Override // u6.l3
    public synchronized String b(d4 d4Var, a0.b bVar) {
        return l(d4Var.m(bVar.f28543a, this.f27267b).f26057c, bVar).f27273a;
    }

    @Override // u6.l3
    public synchronized void c(b.a aVar) {
        l3.a aVar2;
        this.f27272g = null;
        Iterator<a> it = this.f27268c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            it.remove();
            if (next.f27277e && (aVar2 = this.f27270e) != null) {
                aVar2.b0(aVar, next.f27273a, false);
            }
        }
    }

    @Override // u6.l3
    public void d(l3.a aVar) {
        this.f27270e = aVar;
    }

    @Override // u6.l3
    public synchronized void e(b.a aVar, int i10) {
        t8.a.e(this.f27270e);
        boolean z10 = i10 == 0;
        Iterator<a> it = this.f27268c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.j(aVar)) {
                it.remove();
                if (next.f27277e) {
                    boolean equals = next.f27273a.equals(this.f27272g);
                    boolean z11 = z10 && equals && next.f27278f;
                    if (equals) {
                        this.f27272g = null;
                    }
                    this.f27270e.b0(aVar, next.f27273a, z11);
                }
            }
        }
        m(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1 A[Catch: all -> 0x0118, TryCatch #0 {, blocks: (B:4:0x0005, B:9:0x0014, B:12:0x0025, B:14:0x0030, B:20:0x003a, B:23:0x004b, B:25:0x0057, B:26:0x005d, B:28:0x0061, B:30:0x0067, B:32:0x0080, B:33:0x00db, B:35:0x00e1, B:36:0x00f7, B:38:0x0103, B:40:0x0109), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    @Override // u6.l3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void f(u6.b.a r25) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.p1.f(u6.b$a):void");
    }

    @Override // u6.l3
    public synchronized void g(b.a aVar) {
        t8.a.e(this.f27270e);
        d4 d4Var = this.f27271f;
        this.f27271f = aVar.f27115b;
        Iterator<a> it = this.f27268c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!next.m(d4Var, this.f27271f) || next.j(aVar)) {
                it.remove();
                if (next.f27277e) {
                    if (next.f27273a.equals(this.f27272g)) {
                        this.f27272g = null;
                    }
                    this.f27270e.b0(aVar, next.f27273a, false);
                }
            }
        }
        m(aVar);
    }
}
