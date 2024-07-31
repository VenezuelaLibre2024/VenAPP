package p243n0;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p190k0.C9102d;
import p190k0.C9107i;
import p243n0.C9622e;
import p260o0.C9754b;
import p260o0.C9757e;

/* renamed from: n0.f */
/* loaded from: classes.dex */
public class C9623f extends C9629l {

    /* renamed from: O0 */
    private int f23545O0;

    /* renamed from: S0 */
    int f23549S0;

    /* renamed from: T0 */
    int f23550T0;

    /* renamed from: U0 */
    int f23551U0;

    /* renamed from: V0 */
    int f23552V0;

    /* renamed from: M0 */
    C9754b f23543M0 = new C9754b(this);

    /* renamed from: N0 */
    public C9757e f23544N0 = new C9757e(this);

    /* renamed from: P0 */
    protected C9754b.b f23546P0 = null;

    /* renamed from: Q0 */
    private boolean f23547Q0 = false;

    /* renamed from: R0 */
    protected C9102d f23548R0 = new C9102d();

    /* renamed from: W0 */
    public int f23553W0 = 0;

    /* renamed from: X0 */
    public int f23554X0 = 0;

    /* renamed from: Y0 */
    C9620c[] f23555Y0 = new C9620c[4];

    /* renamed from: Z0 */
    C9620c[] f23556Z0 = new C9620c[4];

    /* renamed from: a1 */
    public boolean f23557a1 = false;

    /* renamed from: b1 */
    public boolean f23558b1 = false;

    /* renamed from: c1 */
    public boolean f23559c1 = false;

    /* renamed from: d1 */
    public int f23560d1 = 0;

    /* renamed from: e1 */
    public int f23561e1 = 0;

    /* renamed from: f1 */
    private int f23562f1 = 257;

    /* renamed from: g1 */
    public boolean f23563g1 = false;

    /* renamed from: h1 */
    private boolean f23564h1 = false;

    /* renamed from: i1 */
    private boolean f23565i1 = false;

    /* renamed from: j1 */
    int f23566j1 = 0;

    /* renamed from: k1 */
    private WeakReference<C9621d> f23567k1 = null;

    /* renamed from: l1 */
    private WeakReference<C9621d> f23568l1 = null;

    /* renamed from: m1 */
    private WeakReference<C9621d> f23569m1 = null;

    /* renamed from: n1 */
    private WeakReference<C9621d> f23570n1 = null;

    /* renamed from: o1 */
    HashSet<C9622e> f23571o1 = new HashSet<>();

    /* renamed from: p1 */
    public C9754b.a f23572p1 = new C9754b.a();

