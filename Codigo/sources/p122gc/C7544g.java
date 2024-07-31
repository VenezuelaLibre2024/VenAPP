package p122gc;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C5276s;

/* renamed from: gc.g */
/* loaded from: classes.dex */
public class C7544g {

    /* renamed from: a */
    private final SharedPreferences f17836a;

    public C7544g(Context context, String str) {
        C5276s.m13324j(context);
        C5276s.m13320f(str);
        this.f17836a = context.getSharedPreferences(String.format("com.google.firebase.appcheck.debug.store.%s", str), 0);
    }

    /* renamed from: a */
    public String m22901a() {
        return this.f17836a.getString("com.google.firebase.appcheck.debug.DEBUG_SECRET", null);
    }

    /* renamed from: b */
    public void m22902b(String str) {
        this.f17836a.edit().putString("com.google.firebase.appcheck.debug.DEBUG_SECRET", str).apply();
    }
}
