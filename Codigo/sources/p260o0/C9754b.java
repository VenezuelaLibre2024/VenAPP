package p260o0;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import p190k0.C9102d;
import p243n0.C9621d;
import p243n0.C9622e;
import p243n0.C9623f;
import p243n0.C9624g;
import p243n0.C9627j;
import p243n0.C9628k;
import p243n0.InterfaceC9625h;

/* renamed from: o0.b */
/* loaded from: classes.dex */
public class C9754b {

    /* renamed from: a */
    private final ArrayList<C9622e> f23988a = new ArrayList<>();

    /* renamed from: b */
    private a f23989b = new a();

    /* renamed from: c */
    private C9623f f23990c;

    /* renamed from: o0.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: k */
        public static int f23991k = 0;

        /* renamed from: l */
        public static int f23992l = 1;

        /* renamed from: m */
        public static int f23993m = 2;

        /* renamed from: a */
        public C9622e.b f23994a;

        /* renamed from: b */
        public C9622e.b f23995b;

        /* renamed from: c */
        public int f23996c;

        /* renamed from: d */
        public int f23997d;

        /* renamed from: e */
        public int f23998e;

        /* renamed from: f */
        public int f23999f;

        /* renamed from: g */
        public int f24000g;

        /* renamed from: h */
        public boolean f24001h;

        /* renamed from: i */
        public boolean f24002i;

