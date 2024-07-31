package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class r9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ wa.i f10604a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ s9 f10605b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r9(s9 s9Var, wa.i iVar) {
        this.f10605b = s9Var;
        this.f10604a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10605b) {
            this.f10605b.f10632a = false;
            if (!this.f10605b.f10634c.X()) {
                this.f10605b.f10634c.zzj().F().a("Connected to service");
                this.f10605b.f10634c.N(this.f10604a);
            }
        }
    }
}
