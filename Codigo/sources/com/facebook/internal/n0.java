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
import com.facebook.internal.n;
import com.facebook.internal.n0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i4.i0;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: b */
    private static int f7781b;

    /* renamed from: j */
    private static Locale f7789j;

    /* renamed from: a */
    public static final n0 f7780a = new n0();

    /* renamed from: c */
    private static long f7782c = -1;

    /* renamed from: d */
    private static long f7783d = -1;

    /* renamed from: e */
    private static long f7784e = -1;

    /* renamed from: f */
    private static String f7785f = "";

    /* renamed from: g */
    private static String f7786g = "";

    /* renamed from: h */
    private static String f7787h = "NoCarrier";

    /* renamed from: i */
    private static String f7788i = "";

    /* loaded from: classes.dex */
    public interface a {
        void a(i4.r rVar);

        void b(JSONObject jSONObject);
    }

    private n0() {
    }

    public static final long A(Uri contentUri) {
        kotlin.jvm.internal.n.e(contentUri, "contentUri");
        Cursor cursor = null;
        try {
            cursor = i4.e0.l().getContentResolver().query(contentUri, null, null, null, null);
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

    private final void A0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            kotlin.jvm.internal.n.d(displayName, "tz.getDisplayName(tz.inDaylightTime(Date()), TimeZone.SHORT)");
            f7785f = displayName;
            String id2 = timeZone.getID();
            kotlin.jvm.internal.n.d(id2, "tz.id");
            f7786g = id2;
        } catch (AssertionError | Exception unused) {
        }
    }

    public static final Locale B() {
        Locale O = O();
        if (O != null) {
            return O;
        }
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.n.d(locale, "getDefault()");
        return locale;
    }

    private final void B0() {
        try {
            if (s()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f7783d = statFs.getBlockCount() * statFs.getBlockSize();
            }
            f7783d = l(f7783d);
        } catch (Exception unused) {
        }
    }

    private final String C() {
        i4.a e10 = i4.a.f16899w.e();
        return (e10 == null || e10.i() == null) ? "facebook" : e10.i();
    }

    public static final void C0(Runnable runnable) {
        try {
            i4.e0.t().execute(runnable);
        } catch (Exception unused) {
        }
    }

    public static final JSONObject D() {
        if (a5.a.d(n0.class)) {
            return null;
        }
        try {
            String string = i4.e0.l().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            a5.a.b(th2, n0.class);
            return null;
        }
    }

    public static final void D0(JSONObject params, com.facebook.internal.a aVar, String str, boolean z10, Context context) {
        kotlin.jvm.internal.n.e(params, "params");
        kotlin.jvm.internal.n.e(context, "context");
        n nVar = n.f7774a;
        n.b bVar = n.b.ServiceUpdateCompliance;
        if (!n.g(bVar)) {
            params.put("anon_id", str);
        }
        params.put("application_tracking_enabled", !z10);
        params.put("advertiser_id_collection_enabled", i4.e0.k());
        if (aVar != null) {
            if (n.g(bVar)) {
                f7780a.c(params, aVar, str, context);
            }
            if (aVar.j() != null) {
                if (n.g(bVar)) {
                    f7780a.d(params, aVar, context);
                } else {
                    params.put("attribution", aVar.j());
                }
            }
            if (aVar.h() != null) {
                params.put("advertiser_id", aVar.h());
                params.put("advertiser_tracking_enabled", !aVar.k());
            }
            if (!aVar.k()) {
                String b10 = com.facebook.appevents.l0.b();
                if (!(b10.length() == 0)) {
                    params.put("ud", b10);
                }
            }
            if (aVar.i() != null) {
                params.put("installer_package", aVar.i());
            }
        }
    }

    public static final void E0(JSONObject params, Context appContext) {
        Locale locale;
        String language;
        int i10;
        Display display;
        String country;
        PackageInfo packageInfo;
        kotlin.jvm.internal.n.e(params, "params");
        kotlin.jvm.internal.n.e(appContext, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        f7780a.z0(appContext);
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
        f7788i = packageInfo.versionName;
        jSONArray.put(packageName);
        jSONArray.put(i12);
        jSONArray.put(f7788i);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = appContext.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        f7789j = locale;
        StringBuilder sb2 = new StringBuilder();
        Locale locale2 = f7789j;
        String str = "";
        if (locale2 == null || (language = locale2.getLanguage()) == null) {
            language = "";
        }
        sb2.append(language);
        sb2.append('_');
        Locale locale3 = f7789j;
        if (locale3 != null && (country = locale3.getCountry()) != null) {
            str = country;
        }
        sb2.append(str);
        jSONArray.put(sb2.toString());
        jSONArray.put(f7785f);
        jSONArray.put(f7787h);
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
            jSONArray.put(f7780a.w0());
            jSONArray.put(f7783d);
            jSONArray.put(f7784e);
            jSONArray.put(f7786g);
            params.put("extinfo", jSONArray.toString());
        }
        i10 = 0;
        jSONArray.put(i11);
        jSONArray.put(i10);
        jSONArray.put(new DecimalFormat("#.##").format(d10));
        jSONArray.put(f7780a.w0());
        jSONArray.put(f7783d);
        jSONArray.put(f7784e);
        jSONArray.put(f7786g);
        params.put("extinfo", jSONArray.toString());
    }

    public static final String F(String str) {
        String str2;
        String str3;
        String A;
        String u10 = i4.e0.u();
        if (str == null) {
            return u10;
        }
        if (kotlin.jvm.internal.n.a(str, "gaming")) {
            str2 = Constants.SIGN_IN_METHOD_FACEBOOK;
            str3 = "fb.gg";
        } else {
            if (!kotlin.jvm.internal.n.a(str, "instagram")) {
                return u10;
            }
            str2 = Constants.SIGN_IN_METHOD_FACEBOOK;
            str3 = "instagram.com";
        }
        A = xk.p.A(u10, str2, str3, false, 4, null);
        return A;
    }

    public static final String F0(byte[] bytes) {
        kotlin.jvm.internal.n.e(bytes, "bytes");
        return f7780a.T("SHA-1", bytes);
    }

    private final i4.i0 G(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", N(C()));
        bundle.putString("access_token", str);
        i4.i0 y10 = i4.i0.f17005n.y(null, null);
        y10.H(bundle);
        y10.G(i4.o0.GET);
        return y10;
    }

    public static final String G0(String str) {
        if (str == null) {
            return null;
        }
        return f7780a.S("SHA-256", str);
    }

    public static final void H(String accessToken, a callback) {
        kotlin.jvm.internal.n.e(accessToken, "accessToken");
        kotlin.jvm.internal.n.e(callback, "callback");
        JSONObject a10 = g0.a(accessToken);
        if (a10 != null) {
            callback.b(a10);
            return;
        }
        l0 l0Var = new i0.b() { // from class: com.facebook.internal.l0

            /* renamed from: b */
            public final /* synthetic */ String f7773b;

            public /* synthetic */ l0(String accessToken2) {
                r2 = accessToken2;
            }

            @Override // i4.i0.b
            public final void b(i4.n0 n0Var) {
                n0.I(n0.a.this, r2, n0Var);
            }
        };
        i4.i0 G = f7780a.G(accessToken2);
        G.D(l0Var);
        G.l();
    }

    public static final void H0(Parcel parcel, Map<String, String> map) {
        kotlin.jvm.internal.n.e(parcel, "parcel");
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

    public static final void I(a callback, String accessToken, i4.n0 response) {
        kotlin.jvm.internal.n.e(callback, "$callback");
        kotlin.jvm.internal.n.e(accessToken, "$accessToken");
        kotlin.jvm.internal.n.e(response, "response");
        if (response.b() != null) {
            callback.a(response.b().e());
            return;
        }
        g0 g0Var = g0.f7755a;
        JSONObject d10 = response.d();
        if (d10 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        g0.b(accessToken, d10);
        callback.b(response.d());
    }

    public static final void I0(Parcel parcel, Map<String, String> map) {
        kotlin.jvm.internal.n.e(parcel, "parcel");
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

    public static final String K(Context context) {
        o0.j(context, "context");
        return i4.e0.m();
    }

    public static final Method L(Class<?> clazz, String methodName, Class<?>... parameterTypes) {
        kotlin.jvm.internal.n.e(clazz, "clazz");
        kotlin.jvm.internal.n.e(methodName, "methodName");
        kotlin.jvm.internal.n.e(parameterTypes, "parameterTypes");
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method M(String className, String methodName, Class<?>... parameterTypes) {
        kotlin.jvm.internal.n.e(className, "className");
        kotlin.jvm.internal.n.e(methodName, "methodName");
        kotlin.jvm.internal.n.e(parameterTypes, "parameterTypes");
        try {
            Class<?> clazz = Class.forName(className);
            kotlin.jvm.internal.n.d(clazz, "clazz");
            return L(clazz, methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final String N(String str) {
        return kotlin.jvm.internal.n.a(str, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name";
    }

    public static final Locale O() {
        try {
            return i4.e0.l().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Object P(JSONObject jsonObject, String str, String str2) {
        kotlin.jvm.internal.n.e(jsonObject, "jsonObject");
        Object opt = jsonObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 == null) {
            throw new i4.r("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(str2, opt);
        return jSONObject;
    }

    private final String R(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb2 = new StringBuilder();
        kotlin.jvm.internal.n.d(digest, "digest");
        int length = digest.length;
        int i10 = 0;
        while (i10 < length) {
            byte b10 = digest[i10];
            i10++;
            sb2.append(Integer.toHexString((b10 >> 4) & 15));
            sb2.append(Integer.toHexString((b10 >> 0) & 15));
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.n.d(sb3, "builder.toString()");
        return sb3;
    }

    private final String S(String str, String str2) {
        Charset charset = xk.d.f31393b;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = str2.getBytes(charset);
        kotlin.jvm.internal.n.d(bytes, "(this as java.lang.String).getBytes(charset)");
        return T(str, bytes);
    }

    private final String T(String str, byte[] bArr) {
        try {
            MessageDigest hash = MessageDigest.getInstance(str);
            kotlin.jvm.internal.n.d(hash, "hash");
            return R(hash, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final Object U(Object obj, Method method, Object... args) {
        kotlin.jvm.internal.n.e(method, "method");
        kotlin.jvm.internal.n.e(args, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean V() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.a0.f20743a;
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{i4.e0.m()}, 1));
            kotlin.jvm.internal.n.d(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            Context l10 = i4.e0.l();
            PackageManager packageManager = l10.getPackageManager();
            String packageName = l10.getPackageName();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            kotlin.jvm.internal.n.d(queryIntentActivities, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.n.a(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final boolean W(Context context) {
        AutofillManager autofillManager;
        boolean isAutofillSupported;
        boolean isEnabled;
        kotlin.jvm.internal.n.e(context, "context");
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

    public static final boolean X(Context context) {
        kotlin.jvm.internal.n.e(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String DEVICE = Build.DEVICE;
        if (DEVICE != null) {
            kotlin.jvm.internal.n.d(DEVICE, "DEVICE");
            if (new xk.f(".+_cheets|cheets_.+").a(DEVICE)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean Y(Uri uri) {
        boolean r10;
        if (uri != null) {
            r10 = xk.p.r("content", uri.getScheme(), true);
            if (r10) {
                return true;
            }
        }
        return false;
    }

    public static final boolean Z(i4.a aVar) {
        return aVar != null && kotlin.jvm.internal.n.a(aVar, i4.a.f16899w.e());
    }

    public static final boolean a0() {
        if (a5.a.d(n0.class)) {
            return false;
        }
        try {
            JSONObject D = D();
            if (D == null) {
                return false;
            }
            try {
                JSONArray jSONArray = D.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                if (length > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        String string = jSONArray.getString(i10);
                        kotlin.jvm.internal.n.d(string, "options.getString(i)");
                        String lowerCase = string.toLowerCase();
                        kotlin.jvm.internal.n.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (kotlin.jvm.internal.n.a(lowerCase, "ldu")) {
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
            a5.a.b(th2, n0.class);
            return false;
        }
    }

    public static final boolean b0(Uri uri) {
        boolean r10;
        if (uri != null) {
            r10 = xk.p.r(io.flutter.plugins.firebase.crashlytics.Constants.FILE, uri.getScheme(), true);
            if (r10) {
                return true;
            }
        }
        return false;
    }

    private final void c(JSONObject jSONObject, com.facebook.internal.a aVar, String str, Context context) {
        if (Build.VERSION.SDK_INT >= 31 && c0(context) && aVar.k()) {
            return;
        }
        jSONObject.put("anon_id", str);
    }

    private final boolean c0(Context context) {
        Method M = M("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (M == null) {
            return false;
        }
        Object U = U(null, M, context);
        return (U instanceof Integer) && kotlin.jvm.internal.n.a(U, 0);
    }

    private final void d(JSONObject jSONObject, com.facebook.internal.a aVar, Context context) {
        if (Build.VERSION.SDK_INT >= 31 && c0(context) && aVar.k()) {
            return;
        }
        jSONObject.put("attribution", aVar.j());
    }

    public static final boolean d0(String str) {
        if (str != null) {
            return str.length() == 0;
        }
        return true;
    }

    public static final <T> boolean e(T t10, T t11) {
        return t10 == null ? t11 == null : kotlin.jvm.internal.n.a(t10, t11);
    }

    public static final boolean e0(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static final JSONObject f(String accessToken) {
        kotlin.jvm.internal.n.e(accessToken, "accessToken");
        JSONObject a10 = g0.a(accessToken);
        if (a10 != null) {
            return a10;
        }
        i4.n0 k10 = f7780a.G(accessToken).k();
        if (k10.b() != null) {
            return null;
        }
        return k10.d();
    }

    public static final boolean f0(Uri uri) {
        boolean r10;
        boolean r11;
        boolean r12;
        if (uri != null) {
            r10 = xk.p.r("http", uri.getScheme(), true);
            if (r10) {
                return true;
            }
            r11 = xk.p.r("https", uri.getScheme(), true);
            if (r11) {
                return true;
            }
            r12 = xk.p.r("fbstaging", uri.getScheme(), true);
            if (r12) {
                return true;
            }
        }
        return false;
    }

    public static final Uri g(String str, String str2, Bundle bundle) {
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
        kotlin.jvm.internal.n.d(build, "builder.build()");
        return build;
    }

    public static final Set<String> g0(JSONArray jsonArray) {
        kotlin.jvm.internal.n.e(jsonArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jsonArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                String string = jsonArray.getString(i10);
                kotlin.jvm.internal.n.d(string, "jsonArray.getString(i)");
                hashSet.add(string);
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return hashSet;
    }

    private final void h(Context context, String str) {
        List u02;
        List u03;
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        u02 = xk.q.u0(cookie, new String[]{";"}, false, 0, 6, null);
        Object[] array = u02.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str2 = strArr[i10];
            i10++;
            u03 = xk.q.u0(str2, new String[]{"="}, false, 0, 6, null);
            Object[] array2 = u03.toArray(new String[0]);
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
                    boolean z11 = kotlin.jvm.internal.n.f(str3.charAt(!z10 ? i11 : length2), 32) <= 0;
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
                cookieManager.setCookie(str, kotlin.jvm.internal.n.k(str3.subSequence(i11, length2 + 1).toString(), "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
            }
        }
        cookieManager.removeExpiredCookie();
    }

    public static final List<String> h0(JSONArray jsonArray) {
        kotlin.jvm.internal.n.e(jsonArray, "jsonArray");
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

    public static final void i(Context context) {
        kotlin.jvm.internal.n.e(context, "context");
        try {
            n0 n0Var = f7780a;
            n0Var.h(context, Constants.SIGN_IN_METHOD_FACEBOOK);
            n0Var.h(context, ".facebook.com");
            n0Var.h(context, "https://facebook.com");
            n0Var.h(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final Map<String, String> i0(String str) {
        kotlin.jvm.internal.n.e(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                kotlin.jvm.internal.n.d(key, "key");
                String string = jSONObject.getString(key);
                kotlin.jvm.internal.n.d(string, "jsonObject.getString(key)");
                hashMap.put(key, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final void j(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final void j0(String str, Exception exc) {
        if (!i4.e0.D() || str == null || exc == null) {
            return;
        }
        Log.d(str, exc.getClass().getSimpleName() + ": " + ((Object) exc.getMessage()));
    }

    public static final String k(String str, String str2) {
        return d0(str) ? str2 : str;
    }

    public static final void k0(String str, String str2) {
        if (!i4.e0.D() || str == null || str2 == null) {
            return;
        }
        Log.d(str, str2);
    }

    private final long l(double d10) {
        return Math.round(d10 / 1.073741824E9d);
    }

    public static final void l0(String str, String str2, Throwable th2) {
        if (!i4.e0.D() || d0(str)) {
            return;
        }
        Log.d(str, str2, th2);
    }

    public static final HashSet<String> m(JSONArray jSONArray) {
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
                kotlin.jvm.internal.n.d(string, "jsonArray.getString(i)");
                hashSet.add(string);
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return hashSet;
    }

    public static final String m0(Map<String, String> map) {
        kotlin.jvm.internal.n.e(map, "map");
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
            kotlin.jvm.internal.n.d(str, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        }
        return str;
    }

    public static final List<String> n(JSONArray jsonArray) {
        kotlin.jvm.internal.n.e(jsonArray, "jsonArray");
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
                kotlin.jvm.internal.n.d(string, "jsonArray.getString(i)");
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

    public static final String n0(String key) {
        kotlin.jvm.internal.n.e(key, "key");
        return f7780a.S("MD5", key);
    }

    public static final Map<String, Object> o(JSONObject jsonObject) {
        int length;
        kotlin.jvm.internal.n.e(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jsonObject.names();
        if (names != null && (length = names.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                try {
                    String string = names.getString(i10);
                    kotlin.jvm.internal.n.d(string, "keys.getString(i)");
                    Object value = jsonObject.get(string);
                    if (value instanceof JSONObject) {
                        value = o((JSONObject) value);
                    }
                    kotlin.jvm.internal.n.d(value, "value");
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

    public static final boolean o0(Context context) {
        kotlin.jvm.internal.n.e(context, "context");
        return W(context);
    }

    public static final Map<String, String> p(JSONObject jsonObject) {
        kotlin.jvm.internal.n.e(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            String optString = jsonObject.optString(key);
            if (optString != null) {
                kotlin.jvm.internal.n.d(key, "key");
                hashMap.put(key, optString);
            }
        }
        return hashMap;
    }

    public static final Bundle p0(String str) {
        List u02;
        List u03;
        Bundle bundle = new Bundle();
        if (!d0(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            u02 = xk.q.u0(str, new String[]{"&"}, false, 0, 6, null);
            Object[] array = u02.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str2 = strArr[i10];
                i10++;
                u03 = xk.q.u0(str2, new String[]{"="}, false, 0, 6, null);
                Object[] array2 = u03.toArray(new String[0]);
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
                    j0("FacebookSDK", e10);
                }
            }
        }
        return bundle;
    }

    public static final int q(InputStream inputStream, OutputStream outputStream) {
        BufferedInputStream bufferedInputStream;
        kotlin.jvm.internal.n.e(outputStream, "outputStream");
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

    public static final boolean q0(Bundle bundle, String str, Object obj) {
        String jSONObject;
        kotlin.jvm.internal.n.e(bundle, "bundle");
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

    public static final void r(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    public static final void r0(Bundle b10, String str, String str2) {
        kotlin.jvm.internal.n.e(b10, "b");
        if (d0(str2)) {
            return;
        }
        b10.putString(str, str2);
    }

    private final boolean s() {
        return kotlin.jvm.internal.n.a("mounted", Environment.getExternalStorageState());
    }

    public static final Map<String, String> s0(Parcel parcel) {
        kotlin.jvm.internal.n.e(parcel, "parcel");
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

    public static final String t(int i10) {
        String bigInteger = new BigInteger(i10 * 5, new Random()).toString(32);
        kotlin.jvm.internal.n.d(bigInteger, "BigInteger(length * 5, r).toString(32)");
        return bigInteger;
    }

    public static final String t0(InputStream inputStream) {
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
                    kotlin.jvm.internal.n.d(sb3, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                    j(bufferedInputStream);
                    j(inputStreamReader);
                    return sb3;
                }
                sb2.append(cArr, 0, read);
            }
        } catch (Throwable th5) {
            th2 = th5;
            j(bufferedInputStream);
            j(inputStreamReader);
            throw th2;
        }
    }

    public static final String u(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        kotlin.jvm.internal.n.d(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    public static final Map<String, String> u0(Parcel parcel) {
        kotlin.jvm.internal.n.e(parcel, "parcel");
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

    public static final String v(Context context) {
        String string;
        kotlin.jvm.internal.n.e(context, "context");
        try {
            String n10 = i4.e0.n();
            if (n10 != null) {
                return n10;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i10);
                kotlin.jvm.internal.n.d(string, "context.getString(stringId)");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    private final void v0() {
        try {
            if (s()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f7784e = statFs.getAvailableBlocks() * statFs.getBlockSize();
            }
            f7784e = l(f7784e);
        } catch (Exception unused) {
        }
    }

    public static final String w() {
        Context l10 = i4.e0.l();
        if (l10 == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = l10.getPackageManager().getPackageInfo(l10.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final int w0() {
        int i10 = f7781b;
        if (i10 > 0) {
            return i10;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() { // from class: com.facebook.internal.m0
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    boolean x02;
                    x02 = n0.x0(file, str);
                    return x02;
                }
            });
            if (listFiles != null) {
                f7781b = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f7781b <= 0) {
            f7781b = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f7781b;
    }

    public static final boolean x0(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }

    public static final Date y(Bundle bundle, String str, Date dateBase) {
        long parseLong;
        kotlin.jvm.internal.n.e(dateBase, "dateBase");
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

    private final void y0(Context context) {
        if (kotlin.jvm.internal.n.a(f7787h, "NoCarrier")) {
            try {
                Object systemService = context.getSystemService(Constants.SIGN_IN_METHOD_PHONE);
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                }
                String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                kotlin.jvm.internal.n.d(networkOperatorName, "telephonyManager.networkOperatorName");
                f7787h = networkOperatorName;
            } catch (Exception unused) {
            }
        }
    }

    private final void z0(Context context) {
        if (f7782c == -1 || System.currentTimeMillis() - f7782c >= 1800000) {
            f7782c = System.currentTimeMillis();
            A0();
            y0(context);
            B0();
            v0();
        }
    }

    public final String E() {
        return f7786g;
    }

    public final Locale J() {
        return f7789j;
    }

    public final String Q() {
        return f7788i;
    }

    public final long x() {
        return f7784e;
    }

    public final String z() {
        return f7787h;
    }
}
