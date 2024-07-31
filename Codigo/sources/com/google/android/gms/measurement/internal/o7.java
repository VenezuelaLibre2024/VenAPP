package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class o7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f10463a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f10464b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Object f10465c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ long f10466d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ b7 f10467e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o7(b7 b7Var, String str, String str2, Object obj, long j10) {
        this.f10467e = b7Var;
        this.f10463a = str;
        this.f10464b = str2;
        this.f10465c = obj;
        this.f10466d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10467e.T(this.f10463a, this.f10464b, this.f10465c, this.f10466d);
    }
}
