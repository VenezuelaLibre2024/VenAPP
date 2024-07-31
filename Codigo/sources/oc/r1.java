package oc;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzbi;
import com.google.android.gms.internal.p002firebaseauthapi.zzbo;
import com.google.android.gms.internal.p002firebaseauthapi.zzcd;
import com.google.android.gms.internal.p002firebaseauthapi.zzkm;
import com.google.android.gms.internal.p002firebaseauthapi.zzkt;
import com.google.android.gms.internal.p002firebaseauthapi.zzma;
import com.google.android.gms.internal.p002firebaseauthapi.zzw;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: c, reason: collision with root package name */
    private static r1 f22441c;

    /* renamed from: a, reason: collision with root package name */
    private final String f22442a;

    /* renamed from: b, reason: collision with root package name */
    private final zzma f22443b;

    private r1(Context context, String str, boolean z10) {
        zzma zzmaVar;
        this.f22442a = str;
        try {
            zzkm.zza();
            zzma.zza zza = new zzma.zza().zza(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str)).zza(zzkt.zza);
            zza.zza(String.format("android-keystore://firebear_master_key_id.%s", str));
            zzmaVar = zza.zza();
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + e10.getMessage());
            zzmaVar = null;
        }
        this.f22443b = zzmaVar;
    }

    public static r1 c(Context context, String str) {
        r1 r1Var = f22441c;
        if (r1Var == null || !zzw.zza(r1Var.f22442a, str)) {
            f22441c = new r1(context, str, true);
        }
        return f22441c;
    }

    public final String a() {
        if (this.f22443b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzcd zza = zzbi.zza(byteArrayOutputStream);
        try {
            synchronized (this.f22443b) {
                this.f22443b.zza().zza().zza(zza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + e10.getMessage());
            return null;
        }
    }

    public final String b(String str) {
        String str2;
        zzma zzmaVar = this.f22443b;
        if (zzmaVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmaVar) {
                str2 = new String(((zzbo) this.f22443b.zza().zza(zzbo.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + e10.getMessage());
            return null;
        }
    }
}
