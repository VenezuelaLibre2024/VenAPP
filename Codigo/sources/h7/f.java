package h7;

import t6.b3;
import t8.e0;
import y6.l;
import y6.n;

/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f16498a;

    /* renamed from: b, reason: collision with root package name */
    public int f16499b;

    /* renamed from: c, reason: collision with root package name */
    public long f16500c;

    /* renamed from: d, reason: collision with root package name */
    public long f16501d;

    /* renamed from: e, reason: collision with root package name */
    public long f16502e;

    /* renamed from: f, reason: collision with root package name */
    public long f16503f;

    /* renamed from: g, reason: collision with root package name */
    public int f16504g;

    /* renamed from: h, reason: collision with root package name */
    public int f16505h;

    /* renamed from: i, reason: collision with root package name */
    public int f16506i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f16507j = new int[255];

    /* renamed from: k, reason: collision with root package name */
    private final e0 f16508k = new e0(255);

    public boolean a(l lVar, boolean z10) {
        b();
        this.f16508k.Q(27);
        if (!n.b(lVar, this.f16508k.e(), 0, 27, z10) || this.f16508k.J() != 1332176723) {
            return false;
        }
        int H = this.f16508k.H();
        this.f16498a = H;
        if (H != 0) {
            if (z10) {
                return false;
            }
            throw b3.e("unsupported bit stream revision");
        }
        this.f16499b = this.f16508k.H();
        this.f16500c = this.f16508k.v();
        this.f16501d = this.f16508k.x();
        this.f16502e = this.f16508k.x();
        this.f16503f = this.f16508k.x();
        int H2 = this.f16508k.H();
        this.f16504g = H2;
        this.f16505h = H2 + 27;
        this.f16508k.Q(H2);
        if (!n.b(lVar, this.f16508k.e(), 0, this.f16504g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f16504g; i10++) {
            this.f16507j[i10] = this.f16508k.H();
            this.f16506i += this.f16507j[i10];
        }
        return true;
    }

    public void b() {
        this.f16498a = 0;
        this.f16499b = 0;
        this.f16500c = 0L;
        this.f16501d = 0L;
        this.f16502e = 0L;
        this.f16503f = 0L;
        this.f16504g = 0;
        this.f16505h = 0;
        this.f16506i = 0;
    }

    public boolean c(l lVar) {
        return d(lVar, -1L);
    }

    public boolean d(l lVar, long j10) {
        t8.a.a(lVar.getPosition() == lVar.i());
        this.f16508k.Q(4);
        while (true) {
            if ((j10 == -1 || lVar.getPosition() + 4 < j10) && n.b(lVar, this.f16508k.e(), 0, 4, true)) {
                this.f16508k.U(0);
                if (this.f16508k.J() == 1332176723) {
                    lVar.f();
                    return true;
                }
                lVar.n(1);
            }
        }
        do {
            if (j10 != -1 && lVar.getPosition() >= j10) {
                break;
            }
        } while (lVar.a(1) != -1);
        return false;
    }
}
