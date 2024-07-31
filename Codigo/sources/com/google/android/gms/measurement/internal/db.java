package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.measurement.internal.y6;
import com.google.android.libraries.barhopper.RecognitionOptions;
import ea.b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes2.dex */
public final class db extends ua {
    public db(va vaVar) {
        super(vaVar);
    }

    public static <BuilderT extends zzkm> BuilderT A(BuilderT buildert, byte[] bArr) {
        zzik zza = zzik.zza();
        return zza != null ? (BuilderT) buildert.zza(bArr, zza) : (BuilderT) buildert.zza(bArr);
    }

    private static String G(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    public static List<Long> H(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 << 6) + i11;
                if (i12 < bitSet.length()) {
                    if (bitSet.get(i12)) {
                        j10 |= 1 << i11;
                    }
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    private static void K(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private static void L(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                K(builder, str3, string, set);
            }
        }
    }

    public static void M(zzfi.zze.zza zzaVar, String str, Object obj) {
        List<zzfi.zzg> zzf = zzaVar.zzf();
        int i10 = 0;
        while (true) {
            if (i10 >= zzf.size()) {
                i10 = -1;
                break;
            } else if (str.equals(zzf.get(i10).zzg())) {
                break;
            } else {
                i10++;
            }
        }
        zzfi.zzg.zza zza = zzfi.zzg.zze().zza(str);
        if (obj instanceof Long) {
            zza.zza(((Long) obj).longValue());
        } else if (obj instanceof String) {
            zza.zzb((String) obj);
        } else if (obj instanceof Double) {
            zza.zza(((Double) obj).doubleValue());
        }
        if (i10 >= 0) {
            zzaVar.zza(i10, zza);
        } else {
            zzaVar.zza(zza);
        }
    }

    private static void Q(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    private final void R(StringBuilder sb2, int i10, zzew.zzc zzcVar) {
        if (zzcVar == null) {
            return;
        }
        Q(sb2, i10);
        sb2.append("filter {\n");
        if (zzcVar.zzg()) {
            U(sb2, i10, "complement", Boolean.valueOf(zzcVar.zzf()));
        }
        if (zzcVar.zzi()) {
            U(sb2, i10, "param_name", d().f(zzcVar.zze()));
        }
        if (zzcVar.zzj()) {
            int i11 = i10 + 1;
            zzew.zzf zzd = zzcVar.zzd();
            if (zzd != null) {
                Q(sb2, i11);
                sb2.append("string_filter");
                sb2.append(" {\n");
                if (zzd.zzj()) {
                    U(sb2, i11, "match_type", zzd.zzb().name());
                }
                if (zzd.zzi()) {
                    U(sb2, i11, "expression", zzd.zze());
                }
                if (zzd.zzh()) {
                    U(sb2, i11, "case_sensitive", Boolean.valueOf(zzd.zzg()));
                }
                if (zzd.zza() > 0) {
                    Q(sb2, i11 + 1);
                    sb2.append("expression_list {\n");
                    for (String str : zzd.zzf()) {
                        Q(sb2, i11 + 2);
                        sb2.append(str);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                Q(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (zzcVar.zzh()) {
            S(sb2, i10 + 1, "number_filter", zzcVar.zzc());
        }
        Q(sb2, i10);
        sb2.append("}\n");
    }

    private static void S(StringBuilder sb2, int i10, String str, zzew.zzd zzdVar) {
        if (zzdVar == null) {
            return;
        }
        Q(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzdVar.zzh()) {
            U(sb2, i10, "comparison_type", zzdVar.zza().name());
        }
        if (zzdVar.zzj()) {
            U(sb2, i10, "match_as_float", Boolean.valueOf(zzdVar.zzg()));
        }
        if (zzdVar.zzi()) {
            U(sb2, i10, "comparison_value", zzdVar.zzd());
        }
        if (zzdVar.zzl()) {
            U(sb2, i10, "min_comparison_value", zzdVar.zzf());
        }
        if (zzdVar.zzk()) {
            U(sb2, i10, "max_comparison_value", zzdVar.zze());
        }
        Q(sb2, i10);
        sb2.append("}\n");
    }

    private static void T(StringBuilder sb2, int i10, String str, zzfi.zzl zzlVar) {
        if (zzlVar == null) {
            return;
        }
        Q(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzlVar.zzb() != 0) {
            Q(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : zzlVar.zzi()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (zzlVar.zzd() != 0) {
            Q(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : zzlVar.zzk()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (zzlVar.zza() != 0) {
            Q(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (zzfi.zzd zzdVar : zzlVar.zzh()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzdVar.zzf() ? Integer.valueOf(zzdVar.zza()) : null);
                sb2.append(":");
                sb2.append(zzdVar.zze() ? Long.valueOf(zzdVar.zzb()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (zzlVar.zzc() != 0) {
            Q(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (zzfi.zzm zzmVar : zzlVar.zzj()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzmVar.zzf() ? Integer.valueOf(zzmVar.zzb()) : null);
                sb2.append(": [");
                Iterator<Long> it = zzmVar.zze().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    long longValue = it.next().longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i19 = i20;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        Q(sb2, 3);
        sb2.append("}\n");
    }

    private static void U(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        Q(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    private final void V(StringBuilder sb2, int i10, List<zzfi.zzg> list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        for (zzfi.zzg zzgVar : list) {
            if (zzgVar != null) {
                Q(sb2, i11);
                sb2.append("param {\n");
                U(sb2, i11, "name", zzgVar.zzm() ? d().f(zzgVar.zzg()) : null);
                U(sb2, i11, "string_value", zzgVar.zzn() ? zzgVar.zzh() : null);
                U(sb2, i11, "int_value", zzgVar.zzl() ? Long.valueOf(zzgVar.zzd()) : null);
                U(sb2, i11, "double_value", zzgVar.zzj() ? Double.valueOf(zzgVar.zza()) : null);
                if (zzgVar.zzc() > 0) {
                    V(sb2, i11, zzgVar.zzi());
                }
                Q(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    public static boolean X(d0 d0Var, lb lbVar) {
        com.google.android.gms.common.internal.s.j(d0Var);
        com.google.android.gms.common.internal.s.j(lbVar);
        return (TextUtils.isEmpty(lbVar.f10367b) && TextUtils.isEmpty(lbVar.B)) ? false : true;
    }

    public static boolean Y(List<Long> list, int i10) {
        if (i10 < (list.size() << 6)) {
            return ((1 << (i10 % 64)) & list.get(i10 / 64).longValue()) != 0;
        }
        return false;
    }

    public static Object Z(zzfi.zze zzeVar, String str) {
        zzfi.zzg z10 = z(zzeVar, str);
        if (z10 == null) {
            return null;
        }
        if (z10.zzn()) {
            return z10.zzh();
        }
        if (z10.zzl()) {
            return Long.valueOf(z10.zzd());
        }
        if (z10.zzj()) {
            return Double.valueOf(z10.zza());
        }
        if (z10.zzc() <= 0) {
            return null;
        }
        List<zzfi.zzg> zzi = z10.zzi();
        ArrayList arrayList = new ArrayList();
        for (zzfi.zzg zzgVar : zzi) {
            if (zzgVar != null) {
                Bundle bundle = new Bundle();
                for (zzfi.zzg zzgVar2 : zzgVar.zzi()) {
                    if (zzgVar2.zzn()) {
                        bundle.putString(zzgVar2.zzg(), zzgVar2.zzh());
                    } else if (zzgVar2.zzl()) {
                        bundle.putLong(zzgVar2.zzg(), zzgVar2.zzd());
                    } else if (zzgVar2.zzj()) {
                        bundle.putDouble(zzgVar2.zzg(), zzgVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static boolean a0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static int t(zzfi.zzj.zza zzaVar, String str) {
        if (zzaVar == null) {
            return -1;
        }
        for (int i10 = 0; i10 < zzaVar.zzb(); i10++) {
            if (str.equals(zzaVar.zzj(i10).zzg())) {
                return i10;
            }
        }
        return -1;
    }

    private final Bundle w(Map<String, Object> map, boolean z10) {
        String str;
        Bundle bundle = new Bundle();
        for (String str2 : map.keySet()) {
            Object obj = map.get(str2);
            if (obj == null) {
                str = null;
            } else if (obj instanceof Long) {
                bundle.putLong(str2, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str2, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                str = obj.toString();
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    arrayList2.add(w((Map) obj2, false));
                }
                bundle.putParcelableArray(str2, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
            bundle.putString(str2, str);
        }
        return bundle;
    }

    public static zzfi.zzg z(zzfi.zze zzeVar, String str) {
        for (zzfi.zzg zzgVar : zzeVar.zzh()) {
            if (zzgVar.zzg().equals(str)) {
                return zzgVar;
            }
        }
        return null;
    }

    public final d0 B(zzad zzadVar) {
        Object obj;
        Bundle w10 = w(zzadVar.zzc(), true);
        String obj2 = (!w10.containsKey("_o") || (obj = w10.get("_o")) == null) ? "app" : obj.toString();
        String b10 = wa.r.b(zzadVar.zzb());
        if (b10 == null) {
            b10 = zzadVar.zzb();
        }
        return new d0(b10, new z(w10), obj2, zzadVar.zza());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.na C(java.lang.String r12, com.google.android.gms.internal.measurement.zzfi.zzj r13, com.google.android.gms.internal.measurement.zzfi.zze.zza r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.db.C(java.lang.String, com.google.android.gms.internal.measurement.zzfi$zzj, com.google.android.gms.internal.measurement.zzfi$zze$zza, java.lang.String):com.google.android.gms.measurement.internal.na");
    }

    public final String D(zzew.zzb zzbVar) {
        if (zzbVar == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (zzbVar.zzl()) {
            U(sb2, 0, "filter_id", Integer.valueOf(zzbVar.zzb()));
        }
        U(sb2, 0, "event_name", d().c(zzbVar.zzf()));
        String G = G(zzbVar.zzh(), zzbVar.zzi(), zzbVar.zzj());
        if (!G.isEmpty()) {
            U(sb2, 0, "filter_type", G);
        }
        if (zzbVar.zzk()) {
            S(sb2, 1, "event_count_filter", zzbVar.zze());
        }
        if (zzbVar.zza() > 0) {
            sb2.append("  filters {\n");
            Iterator<zzew.zzc> it = zzbVar.zzg().iterator();
            while (it.hasNext()) {
                R(sb2, 2, it.next());
            }
        }
        Q(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    public final String E(zzew.zze zzeVar) {
        if (zzeVar == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (zzeVar.zzi()) {
            U(sb2, 0, "filter_id", Integer.valueOf(zzeVar.zza()));
        }
        U(sb2, 0, "property_name", d().g(zzeVar.zze()));
        String G = G(zzeVar.zzf(), zzeVar.zzg(), zzeVar.zzh());
        if (!G.isEmpty()) {
            U(sb2, 0, "filter_type", G);
        }
        R(sb2, 1, zzeVar.zzb());
        sb2.append("}\n");
        return sb2.toString();
    }

    public final String F(zzfi.zzi zziVar) {
        zzfi.zzb zzt;
        if (zziVar == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        for (zzfi.zzj zzjVar : zziVar.zzd()) {
            if (zzjVar != null) {
                Q(sb2, 1);
                sb2.append("bundle {\n");
                if (zzjVar.zzbk()) {
                    U(sb2, 1, "protocol_version", Integer.valueOf(zzjVar.zze()));
                }
                if (zzps.zza() && a().w(zzjVar.zzx(), e0.f10138y0) && zzjVar.zzbn()) {
                    U(sb2, 1, "session_stitching_token", zzjVar.zzam());
                }
                U(sb2, 1, "platform", zzjVar.zzak());
                if (zzjVar.zzbf()) {
                    U(sb2, 1, "gmp_version", Long.valueOf(zzjVar.zzm()));
                }
                if (zzjVar.zzbs()) {
                    U(sb2, 1, "uploading_gmp_version", Long.valueOf(zzjVar.zzs()));
                }
                if (zzjVar.zzbd()) {
                    U(sb2, 1, "dynamite_version", Long.valueOf(zzjVar.zzk()));
                }
                if (zzjVar.zzay()) {
                    U(sb2, 1, "config_version", Long.valueOf(zzjVar.zzi()));
                }
                U(sb2, 1, "gmp_app_id", zzjVar.zzah());
                U(sb2, 1, "admob_app_id", zzjVar.zzw());
                U(sb2, 1, "app_id", zzjVar.zzx());
                U(sb2, 1, "app_version", zzjVar.zzaa());
                if (zzjVar.zzav()) {
                    U(sb2, 1, "app_version_major", Integer.valueOf(zzjVar.zzb()));
                }
                U(sb2, 1, "firebase_instance_id", zzjVar.zzag());
                if (zzjVar.zzbc()) {
                    U(sb2, 1, "dev_cert_hash", Long.valueOf(zzjVar.zzj()));
                }
                U(sb2, 1, "app_store", zzjVar.zzz());
                if (zzjVar.zzbr()) {
                    U(sb2, 1, "upload_timestamp_millis", Long.valueOf(zzjVar.zzr()));
                }
                if (zzjVar.zzbo()) {
                    U(sb2, 1, "start_timestamp_millis", Long.valueOf(zzjVar.zzp()));
                }
                if (zzjVar.zzbe()) {
                    U(sb2, 1, "end_timestamp_millis", Long.valueOf(zzjVar.zzl()));
                }
                if (zzjVar.zzbj()) {
                    U(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzjVar.zzo()));
                }
                if (zzjVar.zzbi()) {
                    U(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzjVar.zzn()));
                }
                U(sb2, 1, "app_instance_id", zzjVar.zzy());
                U(sb2, 1, "resettable_device_id", zzjVar.zzal());
                U(sb2, 1, "ds_id", zzjVar.zzaf());
                if (zzjVar.zzbh()) {
                    U(sb2, 1, "limited_ad_tracking", Boolean.valueOf(zzjVar.zzat()));
                }
                U(sb2, 1, "os_version", zzjVar.zzaj());
                U(sb2, 1, "device_model", zzjVar.zzae());
                U(sb2, 1, "user_default_language", zzjVar.zzan());
                if (zzjVar.zzbq()) {
                    U(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(zzjVar.zzg()));
                }
                if (zzjVar.zzax()) {
                    U(sb2, 1, "bundle_sequential_index", Integer.valueOf(zzjVar.zzc()));
                }
                if (zzjVar.zzbm()) {
                    U(sb2, 1, "service_upload", Boolean.valueOf(zzjVar.zzau()));
                }
                U(sb2, 1, "health_monitor", zzjVar.zzai());
                if (zzjVar.zzbl()) {
                    U(sb2, 1, "retry_counter", Integer.valueOf(zzjVar.zzf()));
                }
                if (zzjVar.zzba()) {
                    U(sb2, 1, "consent_signals", zzjVar.zzac());
                }
                if (zzjVar.zzbg()) {
                    U(sb2, 1, "is_dma_region", Boolean.valueOf(zzjVar.zzas()));
                }
                if (zzjVar.zzbb()) {
                    U(sb2, 1, "core_platform_services", zzjVar.zzad());
                }
                if (zzjVar.zzaz()) {
                    U(sb2, 1, "consent_diagnostics", zzjVar.zzab());
                }
                if (zzjVar.zzbp()) {
                    U(sb2, 1, "target_os_version", Long.valueOf(zzjVar.zzq()));
                }
                if (zzpg.zza() && a().w(zzjVar.zzx(), e0.L0)) {
                    U(sb2, 1, "ad_services_version", Integer.valueOf(zzjVar.zza()));
                    if (zzjVar.zzaw() && (zzt = zzjVar.zzt()) != null) {
                        Q(sb2, 2);
                        sb2.append("attribution_eligibility_status {\n");
                        U(sb2, 2, "eligible", Boolean.valueOf(zzt.zzf()));
                        U(sb2, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzt.zzh()));
                        U(sb2, 2, "pre_r", Boolean.valueOf(zzt.zzi()));
                        U(sb2, 2, "r_extensions_too_old", Boolean.valueOf(zzt.zzj()));
                        U(sb2, 2, "adservices_extension_too_old", Boolean.valueOf(zzt.zze()));
                        U(sb2, 2, "ad_storage_not_allowed", Boolean.valueOf(zzt.zzd()));
                        U(sb2, 2, "measurement_manager_disabled", Boolean.valueOf(zzt.zzg()));
                        Q(sb2, 2);
                        sb2.append("}\n");
                    }
                }
                List<zzfi.zzn> zzaq = zzjVar.zzaq();
                if (zzaq != null) {
                    for (zzfi.zzn zznVar : zzaq) {
                        if (zznVar != null) {
                            Q(sb2, 2);
                            sb2.append("user_property {\n");
                            U(sb2, 2, "set_timestamp_millis", zznVar.zzl() ? Long.valueOf(zznVar.zzd()) : null);
                            U(sb2, 2, "name", d().g(zznVar.zzg()));
                            U(sb2, 2, "string_value", zznVar.zzh());
                            U(sb2, 2, "int_value", zznVar.zzk() ? Long.valueOf(zznVar.zzc()) : null);
                            U(sb2, 2, "double_value", zznVar.zzi() ? Double.valueOf(zznVar.zza()) : null);
                            Q(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<zzfi.zzc> zzao = zzjVar.zzao();
                zzjVar.zzx();
                if (zzao != null) {
                    for (zzfi.zzc zzcVar : zzao) {
                        if (zzcVar != null) {
                            Q(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (zzcVar.zzg()) {
                                U(sb2, 2, "audience_id", Integer.valueOf(zzcVar.zza()));
                            }
                            if (zzcVar.zzh()) {
                                U(sb2, 2, "new_audience", Boolean.valueOf(zzcVar.zzf()));
                            }
                            T(sb2, 2, "current_data", zzcVar.zzd());
                            if (zzcVar.zzi()) {
                                T(sb2, 2, "previous_data", zzcVar.zze());
                            }
                            Q(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<zzfi.zze> zzap = zzjVar.zzap();
                if (zzap != null) {
                    for (zzfi.zze zzeVar : zzap) {
                        if (zzeVar != null) {
                            Q(sb2, 2);
                            sb2.append("event {\n");
                            U(sb2, 2, "name", d().c(zzeVar.zzg()));
                            if (zzeVar.zzk()) {
                                U(sb2, 2, "timestamp_millis", Long.valueOf(zzeVar.zzd()));
                            }
                            if (zzeVar.zzj()) {
                                U(sb2, 2, "previous_timestamp_millis", Long.valueOf(zzeVar.zzc()));
                            }
                            if (zzeVar.zzi()) {
                                U(sb2, 2, "count", Integer.valueOf(zzeVar.zza()));
                            }
                            if (zzeVar.zzb() != 0) {
                                V(sb2, 2, zzeVar.zzh());
                            }
                            Q(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                Q(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("}\n");
        return sb2.toString();
    }

    public final List<Long> I(List<Long> list, List<Integer> list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                zzj().G().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    zzj().G().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    public final Map<String, Object> J(Bundle bundle, boolean z10) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(J((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(J((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(J((Bundle) obj, false));
                    }
                    hashMap.put(str, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    public final void N(zzfi.zzg.zza zzaVar, Object obj) {
        com.google.android.gms.common.internal.s.j(obj);
        zzaVar.zze().zzc().zzb().zzd();
        if (obj instanceof String) {
            zzaVar.zzb((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzaVar.zza(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzaVar.zza(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            zzj().B().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                zzfi.zzg.zza zze = zzfi.zzg.zze();
                for (String str : bundle.keySet()) {
                    zzfi.zzg.zza zza = zzfi.zzg.zze().zza(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zza.zza(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zza.zzb((String) obj2);
                    } else if (obj2 instanceof Double) {
                        zza.zza(((Double) obj2).doubleValue());
                    }
                    zze.zza(zza);
                }
                if (zze.zza() > 0) {
                    arrayList.add((zzfi.zzg) ((zzix) zze.zzab()));
                }
            }
        }
        zzaVar.zza(arrayList);
    }

    public final void O(zzfi.zzj.zza zzaVar) {
        zzj().F().a("Checking account type status for ad personalization signals");
        if (c0(zzaVar.zzr())) {
            zzj().A().a("Turning off ad personalization due to account type");
            zzfi.zzn zznVar = (zzfi.zzn) ((zzix) zzfi.zzn.zze().zza("_npa").zzb(c().p()).zza(1L).zzab());
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= zzaVar.zzb()) {
                    break;
                }
                if ("_npa".equals(zzaVar.zzj(i10).zzg())) {
                    zzaVar.zza(i10, zznVar);
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (!z10) {
                zzaVar.zza(zznVar);
            }
            if (zznp.zza() && a().n(e0.T0)) {
                k b10 = k.b(zzaVar.zzs());
                b10.d(y6.a.AD_PERSONALIZATION, j.CHILD_ACCOUNT);
                zzaVar.zzf(b10.toString());
            }
        }
    }

    public final void P(zzfi.zzn.zza zzaVar, Object obj) {
        com.google.android.gms.common.internal.s.j(obj);
        zzaVar.zzc().zzb().zza();
        if (obj instanceof String) {
            zzaVar.zzb((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzaVar.zza(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzaVar.zza(((Double) obj).doubleValue());
        } else {
            zzj().B().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final boolean W(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(zzb().a() - j10) > j11;
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    public final byte[] b0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            zzj().B().b("Failed to gzip content", e10);
            throw e10;
        }
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    public final boolean c0(String str) {
        com.google.android.gms.common.internal.s.j(str);
        r5 y02 = l().y0(str);
        return y02 != null && c().t() && y02.q() && m().Q(str);
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    public final byte[] d0(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[RecognitionOptions.UPC_E];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
        } catch (IOException e10) {
            zzj().B().b("Failed to ungzip content", e10);
            throw e10;
        }
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    public final List<Integer> e0() {
        Map<String, String> c10 = e0.c(this.f10606b.zza());
        if (c10 == null || c10.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = e0.R.a(null).intValue();
        for (Map.Entry<String, String> entry : c10.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt(entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            zzj().G().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e10) {
                    zzj().G().b("Experiment ID NumberFormatException", e10);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ db j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ pb k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ m l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ i5 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ y9 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ ta o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    protected final boolean s() {
        return false;
    }

    public final long u(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return v(str.getBytes(Charset.forName("UTF-8")));
    }

    public final long v(byte[] bArr) {
        com.google.android.gms.common.internal.s.j(bArr);
        f().i();
        MessageDigest O0 = ib.O0();
        if (O0 != null) {
            return ib.w(O0.digest(bArr));
        }
        zzj().B().a("Failed to get MD5");
        return 0L;
    }

    public final <T extends Parcelable> T x(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (b.a unused) {
            zzj().B().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    public final zzfi.zze y(w wVar) {
        zzfi.zze.zza zza = zzfi.zze.zze().zza(wVar.f10753e);
        Iterator<String> it = wVar.f10754f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            zzfi.zzg.zza zza2 = zzfi.zzg.zze().zza(next);
            Object y12 = wVar.f10754f.y1(next);
            com.google.android.gms.common.internal.s.j(y12);
            N(zza2, y12);
            zza.zza(zza2);
        }
        return (zzfi.zze) ((zzix) zza.zzab());
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ la.f zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 zzl() {
        return super.zzl();
    }
}
