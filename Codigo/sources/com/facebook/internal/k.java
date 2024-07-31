package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f7769a = new k();

    /* renamed from: b, reason: collision with root package name */
    private static final HashSet<String> f7770b;

    static {
        HashSet<String> f10;
        f10 = dk.q0.f("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");
        f7770b = f10;
    }

    private k() {
    }

    public static final boolean a(Context context, String packageName) {
        boolean E;
        boolean x10;
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(packageName, "packageName");
        String brand = Build.BRAND;
        int i10 = context.getApplicationInfo().flags;
        kotlin.jvm.internal.n.d(brand, "brand");
        E = xk.p.E(brand, "generic", false, 2, null);
        if (E && (i10 & 2) != 0) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                return false;
            }
            kotlin.jvm.internal.n.d(signatureArr, "packageInfo.signatures");
            if (signatureArr.length == 0) {
                return false;
            }
            Signature[] signatureArr2 = packageInfo.signatures;
            kotlin.jvm.internal.n.d(signatureArr2, "packageInfo.signatures");
            for (Signature signature : signatureArr2) {
                HashSet<String> hashSet = f7770b;
                n0 n0Var = n0.f7780a;
                byte[] byteArray = signature.toByteArray();
                kotlin.jvm.internal.n.d(byteArray, "it.toByteArray()");
                x10 = dk.z.x(hashSet, n0.F0(byteArray));
                if (!x10) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
