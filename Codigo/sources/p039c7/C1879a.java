package p039c7;

import java.util.Collections;
import p039c7.AbstractC1883e;
import p361t6.C11108u1;
import p363t8.C11146e0;
import p396v6.C11631a;
import p459y6.InterfaceC12609b0;

/* renamed from: c7.a */
/* loaded from: classes.dex */
final class C1879a extends AbstractC1883e {

    /* renamed from: e */
    private static final int[] f7820e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    private boolean f7821b;

    /* renamed from: c */
    private boolean f7822c;

    /* renamed from: d */
    private int f7823d;

    public C1879a(InterfaceC12609b0 interfaceC12609b0) {
        super(interfaceC12609b0);
    }

    @Override // p039c7.AbstractC1883e
    /* renamed from: b */
    protected boolean mo9985b(C11146e0 c11146e0) {
        C11108u1.b m34553h0;
        if (this.f7821b) {
            c11146e0.m34678V(1);
        } else {
            int m34664H = c11146e0.m34664H();
            int i10 = (m34664H >> 4) & 15;
            this.f7823d = i10;
            if (i10 == 2) {
                m34553h0 = new C11108u1.b().m34552g0("audio/mpeg").m34529J(1).m34553h0(f7820e[(m34664H >> 2) & 3]);
            } else if (i10 == 7 || i10 == 8) {
                m34553h0 = new C11108u1.b().m34552g0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").m34529J(1).m34553h0(8000);
            } else {
                if (i10 != 10) {
                    throw new AbstractC1883e.a("Audio format not supported: " + this.f7823d);
                }
                this.f7821b = true;
            }
            this.f7844a.mo332c(m34553h0.m34526G());
            this.f7822c = true;
            this.f7821b = true;
        }
        return true;
    }

    @Override // p039c7.AbstractC1883e
    /* renamed from: c */
    protected boolean mo9986c(C11146e0 c11146e0, long j10) {
        if (this.f7823d == 2) {
            int m34679a = c11146e0.m34679a();
            this.f7844a.m41511a(c11146e0, m34679a);
            this.f7844a.mo331b(j10, 1, m34679a, 0, null);
            return true;
        }
        int m34664H = c11146e0.m34664H();
        if (m34664H != 0 || this.f7822c) {
            if (this.f7823d == 10 && m34664H != 1) {
                return false;
            }
            int m34679a2 = c11146e0.m34679a();
            this.f7844a.m41511a(c11146e0, m34679a2);
            this.f7844a.mo331b(j10, 1, m34679a2, 0, null);
            return true;
        }
        int m34679a3 = c11146e0.m34679a();
        byte[] bArr = new byte[m34679a3];
        c11146e0.m34688l(bArr, 0, m34679a3);
        C11631a.b m36462f = C11631a.m36462f(bArr);
        this.f7844a.mo332c(new C11108u1.b().m34552g0("audio/mp4a-latm").m34530K(m36462f.f30266c).m34529J(m36462f.f30265b).m34553h0(m36462f.f30264a).m34541V(Collections.singletonList(bArr)).m34526G());
        this.f7822c = true;
        return false;
    }
}
