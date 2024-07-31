package i7;

import i7.i0;
import y6.z;

/* loaded from: classes.dex */
public final class b implements y6.k {

    /* renamed from: d, reason: collision with root package name */
    public static final y6.p f17202d = new y6.p() { // from class: i7.a
        @Override // y6.p
        public final y6.k[] c() {
            y6.k[] d10;
            d10 = b.d();
            return d10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final c f17203a = new c();

    /* renamed from: b, reason: collision with root package name */
    private final t8.e0 f17204b = new t8.e0(2786);

    /* renamed from: c, reason: collision with root package name */
    private boolean f17205c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y6.k[] d() {
        return new y6.k[]{new b()};
    }

    @Override // y6.k
    public void a(long j10, long j11) {
        this.f17205c = false;
        this.f17203a.c();
    }

    @Override // y6.k
    public void b(y6.m mVar) {
        this.f17203a.d(mVar, new i0.d(0, 1));
        mVar.q();
        mVar.p(new z.b(-9223372036854775807L));
    }

    @Override // y6.k
    public boolean e(y6.l lVar) {
        t8.e0 e0Var = new t8.e0(10);
        int i10 = 0;
        while (true) {
            lVar.q(e0Var.e(), 0, 10);
            e0Var.U(0);
            if (e0Var.K() != 4801587) {
                break;
            }
            e0Var.V(3);
            int G = e0Var.G();
            i10 += G + 10;
            lVar.k(G);
        }
        lVar.f();
        lVar.k(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            lVar.q(e0Var.e(), 0, 6);
            e0Var.U(0);
            if (e0Var.N() != 2935) {
                lVar.f();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                lVar.k(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int g10 = v6.b.g(e0Var.e());
                if (g10 == -1) {
                    return false;
                }
                lVar.k(g10 - 6);
            }
        }
    }

    @Override // y6.k
    public int f(y6.l lVar, y6.y yVar) {
        int read = lVar.read(this.f17204b.e(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f17204b.U(0);
        this.f17204b.T(read);
        if (!this.f17205c) {
            this.f17203a.f(0L, 4);
            this.f17205c = true;
        }
        this.f17203a.b(this.f17204b);
        return 0;
    }

    @Override // y6.k
    public void release() {
    }
}
