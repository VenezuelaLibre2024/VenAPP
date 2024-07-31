package p152i4;

import android.content.SharedPreferences;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.json.JSONException;

/* renamed from: i4.j */
/* loaded from: classes.dex */
public final class C7808j {

    /* renamed from: b */
    public static final a f18687b = new a(null);

    /* renamed from: a */
    private final SharedPreferences f18688a;

    /* renamed from: i4.j$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7808j() {
        /*
            r3 = this;
            android.content.Context r0 = p152i4.C7799e0.m23860l()
            java.lang.String r1 = "com.facebook.AuthenticationTokenManager.SharedPreferences"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AuthenticationTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)"
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p152i4.C7808j.<init>():void");
    }

    public C7808j(SharedPreferences sharedPreferences) {
        C9322n.m27781e(sharedPreferences, "sharedPreferences");
        this.f18688a = sharedPreferences;
    }

    /* renamed from: a */
    public final void m24021a() {
        this.f18688a.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
    }

    /* renamed from: b */
    public final void m24022b(C7806i authenticationToken) {
        C9322n.m27781e(authenticationToken, "authenticationToken");
        try {
            this.f18688a.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", authenticationToken.m23920b().toString()).apply();
        } catch (JSONException unused) {
        }
    }
}
