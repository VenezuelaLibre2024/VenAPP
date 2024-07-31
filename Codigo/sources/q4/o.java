package q4;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import i4.e0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final a f23551c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f23552a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f23553b;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a() {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(e0.l()).edit();
            edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            edit.apply();
        }

        public final o b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(e0.l());
            kotlin.jvm.internal.g gVar = null;
            if (defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                return new o(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), gVar);
            }
            return null;
        }
    }

    private o(String str, boolean z10) {
        this.f23552a = str;
        this.f23553b = z10;
    }

    public /* synthetic */ o(String str, boolean z10, kotlin.jvm.internal.g gVar) {
        this(str, z10);
    }

    public final void a() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(e0.l()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f23552a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f23553b);
        edit.apply();
    }

    public String toString() {
        String str = this.f23553b ? "Applink" : "Unclassified";
        if (this.f23552a == null) {
            return str;
        }
        return str + '(' + ((Object) this.f23552a) + ')';
    }
}
