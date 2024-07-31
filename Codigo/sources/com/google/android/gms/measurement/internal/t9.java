package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class t9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ wa.i f10656a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ s9 f10657b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t9(s9 s9Var, wa.i iVar) {
        this.f10657b = s9Var;
        this.f10656a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10657b) {
            this.f10657b.f10632a = false;
            if (!this.f10657b.f10634c.X()) {
                this.f10657b.f10634c.zzj().A().a("Connected to remote service");
                this.f10657b.f10634c.N(this.f10656a);
            }
        }
    }
}
