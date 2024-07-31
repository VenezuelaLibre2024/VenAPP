package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.c;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class a<O extends d> {

    /* renamed from: a */
    private final AbstractC0146a f9304a;

    /* renamed from: b */
    private final g f9305b;

    /* renamed from: c */
    private final String f9306c;

    /* renamed from: com.google.android.gms.common.api.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0146a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T buildClient(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, O o10, f.a aVar, f.b bVar) {
            return buildClient(context, looper, eVar, (com.google.android.gms.common.internal.e) o10, (com.google.android.gms.common.api.internal.f) aVar, (com.google.android.gms.common.api.internal.n) bVar);
        }

        public T buildClient(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, O o10, com.google.android.gms.common.api.internal.f fVar, com.google.android.gms.common.api.internal.n nVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c<C extends b> {
    }

    /* loaded from: classes.dex */
    public interface d {

        /* renamed from: l */
        public static final c f9307l = new c(null);

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        /* loaded from: classes.dex */
        public interface InterfaceC0147a extends d {
            Account c1();
        }

        /* loaded from: classes.dex */
        public interface b extends d {
            GoogleSignInAccount T0();
        }

        /* loaded from: classes.dex */
        public static final class c implements d {
            private c() {
            }

            /* synthetic */ c(t tVar) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<T extends b, O> {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        public List<Scope> getImpliedScopes(O o10) {
            return Collections.emptyList();
        }

        public int getPriority() {
            return API_PRIORITY_OTHER;
        }
    }

    /* loaded from: classes.dex */
    public interface f extends b {
        void connect(c.InterfaceC0149c interfaceC0149c);

        void disconnect();

        void disconnect(String str);

        ca.d[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(com.google.android.gms.common.internal.k kVar, Set<Scope> set);

        Set<Scope> getScopesForConnectionlessNonSignIn();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(c.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* loaded from: classes.dex */
    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(String str, AbstractC0146a<C, O> abstractC0146a, g<C> gVar) {
        com.google.android.gms.common.internal.s.k(abstractC0146a, "Cannot construct an Api with a null ClientBuilder");
        com.google.android.gms.common.internal.s.k(gVar, "Cannot construct an Api with a null ClientKey");
        this.f9306c = str;
        this.f9304a = abstractC0146a;
        this.f9305b = gVar;
    }

    public final AbstractC0146a a() {
        return this.f9304a;
    }

    public final c b() {
        return this.f9305b;
    }

    public final String c() {
        return this.f9306c;
    }
}
