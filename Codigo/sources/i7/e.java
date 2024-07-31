package i7;

import i7.i0;
import y6.z;

/* loaded from: classes.dex */
public final class e implements y6.k {

    /* renamed from: d, reason: collision with root package name */
    public static final y6.p f17226d = new y6.p() { // from class: i7.d
        @Override // y6.p
        public final y6.k[] c() {
            y6.k[] d10;
            d10 = e.d();
            return d10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final f f17227a = new f();

    /* renamed from: b, reason: collision with root package name */
    private final t8.e0 f17228b = new t8.e0(16384);

    /* renamed from: c, reason: collision with root package name */
    private boolean f17229c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y6.k[] d() {
        return new y6.k[]{new e()};
    }

    @Override // y6.k
    public void a(long j10, long j11) {
        this.f17229c = false;
        this.f17227a.c();
    }

    @Override // y6.k
    public void b(y6.m mVar) {
        this.f17227a.d(mVar, new i0.d(0, 1));
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
            lVar.q(e0Var.e(), 0, 7);
            e0Var.U(0);
            int N = e0Var.N();
            if (N == 44096 || N == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int e10 = v6.c.e(e0Var.e(), N);
                if (e10 == -1) {
                    return false;
                }
                lVar.k(e10 - 7);
            } else {
                lVar.f();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                lVar.k(i12);
                i11 = 0;
            }
        }
    }

    @Override // y6.k
    public int f(y6.l lVar, y6.y yVar) {
        int read = lVar.read(this.f17228b.e(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f17228b.U(0);
        this.f17228b.T(read);
        if (!this.f17229c) {
            this.f17227a.f(0L, 4);
            this.f17229c = true;
        }
        this.f17227a.b(this.f17228b);
        return 0;
    }

    @Override // y6.k
    public void release() {
    }
}
