package la;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import na.C9696e;

/* renamed from: la.a */
/* loaded from: classes.dex */
public class C9456a {
    @Deprecated
    /* renamed from: a */
    public static byte[] m28113a(Context context, String str) {
        MessageDigest m28114b;
        PackageInfo m29077f = C9696e.m29080a(context).m29077f(str, 64);
        Signature[] signatureArr = m29077f.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (m28114b = m28114b("SHA1")) == null) {
            return null;
        }
        return m28114b.digest(m29077f.signatures[0].toByteArray());
    }

    /* renamed from: b */
    public static MessageDigest m28114b(String str) {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
