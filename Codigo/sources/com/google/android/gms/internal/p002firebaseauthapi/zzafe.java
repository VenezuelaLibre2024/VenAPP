package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.e;
import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzafe implements zzacp {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private e zze;
    private String zzf;
    private String zzg;

    public zzafe(int i10) {
        this.zza = zza(i10);
    }

    private zzafe(int i10, e eVar, String str, String str2, String str3, String str4, String str5) {
        this.zza = zza(7);
        this.zze = (e) s.j(eVar);
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }

    public static zzafe zza(e eVar, String str, String str2) {
        s.f(str);
        s.f(str2);
        s.j(eVar);
        return new zzafe(7, eVar, null, str2, str, null, null);
    }

    private static String zza(int i10) {
        return i10 != 1 ? i10 != 4 ? i10 != 6 ? i10 != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }

    public final zzafe zza(e eVar) {
        this.zze = (e) s.j(eVar);
        return this;
    }

    public final zzafe zza(String str) {
        this.zzg = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacp
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        str.hashCode();
        int i10 = 1;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1452371317:
                if (str.equals("PASSWORD_RESET")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1341836234:
                if (str.equals("VERIFY_EMAIL")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1099157829:
                if (str.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c10 = 2;
                    break;
                }
                break;
            case 870738373:
                if (str.equals("EMAIL_SIGNIN")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                break;
            case 1:
                i10 = 4;
                break;
            case 2:
                i10 = 7;
                break;
            case 3:
                i10 = 6;
                break;
            default:
                i10 = 0;
                break;
        }
        jSONObject.put("requestType", i10);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put(Constants.EMAIL, str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put(Constants.ID_TOKEN, str4);
        }
        e eVar = this.zze;
        if (eVar != null) {
            jSONObject.put("androidInstallApp", eVar.v1());
            jSONObject.put("canHandleCodeInApp", this.zze.u1());
            if (this.zze.z1() != null) {
                jSONObject.put("continueUrl", this.zze.z1());
            }
            if (this.zze.y1() != null) {
                jSONObject.put("iosBundleId", this.zze.y1());
            }
            if (this.zze.zzd() != null) {
                jSONObject.put("iosAppStoreId", this.zze.zzd());
            }
            if (this.zze.x1() != null) {
                jSONObject.put("androidPackageName", this.zze.x1());
            }
            if (this.zze.w1() != null) {
                jSONObject.put("androidMinimumVersion", this.zze.w1());
            }
            if (this.zze.zzc() != null) {
                jSONObject.put("dynamicLinkDomain", this.zze.zzc());
            }
        }
        String str5 = this.zzf;
        if (str5 != null) {
            jSONObject.put("tenantId", str5);
        }
        String str6 = this.zzg;
        if (str6 != null) {
            zzahc.zza(jSONObject, "captchaResp", str6);
        } else {
            zzahc.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final zzafe zzb(String str) {
        this.zzb = s.f(str);
        return this;
    }

    public final e zzb() {
        return this.zze;
    }

    public final zzafe zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final zzafe zzd(String str) {
        this.zzd = s.f(str);
        return this;
    }
}
