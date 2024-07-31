package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import ca.k;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import z9.q;

/* loaded from: classes.dex */
public class b extends com.google.android.gms.common.api.e<GoogleSignInOptions> {

    /* renamed from: a */
    private static final f f9276a = new f(null);

    /* renamed from: b */
    static int f9277b = 1;

    public b(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, s9.a.f25401c, googleSignInOptions, (u) new com.google.android.gms.common.api.internal.a());
    }

    public b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, s9.a.f25401c, googleSignInOptions, new e.a.C0148a().c(new com.google.android.gms.common.api.internal.a()).a());
    }

    private final synchronized int g() {
        int i10;
        i10 = f9277b;
        if (i10 == 1) {
            Context applicationContext = getApplicationContext();
            ca.f n10 = ca.f.n();
            int h10 = n10.h(applicationContext, k.f6983a);
            if (h10 == 0) {
                i10 = 4;
                f9277b = 4;
            } else if (n10.b(applicationContext, h10, null) != null || DynamiteModule.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                i10 = 2;
                f9277b = 2;
            } else {
                i10 = 3;
                f9277b = 3;
            }
        }
        return i10;
    }

    public Intent d() {
        Context applicationContext = getApplicationContext();
        int g10 = g();
        int i10 = g10 - 1;
        if (g10 != 0) {
            return i10 != 2 ? i10 != 3 ? q.b(applicationContext, getApiOptions()) : q.c(applicationContext, getApiOptions()) : q.a(applicationContext, getApiOptions());
        }
        throw null;
    }

    public Task<Void> e() {
        return r.c(q.f(asGoogleApiClient(), getApplicationContext(), g() == 3));
    }

    public Task<GoogleSignInAccount> f() {
        return r.b(q.e(asGoogleApiClient(), getApplicationContext(), getApiOptions(), g() == 3), f9276a);
    }

    public Task<Void> signOut() {
        return r.c(q.g(asGoogleApiClient(), getApplicationContext(), g() == 3));
    }
}
