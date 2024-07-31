package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import dk.C7030q0;
import dk.C7042z;
import java.util.HashSet;
import kotlin.jvm.internal.C9322n;
import p450xk.C12524p;

/* renamed from: com.facebook.internal.k */
/* loaded from: classes.dex */
public final class C4627k {

    /* renamed from: a */
    public static final C4627k f8746a = new C4627k();

    /* renamed from: b */
    private static final HashSet<String> f8747b;

    static {
        HashSet<String> m20574f;
        m20574f = C7030q0.m20574f("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");
        f8747b = m20574f;
    }

    private C4627k() {
    }

    /* renamed from: a */
    public static final boolean m11242a(Context context, String packageName) {
        boolean m41031E;
        boolean m20638x;
        C9322n.m27781e(context, "context");
        C9322n.m27781e(packageName, "packageName");
        String brand = Build.BRAND;
        int i10 = context.getApplicationInfo().flags;
        C9322n.m27780d(brand, "brand");
        m41031E = C12524p.m41031E(brand, "generic", false, 2, null);
        if (m41031E && (i10 & 2) != 0) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                return false;
            }
            C9322n.m27780d(signatureArr, "packageInfo.signatures");
            if (signatureArr.length == 0) {
                return false;
            }
            Signature[] signatureArr2 = packageInfo.signatures;
            C9322n.m27780d(signatureArr2, "packageInfo.signatures");
            for (Signature signature : signatureArr2) {
                HashSet<String> hashSet = f8747b;
                C4634n0 c4634n0 = C4634n0.f8760a;
                byte[] byteArray = signature.toByteArray();
                C9322n.m27780d(byteArray, "it.toByteArray()");
                m20638x = C7042z.m20638x(hashSet, C4634n0.m11271F0(byteArray));
                if (!m20638x) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
