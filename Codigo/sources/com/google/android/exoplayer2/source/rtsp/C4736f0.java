package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.InterfaceC4727b;
import p040c8.C1886b;

/* renamed from: com.google.android.exoplayer2.source.rtsp.f0 */
/* loaded from: classes.dex */
final class C4736f0 implements InterfaceC4727b.a {

    /* renamed from: a */
    private final long f9383a;

    public C4736f0(long j10) {
        this.f9383a = j10;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC4727b.a
    /* renamed from: a */
    public InterfaceC4727b mo12000a(int i10) {
        C4734e0 c4734e0 = new C4734e0(this.f9383a);
        c4734e0.mo162o(C1886b.m10030a(i10 * 2));
        return c4734e0;
    }
}
