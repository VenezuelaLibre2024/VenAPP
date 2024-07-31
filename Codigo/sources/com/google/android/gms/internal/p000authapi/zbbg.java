package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import v9.a0;
import v9.b;
import v9.c;
import v9.d;
import v9.e;
import v9.i;

/* loaded from: classes2.dex */
public final class zbbg extends e {
    private static final a.g zba;
    private static final a.AbstractC0146a zbb;
    private static final a zbc;
    private final String zbd;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbbb zbbbVar = new zbbb();
        zbb = zbbbVar;
        zbc = new a("Auth.Api.Identity.SignIn.API", zbbbVar, gVar);
    }

    public zbbg(Activity activity, a0 a0Var) {
        super(activity, (a<a0>) zbc, a0Var, e.a.f9309c);
        this.zbd = zbbj.zba();
    }

    public zbbg(Context context, a0 a0Var) {
        super(context, (a<a0>) zbc, a0Var, e.a.f9309c);
        this.zbd = zbbj.zba();
    }

    public final Task<c> beginSignIn(b bVar) {
        s.j(bVar);
        b.a A1 = b.A1(bVar);
        A1.g(this.zbd);
        final b a10 = A1.a();
        return doRead(w.a().d(zbbi.zba).b(new r() { // from class: com.google.android.gms.internal.auth-api.zbax
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                zbbg zbbgVar = zbbg.this;
                b bVar2 = a10;
                ((zbam) ((zbbh) obj).getService()).zbc(new zbbc(zbbgVar, (TaskCompletionSource) obj2), (b) s.j(bVar2));
            }
        }).c(false).e(1553).a());
    }

    public final String getPhoneNumberFromIntent(Intent intent) {
        if (intent == null) {
            throw new com.google.android.gms.common.api.b(Status.f9294t);
        }
        Status status = (Status) ea.e.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new com.google.android.gms.common.api.b(Status.f9296v);
        }
        if (!status.y1()) {
            throw new com.google.android.gms.common.api.b(status);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new com.google.android.gms.common.api.b(Status.f9294t);
    }

    public final Task<PendingIntent> getPhoneNumberHintIntent(final d dVar) {
        s.j(dVar);
        return doRead(w.a().d(zbbi.zbh).b(new r() { // from class: com.google.android.gms.internal.auth-api.zbba
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                zbbg.this.zba(dVar, (zbbh) obj, (TaskCompletionSource) obj2);
            }
        }).e(1653).a());
    }

    public final i getSignInCredentialFromIntent(Intent intent) {
        if (intent == null) {
            throw new com.google.android.gms.common.api.b(Status.f9294t);
        }
        Status status = (Status) ea.e.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new com.google.android.gms.common.api.b(Status.f9296v);
        }
        if (!status.y1()) {
            throw new com.google.android.gms.common.api.b(status);
        }
        i iVar = (i) ea.e.b(intent, "sign_in_credential", i.CREATOR);
        if (iVar != null) {
            return iVar;
        }
        throw new com.google.android.gms.common.api.b(Status.f9294t);
    }

    public final Task<PendingIntent> getSignInIntent(v9.e eVar) {
        s.j(eVar);
        e.a z12 = v9.e.z1(eVar);
        z12.f(this.zbd);
        final v9.e a10 = z12.a();
        return doRead(w.a().d(zbbi.zbf).b(new r() { // from class: com.google.android.gms.internal.auth-api.zbay
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                zbbg zbbgVar = zbbg.this;
                v9.e eVar2 = a10;
                ((zbam) ((zbbh) obj).getService()).zbe(new zbbe(zbbgVar, (TaskCompletionSource) obj2), (v9.e) s.j(eVar2));
            }
        }).e(1555).a());
    }

    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Iterator<f> it = f.c().iterator();
        while (it.hasNext()) {
            it.next().h();
        }
        g.a();
        return doWrite(w.a().d(zbbi.zbb).b(new r() { // from class: com.google.android.gms.internal.auth-api.zbaz
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                zbbg.this.zbb((zbbh) obj, (TaskCompletionSource) obj2);
            }
        }).c(false).e(1554).a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zba(d dVar, zbbh zbbhVar, TaskCompletionSource taskCompletionSource) {
        ((zbam) zbbhVar.getService()).zbd(new zbbf(this, taskCompletionSource), dVar, this.zbd);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zbb(zbbh zbbhVar, TaskCompletionSource taskCompletionSource) {
        ((zbam) zbbhVar.getService()).zbf(new zbbd(this, taskCompletionSource), this.zbd);
    }
}
