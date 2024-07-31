package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C5224b;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Collections;
import java.util.HashSet;
import p462y9.C12654b;
import p484z9.C12844q;
import p484z9.C12845r;

/* renamed from: com.google.android.gms.auth.api.signin.a */
/* loaded from: classes.dex */
public final class C5093a {
    /* renamed from: a */
    public static C5094b m12947a(Context context, GoogleSignInOptions googleSignInOptions) {
        return new C5094b(context, (GoogleSignInOptions) C5276s.m13324j(googleSignInOptions));
    }

    /* renamed from: b */
    public static GoogleSignInAccount m12948b(Context context) {
        return C12845r.m42588c(context).m42590a();
    }

    /* renamed from: c */
    public static Task<GoogleSignInAccount> m12949c(Intent intent) {
        C12654b m42583d = C12844q.m42583d(intent);
        GoogleSignInAccount m41637a = m42583d.m41637a();
        return (!m42583d.getStatus().m12972y1() || m41637a == null) ? Tasks.forException(C5224b.m13226a(m42583d.getStatus())) : Tasks.forResult(m41637a);
    }

    /* renamed from: d */
    public static boolean m12950d(GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        if (googleSignInAccount == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, scopeArr);
        return googleSignInAccount.m12910w1().containsAll(hashSet);
    }

    /* renamed from: e */
    public static void m12951e(Activity activity, int i10, GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        C5276s.m13325k(activity, "Please provide a non-null Activity");
        C5276s.m13325k(scopeArr, "Please provide at least one scope");
        activity.startActivityForResult(m12952f(activity, googleSignInAccount, scopeArr), i10);
    }

    /* renamed from: f */
    private static Intent m12952f(Activity activity, GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        GoogleSignInOptions.C5092a c5092a = new GoogleSignInOptions.C5092a();
        if (scopeArr.length > 0) {
            c5092a.m12941f(scopeArr[0], scopeArr);
        }
        if (googleSignInAccount != null && !TextUtils.isEmpty(googleSignInAccount.m12906r())) {
            c5092a.m12943h((String) C5276s.m13324j(googleSignInAccount.m12906r()));
        }
        return new C5094b(activity, c5092a.m12936a()).m12954d();
    }
}
