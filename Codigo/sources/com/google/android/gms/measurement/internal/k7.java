package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class k7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f10335a;

    /* renamed from: b */
    private final /* synthetic */ b7 f10336b;

    public k7(b7 b7Var, boolean z10) {
        this.f10336b = b7Var;
        this.f10335a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean k10 = this.f10336b.f10701a.k();
        boolean j10 = this.f10336b.f10701a.j();
        this.f10336b.f10701a.h(this.f10335a);
        if (j10 == this.f10335a) {
            this.f10336b.f10701a.zzj().F().b("Default data collection state already set to", Boolean.valueOf(this.f10335a));
        }
        if (this.f10336b.f10701a.k() == k10 || this.f10336b.f10701a.k() != this.f10336b.f10701a.j()) {
            this.f10336b.f10701a.zzj().H().c("Default data collection is different than actual status", Boolean.valueOf(this.f10335a), Boolean.valueOf(k10));
        }
        this.f10336b.o0();
    }
}
