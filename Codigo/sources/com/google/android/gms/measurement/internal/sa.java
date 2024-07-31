package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class sa extends u {

    /* renamed from: e */
    private final /* synthetic */ pa f10635e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(pa paVar, w6 w6Var) {
        super(w6Var);
        this.f10635e = paVar;
    }

    @Override // com.google.android.gms.measurement.internal.u
    public final void d() {
        this.f10635e.u();
        this.f10635e.zzj().F().a("Starting upload from DelayedRunnable");
        this.f10635e.f10606b.o0();
    }
}
