package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.util.c0;

/* loaded from: classes2.dex */
public final class zzfij {
    public static c3 zza(Throwable th2) {
        if (th2 instanceof zzeir) {
            zzeir zzeirVar = (zzeir) th2;
            return zzc(zzeirVar.zza(), zzeirVar.zzb());
        }
        if (th2 instanceof zzead) {
            return th2.getMessage() == null ? zzd(((zzead) th2).zza(), null, null) : zzd(((zzead) th2).zza(), th2.getMessage(), null);
        }
        if (!(th2 instanceof c0)) {
            return zzd(1, null, null);
        }
        c0 c0Var = (c0) th2;
        return new c3(c0Var.a(), zzfxt.zzc(c0Var.getMessage()), "com.google.android.gms.ads", null, null);
    }

    public static c3 zzb(Throwable th2, zzeis zzeisVar) {
        c3 c3Var;
        c3 zza = zza(th2);
        int i10 = zza.f8626a;
        if ((i10 == 3 || i10 == 0) && (c3Var = zza.f8629d) != null && !c3Var.f8628c.equals("com.google.android.gms.ads")) {
            zza.f8629d = null;
        }
        if (zzeisVar != null) {
            zza.f8630e = zzeisVar.zzb();
        }
        return zza;
    }

    public static c3 zzc(int i10, c3 c3Var) {
        if (i10 == 0) {
            throw null;
        }
        if (i10 == 8) {
            if (((Integer) a0.c().zza(zzbgc.zzif)).intValue() > 0) {
                return c3Var;
            }
            i10 = 8;
        }
        return zzd(i10, null, c3Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x005b. Please report as an issue. */
    public static c3 zzd(int i10, String str, c3 c3Var) {
        int i11;
        String str2;
        int i12 = i10 - 1;
        if (str == null) {
            if (i10 == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i12) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) a0.c().zza(zzbgc.zzii)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                        break;
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i10 == 0) {
            throw null;
        }
        int i13 = 0;
        switch (i12) {
            case 0:
            case 11:
            case 15:
                return new c3(i13, str3, "com.google.android.gms.ads", c3Var, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i13 = 1;
                return new c3(i13, str3, "com.google.android.gms.ads", c3Var, null);
            case 2:
            case 10:
            case 18:
                i13 = 3;
                return new c3(i13, str3, "com.google.android.gms.ads", c3Var, null);
            case 3:
                i11 = 8;
                i13 = i11;
                return new c3(i13, str3, "com.google.android.gms.ads", c3Var, null);
            case 4:
            case 8:
            case 17:
                i13 = 2;
                return new c3(i13, str3, "com.google.android.gms.ads", c3Var, null);
            case 7:
                i11 = 4;
                i13 = i11;
                return new c3(i13, str3, "com.google.android.gms.ads", c3Var, null);
            case 12:
                if (((Integer) a0.c().zza(zzbgc.zzii)).intValue() <= 0) {
                    i11 = 9;
                    i13 = i11;
                    return new c3(i13, str3, "com.google.android.gms.ads", c3Var, null);
                }
                i13 = 3;
                return new c3(i13, str3, "com.google.android.gms.ads", c3Var, null);
            case 13:
                i11 = 10;
                i13 = i11;
                return new c3(i13, str3, "com.google.android.gms.ads", c3Var, null);
            case 14:
                i11 = 11;
                i13 = i11;
                return new c3(i13, str3, "com.google.android.gms.ads", c3Var, null);
            default:
                switch (i10) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }
}
