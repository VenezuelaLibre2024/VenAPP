package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.appevents.C4586l0;
import com.facebook.internal.C4633n;
import com.facebook.internal.C4634n0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugins.firebase.auth.Constants;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9322n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p007a5.C0033a;
import p152i4.C7787a;
import p152i4.C7799e0;
import p152i4.C7807i0;
import p152i4.C7817n0;
import p152i4.C7824r;
import p152i4.EnumC7819o0;
import p450xk.C12512d;
import p450xk.C12514f;
import p450xk.C12524p;
import p450xk.C12525q;

/* renamed from: com.facebook.internal.n0 */
/* loaded from: classes.dex */
public final class C4634n0 {

    /* renamed from: b */
    private static int f8761b;

    /* renamed from: j */
    private static Locale f8769j;

    /* renamed from: a */
    public static final C4634n0 f8760a = new C4634n0();

    /* renamed from: c */
    private static long f8762c = -1;

    /* renamed from: d */
    private static long f8763d = -1;

    /* renamed from: e */
    private static long f8764e = -1;

    /* renamed from: f */
    private static String f8765f = "";

    /* renamed from: g */
    private static String f8766g = "";

    /* renamed from: h */
    private static String f8767h = "NoCarrier";

    /* renamed from: i */
    private static String f8768i = "";

