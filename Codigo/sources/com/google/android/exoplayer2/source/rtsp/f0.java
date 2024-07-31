package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.b;

/* loaded from: classes.dex */
final class f0 implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final long f8339a;

    public f0(long j10) {
        this.f8339a = j10;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b.a
    public b a(int i10) {
        e0 e0Var = new e0(this.f8339a);
        e0Var.o(c8.b.a(i10 * 2));
        return e0Var;
    }
}
