package com.google.android.gms.internal.p496authapi;

import android.content.Intent;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.AbstractC5105e;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.C5102b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC5188w;
import com.google.android.gms.common.api.internal.InterfaceC5173r;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p081ea.C7142e;
import p399v9.C11756a;
import p399v9.C11769l;

/* loaded from: classes2.dex */
public final class zbaq extends AbstractC5105e {
    private static final C5101a.g zba;
    private static final C5101a.a zbb;
    private static final C5101a zbc;

    static {
        C5101a.g gVar = new C5101a.g();
        zba = gVar;
        zbao zbaoVar = new zbao();
        zbb = zbaoVar;
        zbc = new C5101a("Auth.Api.Identity.Authorization.API", zbaoVar, gVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zbaq(android.app.Activity r3, p399v9.C11769l r4) {
        /*
            r2 = this;
            com.google.android.gms.common.api.a r0 = com.google.android.gms.internal.p496authapi.zbaq.zbc
            v9.k r4 = p399v9.C11768k.m37246c(r4)
            java.lang.String r1 = com.google.android.gms.internal.p496authapi.zbbj.zba()
            r4.m37247a(r1)
            v9.l r4 = r4.m37248b()
            com.google.android.gms.common.api.e$a r1 = com.google.android.gms.common.api.AbstractC5105e.a.f10417c
            r2.<init>(r3, r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p496authapi.zbaq.<init>(android.app.Activity, v9.l):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zbaq(android.content.Context r3, p399v9.C11769l r4) {
        /*
            r2 = this;
            com.google.android.gms.common.api.a r0 = com.google.android.gms.internal.p496authapi.zbaq.zbc
            v9.k r4 = p399v9.C11768k.m37246c(r4)
            java.lang.String r1 = com.google.android.gms.internal.p496authapi.zbbj.zba()
            r4.m37247a(r1)
            v9.l r4 = r4.m37248b()
            com.google.android.gms.common.api.e$a r1 = com.google.android.gms.common.api.AbstractC5105e.a.f10417c
            r2.<init>(r3, r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p496authapi.zbaq.<init>(android.content.Context, v9.l):void");
    }

    public final Task<C11756a> authorize(AuthorizationRequest authorizationRequest) {
        C5276s.m13324j(authorizationRequest);
        AuthorizationRequest.C5088a m12869A1 = AuthorizationRequest.m12869A1(authorizationRequest);
        m12869A1.m12884g(((C11769l) getApiOptions()).m37250b());
        final AuthorizationRequest m12878a = m12869A1.m12878a();
        return doRead(AbstractC5188w.m13190a().m13198d(zbbi.zbc).m13196b(new InterfaceC5173r() { // from class: com.google.android.gms.internal.auth-api.zban
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC5173r
            public final void accept(Object obj, Object obj2) {
                zbaq zbaqVar = zbaq.this;
                AuthorizationRequest authorizationRequest2 = m12878a;
                ((zbaa) ((zbw) obj).getService()).zbc(new zbap(zbaqVar, (TaskCompletionSource) obj2), (AuthorizationRequest) C5276s.m13324j(authorizationRequest2));
            }
        }).m13197c(false).m13199e(1534).m13195a());
    }

    public final C11756a getAuthorizationResultFromIntent(Intent intent) {
        if (intent == null) {
            throw new C5102b(Status.f10402t);
        }
        Status status = (Status) C7142e.m21236b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new C5102b(Status.f10404v);
        }
        if (!status.m12972y1()) {
            throw new C5102b(status);
        }
        C11756a c11756a = (C11756a) C7142e.m21236b(intent, "authorization_result", C11756a.CREATOR);
        if (c11756a != null) {
            return c11756a;
        }
        throw new C5102b(Status.f10402t);
    }
}
