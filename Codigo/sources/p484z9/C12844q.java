package p484z9;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.AbstractC5109i;
import com.google.android.gms.common.api.C5200j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C5135g;
import ga.C7533a;
import java.util.Iterator;
import p462y9.C12654b;

/* renamed from: z9.q */
/* loaded from: classes.dex */
public final class C12844q {

    /* renamed from: a */
    private static final C7533a f35036a = new C7533a("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static Intent m42580a(Context context, GoogleSignInOptions googleSignInOptions) {
        f35036a.m22869a("getFallbackSignInIntent()", new Object[0]);
        Intent m42582c = m42582c(context, googleSignInOptions);
        m42582c.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return m42582c;
    }

    /* renamed from: b */
    public static Intent m42581b(Context context, GoogleSignInOptions googleSignInOptions) {
        f35036a.m22869a("getNoImplementationSignInIntent()", new Object[0]);
        Intent m42582c = m42582c(context, googleSignInOptions);
        m42582c.setAction("com.google.android.gms.auth.NO_IMPL");
        return m42582c;
    }

    /* renamed from: c */
    public static Intent m42582c(Context context, GoogleSignInOptions googleSignInOptions) {
        f35036a.m22869a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* renamed from: d */
    public static C12654b m42583d(Intent intent) {
        if (intent == null) {
            return new C12654b(null, Status.f10402t);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new C12654b(googleSignInAccount, Status.f10400r);
        }
        if (status == null) {
            status = Status.f10402t;
        }
        return new C12654b(null, status);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0097  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.common.api.AbstractC5108h m42584e(com.google.android.gms.common.api.AbstractC5106f r6, android.content.Context r7, com.google.android.gms.auth.api.signin.GoogleSignInOptions r8, boolean r9) {
        /*
            ga.a r0 = p484z9.C12844q.f35036a
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "silentSignIn()"
            r0.m22869a(r3, r2)
            java.lang.String r2 = "getEligibleSavedSignInResult()"
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r0.m22869a(r2, r3)
            com.google.android.gms.common.internal.C5276s.m13324j(r8)
            z9.r r2 = p484z9.C12845r.m42588c(r7)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = r2.m42591b()
            r3 = 0
            if (r2 != 0) goto L22
        L1f:
            r4 = r3
            goto L89
        L22:
            android.accounts.Account r4 = r2.m12928c1()
            android.accounts.Account r5 = r8.m12928c1()
            if (r4 != 0) goto L2f
            if (r5 != 0) goto L1f
            goto L36
        L2f:
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L36
            goto L1f
        L36:
            boolean r4 = r8.m12926A1()
            if (r4 == 0) goto L3d
            goto L1f
        L3d:
            boolean r4 = r8.m12934z1()
            if (r4 == 0) goto L59
            boolean r4 = r2.m12934z1()
            if (r4 != 0) goto L4a
            goto L1f
        L4a:
            java.lang.String r4 = r8.m12932x1()
            java.lang.String r5 = r2.m12932x1()
            boolean r4 = com.google.android.gms.common.internal.C5270q.m13304b(r4, r5)
            if (r4 != 0) goto L59
            goto L1f
        L59:
            java.util.HashSet r4 = new java.util.HashSet
            java.util.ArrayList r2 = r2.m12931w1()
            r4.<init>(r2)
            java.util.HashSet r2 = new java.util.HashSet
            java.util.ArrayList r5 = r8.m12931w1()
            r2.<init>(r5)
            boolean r2 = r4.containsAll(r2)
            if (r2 != 0) goto L72
            goto L1f
        L72:
            z9.r r2 = p484z9.C12845r.m42588c(r7)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = r2.m42590a()
            if (r2 == 0) goto L1f
            boolean r4 = r2.m12901B1()
            if (r4 != 0) goto L1f
            y9.b r4 = new y9.b
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.f10400r
            r4.<init>(r2, r5)
        L89:
            if (r4 == 0) goto L97
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r8 = "Eligible saved sign in result found"
            r0.m22869a(r8, r7)
            com.google.android.gms.common.api.h r6 = com.google.android.gms.common.api.C5200j.m13210b(r4, r6)
            return r6
        L97:
            if (r9 == 0) goto La9
            y9.b r7 = new y9.b
            com.google.android.gms.common.api.Status r8 = new com.google.android.gms.common.api.Status
            r9 = 4
            r8.<init>(r9)
            r7.<init>(r3, r8)
            com.google.android.gms.common.api.h r6 = com.google.android.gms.common.api.C5200j.m13210b(r7, r6)
            return r6
        La9:
            java.lang.String r9 = "trySilentSignIn()"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.m22869a(r9, r1)
            z9.k r9 = new z9.k
            r9.<init>(r6, r7, r8)
            com.google.android.gms.common.api.internal.d r6 = r6.mo12984a(r9)
            com.google.android.gms.common.api.internal.o r7 = new com.google.android.gms.common.api.internal.o
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p484z9.C12844q.m42584e(com.google.android.gms.common.api.f, android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions, boolean):com.google.android.gms.common.api.h");
    }

    /* renamed from: f */
    public static AbstractC5109i m42585f(AbstractC5106f abstractC5106f, Context context, boolean z10) {
        f35036a.m22869a("Revoking access", new Object[0]);
        String m42572e = C12830c.m42567b(context).m42572e();
        m42587h(context);
        return z10 ? RunnableC12833f.m42578a(m42572e) : abstractC5106f.mo12985b(new C12842o(abstractC5106f));
    }

    /* renamed from: g */
    public static AbstractC5109i m42586g(AbstractC5106f abstractC5106f, Context context, boolean z10) {
        f35036a.m22869a("Signing out", new Object[0]);
        m42587h(context);
        return z10 ? C5200j.m13211c(Status.f10400r, abstractC5106f) : abstractC5106f.mo12985b(new C12840m(abstractC5106f));
    }

    /* renamed from: h */
    private static void m42587h(Context context) {
        C12845r.m42588c(context).m42592d();
        Iterator<AbstractC5106f> it = AbstractC5106f.m12983c().iterator();
        while (it.hasNext()) {
            it.next().m12990h();
        }
        C5135g.m13036a();
    }
}
