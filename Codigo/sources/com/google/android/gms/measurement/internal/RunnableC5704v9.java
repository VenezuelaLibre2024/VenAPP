package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.v9 */
/* loaded from: classes2.dex */
final class RunnableC5704v9 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ServiceConnectionC5665s9 f11913a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5704v9(ServiceConnectionC5665s9 serviceConnectionC5665s9) {
        this.f11913a = serviceConnectionC5665s9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11913a.f11832c.f11907d = null;
        this.f11913a.f11832c.m14378a0();
    }
}
