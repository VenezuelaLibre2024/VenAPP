package o0;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m {

    /* renamed from: h, reason: collision with root package name */
    public static int f22100h;

    /* renamed from: c, reason: collision with root package name */
    p f22103c;

    /* renamed from: d, reason: collision with root package name */
    p f22104d;

    /* renamed from: f, reason: collision with root package name */
    int f22106f;

    /* renamed from: g, reason: collision with root package name */
    int f22107g;

    /* renamed from: a, reason: collision with root package name */
    public int f22101a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22102b = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<p> f22105e = new ArrayList<>();

    public m(p pVar, int i10) {
        this.f22103c = null;
        this.f22104d = null;
        int i11 = f22100h;
        this.f22106f = i11;
        f22100h = i11 + 1;
        this.f22103c = pVar;
        this.f22104d = pVar;
        this.f22107g = i10;
    }

    private long c(f fVar, long j10) {
        p pVar = fVar.f22085d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f22092k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f22092k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f22085d != pVar) {
                    j11 = Math.min(j11, c(fVar2, fVar2.f22087f + j10));
                }
            }
        }
        if (fVar != pVar.f22134i) {
            return j11;
        }
        long j12 = j10 - pVar.j();
        return Math.min(Math.min(j11, c(pVar.f22133h, j12)), j12 - pVar.f22133h.f22087f);
    }

    private long d(f fVar, long j10) {
        p pVar = fVar.f22085d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f22092k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f22092k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f22085d != pVar) {
                    j11 = Math.max(j11, d(fVar2, fVar2.f22087f + j10));
                }
            }
        }
        if (fVar != pVar.f22133h) {
            return j11;
        }
        long j12 = j10 + pVar.j();
        return Math.max(Math.max(j11, d(pVar.f22134i, j12)), j12 - pVar.f22134i.f22087f);
    }

    public void a(p pVar) {
        this.f22105e.add(pVar);
        this.f22104d = pVar;
    }

    public long b(n0.f fVar, int i10) {
        long j10;
        p pVar;
        long j11;
        long j12;
        p pVar2 = this.f22103c;
        if (pVar2 instanceof c) {
            if (((c) pVar2).f22131f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(pVar2 instanceof l)) {
                return 0L;
            }
        } else if (!(pVar2 instanceof n)) {
            return 0L;
        }
        f fVar2 = (i10 == 0 ? fVar.f21602e : fVar.f21604f).f22133h;
        f fVar3 = (i10 == 0 ? fVar.f21602e : fVar.f21604f).f22134i;
        boolean contains = pVar2.f22133h.f22093l.contains(fVar2);
        boolean contains2 = this.f22103c.f22134i.f22093l.contains(fVar3);
        long j13 = this.f22103c.j();
        if (!contains || !contains2) {
            if (contains) {
                j12 = d(this.f22103c.f22133h, r12.f22087f);
                j11 = this.f22103c.f22133h.f22087f + j13;
            } else if (contains2) {
                j11 = (-this.f22103c.f22134i.f22087f) + j13;
                j12 = -c(this.f22103c.f22134i, r12.f22087f);
            } else {
                j10 = r12.f22133h.f22087f + this.f22103c.j();
                pVar = this.f22103c;
            }
            return Math.max(j12, j11);
        }
        long d10 = d(this.f22103c.f22133h, 0L);
        long c10 = c(this.f22103c.f22134i, 0L);
        long j14 = d10 - j13;
        p pVar3 = this.f22103c;
        int i11 = pVar3.f22134i.f22087f;
        if (j14 >= (-i11)) {
            j14 += i11;
        }
        int i12 = pVar3.f22133h.f22087f;
        long j15 = ((-c10) - j13) - i12;
        if (j15 >= i12) {
            j15 -= i12;
        }
        float f10 = (float) (pVar3.f22127b.o(i10) > 0.0f ? (((float) j15) / r12) + (((float) j14) / (1.0f - r12)) : 0L);
        long j16 = (f10 * r12) + 0.5f + j13 + (f10 * (1.0f - r12)) + 0.5f;
        pVar = this.f22103c;
        j10 = pVar.f22133h.f22087f + j16;
        return j10 - pVar.f22134i.f22087f;
    }
}
