package p138hc;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C5276s;
import ec.AbstractC7173c;
import ee.InterfaceC7183b;
import p160ic.C7958b;
import p294pc.C10156w;

/* renamed from: hc.r */
/* loaded from: classes.dex */
public class C7711r {

    /* renamed from: b */
    private static final C7958b f18352b = new C7958b(C7711r.class.getSimpleName());

    /* renamed from: a */
    private C10156w<SharedPreferences> f18353a;

    /* renamed from: hc.r$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18354a;

        static {
            int[] iArr = new int[b.values().length];
            f18354a = iArr;
            try {
                iArr[b.DEFAULT_APP_CHECK_TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18354a[b.UNKNOWN_APP_CHECK_TOKEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: hc.r$b */
    /* loaded from: classes.dex */
    enum b {
        DEFAULT_APP_CHECK_TOKEN,
        UNKNOWN_APP_CHECK_TOKEN
    }

    public C7711r(final Context context, String str) {
        C5276s.m13324j(context);
        C5276s.m13320f(str);
        final String format = String.format("com.google.firebase.appcheck.store.%s", str);
        this.f18353a = new C10156w<>(new InterfaceC7183b() { // from class: hc.q
            @Override // ee.InterfaceC7183b
            public final Object get() {
                Object sharedPreferences;
                sharedPreferences = context.getSharedPreferences(format, 0);
                return sharedPreferences;
            }
        });
    }

    /* renamed from: b */
    void m23487b() {
        this.f18353a.get().edit().remove("com.google.firebase.appcheck.APP_CHECK_TOKEN").remove("com.google.firebase.appcheck.TOKEN_TYPE").apply();
    }

    /* renamed from: d */
    public AbstractC7173c m23488d() {
        String string = this.f18353a.get().getString("com.google.firebase.appcheck.TOKEN_TYPE", null);
        String string2 = this.f18353a.get().getString("com.google.firebase.appcheck.APP_CHECK_TOKEN", null);
        if (string != null && string2 != null) {
            try {
                int i10 = a.f18354a[b.valueOf(string).ordinal()];
                if (i10 == 1) {
                    return C7695b.m23434e(string2);
                }
                if (i10 == 2) {
                    return C7695b.m23433d(string2);
                }
                f18352b.m24447d("Reached unreachable section in #retrieveAppCheckToken()");
                return null;
            } catch (IllegalArgumentException e10) {
                f18352b.m24447d("Failed to parse TokenType of stored token  with type [" + string + "] with exception: " + e10.getMessage());
                m23487b();
            }
        }
        return null;
    }

    /* renamed from: e */
    public void m23489e(AbstractC7173c abstractC7173c) {
        SharedPreferences.Editor putString;
        b bVar;
        if (abstractC7173c instanceof C7695b) {
            putString = this.f18353a.get().edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", ((C7695b) abstractC7173c).m23438i());
            bVar = b.DEFAULT_APP_CHECK_TOKEN;
        } else {
            putString = this.f18353a.get().edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", abstractC7173c.mo21368b());
            bVar = b.UNKNOWN_APP_CHECK_TOKEN;
        }
        putString.putString("com.google.firebase.appcheck.TOKEN_TYPE", bVar.name()).apply();
    }
}
