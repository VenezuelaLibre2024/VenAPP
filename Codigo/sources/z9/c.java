package z9;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c */
    private static final Lock f32470c = new ReentrantLock();

    /* renamed from: d */
    private static c f32471d;

    /* renamed from: a */
    private final Lock f32472a = new ReentrantLock();

    /* renamed from: b */
    private final SharedPreferences f32473b;

    c(Context context) {
        this.f32473b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static c b(Context context) {
        com.google.android.gms.common.internal.s.j(context);
        Lock lock = f32470c;
        lock.lock();
        try {
            if (f32471d == null) {
                f32471d = new c(context.getApplicationContext());
            }
            c cVar = f32471d;
            lock.unlock();
            return cVar;
        } catch (Throwable th2) {
            f32470c.unlock();
            throw th2;
        }
    }

    private static final String i(String str, String str2) {
        return str + ":" + str2;
    }

    public void a() {
        this.f32472a.lock();
        try {
            this.f32473b.edit().clear().apply();
        } finally {
            this.f32472a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String g10;
        String g11 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g11) || (g10 = g(i("googleSignInAccount", g11))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.D1(g10);
        } catch (JSONException unused) {
            return null;
        }
    }

    public GoogleSignInOptions d() {
        String g10;
        String g11 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g11) || (g10 = g(i("googleSignInOptions", g11))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.C1(g10);
        } catch (JSONException unused) {
            return null;
        }
    }

    public String e() {
        return g("refreshToken");
    }

    public void f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        com.google.android.gms.common.internal.s.j(googleSignInAccount);
        com.google.android.gms.common.internal.s.j(googleSignInOptions);
        h("defaultGoogleSignInAccount", googleSignInAccount.E1());
        com.google.android.gms.common.internal.s.j(googleSignInAccount);
        com.google.android.gms.common.internal.s.j(googleSignInOptions);
        String E1 = googleSignInAccount.E1();
        h(i("googleSignInAccount", E1), googleSignInAccount.F1());
        h(i("googleSignInOptions", E1), googleSignInOptions.G1());
    }

    protected final String g(String str) {
        this.f32472a.lock();
        try {
            return this.f32473b.getString(str, null);
        } finally {
            this.f32472a.unlock();
        }
    }

    protected final void h(String str, String str2) {
        this.f32472a.lock();
        try {
            this.f32473b.edit().putString(str, str2).apply();
        } finally {
            this.f32472a.unlock();
        }
    }
}
