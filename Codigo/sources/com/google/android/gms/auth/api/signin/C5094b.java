package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import ca.C1902f;
import ca.C1912k;
import com.google.android.gms.common.api.AbstractC5105e;
import com.google.android.gms.common.api.internal.C5111a;
import com.google.android.gms.common.api.internal.InterfaceC5182u;
import com.google.android.gms.common.internal.C5273r;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import p352s9.C10849a;
import p484z9.C12844q;

/* renamed from: com.google.android.gms.auth.api.signin.b */
/* loaded from: classes.dex */
public class C5094b extends AbstractC5105e<GoogleSignInOptions> {

    /* renamed from: a */
    private static final C5098f f10384a = new C5098f(null);

    /* renamed from: b */
    static int f10385b = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5094b(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, C10849a.f27520c, googleSignInOptions, (InterfaceC5182u) new C5111a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5094b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, C10849a.f27520c, googleSignInOptions, new AbstractC5105e.a.C13182a().m12982c(new C5111a()).m12980a());
    }

    /* renamed from: g */
    private final synchronized int m12953g() {
        int i10;
        i10 = f10385b;
        if (i10 == 1) {
            Context applicationContext = getApplicationContext();
            C1902f m10067n = C1902f.m10067n();
            int mo10072h = m10067n.mo10072h(applicationContext, C1912k.f7932a);
            if (mo10072h == 0) {
                i10 = 4;
                f10385b = 4;
            } else if (m10067n.mo10068b(applicationContext, mo10072h, null) != null || DynamiteModule.m13416a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                i10 = 2;
                f10385b = 2;
            } else {
                i10 = 3;
                f10385b = 3;
            }
        }
        return i10;
    }

    /* renamed from: d */
    public Intent m12954d() {
        Context applicationContext = getApplicationContext();
        int m12953g = m12953g();
        int i10 = m12953g - 1;
        if (m12953g != 0) {
            return i10 != 2 ? i10 != 3 ? C12844q.m42581b(applicationContext, getApiOptions()) : C12844q.m42582c(applicationContext, getApiOptions()) : C12844q.m42580a(applicationContext, getApiOptions());
        }
        throw null;
    }

    /* renamed from: e */
    public Task<Void> m12955e() {
        return C5273r.m13313c(C12844q.m42585f(asGoogleApiClient(), getApplicationContext(), m12953g() == 3));
    }

    /* renamed from: f */
    public Task<GoogleSignInAccount> m12956f() {
        return C5273r.m13312b(C12844q.m42584e(asGoogleApiClient(), getApplicationContext(), getApiOptions(), m12953g() == 3), f10384a);
    }

    public Task<Void> signOut() {
        return C5273r.m13313c(C12844q.m42586g(asGoogleApiClient(), getApplicationContext(), m12953g() == 3));
    }
}
