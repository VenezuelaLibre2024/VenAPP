package gc;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.s;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f16199a;

    public g(Context context, String str) {
        s.j(context);
        s.f(str);
        this.f16199a = context.getSharedPreferences(String.format("com.google.firebase.appcheck.debug.store.%s", str), 0);
    }

    public String a() {
        return this.f16199a.getString("com.google.firebase.appcheck.debug.DEBUG_SECRET", null);
    }

    public void b(String str) {
        this.f16199a.edit().putString("com.google.firebase.appcheck.debug.DEBUG_SECRET", str).apply();
    }
}
