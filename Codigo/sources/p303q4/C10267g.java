package p303q4;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.Window;
import com.facebook.internal.C4634n0;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C9308a0;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;
import p152i4.C7799e0;

/* renamed from: q4.g */
/* loaded from: classes.dex */
public final class C10267g {

    /* renamed from: a */
    public static final C10267g f25489a = new C10267g();

    private C10267g() {
    }

    /* renamed from: a */
    public static final void m30744a() {
    }

    /* renamed from: b */
    public static final void m30745b() {
    }

    /* renamed from: c */
    public static final String m30746c(byte[] bytes) {
        C9322n.m27781e(bytes, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        int length = bytes.length;
        int i10 = 0;
        while (i10 < length) {
            byte b10 = bytes[i10];
            i10++;
            C9308a0 c9308a0 = C9308a0.f22565a;
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            C9322n.m27780d(format, "java.lang.String.format(format, *args)");
            stringBuffer.append(format);
        }
        String stringBuffer2 = stringBuffer.toString();
        C9322n.m27780d(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    /* renamed from: d */
    public static final String m30747d() {
        Context m23860l = C7799e0.m23860l();
        try {
            String str = m23860l.getPackageManager().getPackageInfo(m23860l.getPackageName(), 0).versionName;
            C9322n.m27780d(str, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* renamed from: e */
    public static final View m30748e(Activity activity) {
        if (C0033a.m107d(C10267g.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C10267g.class);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (r0 == false) goto L18;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m30749f() {
        /*
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "FINGERPRINT"
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            java.lang.String r2 = "generic"
            r3 = 0
            r4 = 2
            r5 = 0
            boolean r6 = p450xk.C12515g.m40978E(r0, r2, r3, r4, r5)
            if (r6 != 0) goto L73
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            java.lang.String r1 = "unknown"
            boolean r0 = p450xk.C12515g.m40978E(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L73
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            java.lang.String r6 = "google_sdk"
            boolean r7 = p450xk.C12515g.m40983J(r0, r6, r3, r4, r5)
            if (r7 != 0) goto L73
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            java.lang.String r7 = "Emulator"
            boolean r7 = p450xk.C12515g.m40983J(r0, r7, r3, r4, r5)
            if (r7 != 0) goto L73
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            java.lang.String r1 = "Android SDK built for x86"
            boolean r0 = p450xk.C12515g.m40983J(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L73
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            java.lang.String r1 = "Genymotion"
            boolean r0 = p450xk.C12515g.m40983J(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L73
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "BRAND"
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            boolean r0 = p450xk.C12515g.m40978E(r0, r2, r3, r4, r5)
            if (r0 == 0) goto L6b
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r1 = "DEVICE"
            kotlin.jvm.internal.C9322n.m27780d(r0, r1)
            boolean r0 = p450xk.C12515g.m40978E(r0, r2, r3, r4, r5)
            if (r0 != 0) goto L73
        L6b:
            java.lang.String r0 = android.os.Build.PRODUCT
            boolean r0 = kotlin.jvm.internal.C9322n.m27777a(r6, r0)
            if (r0 == 0) goto L74
        L73:
            r3 = 1
        L74:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p303q4.C10267g.m30749f():boolean");
    }

    /* renamed from: g */
    public static final double m30750g(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            return NumberFormat.getNumberInstance(C4634n0.m11263B()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }
}
