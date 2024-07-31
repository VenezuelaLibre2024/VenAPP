package p010a8;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import com.google.common.collect.AbstractC5907w;
import com.google.common.collect.C5867e0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p026b8.C1677g;
import p026b8.InterfaceC1682l;
import p137hb.C7690e;
import p307q8.AbstractC10297c;
import p307q8.InterfaceC10312r;
import p351s8.C10835n;
import p351s8.InterfaceC10827j;
import p351s8.InterfaceC10834m0;
import p361t6.C11108u1;
import p361t6.C11110u3;
import p363t8.C11137a;
import p363t8.C11168p0;
import p363t8.C11172r0;
import p376u6.C11391m3;
import p397v7.C11686b;
import p397v7.C11694d1;
import p437x7.AbstractC12336b;
import p437x7.AbstractC12340f;
import p437x7.AbstractC12346l;
import p437x7.AbstractC12348n;
import p437x7.InterfaceC12349o;

/* renamed from: a8.f */
/* loaded from: classes.dex */
class C0048f {

    /* renamed from: a */
    private final InterfaceC0050h f128a;

    /* renamed from: b */
    private final InterfaceC10827j f129b;

    /* renamed from: c */
    private final InterfaceC10827j f130c;

    /* renamed from: d */
    private final C0061s f131d;

    /* renamed from: e */
    private final Uri[] f132e;

    /* renamed from: f */
    private final C11108u1[] f133f;

    /* renamed from: g */
    private final InterfaceC1682l f134g;

    /* renamed from: h */
    private final C11694d1 f135h;

    /* renamed from: i */
    private final List<C11108u1> f136i;

    /* renamed from: k */
    private final C11391m3 f138k;

    /* renamed from: l */
    private boolean f139l;

    /* renamed from: n */
    private IOException f141n;

    /* renamed from: o */
    private Uri f142o;

    /* renamed from: p */
    private boolean f143p;

    /* renamed from: q */
    private InterfaceC10312r f144q;

    /* renamed from: s */
    private boolean f146s;

    /* renamed from: j */
    private final C0047e f137j = new C0047e(4);

    /* renamed from: m */
    private byte[] f140m = C11172r0.f29045f;

    /* renamed from: r */
    private long f145r = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a8.f$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC12346l {

        /* renamed from: l */
        private byte[] f147l;

        public a(InterfaceC10827j interfaceC10827j, C10835n c10835n, C11108u1 c11108u1, int i10, Object obj, byte[] bArr) {
            super(interfaceC10827j, c10835n, 3, c11108u1, i10, obj, bArr);
        }

        @Override // p437x7.AbstractC12346l
        /* renamed from: g */
        protected void mo204g(byte[] bArr, int i10) {
            this.f147l = Arrays.copyOf(bArr, i10);
        }

        /* renamed from: j */
        public byte[] m205j() {
            return this.f147l;
        }
    }

    /* renamed from: a8.f$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public AbstractC12340f f148a;

        /* renamed from: b */
        public boolean f149b;

        /* renamed from: c */
        public Uri f150c;

        public b() {
            m206a();
        }

