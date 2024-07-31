package com.google.android.gms.internal.p496authapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.AbstractC5105e;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC5188w;
import com.google.android.gms.common.api.internal.InterfaceC5173r;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p081ea.C7142e;
import p399v9.C11763f;
import p399v9.C11764g;
import p399v9.C11765h;
import p399v9.C11773p;

/* loaded from: classes2.dex */
public final class zbaw extends AbstractC5105e {
    private static final C5101a.g zba;
    private static final C5101a.a zbb;
    private static final C5101a zbc;
    private final String zbd;

    static {
        C5101a.g gVar = new C5101a.g();
        zba = gVar;
        zbat zbatVar = new zbat();
        zbb = zbatVar;
        zbc = new C5101a("Auth.Api.Identity.CredentialSaving.API", zbatVar, gVar);
    }

    public zbaw(Activity activity, C11773p c11773p) {
        super(activity, (C5101a<C11773p>) zbc, c11773p, AbstractC5105e.a.f10417c);
        this.zbd = zbbj.zba();
    }

    public zbaw(Context context, C11773p c11773p) {
        super(context, (C5101a<C11773p>) zbc, c11773p, AbstractC5105e.a.f10417c);
        this.zbd = zbbj.zba();
    }

    public final Status getStatusFromIntent(Intent intent) {
        Status status;
        return (intent == null || (status = (Status) C7142e.m21236b(intent, "status", Status.CREATOR)) == null) ? Status.f10402t : status;
    }

    public final Task<C11763f> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        C5276s.m13324j(saveAccountLinkingTokenRequest);
        SaveAccountLinkingTokenRequest.C5089a m12886z1 = SaveAccountLinkingTokenRequest.m12886z1(saveAccountLinkingTokenRequest);
        m12886z1.m12896f(this.zbd);
        final SaveAccountLinkingTokenRequest m12891a = m12886z1.m12891a();
        return doRead(AbstractC5188w.m13190a().m13198d(zbbi.zbg).m13196b(new InterfaceC5173r() { // from class: com.google.android.gms.internal.auth-api.zbar
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC5173r
            public final void accept(Object obj, Object obj2) {
                zbaw zbawVar = zbaw.this;
                SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = m12891a;
                ((zbad) ((zbx) obj).getService()).zbc(new zbau(zbawVar, (TaskCompletionSource) obj2), (SaveAccountLinkingTokenRequest) C5276s.m13324j(saveAccountLinkingTokenRequest2));
            }
        }).m13197c(false).m13199e(1535).m13195a());
    }

    public final Task<C11765h> savePassword(C11764g c11764g) {
        C5276s.m13324j(c11764g);
        C11764g.a m37228w1 = C11764g.m37228w1(c11764g);
        m37228w1.m37232c(this.zbd);
        final C11764g m37230a = m37228w1.m37230a();
        return doRead(AbstractC5188w.m13190a().m13198d(zbbi.zbe).m13196b(new InterfaceC5173r() { // from class: com.google.android.gms.internal.auth-api.zbas
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC5173r
            public final void accept(Object obj, Object obj2) {
                zbaw zbawVar = zbaw.this;
                C11764g c11764g2 = m37230a;
                ((zbad) ((zbx) obj).getService()).zbd(new zbav(zbawVar, (TaskCompletionSource) obj2), (C11764g) C5276s.m13324j(c11764g2));
            }
        }).m13197c(false).m13199e(1536).m13195a());
    }
}