    /* renamed from: O1 */
    public static boolean m28773O1(int i10, C9622e c9622e, C9754b.b bVar, C9754b.a aVar, int i11) {
        int i12;
        int i13;
        if (bVar == null) {
            return false;
        }
        if (c9622e.m28706T() == 8 || (c9622e instanceof C9624g) || (c9622e instanceof C9618a)) {
            aVar.f23998e = 0;
            aVar.f23999f = 0;
            return false;
        }
        aVar.f23994a = c9622e.m28769y();
        aVar.f23995b = c9622e.m28702R();
        aVar.f23996c = c9622e.m28708U();
        aVar.f23997d = c9622e.m28765v();
        aVar.f24002i = false;
        aVar.f24003j = i11;
        C9622e.b bVar2 = aVar.f23994a;
        C9622e.b bVar3 = C9622e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar2 == bVar3;
        boolean z11 = aVar.f23995b == bVar3;
        boolean z12 = z10 && c9622e.f23496d0 > 0.0f;
        boolean z13 = z11 && c9622e.f23496d0 > 0.0f;
        if (z10 && c9622e.m28716Y(0) && c9622e.f23533w == 0 && !z12) {
            aVar.f23994a = C9622e.b.WRAP_CONTENT;
            if (z11 && c9622e.f23535x == 0) {
                aVar.f23994a = C9622e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && c9622e.m28716Y(1) && c9622e.f23535x == 0 && !z13) {
            aVar.f23995b = C9622e.b.WRAP_CONTENT;
            if (z10 && c9622e.f23533w == 0) {
                aVar.f23995b = C9622e.b.FIXED;
            }
            z11 = false;
        }
        if (c9622e.mo28627l0()) {
            aVar.f23994a = C9622e.b.FIXED;
            z10 = false;
        }
        if (c9622e.mo28628m0()) {
            aVar.f23995b = C9622e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (c9622e.f23537y[0] == 4) {
                aVar.f23994a = C9622e.b.FIXED;
            } else if (!z11) {
                C9622e.b bVar4 = aVar.f23995b;
                C9622e.b bVar5 = C9622e.b.FIXED;
                if (bVar4 == bVar5) {
                    i13 = aVar.f23997d;
                } else {
                    aVar.f23994a = C9622e.b.WRAP_CONTENT;
                    bVar.mo3831b(c9622e, aVar);
                    i13 = aVar.f23999f;
                }
                aVar.f23994a = bVar5;
                aVar.f23996c = (int) (c9622e.m28762t() * i13);
            }
        }
        if (z13) {
            if (c9622e.f23537y[1] == 4) {
                aVar.f23995b = C9622e.b.FIXED;
            } else if (!z10) {
                C9622e.b bVar6 = aVar.f23994a;
                C9622e.b bVar7 = C9622e.b.FIXED;
                if (bVar6 == bVar7) {
                    i12 = aVar.f23996c;
                } else {
                    aVar.f23995b = C9622e.b.WRAP_CONTENT;
                    bVar.mo3831b(c9622e, aVar);
                    i12 = aVar.f23998e;
                }
                aVar.f23995b = bVar7;
                aVar.f23997d = c9622e.m28764u() == -1 ? (int) (i12 / c9622e.m28762t()) : (int) (c9622e.m28762t() * i12);
            }
        }
        bVar.mo3831b(c9622e, aVar);
        c9622e.m28736h1(aVar.f23998e);
        c9622e.m28687I0(aVar.f23999f);
        c9622e.m28685H0(aVar.f24001h);
        c9622e.m28768x0(aVar.f24000g);
        aVar.f24003j = C9754b.a.f23991k;
        return aVar.f24002i;
    }

    /* renamed from: Q1 */
    private void m28774Q1() {
        this.f23553W0 = 0;
        this.f23554X0 = 0;
    }

    /* renamed from: u1 */
    private void m28775u1(C9622e c9622e) {
        int i10 = this.f23553W0 + 1;
        C9620c[] c9620cArr = this.f23556Z0;
        if (i10 >= c9620cArr.length) {
            this.f23556Z0 = (C9620c[]) Arrays.copyOf(c9620cArr, c9620cArr.length * 2);
        }
        this.f23556Z0[this.f23553W0] = new C9620c(c9622e, 0, m28790L1());
        this.f23553W0++;
    }

    /* renamed from: x1 */
    private void m28776x1(C9621d c9621d, C9107i c9107i) {
        this.f23548R0.m26785h(c9107i, this.f23548R0.m26792q(c9621d), 0, 5);
    }

    /* renamed from: y1 */
    private void m28777y1(C9621d c9621d, C9107i c9107i) {
        this.f23548R0.m26785h(this.f23548R0.m26792q(c9621d), c9107i, 0, 5);
    }

    /* renamed from: z1 */
    private void m28778z1(C9622e c9622e) {
        int i10 = this.f23554X0 + 1;
        C9620c[] c9620cArr = this.f23555Y0;
        if (i10 >= c9620cArr.length) {
            this.f23555Y0 = (C9620c[]) Arrays.copyOf(c9620cArr, c9620cArr.length * 2);
        }
        this.f23555Y0[this.f23554X0] = new C9620c(c9622e, 1, m28790L1());
        this.f23554X0++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A1 */
    public void m28779A1(C9621d c9621d) {
        WeakReference<C9621d> weakReference = this.f23569m1;
        if (weakReference == null || weakReference.get() == null || c9621d.m28646d() > this.f23569m1.get().m28646d()) {
            this.f23569m1 = new WeakReference<>(c9621d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B1 */
    public void m28780B1(C9621d c9621d) {
        WeakReference<C9621d> weakReference = this.f23567k1;
        if (weakReference == null || weakReference.get() == null || c9621d.m28646d() > this.f23567k1.get().m28646d()) {
            this.f23567k1 = new WeakReference<>(c9621d);
        }
    }

    /* renamed from: C1 */
    public boolean m28781C1(boolean z10) {
        return this.f23544N0.m29254f(z10);
    }

    /* renamed from: D1 */
    public boolean m28782D1(boolean z10) {
        return this.f23544N0.m29255g(z10);
    }

    /* renamed from: E1 */
    public boolean m28783E1(boolean z10, int i10) {
        return this.f23544N0.m29256h(z10, i10);
    }

    /* renamed from: F1 */
    public C9754b.b m28784F1() {
        return this.f23546P0;
    }

    /* renamed from: G1 */
    public int m28785G1() {
        return this.f23562f1;
    }

    /* renamed from: H1 */
    public C9102d m28786H1() {
        return this.f23548R0;
    }

    /* renamed from: I1 */
    public void m28787I1() {
        this.f23544N0.m29257j();
    }

    /* renamed from: J1 */
    public void m28788J1() {
        this.f23544N0.m29258k();
    }

    /* renamed from: K1 */
    public boolean m28789K1() {
        return this.f23565i1;
    }

    /* renamed from: L1 */
    public boolean m28790L1() {
        return this.f23547Q0;
    }

    @Override // p243n0.C9622e
    /* renamed from: M */
    public void mo28694M(StringBuilder sb2) {
        sb2.append(this.f23517o + ":{\n");
        sb2.append("  actualWidth:" + this.f23492b0);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f23494c0);
        sb2.append("\n");
        Iterator<C9622e> it = m28826o1().iterator();
        while (it.hasNext()) {
            it.next().mo28694M(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    /* renamed from: M1 */
    public boolean m28791M1() {
        return this.f23564h1;
    }

    /* renamed from: N1 */
    public long m28792N1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f23549S0 = i17;
        this.f23550T0 = i18;
        return this.f23543M0.m29236d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    /* renamed from: P1 */
    public boolean m28793P1(int i10) {
        return (this.f23562f1 & i10) == i10;
    }

    /* renamed from: R1 */
    public void m28794R1(C9754b.b bVar) {
        this.f23546P0 = bVar;
        this.f23544N0.m29260n(bVar);
    }

    /* renamed from: S1 */
    public void m28795S1(int i10) {
        this.f23562f1 = i10;
        C9102d.f21872r = m28793P1(RecognitionOptions.UPC_A);
    }

    /* renamed from: T1 */
    public void m28796T1(int i10) {
        this.f23545O0 = i10;
    }

    /* renamed from: U1 */
    public void m28797U1(boolean z10) {
        this.f23547Q0 = z10;
    }

    /* renamed from: V1 */
    public boolean m28798V1(C9102d c9102d, boolean[] zArr) {
        zArr[2] = false;
        boolean m28793P1 = m28793P1(64);
        mo28751n1(c9102d, m28793P1);
        int size = this.f23598L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C9622e c9622e = this.f23598L0.get(i10);
            c9622e.mo28751n1(c9102d, m28793P1);
            if (c9622e.m28720a0()) {
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: W1 */
    public void m28799W1() {
        this.f23543M0.m29237e(this);
    }

    @Override // p243n0.C9622e
    /* renamed from: m1 */
    public void mo28748m1(boolean z10, boolean z11) {
        super.mo28748m1(z10, z11);
        int size = this.f23598L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f23598L0.get(i10).mo28748m1(z10, z11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0310  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // p243n0.C9629l
    /* renamed from: p1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo28800p1() {
        /*
            Method dump skipped, instructions count: 813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p243n0.C9623f.mo28800p1():void");
    }

    @Override // p243n0.C9629l, p243n0.C9622e
    /* renamed from: r0 */
    public void mo28759r0() {
        this.f23548R0.m26778D();
        this.f23549S0 = 0;
        this.f23551U0 = 0;
        this.f23550T0 = 0;
        this.f23552V0 = 0;
        this.f23563g1 = false;
        super.mo28759r0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s1 */
    public void m28801s1(C9622e c9622e, int i10) {
        if (i10 == 0) {
            m28775u1(c9622e);
        } else if (i10 == 1) {
            m28778z1(c9622e);
        }
    }

    /* renamed from: t1 */
    public boolean m28802t1(C9102d c9102d) {
        boolean m28793P1 = m28793P1(64);
        mo28625g(c9102d, m28793P1);
        int size = this.f23598L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C9622e c9622e = this.f23598L0.get(i10);
            c9622e.m28699P0(0, false);
            c9622e.m28699P0(1, false);
            if (c9622e instanceof C9618a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                C9622e c9622e2 = this.f23598L0.get(i11);
                if (c9622e2 instanceof C9618a) {
                    ((C9618a) c9622e2).m28634v1();
                }
            }
        }
        this.f23571o1.clear();
        for (int i12 = 0; i12 < size; i12++) {
            C9622e c9622e3 = this.f23598L0.get(i12);
            if (c9622e3.m28730f()) {
                if (c9622e3 instanceof C9628k) {
                    this.f23571o1.add(c9622e3);
                } else {
                    c9622e3.mo28625g(c9102d, m28793P1);
                }
            }
        }
        while (this.f23571o1.size() > 0) {
            int size2 = this.f23571o1.size();
            Iterator<C9622e> it = this.f23571o1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C9628k c9628k = (C9628k) it.next();
                if (c9628k.m28823r1(this.f23571o1)) {
                    c9628k.mo28625g(c9102d, m28793P1);
                    this.f23571o1.remove(c9628k);
                    break;
                }
            }
            if (size2 == this.f23571o1.size()) {
                Iterator<C9622e> it2 = this.f23571o1.iterator();
                while (it2.hasNext()) {
                    it2.next().mo28625g(c9102d, m28793P1);
                }
                this.f23571o1.clear();
            }
        }
        if (C9102d.f21872r) {
            HashSet<C9622e> hashSet = new HashSet<>();
            for (int i13 = 0; i13 < size; i13++) {
                C9622e c9622e4 = this.f23598L0.get(i13);
                if (!c9622e4.m28730f()) {
                    hashSet.add(c9622e4);
                }
            }
            m28727e(this, c9102d, hashSet, m28769y() == C9622e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<C9622e> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                C9622e next = it3.next();
                C9627j.m28820a(this, c9102d, next);
                next.mo28625g(c9102d, m28793P1);
            }
        } else {
            for (int i14 = 0; i14 < size; i14++) {
                C9622e c9622e5 = this.f23598L0.get(i14);
                if (c9622e5 instanceof C9623f) {
                    C9622e.b[] bVarArr = c9622e5.f23488Z;
                    C9622e.b bVar = bVarArr[0];
                    C9622e.b bVar2 = bVarArr[1];
                    C9622e.b bVar3 = C9622e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        c9622e5.m28695M0(C9622e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        c9622e5.m28726d1(C9622e.b.FIXED);
                    }
                    c9622e5.mo28625g(c9102d, m28793P1);
                    if (bVar == bVar3) {
                        c9622e5.m28695M0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        c9622e5.m28726d1(bVar2);
                    }
                } else {
                    C9627j.m28820a(this, c9102d, c9622e5);
                    if (!c9622e5.m28730f()) {
                        c9622e5.mo28625g(c9102d, m28793P1);
                    }
                }
            }
        }
        if (this.f23553W0 > 0) {
            C9619b.m28639b(this, c9102d, null, 0);
        }
        if (this.f23554X0 > 0) {
            C9619b.m28639b(this, c9102d, null, 1);
        }
        return true;
    }

    /* renamed from: v1 */
    public void m28803v1(C9621d c9621d) {
        WeakReference<C9621d> weakReference = this.f23570n1;
        if (weakReference == null || weakReference.get() == null || c9621d.m28646d() > this.f23570n1.get().m28646d()) {
            this.f23570n1 = new WeakReference<>(c9621d);
        }
    }

    /* renamed from: w1 */
    public void m28804w1(C9621d c9621d) {
        WeakReference<C9621d> weakReference = this.f23568l1;
        if (weakReference == null || weakReference.get() == null || c9621d.m28646d() > this.f23568l1.get().m28646d()) {
            this.f23568l1 = new WeakReference<>(c9621d);
        }
    }
}
