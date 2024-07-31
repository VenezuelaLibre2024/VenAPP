package com.google.android.gms.common.api.internal;

import android.util.Log;
import ca.C1894b;
import com.google.android.gms.common.api.C5101a;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.o0 */
/* loaded from: classes.dex */
final class RunnableC5165o0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1894b f10550a;

    /* renamed from: b */
    final /* synthetic */ C5168p0 f10551b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5165o0(C5168p0 c5168p0, C1894b c1894b) {
        this.f10551b = c5168p0;
        this.f10550a = c1894b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        C5115b c5115b;
        C5101a.f fVar;
        C5101a.f fVar2;
        C5101a.f fVar3;
        C5101a.f fVar4;
        C5168p0 c5168p0 = this.f10551b;
        map = c5168p0.f10561f.f10478w;
        c5115b = c5168p0.f10557b;
        C5156l0 c5156l0 = (C5156l0) map.get(c5115b);
        if (c5156l0 == null) {
            return;
        }
        if (!this.f10550a.m10054y1()) {
            c5156l0.m13118E(this.f10550a, null);
            return;
        }
        this.f10551b.f10560e = true;
        fVar = this.f10551b.f10556a;
        if (fVar.requiresSignIn()) {
            this.f10551b.m13154h();
            return;
        }
        try {
            C5168p0 c5168p02 = this.f10551b;
            fVar3 = c5168p02.f10556a;
            fVar4 = c5168p02.f10556a;
            fVar3.getRemoteService(null, fVar4.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            fVar2 = this.f10551b.f10556a;
            fVar2.disconnect("Failed to get service from broker.");
            c5156l0.m13118E(new C1894b(10), null);
        }
    }
}
