package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import v9.f;
import v9.g;
import v9.h;
import v9.p;

/* loaded from: classes2.dex */
public final class zbaw extends e {
    private static final a.g zba;
    private static final a.AbstractC0146a zbb;
    private static final a zbc;
    private final String zbd;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbat zbatVar = new zbat();
        zbb = zbatVar;
        zbc = new a("Auth.Api.Identity.CredentialSaving.API", zbatVar, gVar);
    }

    public zbaw(Activity activity, p pVar) {
        super(activity, (a<p>) zbc, pVar, e.a.f9309c);
        this.zbd = zbbj.zba();
    }

    public zbaw(Context context, p pVar) {
        super(context, (a<p>) zbc, pVar, e.a.f9309c);
        this.zbd = zbbj.zba();
    }

    public final Status getStatusFromIntent(Intent intent) {
        Status status;
        return (intent == null || (status = (Status) ea.e.b(intent, "status", Status.CREATOR)) == null) ? Status.f9294t : status;
    }

    public final Task<f> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        s.j(saveAccountLinkingTokenRequest);
        SaveAccountLinkingTokenRequest.a z12 = SaveAccountLinkingTokenRequest.z1(saveAccountLinkingTokenRequest);
        z12.f(this.zbd);
        final SaveAccountLinkingTokenRequest a10 = z12.a();
        return doRead(w.a().d(zbbi.zbg).b(new r() { // from class: com.google.android.gms.internal.auth-api.zbar
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                zbaw zbawVar = zbaw.this;
                SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = a10;
                ((zbad) ((zbx) obj).getService()).zbc(new zbau(zbawVar, (TaskCompletionSource) obj2), (SaveAccountLinkingTokenRequest) s.j(saveAccountLinkingTokenRequest2));
            }
        }).c(false).e(1535).a());
    }

    public final Task<h> savePassword(g gVar) {
        s.j(gVar);
        g.a w12 = g.w1(gVar);
        w12.c(this.zbd);
        final g a10 = w12.a();
        return doRead(w.a().d(zbbi.zbe).b(new r() { // from class: com.google.android.gms.internal.auth-api.zbas
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                zbaw zbawVar = zbaw.this;
                g gVar2 = a10;
                ((zbad) ((zbx) obj).getService()).zbd(new zbav(zbawVar, (TaskCompletionSource) obj2), (g) s.j(gVar2));
            }
        }).c(false).e(1536).a());
    }
}
