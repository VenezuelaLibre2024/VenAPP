package v8;

import java.nio.ByteBuffer;
import t6.r3;
import t6.u1;
import t8.e0;
import t8.r0;

/* loaded from: classes.dex */
public final class b extends t6.l {
    private long A;
    private a B;
    private long C;

    /* renamed from: y, reason: collision with root package name */
    private final w6.g f28569y;

    /* renamed from: z, reason: collision with root package name */
    private final e0 f28570z;

    public b() {
        super(6);
        this.f28569y = new w6.g(1);
        this.f28570z = new e0();
    }

    private float[] Y(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f28570z.S(byteBuffer.array(), byteBuffer.limit());
        this.f28570z.U(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f28570z.u());
        }
        return fArr;
    }

    private void Z() {
        a aVar = this.B;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // t6.l
    protected void O() {
        Z();
    }

    @Override // t6.l
    protected void Q(long j10, boolean z10) {
        this.C = Long.MIN_VALUE;
        Z();
    }

    @Override // t6.l
    protected void U(u1[] u1VarArr, long j10, long j11) {
        this.A = j11;
    }

    @Override // t6.r3
    public int a(u1 u1Var) {
        return r3.o("application/x-camera-motion".equals(u1Var.f26517w) ? 4 : 0);
    }

    @Override // t6.q3
    public boolean d() {
        return true;
    }

    @Override // t6.q3
    public boolean e() {
        return i();
    }

    @Override // t6.q3, t6.r3
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // t6.l, t6.m3.b
    public void p(int i10, Object obj) {
        if (i10 == 8) {
            this.B = (a) obj;
        } else {
            super.p(i10, obj);
        }
    }

    @Override // t6.q3
    public void z(long j10, long j11) {
        while (!i() && this.C < 100000 + j10) {
            this.f28569y.n();
            if (V(J(), this.f28569y, 0) != -4 || this.f28569y.s()) {
                return;
            }
            w6.g gVar = this.f28569y;
            this.C = gVar.f29681e;
            if (this.B != null && !gVar.r()) {
                this.f28569y.z();
                float[] Y = Y((ByteBuffer) r0.j(this.f28569y.f29679c));
                if (Y != null) {
                    ((a) r0.j(this.B)).b(this.C - this.A, Y);
                }
            }
        }
    }
}
