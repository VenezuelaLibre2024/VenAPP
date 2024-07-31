package n0;

import java.util.ArrayList;
import n0.e;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected e f21562a;

    /* renamed from: b, reason: collision with root package name */
    protected e f21563b;

    /* renamed from: c, reason: collision with root package name */
    protected e f21564c;

    /* renamed from: d, reason: collision with root package name */
    protected e f21565d;

    /* renamed from: e, reason: collision with root package name */
    protected e f21566e;

    /* renamed from: f, reason: collision with root package name */
    protected e f21567f;

    /* renamed from: g, reason: collision with root package name */
    protected e f21568g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList<e> f21569h;

    /* renamed from: i, reason: collision with root package name */
    protected int f21570i;

    /* renamed from: j, reason: collision with root package name */
    protected int f21571j;

    /* renamed from: k, reason: collision with root package name */
    protected float f21572k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    int f21573l;

    /* renamed from: m, reason: collision with root package name */
    int f21574m;

    /* renamed from: n, reason: collision with root package name */
    int f21575n;

    /* renamed from: o, reason: collision with root package name */
    boolean f21576o;

    /* renamed from: p, reason: collision with root package name */
    private int f21577p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f21578q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f21579r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f21580s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f21581t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f21582u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f21583v;

    public c(e eVar, int i10, boolean z10) {
        this.f21562a = eVar;
        this.f21577p = i10;
        this.f21578q = z10;
    }

    private void b() {
        int i10 = this.f21577p * 2;
        e eVar = this.f21562a;
        this.f21576o = true;
        e eVar2 = eVar;
        boolean z10 = false;
        while (!z10) {
            this.f21570i++;
            e[] eVarArr = eVar.F0;
            int i11 = this.f21577p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.E0[i11] = null;
            if (eVar.T() != 8) {
                this.f21573l++;
                e.b s10 = eVar.s(this.f21577p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (s10 != bVar) {
                    this.f21574m += eVar.C(this.f21577p);
                }
                int e10 = this.f21574m + eVar.W[i10].e();
                this.f21574m = e10;
                int i12 = i10 + 1;
                this.f21574m = e10 + eVar.W[i12].e();
                int e11 = this.f21575n + eVar.W[i10].e();
                this.f21575n = e11;
                this.f21575n = e11 + eVar.W[i12].e();
                if (this.f21563b == null) {
                    this.f21563b = eVar;
                }
                this.f21565d = eVar;
                e.b[] bVarArr = eVar.Z;
                int i13 = this.f21577p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f21642y[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f21571j++;
                        float f10 = eVar.D0[i13];
                        if (f10 > 0.0f) {
                            this.f21572k += f10;
                        }
                        if (c(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f21579r = true;
                            } else {
                                this.f21580s = true;
                            }
                            if (this.f21569h == null) {
                                this.f21569h = new ArrayList<>();
                            }
                            this.f21569h.add(eVar);
                        }
                        if (this.f21567f == null) {
                            this.f21567f = eVar;
                        }
                        e eVar4 = this.f21568g;
                        if (eVar4 != null) {
                            eVar4.E0[this.f21577p] = eVar;
                        }
                        this.f21568g = eVar;
                    }
                    if (this.f21577p != 0 ? !(eVar.f21640x == 0 && eVar.C == 0 && eVar.D == 0) : !(eVar.f21638w == 0 && eVar.f21644z == 0 && eVar.A == 0)) {
                        this.f21576o = false;
                    }
                    if (eVar.f21601d0 != 0.0f) {
                        this.f21576o = false;
                        this.f21582u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.F0[this.f21577p] = eVar;
            }
            d dVar = eVar.W[i10 + 1].f21589f;
            if (dVar != null) {
                e eVar5 = dVar.f21587d;
                d dVar2 = eVar5.W[i10].f21589f;
                if (dVar2 != null && dVar2.f21587d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z10 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f21563b;
        if (eVar6 != null) {
            this.f21574m -= eVar6.W[i10].e();
        }
        e eVar7 = this.f21565d;
        if (eVar7 != null) {
            this.f21574m -= eVar7.W[i10 + 1].e();
        }
        this.f21564c = eVar;
        if (this.f21577p == 0 && this.f21578q) {
            this.f21566e = eVar;
        } else {
            this.f21566e = this.f21562a;
        }
        this.f21581t = this.f21580s && this.f21579r;
    }

    private static boolean c(e eVar, int i10) {
        int i11;
        return eVar.T() != 8 && eVar.Z[i10] == e.b.MATCH_CONSTRAINT && ((i11 = eVar.f21642y[i10]) == 0 || i11 == 3);
    }

    public void a() {
        if (!this.f21583v) {
            b();
        }
        this.f21583v = true;
    }
}
