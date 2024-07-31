package be;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p015aj.C0128d;
import p103fb.AbstractC7323a;
import p485zb.C12867g;
import pf.C10169g;
import vi.AbstractC11904d;
import vi.C11922j;
import vi.C11953w0;

/* renamed from: be.z */
/* loaded from: classes.dex */
public class C1775z {

    /* renamed from: a */
    private final C12867g f7409a;

    public C1775z(C12867g c12867g) {
        this.f7409a = c12867g;
    }

    /* renamed from: a */
    public static String m9484a(PackageManager packageManager, String str) {
        Signature[] signatureArr;
        Signature signature;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0 && (signature = signatureArr[0]) != null) {
                return m9485d(signature);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    /* renamed from: d */
    private static String m9485d(Signature signature) {
        try {
            return AbstractC7323a.m21949a().mo21962n().m21955f(MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public C11953w0 m9486b() {
        C11953w0.d<String> dVar = C11953w0.f31660e;
        C11953w0.g m38322e = C11953w0.g.m38322e("X-Goog-Api-Key", dVar);
        C11953w0.g m38322e2 = C11953w0.g.m38322e("X-Android-Package", dVar);
        C11953w0.g m38322e3 = C11953w0.g.m38322e("X-Android-Cert", dVar);
        C11953w0 c11953w0 = new C11953w0();
        String packageName = this.f7409a.m42630m().getPackageName();
        c11953w0.m38313o(m38322e, this.f7409a.m42632r().m42643b());
        c11953w0.m38313o(m38322e2, packageName);
        String m9484a = m9484a(this.f7409a.m42630m().getPackageManager(), packageName);
        if (m9484a != null) {
            c11953w0.m38313o(m38322e3, m9484a);
        }
        return c11953w0;
    }

    /* renamed from: c */
    public C10169g.b m9487c(AbstractC11904d abstractC11904d, C11953w0 c11953w0) {
        return C10169g.m30432b(C11922j.m38170b(abstractC11904d, C0128d.m600a(c11953w0)));
    }
}
