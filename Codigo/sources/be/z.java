package be;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import pf.g;
import vi.w0;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    private final zb.g f6487a;

    public z(zb.g gVar) {
        this.f6487a = gVar;
    }

    public static String a(PackageManager packageManager, String str) {
        Signature[] signatureArr;
        Signature signature;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0 && (signature = signatureArr[0]) != null) {
                return d(signature);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    private static String d(Signature signature) {
        try {
            return fb.a.a().n().f(MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public vi.w0 b() {
        w0.d<String> dVar = vi.w0.f29225e;
        w0.g e10 = w0.g.e("X-Goog-Api-Key", dVar);
        w0.g e11 = w0.g.e("X-Android-Package", dVar);
        w0.g e12 = w0.g.e("X-Android-Cert", dVar);
        vi.w0 w0Var = new vi.w0();
        String packageName = this.f6487a.m().getPackageName();
        w0Var.o(e10, this.f6487a.r().b());
        w0Var.o(e11, packageName);
        String a10 = a(this.f6487a.m().getPackageManager(), packageName);
        if (a10 != null) {
            w0Var.o(e12, a10);
        }
        return w0Var;
    }

    public g.b c(vi.d dVar, vi.w0 w0Var) {
        return pf.g.b(vi.j.b(dVar, aj.d.a(w0Var)));
    }
}
