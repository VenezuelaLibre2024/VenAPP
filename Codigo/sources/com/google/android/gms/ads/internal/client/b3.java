package com.google.android.gms.ads.internal.client;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b3 extends y {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d3 f8619c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b3(d3 d3Var) {
        this.f8619c = d3Var;
    }

    @Override // com.google.android.gms.ads.internal.client.y, x8.e
    public final void onAdFailedToLoad(x8.o oVar) {
        x8.b0 b0Var;
        d3 d3Var = this.f8619c;
        b0Var = d3Var.f8636d;
        b0Var.c(d3Var.l());
        super.onAdFailedToLoad(oVar);
    }

    @Override // com.google.android.gms.ads.internal.client.y, x8.e
    public final void onAdLoaded() {
        x8.b0 b0Var;
        d3 d3Var = this.f8619c;
        b0Var = d3Var.f8636d;
        b0Var.c(d3Var.l());
        super.onAdLoaded();
    }
}
