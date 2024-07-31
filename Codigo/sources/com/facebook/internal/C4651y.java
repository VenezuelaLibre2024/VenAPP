package com.facebook.internal;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import kotlin.jvm.internal.C9322n;
import p152i4.C7799e0;

/* renamed from: com.facebook.internal.y */
/* loaded from: classes.dex */
public final class C4651y {

    /* renamed from: a */
    public static final C4651y f8863a = new C4651y();

    /* renamed from: com.facebook.internal.y$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo11096a(String str);
    }

    /* renamed from: com.facebook.internal.y$b */
    /* loaded from: classes.dex */
    public static final class b implements InstallReferrerStateListener {

        /* renamed from: a */
        final /* synthetic */ InstallReferrerClient f8864a;

        /* renamed from: b */
        final /* synthetic */ a f8865b;

        b(InstallReferrerClient installReferrerClient, a aVar) {
            this.f8864a = installReferrerClient;
            this.f8865b = aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
        
            if (r0 != false) goto L19;
         */
        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo10406a(int r5) {
            /*
                r4 = this;
                boolean r0 = p007a5.C0033a.m107d(r4)
                if (r0 == 0) goto L7
                return
            L7:
                r0 = 2
                if (r5 == 0) goto L13
                if (r5 == r0) goto Ld
                goto L3e
            Ld:
                com.facebook.internal.y r5 = com.facebook.internal.C4651y.f8863a     // Catch: java.lang.Throwable -> L44
            Lf:
                com.facebook.internal.C4651y.m11463a(r5)     // Catch: java.lang.Throwable -> L44
                goto L3e
            L13:
                com.android.installreferrer.api.InstallReferrerClient r5 = r4.f8864a     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L4a
                com.android.installreferrer.api.ReferrerDetails r5 = r5.mo10403b()     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L4a
                java.lang.String r1 = "{\n                      referrerClient.installReferrer\n                    }"
                kotlin.jvm.internal.C9322n.m27780d(r5, r1)     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L4a
                java.lang.String r5 = r5.m10408a()     // Catch: java.lang.Throwable -> L44
                if (r5 == 0) goto L3b
                java.lang.String r1 = "fb"
                r2 = 0
                r3 = 0
                boolean r1 = p450xk.C12515g.m40983J(r5, r1, r3, r0, r2)     // Catch: java.lang.Throwable -> L44
                if (r1 != 0) goto L36
                java.lang.String r1 = "facebook"
                boolean r0 = p450xk.C12515g.m40983J(r5, r1, r3, r0, r2)     // Catch: java.lang.Throwable -> L44
                if (r0 == 0) goto L3b
            L36:
                com.facebook.internal.y$a r0 = r4.f8865b     // Catch: java.lang.Throwable -> L44
                r0.mo11096a(r5)     // Catch: java.lang.Throwable -> L44
            L3b:
                com.facebook.internal.y r5 = com.facebook.internal.C4651y.f8863a     // Catch: java.lang.Throwable -> L44
                goto Lf
            L3e:
                com.android.installreferrer.api.InstallReferrerClient r5 = r4.f8864a     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
                r5.mo10402a()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
                goto L46
            L44:
                r5 = move-exception
                goto L47
            L46:
                return
            L47:
                p007a5.C0033a.m105b(r5, r4)
            L4a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C4651y.b.mo10406a(int):void");
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        /* renamed from: b */
        public void mo10407b() {
        }
    }

    private C4651y() {
    }

    /* renamed from: b */
    private final boolean m11464b() {
        return C7799e0.m23860l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    /* renamed from: c */
    private final void m11465c(a aVar) {
        InstallReferrerClient m10405a = InstallReferrerClient.m10401c(C7799e0.m23860l()).m10405a();
        try {
            m10405a.mo10404d(new b(m10405a, aVar));
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static final void m11466d(a callback) {
        C9322n.m27781e(callback, "callback");
        C4651y c4651y = f8863a;
        if (c4651y.m11464b()) {
            return;
        }
        c4651y.m11465c(callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final void m11467e() {
        C7799e0.m23860l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}
