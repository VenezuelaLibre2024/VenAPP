package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzot;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes2.dex */
public final class ib extends u6 {

    /* renamed from: i */
    private static final String[] f10294i = {"firebase_", "google_", "ga_"};

    /* renamed from: j */
    private static final String[] f10295j = {"_err"};

    /* renamed from: c */
    private SecureRandom f10296c;

    /* renamed from: d */
    private final AtomicLong f10297d;

    /* renamed from: e */
    private int f10298e;

    /* renamed from: f */
    private n1.a f10299f;

    /* renamed from: g */
    private Boolean f10300g;

    /* renamed from: h */
    private Integer f10301h;

    public ib(w5 w5Var) {
        super(w5Var);
        this.f10301h = null;
        this.f10297d = new AtomicLong(0L);
    }

    public static Bundle A(List<hb> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (hb hbVar : list) {
            String str = hbVar.f10241f;
            if (str != null) {
                bundle.putString(hbVar.f10237b, str);
            } else {
                Long l10 = hbVar.f10239d;
                if (l10 != null) {
                    bundle.putLong(hbVar.f10237b, l10.longValue());
                } else {
                    Double d10 = hbVar.f10243s;
                    if (d10 != null) {
                        bundle.putDouble(hbVar.f10237b, d10.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    private final Object C(int i10, Object obj, boolean z10, boolean z11) {
        Bundle m02;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return D(String.valueOf(obj), i10, z10);
        }
        if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if ((parcelable instanceof Bundle) && (m02 = m0((Bundle) parcelable)) != null && !m02.isEmpty()) {
                arrayList.add(m02);
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static boolean C0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static String D(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (!z10) {
            return null;
        }
        return str.substring(0, str.offsetByCodePoints(0, i10)) + "...";
    }

    public static boolean E0(String str) {
        com.google.android.gms.common.internal.s.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    private static void F(Bundle bundle, int i10, String str, String str2, Object obj) {
        if (q0(bundle, i10)) {
            bundle.putString("_ev", D(str, 40, true));
            if (obj != null) {
                com.google.android.gms.common.internal.s.j(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public static boolean G0(String str) {
        for (String str2 : f10295j) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    private final int H0(String str) {
        if (!r0("event param", str)) {
            return 3;
        }
        if (i0("event param", null, str)) {
            return !d0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    private final int I0(String str) {
        if (!x0("event param", str)) {
            return 3;
        }
        if (i0("event param", null, str)) {
            return !d0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    private static int J0(String str) {
        return "_ldl".equals(str) ? RecognitionOptions.PDF417 : "_id".equals(str) ? RecognitionOptions.QR_CODE : ("_lgclid".equals(str) || "_gbraid".equals(str)) ? 100 : 36;
    }

    private static boolean M0(String str) {
        com.google.android.gms.common.internal.s.j(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    public static MessageDigest O0() {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static void R(p8 p8Var, Bundle bundle, boolean z10) {
        if (bundle == null || p8Var == null || (bundle.containsKey("_sc") && !z10)) {
            if (bundle != null && p8Var == null && z10) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = p8Var.f10509a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = p8Var.f10510b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", p8Var.f10511c);
    }

    public static void S(kb kbVar, int i10, String str, String str2, int i11) {
        T(kbVar, null, i10, str, str2, i11);
    }

    private final boolean S0() {
        Integer num;
        if (this.f10300g == null) {
            n1.a L0 = L0();
            boolean z10 = false;
            if (L0 == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = L0.b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z10 = true;
                        }
                    } catch (InterruptedException e10) {
                        e = e10;
                        num2 = num;
                        zzj().G().b("Measurement manager api exception", e);
                        this.f10300g = Boolean.FALSE;
                        num = num2;
                        zzj().F().b("Measurement manager api status result", num);
                        return this.f10300g.booleanValue();
                    } catch (CancellationException e11) {
                        e = e11;
                        num2 = num;
                        zzj().G().b("Measurement manager api exception", e);
                        this.f10300g = Boolean.FALSE;
                        num = num2;
                        zzj().F().b("Measurement manager api status result", num);
                        return this.f10300g.booleanValue();
                    } catch (ExecutionException e12) {
                        e = e12;
                        num2 = num;
                        zzj().G().b("Measurement manager api exception", e);
                        this.f10300g = Boolean.FALSE;
                        num = num2;
                        zzj().F().b("Measurement manager api status result", num);
                        return this.f10300g.booleanValue();
                    } catch (TimeoutException e13) {
                        e = e13;
                        num2 = num;
                        zzj().G().b("Measurement manager api exception", e);
                        this.f10300g = Boolean.FALSE;
                        num = num2;
                        zzj().F().b("Measurement manager api status result", num);
                        return this.f10300g.booleanValue();
                    }
                }
                this.f10300g = Boolean.valueOf(z10);
            } catch (InterruptedException e14) {
                e = e14;
            } catch (CancellationException e15) {
                e = e15;
            } catch (ExecutionException e16) {
                e = e16;
            } catch (TimeoutException e17) {
                e = e17;
            }
            zzj().F().b("Measurement manager api status result", num);
        }
        return this.f10300g.booleanValue();
    }

    public static void T(kb kbVar, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        q0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        kbVar.a(str, "_err", bundle);
    }

    private final void U(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z10) {
        int I0;
        String str4;
        int s10;
        p4 C;
        String c10;
        String a10;
        String str5;
        if (bundle == null) {
            return;
        }
        int q10 = a().q();
        int i10 = 0;
        for (String str6 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str6)) {
                I0 = !z10 ? I0(str6) : 0;
                if (I0 == 0) {
                    I0 = H0(str6);
                }
            } else {
                I0 = 0;
            }
            if (I0 != 0) {
                F(bundle, I0, str6, str6, I0 == 3 ? str6 : null);
                bundle.remove(str6);
            } else {
                if (b0(bundle.get(str6))) {
                    zzj().H().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str6);
                    s10 = 22;
                    str4 = str6;
                } else {
                    str4 = str6;
                    s10 = s(str, str2, str6, bundle.get(str6), bundle, list, z10, false);
                }
                if (s10 != 0 && !"_ev".equals(str4)) {
                    F(bundle, s10, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (E0(str4) && !h0(str4, wa.t.f29754d)) {
                    int i11 = i10 + 1;
                    if (W(231100000, true)) {
                        if (i11 > q10) {
                            if (zzot.zza() && a().n(e0.I0)) {
                                zzj().C().c("Item can't contain more than " + q10 + " item-scoped custom params", d().c(str2), d().a(bundle));
                                q0(bundle, 28);
                                bundle.remove(str4);
                            } else {
                                C = zzj().C();
                                c10 = d().c(str2);
                                a10 = d().a(bundle);
                                str5 = "Item cannot contain custom parameters";
                            }
                        }
                        i10 = i11;
                    } else {
                        C = zzj().C();
                        c10 = d().c(str2);
                        a10 = d().a(bundle);
                        str5 = "Item array not supported on client's version of Google Play Services (Android Only)";
                    }
                    C.c(str5, c10, a10);
                    q0(bundle, 23);
                    bundle.remove(str4);
                    i10 = i11;
                }
            }
        }
    }

    public static boolean X(Context context) {
        ActivityInfo receiverInfo;
        com.google.android.gms.common.internal.s.j(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean Y(Context context, boolean z10) {
        com.google.android.gms.common.internal.s.j(context);
        return w0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    public static boolean Z(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    public static boolean a0(Bundle bundle, int i10) {
        int i11 = 0;
        if (bundle.size() <= i10) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i11++;
            if (i11 > i10) {
                bundle.remove(str);
            }
        }
        return true;
    }

    public static boolean b0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean g0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            com.google.android.gms.common.internal.s.j(str);
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    private static boolean h0(String str, String[] strArr) {
        com.google.android.gms.common.internal.s.j(strArr);
        for (String str2 : strArr) {
            if (wa.h0.a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] k0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList<Bundle> o0(List<d> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (d dVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", dVar.f10043a);
            bundle.putString("origin", dVar.f10044b);
            bundle.putLong("creation_timestamp", dVar.f10046d);
            bundle.putString("name", dVar.f10045c.f10237b);
            wa.q.b(bundle, com.google.android.gms.common.internal.s.j(dVar.f10045c.u1()));
            bundle.putBoolean("active", dVar.f10047e);
            String str = dVar.f10048f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            d0 d0Var = dVar.f10049r;
            if (d0Var != null) {
                bundle.putString("timed_out_event_name", d0Var.f10054a);
                z zVar = d0Var.f10055b;
                if (zVar != null) {
                    bundle.putBundle("timed_out_event_params", zVar.w1());
                }
            }
            bundle.putLong("trigger_timeout", dVar.f10050s);
            d0 d0Var2 = dVar.f10051t;
            if (d0Var2 != null) {
                bundle.putString("triggered_event_name", d0Var2.f10054a);
                z zVar2 = d0Var2.f10055b;
                if (zVar2 != null) {
                    bundle.putBundle("triggered_event_params", zVar2.w1());
                }
            }
            bundle.putLong("triggered_timestamp", dVar.f10045c.f10238c);
            bundle.putLong("time_to_live", dVar.f10052u);
            d0 d0Var3 = dVar.f10053v;
            if (d0Var3 != null) {
                bundle.putString("expired_event_name", d0Var3.f10054a);
                z zVar3 = d0Var3.f10055b;
                if (zVar3 != null) {
                    bundle.putBundle("expired_event_params", zVar3.w1());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private final boolean p0(Context context, String str) {
        p4 B;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo f10 = na.e.a(context).f(str, 64);
            if (f10 == null || (signatureArr = f10.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e10) {
            e = e10;
            B = zzj().B();
            str2 = "Package name not found";
            B.b(str2, e);
            return true;
        } catch (CertificateException e11) {
            e = e11;
            B = zzj().B();
            str2 = "Error obtaining certificate";
            B.b(str2, e);
            return true;
        }
    }

    private static boolean q0(Bundle bundle, int i10) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int s(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.Object r19, android.os.Bundle r20, java.util.List<java.lang.String> r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ib.s(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public static Bundle[] s0(Object obj) {
        Object[] array;
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else {
            if (!(obj instanceof ArrayList)) {
                return null;
            }
            ArrayList arrayList = (ArrayList) obj;
            array = arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return (Bundle[]) array;
    }

    public static long t(long j10, long j11) {
        return (j10 + (j11 * 60000)) / 86400000;
    }

    public static int t0() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static long v(z zVar) {
        long j10 = 0;
        if (zVar == null) {
            return 0L;
        }
        Iterator<String> it = zVar.iterator();
        while (it.hasNext()) {
            if (zVar.y1(it.next()) instanceof Parcelable[]) {
                j10 += ((Parcelable[]) r3).length;
            }
        }
        return j10;
    }

    public static long w(byte[] bArr) {
        com.google.android.gms.common.internal.s.j(bArr);
        int i10 = 0;
        com.google.android.gms.common.internal.s.n(bArr.length > 0);
        long j10 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j10 += (bArr[length] & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    private static boolean w0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static Bundle y(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        if (parcelableArr[i10] instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelableArr[i10]);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        return bundle2;
    }

    public static boolean y0(String str) {
        String a10 = e0.f10091b0.a(null);
        return a10.equals("*") || Arrays.asList(a10.split(",")).contains(str);
    }

    public final boolean A0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return a().I().equals(str);
    }

    public final d0 B(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (q(str2) != 0) {
            zzj().B().b("Invalid conditional property event name", d().g(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle z12 = z(str, str2, bundle2, la.g.a("_o"), true);
        if (z10) {
            z12 = m0(z12);
        }
        com.google.android.gms.common.internal.s.j(z12);
        return new d0(str2, new z(z12), str3, j10);
    }

    public final int B0() {
        if (this.f10301h == null) {
            this.f10301h = Integer.valueOf(ca.g.f().a(zza()) / AdError.NETWORK_ERROR_CODE);
        }
        return this.f10301h.intValue();
    }

    public final long D0() {
        i();
        if (!y0(this.f10701a.w().A())) {
            return 0L;
        }
        long j10 = Build.VERSION.SDK_INT < 30 ? 4L : SdkExtensions.getExtensionVersion(30) < 4 ? 8L : t0() < e0.X.a(null).intValue() ? 16L : 0L;
        if (!z0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j10 |= 2;
        }
        if (j10 == 0 && !S0()) {
            j10 |= 64;
        }
        if (j10 == 0) {
            return 1L;
        }
        return j10;
    }

    public final URL E(long j10, String str, String str2, long j11, String str3) {
        try {
            com.google.android.gms.common.internal.s.f(str2);
            com.google.android.gms.common.internal.s.f(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j10), Integer.valueOf(B0())), str2, str, Long.valueOf(j11));
            if (str.equals(a().J())) {
                format = format.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat("&");
                }
                format = format.concat(str3);
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e10) {
            zzj().B().b("Failed to create BOW URL for Deferred Deep Link. exception", e10.getMessage());
            return null;
        }
    }

    public final boolean F0(String str) {
        List<ResolveInfo> queryIntentActivities;
        return (TextUtils.isEmpty(str) || (queryIntentActivities = zza().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || queryIntentActivities.isEmpty()) ? false : true;
    }

    public final void G(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            zzj().G().b("Params already contained engagement", Long.valueOf(j11));
        }
        bundle.putLong("_et", j10 + j11);
    }

    public final void H(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                f().I(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void I(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            zzj().H().c("Not putting event parameter. Invalid value type. name, type", d().f(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void J(zzcv zzcvVar, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f10701a.zzj().G().b("Error returning int value to wrapper", e10);
        }
    }

    public final void K(zzcv zzcvVar, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f10701a.zzj().G().b("Error returning long value to wrapper", e10);
        }
    }

    public final long K0() {
        long andIncrement;
        long j10;
        if (this.f10297d.get() != 0) {
            synchronized (this.f10297d) {
                this.f10297d.compareAndSet(-1L, 1L);
                andIncrement = this.f10297d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f10297d) {
            long nextLong = new Random(System.nanoTime() ^ zzb().a()).nextLong();
            int i10 = this.f10298e + 1;
            this.f10298e = i10;
            j10 = nextLong + i10;
        }
        return j10;
    }

    public final void L(zzcv zzcvVar, Bundle bundle) {
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f10701a.zzj().G().b("Error returning bundle value to wrapper", e10);
        }
    }

    public final n1.a L0() {
        if (this.f10299f == null) {
            this.f10299f = n1.a.a(zza());
        }
        return this.f10299f;
    }

    public final void M(zzcv zzcvVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f10701a.zzj().G().b("Error returning string value to wrapper", e10);
        }
    }

    public final void N(zzcv zzcvVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f10701a.zzj().G().b("Error returning bundle list to wrapper", e10);
        }
    }

    public final String N0() {
        byte[] bArr = new byte[16];
        P0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void O(zzcv zzcvVar, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f10701a.zzj().G().b("Error returning boolean value to wrapper", e10);
        }
    }

    public final void P(zzcv zzcvVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f10701a.zzj().G().b("Error returning byte array to wrapper", e10);
        }
    }

    public final SecureRandom P0() {
        i();
        if (this.f10296c == null) {
            this.f10296c = new SecureRandom();
        }
        return this.f10296c;
    }

    public final void Q(r4 r4Var, int i10) {
        int i11 = 0;
        for (String str : new TreeSet(r4Var.f10572d.keySet())) {
            if (E0(str) && (i11 = i11 + 1) > i10) {
                zzj().C().c("Event can't contain more than " + i10 + " params", d().c(r4Var.f10569a), d().a(r4Var.f10572d));
                q0(r4Var.f10572d, 5);
                r4Var.f10572d.remove(str);
            }
        }
    }

    public final boolean Q0() {
        i();
        return D0() == 1;
    }

    public final boolean R0() {
        try {
            zza().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void V(Parcelable[] parcelableArr, int i10, boolean z10) {
        int i11;
        com.google.android.gms.common.internal.s.j(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i12 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (E0(str) && !h0(str, wa.t.f29754d) && (i12 = i12 + 1) > i10) {
                    p4 C = zzj().C();
                    if (z10) {
                        C.c("Param can't contain more than " + i10 + " item-scoped custom parameters", d().f(str), d().a(bundle));
                        i11 = 28;
                    } else {
                        C.c("Param cannot contain item-scoped custom parameters", d().f(str), d().a(bundle));
                        i11 = 23;
                    }
                    q0(bundle, i11);
                    bundle.remove(str);
                }
            }
        }
    }

    public final boolean W(int i10, boolean z10) {
        Boolean R = this.f10701a.E().R();
        if (B0() < i10 / AdError.NETWORK_ERROR_CODE) {
            return (R == null || R.booleanValue()) ? false : true;
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    public final boolean c0(String str, double d10) {
        try {
            SharedPreferences.Editor edit = zza().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong(Constants.TIMESTAMP, Double.doubleToRawLongBits(d10));
            return edit.commit();
        } catch (RuntimeException e10) {
            zzj().B().b("Failed to persist Deferred Deep Link. exception", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    public final boolean d0(String str, int i10, String str2) {
        if (str2 == null) {
            zzj().C().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        zzj().C().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    public final boolean e0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (M0(str)) {
                return true;
            }
            if (this.f10701a.m()) {
                zzj().C().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", n4.q(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.f10701a.m()) {
                zzj().C().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (M0(str2)) {
            return true;
        }
        zzj().C().b("Invalid admob_app_id. Analytics disabled.", n4.q(str2));
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    public final boolean f0(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i10) {
                zzj().H().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final boolean i0(String str, String[] strArr, String str2) {
        return j0(str, strArr, null, str2);
    }

    public final boolean j0(String str, String[] strArr, String[] strArr2, String str2) {
        boolean z10;
        if (str2 == null) {
            zzj().C().b("Name is required and can't be null. Type", str);
            return false;
        }
        com.google.android.gms.common.internal.s.j(str2);
        String[] strArr3 = f10294i;
        int length = strArr3.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            }
            if (str2.startsWith(strArr3[i10])) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            zzj().C().c("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr == null || !h0(str2, strArr) || (strArr2 != null && h0(str2, strArr2))) {
            return true;
        }
        zzj().C().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final int l0(String str) {
        if (!r0("user property", str)) {
            return 6;
        }
        if (i0("user property", wa.s.f29749a, str)) {
            return !d0("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    public final Bundle m0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object n02 = n0(str, bundle.get(str));
                if (n02 == null) {
                    zzj().H().b("Param value can't be null", d().f(str));
                } else {
                    I(bundle2, str, n02);
                }
            }
        }
        return bundle2;
    }

    @Override // com.google.android.gms.measurement.internal.u6
    protected final boolean n() {
        return true;
    }

    public final Object n0(String str, Object obj) {
        if ("_ev".equals(str)) {
            return C(a().r(this.f10701a.w().A()), obj, true, true);
        }
        return C(C0(str) ? a().r(this.f10701a.w().A()) : a().o(this.f10701a.w().A()), obj, false, true);
    }

    @Override // com.google.android.gms.measurement.internal.u6
    protected final void o() {
        i();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                zzj().G().a("Utils falling back to Random for random id");
            }
        }
        this.f10297d.set(nextLong);
    }

    public final int p(int i10) {
        return ca.g.f().h(zza(), ca.k.f6983a);
    }

    public final int q(String str) {
        if (!r0("event", str)) {
            return 2;
        }
        if (j0("event", wa.r.f29745a, wa.r.f29746b, str)) {
            return !d0("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    public final int r(String str, Object obj) {
        return f0("_ldl".equals(str) ? "user property referrer" : "user property", str, J0(str), obj) ? 0 : 7;
    }

    public final boolean r0(String str, String str2) {
        if (str2 == null) {
            zzj().C().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzj().C().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            zzj().C().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                zzj().C().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0065 -> B:8:0x0072). Please report as a decompilation issue!!! */
    public final long u(Context context, String str) {
        i();
        com.google.android.gms.common.internal.s.j(context);
        com.google.android.gms.common.internal.s.f(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest O0 = O0();
        long j10 = -1;
        if (O0 == null) {
            zzj().B().a("Could not get MD5 instance");
        } else {
            if (packageManager != null) {
                try {
                } catch (PackageManager.NameNotFoundException e10) {
                    zzj().B().b("Package name not found", e10);
                }
                if (!p0(context, str)) {
                    Signature[] signatureArr = na.e.a(context).f(zza().getPackageName(), 64).signatures;
                    if (signatureArr == null || signatureArr.length <= 0) {
                        zzj().G().a("Could not get signatures");
                    } else {
                        j10 = w(O0.digest(signatureArr[0].toByteArray()));
                    }
                }
            }
            j10 = 0;
        }
        return j10;
    }

    public final long u0(String str) {
        if (zza().getPackageManager() == null) {
            return 0L;
        }
        int i10 = 0;
        try {
            ApplicationInfo c10 = na.e.a(zza()).c(str, 0);
            if (c10 != null) {
                i10 = c10.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            zzj().E().b("PackageManager failed to find running app: app_id", str);
        }
        return i10;
    }

    public final Object v0(String str, Object obj) {
        boolean equals = "_ldl".equals(str);
        int J0 = J0(str);
        return equals ? C(J0, obj, true, false) : C(J0, obj, false, false);
    }

    public final Bundle x(Uri uri, boolean z10, boolean z11) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = z11 ? uri.getQueryParameter("gbraid") : null;
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = z10 ? uri.getQueryParameter("sfmc_id") : null;
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && ((!z11 || TextUtils.isEmpty(str5)) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && (!z10 || TextUtils.isEmpty(str9)))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
            } else {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (z11 && !TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("campaign_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter6 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("source_platform", queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("creative_format", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("marketing_tactic", queryParameter8);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (z10 && !TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            zzj().G().b("Install referrer url isn't a hierarchical URI", e10);
            return null;
        }
    }

    public final boolean x0(String str, String str2) {
        if (str2 == null) {
            zzj().C().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzj().C().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            zzj().C().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                zzj().C().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final Bundle z(String str, String str2, Bundle bundle, List<String> list, boolean z10) {
        int I0;
        int i10;
        ib ibVar = this;
        boolean h02 = h0(str2, wa.r.f29748d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int z11 = a().z();
        int i11 = 0;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                I0 = !z10 ? ibVar.I0(str3) : 0;
                if (I0 == 0) {
                    I0 = ibVar.H0(str3);
                }
            } else {
                I0 = 0;
            }
            if (I0 != 0) {
                F(bundle2, I0, str3, str3, I0 == 3 ? str3 : null);
                bundle2.remove(str3);
                i10 = z11;
            } else {
                i10 = z11;
                int s10 = s(str, str2, str3, bundle.get(str3), bundle2, list, z10, h02);
                if (s10 == 17) {
                    F(bundle2, s10, str3, str3, Boolean.FALSE);
                } else if (s10 != 0 && !"_ev".equals(str3)) {
                    F(bundle2, s10, s10 == 21 ? str2 : str3, str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (E0(str3)) {
                    int i12 = i11 + 1;
                    if (i12 > i10) {
                        zzj().C().c("Event can't contain more than " + i10 + " params", d().c(str2), d().a(bundle));
                        q0(bundle2, 5);
                        bundle2.remove(str3);
                    }
                    i11 = i12;
                }
            }
            z11 = i10;
            ibVar = this;
        }
        return bundle2;
    }

    public final boolean z0(String str) {
        i();
        if (na.e.a(zza()).a(str) == 0) {
            return true;
        }
        zzj().A().b("Permission not granted", str);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ la.f zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 zzl() {
        return super.zzl();
    }
}
