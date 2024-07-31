package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ v f10157a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f10158b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e8(b7 b7Var, v vVar) {
        this.f10158b = b7Var;
        this.f10157a = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10158b.e().u(this.f10157a)) {
            this.f10158b.o().P(false);
        } else {
            this.f10158b.zzj().E().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.f10157a.a()));
        }
    }
}
