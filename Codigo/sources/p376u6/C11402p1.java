package p376u6;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import p082eb.InterfaceC7166v;
import p361t6.AbstractC11018d4;
import p363t8.C11137a;
import p363t8.C11172r0;
import p376u6.InterfaceC11332b;
import p376u6.InterfaceC11386l3;
import p397v7.InterfaceC11684a0;

/* renamed from: u6.p1 */
/* loaded from: classes.dex */
public final class C11402p1 implements InterfaceC11386l3 {

    /* renamed from: h */
    public static final InterfaceC7166v<String> f29567h = new InterfaceC7166v() { // from class: u6.o1
        @Override // p082eb.InterfaceC7166v
        public final Object get() {
            String m35727k;
            m35727k = C11402p1.m35727k();
            return m35727k;
        }
    };

    /* renamed from: i */
    private static final Random f29568i = new Random();

    /* renamed from: a */
    private final AbstractC11018d4.d f29569a;

    /* renamed from: b */
    private final AbstractC11018d4.b f29570b;

    /* renamed from: c */
    private final HashMap<String, a> f29571c;

    /* renamed from: d */
    private final InterfaceC7166v<String> f29572d;

    /* renamed from: e */
    private InterfaceC11386l3.a f29573e;

    /* renamed from: f */
    private AbstractC11018d4 f29574f;

    /* renamed from: g */
    private String f29575g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u6.p1$a */
    /* loaded from: classes.dex */
    public final class a {

        /* renamed from: a */
        private final String f29576a;

        /* renamed from: b */
        private int f29577b;

        /* renamed from: c */
        private long f29578c;

        /* renamed from: d */
        private InterfaceC11684a0.b f29579d;

        /* renamed from: e */
        private boolean f29580e;

        /* renamed from: f */
        private boolean f29581f;

        public a(String str, int i10, InterfaceC11684a0.b bVar) {
            this.f29576a = str;
            this.f29577b = i10;
            this.f29578c = bVar == null ? -1L : bVar.f30977d;
            if (bVar == null || !bVar.m37106b()) {
                return;
            }
            this.f29579d = bVar;
        }

        /* renamed from: l */
        private int m35738l(AbstractC11018d4 abstractC11018d4, AbstractC11018d4 abstractC11018d42, int i10) {
            if (i10 >= abstractC11018d4.mo11861u()) {
                if (i10 < abstractC11018d42.mo11861u()) {
                    return i10;
                }
                return -1;
            }
            abstractC11018d4.m34004s(i10, C11402p1.this.f29569a);
            for (int i11 = C11402p1.this.f29569a.f28269z; i11 <= C11402p1.this.f29569a.f28253A; i11++) {
                int mo11856g = abstractC11018d42.mo11856g(abstractC11018d4.mo11859r(i11));
                if (mo11856g != -1) {
                    return abstractC11018d42.m34001k(mo11856g, C11402p1.this.f29570b).f28227c;
                }
            }
            return -1;
        }

        /* renamed from: i */
        public boolean m35739i(int i10, InterfaceC11684a0.b bVar) {
            if (bVar == null) {
                return i10 == this.f29577b;
            }
            InterfaceC11684a0.b bVar2 = this.f29579d;
            return bVar2 == null ? !bVar.m37106b() && bVar.f30977d == this.f29578c : bVar.f30977d == bVar2.f30977d && bVar.f30975b == bVar2.f30975b && bVar.f30976c == bVar2.f30976c;
        }

        /* renamed from: j */
        public boolean m35740j(InterfaceC11332b.a aVar) {
            InterfaceC11684a0.b bVar = aVar.f29419d;
            if (bVar == null) {
                return this.f29577b != aVar.f29418c;
            }
            long j10 = this.f29578c;
            if (j10 == -1) {
                return false;
            }
            if (bVar.f30977d > j10) {
                return true;
            }
            if (this.f29579d == null) {
                return false;
            }
            int mo11856g = aVar.f29417b.mo11856g(bVar.f30974a);
            int mo11856g2 = aVar.f29417b.mo11856g(this.f29579d.f30974a);
            InterfaceC11684a0.b bVar2 = aVar.f29419d;
            if (bVar2.f30977d < this.f29579d.f30977d || mo11856g < mo11856g2) {
                return false;
            }
            if (mo11856g > mo11856g2) {
                return true;
            }
            boolean m37106b = bVar2.m37106b();
            InterfaceC11684a0.b bVar3 = aVar.f29419d;
            if (!m37106b) {
                int i10 = bVar3.f30978e;
                return i10 == -1 || i10 > this.f29579d.f30975b;
            }
            int i11 = bVar3.f30975b;
            int i12 = bVar3.f30976c;
            InterfaceC11684a0.b bVar4 = this.f29579d;
            int i13 = bVar4.f30975b;
            if (i11 <= i13) {
                return i11 == i13 && i12 > bVar4.f30976c;
            }
            return true;
        }

        /* renamed from: k */
        public void m35741k(int i10, InterfaceC11684a0.b bVar) {
            if (this.f29578c == -1 && i10 == this.f29577b && bVar != null) {
                this.f29578c = bVar.f30977d;
            }
        }

        /* renamed from: m */
        public boolean m35742m(AbstractC11018d4 abstractC11018d4, AbstractC11018d4 abstractC11018d42) {
            int m35738l = m35738l(abstractC11018d4, abstractC11018d42, this.f29577b);
            this.f29577b = m35738l;
            if (m35738l == -1) {
                return false;
            }
            InterfaceC11684a0.b bVar = this.f29579d;
            return bVar == null || abstractC11018d42.mo11856g(bVar.f30974a) != -1;
        }
    }

