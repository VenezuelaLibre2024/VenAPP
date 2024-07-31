package p307q8;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.common.collect.AbstractC5886l0;
import com.google.common.collect.AbstractC5907w;
import com.google.common.collect.C5867e0;
import com.google.common.collect.InterfaceC5884k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p307q8.InterfaceC10312r;
import p351s8.InterfaceC10817e;
import p361t6.AbstractC11018d4;
import p361t6.C11108u1;
import p363t8.C11172r0;
import p363t8.C11173s;
import p363t8.InterfaceC11143d;
import p397v7.C11694d1;
import p397v7.InterfaceC11684a0;
import p437x7.AbstractC12348n;
import p437x7.InterfaceC12349o;

/* renamed from: q8.a */
/* loaded from: classes.dex */
public class C10293a extends AbstractC10297c {

    /* renamed from: h */
    private final InterfaceC10817e f25567h;

    /* renamed from: i */
    private final long f25568i;

    /* renamed from: j */
    private final long f25569j;

    /* renamed from: k */
    private final long f25570k;

    /* renamed from: l */
    private final int f25571l;

    /* renamed from: m */
    private final int f25572m;

    /* renamed from: n */
    private final float f25573n;

    /* renamed from: o */
    private final float f25574o;

    /* renamed from: p */
    private final AbstractC5907w<a> f25575p;

    /* renamed from: q */
    private final InterfaceC11143d f25576q;

    /* renamed from: r */
    private float f25577r;

    /* renamed from: s */
    private int f25578s;

    /* renamed from: t */
    private int f25579t;

    /* renamed from: u */
    private long f25580u;

    /* renamed from: v */
    private AbstractC12348n f25581v;

    /* renamed from: q8.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final long f25582a;

        /* renamed from: b */
        public final long f25583b;

        public a(long j10, long j11) {
            this.f25582a = j10;
            this.f25583b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f25582a == aVar.f25582a && this.f25583b == aVar.f25583b;
        }

