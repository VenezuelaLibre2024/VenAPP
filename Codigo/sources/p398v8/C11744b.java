package p398v8;

import java.nio.ByteBuffer;
import p361t6.AbstractC11061l;
import p361t6.C11108u1;
import p361t6.InterfaceC11095r3;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p414w6.C12082g;

/* renamed from: v8.b */
/* loaded from: classes.dex */
public final class C11744b extends AbstractC11061l {

    /* renamed from: A */
    private long f31000A;

    /* renamed from: B */
    private InterfaceC11743a f31001B;

    /* renamed from: C */
    private long f31002C;

    /* renamed from: y */
    private final C12082g f31003y;

    /* renamed from: z */
    private final C11146e0 f31004z;

    public C11744b() {
        super(6);
        this.f31003y = new C12082g(1);
        this.f31004z = new C11146e0();
    }

    /* renamed from: Y */
    private float[] m37116Y(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f31004z.m34675S(byteBuffer.array(), byteBuffer.limit());
        this.f31004z.m34677U(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f31004z.m34696u());
        }
        return fArr;
    }

    /* renamed from: Z */
    private void m37117Z() {
        InterfaceC11743a interfaceC11743a = this.f31001B;
        if (interfaceC11743a != null) {
            interfaceC11743a.mo33991c();
        }
    }

    @Override // p361t6.AbstractC11061l
    /* renamed from: O */
    protected void mo22831O() {
        m37117Z();
    }

    @Override // p361t6.AbstractC11061l
    /* renamed from: Q */
    protected void mo22832Q(long j10, boolean z10) {
        this.f31002C = Long.MIN_VALUE;
        m37117Z();
    }

    @Override // p361t6.AbstractC11061l
    /* renamed from: U */
    protected void mo22833U(C11108u1[] c11108u1Arr, long j10, long j11) {
        this.f31000A = j11;
    }

    @Override // p361t6.InterfaceC11095r3
    /* renamed from: a */
    public int mo22834a(C11108u1 c11108u1) {
        return InterfaceC11095r3.m34459o("application/x-camera-motion".equals(c11108u1.f28797w) ? 4 : 0);
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: d */
    public boolean mo22835d() {
        return true;
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: e */
    public boolean mo22836e() {
        return mo34247i();
    }

    @Override // p361t6.InterfaceC11090q3, p361t6.InterfaceC11095r3
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // p361t6.AbstractC11061l, p361t6.C11070m3.b
    /* renamed from: p */
    public void mo33992p(int i10, Object obj) {
        if (i10 == 8) {
            this.f31001B = (InterfaceC11743a) obj;
        } else {
            super.mo33992p(i10, obj);
        }
    }

    @Override // p361t6.InterfaceC11090q3
    /* renamed from: z */
    public void mo22838z(long j10, long j11) {
        while (!mo34247i() && this.f31002C < 100000 + j10) {
            this.f31003y.mo22818n();
            if (m34242V(m34237J(), this.f31003y, 0) != -4 || this.f31003y.m38794s()) {
                return;
            }
            C12082g c12082g = this.f31003y;
            this.f31002C = c12082g.f32144e;
            if (this.f31001B != null && !c12082g.m38793r()) {
                this.f31003y.m38812z();
                float[] m37116Y = m37116Y((ByteBuffer) C11172r0.m34928j(this.f31003y.f32142c));
                if (m37116Y != null) {
                    ((InterfaceC11743a) C11172r0.m34928j(this.f31001B)).mo33990b(this.f31002C - this.f31000A, m37116Y);
                }
            }
        }
    }
}
