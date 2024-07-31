package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f10002a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ boolean f10003b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ hb f10004c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ v8 f10005d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b9(v8 v8Var, lb lbVar, boolean z10, hb hbVar) {
        this.f10005d = v8Var;
        this.f10002a = lbVar;
        this.f10003b = z10;
        this.f10004c = hbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa.i iVar;
        iVar = this.f10005d.f10709d;
        if (iVar == null) {
            this.f10005d.zzj().B().a("Discarding data. Failed to set user property");
            return;
        }
        com.google.android.gms.common.internal.s.j(this.f10002a);
        this.f10005d.O(iVar, this.f10003b ? null : this.f10004c, this.f10002a);
        this.f10005d.b0();
    }
}
