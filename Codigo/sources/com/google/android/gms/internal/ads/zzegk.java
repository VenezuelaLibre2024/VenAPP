package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.w1;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzegk extends zzegl {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzdab zzd;
    private final TelephonyManager zze;
    private final zzegc zzf;
    private int zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbec.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbec zzbecVar = zzbec.CONNECTING;
        sparseArray.put(ordinal, zzbecVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbecVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbecVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbec.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbec zzbecVar2 = zzbec.DISCONNECTED;
        sparseArray.put(ordinal2, zzbecVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbecVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbecVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbecVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbecVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbec.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbecVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbecVar);
    }

    public zzegk(Context context, zzdab zzdabVar, zzegc zzegcVar, zzefy zzefyVar, w1 w1Var) {
        super(zzefyVar, w1Var);
        this.zzc = context;
        this.zzd = zzdabVar;
        this.zzf = zzegcVar;
        this.zze = (TelephonyManager) context.getSystemService(Constants.SIGN_IN_METHOD_PHONE);
    }

    public static /* bridge */ /* synthetic */ zzbdt zza(zzegk zzegkVar, Bundle bundle) {
        zzbdm zza = zzbdt.zza();
        int i10 = bundle.getInt("cnt", -2);
        int i11 = bundle.getInt("gnt", 0);
        int i12 = 2;
        if (i10 == -1) {
            zzegkVar.zzg = 2;
        } else {
            zzegkVar.zzg = 1;
            if (i10 == 0) {
                zza.zzb(2);
            } else if (i10 != 1) {
                zza.zzb(1);
            } else {
                zza.zzb(3);
            }
            switch (i11) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i12 = 3;
                    break;
                case 13:
                    i12 = 5;
                    break;
                default:
                    i12 = 1;
                    break;
            }
            zza.zza(i12);
        }
        return (zzbdt) zza.zzal();
    }

    public static /* bridge */ /* synthetic */ zzbec zzb(zzegk zzegkVar, Bundle bundle) {
        return (zzbec) zzb.get(zzfhv.zza(zzfhv.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbec.UNSPECIFIED);
    }

    public static /* bridge */ /* synthetic */ byte[] zze(zzegk zzegkVar, boolean z10, ArrayList arrayList, zzbdt zzbdtVar, zzbec zzbecVar) {
        zzbdx zzg = zzbdy.zzg();
        zzg.zza(arrayList);
        zzg.zzi(zzg(Settings.Global.getInt(zzegkVar.zzc.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzg.zzj(t.s().h(zzegkVar.zzc, zzegkVar.zze));
        zzg.zzf(zzegkVar.zzf.zze());
        zzg.zze(zzegkVar.zzf.zzb());
        zzg.zzb(zzegkVar.zzf.zza());
        zzg.zzc(zzbecVar);
        zzg.zzd(zzbdtVar);
        zzg.zzk(zzegkVar.zzg);
        zzg.zzl(zzg(z10));
        zzg.zzh(zzegkVar.zzf.zzd());
        zzg.zzg(t.b().a());
        zzg.zzm(zzg(Settings.Global.getInt(zzegkVar.zzc.getContentResolver(), "wifi_on", 0) != 0));
        return ((zzbdy) zzg.zzal()).zzax();
    }

    private static final int zzg(boolean z10) {
        return z10 ? 2 : 1;
    }

    public final void zzd(boolean z10) {
        zzgen.zzr(this.zzd.zzb(), new zzegj(this, z10), zzcep.zzf);
    }
}
