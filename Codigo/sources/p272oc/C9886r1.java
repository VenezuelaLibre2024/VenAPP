package p272oc;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p498firebaseauthapi.zzbi;
import com.google.android.gms.internal.p498firebaseauthapi.zzbo;
import com.google.android.gms.internal.p498firebaseauthapi.zzcd;
import com.google.android.gms.internal.p498firebaseauthapi.zzkm;
import com.google.android.gms.internal.p498firebaseauthapi.zzkt;
import com.google.android.gms.internal.p498firebaseauthapi.zzma;
import com.google.android.gms.internal.p498firebaseauthapi.zzw;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* renamed from: oc.r1 */
/* loaded from: classes.dex */
public final class C9886r1 {

    /* renamed from: c */
    private static C9886r1 f24374c;

    /* renamed from: a */
    private final String f24375a;

    /* renamed from: b */
    private final zzma f24376b;

    private C9886r1(Context context, String str, boolean z10) {
        zzma zzmaVar;
        this.f24375a = str;
        try {
            zzkm.zza();
            zzma.zza zza = new zzma.zza().zza(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str)).zza(zzkt.zza);
            zza.zza(String.format("android-keystore://firebear_master_key_id.%s", str));
            zzmaVar = zza.zza();
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + e10.getMessage());
            zzmaVar = null;
        }
        this.f24376b = zzmaVar;
    }

    /* renamed from: c */
    public static C9886r1 m29586c(Context context, String str) {
        C9886r1 c9886r1 = f24374c;
        if (c9886r1 == null || !zzw.zza(c9886r1.f24375a, str)) {
            f24374c = new C9886r1(context, str, true);
        }
        return f24374c;
    }

    /* renamed from: a */
    public final String m29587a() {
        if (this.f24376b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzcd zza = zzbi.zza(byteArrayOutputStream);
        try {
            synchronized (this.f24376b) {
                this.f24376b.zza().zza().zza(zza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + e10.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public final String m29588b(String str) {
        String str2;
        zzma zzmaVar = this.f24376b;
        if (zzmaVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmaVar) {
                str2 = new String(((zzbo) this.f24376b.zza().zza(zzbo.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + e10.getMessage());
            return null;
        }
    }
}
