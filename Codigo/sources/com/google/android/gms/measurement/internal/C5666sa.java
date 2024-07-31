package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.sa */
/* loaded from: classes2.dex */
public final class C5666sa extends AbstractC5681u {

    /* renamed from: e */
    private final /* synthetic */ C5627pa f11833e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5666sa(C5627pa c5627pa, InterfaceC5713w6 interfaceC5713w6) {
        super(interfaceC5713w6);
        this.f11833e = c5627pa;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5681u
    /* renamed from: d */
    public final void mo13920d() {
        this.f11833e.m14227u();
        this.f11833e.zzj().m14186F().m14218a("Starting upload from DelayedRunnable");
        this.f11833e.f11804b.m14472o0();
    }
}
