package com.google.android.gms.internal.p496authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.AbstractC5105e;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.C5102b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC5188w;
import com.google.android.gms.common.api.internal.C5135g;
import com.google.android.gms.common.api.internal.InterfaceC5173r;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import p081ea.C7142e;
import p399v9.C11757a0;
import p399v9.C11758b;
import p399v9.C11760c;
import p399v9.C11761d;
import p399v9.C11762e;
import p399v9.C11766i;

/* loaded from: classes2.dex */
public final class zbbg extends AbstractC5105e {
    private static final C5101a.g zba;
    private static final C5101a.a zbb;
    private static final C5101a zbc;
    private final String zbd;

    static {
        C5101a.g gVar = new C5101a.g();
        zba = gVar;
        zbbb zbbbVar = new zbbb();
        zbb = zbbbVar;
        zbc = new C5101a("Auth.Api.Identity.SignIn.API", zbbbVar, gVar);
    }

    public zbbg(Activity activity, C11757a0 c11757a0) {
        super(activity, (C5101a<C11757a0>) zbc, c11757a0, AbstractC5105e.a.f10417c);
        this.zbd = zbbj.zba();
    }

    public zbbg(Context context, C11757a0 c11757a0) {
        super(context, (C5101a<C11757a0>) zbc, c11757a0, AbstractC5105e.a.f10417c);
        this.zbd = zbbj.zba();
    }

    public final Task<C11760c> beginSignIn(C11758b c11758b) {
        C5276s.m13324j(c11758b);
        C11758b.a m37172A1 = C11758b.m37172A1(c11758b);
        m37172A1.m37185g(this.zbd);
        final C11758b m37179a = m37172A1.m37179a();
        return doRead(AbstractC5188w.m13190a().m13198d(zbbi.zba).m13196b(new InterfaceC5173r() { // from class: com.google.android.gms.internal.auth-api.zbax
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC5173r
            public final void accept(Object obj, Object obj2) {
                zbbg zbbgVar = zbbg.this;
                C11758b c11758b2 = m37179a;
                ((zbam) ((zbbh) obj).getService()).zbc(new zbbc(zbbgVar, (TaskCompletionSource) obj2), (C11758b) C5276s.m13324j(c11758b2));
            }
        }).m13197c(false).m13199e(1553).m13195a());
    }

    public final String getPhoneNumberFromIntent(Intent intent) {
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
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new C5102b(Status.f10402t);
    }

    public final Task<PendingIntent> getPhoneNumberHintIntent(final C11761d c11761d) {
        C5276s.m13324j(c11761d);
        return doRead(AbstractC5188w.m13190a().m13198d(zbbi.zbh).m13196b(new InterfaceC5173r() { // from class: com.google.android.gms.internal.auth-api.zbba
            @Override // com.google.android.gms.common.api.internal.InterfaceC5173r
            public final void accept(Object obj, Object obj2) {
                zbbg.this.zba(c11761d, (zbbh) obj, (TaskCompletionSource) obj2);
            }
        }).m13199e(1653).m13195a());
    }

    public final C11766i getSignInCredentialFromIntent(Intent intent) {
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
        C11766i c11766i = (C11766i) C7142e.m21236b(intent, "sign_in_credential", C11766i.CREATOR);
        if (c11766i != null) {
            return c11766i;
        }
        throw new C5102b(Status.f10402t);
    }

    public final Task<PendingIntent> getSignInIntent(C11762e c11762e) {
        C5276s.m13324j(c11762e);
        C11762e.a m37214z1 = C11762e.m37214z1(c11762e);
        m37214z1.m37224f(this.zbd);
        final C11762e m37219a = m37214z1.m37219a();
        return doRead(AbstractC5188w.m13190a().m13198d(zbbi.zbf).m13196b(new InterfaceC5173r() { // from class: com.google.android.gms.internal.auth-api.zbay
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC5173r
            public final void accept(Object obj, Object obj2) {
                zbbg zbbgVar = zbbg.this;
                C11762e c11762e2 = m37219a;
                ((zbam) ((zbbh) obj).getService()).zbe(new zbbe(zbbgVar, (TaskCompletionSource) obj2), (C11762e) C5276s.m13324j(c11762e2));
            }
        }).m13199e(1555).m13195a());
    }

    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Iterator<AbstractC5106f> it = AbstractC5106f.m12983c().iterator();
        while (it.hasNext()) {
            it.next().m12990h();
        }
        C5135g.m13036a();
        return doWrite(AbstractC5188w.m13190a().m13198d(zbbi.zbb).m13196b(new InterfaceC5173r() { // from class: com.google.android.gms.internal.auth-api.zbaz
            @Override // com.google.android.gms.common.api.internal.InterfaceC5173r
            public final void accept(Object obj, Object obj2) {
                zbbg.this.zbb((zbbh) obj, (TaskCompletionSource) obj2);
            }
        }).m13197c(false).m13199e(1554).m13195a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zba(C11761d c11761d, zbbh zbbhVar, TaskCompletionSource taskCompletionSource) {
        ((zbam) zbbhVar.getService()).zbd(new zbbf(this, taskCompletionSource), c11761d, this.zbd);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zbb(zbbh zbbhVar, TaskCompletionSource taskCompletionSource) {
        ((zbam) zbbhVar.getService()).zbf(new zbbd(this, taskCompletionSource), this.zbd);
    }
}
