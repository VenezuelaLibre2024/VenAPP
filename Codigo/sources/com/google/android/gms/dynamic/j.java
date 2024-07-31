package com.google.android.gms.dynamic;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f9716a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(a aVar) {
        this.f9716a = aVar;
    }

    @Override // com.google.android.gms.dynamic.l
    public final int a() {
        return 4;
    }

    @Override // com.google.android.gms.dynamic.l
    public final void b(c cVar) {
        c cVar2;
        cVar2 = this.f9716a.f9706a;
        cVar2.onStart();
    }
}
