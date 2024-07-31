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
import ca.C1904g;
import ca.C1912k;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.C5276s;
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
import la.C9462g;
import la.InterfaceC9461f;
import na.C9696e;
import p244n1.AbstractC9630a;
import p418wa.C12108h0;
import p418wa.C12119q;
import p418wa.C12120r;
import p418wa.C12121s;
import p418wa.C12122t;

/* renamed from: com.google.android.gms.measurement.internal.ib */
/* loaded from: classes2.dex */
public final class C5537ib extends AbstractC5688u6 {

    /* renamed from: i */
    private static final String[] f11466i = {"firebase_", "google_", "ga_"};

    /* renamed from: j */
    private static final String[] f11467j = {"_err"};

    /* renamed from: c */
    private SecureRandom f11468c;

    /* renamed from: d */
    private final AtomicLong f11469d;

    /* renamed from: e */
    private int f11470e;

    /* renamed from: f */
    private AbstractC9630a f11471f;

    /* renamed from: g */
    private Boolean f11472g;

    /* renamed from: h */
    private Integer f11473h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5537ib(C5712w5 c5712w5) {
        super(c5712w5);
        this.f11473h = null;
        this.f11469d = new AtomicLong(0L);
    }

    /* renamed from: A */
    public static Bundle m13970A(List<C5524hb> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (C5524hb c5524hb : list) {
            String str = c5524hb.f11413f;
            if (str != null) {
                bundle.putString(c5524hb.f11409b, str);
            } else {
                Long l10 = c5524hb.f11411d;
                if (l10 != null) {
                    bundle.putLong(c5524hb.f11409b, l10.longValue());
                } else {
                    Double d10 = c5524hb.f11415s;
                    if (d10 != null) {
                        bundle.putDouble(c5524hb.f11409b, d10.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: C */
    private final Object m13971C(int i10, Object obj, boolean z10, boolean z11) {
        Bundle m14039m0;
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
            return m13973D(String.valueOf(obj), i10, z10);
        }
        if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if ((parcelable instanceof Bundle) && (m14039m0 = m14039m0((Bundle) parcelable)) != null && !m14039m0.isEmpty()) {
                arrayList.add(m14039m0);
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C0 */
    public static boolean m13972C0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: D */
    public static String m13973D(String str, int i10, boolean z10) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E0 */
    public static boolean m13974E0(String str) {
        C5276s.m13320f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* renamed from: F */
    private static void m13975F(Bundle bundle, int i10, String str, String str2, Object obj) {
        if (m13997q0(bundle, i10)) {
            bundle.putString("_ev", m13973D(str, 40, true));
            if (obj != null) {
                C5276s.m13324j(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    /* renamed from: G0 */
    public static boolean m13976G0(String str) {
        for (String str2 : f11467j) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H0 */
    private final int m13977H0(String str) {
        if (!m14046r0("event param", str)) {
            return 3;
        }
        if (m14036i0("event param", null, str)) {
            return !m14033d0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    /* renamed from: I0 */
    private final int m13978I0(String str) {
        if (!m14051x0("event param", str)) {
            return 3;
        }
        if (m14036i0("event param", null, str)) {
            return !m14033d0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    /* renamed from: J0 */
    private static int m13979J0(String str) {
        return "_ldl".equals(str) ? RecognitionOptions.PDF417 : "_id".equals(str) ? RecognitionOptions.QR_CODE : ("_lgclid".equals(str) || "_gbraid".equals(str)) ? 100 : 36;
    }

    /* renamed from: M0 */
    private static boolean m13980M0(String str) {
        C5276s.m13324j(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O0 */
    public static MessageDigest m13981O0() {
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

    /* renamed from: R */
    public static void m13982R(C5625p8 c5625p8, Bundle bundle, boolean z10) {
        if (bundle == null || c5625p8 == null || (bundle.containsKey("_sc") && !z10)) {
            if (bundle != null && c5625p8 == null && z10) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = c5625p8.f11696a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = c5625p8.f11697b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", c5625p8.f11698c);
    }

    /* renamed from: S */
    public static void m13983S(InterfaceC5563kb interfaceC5563kb, int i10, String str, String str2, int i11) {
        m13985T(interfaceC5563kb, null, i10, str, str2, i11);
    }

    /* renamed from: S0 */
    private final boolean m13984S0() {
        Integer num;
        if (this.f11472g == null) {
            AbstractC9630a m14020L0 = m14020L0();
            boolean z10 = false;
            if (m14020L0 == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = m14020L0.mo28830b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z10 = true;
                        }
                    } catch (InterruptedException e10) {
                        e = e10;
                        num2 = num;
                        zzj().m14187G().m14219b("Measurement manager api exception", e);
                        this.f11472g = Boolean.FALSE;
                        num = num2;
                        zzj().m14186F().m14219b("Measurement manager api status result", num);
                        return this.f11472g.booleanValue();
                    } catch (CancellationException e11) {
                        e = e11;
                        num2 = num;
                        zzj().m14187G().m14219b("Measurement manager api exception", e);
                        this.f11472g = Boolean.FALSE;
                        num = num2;
                        zzj().m14186F().m14219b("Measurement manager api status result", num);
                        return this.f11472g.booleanValue();
                    } catch (ExecutionException e12) {
                        e = e12;
                        num2 = num;
                        zzj().m14187G().m14219b("Measurement manager api exception", e);
                        this.f11472g = Boolean.FALSE;
                        num = num2;
                        zzj().m14186F().m14219b("Measurement manager api status result", num);
                        return this.f11472g.booleanValue();
                    } catch (TimeoutException e13) {
                        e = e13;
                        num2 = num;
                        zzj().m14187G().m14219b("Measurement manager api exception", e);
                        this.f11472g = Boolean.FALSE;
                        num = num2;
                        zzj().m14186F().m14219b("Measurement manager api status result", num);
                        return this.f11472g.booleanValue();
                    }
                }
                this.f11472g = Boolean.valueOf(z10);
            } catch (InterruptedException e14) {
                e = e14;
            } catch (CancellationException e15) {
                e = e15;
            } catch (ExecutionException e16) {
                e = e16;
            } catch (TimeoutException e17) {
                e = e17;
            }
            zzj().m14186F().m14219b("Measurement manager api status result", num);
        }
        return this.f11472g.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public static void m13985T(InterfaceC5563kb interfaceC5563kb, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        m13997q0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        interfaceC5563kb.mo13719a(str, "_err", bundle);
    }

    /* renamed from: U */
    private final void m13986U(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z10) {
        int m13978I0;
        String str4;
        int m13998s;
        C5621p4 m14183C;
        String m14167c;
        String m14165a;
        String str5;
        if (bundle == null) {
            return;
        }
        int m13903q = mo13672a().m13903q();
        int i10 = 0;
        for (String str6 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str6)) {
                m13978I0 = !z10 ? m13978I0(str6) : 0;
                if (m13978I0 == 0) {
                    m13978I0 = m13977H0(str6);
                }
            } else {
                m13978I0 = 0;
            }
            if (m13978I0 != 0) {
                m13975F(bundle, m13978I0, str6, str6, m13978I0 == 3 ? str6 : null);
                bundle.remove(str6);
            } else {
                if (m13991b0(bundle.get(str6))) {
                    zzj().m14188H().m14221d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str6);
                    m13998s = 22;
                    str4 = str6;
                } else {
                    str4 = str6;
                    m13998s = m13998s(str, str2, str6, bundle.get(str6), bundle, list, z10, false);
                }
                if (m13998s != 0 && !"_ev".equals(str4)) {
                    m13975F(bundle, m13998s, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (m13974E0(str4) && !m13993h0(str4, C12122t.f32219d)) {
                    int i11 = i10 + 1;
                    if (m14031W(231100000, true)) {
                        if (i11 > m13903q) {
                            if (zzot.zza() && mo13672a().m13900n(C5474e0.f11224I0)) {
                                zzj().m14183C().m14220c("Item can't contain more than " + m13903q + " item-scoped custom params", mo13677d().m14167c(str2), mo13677d().m14165a(bundle));
                                m13997q0(bundle, 28);
                                bundle.remove(str4);
                            } else {
                                m14183C = zzj().m14183C();
                                m14167c = mo13677d().m14167c(str2);
                                m14165a = mo13677d().m14165a(bundle);
                                str5 = "Item cannot contain custom parameters";
                            }
                        }
                        i10 = i11;
                    } else {
                        m14183C = zzj().m14183C();
                        m14167c = mo13677d().m14167c(str2);
                        m14165a = mo13677d().m14165a(bundle);
                        str5 = "Item array not supported on client's version of Google Play Services (Android Only)";
                    }
                    m14183C.m14220c(str5, m14167c, m14165a);
                    m13997q0(bundle, 23);
                    bundle.remove(str4);
                    i10 = i11;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public static boolean m13987X(Context context) {
        ActivityInfo receiverInfo;
        C5276s.m13324j(context);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public static boolean m13988Y(Context context, boolean z10) {
        C5276s.m13324j(context);
        return m14004w0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public static boolean m13989Z(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public static boolean m13990a0(Bundle bundle, int i10) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public static boolean m13991b0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public static boolean m13992g0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            C5276s.m13324j(str);
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

    /* renamed from: h0 */
    private static boolean m13993h0(String str, String[] strArr) {
        C5276s.m13324j(strArr);
        for (String str2 : strArr) {
            if (C12108h0.m38849a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0 */
    public static byte[] m13994k0(Parcelable parcelable) {
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

    /* renamed from: o0 */
    public static ArrayList<Bundle> m13995o0(List<C5460d> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (C5460d c5460d : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c5460d.f11163a);
            bundle.putString("origin", c5460d.f11164b);
            bundle.putLong("creation_timestamp", c5460d.f11166d);
            bundle.putString("name", c5460d.f11165c.f11409b);
            C12119q.m38855b(bundle, C5276s.m13324j(c5460d.f11165c.m13921u1()));
            bundle.putBoolean("active", c5460d.f11167e);
            String str = c5460d.f11168f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C5461d0 c5461d0 = c5460d.f11169r;
            if (c5461d0 != null) {
                bundle.putString("timed_out_event_name", c5461d0.f11174a);
                C5742z c5742z = c5461d0.f11175b;
                if (c5742z != null) {
                    bundle.putBundle("timed_out_event_params", c5742z.m14603w1());
                }
            }
            bundle.putLong("trigger_timeout", c5460d.f11170s);
            C5461d0 c5461d02 = c5460d.f11171t;
            if (c5461d02 != null) {
                bundle.putString("triggered_event_name", c5461d02.f11174a);
                C5742z c5742z2 = c5461d02.f11175b;
                if (c5742z2 != null) {
                    bundle.putBundle("triggered_event_params", c5742z2.m14603w1());
                }
            }
            bundle.putLong("triggered_timestamp", c5460d.f11165c.f11410c);
            bundle.putLong("time_to_live", c5460d.f11172u);
            C5461d0 c5461d03 = c5460d.f11173v;
            if (c5461d03 != null) {
                bundle.putString("expired_event_name", c5461d03.f11174a);
                C5742z c5742z3 = c5461d03.f11175b;
                if (c5742z3 != null) {
                    bundle.putBundle("expired_event_params", c5742z3.m14603w1());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: p0 */
    private final boolean m13996p0(Context context, String str) {
        C5621p4 m14182B;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo m29077f = C9696e.m29080a(context).m29077f(str, 64);
            if (m29077f == null || (signatureArr = m29077f.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e10) {
            e = e10;
            m14182B = zzj().m14182B();
            str2 = "Package name not found";
            m14182B.m14219b(str2, e);
            return true;
        } catch (CertificateException e11) {
            e = e11;
            m14182B = zzj().m14182B();
            str2 = "Error obtaining certificate";
            m14182B.m14219b(str2, e);
            return true;
        }
    }

    /* renamed from: q0 */
    private static boolean m13997q0(Bundle bundle, int i10) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int m13998s(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.Object r19, android.os.Bundle r20, java.util.List<java.lang.String> r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5537ib.m13998s(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s0 */
    public static Bundle[] m13999s0(Object obj) {
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

    /* renamed from: t */
    public static long m14000t(long j10, long j11) {
        return (j10 + (j11 * 60000)) / 86400000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t0 */
    public static int m14001t0() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    /* renamed from: v */
    public static long m14002v(C5742z c5742z) {
        long j10 = 0;
        if (c5742z == null) {
            return 0L;
        }
        Iterator<String> it = c5742z.iterator();
        while (it.hasNext()) {
            if (c5742z.m14605y1(it.next()) instanceof Parcelable[]) {
                j10 += ((Parcelable[]) r3).length;
            }
        }
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static long m14003w(byte[] bArr) {
        C5276s.m13324j(bArr);
        int i10 = 0;
        C5276s.m13328n(bArr.length > 0);
        long j10 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j10 += (bArr[length] & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    /* renamed from: w0 */
    private static boolean m14004w0(Context context, String str) {
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

    /* renamed from: y */
    public static Bundle m14005y(Bundle bundle) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y0 */
    public static boolean m14006y0(String str) {
        String m13918a = C5474e0.f11263b0.m13918a(null);
        return m13918a.equals("*") || Arrays.asList(m13918a.split(",")).contains(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A0 */
    public final boolean m14007A0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return mo13672a().m13889I().equals(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public final C5461d0 m14008B(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (m14044q(str2) != 0) {
            zzj().m14182B().m14219b("Invalid conditional property event name", mo13677d().m14169g(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle m14052z = m14052z(str, str2, bundle2, C9462g.m28133a("_o"), true);
        if (z10) {
            m14052z = m14039m0(m14052z);
        }
        C5276s.m13324j(m14052z);
        return new C5461d0(str2, new C5742z(m14052z), str3, j10);
    }

    /* renamed from: B0 */
    public final int m14009B0() {
        if (this.f11473h == null) {
            this.f11473h = Integer.valueOf(C1904g.m10086f().m10087a(zza()) / AdError.NETWORK_ERROR_CODE);
        }
        return this.f11473h.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D0 */
    public final long m14010D0() {
        mo13687i();
        if (!m14006y0(this.f11899a.m14523w().m13923A())) {
            return 0L;
        }
        long j10 = Build.VERSION.SDK_INT < 30 ? 4L : SdkExtensions.getExtensionVersion(30) < 4 ? 8L : m14001t0() < C5474e0.f11253X.m13918a(null).intValue() ? 16L : 0L;
        if (!m14053z0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j10 |= 2;
        }
        if (j10 == 0 && !m13984S0()) {
            j10 |= 64;
        }
        if (j10 == 0) {
            return 1L;
        }
        return j10;
    }

    /* renamed from: E */
    public final URL m14011E(long j10, String str, String str2, long j11, String str3) {
        try {
            C5276s.m13320f(str2);
            C5276s.m13320f(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j10), Integer.valueOf(m14009B0())), str2, str, Long.valueOf(j11));
            if (str.equals(mo13672a().m13890J())) {
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
            zzj().m14182B().m14219b("Failed to create BOW URL for Deferred Deep Link. exception", e10.getMessage());
            return null;
        }
    }

    /* renamed from: F0 */
    public final boolean m14012F0(String str) {
        List<ResolveInfo> queryIntentActivities;
        return (TextUtils.isEmpty(str) || (queryIntentActivities = zza().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || queryIntentActivities.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public final void m14013G(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            zzj().m14187G().m14219b("Params already contained engagement", Long.valueOf(j11));
        }
        bundle.putLong("_et", j10 + j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public final void m14014H(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                mo13681f().m14015I(bundle, str, bundle2.get(str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final void m14015I(Bundle bundle, String str, Object obj) {
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
            zzj().m14188H().m14220c("Not putting event parameter. Invalid value type. name, type", mo13677d().m14168f(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    /* renamed from: J */
    public final void m14016J(zzcv zzcvVar, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f11899a.zzj().m14187G().m14219b("Error returning int value to wrapper", e10);
        }
    }

    /* renamed from: K */
    public final void m14017K(zzcv zzcvVar, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f11899a.zzj().m14187G().m14219b("Error returning long value to wrapper", e10);
        }
    }

    /* renamed from: K0 */
    public final long m14018K0() {
        long andIncrement;
        long j10;
        if (this.f11469d.get() != 0) {
            synchronized (this.f11469d) {
                this.f11469d.compareAndSet(-1L, 1L);
                andIncrement = this.f11469d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f11469d) {
            long nextLong = new Random(System.nanoTime() ^ zzb().mo28130a()).nextLong();
            int i10 = this.f11470e + 1;
            this.f11470e = i10;
            j10 = nextLong + i10;
        }
        return j10;
    }

    /* renamed from: L */
    public final void m14019L(zzcv zzcvVar, Bundle bundle) {
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f11899a.zzj().m14187G().m14219b("Error returning bundle value to wrapper", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0 */
    public final AbstractC9630a m14020L0() {
        if (this.f11471f == null) {
            this.f11471f = AbstractC9630a.m28829a(zza());
        }
        return this.f11471f;
    }

    /* renamed from: M */
    public final void m14021M(zzcv zzcvVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f11899a.zzj().m14187G().m14219b("Error returning string value to wrapper", e10);
        }
    }

    /* renamed from: N */
    public final void m14022N(zzcv zzcvVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f11899a.zzj().m14187G().m14219b("Error returning bundle list to wrapper", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N0 */
    public final String m14023N0() {
        byte[] bArr = new byte[16];
        m14026P0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* renamed from: O */
    public final void m14024O(zzcv zzcvVar, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f11899a.zzj().m14187G().m14219b("Error returning boolean value to wrapper", e10);
        }
    }

    /* renamed from: P */
    public final void m14025P(zzcv zzcvVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcvVar.zza(bundle);
        } catch (RemoteException e10) {
            this.f11899a.zzj().m14187G().m14219b("Error returning byte array to wrapper", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P0 */
    public final SecureRandom m14026P0() {
        mo13687i();
        if (this.f11468c == null) {
            this.f11468c = new SecureRandom();
        }
        return this.f11468c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void m14027Q(C5647r4 c5647r4, int i10) {
        int i11 = 0;
        for (String str : new TreeSet(c5647r4.f11759d.keySet())) {
            if (m13974E0(str) && (i11 = i11 + 1) > i10) {
                zzj().m14183C().m14220c("Event can't contain more than " + i10 + " params", mo13677d().m14167c(c5647r4.f11756a), mo13677d().m14165a(c5647r4.f11759d));
                m13997q0(c5647r4.f11759d, 5);
                c5647r4.f11759d.remove(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public final boolean m14028Q0() {
        mo13687i();
        return m14010D0() == 1;
    }

    /* renamed from: R0 */
    public final boolean m14029R0() {
        try {
            zza().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public final void m14030V(Parcelable[] parcelableArr, int i10, boolean z10) {
        int i11;
        C5276s.m13324j(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i12 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (m13974E0(str) && !m13993h0(str, C12122t.f32219d) && (i12 = i12 + 1) > i10) {
                    C5621p4 m14183C = zzj().m14183C();
                    if (z10) {
                        m14183C.m14220c("Param can't contain more than " + i10 + " item-scoped custom parameters", mo13677d().m14168f(str), mo13677d().m14165a(bundle));
                        i11 = 28;
                    } else {
                        m14183C.m14220c("Param cannot contain item-scoped custom parameters", mo13677d().m14168f(str), mo13677d().m14165a(bundle));
                        i11 = 23;
                    }
                    m13997q0(bundle, i11);
                    bundle.remove(str);
                }
            }
        }
    }

    /* renamed from: W */
    public final boolean m14031W(int i10, boolean z10) {
        Boolean m14401R = this.f11899a.m14498E().m14401R();
        if (m14009B0() < i10 / AdError.NETWORK_ERROR_CODE) {
            return (m14401R == null || m14401R.booleanValue()) ? false : true;
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5486f mo13672a() {
        return super.mo13672a();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5730y mo13675c() {
        return super.mo13675c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final boolean m14032c0(String str, double d10) {
        try {
            SharedPreferences.Editor edit = zza().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong(Constants.TIMESTAMP, Double.doubleToRawLongBits(d10));
            return edit.commit();
        } catch (RuntimeException e10) {
            zzj().m14182B().m14219b("Failed to persist Deferred Deep Link. exception", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5582m4 mo13677d() {
        return super.mo13677d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public final boolean m14033d0(String str, int i10, String str2) {
        if (str2 == null) {
            zzj().m14183C().m14219b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        zzj().m14183C().m14221d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C5735y4 mo13679e() {
        return super.mo13679e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final boolean m14034e0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (m13980M0(str)) {
                return true;
            }
            if (this.f11899a.m14514m()) {
                zzj().m14183C().m14219b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C5595n4.m14174q(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.f11899a.m14514m()) {
                zzj().m14183C().m14218a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (m13980M0(str2)) {
            return true;
        }
        zzj().m14183C().m14219b("Invalid admob_app_id. Analytics disabled.", C5595n4.m14174q(str2));
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C5537ib mo13681f() {
        return super.mo13681f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final boolean m14035f0(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i10) {
                zzj().m14188H().m14221d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo13683g() {
        super.mo13683g();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo13685h() {
        super.mo13685h();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo13687i() {
        super.mo13687i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final boolean m14036i0(String str, String[] strArr, String str2) {
        return m14037j0(str, strArr, null, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final boolean m14037j0(String str, String[] strArr, String[] strArr2, String str2) {
        boolean z10;
        if (str2 == null) {
            zzj().m14183C().m14219b("Name is required and can't be null. Type", str);
            return false;
        }
        C5276s.m13324j(str2);
        String[] strArr3 = f11466i;
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
            zzj().m14183C().m14220c("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr == null || !m13993h0(str2, strArr) || (strArr2 != null && m13993h0(str2, strArr2))) {
            return true;
        }
        zzj().m14183C().m14220c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l0 */
    public final int m14038l0(String str) {
        if (!m14046r0("user property", str)) {
            return 6;
        }
        if (m14036i0("user property", C12121s.f32214a, str)) {
            return !m14033d0("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m0 */
    public final Bundle m14039m0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object m14041n0 = m14041n0(str, bundle.get(str));
                if (m14041n0 == null) {
                    zzj().m14188H().m14219b("Param value can't be null", mo13677d().m14168f(str));
                } else {
                    m14015I(bundle2, str, m14041n0);
                }
            }
        }
        return bundle2;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5688u6
    /* renamed from: n */
    protected final boolean mo14040n() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n0 */
    public final Object m14041n0(String str, Object obj) {
        if ("_ev".equals(str)) {
            return m13971C(mo13672a().m13904r(this.f11899a.m14523w().m13923A()), obj, true, true);
        }
        return m13971C(m13972C0(str) ? mo13672a().m13904r(this.f11899a.m14523w().m13923A()) : mo13672a().m13901o(this.f11899a.m14523w().m13923A()), obj, false, true);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5688u6
    /* renamed from: o */
    protected final void mo14042o() {
        mo13687i();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                zzj().m14187G().m14218a("Utils falling back to Random for random id");
            }
        }
        this.f11469d.set(nextLong);
    }

    /* renamed from: p */
    public final int m14043p(int i10) {
        return C1904g.m10086f().mo10072h(zza(), C1912k.f7932a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final int m14044q(String str) {
        if (!m14046r0("event", str)) {
            return 2;
        }
        if (m14037j0("event", C12120r.f32210a, C12120r.f32211b, str)) {
            return !m14033d0("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final int m14045r(String str, Object obj) {
        return m14035f0("_ldl".equals(str) ? "user property referrer" : "user property", str, m13979J0(str), obj) ? 0 : 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r0 */
    public final boolean m14046r0(String str, String str2) {
        if (str2 == null) {
            zzj().m14183C().m14219b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzj().m14183C().m14219b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            zzj().m14183C().m14220c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                zzj().m14183C().m14220c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0065 -> B:8:0x0072). Please report as a decompilation issue!!! */
    /* renamed from: u */
    public final long m14047u(Context context, String str) {
        mo13687i();
        C5276s.m13324j(context);
        C5276s.m13320f(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest m13981O0 = m13981O0();
        long j10 = -1;
        if (m13981O0 == null) {
            zzj().m14182B().m14218a("Could not get MD5 instance");
        } else {
            if (packageManager != null) {
                try {
                } catch (PackageManager.NameNotFoundException e10) {
                    zzj().m14182B().m14219b("Package name not found", e10);
                }
                if (!m13996p0(context, str)) {
                    Signature[] signatureArr = C9696e.m29080a(context).m29077f(zza().getPackageName(), 64).signatures;
                    if (signatureArr == null || signatureArr.length <= 0) {
                        zzj().m14187G().m14218a("Could not get signatures");
                    } else {
                        j10 = m14003w(m13981O0.digest(signatureArr[0].toByteArray()));
                    }
                }
            }
            j10 = 0;
        }
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u0 */
    public final long m14048u0(String str) {
        if (zza().getPackageManager() == null) {
            return 0L;
        }
        int i10 = 0;
        try {
            ApplicationInfo m29074c = C9696e.m29080a(zza()).m29074c(str, 0);
            if (m29074c != null) {
                i10 = m29074c.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            zzj().m14185E().m14219b("PackageManager failed to find running app: app_id", str);
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v0 */
    public final Object m14049v0(String str, Object obj) {
        boolean equals = "_ldl".equals(str);
        int m13979J0 = m13979J0(str);
        return equals ? m13971C(m13979J0, obj, true, false) : m13971C(m13979J0, obj, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final Bundle m14050x(Uri uri, boolean z10, boolean z11) {
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
            zzj().m14187G().m14219b("Install referrer url isn't a hierarchical URI", e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0 */
    public final boolean m14051x0(String str, String str2) {
        if (str2 == null) {
            zzj().m14183C().m14219b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzj().m14183C().m14219b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            zzj().m14183C().m14220c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                zzj().m14183C().m14220c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public final Bundle m14052z(String str, String str2, Bundle bundle, List<String> list, boolean z10) {
        int m13978I0;
        int i10;
        C5537ib c5537ib = this;
        boolean m13993h0 = m13993h0(str2, C12120r.f32213d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int m13912z = mo13672a().m13912z();
        int i11 = 0;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                m13978I0 = !z10 ? c5537ib.m13978I0(str3) : 0;
                if (m13978I0 == 0) {
                    m13978I0 = c5537ib.m13977H0(str3);
                }
            } else {
                m13978I0 = 0;
            }
            if (m13978I0 != 0) {
                m13975F(bundle2, m13978I0, str3, str3, m13978I0 == 3 ? str3 : null);
                bundle2.remove(str3);
                i10 = m13912z;
            } else {
                i10 = m13912z;
                int m13998s = m13998s(str, str2, str3, bundle.get(str3), bundle2, list, z10, m13993h0);
                if (m13998s == 17) {
                    m13975F(bundle2, m13998s, str3, str3, Boolean.FALSE);
                } else if (m13998s != 0 && !"_ev".equals(str3)) {
                    m13975F(bundle2, m13998s, m13998s == 21 ? str2 : str3, str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (m13974E0(str3)) {
                    int i12 = i11 + 1;
                    if (i12 > i10) {
                        zzj().m14183C().m14220c("Event can't contain more than " + i10 + " params", mo13677d().m14167c(str2), mo13677d().m14165a(bundle));
                        m13997q0(bundle2, 5);
                        bundle2.remove(str3);
                    }
                    i11 = i12;
                }
            }
            m13912z = i10;
            c5537ib = this;
        }
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z0 */
    public final boolean m14053z0(String str) {
        mo13687i();
        if (C9696e.m29080a(zza()).m29072a(str) == 0) {
            return true;
        }
        zzj().m14181A().m14219b("Permission not granted", str);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ InterfaceC9461f zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5473e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5595n4 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5635q5 zzl() {
        return super.zzl();
    }
}
