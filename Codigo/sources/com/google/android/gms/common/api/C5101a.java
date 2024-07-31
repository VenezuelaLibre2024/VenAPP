package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import ca.C1898d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.C5101a.d;
import com.google.android.gms.common.api.internal.InterfaceC5131f;
import com.google.android.gms.common.api.internal.InterfaceC5161n;
import com.google.android.gms.common.internal.AbstractC5228c;
import com.google.android.gms.common.internal.C5234e;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.common.internal.InterfaceC5252k;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.a */
/* loaded from: classes.dex */
public final class C5101a<O extends d> {

    /* renamed from: a */
    private final a f10412a;

    /* renamed from: b */
    private final g f10413b;

    /* renamed from: c */
    private final String f10414c;

    /* renamed from: com.google.android.gms.common.api.a$a */
    /* loaded from: classes.dex */
    public static abstract class a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T buildClient(Context context, Looper looper, C5234e c5234e, O o10, AbstractC5106f.a aVar, AbstractC5106f.b bVar) {
            return buildClient(context, looper, c5234e, (C5234e) o10, (InterfaceC5131f) aVar, (InterfaceC5161n) bVar);
        }

        public T buildClient(Context context, Looper looper, C5234e c5234e, O o10, InterfaceC5131f interfaceC5131f, InterfaceC5161n interfaceC5161n) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    /* loaded from: classes.dex */
    public static class c<C extends b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    /* loaded from: classes.dex */
    public interface d {

        /* renamed from: l */
        public static final c f10415l = new c(null);

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        /* loaded from: classes.dex */
        public interface a extends d {
            /* renamed from: c1 */
            Account m12977c1();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        /* loaded from: classes.dex */
        public interface b extends d {
            /* renamed from: T0 */
            GoogleSignInAccount m12978T0();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$c */
        /* loaded from: classes.dex */
        public static final class c implements d {
            private c() {
            }

            /* synthetic */ c(C5210t c5210t) {
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
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

    /* renamed from: com.google.android.gms.common.api.a$f */
    /* loaded from: classes.dex */
    public interface f extends b {
        void connect(AbstractC5228c.c cVar);

        void disconnect();

        void disconnect(String str);

        C1898d[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(InterfaceC5252k interfaceC5252k, Set<Scope> set);

        Set<Scope> getScopesForConnectionlessNonSignIn();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(AbstractC5228c.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    /* loaded from: classes.dex */
    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> C5101a(String str, a<C, O> aVar, g<C> gVar) {
        C5276s.m13325k(aVar, "Cannot construct an Api with a null ClientBuilder");
        C5276s.m13325k(gVar, "Cannot construct an Api with a null ClientKey");
        this.f10414c = str;
        this.f10412a = aVar;
        this.f10413b = gVar;
    }

    /* renamed from: a */
    public final a m12974a() {
        return this.f10412a;
    }

    /* renamed from: b */
    public final c m12975b() {
        return this.f10413b;
    }

    /* renamed from: c */
    public final String m12976c() {
        return this.f10414c;
    }
}
