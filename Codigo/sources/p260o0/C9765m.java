package p260o0;

import java.util.ArrayList;
import p243n0.C9623f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o0.m */
/* loaded from: classes.dex */
public class C9765m {

    /* renamed from: h */
    public static int f24033h;

    /* renamed from: c */
    AbstractC9768p f24036c;

    /* renamed from: d */
    AbstractC9768p f24037d;

    /* renamed from: f */
    int f24039f;

    /* renamed from: g */
    int f24040g;

    /* renamed from: a */
    public int f24034a = 0;

    /* renamed from: b */
    public boolean f24035b = false;

    /* renamed from: e */
    ArrayList<AbstractC9768p> f24038e = new ArrayList<>();

    public C9765m(AbstractC9768p abstractC9768p, int i10) {
        this.f24036c = null;
        this.f24037d = null;
        int i11 = f24033h;
        this.f24039f = i11;
        f24033h = i11 + 1;
        this.f24036c = abstractC9768p;
        this.f24037d = abstractC9768p;
        this.f24040g = i10;
    }

    /* renamed from: c */
    private long m29281c(C9758f c9758f, long j10) {
        AbstractC9768p abstractC9768p = c9758f.f24018d;
        if (abstractC9768p instanceof C9763k) {
            return j10;
        }
        int size = c9758f.f24025k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC9756d interfaceC9756d = c9758f.f24025k.get(i10);
            if (interfaceC9756d instanceof C9758f) {
                C9758f c9758f2 = (C9758f) interfaceC9756d;
                if (c9758f2.f24018d != abstractC9768p) {
                    j11 = Math.min(j11, m29281c(c9758f2, c9758f2.f24020f + j10));
                }
            }
        }
        if (c9758f != abstractC9768p.f24067i) {
            return j11;
        }
        long mo29245j = j10 - abstractC9768p.mo29245j();
        return Math.min(Math.min(j11, m29281c(abstractC9768p.f24066h, mo29245j)), mo29245j - abstractC9768p.f24066h.f24020f);
    }

    /* renamed from: d */
    private long m29282d(C9758f c9758f, long j10) {
        AbstractC9768p abstractC9768p = c9758f.f24018d;
        if (abstractC9768p instanceof C9763k) {
            return j10;
        }
        int size = c9758f.f24025k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC9756d interfaceC9756d = c9758f.f24025k.get(i10);
            if (interfaceC9756d instanceof C9758f) {
                C9758f c9758f2 = (C9758f) interfaceC9756d;
                if (c9758f2.f24018d != abstractC9768p) {
                    j11 = Math.max(j11, m29282d(c9758f2, c9758f2.f24020f + j10));
                }
            }
        }
        if (c9758f != abstractC9768p.f24066h) {
            return j11;
        }
        long mo29245j = j10 + abstractC9768p.mo29245j();
        return Math.max(Math.max(j11, m29282d(abstractC9768p.f24067i, mo29245j)), mo29245j - abstractC9768p.f24067i.f24020f);
    }

    /* renamed from: a */
    public void m29283a(AbstractC9768p abstractC9768p) {
        this.f24038e.add(abstractC9768p);
        this.f24037d = abstractC9768p;
    }

    /* renamed from: b */
    public long m29284b(C9623f c9623f, int i10) {
        long mo29245j;
        AbstractC9768p abstractC9768p;
        long j10;
        long j11;
        AbstractC9768p abstractC9768p2 = this.f24036c;
        if (abstractC9768p2 instanceof C9755c) {
            if (((C9755c) abstractC9768p2).f24064f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(abstractC9768p2 instanceof C9764l)) {
                return 0L;
            }
        } else if (!(abstractC9768p2 instanceof C9766n)) {
            return 0L;
        }
        C9758f c9758f = (i10 == 0 ? c9623f.f23497e : c9623f.f23499f).f24066h;
        C9758f c9758f2 = (i10 == 0 ? c9623f.f23497e : c9623f.f23499f).f24067i;
        boolean contains = abstractC9768p2.f24066h.f24026l.contains(c9758f);
        boolean contains2 = this.f24036c.f24067i.f24026l.contains(c9758f2);
        long mo29245j2 = this.f24036c.mo29245j();
        if (!contains || !contains2) {
            if (contains) {
                j11 = m29282d(this.f24036c.f24066h, r12.f24020f);
                j10 = this.f24036c.f24066h.f24020f + mo29245j2;
            } else if (contains2) {
                j10 = (-this.f24036c.f24067i.f24020f) + mo29245j2;
                j11 = -m29281c(this.f24036c.f24067i, r12.f24020f);
            } else {
                mo29245j = r12.f24066h.f24020f + this.f24036c.mo29245j();
                abstractC9768p = this.f24036c;
            }
            return Math.max(j11, j10);
        }
        long m29282d = m29282d(this.f24036c.f24066h, 0L);
        long m29281c = m29281c(this.f24036c.f24067i, 0L);
        long j12 = m29282d - mo29245j2;
        AbstractC9768p abstractC9768p3 = this.f24036c;
        int i11 = abstractC9768p3.f24067i.f24020f;
        if (j12 >= (-i11)) {
            j12 += i11;
        }
        int i12 = abstractC9768p3.f24066h.f24020f;
        long j13 = ((-m29281c) - mo29245j2) - i12;
        if (j13 >= i12) {
            j13 -= i12;
        }
        float f10 = (float) (abstractC9768p3.f24060b.m28752o(i10) > 0.0f ? (((float) j13) / r12) + (((float) j12) / (1.0f - r12)) : 0L);
        long j14 = (f10 * r12) + 0.5f + mo29245j2 + (f10 * (1.0f - r12)) + 0.5f;
        abstractC9768p = this.f24036c;
        mo29245j = abstractC9768p.f24066h.f24020f + j14;
        return mo29245j - abstractC9768p.f24067i.f24020f;
    }
}
