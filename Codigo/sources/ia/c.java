package ia;

import com.google.android.gms.common.api.internal.k;

/* loaded from: classes.dex */
final class c implements k.b {

    /* renamed from: a */
    final /* synthetic */ ha.h f17638a;

    public c(d dVar, ha.h hVar) {
        this.f17638a = hVar;
    }

    @Override // com.google.android.gms.common.api.internal.k.b
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((ha.a) obj).a(this.f17638a);
    }

    @Override // com.google.android.gms.common.api.internal.k.b
    public final void onNotifyListenerFailed() {
    }
}