    public C11402p1() {
        this(f29567h);
    }

    public C11402p1(InterfaceC7166v<String> interfaceC7166v) {
        this.f29572d = interfaceC7166v;
        this.f29569a = new AbstractC11018d4.d();
        this.f29570b = new AbstractC11018d4.b();
        this.f29571c = new HashMap<>();
        this.f29574f = AbstractC11018d4.f28214a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static String m35727k() {
        byte[] bArr = new byte[12];
        f29568i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* renamed from: l */
    private a m35728l(int i10, InterfaceC11684a0.b bVar) {
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.f29571c.values()) {
            aVar2.m35741k(i10, bVar);
            if (aVar2.m35739i(i10, bVar)) {
                long j11 = aVar2.f29578c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (j11 == j10 && ((a) C11172r0.m34928j(aVar)).f29579d != null && aVar2.f29579d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.f29572d.get();
        a aVar3 = new a(str, i10, bVar);
        this.f29571c.put(str, aVar3);
        return aVar3;
    }

    /* renamed from: m */
    private void m35729m(InterfaceC11332b.a aVar) {
        if (aVar.f29417b.m34005v()) {
            this.f29575g = null;
            return;
        }
        a aVar2 = this.f29571c.get(this.f29575g);
        a m35728l = m35728l(aVar.f29418c, aVar.f29419d);
        this.f29575g = m35728l.f29576a;
        mo35570f(aVar);
        InterfaceC11684a0.b bVar = aVar.f29419d;
        if (bVar == null || !bVar.m37106b()) {
            return;
        }
        if (aVar2 != null && aVar2.f29578c == aVar.f29419d.f30977d && aVar2.f29579d != null && aVar2.f29579d.f30975b == aVar.f29419d.f30975b && aVar2.f29579d.f30976c == aVar.f29419d.f30976c) {
            return;
        }
        InterfaceC11684a0.b bVar2 = aVar.f29419d;
        this.f29573e.mo35563j0(aVar, m35728l(aVar.f29418c, new InterfaceC11684a0.b(bVar2.f30974a, bVar2.f30977d)).f29576a, m35728l.f29576a);
    }

    @Override // p376u6.InterfaceC11386l3
    /* renamed from: a */
    public synchronized String mo35565a() {
        return this.f29575g;
    }

    @Override // p376u6.InterfaceC11386l3
    /* renamed from: b */
    public synchronized String mo35566b(AbstractC11018d4 abstractC11018d4, InterfaceC11684a0.b bVar) {
        return m35728l(abstractC11018d4.mo33628m(bVar.f30974a, this.f29570b).f28227c, bVar).f29576a;
    }

    @Override // p376u6.InterfaceC11386l3
    /* renamed from: c */
    public synchronized void mo35567c(InterfaceC11332b.a aVar) {
        InterfaceC11386l3.a aVar2;
        this.f29575g = null;
        Iterator<a> it = this.f29571c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            it.remove();
            if (next.f29580e && (aVar2 = this.f29573e) != null) {
                aVar2.mo35562b0(aVar, next.f29576a, false);
            }
        }
    }

    @Override // p376u6.InterfaceC11386l3
    /* renamed from: d */
    public void mo35568d(InterfaceC11386l3.a aVar) {
        this.f29573e = aVar;
    }

    @Override // p376u6.InterfaceC11386l3
    /* renamed from: e */
    public synchronized void mo35569e(InterfaceC11332b.a aVar, int i10) {
        C11137a.m34603e(this.f29573e);
        boolean z10 = i10 == 0;
        Iterator<a> it = this.f29571c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.m35740j(aVar)) {
                it.remove();
                if (next.f29580e) {
                    boolean equals = next.f29576a.equals(this.f29575g);
                    boolean z11 = z10 && equals && next.f29581f;
                    if (equals) {
                        this.f29575g = null;
                    }
                    this.f29573e.mo35562b0(aVar, next.f29576a, z11);
                }
            }
        }
        m35729m(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1 A[Catch: all -> 0x0118, TryCatch #0 {, blocks: (B:4:0x0005, B:9:0x0014, B:12:0x0025, B:14:0x0030, B:20:0x003a, B:23:0x004b, B:25:0x0057, B:26:0x005d, B:28:0x0061, B:30:0x0067, B:32:0x0080, B:33:0x00db, B:35:0x00e1, B:36:0x00f7, B:38:0x0103, B:40:0x0109), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    @Override // p376u6.InterfaceC11386l3
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void mo35570f(p376u6.InterfaceC11332b.a r25) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p376u6.C11402p1.mo35570f(u6.b$a):void");
    }

    @Override // p376u6.InterfaceC11386l3
    /* renamed from: g */
    public synchronized void mo35571g(InterfaceC11332b.a aVar) {
        C11137a.m34603e(this.f29573e);
        AbstractC11018d4 abstractC11018d4 = this.f29574f;
        this.f29574f = aVar.f29417b;
        Iterator<a> it = this.f29571c.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!next.m35742m(abstractC11018d4, this.f29574f) || next.m35740j(aVar)) {
                it.remove();
                if (next.f29580e) {
                    if (next.f29576a.equals(this.f29575g)) {
                        this.f29575g = null;
                    }
                    this.f29573e.mo35562b0(aVar, next.f29576a, false);
                }
            }
        }
        m35729m(aVar);
    }
}