    /* renamed from: com.facebook.internal.n0$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo11348a(C7824r c7824r);

        /* renamed from: b */
        void mo11349b(JSONObject jSONObject);
    }

    private C4634n0() {
    }

    /* renamed from: A */
    public static final long m11261A(Uri contentUri) {
        C9322n.m27781e(contentUri, "contentUri");
        Cursor cursor = null;
        try {
            cursor = C7799e0.m23860l().getContentResolver().query(contentUri, null, null, null, null);
            if (cursor == null) {
                return 0L;
            }
            int columnIndex = cursor.getColumnIndex("_size");
            cursor.moveToFirst();
            long j10 = cursor.getLong(columnIndex);
            cursor.close();
            return j10;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* renamed from: A0 */
    private final void m11262A0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            C9322n.m27780d(displayName, "tz.getDisplayName(tz.inDaylightTime(Date()), TimeZone.SHORT)");
            f8765f = displayName;
            String id2 = timeZone.getID();
            C9322n.m27780d(id2, "tz.id");
            f8766g = id2;
        } catch (AssertionError | Exception unused) {
        }
    }

    /* renamed from: B */
    public static final Locale m11263B() {
        Locale m11282O = m11282O();
        if (m11282O != null) {
            return m11282O;
        }
        Locale locale = Locale.getDefault();
        C9322n.m27780d(locale, "getDefault()");
        return locale;
    }

    /* renamed from: B0 */
    private final void m11264B0() {
        try {
            if (m11329s()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f8763d = statFs.getBlockCount() * statFs.getBlockSize();
            }
            f8763d = m11315l(f8763d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: C */
    private final String m11265C() {
        C7787a m23782e = C7787a.f18552w.m23782e();
        return (m23782e == null || m23782e.m23766i() == null) ? "facebook" : m23782e.m23766i();
    }

    /* renamed from: C0 */
    public static final void m11266C0(Runnable runnable) {
        try {
            C7799e0.m23868t().execute(runnable);
        } catch (Exception unused) {
        }
    }

    /* renamed from: D */
    public static final JSONObject m11267D() {
        if (C0033a.m107d(C4634n0.class)) {
            return null;
        }
        try {
            String string = C7799e0.m23860l().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4634n0.class);
            return null;
        }
    }

    /* renamed from: D0 */
    public static final void m11268D0(JSONObject params, C4607a c4607a, String str, boolean z10, Context context) {
        C9322n.m27781e(params, "params");
        C9322n.m27781e(context, "context");
        C4633n c4633n = C4633n.f8754a;
        C4633n.b bVar = C4633n.b.ServiceUpdateCompliance;
        if (!C4633n.m11254g(bVar)) {
            params.put("anon_id", str);
        }
        params.put("application_tracking_enabled", !z10);
        params.put("advertiser_id_collection_enabled", C7799e0.m23859k());
        if (c4607a != null) {
            if (C4633n.m11254g(bVar)) {
                f8760a.m11297c(params, c4607a, str, context);
            }
            if (c4607a.m11106j() != null) {
                if (C4633n.m11254g(bVar)) {
                    f8760a.m11299d(params, c4607a, context);
                } else {
                    params.put("attribution", c4607a.m11106j());
                }
            }
            if (c4607a.m11104h() != null) {
                params.put("advertiser_id", c4607a.m11104h());
                params.put("advertiser_tracking_enabled", !c4607a.m11107k());
            }
            if (!c4607a.m11107k()) {
                String m11017b = C4586l0.m11017b();
                if (!(m11017b.length() == 0)) {
                    params.put("ud", m11017b);
                }
            }
            if (c4607a.m11105i() != null) {
                params.put("installer_package", c4607a.m11105i());
            }
        }
    }

    /* renamed from: E0 */
    public static final void m11269E0(JSONObject params, Context appContext) {
        Locale locale;
        String language;
        int i10;
        Display display;
        String country;
        PackageInfo packageInfo;
        C9322n.m27781e(params, "params");
        C9322n.m27781e(appContext, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        f8760a.m11342z0(appContext);
        String packageName = appContext.getPackageName();
        int i11 = 0;
        int i12 = -1;
        try {
            packageInfo = appContext.getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo == null) {
            return;
        }
        i12 = packageInfo.versionCode;
        f8768i = packageInfo.versionName;
        jSONArray.put(packageName);
        jSONArray.put(i12);
        jSONArray.put(f8768i);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = appContext.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        f8769j = locale;
        StringBuilder sb2 = new StringBuilder();
        Locale locale2 = f8769j;
        String str = "";
        if (locale2 == null || (language = locale2.getLanguage()) == null) {
            language = "";
        }
        sb2.append(language);
        sb2.append('_');
        Locale locale3 = f8769j;
        if (locale3 != null && (country = locale3.getCountry()) != null) {
            str = country;
        }
        sb2.append(str);
        jSONArray.put(sb2.toString());
        jSONArray.put(f8765f);
        jSONArray.put(f8767h);
        double d10 = 0.0d;
        try {
            Object systemService = appContext.getSystemService("display");
            display = null;
            DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
            if (displayManager != null) {
                display = displayManager.getDisplay(0);
            }
        } catch (Exception unused3) {
        }
        if (display != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getMetrics(displayMetrics);
            int i13 = displayMetrics.widthPixels;
            try {
                i11 = displayMetrics.heightPixels;
                d10 = displayMetrics.density;
            } catch (Exception unused4) {
            }
            i10 = i11;
            i11 = i13;
            jSONArray.put(i11);
            jSONArray.put(i10);
            jSONArray.put(new DecimalFormat("#.##").format(d10));
            jSONArray.put(f8760a.m11338w0());
            jSONArray.put(f8763d);
            jSONArray.put(f8764e);
            jSONArray.put(f8766g);
            params.put("extinfo", jSONArray.toString());
        }
        i10 = 0;
        jSONArray.put(i11);
        jSONArray.put(i10);
        jSONArray.put(new DecimalFormat("#.##").format(d10));
        jSONArray.put(f8760a.m11338w0());
        jSONArray.put(f8763d);
        jSONArray.put(f8764e);
        jSONArray.put(f8766g);
        params.put("extinfo", jSONArray.toString());
    }

    /* renamed from: F */
    public static final String m11270F(String str) {
        String str2;
        String str3;
        String m41027A;
        String m23869u = C7799e0.m23869u();
        if (str == null) {
            return m23869u;
        }
        if (C9322n.m27777a(str, "gaming")) {
            str2 = Constants.SIGN_IN_METHOD_FACEBOOK;
            str3 = "fb.gg";
        } else {
            if (!C9322n.m27777a(str, "instagram")) {
                return m23869u;
            }
            str2 = Constants.SIGN_IN_METHOD_FACEBOOK;
            str3 = "instagram.com";
        }
        m41027A = C12524p.m41027A(m23869u, str2, str3, false, 4, null);
        return m41027A;
    }

    /* renamed from: F0 */
    public static final String m11271F0(byte[] bytes) {
        C9322n.m27781e(bytes, "bytes");
        return f8760a.m11286T("SHA-1", bytes);
    }

    /* renamed from: G */
    private final C7807i0 m11272G(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", m11281N(m11265C()));
        bundle.putString("access_token", str);
        C7807i0 m24002y = C7807i0.f18658n.m24002y(null, null);
        m24002y.m23947H(bundle);
        m24002y.m23946G(EnumC7819o0.GET);
        return m24002y;
    }

    /* renamed from: G0 */
    public static final String m11273G0(String str) {
        if (str == null) {
            return null;
        }
        return f8760a.m11285S("SHA-256", str);
    }

    /* renamed from: H */
    public static final void m11274H(final String accessToken, final a callback) {
        C9322n.m27781e(accessToken, "accessToken");
        C9322n.m27781e(callback, "callback");
        JSONObject m11208a = C4620g0.m11208a(accessToken);
        if (m11208a != null) {
            callback.mo11349b(m11208a);
            return;
        }
        C7807i0.b bVar = new C7807i0.b() { // from class: com.facebook.internal.l0
            @Override // p152i4.C7807i0.b
            /* renamed from: b */
            public final void mo9121b(C7817n0 c7817n0) {
                C4634n0.m11276I(C4634n0.a.this, accessToken, c7817n0);
            }
        };
        C7807i0 m11272G = f8760a.m11272G(accessToken);
        m11272G.m23943D(bVar);
        m11272G.m23950l();
    }

    /* renamed from: H0 */
    public static final void m11275H0(Parcel parcel, Map<String, String> map) {
        C9322n.m27781e(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static final void m11276I(a callback, String accessToken, C7817n0 response) {
        C9322n.m27781e(callback, "$callback");
        C9322n.m27781e(accessToken, "$accessToken");
        C9322n.m27781e(response, "response");
        if (response.m24061b() != null) {
            callback.mo11348a(response.m24061b().m24102e());
            return;
        }
        C4620g0 c4620g0 = C4620g0.f8730a;
        JSONObject m24063d = response.m24063d();
        if (m24063d == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        C4620g0.m11209b(accessToken, m24063d);
        callback.mo11349b(response.m24063d());
    }

    /* renamed from: I0 */
    public static final void m11277I0(Parcel parcel, Map<String, String> map) {
        C9322n.m27781e(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    /* renamed from: K */
    public static final String m11278K(Context context) {
        C4636o0.m11359j(context, "context");
        return C7799e0.m23861m();
    }

    /* renamed from: L */
    public static final Method m11279L(Class<?> clazz, String methodName, Class<?>... parameterTypes) {
        C9322n.m27781e(clazz, "clazz");
        C9322n.m27781e(methodName, "methodName");
        C9322n.m27781e(parameterTypes, "parameterTypes");
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: M */
    public static final Method m11280M(String className, String methodName, Class<?>... parameterTypes) {
        C9322n.m27781e(className, "className");
        C9322n.m27781e(methodName, "methodName");
        C9322n.m27781e(parameterTypes, "parameterTypes");
        try {
            Class<?> clazz = Class.forName(className);
            C9322n.m27780d(clazz, "clazz");
            return m11279L(clazz, methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: N */
    private final String m11281N(String str) {
        return C9322n.m27777a(str, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name";
    }

    /* renamed from: O */
    public static final Locale m11282O() {
        try {
            return C7799e0.m23860l().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: P */
    public static final Object m11283P(JSONObject jsonObject, String str, String str2) {
        C9322n.m27781e(jsonObject, "jsonObject");
        Object opt = jsonObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 == null) {
            throw new C7824r("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(str2, opt);
        return jSONObject;
    }

    /* renamed from: R */
    private final String m11284R(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb2 = new StringBuilder();
        C9322n.m27780d(digest, "digest");
        int length = digest.length;
        int i10 = 0;
        while (i10 < length) {
            byte b10 = digest[i10];
            i10++;
            sb2.append(Integer.toHexString((b10 >> 4) & 15));
            sb2.append(Integer.toHexString((b10 >> 0) & 15));
        }
        String sb3 = sb2.toString();
        C9322n.m27780d(sb3, "builder.toString()");
        return sb3;
    }

    /* renamed from: S */
    private final String m11285S(String str, String str2) {
        Charset charset = C12512d.f33913b;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = str2.getBytes(charset);
        C9322n.m27780d(bytes, "(this as java.lang.String).getBytes(charset)");
        return m11286T(str, bytes);
    }

    /* renamed from: T */
    private final String m11286T(String str, byte[] bArr) {
        try {
            MessageDigest hash = MessageDigest.getInstance(str);
            C9322n.m27780d(hash, "hash");
            return m11284R(hash, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: U */
    public static final Object m11287U(Object obj, Method method, Object... args) {
        C9322n.m27781e(method, "method");
        C9322n.m27781e(args, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: V */
    public static final boolean m11288V() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            C9308a0 c9308a0 = C9308a0.f22565a;
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{C7799e0.m23861m()}, 1));
            C9322n.m27780d(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            Context m23860l = C7799e0.m23860l();
            PackageManager packageManager = m23860l.getPackageManager();
            String packageName = m23860l.getPackageName();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            C9322n.m27780d(queryIntentActivities, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                if (C9322n.m27777a(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: W */
    public static final boolean m11289W(Context context) {
        AutofillManager autofillManager;
        boolean isAutofillSupported;
        boolean isEnabled;
        C9322n.m27781e(context, "context");
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) == null) {
            return false;
        }
        isAutofillSupported = autofillManager.isAutofillSupported();
        if (!isAutofillSupported) {
            return false;
        }
        isEnabled = autofillManager.isEnabled();
        return isEnabled;
    }

    /* renamed from: X */
    public static final boolean m11290X(Context context) {
        C9322n.m27781e(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String DEVICE = Build.DEVICE;
        if (DEVICE != null) {
            C9322n.m27780d(DEVICE, "DEVICE");
            if (new C12514f(".+_cheets|cheets_.+").m40969a(DEVICE)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Y */
    public static final boolean m11291Y(Uri uri) {
        boolean m41037r;
        if (uri != null) {
            m41037r = C12524p.m41037r("content", uri.getScheme(), true);
            if (m41037r) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Z */
    public static final boolean m11292Z(C7787a c7787a) {
        return c7787a != null && C9322n.m27777a(c7787a, C7787a.f18552w.m23782e());
    }

    /* renamed from: a0 */
    public static final boolean m11294a0() {
        if (C0033a.m107d(C4634n0.class)) {
            return false;
        }
        try {
            JSONObject m11267D = m11267D();
            if (m11267D == null) {
                return false;
            }
            try {
                JSONArray jSONArray = m11267D.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                if (length > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        String string = jSONArray.getString(i10);
                        C9322n.m27780d(string, "options.getString(i)");
                        String lowerCase = string.toLowerCase();
                        C9322n.m27780d(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (C9322n.m27777a(lowerCase, "ldu")) {
                            return true;
                        }
                        if (i11 >= length) {
                            break;
                        }
                        i10 = i11;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C4634n0.class);
            return false;
        }
    }

    /* renamed from: b0 */
    public static final boolean m11296b0(Uri uri) {
        boolean m41037r;
        if (uri != null) {
            m41037r = C12524p.m41037r(io.flutter.plugins.firebase.crashlytics.Constants.FILE, uri.getScheme(), true);
            if (m41037r) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final void m11297c(JSONObject jSONObject, C4607a c4607a, String str, Context context) {
        if (Build.VERSION.SDK_INT >= 31 && m11298c0(context) && c4607a.m11107k()) {
            return;
        }
        jSONObject.put("anon_id", str);
    }

    /* renamed from: c0 */
    private final boolean m11298c0(Context context) {
        Method m11280M = m11280M("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (m11280M == null) {
            return false;
        }
        Object m11287U = m11287U(null, m11280M, context);
        return (m11287U instanceof Integer) && C9322n.m27777a(m11287U, 0);
    }

    /* renamed from: d */
    private final void m11299d(JSONObject jSONObject, C4607a c4607a, Context context) {
        if (Build.VERSION.SDK_INT >= 31 && m11298c0(context) && c4607a.m11107k()) {
            return;
        }
        jSONObject.put("attribution", c4607a.m11106j());
    }

    /* renamed from: d0 */
    public static final boolean m11300d0(String str) {
        if (str != null) {
            return str.length() == 0;
        }
        return true;
    }

    /* renamed from: e */
    public static final <T> boolean m11301e(T t10, T t11) {
        return t10 == null ? t11 == null : C9322n.m27777a(t10, t11);
    }

    /* renamed from: e0 */
    public static final boolean m11302e0(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    /* renamed from: f */
    public static final JSONObject m11303f(String accessToken) {
        C9322n.m27781e(accessToken, "accessToken");
        JSONObject m11208a = C4620g0.m11208a(accessToken);
        if (m11208a != null) {
            return m11208a;
        }
        C7817n0 m23949k = f8760a.m11272G(accessToken).m23949k();
        if (m23949k.m24061b() != null) {
            return null;
        }
        return m23949k.m24063d();
    }

    /* renamed from: f0 */
    public static final boolean m11304f0(Uri uri) {
        boolean m41037r;
        boolean m41037r2;
        boolean m41037r3;
        if (uri != null) {
            m41037r = C12524p.m41037r("http", uri.getScheme(), true);
            if (m41037r) {
                return true;
            }
            m41037r2 = C12524p.m41037r("https", uri.getScheme(), true);
            if (m41037r2) {
                return true;
            }
            m41037r3 = C12524p.m41037r("fbstaging", uri.getScheme(), true);
            if (m41037r3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static final Uri m11305g(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        C9322n.m27780d(build, "builder.build()");
        return build;
    }

    /* renamed from: g0 */
    public static final Set<String> m11306g0(JSONArray jsonArray) {
        C9322n.m27781e(jsonArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jsonArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                String string = jsonArray.getString(i10);
                C9322n.m27780d(string, "jsonArray.getString(i)");
                hashSet.add(string);
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return hashSet;
    }

    /* renamed from: h */
    private final void m11307h(Context context, String str) {
        List m41098u0;
        List m41098u02;
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        m41098u0 = C12525q.m41098u0(cookie, new String[]{";"}, false, 0, 6, null);
        Object[] array = m41098u0.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str2 = strArr[i10];
            i10++;
            m41098u02 = C12525q.m41098u0(str2, new String[]{"="}, false, 0, 6, null);
            Object[] array2 = m41098u02.toArray(new String[0]);
            if (array2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr2 = (String[]) array2;
            if (strArr2.length > 0) {
                String str3 = strArr2[0];
                int length2 = str3.length() - 1;
                int i11 = 0;
                boolean z10 = false;
                while (i11 <= length2) {
                    boolean z11 = C9322n.m27782f(str3.charAt(!z10 ? i11 : length2), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z11) {
                        i11++;
                    } else {
                        z10 = true;
                    }
                }
                cookieManager.setCookie(str, C9322n.m27787k(str3.subSequence(i11, length2 + 1).toString(), "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
            }
        }
        cookieManager.removeExpiredCookie();
    }

    /* renamed from: h0 */
    public static final List<String> m11308h0(JSONArray jsonArray) {
        C9322n.m27781e(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                arrayList.add(jsonArray.getString(i10));
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public static final void m11309i(Context context) {
        C9322n.m27781e(context, "context");
        try {
            C4634n0 c4634n0 = f8760a;
            c4634n0.m11307h(context, Constants.SIGN_IN_METHOD_FACEBOOK);
            c4634n0.m11307h(context, ".facebook.com");
            c4634n0.m11307h(context, "https://facebook.com");
            c4634n0.m11307h(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    /* renamed from: i0 */
    public static final Map<String, String> m11310i0(String str) {
        C9322n.m27781e(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                C9322n.m27780d(key, "key");
                String string = jSONObject.getString(key);
                C9322n.m27780d(string, "jsonObject.getString(key)");
                hashMap.put(key, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* renamed from: j */
    public static final void m11311j(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: j0 */
    public static final void m11312j0(String str, Exception exc) {
        if (!C7799e0.m23831D() || str == null || exc == null) {
            return;
        }
        Log.d(str, exc.getClass().getSimpleName() + ": " + ((Object) exc.getMessage()));
    }

    /* renamed from: k */
    public static final String m11313k(String str, String str2) {
        return m11300d0(str) ? str2 : str;
    }

    /* renamed from: k0 */
    public static final void m11314k0(String str, String str2) {
        if (!C7799e0.m23831D() || str == null || str2 == null) {
            return;
        }
        Log.d(str, str2);
    }

    /* renamed from: l */
    private final long m11315l(double d10) {
        return Math.round(d10 / 1.073741824E9d);
    }

    /* renamed from: l0 */
    public static final void m11316l0(String str, String str2, Throwable th2) {
        if (!C7799e0.m23831D() || m11300d0(str)) {
            return;
        }
        Log.d(str, str2, th2);
    }

    /* renamed from: m */
    public static final HashSet<String> m11317m(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet<String> hashSet = new HashSet<>();
        int length = jSONArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                String string = jSONArray.getString(i10);
                C9322n.m27780d(string, "jsonArray.getString(i)");
                hashSet.add(string);
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return hashSet;
    }

    /* renamed from: m0 */
    public static final String m11318m0(Map<String, String> map) {
        C9322n.m27781e(map, "map");
        String str = "";
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                str = jSONObject.toString();
            } catch (JSONException unused) {
            }
            C9322n.m27780d(str, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        }
        return str;
    }

    /* renamed from: n */
    public static final List<String> m11319n(JSONArray jsonArray) {
        C9322n.m27781e(jsonArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            if (length <= 0) {
                return arrayList;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                String string = jsonArray.getString(i10);
                C9322n.m27780d(string, "jsonArray.getString(i)");
                arrayList.add(string);
                if (i11 >= length) {
                    return arrayList;
                }
                i10 = i11;
            }
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    /* renamed from: n0 */
    public static final String m11320n0(String key) {
        C9322n.m27781e(key, "key");
        return f8760a.m11285S("MD5", key);
    }

    /* renamed from: o */
    public static final Map<String, Object> m11321o(JSONObject jsonObject) {
        int length;
        C9322n.m27781e(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jsonObject.names();
        if (names != null && (length = names.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                try {
                    String string = names.getString(i10);
                    C9322n.m27780d(string, "keys.getString(i)");
                    Object value = jsonObject.get(string);
                    if (value instanceof JSONObject) {
                        value = m11321o((JSONObject) value);
                    }
                    C9322n.m27780d(value, "value");
                    hashMap.put(string, value);
                } catch (JSONException unused) {
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return hashMap;
    }

    /* renamed from: o0 */
    public static final boolean m11322o0(Context context) {
        C9322n.m27781e(context, "context");
        return m11289W(context);
    }

    /* renamed from: p */
    public static final Map<String, String> m11323p(JSONObject jsonObject) {
        C9322n.m27781e(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            String optString = jsonObject.optString(key);
            if (optString != null) {
                C9322n.m27780d(key, "key");
                hashMap.put(key, optString);
            }
        }
        return hashMap;
    }

    /* renamed from: p0 */
    public static final Bundle m11324p0(String str) {
        List m41098u0;
        List m41098u02;
        Bundle bundle = new Bundle();
        if (!m11300d0(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            m41098u0 = C12525q.m41098u0(str, new String[]{"&"}, false, 0, 6, null);
            Object[] array = m41098u0.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str2 = strArr[i10];
                i10++;
                m41098u02 = C12525q.m41098u0(str2, new String[]{"="}, false, 0, 6, null);
                Object[] array2 = m41098u02.toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr2 = (String[]) array2;
                try {
                    if (strArr2.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), URLDecoder.decode(strArr2[1], "UTF-8"));
                    } else if (strArr2.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException e10) {
                    m11312j0("FacebookSDK", e10);
                }
            }
        }
        return bundle;
    }

    /* renamed from: q */
    public static final int m11325q(InputStream inputStream, OutputStream outputStream) {
        BufferedInputStream bufferedInputStream;
        C9322n.m27781e(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr = new byte[8192];
            int i10 = 0;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
                i10 += read;
            }
            bufferedInputStream.close();
            if (inputStream != null) {
                inputStream.close();
            }
            return i10;
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: q0 */
    public static final boolean m11326q0(Bundle bundle, String str, Object obj) {
        String jSONObject;
        C9322n.m27781e(bundle, "bundle");
        if (obj == null) {
            bundle.remove(str);
            return true;
        }
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        }
        if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
            return true;
        }
        if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
            return true;
        }
        if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
            return true;
        }
        if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        }
        if (obj instanceof String) {
            jSONObject = (String) obj;
        } else if (obj instanceof JSONArray) {
            jSONObject = ((JSONArray) obj).toString();
        } else {
            if (!(obj instanceof JSONObject)) {
                return false;
            }
            jSONObject = ((JSONObject) obj).toString();
        }
        bundle.putString(str, jSONObject);
        return true;
    }

    /* renamed from: r */
    public static final void m11327r(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    /* renamed from: r0 */
    public static final void m11328r0(Bundle b10, String str, String str2) {
        C9322n.m27781e(b10, "b");
        if (m11300d0(str2)) {
            return;
        }
        b10.putString(str, str2);
    }

    /* renamed from: s */
    private final boolean m11329s() {
        return C9322n.m27777a("mounted", Environment.getExternalStorageState());
    }

    /* renamed from: s0 */
    public static final Map<String, String> m11330s0(Parcel parcel) {
        C9322n.m27781e(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (readInt > 0) {
            int i10 = 0;
            do {
                i10++;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (readString != null && readString2 != null) {
                    hashMap.put(readString, readString2);
                }
            } while (i10 < readInt);
        }
        return hashMap;
    }

    /* renamed from: t */
    public static final String m11331t(int i10) {
        String bigInteger = new BigInteger(i10 * 5, new Random()).toString(32);
        C9322n.m27780d(bigInteger, "BigInteger(length * 5, r).toString(32)");
        return bigInteger;
    }

    /* renamed from: t0 */
    public static final String m11332t0(InputStream inputStream) {
        BufferedInputStream bufferedInputStream;
        Throwable th2;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
            } catch (Throwable th3) {
                th2 = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th2 = th4;
            inputStreamReader = null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            char[] cArr = new char[RecognitionOptions.PDF417];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    String sb3 = sb2.toString();
                    C9322n.m27780d(sb3, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                    m11311j(bufferedInputStream);
                    m11311j(inputStreamReader);
                    return sb3;
                }
                sb2.append(cArr, 0, read);
            }
        } catch (Throwable th5) {
            th2 = th5;
            m11311j(bufferedInputStream);
            m11311j(inputStreamReader);
            throw th2;
        }
    }

    /* renamed from: u */
    public static final String m11333u(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        C9322n.m27780d(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    /* renamed from: u0 */
    public static final Map<String, String> m11334u0(Parcel parcel) {
        C9322n.m27781e(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (readInt > 0) {
            int i10 = 0;
            do {
                i10++;
                hashMap.put(parcel.readString(), parcel.readString());
            } while (i10 < readInt);
        }
        return hashMap;
    }

    /* renamed from: v */
    public static final String m11335v(Context context) {
        String string;
        C9322n.m27781e(context, "context");
        try {
            String m23862n = C7799e0.m23862n();
            if (m23862n != null) {
                return m23862n;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i10);
                C9322n.m27780d(string, "context.getString(stringId)");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: v0 */
    private final void m11336v0() {
        try {
            if (m11329s()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f8764e = statFs.getAvailableBlocks() * statFs.getBlockSize();
            }
            f8764e = m11315l(f8764e);
        } catch (Exception unused) {
        }
    }

    /* renamed from: w */
    public static final String m11337w() {
        Context m23860l = C7799e0.m23860l();
        if (m23860l == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = m23860l.getPackageManager().getPackageInfo(m23860l.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: w0 */
    private final int m11338w0() {
        int i10 = f8761b;
        if (i10 > 0) {
            return i10;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() { // from class: com.facebook.internal.m0
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    boolean m11339x0;
                    m11339x0 = C4634n0.m11339x0(file, str);
                    return m11339x0;
                }
            });
            if (listFiles != null) {
                f8761b = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f8761b <= 0) {
            f8761b = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f8761b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public static final boolean m11339x0(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }

    /* renamed from: y */
    public static final Date m11340y(Bundle bundle, String str, Date dateBase) {
        long parseLong;
        C9322n.m27781e(dateBase, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (!(obj instanceof Long)) {
            if (obj instanceof String) {
                try {
                    parseLong = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        parseLong = ((Number) obj).longValue();
        return parseLong == 0 ? new Date(Long.MAX_VALUE) : new Date(dateBase.getTime() + (parseLong * 1000));
    }

    /* renamed from: y0 */
    private final void m11341y0(Context context) {
        if (C9322n.m27777a(f8767h, "NoCarrier")) {
            try {
                Object systemService = context.getSystemService(Constants.SIGN_IN_METHOD_PHONE);
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                }
                String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                C9322n.m27780d(networkOperatorName, "telephonyManager.networkOperatorName");
                f8767h = networkOperatorName;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: z0 */
    private final void m11342z0(Context context) {
        if (f8762c == -1 || System.currentTimeMillis() - f8762c >= 1800000) {
            f8762c = System.currentTimeMillis();
            m11262A0();
            m11341y0(context);
            m11264B0();
            m11336v0();
        }
    }

    /* renamed from: E */
    public final String m11343E() {
        return f8766g;
    }

    /* renamed from: J */
    public final Locale m11344J() {
        return f8769j;
    }

    /* renamed from: Q */
    public final String m11345Q() {
        return f8768i;
    }

    /* renamed from: x */
    public final long m11346x() {
        return f8764e;
    }

    /* renamed from: z */
    public final String m11347z() {
        return f8767h;
    }
}
