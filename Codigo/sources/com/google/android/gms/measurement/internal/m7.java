package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class m7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f10404a;

    /* renamed from: b */
    private final /* synthetic */ b7 f10405b;

    public m7(b7 b7Var, long j10) {
        this.f10405b = b7Var;
        this.f10404a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10405b.e().f10845k.b(this.f10404a);
        this.f10405b.zzj().A().b("Session timeout duration set", Long.valueOf(this.f10404a));
    }
}
