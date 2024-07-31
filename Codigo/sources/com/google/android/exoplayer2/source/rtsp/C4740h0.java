package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.InterfaceC4727b;
import java.io.IOException;
import p040c8.C1886b;
import p351s8.C10833m;

/* renamed from: com.google.android.exoplayer2.source.rtsp.h0 */
/* loaded from: classes.dex */
final class C4740h0 implements InterfaceC4727b.a {

    /* renamed from: a */
    private final long f9396a;

    public C4740h0(long j10) {
        this.f9396a = j10;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC4727b.a
    /* renamed from: a */
    public InterfaceC4727b mo12000a(int i10) {
        C4738g0 c4738g0 = new C4738g0(this.f9396a);
        C4738g0 c4738g02 = new C4738g0(this.f9396a);
        try {
            c4738g0.mo162o(C1886b.m10030a(0));
            int mo11998c = c4738g0.mo11998c();
            boolean z10 = mo11998c % 2 == 0;
            c4738g02.mo162o(C1886b.m10030a(z10 ? mo11998c + 1 : mo11998c - 1));
            if (z10) {
                c4738g0.m12052h(c4738g02);
                return c4738g0;
            }
            c4738g02.m12052h(c4738g0);
            return c4738g02;
        } catch (IOException e10) {
            C10833m.m33019a(c4738g0);
            C10833m.m33019a(c4738g02);
            throw e10;
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC4727b.a
    /* renamed from: b */
    public InterfaceC4727b.a mo12001b() {
        return new C4736f0(this.f9396a);
    }
}
