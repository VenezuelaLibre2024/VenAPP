package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.source.rtsp.C4751s;
import p137hb.C7690e;
import p351s8.C10835n;
import p351s8.C10836n0;
import p351s8.InterfaceC10834m0;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: com.google.android.exoplayer2.source.rtsp.g0 */
/* loaded from: classes.dex */
final class C4738g0 implements InterfaceC4727b {

    /* renamed from: a */
    private final C10836n0 f9390a;

    /* renamed from: b */
    private C4738g0 f9391b;

    public C4738g0(long j10) {
        this.f9390a = new C10836n0(AdError.SERVER_ERROR_CODE, C7690e.m23413d(j10));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC4727b
    /* renamed from: b */
    public String mo11997b() {
        int mo11998c = mo11998c();
        C11137a.m34605g(mo11998c != -1);
        return C11172r0.m34860C("RTP/AVP;unicast;client_port=%d-%d", Integer.valueOf(mo11998c), Integer.valueOf(mo11998c + 1));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC4727b
    /* renamed from: c */
    public int mo11998c() {
        int m33040c = this.f9390a.m33040c();
        if (m33040c == -1) {
            return -1;
        }
        return m33040c;
    }

    @Override // p351s8.InterfaceC10827j
    public void close() {
        this.f9390a.close();
        C4738g0 c4738g0 = this.f9391b;
        if (c4738g0 != null) {
            c4738g0.close();
        }
    }

    @Override // p351s8.InterfaceC10827j
    public Uri getUri() {
        return this.f9390a.getUri();
    }

    /* renamed from: h */
    public void m12052h(C4738g0 c4738g0) {
        C11137a.m34599a(this != c4738g0);
        this.f9391b = c4738g0;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC4727b
    /* renamed from: j */
    public C4751s.b mo11999j() {
        return null;
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: l */
    public void mo161l(InterfaceC10834m0 interfaceC10834m0) {
        this.f9390a.mo161l(interfaceC10834m0);
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: o */
    public long mo162o(C10835n c10835n) {
        return this.f9390a.mo162o(c10835n);
    }

    @Override // p351s8.InterfaceC10823h
    public int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f9390a.read(bArr, i10, i11);
        } catch (C10836n0.a e10) {
            if (e10.f27384a == 2002) {
                return -1;
            }
            throw e10;
        }
    }
}
