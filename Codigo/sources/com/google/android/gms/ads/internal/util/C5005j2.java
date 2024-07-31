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
import androidx.browser.customtabs.C0394d;
import ca.C1912k;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.ads.internal.client.C4930x;
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
import com.google.common.util.concurrent.InterfaceFutureC5920f;
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
import la.C9460e;
import la.C9463h;
import la.C9465j;
import la.C9474s;
import na.C9696e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p011a9.C0079q;
import p060d9.C6862d;

/* renamed from: com.google.android.gms.ads.internal.util.j2 */
/* loaded from: classes.dex */
public final class C5005j2 {

    /* renamed from: l */
    public static final zzftt f10092l = new HandlerC5050v1(Looper.getMainLooper());

    /* renamed from: g */
    private String f10099g;

    /* renamed from: h */
    private volatile String f10100h;

    /* renamed from: a */
    private final AtomicReference f10093a = new AtomicReference(null);

    /* renamed from: b */
    private final AtomicReference f10094b = new AtomicReference(null);

    /* renamed from: c */
    private final AtomicReference f10095c = new AtomicReference(new Bundle());

    /* renamed from: d */
    private final AtomicBoolean f10096d = new AtomicBoolean();

    /* renamed from: e */
    private boolean f10097e = true;

    /* renamed from: f */
    private final Object f10098f = new Object();

    /* renamed from: i */
    private boolean f10101i = false;

    /* renamed from: j */
    private boolean f10102j = false;

    /* renamed from: k */
    private final Executor f10103k = Executors.newSingleThreadExecutor();

