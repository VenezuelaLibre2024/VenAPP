package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ia {

    /* renamed from: a, reason: collision with root package name */
    private ha f10292a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ da f10293b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ia(da daVar) {
        this.f10293b = daVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        Handler handler;
        this.f10293b.i();
        if (this.f10292a != null) {
            handler = this.f10293b.f10081c;
            handler.removeCallbacks(this.f10292a);
        }
        this.f10293b.e().f10853s.a(false);
        this.f10293b.y(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(long j10) {
        Handler handler;
        this.f10292a = new ha(this, this.f10293b.zzb().a(), j10);
        handler = this.f10293b.f10081c;
        handler.postDelayed(this.f10292a, 2000L);
    }
}
