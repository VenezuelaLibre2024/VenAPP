package ca;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.b2;
import com.google.android.gms.common.internal.x0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class y extends b2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f7004a;

    /* JADX INFO: Access modifiers changed from: protected */
    public y(byte[] bArr) {
        com.google.android.gms.common.internal.s.a(bArr.length == 25);
        this.f7004a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] g2(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.dynamic.b zzd;
        if (obj != null && (obj instanceof x0)) {
            try {
                x0 x0Var = (x0) obj;
                if (x0Var.zzc() == this.f7004a && (zzd = x0Var.zzd()) != null) {
                    return Arrays.equals(h2(), (byte[]) com.google.android.gms.dynamic.d.g2(zzd));
                }
                return false;
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte[] h2();

    public final int hashCode() {
        return this.f7004a;
    }

    @Override // com.google.android.gms.common.internal.x0
    public final int zzc() {
        return this.f7004a;
    }

    @Override // com.google.android.gms.common.internal.x0
    public final com.google.android.gms.dynamic.b zzd() {
        return com.google.android.gms.dynamic.d.h2(h2());
    }
}
