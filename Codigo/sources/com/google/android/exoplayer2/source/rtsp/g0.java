package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.source.rtsp.s;
import s8.m0;
import s8.n0;
import t8.r0;

/* loaded from: classes.dex */
final class g0 implements b {

    /* renamed from: a, reason: collision with root package name */
    private final n0 f8346a;

    /* renamed from: b, reason: collision with root package name */
    private g0 f8347b;

    public g0(long j10) {
        this.f8346a = new n0(AdError.SERVER_ERROR_CODE, hb.e.d(j10));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b
    public String b() {
        int c10 = c();
        t8.a.g(c10 != -1);
        return r0.C("RTP/AVP;unicast;client_port=%d-%d", Integer.valueOf(c10), Integer.valueOf(c10 + 1));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b
    public int c() {
        int c10 = this.f8346a.c();
        if (c10 == -1) {
            return -1;
        }
        return c10;
    }

    @Override // s8.j
    public void close() {
        this.f8346a.close();
        g0 g0Var = this.f8347b;
        if (g0Var != null) {
            g0Var.close();
        }
    }

    @Override // s8.j
    public Uri getUri() {
        return this.f8346a.getUri();
    }

    public void h(g0 g0Var) {
        t8.a.a(this != g0Var);
        this.f8347b = g0Var;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b
    public s.b j() {
        return null;
    }

    @Override // s8.j
    public void l(m0 m0Var) {
        this.f8346a.l(m0Var);
    }

    @Override // s8.j
    public long o(s8.n nVar) {
        return this.f8346a.o(nVar);
    }

    @Override // s8.h
    public int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f8346a.read(bArr, i10, i11);
        } catch (n0.a e10) {
            if (e10.f25265a == 2002) {
                return -1;
            }
            throw e10;
        }
    }
}
