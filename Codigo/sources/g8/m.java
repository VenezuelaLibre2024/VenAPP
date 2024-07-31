package g8;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import t6.b3;
import t6.u1;
import t8.e0;
import t8.r0;
import y6.b0;
import y6.x;
import y6.y;

/* loaded from: classes.dex */
public class m implements y6.k {

    /* renamed from: a, reason: collision with root package name */
    private final j f16091a;

    /* renamed from: d, reason: collision with root package name */
    private final u1 f16094d;

    /* renamed from: g, reason: collision with root package name */
    private y6.m f16097g;

    /* renamed from: h, reason: collision with root package name */
    private b0 f16098h;

    /* renamed from: i, reason: collision with root package name */
    private int f16099i;

    /* renamed from: b, reason: collision with root package name */
    private final d f16092b = new d();

    /* renamed from: c, reason: collision with root package name */
    private final e0 f16093c = new e0();

    /* renamed from: e, reason: collision with root package name */
    private final List<Long> f16095e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final List<e0> f16096f = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private int f16100j = 0;

    /* renamed from: k, reason: collision with root package name */
    private long f16101k = -9223372036854775807L;

    public m(j jVar, u1 u1Var) {
        this.f16091a = jVar;
        this.f16094d = u1Var.c().g0("text/x-exoplayer-cues").K(u1Var.f26517w).G();
    }

    private void c() {
        n nVar;
        o oVar;
        try {
            n d10 = this.f16091a.d();
            while (true) {
                nVar = d10;
                if (nVar != null) {
                    break;
                }
                Thread.sleep(5L);
                d10 = this.f16091a.d();
            }
            nVar.y(this.f16099i);
            nVar.f29679c.put(this.f16093c.e(), 0, this.f16099i);
            nVar.f29679c.limit(this.f16099i);
            this.f16091a.c(nVar);
            o b10 = this.f16091a.b();
            while (true) {
                oVar = b10;
                if (oVar != null) {
                    break;
                }
                Thread.sleep(5L);
                b10 = this.f16091a.b();
            }
            for (int i10 = 0; i10 < oVar.l(); i10++) {
                byte[] a10 = this.f16092b.a(oVar.h(oVar.i(i10)));
                this.f16095e.add(Long.valueOf(oVar.i(i10)));
                this.f16096f.add(new e0(a10));
            }
            oVar.x();
        } catch (k e10) {
            throw b3.a("SubtitleDecoder failed.", e10);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    private boolean d(y6.l lVar) {
        int b10 = this.f16093c.b();
        int i10 = this.f16099i;
        if (b10 == i10) {
            this.f16093c.c(i10 + RecognitionOptions.UPC_E);
        }
        int read = lVar.read(this.f16093c.e(), this.f16099i, this.f16093c.b() - this.f16099i);
        if (read != -1) {
            this.f16099i += read;
        }
        long length = lVar.getLength();
        return (length != -1 && ((long) this.f16099i) == length) || read == -1;
    }

    private boolean g(y6.l lVar) {
        return lVar.a((lVar.getLength() > (-1L) ? 1 : (lVar.getLength() == (-1L) ? 0 : -1)) != 0 ? hb.e.d(lVar.getLength()) : RecognitionOptions.UPC_E) == -1;
    }

    private void h() {
        t8.a.i(this.f16098h);
        t8.a.g(this.f16095e.size() == this.f16096f.size());
        long j10 = this.f16101k;
        for (int f10 = j10 == -9223372036854775807L ? 0 : r0.f(this.f16095e, Long.valueOf(j10), true, true); f10 < this.f16096f.size(); f10++) {
            e0 e0Var = this.f16096f.get(f10);
            e0Var.U(0);
            int length = e0Var.e().length;
            this.f16098h.a(e0Var, length);
            this.f16098h.b(this.f16095e.get(f10).longValue(), 1, length, 0, null);
        }
    }

    @Override // y6.k
    public void a(long j10, long j11) {
        int i10 = this.f16100j;
        t8.a.g((i10 == 0 || i10 == 5) ? false : true);
        this.f16101k = j11;
        if (this.f16100j == 2) {
            this.f16100j = 1;
        }
        if (this.f16100j == 4) {
            this.f16100j = 3;
        }
    }

    @Override // y6.k
    public void b(y6.m mVar) {
        t8.a.g(this.f16100j == 0);
        this.f16097g = mVar;
        this.f16098h = mVar.d(0, 3);
        this.f16097g.q();
        this.f16097g.p(new x(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.f16098h.c(this.f16094d);
        this.f16100j = 1;
    }

    @Override // y6.k
    public boolean e(y6.l lVar) {
        return true;
    }

    @Override // y6.k
    public int f(y6.l lVar, y yVar) {
        int i10 = this.f16100j;
        t8.a.g((i10 == 0 || i10 == 5) ? false : true);
        if (this.f16100j == 1) {
            this.f16093c.Q(lVar.getLength() != -1 ? hb.e.d(lVar.getLength()) : RecognitionOptions.UPC_E);
            this.f16099i = 0;
            this.f16100j = 2;
        }
        if (this.f16100j == 2 && d(lVar)) {
            c();
            h();
            this.f16100j = 4;
        }
        if (this.f16100j == 3 && g(lVar)) {
            h();
            this.f16100j = 4;
        }
        return this.f16100j == 4 ? -1 : 0;
    }

    @Override // y6.k
    public void release() {
        if (this.f16100j == 5) {
            return;
        }
        this.f16091a.release();
        this.f16100j = 5;
    }
}
