package ca;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractBinderC5227b2;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.common.internal.InterfaceC5292x0;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.dynamic.InterfaceC5312b;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ca.y */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1930y extends AbstractBinderC5227b2 {

    /* renamed from: a */
    private final int f7956a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractBinderC1930y(byte[] bArr) {
        C5276s.m13315a(bArr.length == 25);
        this.f7956a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g2 */
    public static byte[] m10124g2(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        InterfaceC5312b zzd;
        if (obj != null && (obj instanceof InterfaceC5292x0)) {
            try {
                InterfaceC5292x0 interfaceC5292x0 = (InterfaceC5292x0) obj;
                if (interfaceC5292x0.zzc() == this.f7956a && (zzd = interfaceC5292x0.zzd()) != null) {
                    return Arrays.equals(mo10047h2(), (byte[]) BinderC5314d.m13411g2(zzd));
                }
                return false;
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h2 */
    public abstract byte[] mo10047h2();

    public final int hashCode() {
        return this.f7956a;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC5292x0
    public final int zzc() {
        return this.f7956a;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC5292x0
    public final InterfaceC5312b zzd() {
        return BinderC5314d.m13412h2(mo10047h2());
    }
}
