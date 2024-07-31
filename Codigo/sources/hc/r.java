package hc;

import android.content.Context;
import android.content.SharedPreferences;
import pc.w;

/* loaded from: classes.dex */
public class r {

    /* renamed from: b, reason: collision with root package name */
    private static final ic.b f16702b = new ic.b(r.class.getSimpleName());

    /* renamed from: a, reason: collision with root package name */
    private w<SharedPreferences> f16703a;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16704a;

        static {
            int[] iArr = new int[b.values().length];
            f16704a = iArr;
            try {
                iArr[b.DEFAULT_APP_CHECK_TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16704a[b.UNKNOWN_APP_CHECK_TOKEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    enum b {
        DEFAULT_APP_CHECK_TOKEN,
        UNKNOWN_APP_CHECK_TOKEN
    }

    public r(final Context context, String str) {
        com.google.android.gms.common.internal.s.j(context);
        com.google.android.gms.common.internal.s.f(str);
        final String format = String.format("com.google.firebase.appcheck.store.%s", str);
        this.f16703a = new w<>(new ee.b() { // from class: hc.q
            @Override // ee.b
            public final Object get() {
                Object sharedPreferences;
                sharedPreferences = context.getSharedPreferences(format, 0);
                return sharedPreferences;
            }
        });
    }

    void b() {
        this.f16703a.get().edit().remove("com.google.firebase.appcheck.APP_CHECK_TOKEN").remove("com.google.firebase.appcheck.TOKEN_TYPE").apply();
    }

    public ec.c d() {
        String string = this.f16703a.get().getString("com.google.firebase.appcheck.TOKEN_TYPE", null);
        String string2 = this.f16703a.get().getString("com.google.firebase.appcheck.APP_CHECK_TOKEN", null);
        if (string != null && string2 != null) {
            try {
                int i10 = a.f16704a[b.valueOf(string).ordinal()];
                if (i10 == 1) {
                    return hc.b.e(string2);
                }
                if (i10 == 2) {
                    return hc.b.d(string2);
                }
                f16702b.d("Reached unreachable section in #retrieveAppCheckToken()");
                return null;
            } catch (IllegalArgumentException e10) {
                f16702b.d("Failed to parse TokenType of stored token  with type [" + string + "] with exception: " + e10.getMessage());
                b();
            }
        }
        return null;
    }

    public void e(ec.c cVar) {
        SharedPreferences.Editor putString;
        b bVar;
        if (cVar instanceof hc.b) {
            putString = this.f16703a.get().edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", ((hc.b) cVar).i());
            bVar = b.DEFAULT_APP_CHECK_TOKEN;
        } else {
            putString = this.f16703a.get().edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", cVar.b());
            bVar = b.UNKNOWN_APP_CHECK_TOKEN;
        }
        putString.putString("com.google.firebase.appcheck.TOKEN_TYPE", bVar.name()).apply();
    }
}
