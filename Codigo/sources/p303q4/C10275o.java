package p303q4;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import kotlin.jvm.internal.C9315g;
import p152i4.C7799e0;

/* renamed from: q4.o */
/* loaded from: classes.dex */
public final class C10275o {

    /* renamed from: c */
    public static final a f25519c = new a(null);

    /* renamed from: a */
    private final String f25520a;

    /* renamed from: b */
    private final boolean f25521b;

    /* renamed from: q4.o$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final void m30791a() {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C7799e0.m23860l()).edit();
            edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            edit.apply();
        }

        /* renamed from: b */
        public final C10275o m30792b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C7799e0.m23860l());
            C9315g c9315g = null;
            if (defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                return new C10275o(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), c9315g);
            }
            return null;
        }
    }

    private C10275o(String str, boolean z10) {
        this.f25520a = str;
        this.f25521b = z10;
    }

    public /* synthetic */ C10275o(String str, boolean z10, C9315g c9315g) {
        this(str, z10);
    }

    /* renamed from: a */
    public final void m30790a() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C7799e0.m23860l()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f25520a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f25521b);
        edit.apply();
    }

    public String toString() {
        String str = this.f25521b ? "Applink" : "Unclassified";
        if (this.f25520a == null) {
            return str;
        }
        return str + '(' + ((Object) this.f25520a) + ')';
    }
}