        /* renamed from: a */
        public void m206a() {
            this.f148a = null;
            this.f149b = false;
            this.f150c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a8.f$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC12336b {

        /* renamed from: e */
        private final List<C1677g.e> f151e;

        /* renamed from: f */
        private final long f152f;

        /* renamed from: g */
        private final String f153g;

        public c(String str, long j10, List<C1677g.e> list) {
            super(0L, list.size() - 1);
            this.f153g = str;
            this.f152f = j10;
            this.f151e = list;
        }

        @Override // p437x7.InterfaceC12349o
        /* renamed from: a */
        public long mo207a() {
            m39886c();
            return this.f152f + this.f151e.get((int) m39887d()).f7142e;
        }

        @Override // p437x7.InterfaceC12349o
        /* renamed from: b */
        public long mo208b() {
            m39886c();
            C1677g.e eVar = this.f151e.get((int) m39887d());
            return this.f152f + eVar.f7142e + eVar.f7140c;
        }
    }

    /* renamed from: a8.f$d */
    /* loaded from: classes.dex */
    private static final class d extends AbstractC10297c {

        /* renamed from: h */
        private int f154h;

        public d(C11694d1 c11694d1, int[] iArr) {
            super(c11694d1, iArr);
            this.f154h = mo30885e(c11694d1.m36849d(iArr[0]));
        }

        @Override // p307q8.InterfaceC10312r
        /* renamed from: g */
        public void mo209g(long j10, long j11, long j12, List<? extends AbstractC12348n> list, InterfaceC12349o[] interfaceC12349oArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (mo30887j(this.f154h, elapsedRealtime)) {
                for (int i10 = this.f25600b - 1; i10 >= 0; i10--) {
                    if (!mo30887j(i10, elapsedRealtime)) {
                        this.f154h = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // p307q8.InterfaceC10312r
        /* renamed from: h */
        public int mo210h() {
            return this.f154h;
        }

        @Override // p307q8.InterfaceC10312r
        /* renamed from: m */
        public Object mo211m() {
            return null;
        }

        @Override // p307q8.InterfaceC10312r
        /* renamed from: t */
        public int mo212t() {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a8.f$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        public final C1677g.e f155a;

        /* renamed from: b */
        public final long f156b;

        /* renamed from: c */
        public final int f157c;

        /* renamed from: d */
        public final boolean f158d;

        public e(C1677g.e eVar, long j10, int i10) {
            this.f155a = eVar;
            this.f156b = j10;
            this.f157c = i10;
            this.f158d = (eVar instanceof C1677g.b) && ((C1677g.b) eVar).f7132x;
        }
    }

    public C0048f(InterfaceC0050h interfaceC0050h, InterfaceC1682l interfaceC1682l, Uri[] uriArr, C11108u1[] c11108u1Arr, InterfaceC0049g interfaceC0049g, InterfaceC10834m0 interfaceC10834m0, C0061s c0061s, List<C11108u1> list, C11391m3 c11391m3) {
        this.f128a = interfaceC0050h;
        this.f134g = interfaceC1682l;
        this.f132e = uriArr;
        this.f133f = c11108u1Arr;
        this.f131d = c0061s;
        this.f136i = list;
        this.f138k = c11391m3;
        InterfaceC10827j mo169a = interfaceC0049g.mo169a(1);
        this.f129b = mo169a;
        if (interfaceC10834m0 != null) {
            mo169a.mo161l(interfaceC10834m0);
        }
        this.f130c = interfaceC0049g.mo169a(3);
        this.f135h = new C11694d1(c11108u1Arr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((c11108u1Arr[i10].f28790e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f144q = new d(this.f135h, C7690e.m23421l(arrayList));
    }

    /* renamed from: d */
    private static Uri m181d(C1677g c1677g, C1677g.e eVar) {
        String str;
        if (eVar == null || (str = eVar.f7144r) == null) {
            return null;
        }
        return C11168p0.m34839e(c1677g.f7175a, str);
    }

    /* renamed from: f */
    private Pair<Long, Integer> m182f(C0051i c0051i, boolean z10, C1677g c1677g, long j10, long j11) {
        if (c0051i != null && !z10) {
            if (!c0051i.mo225h()) {
                return new Pair<>(Long.valueOf(c0051i.f33164j), Integer.valueOf(c0051i.f177o));
            }
            Long valueOf = Long.valueOf(c0051i.f177o == -1 ? c0051i.mo39935g() : c0051i.f33164j);
            int i10 = c0051i.f177o;
            return new Pair<>(valueOf, Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
        }
        long j12 = c1677g.f7129u + j10;
        if (c0051i != null && !this.f143p) {
            j11 = c0051i.f33119g;
        }
        if (!c1677g.f7123o && j11 >= j12) {
            return new Pair<>(Long.valueOf(c1677g.f7119k + c1677g.f7126r.size()), -1);
        }
        long j13 = j11 - j10;
        int i11 = 0;
        int m34920f = C11172r0.m34920f(c1677g.f7126r, Long.valueOf(j13), true, !this.f134g.mo9204j() || c0051i == null);
        long j14 = m34920f + c1677g.f7119k;
        if (m34920f >= 0) {
            C1677g.d dVar = c1677g.f7126r.get(m34920f);
            List<C1677g.b> list = j13 < dVar.f7142e + dVar.f7140c ? dVar.f7137x : c1677g.f7127s;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                C1677g.b bVar = list.get(i11);
                if (j13 >= bVar.f7142e + bVar.f7140c) {
                    i11++;
                } else if (bVar.f7131w) {
                    j14 += list == c1677g.f7127s ? 1L : 0L;
                    r1 = i11;
                }
            }
        }
        return new Pair<>(Long.valueOf(j14), Integer.valueOf(r1));
    }

    /* renamed from: g */
    private static e m183g(C1677g c1677g, long j10, int i10) {
        int i11 = (int) (j10 - c1677g.f7119k);
        if (i11 == c1677g.f7126r.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < c1677g.f7127s.size()) {
                return new e(c1677g.f7127s.get(i10), j10, i10);
            }
            return null;
        }
        C1677g.d dVar = c1677g.f7126r.get(i11);
        if (i10 == -1) {
            return new e(dVar, j10, -1);
        }
        if (i10 < dVar.f7137x.size()) {
            return new e(dVar.f7137x.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < c1677g.f7126r.size()) {
            return new e(c1677g.f7126r.get(i12), j10 + 1, -1);
        }
        if (c1677g.f7127s.isEmpty()) {
            return null;
        }
        return new e(c1677g.f7127s.get(0), j10 + 1, 0);
    }

    /* renamed from: i */
    static List<C1677g.e> m184i(C1677g c1677g, long j10, int i10) {
        int i11 = (int) (j10 - c1677g.f7119k);
        if (i11 < 0 || c1677g.f7126r.size() < i11) {
            return AbstractC5907w.m15081v();
        }
        ArrayList arrayList = new ArrayList();
        if (i11 < c1677g.f7126r.size()) {
            if (i10 != -1) {
                C1677g.d dVar = c1677g.f7126r.get(i11);
                if (i10 == 0) {
                    arrayList.add(dVar);
                } else if (i10 < dVar.f7137x.size()) {
                    List<C1677g.b> list = dVar.f7137x;
                    arrayList.addAll(list.subList(i10, list.size()));
                }
                i11++;
            }
            List<C1677g.d> list2 = c1677g.f7126r;
            arrayList.addAll(list2.subList(i11, list2.size()));
            i10 = 0;
        }
        if (c1677g.f7122n != -9223372036854775807L) {
            int i12 = i10 != -1 ? i10 : 0;
            if (i12 < c1677g.f7127s.size()) {
                List<C1677g.b> list3 = c1677g.f7127s;
                arrayList.addAll(list3.subList(i12, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: l */
    private AbstractC12340f m185l(Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        byte[] m180c = this.f137j.m180c(uri);
        if (m180c != null) {
            this.f137j.m179b(uri, m180c);
            return null;
        }
        return new a(this.f130c, new C10835n.b().m33038i(uri).m33031b(1).m33030a(), this.f133f[i10], this.f144q.mo212t(), this.f144q.mo211m(), this.f140m);
    }

    /* renamed from: s */
    private long m186s(long j10) {
        long j11 = this.f145r;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    /* renamed from: w */
    private void m187w(C1677g c1677g) {
        this.f145r = c1677g.f7123o ? -9223372036854775807L : c1677g.m9234e() - this.f134g.mo9199c();
    }

    /* renamed from: a */
    public InterfaceC12349o[] m188a(C0051i c0051i, long j10) {
        int i10;
        int m36850e = c0051i == null ? -1 : this.f135h.m36850e(c0051i.f33116d);
        int length = this.f144q.length();
        InterfaceC12349o[] interfaceC12349oArr = new InterfaceC12349o[length];
        boolean z10 = false;
        int i11 = 0;
        while (i11 < length) {
            int mo30882b = this.f144q.mo30882b(i11);
            Uri uri = this.f132e[mo30882b];
            if (this.f134g.mo9203g(uri)) {
                C1677g mo9208o = this.f134g.mo9208o(uri, z10);
                C11137a.m34603e(mo9208o);
                long mo9199c = mo9208o.f7116h - this.f134g.mo9199c();
                i10 = i11;
                Pair<Long, Integer> m182f = m182f(c0051i, mo30882b != m36850e ? true : z10, mo9208o, mo9199c, j10);
                interfaceC12349oArr[i10] = new c(mo9208o.f7175a, mo9199c, m184i(mo9208o, ((Long) m182f.first).longValue(), ((Integer) m182f.second).intValue()));
            } else {
                interfaceC12349oArr[i11] = InterfaceC12349o.f33165a;
                i10 = i11;
            }
            i11 = i10 + 1;
            z10 = false;
        }
        return interfaceC12349oArr;
    }

    /* renamed from: b */
    public long m189b(long j10, C11110u3 c11110u3) {
        int mo210h = this.f144q.mo210h();
        Uri[] uriArr = this.f132e;
        C1677g mo9208o = (mo210h >= uriArr.length || mo210h == -1) ? null : this.f134g.mo9208o(uriArr[this.f144q.mo30888r()], true);
        if (mo9208o == null || mo9208o.f7126r.isEmpty() || !mo9208o.f7177c) {
            return j10;
        }
        long mo9199c = mo9208o.f7116h - this.f134g.mo9199c();
        long j11 = j10 - mo9199c;
        int m34920f = C11172r0.m34920f(mo9208o.f7126r, Long.valueOf(j11), true, true);
        long j12 = mo9208o.f7126r.get(m34920f).f7142e;
        return c11110u3.m34560a(j11, j12, m34920f != mo9208o.f7126r.size() - 1 ? mo9208o.f7126r.get(m34920f + 1).f7142e : j12) + mo9199c;
    }

    /* renamed from: c */
    public int m190c(C0051i c0051i) {
        if (c0051i.f177o == -1) {
            return 1;
        }
        C1677g c1677g = (C1677g) C11137a.m34603e(this.f134g.mo9208o(this.f132e[this.f135h.m36850e(c0051i.f33116d)], false));
        int i10 = (int) (c0051i.f33164j - c1677g.f7119k);
        if (i10 < 0) {
            return 1;
        }
        List<C1677g.b> list = i10 < c1677g.f7126r.size() ? c1677g.f7126r.get(i10).f7137x : c1677g.f7127s;
        if (c0051i.f177o >= list.size()) {
            return 2;
        }
        C1677g.b bVar = list.get(c0051i.f177o);
        if (bVar.f7132x) {
            return 0;
        }
        return C11172r0.m34914c(Uri.parse(C11168p0.m34838d(c1677g.f7175a, bVar.f7138a)), c0051i.f33114b.f27407a) ? 1 : 2;
    }

    /* renamed from: e */
    public void m191e(long j10, long j11, List<C0051i> list, boolean z10, b bVar) {
        C1677g c1677g;
        long j12;
        Uri uri;
        int i10;
        C0051i c0051i = list.isEmpty() ? null : (C0051i) C5867e0.m14838d(list);
        int m36850e = c0051i == null ? -1 : this.f135h.m36850e(c0051i.f33116d);
        long j13 = j11 - j10;
        long m186s = m186s(j10);
        if (c0051i != null && !this.f143p) {
            long m39902d = c0051i.m39902d();
            j13 = Math.max(0L, j13 - m39902d);
            if (m186s != -9223372036854775807L) {
                m186s = Math.max(0L, m186s - m39902d);
            }
        }
        this.f144q.mo209g(j10, j13, m186s, list, m188a(c0051i, j11));
        int mo30888r = this.f144q.mo30888r();
        boolean z11 = m36850e != mo30888r;
        Uri uri2 = this.f132e[mo30888r];
        if (!this.f134g.mo9203g(uri2)) {
            bVar.f150c = uri2;
            this.f146s &= uri2.equals(this.f142o);
            this.f142o = uri2;
            return;
        }
        C1677g mo9208o = this.f134g.mo9208o(uri2, true);
        C11137a.m34603e(mo9208o);
        this.f143p = mo9208o.f7177c;
        m187w(mo9208o);
        long mo9199c = mo9208o.f7116h - this.f134g.mo9199c();
        Pair<Long, Integer> m182f = m182f(c0051i, z11, mo9208o, mo9199c, j11);
        long longValue = ((Long) m182f.first).longValue();
        int intValue = ((Integer) m182f.second).intValue();
        if (longValue >= mo9208o.f7119k || c0051i == null || !z11) {
            c1677g = mo9208o;
            j12 = mo9199c;
            uri = uri2;
            i10 = mo30888r;
        } else {
            Uri uri3 = this.f132e[m36850e];
            C1677g mo9208o2 = this.f134g.mo9208o(uri3, true);
            C11137a.m34603e(mo9208o2);
            j12 = mo9208o2.f7116h - this.f134g.mo9199c();
            Pair<Long, Integer> m182f2 = m182f(c0051i, false, mo9208o2, j12, j11);
            longValue = ((Long) m182f2.first).longValue();
            intValue = ((Integer) m182f2.second).intValue();
            i10 = m36850e;
            uri = uri3;
            c1677g = mo9208o2;
        }
        if (longValue < c1677g.f7119k) {
            this.f141n = new C11686b();
            return;
        }
        e m183g = m183g(c1677g, longValue, intValue);
        if (m183g == null) {
            if (!c1677g.f7123o) {
                bVar.f150c = uri;
                this.f146s &= uri.equals(this.f142o);
                this.f142o = uri;
                return;
            } else {
                if (z10 || c1677g.f7126r.isEmpty()) {
                    bVar.f149b = true;
                    return;
                }
                m183g = new e((C1677g.e) C5867e0.m14838d(c1677g.f7126r), (c1677g.f7119k + c1677g.f7126r.size()) - 1, -1);
            }
        }
        this.f146s = false;
        this.f142o = null;
        Uri m181d = m181d(c1677g, m183g.f155a.f7139b);
        AbstractC12340f m185l = m185l(m181d, i10);
        bVar.f148a = m185l;
        if (m185l != null) {
            return;
        }
        Uri m181d2 = m181d(c1677g, m183g.f155a);
        AbstractC12340f m185l2 = m185l(m181d2, i10);
        bVar.f148a = m185l2;
        if (m185l2 != null) {
            return;
        }
        boolean m222w = C0051i.m222w(c0051i, uri, c1677g, m183g, j12);
        if (m222w && m183g.f158d) {
            return;
        }
        bVar.f148a = C0051i.m214j(this.f128a, this.f129b, this.f133f[i10], j12, c1677g, m183g, uri, this.f136i, this.f144q.mo212t(), this.f144q.mo211m(), this.f139l, this.f131d, c0051i, this.f137j.m178a(m181d2), this.f137j.m178a(m181d), m222w, this.f138k);
    }

    /* renamed from: h */
    public int m192h(long j10, List<? extends AbstractC12348n> list) {
        return (this.f141n != null || this.f144q.length() < 2) ? list.size() : this.f144q.mo30863q(j10, list);
    }

    /* renamed from: j */
    public C11694d1 m193j() {
        return this.f135h;
    }

    /* renamed from: k */
    public InterfaceC10312r m194k() {
        return this.f144q;
    }

    /* renamed from: m */
    public boolean m195m(AbstractC12340f abstractC12340f, long j10) {
        InterfaceC10312r interfaceC10312r = this.f144q;
        return interfaceC10312r.mo30886i(interfaceC10312r.mo30883c(this.f135h.m36850e(abstractC12340f.f33116d)), j10);
    }

    /* renamed from: n */
    public void m196n() {
        IOException iOException = this.f141n;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f142o;
        if (uri == null || !this.f146s) {
            return;
        }
        this.f134g.mo9198b(uri);
    }

    /* renamed from: o */
    public boolean m197o(Uri uri) {
        return C11172r0.m34946s(this.f132e, uri);
    }

    /* renamed from: p */
    public void m198p(AbstractC12340f abstractC12340f) {
        if (abstractC12340f instanceof a) {
            a aVar = (a) abstractC12340f;
            this.f140m = aVar.m39938h();
            this.f137j.m179b(aVar.f33114b.f27407a, (byte[]) C11137a.m34603e(aVar.m205j()));
        }
    }

    /* renamed from: q */
    public boolean m199q(Uri uri, long j10) {
        int mo30883c;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.f132e;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            }
            if (uriArr[i10].equals(uri)) {
                break;
            }
            i10++;
        }
        if (i10 == -1 || (mo30883c = this.f144q.mo30883c(i10)) == -1) {
            return true;
        }
        this.f146s |= uri.equals(this.f142o);
        return j10 == -9223372036854775807L || (this.f144q.mo30886i(mo30883c, j10) && this.f134g.mo9205k(uri, j10));
    }

    /* renamed from: r */
    public void m200r() {
        this.f141n = null;
    }

    /* renamed from: t */
    public void m201t(boolean z10) {
        this.f139l = z10;
    }

    /* renamed from: u */
    public void m202u(InterfaceC10312r interfaceC10312r) {
        this.f144q = interfaceC10312r;
    }

    /* renamed from: v */
    public boolean m203v(long j10, AbstractC12340f abstractC12340f, List<? extends AbstractC12348n> list) {
        if (this.f141n != null) {
            return false;
        }
        return this.f144q.mo31033k(j10, abstractC12340f, list);
    }
}