        public int hashCode() {
            return (((int) this.f25582a) * 31) + ((int) this.f25583b);
        }
    }

    /* renamed from: q8.a$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC10312r.b {

        /* renamed from: a */
        private final int f25584a;

        /* renamed from: b */
        private final int f25585b;

        /* renamed from: c */
        private final int f25586c;

        /* renamed from: d */
        private final int f25587d;

        /* renamed from: e */
        private final int f25588e;

        /* renamed from: f */
        private final float f25589f;

        /* renamed from: g */
        private final float f25590g;

        /* renamed from: h */
        private final InterfaceC11143d f25591h;

        public b() {
            this(ModuleDescriptor.MODULE_VERSION, 25000, 25000, 0.7f);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, InterfaceC11143d.f28940a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, InterfaceC11143d interfaceC11143d) {
            this.f25584a = i10;
            this.f25585b = i11;
            this.f25586c = i12;
            this.f25587d = i13;
            this.f25588e = i14;
            this.f25589f = f10;
            this.f25590g = f11;
            this.f25591h = interfaceC11143d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p307q8.InterfaceC10312r.b
        /* renamed from: a */
        public final InterfaceC10312r[] mo30865a(InterfaceC10312r.a[] aVarArr, InterfaceC10817e interfaceC10817e, InterfaceC11684a0.b bVar, AbstractC11018d4 abstractC11018d4) {
            AbstractC5907w m30848B = C10293a.m30848B(aVarArr);
            InterfaceC10312r[] interfaceC10312rArr = new InterfaceC10312r[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                InterfaceC10312r.a aVar = aVarArr[i10];
                if (aVar != null) {
                    int[] iArr = aVar.f25734b;
                    if (iArr.length != 0) {
                        interfaceC10312rArr[i10] = iArr.length == 1 ? new C10313s(aVar.f25733a, iArr[0], aVar.f25735c) : m30866b(aVar.f25733a, iArr, aVar.f25735c, interfaceC10817e, (AbstractC5907w) m30848B.get(i10));
                    }
                }
            }
            return interfaceC10312rArr;
        }

        /* renamed from: b */
        protected C10293a m30866b(C11694d1 c11694d1, int[] iArr, int i10, InterfaceC10817e interfaceC10817e, AbstractC5907w<a> abstractC5907w) {
            return new C10293a(c11694d1, iArr, i10, interfaceC10817e, this.f25584a, this.f25585b, this.f25586c, this.f25587d, this.f25588e, this.f25589f, this.f25590g, abstractC5907w, this.f25591h);
        }
    }

    protected C10293a(C11694d1 c11694d1, int[] iArr, int i10, InterfaceC10817e interfaceC10817e, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List<a> list, InterfaceC11143d interfaceC11143d) {
        super(c11694d1, iArr, i10);
        InterfaceC10817e interfaceC10817e2;
        long j13;
        if (j12 < j10) {
            C11173s.m34970i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            interfaceC10817e2 = interfaceC10817e;
            j13 = j10;
        } else {
            interfaceC10817e2 = interfaceC10817e;
            j13 = j12;
        }
        this.f25567h = interfaceC10817e2;
        this.f25568i = j10 * 1000;
        this.f25569j = j11 * 1000;
        this.f25570k = j13 * 1000;
        this.f25571l = i11;
        this.f25572m = i12;
        this.f25573n = f10;
        this.f25574o = f11;
        this.f25575p = AbstractC5907w.m15079r(list);
        this.f25576q = interfaceC11143d;
        this.f25577r = 1.0f;
        this.f25579t = 0;
        this.f25580u = -9223372036854775807L;
    }

    /* renamed from: A */
    private int m30847A(long j10, long j11) {
        long m30849C = m30849C(j11);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f25600b; i11++) {
            if (j10 == Long.MIN_VALUE || !mo30887j(i11, j10)) {
                C11108u1 mo30881a = mo30881a(i11);
                if (m30864z(mo30881a, mo30881a.f28793s, m30849C)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static AbstractC5907w<AbstractC5907w<a>> m30848B(InterfaceC10312r.a[] aVarArr) {
        AbstractC5907w.a aVar;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC10312r.a aVar2 : aVarArr) {
            if (aVar2 == null || aVar2.f25734b.length <= 1) {
                aVar = null;
            } else {
                aVar = AbstractC5907w.m15077p();
                aVar.mo14724a(new a(0L, 0L));
            }
            arrayList.add(aVar);
        }
        long[][] m30852G = m30852G(aVarArr);
        int[] iArr = new int[m30852G.length];
        long[] jArr = new long[m30852G.length];
        for (int i10 = 0; i10 < m30852G.length; i10++) {
            long[] jArr2 = m30852G[i10];
            jArr[i10] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        m30857y(arrayList, jArr);
        AbstractC5907w<Integer> m30853H = m30853H(m30852G);
        for (int i11 = 0; i11 < m30853H.size(); i11++) {
            int intValue = m30853H.get(i11).intValue();
            int i12 = iArr[intValue] + 1;
            iArr[intValue] = i12;
            jArr[intValue] = m30852G[intValue][i12];
            m30857y(arrayList, jArr);
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr[i13] = jArr[i13] * 2;
            }
        }
        m30857y(arrayList, jArr);
        AbstractC5907w.a m15077p = AbstractC5907w.m15077p();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            AbstractC5907w.a aVar3 = (AbstractC5907w.a) arrayList.get(i14);
            m15077p.mo14724a(aVar3 == null ? AbstractC5907w.m15081v() : aVar3.m15094k());
        }
        return m15077p.m15094k();
    }

    /* renamed from: C */
    private long m30849C(long j10) {
        long m30854I = m30854I(j10);
        if (this.f25575p.isEmpty()) {
            return m30854I;
        }
        int i10 = 1;
        while (i10 < this.f25575p.size() - 1 && this.f25575p.get(i10).f25582a < m30854I) {
            i10++;
        }
        a aVar = this.f25575p.get(i10 - 1);
        a aVar2 = this.f25575p.get(i10);
        long j11 = aVar.f25582a;
        float f10 = ((float) (m30854I - j11)) / ((float) (aVar2.f25582a - j11));
        return aVar.f25583b + (f10 * ((float) (aVar2.f25583b - r2)));
    }

    /* renamed from: D */
    private long m30850D(List<? extends AbstractC12348n> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        AbstractC12348n abstractC12348n = (AbstractC12348n) C5867e0.m14838d(list);
        long j10 = abstractC12348n.f33119g;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = abstractC12348n.f33120h;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    /* renamed from: F */
    private long m30851F(InterfaceC12349o[] interfaceC12349oArr, List<? extends AbstractC12348n> list) {
        int i10 = this.f25578s;
        if (i10 < interfaceC12349oArr.length && interfaceC12349oArr[i10].next()) {
            InterfaceC12349o interfaceC12349o = interfaceC12349oArr[this.f25578s];
            return interfaceC12349o.mo208b() - interfaceC12349o.mo207a();
        }
        for (InterfaceC12349o interfaceC12349o2 : interfaceC12349oArr) {
            if (interfaceC12349o2.next()) {
                return interfaceC12349o2.mo208b() - interfaceC12349o2.mo207a();
            }
        }
        return m30850D(list);
    }

    /* renamed from: G */
    private static long[][] m30852G(InterfaceC10312r.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            InterfaceC10312r.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f25734b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f25734b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    long j10 = aVar.f25733a.m36849d(iArr[i11]).f28793s;
                    long[] jArr2 = jArr[i10];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i11] = j10;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    /* renamed from: H */
    private static AbstractC5907w<Integer> m30853H(long[][] jArr) {
        InterfaceC5884k0 mo14998e = AbstractC5886l0.m14994c().m14999a().mo14998e();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long[] jArr2 = jArr[i10];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    long[] jArr3 = jArr[i10];
                    double d10 = 0.0d;
                    if (i11 >= jArr3.length) {
                        break;
                    }
                    long j10 = jArr3[i11];
                    if (j10 != -1) {
                        d10 = Math.log(j10);
                    }
                    dArr[i11] = d10;
                    i11++;
                }
                int i12 = length - 1;
                double d11 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d12 = dArr[i13];
                    i13++;
                    mo14998e.put(Double.valueOf(d11 == 0.0d ? 1.0d : (((d12 + dArr[i13]) * 0.5d) - dArr[0]) / d11), Integer.valueOf(i10));
                }
            }
        }
        return AbstractC5907w.m15079r(mo14998e.values());
    }

    /* renamed from: I */
    private long m30854I(long j10) {
        long mo32960g = ((float) this.f25567h.mo32960g()) * this.f25573n;
        if (this.f25567h.m32957b() == -9223372036854775807L || j10 == -9223372036854775807L) {
            return ((float) mo32960g) / this.f25577r;
        }
        float f10 = (float) j10;
        return (((float) mo32960g) * Math.max((f10 / this.f25577r) - ((float) r2), 0.0f)) / f10;
    }

    /* renamed from: J */
    private long m30855J(long j10, long j11) {
        if (j10 == -9223372036854775807L) {
            return this.f25568i;
        }
        if (j11 != -9223372036854775807L) {
            j10 -= j11;
        }
        return Math.min(((float) j10) * this.f25574o, this.f25568i);
    }

    /* renamed from: y */
    private static void m30857y(List<AbstractC5907w.a<a>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            AbstractC5907w.a<a> aVar = list.get(i10);
            if (aVar != null) {
                aVar.mo14724a(new a(j10, jArr[i10]));
            }
        }
    }

    /* renamed from: E */
    protected long m30858E() {
        return this.f25570k;
    }

    /* renamed from: K */
    protected boolean m30859K(long j10, List<? extends AbstractC12348n> list) {
        long j11 = this.f25580u;
        return j11 == -9223372036854775807L || j10 - j11 >= 1000 || !(list.isEmpty() || ((AbstractC12348n) C5867e0.m14838d(list)).equals(this.f25581v));
    }

    @Override // p307q8.AbstractC10297c, p307q8.InterfaceC10312r
    /* renamed from: f */
    public void mo30860f() {
        this.f25581v = null;
    }

    @Override // p307q8.InterfaceC10312r
    /* renamed from: g */
    public void mo209g(long j10, long j11, long j12, List<? extends AbstractC12348n> list, InterfaceC12349o[] interfaceC12349oArr) {
        long mo34622b = this.f25576q.mo34622b();
        long m30851F = m30851F(interfaceC12349oArr, list);
        int i10 = this.f25579t;
        if (i10 == 0) {
            this.f25579t = 1;
            this.f25578s = m30847A(mo34622b, m30851F);
            return;
        }
        int i11 = this.f25578s;
        int mo30885e = list.isEmpty() ? -1 : mo30885e(((AbstractC12348n) C5867e0.m14838d(list)).f33116d);
        if (mo30885e != -1) {
            i10 = ((AbstractC12348n) C5867e0.m14838d(list)).f33117e;
            i11 = mo30885e;
        }
        int m30847A = m30847A(mo34622b, m30851F);
        if (!mo30887j(i11, mo34622b)) {
            C11108u1 mo30881a = mo30881a(i11);
            C11108u1 mo30881a2 = mo30881a(m30847A);
            long m30855J = m30855J(j12, m30851F);
            int i12 = mo30881a2.f28793s;
            int i13 = mo30881a.f28793s;
            if ((i12 > i13 && j11 < m30855J) || (i12 < i13 && j11 >= this.f25569j)) {
                m30847A = i11;
            }
        }
        if (m30847A != i11) {
            i10 = 3;
        }
        this.f25579t = i10;
        this.f25578s = m30847A;
    }

    @Override // p307q8.InterfaceC10312r
    /* renamed from: h */
    public int mo210h() {
        return this.f25578s;
    }

    @Override // p307q8.AbstractC10297c, p307q8.InterfaceC10312r
    /* renamed from: l */
    public void mo30861l(float f10) {
        this.f25577r = f10;
    }

    @Override // p307q8.InterfaceC10312r
    /* renamed from: m */
    public Object mo211m() {
        return null;
    }

    @Override // p307q8.AbstractC10297c, p307q8.InterfaceC10312r
    /* renamed from: p */
    public void mo30862p() {
        this.f25580u = -9223372036854775807L;
        this.f25581v = null;
    }

    @Override // p307q8.AbstractC10297c, p307q8.InterfaceC10312r
    /* renamed from: q */
    public int mo30863q(long j10, List<? extends AbstractC12348n> list) {
        int i10;
        int i11;
        long mo34622b = this.f25576q.mo34622b();
        if (!m30859K(mo34622b, list)) {
            return list.size();
        }
        this.f25580u = mo34622b;
        this.f25581v = list.isEmpty() ? null : (AbstractC12348n) C5867e0.m14838d(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long m34921f0 = C11172r0.m34921f0(list.get(size - 1).f33119g - j10, this.f25577r);
        long m30858E = m30858E();
        if (m34921f0 < m30858E) {
            return size;
        }
        C11108u1 mo30881a = mo30881a(m30847A(mo34622b, m30850D(list)));
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC12348n abstractC12348n = list.get(i12);
            C11108u1 c11108u1 = abstractC12348n.f33116d;
            if (C11172r0.m34921f0(abstractC12348n.f33119g - j10, this.f25577r) >= m30858E && c11108u1.f28793s < mo30881a.f28793s && (i10 = c11108u1.f28769C) != -1 && i10 <= this.f25572m && (i11 = c11108u1.f28768B) != -1 && i11 <= this.f25571l && i10 < mo30881a.f28769C) {
                return i12;
            }
        }
        return size;
    }

    @Override // p307q8.InterfaceC10312r
    /* renamed from: t */
    public int mo212t() {
        return this.f25579t;
    }

    /* renamed from: z */
    protected boolean m30864z(C11108u1 c11108u1, int i10, long j10) {
        return ((long) i10) <= j10;
    }
}
