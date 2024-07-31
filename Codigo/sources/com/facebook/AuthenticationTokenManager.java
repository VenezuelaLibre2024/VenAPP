package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.internal.n0;
import i4.e0;
import i4.i;
import i4.j;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class AuthenticationTokenManager {

    /* renamed from: d */
    public static final a f7535d = new a(null);

    /* renamed from: e */
    private static AuthenticationTokenManager f7536e;

    /* renamed from: a */
    private final k1.a f7537a;

    /* renamed from: b */
    private final j f7538b;

    /* renamed from: c */
    private i f7539c;

    /* loaded from: classes.dex */
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            n.e(context, "context");
            n.e(intent, "intent");
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final AuthenticationTokenManager a() {
            AuthenticationTokenManager authenticationTokenManager;
            AuthenticationTokenManager authenticationTokenManager2 = AuthenticationTokenManager.f7536e;
            if (authenticationTokenManager2 != null) {
                return authenticationTokenManager2;
            }
            synchronized (this) {
                authenticationTokenManager = AuthenticationTokenManager.f7536e;
                if (authenticationTokenManager == null) {
                    k1.a b10 = k1.a.b(e0.l());
                    n.d(b10, "getInstance(applicationContext)");
                    AuthenticationTokenManager authenticationTokenManager3 = new AuthenticationTokenManager(b10, new j());
                    AuthenticationTokenManager.f7536e = authenticationTokenManager3;
                    authenticationTokenManager = authenticationTokenManager3;
                }
            }
            return authenticationTokenManager;
        }
    }

    public AuthenticationTokenManager(k1.a localBroadcastManager, j authenticationTokenCache) {
        n.e(localBroadcastManager, "localBroadcastManager");
        n.e(authenticationTokenCache, "authenticationTokenCache");
        this.f7537a = localBroadcastManager;
        this.f7538b = authenticationTokenCache;
    }

    private final void d(i iVar, i iVar2) {
        Intent intent = new Intent(e0.l(), (Class<?>) CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", iVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", iVar2);
        this.f7537a.d(intent);
    }

    private final void f(i iVar, boolean z10) {
        i c10 = c();
        this.f7539c = iVar;
        if (z10) {
            j jVar = this.f7538b;
            if (iVar != null) {
                jVar.b(iVar);
            } else {
                jVar.a();
                n0 n0Var = n0.f7780a;
                n0.i(e0.l());
            }
        }
        if (n0.e(c10, iVar)) {
            return;
        }
        d(c10, iVar);
    }

    public final i c() {
        return this.f7539c;
    }

    public final void e(i iVar) {
        f(iVar, true);
    }
}
