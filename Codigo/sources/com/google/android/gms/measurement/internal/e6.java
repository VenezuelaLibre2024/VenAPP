package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class e6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f10150a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f10151b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f10152c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ long f10153d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ a6 f10154e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e6(a6 a6Var, String str, String str2, String str3, long j10) {
        this.f10154e = a6Var;
        this.f10150a = str;
        this.f10151b = str2;
        this.f10152c = str3;
        this.f10153d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar;
        va vaVar2;
        String str = this.f10150a;
        if (str == null) {
            vaVar2 = this.f10154e.f9953a;
            vaVar2.y(this.f10151b, null);
        } else {
            p8 p8Var = new p8(this.f10152c, str, this.f10153d);
            vaVar = this.f10154e.f9953a;
            vaVar.y(this.f10151b, p8Var);
        }
    }
}
