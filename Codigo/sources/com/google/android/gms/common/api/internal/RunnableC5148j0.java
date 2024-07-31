package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C5101a;

/* renamed from: com.google.android.gms.common.api.internal.j0 */
/* loaded from: classes.dex */
final class RunnableC5148j0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C5152k0 f10497a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5148j0(C5152k0 c5152k0) {
        this.f10497a = c5152k0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5101a.f fVar;
        C5101a.f fVar2;
        C5156l0 c5156l0 = this.f10497a.f10507a;
        fVar = c5156l0.f10515b;
        fVar2 = c5156l0.f10515b;
        fVar.disconnect(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
