package l7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import l7.a;
import t6.l;
import t6.r3;
import t6.u1;
import t6.v1;
import t8.r0;

/* loaded from: classes.dex */
public final class f extends l implements Handler.Callback {
    private final Handler A;
    private final d B;
    private final boolean C;
    private b D;
    private boolean E;
    private boolean F;
    private long G;
    private a H;
    private long I;

    /* renamed from: y, reason: collision with root package name */
    private final c f20985y;

    /* renamed from: z, reason: collision with root package name */
    private final e f20986z;

    public f(e eVar, Looper looper) {
        this(eVar, looper, c.f20983a);
    }

    public f(e eVar, Looper looper, c cVar) {
        this(eVar, looper, cVar, false);
    }

    public f(e eVar, Looper looper, c cVar, boolean z10) {
        super(5);
        this.f20986z = (e) t8.a.e(eVar);
        this.A = looper == null ? null : r0.v(looper, this);
        this.f20985y = (c) t8.a.e(cVar);
        this.C = z10;
        this.B = new d();
        this.I = -9223372036854775807L;
    }

    private void Y(a aVar, List<a.b> list) {
        for (int i10 = 0; i10 < aVar.e(); i10++) {
            u1 H = aVar.d(i10).H();
            if (H == null || !this.f20985y.a(H)) {
                list.add(aVar.d(i10));
            } else {
                b b10 = this.f20985y.b(H);
                byte[] bArr = (byte[]) t8.a.e(aVar.d(i10).q1());
                this.B.n();
                this.B.y(bArr.length);
                ((ByteBuffer) r0.j(this.B.f29679c)).put(bArr);
                this.B.z();
                a a10 = b10.a(this.B);
                if (a10 != null) {
                    Y(a10, list);
                }
            }
        }
    }

    private long Z(long j10) {
        t8.a.g(j10 != -9223372036854775807L);
        t8.a.g(this.I != -9223372036854775807L);
        return j10 - this.I;
    }

    private void a0(a aVar) {
        Handler handler = this.A;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            b0(aVar);
        }
    }

    private void b0(a aVar) {
        this.f20986z.onMetadata(aVar);
    }

    private boolean c0(long j10) {
        boolean z10;
        a aVar = this.H;
        if (aVar == null || (!this.C && aVar.f20982b > Z(j10))) {
            z10 = false;
        } else {
            a0(this.H);
            this.H = null;
            z10 = true;
        }
        if (this.E && this.H == null) {
            this.F = true;
        }
        return z10;
    }

    private void d0() {
        if (this.E || this.H != null) {
            return;
        }
        this.B.n();
        v1 J = J();
        int V = V(J, this.B, 0);
        if (V != -4) {
            if (V == -5) {
                this.G = ((u1) t8.a.e(J.f26567b)).A;
            }
        } else {
            if (this.B.s()) {
                this.E = true;
                return;
            }
            d dVar = this.B;
            dVar.f20984t = this.G;
            dVar.z();
            a a10 = ((b) r0.j(this.D)).a(this.B);
            if (a10 != null) {
                ArrayList arrayList = new ArrayList(a10.e());
                Y(a10, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.H = new a(Z(this.B.f29681e), arrayList);
            }
        }
    }

    @Override // t6.l
    protected void O() {
        this.H = null;
        this.D = null;
        this.I = -9223372036854775807L;
    }

    @Override // t6.l
    protected void Q(long j10, boolean z10) {
        this.H = null;
        this.E = false;
        this.F = false;
    }

    @Override // t6.l
    protected void U(u1[] u1VarArr, long j10, long j11) {
        this.D = this.f20985y.b(u1VarArr[0]);
        a aVar = this.H;
        if (aVar != null) {
            this.H = aVar.c((aVar.f20982b + this.I) - j11);
        }
        this.I = j11;
    }

    @Override // t6.r3
    public int a(u1 u1Var) {
        if (this.f20985y.a(u1Var)) {
            return r3.o(u1Var.R == 0 ? 4 : 2);
        }
        return r3.o(0);
    }

    @Override // t6.q3
    public boolean d() {
        return true;
    }

    @Override // t6.q3
    public boolean e() {
        return this.F;
    }

    @Override // t6.q3, t6.r3
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        b0((a) message.obj);
        return true;
    }

    @Override // t6.q3
    public void z(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            d0();
            z10 = c0(j10);
        }
    }
}