        /* renamed from: j */
        public int f24003j;
    }

    /* renamed from: o0.b$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo3830a();

        /* renamed from: b */
        void mo3831b(C9622e c9622e, a aVar);
    }

    public C9754b(C9623f c9623f) {
        this.f23990c = c9623f;
    }

    /* renamed from: a */
    private boolean m29233a(b bVar, C9622e c9622e, int i10) {
        this.f23989b.f23994a = c9622e.m28769y();
        this.f23989b.f23995b = c9622e.m28702R();
        this.f23989b.f23996c = c9622e.m28708U();
        this.f23989b.f23997d = c9622e.m28765v();
        a aVar = this.f23989b;
        aVar.f24002i = false;
        aVar.f24003j = i10;
        C9622e.b bVar2 = aVar.f23994a;
        C9622e.b bVar3 = C9622e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar2 == bVar3;
        boolean z11 = aVar.f23995b == bVar3;
        boolean z12 = z10 && c9622e.f23496d0 > 0.0f;
        boolean z13 = z11 && c9622e.f23496d0 > 0.0f;
        if (z12 && c9622e.f23537y[0] == 4) {
            aVar.f23994a = C9622e.b.FIXED;
        }
        if (z13 && c9622e.f23537y[1] == 4) {
            aVar.f23995b = C9622e.b.FIXED;
        }
        bVar.mo3831b(c9622e, aVar);
        c9622e.m28736h1(this.f23989b.f23998e);
        c9622e.m28687I0(this.f23989b.f23999f);
        c9622e.m28685H0(this.f23989b.f24001h);
        c9622e.m28768x0(this.f23989b.f24000g);
        a aVar2 = this.f23989b;
        aVar2.f24003j = a.f23991k;
        return aVar2.f24002i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008d, code lost:
    
        if (r8 != r9) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0094, code lost:
    
        if (r5.f23496d0 <= 0.0f) goto L56;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m29234b(p243n0.C9623f r13) {
        /*
            r12 = this;
            java.util.ArrayList<n0.e> r0 = r13.f23598L0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.m28793P1(r1)
            o0.b$b r2 = r13.m28784F1()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto La4
            java.util.ArrayList<n0.e> r5 = r13.f23598L0
            java.lang.Object r5 = r5.get(r4)
            n0.e r5 = (p243n0.C9622e) r5
            boolean r6 = r5 instanceof p243n0.C9624g
            if (r6 == 0) goto L22
            goto La0
        L22:
            boolean r6 = r5 instanceof p243n0.C9618a
            if (r6 == 0) goto L28
            goto La0
        L28:
            boolean r6 = r5.m28740j0()
            if (r6 == 0) goto L30
            goto La0
        L30:
            if (r1 == 0) goto L47
            o0.l r6 = r5.f23497e
            if (r6 == 0) goto L47
            o0.n r7 = r5.f23499f
            if (r7 == 0) goto L47
            o0.g r6 = r6.f24063e
            boolean r6 = r6.f24024j
            if (r6 == 0) goto L47
            o0.g r6 = r7.f24063e
            boolean r6 = r6.f24024j
            if (r6 == 0) goto L47
            goto La0
        L47:
            n0.e$b r6 = r5.m28760s(r3)
            r7 = 1
            n0.e$b r8 = r5.m28760s(r7)
            n0.e$b r9 = p243n0.C9622e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f23533w
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f23535x
            if (r10 == r7) goto L60
            r10 = r7
            goto L61
        L60:
            r10 = r3
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.m28793P1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof p243n0.C9628k
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.f23533w
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.m28733g0()
            if (r11 != 0) goto L7c
            r10 = r7
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.f23535x
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.m28733g0()
            if (r11 != 0) goto L8b
            r10 = r7
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.f23496d0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La0
        L9b:
            int r6 = p260o0.C9754b.a.f23991k
            r12.m29233a(r2, r5, r6)
        La0:
            int r4 = r4 + 1
            goto L12
        La4:
            r2.mo3830a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p260o0.C9754b.m29234b(n0.f):void");
    }

    /* renamed from: c */
    private void m29235c(C9623f c9623f, String str, int i10, int i11, int i12) {
        int m28682G = c9623f.m28682G();
        int m28680F = c9623f.m28680F();
        c9623f.m28715X0(0);
        c9623f.m28713W0(0);
        c9623f.m28736h1(i11);
        c9623f.m28687I0(i12);
        c9623f.m28715X0(m28682G);
        c9623f.m28713W0(m28680F);
        this.f23990c.m28796T1(i10);
        this.f23990c.mo28800p1();
    }

    /* renamed from: d */
    public long m29236d(C9623f c9623f, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean z10;
        int i19;
        C9623f c9623f2;
        int i20;
        boolean z11;
        int i21;
        int i22;
        boolean z12;
        C9754b c9754b = this;
        b m28784F1 = c9623f.m28784F1();
        int size = c9623f.f23598L0.size();
        int m28708U = c9623f.m28708U();
        int m28765v = c9623f.m28765v();
        boolean m28821b = C9627j.m28821b(i10, RecognitionOptions.ITF);
        boolean z13 = m28821b || C9627j.m28821b(i10, 64);
        if (z13) {
            for (int i23 = 0; i23 < size; i23++) {
                C9622e c9622e = c9623f.f23598L0.get(i23);
                C9622e.b m28769y = c9622e.m28769y();
                C9622e.b bVar = C9622e.b.MATCH_CONSTRAINT;
                boolean z14 = (m28769y == bVar) && (c9622e.m28702R() == bVar) && c9622e.m28762t() > 0.0f;
                if ((c9622e.m28733g0() && z14) || ((c9622e.m28737i0() && z14) || (c9622e instanceof C9628k) || c9622e.m28733g0() || c9622e.m28737i0())) {
                    z13 = false;
                    break;
                }
            }
        }
        if (z13) {
            boolean z15 = C9102d.f21872r;
        }
        boolean z16 = z13 & ((i13 == 1073741824 && i15 == 1073741824) || m28821b);
        int i24 = 2;
        if (z16) {
            int min = Math.min(c9623f.m28678E(), i14);
            int min2 = Math.min(c9623f.m28676D(), i16);
            if (i13 == 1073741824 && c9623f.m28708U() != min) {
                c9623f.m28736h1(min);
                c9623f.m28787I1();
            }
            if (i15 == 1073741824 && c9623f.m28765v() != min2) {
                c9623f.m28687I0(min2);
                c9623f.m28787I1();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                z10 = c9623f.m28781C1(m28821b);
                i19 = 2;
            } else {
                boolean m28782D1 = c9623f.m28782D1(m28821b);
                if (i13 == 1073741824) {
                    m28782D1 &= c9623f.m28783E1(m28821b, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    z10 = c9623f.m28783E1(m28821b, 1) & m28782D1;
                    i19++;
                } else {
                    z10 = m28782D1;
                }
            }
            if (z10) {
                c9623f.mo28748m1(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            z10 = false;
            i19 = 0;
        }
        if (z10 && i19 == 2) {
            return 0L;
        }
        int m28785G1 = c9623f.m28785G1();
        if (size > 0) {
            m29234b(c9623f);
        }
        m29237e(c9623f);
        int size2 = c9754b.f23988a.size();
        if (size > 0) {
            m29235c(c9623f, "First pass", 0, m28708U, m28765v);
        }
        if (size2 > 0) {
            C9622e.b m28769y2 = c9623f.m28769y();
            C9622e.b bVar2 = C9622e.b.WRAP_CONTENT;
            boolean z17 = m28769y2 == bVar2;
            boolean z18 = c9623f.m28702R() == bVar2;
            int max = Math.max(c9623f.m28708U(), c9754b.f23990c.m28682G());
            int max2 = Math.max(c9623f.m28765v(), c9754b.f23990c.m28680F());
            int i25 = 0;
            boolean z19 = false;
            while (i25 < size2) {
                C9622e c9622e2 = c9754b.f23988a.get(i25);
                if (c9622e2 instanceof C9628k) {
                    int m28708U2 = c9622e2.m28708U();
                    int m28765v2 = c9622e2.m28765v();
                    i22 = m28785G1;
                    boolean m29233a = c9754b.m29233a(m28784F1, c9622e2, a.f23992l) | z19;
                    int m28708U3 = c9622e2.m28708U();
                    int m28765v3 = c9622e2.m28765v();
                    if (m28708U3 != m28708U2) {
                        c9622e2.m28736h1(m28708U3);
                        if (z17 && c9622e2.m28690K() > max) {
                            max = Math.max(max, c9622e2.m28690K() + c9622e2.mo28747m(C9621d.b.RIGHT).m28647e());
                        }
                        z12 = true;
                    } else {
                        z12 = m29233a;
                    }
                    if (m28765v3 != m28765v2) {
                        c9622e2.m28687I0(m28765v3);
                        if (z18 && c9622e2.m28754p() > max2) {
                            max2 = Math.max(max2, c9622e2.m28754p() + c9622e2.mo28747m(C9621d.b.BOTTOM).m28647e());
                        }
                        z12 = true;
                    }
                    z19 = z12 | ((C9628k) c9622e2).m28824s1();
                } else {
                    i22 = m28785G1;
                }
                i25++;
                m28785G1 = i22;
                i24 = 2;
            }
            int i26 = m28785G1;
            int i27 = i24;
            int i28 = 0;
            while (i28 < i27) {
                int i29 = 0;
                while (i29 < size2) {
                    C9622e c9622e3 = c9754b.f23988a.get(i29);
                    if (((c9622e3 instanceof InterfaceC9625h) && !(c9622e3 instanceof C9628k)) || (c9622e3 instanceof C9624g) || c9622e3.m28706T() == 8 || ((z16 && c9622e3.f23497e.f24063e.f24024j && c9622e3.f23499f.f24063e.f24024j) || (c9622e3 instanceof C9628k))) {
                        z11 = z16;
                        i21 = size2;
                    } else {
                        int m28708U4 = c9622e3.m28708U();
                        int m28765v4 = c9622e3.m28765v();
                        z11 = z16;
                        int m28749n = c9622e3.m28749n();
                        int i30 = a.f23992l;
                        i21 = size2;
                        if (i28 == 1) {
                            i30 = a.f23993m;
                        }
                        boolean m29233a2 = c9754b.m29233a(m28784F1, c9622e3, i30) | z19;
                        int m28708U5 = c9622e3.m28708U();
                        int m28765v5 = c9622e3.m28765v();
                        if (m28708U5 != m28708U4) {
                            c9622e3.m28736h1(m28708U5);
                            if (z17 && c9622e3.m28690K() > max) {
                                max = Math.max(max, c9622e3.m28690K() + c9622e3.mo28747m(C9621d.b.RIGHT).m28647e());
                            }
                            m29233a2 = true;
                        }
                        if (m28765v5 != m28765v4) {
                            c9622e3.m28687I0(m28765v5);
                            if (z18 && c9622e3.m28754p() > max2) {
                                max2 = Math.max(max2, c9622e3.m28754p() + c9622e3.mo28747m(C9621d.b.BOTTOM).m28647e());
                            }
                            m29233a2 = true;
                        }
                        z19 = (!c9622e3.m28714X() || m28749n == c9622e3.m28749n()) ? m29233a2 : true;
                    }
                    i29++;
                    c9754b = this;
                    z16 = z11;
                    size2 = i21;
                }
                boolean z20 = z16;
                int i31 = size2;
                if (!z19) {
                    break;
                }
                i28++;
                m29235c(c9623f, "intermediate pass", i28, m28708U, m28765v);
                c9754b = this;
                z16 = z20;
                size2 = i31;
                i27 = 2;
                z19 = false;
            }
            c9623f2 = c9623f;
            i20 = i26;
        } else {
            c9623f2 = c9623f;
            i20 = m28785G1;
        }
        c9623f2.m28795S1(i20);
        return 0L;
    }

    /* renamed from: e */
    public void m29237e(C9623f c9623f) {
        this.f23988a.clear();
        int size = c9623f.f23598L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            C9622e c9622e = c9623f.f23598L0.get(i10);
            C9622e.b m28769y = c9622e.m28769y();
            C9622e.b bVar = C9622e.b.MATCH_CONSTRAINT;
            if (m28769y == bVar || c9622e.m28702R() == bVar) {
                this.f23988a.add(c9622e);
            }
        }
        c9623f.m28787I1();
    }
}
