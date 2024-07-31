package d8;

import com.google.android.exoplayer2.source.rtsp.h;
import t6.b3;
import t8.e0;
import t8.r0;
import t8.s;
import t8.x;
import y6.b0;
import y6.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: c */
    private final h f13844c;

    /* renamed from: d */
    private b0 f13845d;

    /* renamed from: e */
    private int f13846e;

    /* renamed from: h */
    private int f13849h;

    /* renamed from: i */
    private long f13850i;

    /* renamed from: b */
    private final e0 f13843b = new e0(x.f26773a);

    /* renamed from: a */
    private final e0 f13842a = new e0();

    /* renamed from: f */
    private long f13847f = -9223372036854775807L;

    /* renamed from: g */
    private int f13848g = -1;

    public d(h hVar) {
        this.f13844c = hVar;
    }

    private static int e(int i10) {
        return i10 == 5 ? 1 : 0;
    }

    private void f(e0 e0Var, int i10) {
        byte b10 = e0Var.e()[0];
        byte b11 = e0Var.e()[1];
        int i11 = (b10 & 224) | (b11 & 31);
        boolean z10 = (b11 & 128) > 0;
        boolean z11 = (b11 & 64) > 0;
        if (z10) {
            this.f13849h += j();
            e0Var.e()[1] = (byte) i11;
            this.f13842a.R(e0Var.e());
            this.f13842a.U(1);
        } else {
            int b12 = c8.a.b(this.f13848g);
            if (i10 != b12) {
                s.i("RtpH264Reader", r0.C("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(b12), Integer.valueOf(i10)));
                return;
            } else {
                this.f13842a.R(e0Var.e());
                this.f13842a.U(2);
            }
        }
        int a10 = this.f13842a.a();
        this.f13845d.a(this.f13842a, a10);
        this.f13849h += a10;
        if (z11) {
            this.f13846e = e(i11 & 31);
        }
    }

    private void g(e0 e0Var) {
        int a10 = e0Var.a();
        this.f13849h += j();
        this.f13845d.a(e0Var, a10);
        this.f13849h += a10;
        this.f13846e = e(e0Var.e()[0] & 31);
    }

    private void h(e0 e0Var) {
        e0Var.H();
        while (e0Var.a() > 4) {
            int N = e0Var.N();
            this.f13849h += j();
            this.f13845d.a(e0Var, N);
            this.f13849h += N;
        }
        this.f13846e = 0;
    }

    private static long i(long j10, long j11, long j12) {
        return j10 + r0.O0(j11 - j12, 1000000L, 90000L);
    }

    private int j() {
        this.f13843b.U(0);
        int a10 = this.f13843b.a();
        ((b0) t8.a.e(this.f13845d)).a(this.f13843b, a10);
        return a10;
    }

    @Override // d8.e
    public void a(long j10, long j11) {
        this.f13847f = j10;
        this.f13849h = 0;
        this.f13850i = j11;
    }

    @Override // d8.e
    public void b(e0 e0Var, long j10, int i10, boolean z10) {
        try {
            int i11 = e0Var.e()[0] & 31;
            t8.a.i(this.f13845d);
            if (i11 > 0 && i11 < 24) {
                g(e0Var);
            } else if (i11 == 24) {
                h(e0Var);
            } else {
                if (i11 != 28) {
                    throw b3.c(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i11)), null);
                }
                f(e0Var, i10);
            }
            if (z10) {
                if (this.f13847f == -9223372036854775807L) {
                    this.f13847f = j10;
                }
                this.f13845d.b(i(this.f13850i, j10, this.f13847f), this.f13846e, this.f13849h, 0, null);
                this.f13849h = 0;
            }
            this.f13848g = i10;
        } catch (IndexOutOfBoundsException e10) {
            throw b3.c(null, e10);
        }
    }

    @Override // d8.e
    public void c(m mVar, int i10) {
        b0 d10 = mVar.d(i10, 2);
        this.f13845d = d10;
        ((b0) r0.j(d10)).c(this.f13844c.f8350c);
    }

    @Override // d8.e
    public void d(long j10, int i10) {
    }
}
