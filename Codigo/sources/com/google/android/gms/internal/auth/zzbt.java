package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.s;
import x9.a;
import x9.b;

/* loaded from: classes2.dex */
public final class zzbt implements a {
    public final i<Object> getSpatulaHeader(f fVar) {
        s.j(fVar);
        return fVar.b(new zzbs(this, fVar));
    }

    public final i<Object> performProxyRequest(f fVar, b bVar) {
        s.j(fVar);
        s.j(bVar);
        return fVar.b(new zzbq(this, fVar, bVar));
    }
}
