package com.google.android.gms.measurement.internal;

import com.google.common.util.concurrent.InterfaceC5917c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.l7 */
/* loaded from: classes2.dex */
public final class C5572l7 implements InterfaceC5917c<Object> {

    /* renamed from: a */
    private final /* synthetic */ C5601na f11524a;

    /* renamed from: b */
    private final /* synthetic */ C5442b7 f11525b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5572l7(C5442b7 c5442b7, C5601na c5601na) {
        this.f11525b = c5442b7;
        this.f11524a = c5601na;
    }

    @Override // com.google.common.util.concurrent.InterfaceC5917c
    /* renamed from: a */
    public final void mo14082a(Throwable th2) {
        this.f11525b.mo13687i();
        this.f11525b.f11111i = false;
        this.f11525b.m13696m0();
        this.f11525b.zzj().m14182B().m14219b("registerTriggerAsync failed with throwable", th2);
    }

    @Override // com.google.common.util.concurrent.InterfaceC5917c
    public final void onSuccess(Object obj) {
        this.f11525b.mo13687i();
        this.f11525b.f11111i = false;
        this.f11525b.m13696m0();
        this.f11525b.zzj().m14181A().m14219b("registerTriggerAsync ran. uri", this.f11524a.f11634a);
    }
}
