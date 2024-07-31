package h7;

import t6.b3;
import t8.e0;
import y6.b0;
import y6.k;
import y6.l;
import y6.m;
import y6.p;
import y6.y;

/* loaded from: classes.dex */
public class d implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final p f16489d = new p() { // from class: h7.c
        @Override // y6.p
        public final k[] c() {
            k[] d10;
            d10 = d.d();
            return d10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private m f16490a;

    /* renamed from: b, reason: collision with root package name */
    private i f16491b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16492c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k[] d() {
        return new k[]{new d()};
    }

    private static e0 g(e0 e0Var) {
        e0Var.U(0);
        return e0Var;
    }

    private boolean h(l lVar) {
        i hVar;
        f fVar = new f();
        if (fVar.a(lVar, true) && (fVar.f16499b & 2) == 2) {
            int min = Math.min(fVar.f16506i, 8);
            e0 e0Var = new e0(min);
            lVar.q(e0Var.e(), 0, min);
            if (b.p(g(e0Var))) {
                hVar = new b();
            } else if (j.r(g(e0Var))) {
                hVar = new j();
            } else if (h.o(g(e0Var))) {
                hVar = new h();
            }
            this.f16491b = hVar;
            return true;
        }
        return false;
    }

    @Override // y6.k
    public void a(long j10, long j11) {
        i iVar = this.f16491b;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }

    @Override // y6.k
    public void b(m mVar) {
        this.f16490a = mVar;
    }

    @Override // y6.k
    public boolean e(l lVar) {
        try {
            return h(lVar);
        } catch (b3 unused) {
            return false;
        }
    }

    @Override // y6.k
    public int f(l lVar, y yVar) {
        t8.a.i(this.f16490a);
        if (this.f16491b == null) {
            if (!h(lVar)) {
                throw b3.a("Failed to determine bitstream type", null);
            }
            lVar.f();
        }
        if (!this.f16492c) {
            b0 d10 = this.f16490a.d(0, 1);
            this.f16490a.q();
            this.f16491b.d(this.f16490a, d10);
            this.f16492c = true;
        }
        return this.f16491b.g(lVar, yVar);
    }

    @Override // y6.k
    public void release() {
    }
}
