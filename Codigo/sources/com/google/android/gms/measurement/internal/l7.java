package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class l7 implements com.google.common.util.concurrent.c<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ na f10352a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f10353b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l7(b7 b7Var, na naVar) {
        this.f10353b = b7Var;
        this.f10352a = naVar;
    }

    @Override // com.google.common.util.concurrent.c
    public final void a(Throwable th2) {
        this.f10353b.i();
        this.f10353b.f9991i = false;
        this.f10353b.m0();
        this.f10353b.zzj().B().b("registerTriggerAsync failed with throwable", th2);
    }

    @Override // com.google.common.util.concurrent.c
    public final void onSuccess(Object obj) {
        this.f10353b.i();
        this.f10353b.f9991i = false;
        this.f10353b.m0();
        this.f10353b.zzj().A().b("registerTriggerAsync ran. uri", this.f10352a.f10447a);
    }
}
