package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.z4;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcdv {
    public static final Handler zza = new zzftt(Looper.getMainLooper());
    private static final String zzb = x8.k.class.getName();
    private static final String zzc = h9.a.class.getName();
    private static final String zzd = y8.b.class.getName();
    private static final String zze = y8.c.class.getName();
    private static final String zzf = p9.b.class.getName();
    private static final String zzg = x8.g.class.getName();
    private float zzh = -1.0f;

    private final JSONArray zzA(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zzB(jSONArray, it.next());
        }
        return jSONArray;
    }

    private final void zzB(JSONArray jSONArray, Object obj) {
        Object zzg2;
        if (obj instanceof Bundle) {
            zzg2 = zzh((Bundle) obj);
        } else if (obj instanceof Map) {
            zzg2 = zzi((Map) obj);
        } else if (obj instanceof Collection) {
            zzg2 = zzA((Collection) obj);
        } else {
            if (!(obj instanceof Object[])) {
                jSONArray.put(obj);
                return;
            }
            zzg2 = zzg((Object[]) obj);
        }
        jSONArray.put(zzg2);
    }

    private final void zzC(JSONObject jSONObject, String str, Object obj) {
        Boolean[] boolArr;
        Object zzg2;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        Collection asList;
        if (((Boolean) a0.c().zza(zzbgc.zzt)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            zzg2 = zzh((Bundle) obj);
        } else if (obj instanceof Map) {
            zzg2 = zzi((Map) obj);
        } else {
            if (obj instanceof Collection) {
                str = String.valueOf(str);
                asList = (Collection) obj;
            } else if (obj instanceof Object[]) {
                asList = Arrays.asList((Object[]) obj);
            } else {
                int i10 = 0;
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    if (iArr == null) {
                        numArr = new Integer[0];
                    } else {
                        int length = iArr.length;
                        Integer[] numArr2 = new Integer[length];
                        while (i10 < length) {
                            numArr2[i10] = Integer.valueOf(iArr[i10]);
                            i10++;
                        }
                        numArr = numArr2;
                    }
                    zzg2 = zzg(numArr);
                } else if (obj instanceof double[]) {
                    double[] dArr2 = (double[]) obj;
                    if (dArr2 == null) {
                        dArr = new Double[0];
                    } else {
                        int length2 = dArr2.length;
                        Double[] dArr3 = new Double[length2];
                        while (i10 < length2) {
                            dArr3[i10] = Double.valueOf(dArr2[i10]);
                            i10++;
                        }
                        dArr = dArr3;
                    }
                    zzg2 = zzg(dArr);
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    if (jArr == null) {
                        lArr = new Long[0];
                    } else {
                        int length3 = jArr.length;
                        Long[] lArr2 = new Long[length3];
                        while (i10 < length3) {
                            lArr2[i10] = Long.valueOf(jArr[i10]);
                            i10++;
                        }
                        lArr = lArr2;
                    }
                    zzg2 = zzg(lArr);
                } else {
                    if (!(obj instanceof boolean[])) {
                        jSONObject.put(str, obj);
                        return;
                    }
                    boolean[] zArr = (boolean[]) obj;
                    if (zArr == null) {
                        boolArr = new Boolean[0];
                    } else {
                        int length4 = zArr.length;
                        Boolean[] boolArr2 = new Boolean[length4];
                        while (i10 < length4) {
                            boolArr2[i10] = Boolean.valueOf(zArr[i10]);
                            i10++;
                        }
                        boolArr = boolArr2;
                    }
                    zzg2 = zzg(boolArr);
                }
            }
            zzg2 = zzA(asList);
        }
        jSONObject.put(str, zzg2);
    }

    private static final void zzD(ViewGroup viewGroup, z4 z4Var, String str, int i10, int i11) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i10);
        textView.setBackgroundColor(i11);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i10);
        int zzx = zzx(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(z4Var.f8836f - zzx, z4Var.f8833c - zzx, 17));
        viewGroup.addView(frameLayout, z4Var.f8836f, z4Var.f8833c);
    }

    public static int zza(Context context, int i10) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i11 = configuration.orientation;
        if (i10 == 0) {
            i10 = i11;
        }
        return Math.round((i10 == i11 ? displayMetrics.heightPixels : displayMetrics.widthPixels) / displayMetrics.density);
    }

    public static x8.i zzc(Context context, int i10, int i11, int i12) {
        float f10;
        float f11;
        int i13;
        int zza2 = zza(context, i12);
        if (zza2 == -1) {
            return x8.i.f30686q;
        }
        int min = Math.min(90, Math.round(zza2 * 0.15f));
        if (i10 <= 655) {
            if (i10 > 632) {
                i13 = 81;
            } else if (i10 > 526) {
                f10 = i10 / 468.0f;
                f11 = 60.0f;
            } else if (i10 > 432) {
                i13 = 68;
            } else {
                f10 = i10 / 320.0f;
                f11 = 50.0f;
            }
            return new x8.i(i10, Math.max(Math.min(i13, min), 50));
        }
        f10 = i10 / 728.0f;
        f11 = 90.0f;
        i13 = Math.round(f10 * f11);
        return new x8.i(i10, Math.max(Math.min(i13, min), 50));
    }

    public static String zzd() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    public static String zze(String str) {
        return zzz(str, "MD5");
    }

    public static String zzf(String str) {
        return zzz(str, "SHA-256");
    }

    public static boolean zzo(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) zzbij.zzd.zze());
    }

    public static final int zzp(DisplayMetrics displayMetrics, int i10) {
        return (int) TypedValue.applyDimension(1, i10, displayMetrics);
    }

    public static final String zzq(StackTraceElement[] stackTraceElementArr, String str) {
        int i10;
        int i11;
        String str2;
        while (true) {
            i11 = i10 + 1;
            if (i11 >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            String className = stackTraceElement.getClassName();
            i10 = ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (zzb.equalsIgnoreCase(className) || zzc.equalsIgnoreCase(className) || zzd.equalsIgnoreCase(className) || zze.equalsIgnoreCase(className) || zzf.equalsIgnoreCase(className) || zzg.equalsIgnoreCase(className))) ? 0 : i11;
        }
        str2 = stackTraceElementArr[i11].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb2 = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb2.append(stringTokenizer.nextToken());
                for (int i12 = 2; i12 > 0 && stringTokenizer.hasMoreElements(); i12--) {
                    sb2.append(".");
                    sb2.append(stringTokenizer.nextToken());
                }
                str = sb2.toString();
            }
            if (str2 != null && !str2.contains(str)) {
                return str2;
            }
        }
        return null;
    }

    public static final boolean zzr() {
        boolean booleanValue = ((Boolean) a0.c().zza(zzbgc.zzkN)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator")) {
            return true;
        }
        return booleanValue && Build.HARDWARE.contains("ranchu");
    }

    public static final boolean zzs(Context context, int i10) {
        return ca.g.f().h(context, i10) == 0;
    }

    public static final boolean zzt(Context context) {
        int h10 = ca.g.f().h(context, ca.k.f6983a);
        return h10 == 0 || h10 == 2;
    }

    public static final boolean zzu() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int zzv(DisplayMetrics displayMetrics, int i10) {
        return Math.round(i10 / displayMetrics.density);
    }

    public static final void zzw(Context context, String str, String str2, Bundle bundle, boolean z10, zzcdu zzcduVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            str = ca.g.f().a(context) + ".240304000";
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter(FacebookMediationAdapter.KEY_ID, "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzcduVar.zza(appendQueryParameter.toString());
    }

    public static final int zzx(Context context, int i10) {
        return zzp(context.getResources().getDisplayMetrics(), i10);
    }

    public static final String zzy(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || zzr()) {
            string = "emulator";
        }
        return zzz(string, "MD5");
    }

    private static String zzz(String str, String str2) {
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public final int zzb(Context context, int i10) {
        if (this.zzh < 0.0f) {
            synchronized (this) {
                if (this.zzh < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.zzh = displayMetrics.density;
                }
            }
        }
        return Math.round(i10 / this.zzh);
    }

    final JSONArray zzg(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            zzB(jSONArray, obj);
        }
        return jSONArray;
    }

    public final JSONObject zzh(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            zzC(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject zzi(Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                zzC(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e10) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e10.getMessage())));
        }
    }

    public final JSONObject zzj(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return zzh(bundle);
        } catch (JSONException e10) {
            zzcec.zzh("Error converting Bundle to JSON", e10);
            return null;
        }
    }

    public final void zzk(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject2.get(next);
            try {
                Object obj2 = jSONObject.get(next);
                if (JSONObject.class.isInstance(obj2) && JSONObject.class.isInstance(obj)) {
                    zzk((JSONObject) obj2, (JSONObject) obj);
                }
            } catch (JSONException unused) {
                jSONObject.put(next, obj);
            }
        }
    }

    public final void zzl(ViewGroup viewGroup, z4 z4Var, String str, String str2) {
        if (str2 != null) {
            zzcec.zzj(str2);
        }
        zzD(viewGroup, z4Var, str, -65536, -16777216);
    }

    public final void zzm(ViewGroup viewGroup, z4 z4Var, String str) {
        zzD(viewGroup, z4Var, "Ads by Google", -16777216, -1);
    }

    public final void zzn(Context context, String str, String str2, Bundle bundle, boolean z10) {
        zzw(context, str, "gmob-apps", bundle, true, new zzcdu() { // from class: com.google.android.gms.internal.ads.zzcds
            public /* synthetic */ zzcds() {
            }

            @Override // com.google.android.gms.internal.ads.zzcdu
            public final boolean zza(String str3) {
                new zzcdt(zzcdv.this, str3).start();
                return true;
            }
        });
    }
}
