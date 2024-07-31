package p437x7;

import java.util.Arrays;
import p351s8.C10833m;
import p351s8.C10835n;
import p351s8.InterfaceC10827j;
import p361t6.C11108u1;
import p363t8.C11172r0;

/* renamed from: x7.l */
/* loaded from: classes.dex */
public abstract class AbstractC12346l extends AbstractC12340f {

    /* renamed from: j */
    private byte[] f33158j;

    /* renamed from: k */
    private volatile boolean f33159k;

    public AbstractC12346l(InterfaceC10827j interfaceC10827j, C10835n c10835n, int i10, C11108u1 c11108u1, int i11, Object obj, byte[] bArr) {
        super(interfaceC10827j, c10835n, i10, c11108u1, i11, obj, -9223372036854775807L, -9223372036854775807L);
        AbstractC12346l abstractC12346l;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = C11172r0.f29045f;
            abstractC12346l = this;
        } else {
            abstractC12346l = this;
            bArr2 = bArr;
        }
        abstractC12346l.f33158j = bArr2;
    }

    /* renamed from: i */
    private void m39937i(int i10) {
        byte[] bArr = this.f33158j;
        if (bArr.length < i10 + 16384) {
            this.f33158j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // p351s8.C10818e0.e
    /* renamed from: b */
    public final void mo223b() {
        try {
            this.f33121i.mo162o(this.f33114b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f33159k) {
                m39937i(i11);
                i10 = this.f33121i.read(this.f33158j, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f33159k) {
                mo204g(this.f33158j, i11);
            }
        } finally {
            C10833m.m33019a(this.f33121i);
        }
    }

    @Override // p351s8.C10818e0.e
    /* renamed from: c */
    public final void mo224c() {
        this.f33159k = true;
    }

    /* renamed from: g */
    protected abstract void mo204g(byte[] bArr, int i10);

    /* renamed from: h */
    public byte[] m39938h() {
        return this.f33158j;
    }
}
