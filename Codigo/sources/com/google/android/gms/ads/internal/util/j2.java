package com.google.android.gms.ads.internal.util;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.zzbfu;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzcdu;
import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzceb;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzcjb;
import com.google.android.gms.internal.ads.zzckj;
import com.google.android.gms.internal.ads.zzdtn;
import com.google.android.gms.internal.ads.zzfgm;
import com.google.android.gms.internal.ads.zzfgp;
import com.google.android.gms.internal.ads.zzftt;
import com.google.android.gms.internal.ads.zzfwp;
import com.google.android.gms.internal.ads.zzfxr;
import com.google.android.gms.internal.ads.zzgen;
import com.google.android.gms.internal.ads.zzhhv;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: l */
    public static final zzftt f8993l = new v1(Looper.getMainLooper());

    /* renamed from: g */
    private String f9000g;

    /* renamed from: h */
    private volatile String f9001h;

    /* renamed from: a */
    private final AtomicReference f8994a = new AtomicReference(null);

    /* renamed from: b */
    private final AtomicReference f8995b = new AtomicReference(null);

    /* renamed from: c */
    private final AtomicReference f8996c = new AtomicReference(new Bundle());

    /* renamed from: d */
    private final AtomicBoolean f8997d = new AtomicBoolean();

    /* renamed from: e */
    private boolean f8998e = true;

    /* renamed from: f */
    private final Object f8999f = new Object();

    /* renamed from: i */
    private boolean f9002i = false;

    /* renamed from: j */
    private boolean f9003j = false;

    /* renamed from: k */
    private final Executor f9004k = Executors.newSingleThreadExecutor();

    public static int A(int i10) {
        if (i10 >= 5000) {
            return i10;
        }
        if (i10 <= 0) {
            return 60000;
        }
        zzcec.zzj("HTTP timeout too low: " + i10 + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    private static final void B(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    private static final String C(Context context, String str) {
        String str2;
        if (str == null) {
            return S();
        }
        try {
            n1 a10 = n1.a();
            if (TextUtils.isEmpty(a10.f9020a)) {
                a10.f9020a = (String) (la.e.a() ? k1.a(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.l1

                    /* renamed from: a */
                    public final /* synthetic */ Context f9010a;

                    public /* synthetic */ l1(Context context2) {
                        r1 = context2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Context context2 = r1;
                        SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                        String string = sharedPreferences.getString("user_agent", "");
                        if (!TextUtils.isEmpty(string)) {
                            u1.a("User agent is already initialized on Google Play Services.");
                            return string;
                        }
                        u1.a("User agent is not initialized on Google Play Services. Initializing.");
                        String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                        la.s.a(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                        return defaultUserAgent;
                    }
                }) : k1.a(context2, new Callable() { // from class: com.google.android.gms.ads.internal.util.m1

                    /* renamed from: a */
                    public final /* synthetic */ Context f9016a;

                    /* renamed from: b */
                    public final /* synthetic */ Context f9017b;

                    public /* synthetic */ m1(Context context2, Context context22) {
                        r1 = context2;
                        r2 = context22;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        SharedPreferences sharedPreferences;
                        Context context2 = r1;
                        Context context3 = r2;
                        boolean z10 = false;
                        if (context2 != null) {
                            u1.a("Attempting to read user agent from Google Play Services.");
                            sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                        } else {
                            u1.a("Attempting to read user agent from local cache.");
                            sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                            z10 = true;
                        }
                        String string = sharedPreferences.getString("user_agent", "");
                        if (TextUtils.isEmpty(string)) {
                            u1.a("Reading user agent from WebSettings");
                            string = WebSettings.getDefaultUserAgent(context3);
                            if (z10) {
                                sharedPreferences.edit().putString("user_agent", string).apply();
                                u1.a("Persisting user agent.");
                            }
                        }
                        return string;
                    }
                }));
            }
            str2 = a10.f9020a;
        } catch (Exception unused) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = WebSettings.getDefaultUserAgent(context22);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = S();
        }
        String str3 = str2 + " (Mobile; " + str;
        try {
            if (na.e.a(context22).g()) {
                str3 = str3 + ";aia";
            }
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.t.q().zzw(e10, "AdUtil.getUserAgent");
        }
        return str3.concat(")");
    }

    public static List F() {
        zzbfu zzbfuVar = zzbgc.zza;
        List zzb = com.google.android.gms.ads.internal.client.a0.a().zzb();
        ArrayList arrayList = new ArrayList();
        Iterator it = zzb.iterator();
        while (it.hasNext()) {
            Iterator it2 = zzfxr.zzc(zzfwp.zzc(',')).zzd((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    u1.a("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean P(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.j2.P(android.view.View):boolean");
    }

    public static final void Q(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String R(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return y(x(context));
    }

    static final String S() {
        StringBuilder sb2 = new StringBuilder(RecognitionOptions.QR_CODE);
        sb2.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb2.append(" ");
            sb2.append(str);
        }
        sb2.append("; ");
        sb2.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb2.append("; ");
            sb2.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb2.append(" Build/");
                sb2.append(str3);
            }
        }
        sb2.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb2.toString();
    }

    public static final String T() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    public static final DisplayMetrics U(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    protected static final int[] V() {
        return new int[]{0, 0};
    }

    public static final Map W(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                HashSet hashSet = new HashSet();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        String optString = optJSONArray.optString(i10);
                        if (optString != null) {
                            hashSet.add(optString);
                        }
                    }
                    hashMap.put(next, hashSet);
                }
            }
            return hashMap;
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.t.q().zzw(e10, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return hashMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long X(View view) {
        float f10 = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            f10 = Math.min(f10, view2.getAlpha());
            view = view2.getParent();
        } while (f10 > 0.0f);
        return Math.round((f10 >= 0.0f ? f10 : 0.0f) * 100.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final WebResourceResponse Y(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", com.google.android.gms.ads.internal.t.r().E(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new s0(context).b(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e10) {
            zzcec.zzk("Could not fetch MRAID JS.", e10);
        }
        return null;
    }

    public static final String Z() {
        Resources zze = com.google.android.gms.ads.internal.t.q().zze();
        return zze != null ? zze.getString(d9.d.f13875s) : "Test Ad";
    }

    public static final boolean a(Context context) {
        try {
            return la.j.b(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final v0 a0(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzcec.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof v0 ? (v0) queryLocalInterface : new t0(iBinder);
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.t.q().zzw(e10, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean b(String str) {
        if (!zzceb.zzk()) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzeQ)).booleanValue()) {
            return false;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzeS);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzeR);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b0(Context context, String str) {
        Context zza = zzbzs.zza(context);
        return na.e.a(zza).b(str, zza.getPackageName()) == 0;
    }

    public static final boolean c(Context context) {
        KeyguardManager w10;
        return (context == null || (w10 = w(context)) == null || !w10.isKeyguardLocked()) ? false : true;
    }

    public static final boolean d(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th2) {
            zzcec.zzh("Error loading class.", th2);
            com.google.android.gms.ads.internal.t.q().zzw(th2, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean e() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public static final boolean f(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean g(Context context) {
        try {
            Bundle x10 = x(context);
            String string = x10.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(y(x10))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean h(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void i(View view, int i10, MotionEvent motionEvent) {
        String str;
        int i11;
        int i12;
        int i13;
        String str2;
        zzfgm zzD;
        zzfgp zzP;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof zzdtn) {
                view2 = ((zzdtn) view2).getChildAt(0);
            }
            if ((view2 instanceof a9.q) || (view2 instanceof NativeAdView)) {
                str = "NATIVE";
                i11 = 1;
            } else {
                str = "UNKNOWN";
                i11 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i13 = rect.width();
                i12 = rect.height();
            } else {
                i12 = 0;
                i13 = 0;
            }
            com.google.android.gms.ads.internal.t.r();
            long X = X(view2);
            view2.getLocationOnScreen(iArr);
            int i14 = iArr[0];
            int i15 = iArr[1];
            String str3 = "none";
            if (!(view2 instanceof zzckj) || (zzP = ((zzckj) view2).zzP()) == null) {
                str2 = "none";
            } else {
                str2 = zzP.zzb;
                view2.setContentDescription(str2 + ":" + view2.hashCode());
            }
            if ((view2 instanceof zzcjb) && (zzD = ((zzcjb) view2).zzD()) != null) {
                str = zzfgm.zza(zzD.zzb);
                i11 = zzD.zzf;
                str3 = zzD.zzF;
            }
            zzcec.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i11), view2.getClass().getName(), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i13), Integer.valueOf(i12), Long.valueOf(X), Integer.toString(i10, 2)));
        } catch (Exception e10) {
            zzcec.zzh("Failure getting view location.", e10);
        }
    }

    public static final AlertDialog.Builder j(Context context) {
        com.google.android.gms.ads.internal.t.s();
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void k(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new d1(context, str, (String) it.next()).zzb();
        }
    }

    public static final void l(Context context, Throwable th2) {
        if (context != null) {
            try {
                if (!((Boolean) zzbij.zzb.zze()).booleanValue()) {
                } else {
                    la.h.a(context, th2);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final String m(InputStreamReader inputStreamReader) {
        StringBuilder sb2 = new StringBuilder(8192);
        char[] cArr = new char[RecognitionOptions.PDF417];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb2.toString();
            }
            sb2.append(cArr, 0, read);
        }
    }

    public static final int n(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            zzcec.zzj("Could not parse value:".concat(e10.toString()));
            return 0;
        }
    }

    public static final Map o(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static final int[] p(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? V() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static final int[] q(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] V = (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? V() : new int[]{findViewById.getTop(), findViewById.getBottom()};
        return new int[]{com.google.android.gms.ads.internal.client.x.b().zzb(activity, V[0]), com.google.android.gms.ads.internal.client.x.b().zzb(activity, V[1])};
    }

    public static final boolean r(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z10 = com.google.android.gms.ads.internal.t.r().f8998e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || P(view);
        long X = X(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z10)) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzbl)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzkd)).booleanValue()) {
                    return true;
                }
                if (X >= ((Integer) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzkf)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void s(Context context, Intent intent) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzkx)).booleanValue()) {
            B(context, intent);
            return;
        }
        try {
            B(context, intent);
        } catch (SecurityException e10) {
            zzcec.zzk("", e10);
            com.google.android.gms.ads.internal.t.q().zzw(e10, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void t(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            Q(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            zzcec.zze("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e10) {
            zzcec.zzh("No browser is found.", e10);
        }
    }

    public static final int[] u(Activity activity) {
        int[] p10 = p(activity);
        return new int[]{com.google.android.gms.ads.internal.client.x.b().zzb(activity, p10[0]), com.google.android.gms.ads.internal.client.x.b().zzb(activity, p10[1])};
    }

    public static final boolean v(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return r(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, w(context));
    }

    private static KeyguardManager w(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static Bundle x(Context context) {
        try {
            return na.e.a(context).c(context.getPackageName(), RecognitionOptions.ITF).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            u1.b("Error getting metadata", e10);
            return null;
        }
    }

    private static String y(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    private static boolean z(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public final com.google.common.util.concurrent.f D(Uri uri) {
        return zzgen.zzj(new Callable() { // from class: com.google.android.gms.ads.internal.util.d2

            /* renamed from: a */
            public final /* synthetic */ Uri f8958a;

            public /* synthetic */ d2(Uri uri2) {
                r1 = uri2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzftt zzfttVar = j2.f8993l;
                com.google.android.gms.ads.internal.t.r();
                return j2.o(r1);
            }
        }, this.f9004k);
    }

    public final String E(Context context, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzkK)).booleanValue()) {
            if (this.f9001h != null) {
                return this.f9001h;
            }
            this.f9001h = C(context, str);
            return this.f9001h;
        }
        synchronized (this.f8999f) {
            String str2 = this.f9000g;
            if (str2 != null) {
                return str2;
            }
            String C = C(context, str);
            this.f9000g = C;
            return C;
        }
    }

    public final void H(Context context, String str, boolean z10, HttpURLConnection httpURLConnection, boolean z11, int i10) {
        int A = A(i10);
        zzcec.zzi("HTTP timeout: " + A + " milliseconds.");
        httpURLConnection.setConnectTimeout(A);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(A);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", E(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final /* synthetic */ void I(Context context, String str, SharedPreferences sharedPreferences, String str2) {
        this.f8996c.set(e.b(context, str));
    }

    public final void J(Context context, String str, String str2, Bundle bundle, boolean z10) {
        com.google.android.gms.ads.internal.t.r();
        bundle.putString("device", T());
        zzbfu zzbfuVar = zzbgc.zza;
        bundle.putString("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.a0.a().zza()));
        if (bundle.isEmpty()) {
            zzcec.zze("Empty or null bundle.");
        } else {
            String str3 = (String) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzka);
            if (!this.f8997d.getAndSet(true)) {
                this.f8996c.set(e.a(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.c2

                    /* renamed from: b */
                    public final /* synthetic */ Context f8950b;

                    /* renamed from: c */
                    public final /* synthetic */ String f8951c;

                    public /* synthetic */ c2(Context context2, String str32) {
                        r2 = context2;
                        r3 = str32;
                    }

                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        j2.this.I(r2, r3, sharedPreferences, str4);
                    }
                }));
            }
            bundle.putAll((Bundle) this.f8996c.get());
        }
        com.google.android.gms.ads.internal.client.x.b();
        zzcdv.zzw(context2, str, "gmob-apps", bundle, true, new zzcdu() { // from class: com.google.android.gms.ads.internal.util.b2

            /* renamed from: a */
            public final /* synthetic */ Context f8945a;

            /* renamed from: b */
            public final /* synthetic */ String f8946b;

            public /* synthetic */ b2(Context context2, String str4) {
                r1 = context2;
                r2 = str4;
            }

            @Override // com.google.android.gms.internal.ads.zzcdu
            public final boolean zza(String str4) {
                zzftt zzfttVar = j2.f8993l;
                com.google.android.gms.ads.internal.t.r();
                j2.k(r1, r2, str4);
                return true;
            }
        });
    }

    public final boolean K(String str) {
        return z(str, this.f8994a, (String) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzab));
    }

    public final boolean L(String str) {
        return z(str, this.f8995b, (String) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzac));
    }

    public final boolean M(Context context) {
        if (this.f9003j) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbgc.zza(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzkw)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new g2(this, null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new g2(this, null), intentFilter, 4);
        }
        this.f9003j = true;
        return true;
    }

    public final boolean N(Context context) {
        if (this.f9002i) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbgc.zza(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzkw)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new i2(this, null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new i2(this, null), intentFilter, 4);
        }
        this.f9002i = true;
        return true;
    }

    public final int O(Context context, Uri uri) {
        int i10;
        if (context == null) {
            u1.a("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (context instanceof Activity) {
            i10 = 0;
        } else {
            u1.a("Chrome Custom Tabs can only work with Activity context.");
            i10 = 2;
        }
        zzbfu zzbfuVar = zzbgc.zzex;
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbfuVar);
        zzbfu zzbfuVar2 = zzbgc.zzey;
        if (true == bool.equals(com.google.android.gms.ads.internal.client.a0.c().zza(zzbfuVar2))) {
            i10 = 9;
        }
        if (i10 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i10;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbfuVar)).booleanValue()) {
            zzbhd zzbhdVar = new zzbhd();
            zzbhdVar.zze(new e2(this, zzbhdVar, context, uri));
            zzbhdVar.zzb((Activity) context);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbfuVar2)).booleanValue()) {
            return 5;
        }
        androidx.browser.customtabs.d b10 = new d.b().b();
        b10.f1766a.setPackage(zzhhv.zza(context));
        b10.b(context, uri);
        return 5;
    }
}
