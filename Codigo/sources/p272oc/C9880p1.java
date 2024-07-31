package p272oc;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import java.util.Iterator;

/* renamed from: oc.p1 */
/* loaded from: classes.dex */
public final class C9880p1 {

    /* renamed from: a */
    private static C9880p1 f24369a = new C9880p1();

    private C9880p1() {
    }

    /* renamed from: a */
    private static SharedPreferences m29576a(Context context, String str) {
        return context.getSharedPreferences(String.format("com.google.firebase.auth.internal.browserSignInSessionStore.%s", str), 0);
    }

    /* renamed from: c */
    public static C9880p1 m29577c() {
        return f24369a;
    }

    /* renamed from: f */
    private static void m29578f(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Iterator<String> it = sharedPreferences.getAll().keySet().iterator();
        while (it.hasNext()) {
            edit.remove(it.next());
        }
        edit.apply();
    }

    /* renamed from: b */
    public final synchronized C9877o1 m29579b(Context context, String str, String str2) {
        C5276s.m13320f(str);
        C5276s.m13320f(str2);
        SharedPreferences m29576a = m29576a(context, str);
        String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", str2);
        String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2);
        String format3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", str2);
        String format4 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2);
        String string = m29576a.getString(format, null);
        String string2 = m29576a.getString(format2, null);
        String string3 = m29576a.getString(format3, null);
        String string4 = m29576a.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
        String string5 = m29576a.getString(format4, null);
        SharedPreferences.Editor edit = m29576a.edit();
        edit.remove(format);
        edit.remove(format2);
        edit.remove(format3);
        edit.remove(format4);
        edit.apply();
        if (string == null || string2 == null || string3 == null) {
            return null;
        }
        return new C9877o1(string, string2, string3, string4, string5);
    }

    /* renamed from: d */
    public final synchronized void m29580d(Context context, String str, String str2, String str3, String str4) {
        C5276s.m13320f(str);
        C5276s.m13320f(str2);
        SharedPreferences m29576a = m29576a(context, str);
        m29578f(m29576a);
        SharedPreferences.Editor edit = m29576a.edit();
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2), str3);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2), str4);
        edit.apply();
    }

    /* renamed from: e */
    public final synchronized void m29581e(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C5276s.m13320f(str);
        C5276s.m13320f(str2);
        C5276s.m13320f(str3);
        C5276s.m13320f(str7);
        SharedPreferences m29576a = m29576a(context, str);
        m29578f(m29576a);
        SharedPreferences.Editor edit = m29576a.edit();
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", str2), str3);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2), str4);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", str2), str5);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2), str7);
        edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", str6);
        edit.apply();
    }

    /* renamed from: g */
    public final synchronized String m29582g(Context context, String str, String str2) {
        String string;
        String string2;
        C5276s.m13320f(str);
        C5276s.m13320f(str2);
        SharedPreferences m29576a = m29576a(context, str);
        String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2);
        string = m29576a.getString(format, null);
        String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2);
        string2 = m29576a.getString(format2, null);
        SharedPreferences.Editor edit = m29576a.edit();
        edit.remove(format);
        edit.remove(format2);
        edit.apply();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string2;
    }
}
