package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ p8 f10627a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ p8 f10628b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ long f10629c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ boolean f10630d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ o8 f10631e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s8(o8 o8Var, p8 p8Var, p8 p8Var2, long j10, boolean z10) {
        this.f10631e = o8Var;
        this.f10627a = p8Var;
        this.f10628b = p8Var2;
        this.f10629c = j10;
        this.f10630d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10631e.I(this.f10627a, this.f10628b, this.f10629c, this.f10630d, null);
    }
}