    /* renamed from: A */
    public static int m12644A(int i10) {
        if (i10 >= 5000) {
            return i10;
        }
        if (i10 <= 0) {
            return 60000;
        }
        zzcec.zzj("HTTP timeout too low: " + i10 + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    /* renamed from: B */
    private static final void m12645B(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    /* renamed from: C */
    private static final String m12646C(final Context context, String str) {
        String str2;
        Object m12698a;
        if (str == null) {
            return m12652S();
        }
        try {
            C5020n1 m12701a = C5020n1.m12701a();
            if (TextUtils.isEmpty(m12701a.f10119a)) {
                if (C9460e.m28129a()) {
                    m12698a = C5008k1.m12698a(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.l1
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Context context2 = context;
                            SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                C5047u1.m12726a("User agent is already initialized on Google Play Services.");
                                return string;
                            }
                            C5047u1.m12726a("User agent is not initialized on Google Play Services. Initializing.");
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                            C9474s.m28178a(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                            return defaultUserAgent;
                        }
                    });
                } else {
                    final Context m10098d = C1912k.m10098d(context);
                    m12698a = C5008k1.m12698a(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.m1
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            SharedPreferences sharedPreferences;
                            Context context2 = m10098d;
                            Context context3 = context;
                            boolean z10 = false;
                            if (context2 != null) {
                                C5047u1.m12726a("Attempting to read user agent from Google Play Services.");
                                sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            } else {
                                C5047u1.m12726a("Attempting to read user agent from local cache.");
                                sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                z10 = true;
                            }
                            String string = sharedPreferences.getString("user_agent", "");
                            if (TextUtils.isEmpty(string)) {
                                C5047u1.m12726a("Reading user agent from WebSettings");
                                string = WebSettings.getDefaultUserAgent(context3);
                                if (z10) {
                                    sharedPreferences.edit().putString("user_agent", string).apply();
                                    C5047u1.m12726a("Persisting user agent.");
                                }
                            }
                            return string;
                        }
                    });
                }
                m12701a.f10119a = (String) m12698a;
            }
            str2 = m12701a.f10119a;
        } catch (Exception unused) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = m12652S();
        }
        String str3 = str2 + " (Mobile; " + str;
        try {
            if (C9696e.m29080a(context).m29078g()) {
                str3 = str3 + ";aia";
            }
        } catch (Exception e10) {
            C4965t.m12580q().zzw(e10, "AdUtil.getUserAgent");
        }
        return str3.concat(")");
    }

    /* renamed from: F */
    public static List m12647F() {
        zzbfu zzbfuVar = zzbgc.zza;
        List zzb = C4784a0.m12363a().zzb();
        ArrayList arrayList = new ArrayList();
        Iterator it = zzb.iterator();
        while (it.hasNext()) {
            Iterator it2 = zzfxr.zzc(zzfwp.zzc(',')).zzd((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    C5047u1.m12726a("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m12649P(android.view.View r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.C5005j2.m12649P(android.view.View):boolean");
    }

    /* renamed from: Q */
    public static final void m12650Q(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    /* renamed from: R */
    public static final String m12651R(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return m12686y(m12685x(context));
    }

    /* renamed from: S */
    static final String m12652S() {
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

    /* renamed from: T */
    public static final String m12653T() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    /* renamed from: U */
    public static final DisplayMetrics m12654U(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: V */
    protected static final int[] m12655V() {
        return new int[]{0, 0};
    }

    /* renamed from: W */
    public static final Map m12656W(String str) {
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
            C4965t.m12580q().zzw(e10, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return hashMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    /* renamed from: X */
    public static final long m12657X(View view) {
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
    /* renamed from: Y */
    public static final WebResourceResponse m12658Y(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", C4965t.m12581r().m12689E(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new C5039s0(context).m12716b(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e10) {
            zzcec.zzk("Could not fetch MRAID JS.", e10);
        }
        return null;
    }

    /* renamed from: Z */
    public static final String m12659Z() {
        Resources zze = C4965t.m12580q().zze();
        return zze != null ? zze.getString(C6862d.f15229s) : "Test Ad";
    }

    /* renamed from: a */
    public static final boolean m12660a(Context context) {
        try {
            return C9465j.m28144b(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    /* renamed from: a0 */
    public static final InterfaceC5049v0 m12661a0(Context context) {
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
            return queryLocalInterface instanceof InterfaceC5049v0 ? (InterfaceC5049v0) queryLocalInterface : new C5043t0(iBinder);
        } catch (Exception e10) {
            C4965t.m12580q().zzw(e10, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    /* renamed from: b */
    public static final boolean m12662b(String str) {
        if (!zzceb.zzk()) {
            return false;
        }
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzeQ)).booleanValue()) {
            return false;
        }
        String str2 = (String) C4784a0.m12365c().zza(zzbgc.zzeS);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) C4784a0.m12365c().zza(zzbgc.zzeR);
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

    /* renamed from: b0 */
    public static final boolean m12663b0(Context context, String str) {
        Context zza = zzbzs.zza(context);
        return C9696e.m29080a(zza).m29073b(str, zza.getPackageName()) == 0;
    }

    /* renamed from: c */
    public static final boolean m12664c(Context context) {
        KeyguardManager m12684w;
        return (context == null || (m12684w = m12684w(context)) == null || !m12684w.isKeyguardLocked()) ? false : true;
    }

    /* renamed from: d */
    public static final boolean m12665d(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th2) {
            zzcec.zzh("Error loading class.", th2);
            C4965t.m12580q().zzw(th2, "AdUtil.isLiteSdk");
            return false;
        }
    }

    /* renamed from: e */
    public static final boolean m12666e() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    /* renamed from: f */
    public static final boolean m12667f(Context context) {
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

    /* renamed from: g */
    public static final boolean m12668g(Context context) {
        try {
            Bundle m12685x = m12685x(context);
            String string = m12685x.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(m12686y(m12685x))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m12669h(Context context) {
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

    /* renamed from: i */
    public static final void m12670i(View view, int i10, MotionEvent motionEvent) {
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
            if ((view2 instanceof C0079q) || (view2 instanceof NativeAdView)) {
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
            C4965t.m12581r();
            long m12657X = m12657X(view2);
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
            zzcec.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i11), view2.getClass().getName(), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i13), Integer.valueOf(i12), Long.valueOf(m12657X), Integer.toString(i10, 2)));
        } catch (Exception e10) {
            zzcec.zzh("Failure getting view location.", e10);
        }
    }

    /* renamed from: j */
    public static final AlertDialog.Builder m12671j(Context context) {
        C4965t.m12582s();
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    /* renamed from: k */
    public static final void m12672k(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new C4980d1(context, str, (String) it.next()).zzb();
        }
    }

    /* renamed from: l */
    public static final void m12673l(Context context, Throwable th2) {
        if (context != null) {
            try {
                if (!((Boolean) zzbij.zzb.zze()).booleanValue()) {
                } else {
                    C9463h.m28141a(context, th2);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* renamed from: m */
    public static final String m12674m(InputStreamReader inputStreamReader) {
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

    /* renamed from: n */
    public static final int m12675n(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            zzcec.zzj("Could not parse value:".concat(e10.toString()));
            return 0;
        }
    }

    /* renamed from: o */
    public static final Map m12676o(Uri uri) {
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

    /* renamed from: p */
    public static final int[] m12677p(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? m12655V() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    /* renamed from: q */
    public static final int[] m12678q(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] m12655V = (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? m12655V() : new int[]{findViewById.getTop(), findViewById.getBottom()};
        return new int[]{C4930x.m12474b().zzb(activity, m12655V[0]), C4930x.m12474b().zzb(activity, m12655V[1])};
    }

    /* renamed from: r */
    public static final boolean m12679r(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z10 = C4965t.m12581r().f10097e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || m12649P(view);
        long m12657X = m12657X(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z10)) {
            if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzbl)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzkd)).booleanValue()) {
                    return true;
                }
                if (m12657X >= ((Integer) C4784a0.m12365c().zza(zzbgc.zzkf)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: s */
    public static final void m12680s(Context context, Intent intent) {
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzkx)).booleanValue()) {
            m12645B(context, intent);
            return;
        }
        try {
            m12645B(context, intent);
        } catch (SecurityException e10) {
            zzcec.zzk("", e10);
            C4965t.m12580q().zzw(e10, "AdUtil.startActivityWithUnknownContext");
        }
    }

    /* renamed from: t */
    public static final void m12681t(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            m12650Q(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            zzcec.zze("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e10) {
            zzcec.zzh("No browser is found.", e10);
        }
    }

    /* renamed from: u */
    public static final int[] m12682u(Activity activity) {
        int[] m12677p = m12677p(activity);
        return new int[]{C4930x.m12474b().zzb(activity, m12677p[0]), C4930x.m12474b().zzb(activity, m12677p[1])};
    }

    /* renamed from: v */
    public static final boolean m12683v(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return m12679r(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, m12684w(context));
    }

    /* renamed from: w */
    private static KeyguardManager m12684w(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    /* renamed from: x */
    private static Bundle m12685x(Context context) {
        try {
            return C9696e.m29080a(context).m29074c(context.getPackageName(), RecognitionOptions.ITF).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            C5047u1.m12727b("Error getting metadata", e10);
            return null;
        }
    }

    /* renamed from: y */
    private static String m12686y(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    /* renamed from: z */
    private static boolean m12687z(String str, AtomicReference atomicReference, String str2) {
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

    /* renamed from: D */
    public final InterfaceFutureC5920f m12688D(final Uri uri) {
        return zzgen.zzj(new Callable() { // from class: com.google.android.gms.ads.internal.util.d2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzftt zzfttVar = C5005j2.f10092l;
                C4965t.m12581r();
                return C5005j2.m12676o(uri);
            }
        }, this.f10103k);
    }

    /* renamed from: E */
    public final String m12689E(Context context, String str) {
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzkK)).booleanValue()) {
            if (this.f10100h != null) {
                return this.f10100h;
            }
            this.f10100h = m12646C(context, str);
            return this.f10100h;
        }
        synchronized (this.f10098f) {
            String str2 = this.f10099g;
            if (str2 != null) {
                return str2;
            }
            String m12646C = m12646C(context, str);
            this.f10099g = m12646C;
            return m12646C;
        }
    }

    /* renamed from: H */
    public final void m12690H(Context context, String str, boolean z10, HttpURLConnection httpURLConnection, boolean z11, int i10) {
        int m12644A = m12644A(i10);
        zzcec.zzi("HTTP timeout: " + m12644A + " milliseconds.");
        httpURLConnection.setConnectTimeout(m12644A);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(m12644A);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", m12689E(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: I */
    public final /* synthetic */ void m12691I(Context context, String str, SharedPreferences sharedPreferences, String str2) {
        this.f10095c.set(C4982e.m12626b(context, str));
    }

    /* renamed from: J */
    public final void m12692J(final Context context, final String str, String str2, Bundle bundle, boolean z10) {
        C4965t.m12581r();
        bundle.putString("device", m12653T());
        zzbfu zzbfuVar = zzbgc.zza;
        bundle.putString("eids", TextUtils.join(",", C4784a0.m12363a().zza()));
        if (bundle.isEmpty()) {
            zzcec.zze("Empty or null bundle.");
        } else {
            final String str3 = (String) C4784a0.m12365c().zza(zzbgc.zzka);
            if (!this.f10096d.getAndSet(true)) {
                this.f10095c.set(C4982e.m12625a(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.c2
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        C5005j2.this.m12691I(context, str3, sharedPreferences, str4);
                    }
                }));
            }
            bundle.putAll((Bundle) this.f10095c.get());
        }
        C4930x.m12474b();
        zzcdv.zzw(context, str, "gmob-apps", bundle, true, new zzcdu() { // from class: com.google.android.gms.ads.internal.util.b2
            @Override // com.google.android.gms.internal.ads.zzcdu
            public final boolean zza(String str4) {
                zzftt zzfttVar = C5005j2.f10092l;
                C4965t.m12581r();
                C5005j2.m12672k(context, str, str4);
                return true;
            }
        });
    }

    /* renamed from: K */
    public final boolean m12693K(String str) {
        return m12687z(str, this.f10093a, (String) C4784a0.m12365c().zza(zzbgc.zzab));
    }

    /* renamed from: L */
    public final boolean m12694L(String str) {
        return m12687z(str, this.f10094b, (String) C4784a0.m12365c().zza(zzbgc.zzac));
    }

    /* renamed from: M */
    public final boolean m12695M(Context context) {
        if (this.f10102j) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbgc.zza(context);
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzkw)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new C4993g2(this, null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new C4993g2(this, null), intentFilter, 4);
        }
        this.f10102j = true;
        return true;
    }

    /* renamed from: N */
    public final boolean m12696N(Context context) {
        if (this.f10101i) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbgc.zza(context);
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzkw)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new C5001i2(this, null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new C5001i2(this, null), intentFilter, 4);
        }
        this.f10101i = true;
        return true;
    }

    /* renamed from: O */
    public final int m12697O(Context context, Uri uri) {
        int i10;
        if (context == null) {
            C5047u1.m12726a("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (context instanceof Activity) {
            i10 = 0;
        } else {
            C5047u1.m12726a("Chrome Custom Tabs can only work with Activity context.");
            i10 = 2;
        }
        zzbfu zzbfuVar = zzbgc.zzex;
        Boolean bool = (Boolean) C4784a0.m12365c().zza(zzbfuVar);
        zzbfu zzbfuVar2 = zzbgc.zzey;
        if (true == bool.equals(C4784a0.m12365c().zza(zzbfuVar2))) {
            i10 = 9;
        }
        if (i10 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i10;
        }
        if (((Boolean) C4784a0.m12365c().zza(zzbfuVar)).booleanValue()) {
            zzbhd zzbhdVar = new zzbhd();
            zzbhdVar.zze(new C4985e2(this, zzbhdVar, context, uri));
            zzbhdVar.zzb((Activity) context);
        }
        if (!((Boolean) C4784a0.m12365c().zza(zzbfuVar2)).booleanValue()) {
            return 5;
        }
        C0394d m2113b = new C0394d.b().m2113b();
        m2113b.f2069a.setPackage(zzhhv.zza(context));
        m2113b.m2108b(context, uri);
        return 5;
    }
}
