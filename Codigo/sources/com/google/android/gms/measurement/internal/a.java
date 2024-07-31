package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f9931a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f9932b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ x f9933c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(x xVar, String str, long j10) {
        this.f9933c = xVar;
        this.f9931a = str;
        this.f9932b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x.t(this.f9933c, this.f9931a, this.f9932b);
    }
}
