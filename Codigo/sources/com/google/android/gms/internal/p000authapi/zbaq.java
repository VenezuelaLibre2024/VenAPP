package com.google.android.gms.internal.p000authapi;

import android.content.Intent;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import v9.l;

/* loaded from: classes2.dex */
public final class zbaq extends e {
    private static final a.g zba;
    private static final a.AbstractC0146a zbb;
    private static final a zbc;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbao zbaoVar = new zbao();
        zbb = zbaoVar;
        zbc = new a("Auth.Api.Identity.Authorization.API", zbaoVar, gVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zbaq(android.app.Activity r3, v9.l r4) {
        /*
            r2 = this;
            com.google.android.gms.common.api.a r0 = com.google.android.gms.internal.p000authapi.zbaq.zbc
            v9.k r4 = v9.k.c(r4)
            java.lang.String r1 = com.google.android.gms.internal.p000authapi.zbbj.zba()
            r4.a(r1)
            v9.l r4 = r4.b()
            com.google.android.gms.common.api.e$a r1 = com.google.android.gms.common.api.e.a.f9309c
            r2.<init>(r3, r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000authapi.zbaq.<init>(android.app.Activity, v9.l):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zbaq(android.content.Context r3, v9.l r4) {
        /*
            r2 = this;
            com.google.android.gms.common.api.a r0 = com.google.android.gms.internal.p000authapi.zbaq.zbc
            v9.k r4 = v9.k.c(r4)
            java.lang.String r1 = com.google.android.gms.internal.p000authapi.zbbj.zba()
            r4.a(r1)
            v9.l r4 = r4.b()
            com.google.android.gms.common.api.e$a r1 = com.google.android.gms.common.api.e.a.f9309c
            r2.<init>(r3, r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000authapi.zbaq.<init>(android.content.Context, v9.l):void");
    }

    public final Task<v9.a> authorize(AuthorizationRequest authorizationRequest) {
        s.j(authorizationRequest);
        AuthorizationRequest.a A1 = AuthorizationRequest.A1(authorizationRequest);
        A1.g(((l) getApiOptions()).b());
        final AuthorizationRequest a10 = A1.a();
        return doRead(w.a().d(zbbi.zbc).b(new r() { // from class: com.google.android.gms.internal.auth-api.zban
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                zbaq zbaqVar = zbaq.this;
                AuthorizationRequest authorizationRequest2 = a10;
                ((zbaa) ((zbw) obj).getService()).zbc(new zbap(zbaqVar, (TaskCompletionSource) obj2), (AuthorizationRequest) s.j(authorizationRequest2));
            }
        }).c(false).e(1534).a());
    }

    public final v9.a getAuthorizationResultFromIntent(Intent intent) {
        if (intent == null) {
            throw new b(Status.f9294t);
        }
        Status status = (Status) ea.e.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new b(Status.f9296v);
        }
        if (!status.y1()) {
            throw new b(status);
        }
        v9.a aVar = (v9.a) ea.e.b(intent, "authorization_result", v9.a.CREATOR);
        if (aVar != null) {
            return aVar;
        }
        throw new b(Status.f9294t);
    }
}
