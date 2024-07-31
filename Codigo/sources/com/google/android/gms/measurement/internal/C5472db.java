package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.measurement.internal.C5737y6;
import com.google.android.libraries.barhopper.RecognitionOptions;
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
import la.InterfaceC9461f;
import p081ea.C7139b;
import p418wa.C12120r;

/* renamed from: com.google.android.gms.measurement.internal.db */
/* loaded from: classes2.dex */
public final class C5472db extends AbstractC5692ua {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5472db(C5705va c5705va) {
        super(c5705va);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static <BuilderT extends zzkm> BuilderT m13730A(BuilderT buildert, byte[] bArr) {
        zzik zza = zzik.zza();
        return zza != null ? (BuilderT) buildert.zza(bArr, zza) : (BuilderT) buildert.zza(bArr);
    }

    /* renamed from: G */
    private static String m13731G(boolean z10, boolean z11, boolean z12) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static List<Long> m13732H(BitSet bitSet) {
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

    /* renamed from: K */
    private static void m13733K(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    /* renamed from: L */
    private static void m13734L(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                m13733K(builder, str3, string, set);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public static void m13735M(zzfi.zze.zza zzaVar, String str, Object obj) {
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

    /* renamed from: Q */
    private static void m13736Q(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    /* renamed from: R */
    private final void m13737R(StringBuilder sb2, int i10, zzew.zzc zzcVar) {
        if (zzcVar == null) {
            return;
        }
        m13736Q(sb2, i10);
        sb2.append("filter {\n");
        if (zzcVar.zzg()) {
            m13740U(sb2, i10, "complement", Boolean.valueOf(zzcVar.zzf()));
        }
        if (zzcVar.zzi()) {
            m13740U(sb2, i10, "param_name", mo13677d().m14168f(zzcVar.zze()));
        }
        if (zzcVar.zzj()) {
            int i11 = i10 + 1;
            zzew.zzf zzd = zzcVar.zzd();
            if (zzd != null) {
                m13736Q(sb2, i11);
                sb2.append("string_filter");
                sb2.append(" {\n");
                if (zzd.zzj()) {
                    m13740U(sb2, i11, "match_type", zzd.zzb().name());
                }
                if (zzd.zzi()) {
                    m13740U(sb2, i11, "expression", zzd.zze());
                }
                if (zzd.zzh()) {
                    m13740U(sb2, i11, "case_sensitive", Boolean.valueOf(zzd.zzg()));
                }
                if (zzd.zza() > 0) {
                    m13736Q(sb2, i11 + 1);
                    sb2.append("expression_list {\n");
                    for (String str : zzd.zzf()) {
                        m13736Q(sb2, i11 + 2);
                        sb2.append(str);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                m13736Q(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (zzcVar.zzh()) {
            m13738S(sb2, i10 + 1, "number_filter", zzcVar.zzc());
        }
        m13736Q(sb2, i10);
        sb2.append("}\n");
    }

    /* renamed from: S */
    private static void m13738S(StringBuilder sb2, int i10, String str, zzew.zzd zzdVar) {
        if (zzdVar == null) {
            return;
        }
        m13736Q(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzdVar.zzh()) {
            m13740U(sb2, i10, "comparison_type", zzdVar.zza().name());
        }
        if (zzdVar.zzj()) {
            m13740U(sb2, i10, "match_as_float", Boolean.valueOf(zzdVar.zzg()));
        }
        if (zzdVar.zzi()) {
            m13740U(sb2, i10, "comparison_value", zzdVar.zzd());
        }
        if (zzdVar.zzl()) {
            m13740U(sb2, i10, "min_comparison_value", zzdVar.zzf());
        }
        if (zzdVar.zzk()) {
            m13740U(sb2, i10, "max_comparison_value", zzdVar.zze());
        }
        m13736Q(sb2, i10);
        sb2.append("}\n");
    }

    /* renamed from: T */
    private static void m13739T(StringBuilder sb2, int i10, String str, zzfi.zzl zzlVar) {
        if (zzlVar == null) {
            return;
        }
        m13736Q(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzlVar.zzb() != 0) {
            m13736Q(sb2, 4);
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
            m13736Q(sb2, 4);
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
            m13736Q(sb2, 4);
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
            m13736Q(sb2, 4);
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
        m13736Q(sb2, 3);
        sb2.append("}\n");
    }

    /* renamed from: U */
    private static void m13740U(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m13736Q(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    /* renamed from: V */
    private final void m13741V(StringBuilder sb2, int i10, List<zzfi.zzg> list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        for (zzfi.zzg zzgVar : list) {
            if (zzgVar != null) {
                m13736Q(sb2, i11);
                sb2.append("param {\n");
                m13740U(sb2, i11, "name", zzgVar.zzm() ? mo13677d().m14168f(zzgVar.zzg()) : null);
                m13740U(sb2, i11, "string_value", zzgVar.zzn() ? zzgVar.zzh() : null);
                m13740U(sb2, i11, "int_value", zzgVar.zzl() ? Long.valueOf(zzgVar.zzd()) : null);
                m13740U(sb2, i11, "double_value", zzgVar.zzj() ? Double.valueOf(zzgVar.zza()) : null);
                if (zzgVar.zzc() > 0) {
                    m13741V(sb2, i11, zzgVar.zzi());
                }
                m13736Q(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public static boolean m13742X(C5461d0 c5461d0, C5576lb c5576lb) {
        C5276s.m13324j(c5461d0);
        C5276s.m13324j(c5576lb);
        return (TextUtils.isEmpty(c5576lb.f11554b) && TextUtils.isEmpty(c5576lb.f11539B)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public static boolean m13743Y(List<Long> list, int i10) {
        if (i10 < (list.size() << 6)) {
            return ((1 << (i10 % 64)) & list.get(i10 / 64).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public static Object m13744Z(zzfi.zze zzeVar, String str) {
        zzfi.zzg m13748z = m13748z(zzeVar, str);
        if (m13748z == null) {
            return null;
        }
        if (m13748z.zzn()) {
            return m13748z.zzh();
        }
        if (m13748z.zzl()) {
            return Long.valueOf(m13748z.zzd());
        }
        if (m13748z.zzj()) {
            return Double.valueOf(m13748z.zza());
        }
        if (m13748z.zzc() <= 0) {
            return null;
        }
        List<zzfi.zzg> zzi = m13748z.zzi();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public static boolean m13745a0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static int m13746t(zzfi.zzj.zza zzaVar, String str) {
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

    /* renamed from: w */
    private final Bundle m13747w(Map<String, Object> map, boolean z10) {
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
                    arrayList2.add(m13747w((Map) obj2, false));
                }
                bundle.putParcelableArray(str2, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
            bundle.putString(str2, str);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static zzfi.zzg m13748z(zzfi.zze zzeVar, String str) {
        for (zzfi.zzg zzgVar : zzeVar.zzh()) {
            if (zzgVar.zzg().equals(str)) {
                return zzgVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public final C5461d0 m13749B(zzad zzadVar) {
        Object obj;
        Bundle m13747w = m13747w(zzadVar.zzc(), true);
        String obj2 = (!m13747w.containsKey("_o") || (obj = m13747w.get("_o")) == null) ? "app" : obj.toString();
        String m38857b = C12120r.m38857b(zzadVar.zzb());
        if (m38857b == null) {
            m38857b = zzadVar.zzb();
        }
        return new C5461d0(m38857b, new C5742z(m13747w), obj2, zzadVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0283  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C5601na m13750C(java.lang.String r12, com.google.android.gms.internal.measurement.zzfi.zzj r13, com.google.android.gms.internal.measurement.zzfi.zze.zza r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5472db.m13750C(java.lang.String, com.google.android.gms.internal.measurement.zzfi$zzj, com.google.android.gms.internal.measurement.zzfi$zze$zza, java.lang.String):com.google.android.gms.measurement.internal.na");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public final String m13751D(zzew.zzb zzbVar) {
        if (zzbVar == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (zzbVar.zzl()) {
            m13740U(sb2, 0, "filter_id", Integer.valueOf(zzbVar.zzb()));
        }
        m13740U(sb2, 0, "event_name", mo13677d().m14167c(zzbVar.zzf()));
        String m13731G = m13731G(zzbVar.zzh(), zzbVar.zzi(), zzbVar.zzj());
        if (!m13731G.isEmpty()) {
            m13740U(sb2, 0, "filter_type", m13731G);
        }
        if (zzbVar.zzk()) {
            m13738S(sb2, 1, "event_count_filter", zzbVar.zze());
        }
        if (zzbVar.zza() > 0) {
            sb2.append("  filters {\n");
            Iterator<zzew.zzc> it = zzbVar.zzg().iterator();
            while (it.hasNext()) {
                m13737R(sb2, 2, it.next());
            }
        }
        m13736Q(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public final String m13752E(zzew.zze zzeVar) {
        if (zzeVar == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (zzeVar.zzi()) {
            m13740U(sb2, 0, "filter_id", Integer.valueOf(zzeVar.zza()));
        }
        m13740U(sb2, 0, "property_name", mo13677d().m14169g(zzeVar.zze()));
        String m13731G = m13731G(zzeVar.zzf(), zzeVar.zzg(), zzeVar.zzh());
        if (!m13731G.isEmpty()) {
            m13740U(sb2, 0, "filter_type", m13731G);
        }
        m13737R(sb2, 1, zzeVar.zzb());
        sb2.append("}\n");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public final String m13753F(zzfi.zzi zziVar) {
        zzfi.zzb zzt;
        if (zziVar == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        for (zzfi.zzj zzjVar : zziVar.zzd()) {
            if (zzjVar != null) {
                m13736Q(sb2, 1);
                sb2.append("bundle {\n");
                if (zzjVar.zzbk()) {
                    m13740U(sb2, 1, "protocol_version", Integer.valueOf(zzjVar.zze()));
                }
                if (zzps.zza() && mo13672a().m13909w(zzjVar.zzx(), C5474e0.f11310y0) && zzjVar.zzbn()) {
                    m13740U(sb2, 1, "session_stitching_token", zzjVar.zzam());
                }
                m13740U(sb2, 1, "platform", zzjVar.zzak());
                if (zzjVar.zzbf()) {
                    m13740U(sb2, 1, "gmp_version", Long.valueOf(zzjVar.zzm()));
                }
                if (zzjVar.zzbs()) {
                    m13740U(sb2, 1, "uploading_gmp_version", Long.valueOf(zzjVar.zzs()));
                }
                if (zzjVar.zzbd()) {
                    m13740U(sb2, 1, "dynamite_version", Long.valueOf(zzjVar.zzk()));
                }
                if (zzjVar.zzay()) {
                    m13740U(sb2, 1, "config_version", Long.valueOf(zzjVar.zzi()));
                }
                m13740U(sb2, 1, "gmp_app_id", zzjVar.zzah());
                m13740U(sb2, 1, "admob_app_id", zzjVar.zzw());
                m13740U(sb2, 1, "app_id", zzjVar.zzx());
                m13740U(sb2, 1, "app_version", zzjVar.zzaa());
                if (zzjVar.zzav()) {
                    m13740U(sb2, 1, "app_version_major", Integer.valueOf(zzjVar.zzb()));
                }
                m13740U(sb2, 1, "firebase_instance_id", zzjVar.zzag());
                if (zzjVar.zzbc()) {
                    m13740U(sb2, 1, "dev_cert_hash", Long.valueOf(zzjVar.zzj()));
                }
                m13740U(sb2, 1, "app_store", zzjVar.zzz());
                if (zzjVar.zzbr()) {
                    m13740U(sb2, 1, "upload_timestamp_millis", Long.valueOf(zzjVar.zzr()));
                }
                if (zzjVar.zzbo()) {
                    m13740U(sb2, 1, "start_timestamp_millis", Long.valueOf(zzjVar.zzp()));
                }
                if (zzjVar.zzbe()) {
                    m13740U(sb2, 1, "end_timestamp_millis", Long.valueOf(zzjVar.zzl()));
                }
                if (zzjVar.zzbj()) {
                    m13740U(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzjVar.zzo()));
                }
                if (zzjVar.zzbi()) {
                    m13740U(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzjVar.zzn()));
                }
                m13740U(sb2, 1, "app_instance_id", zzjVar.zzy());
                m13740U(sb2, 1, "resettable_device_id", zzjVar.zzal());
                m13740U(sb2, 1, "ds_id", zzjVar.zzaf());
                if (zzjVar.zzbh()) {
                    m13740U(sb2, 1, "limited_ad_tracking", Boolean.valueOf(zzjVar.zzat()));
                }
                m13740U(sb2, 1, "os_version", zzjVar.zzaj());
                m13740U(sb2, 1, "device_model", zzjVar.zzae());
                m13740U(sb2, 1, "user_default_language", zzjVar.zzan());
                if (zzjVar.zzbq()) {
                    m13740U(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(zzjVar.zzg()));
                }
                if (zzjVar.zzax()) {
                    m13740U(sb2, 1, "bundle_sequential_index", Integer.valueOf(zzjVar.zzc()));
                }
                if (zzjVar.zzbm()) {
                    m13740U(sb2, 1, "service_upload", Boolean.valueOf(zzjVar.zzau()));
                }
                m13740U(sb2, 1, "health_monitor", zzjVar.zzai());
                if (zzjVar.zzbl()) {
                    m13740U(sb2, 1, "retry_counter", Integer.valueOf(zzjVar.zzf()));
                }
                if (zzjVar.zzba()) {
                    m13740U(sb2, 1, "consent_signals", zzjVar.zzac());
                }
                if (zzjVar.zzbg()) {
                    m13740U(sb2, 1, "is_dma_region", Boolean.valueOf(zzjVar.zzas()));
                }
                if (zzjVar.zzbb()) {
                    m13740U(sb2, 1, "core_platform_services", zzjVar.zzad());
                }
                if (zzjVar.zzaz()) {
                    m13740U(sb2, 1, "consent_diagnostics", zzjVar.zzab());
                }
                if (zzjVar.zzbp()) {
                    m13740U(sb2, 1, "target_os_version", Long.valueOf(zzjVar.zzq()));
                }
                if (zzpg.zza() && mo13672a().m13909w(zzjVar.zzx(), C5474e0.f11230L0)) {
                    m13740U(sb2, 1, "ad_services_version", Integer.valueOf(zzjVar.zza()));
                    if (zzjVar.zzaw() && (zzt = zzjVar.zzt()) != null) {
                        m13736Q(sb2, 2);
                        sb2.append("attribution_eligibility_status {\n");
                        m13740U(sb2, 2, "eligible", Boolean.valueOf(zzt.zzf()));
                        m13740U(sb2, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzt.zzh()));
                        m13740U(sb2, 2, "pre_r", Boolean.valueOf(zzt.zzi()));
                        m13740U(sb2, 2, "r_extensions_too_old", Boolean.valueOf(zzt.zzj()));
                        m13740U(sb2, 2, "adservices_extension_too_old", Boolean.valueOf(zzt.zze()));
                        m13740U(sb2, 2, "ad_storage_not_allowed", Boolean.valueOf(zzt.zzd()));
                        m13740U(sb2, 2, "measurement_manager_disabled", Boolean.valueOf(zzt.zzg()));
                        m13736Q(sb2, 2);
                        sb2.append("}\n");
                    }
                }
                List<zzfi.zzn> zzaq = zzjVar.zzaq();
                if (zzaq != null) {
                    for (zzfi.zzn zznVar : zzaq) {
                        if (zznVar != null) {
                            m13736Q(sb2, 2);
                            sb2.append("user_property {\n");
                            m13740U(sb2, 2, "set_timestamp_millis", zznVar.zzl() ? Long.valueOf(zznVar.zzd()) : null);
                            m13740U(sb2, 2, "name", mo13677d().m14169g(zznVar.zzg()));
                            m13740U(sb2, 2, "string_value", zznVar.zzh());
                            m13740U(sb2, 2, "int_value", zznVar.zzk() ? Long.valueOf(zznVar.zzc()) : null);
                            m13740U(sb2, 2, "double_value", zznVar.zzi() ? Double.valueOf(zznVar.zza()) : null);
                            m13736Q(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<zzfi.zzc> zzao = zzjVar.zzao();
                zzjVar.zzx();
                if (zzao != null) {
                    for (zzfi.zzc zzcVar : zzao) {
                        if (zzcVar != null) {
                            m13736Q(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (zzcVar.zzg()) {
                                m13740U(sb2, 2, "audience_id", Integer.valueOf(zzcVar.zza()));
                            }
                            if (zzcVar.zzh()) {
                                m13740U(sb2, 2, "new_audience", Boolean.valueOf(zzcVar.zzf()));
                            }
                            m13739T(sb2, 2, "current_data", zzcVar.zzd());
                            if (zzcVar.zzi()) {
                                m13739T(sb2, 2, "previous_data", zzcVar.zze());
                            }
                            m13736Q(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<zzfi.zze> zzap = zzjVar.zzap();
                if (zzap != null) {
                    for (zzfi.zze zzeVar : zzap) {
                        if (zzeVar != null) {
                            m13736Q(sb2, 2);
                            sb2.append("event {\n");
                            m13740U(sb2, 2, "name", mo13677d().m14167c(zzeVar.zzg()));
                            if (zzeVar.zzk()) {
                                m13740U(sb2, 2, "timestamp_millis", Long.valueOf(zzeVar.zzd()));
                            }
                            if (zzeVar.zzj()) {
                                m13740U(sb2, 2, "previous_timestamp_millis", Long.valueOf(zzeVar.zzc()));
                            }
                            if (zzeVar.zzi()) {
                                m13740U(sb2, 2, "count", Integer.valueOf(zzeVar.zza()));
                            }
                            if (zzeVar.zzb() != 0) {
                                m13741V(sb2, 2, zzeVar.zzh());
                            }
                            m13736Q(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                m13736Q(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("}\n");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final List<Long> m13754I(List<Long> list, List<Integer> list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                zzj().m14187G().m14219b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    zzj().m14187G().m14220c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public final Map<String, Object> m13755J(Bundle bundle, boolean z10) {
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
                                arrayList.add(m13755J((Bundle) parcelable, false));
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
                                arrayList.add(m13755J((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(m13755J((Bundle) obj, false));
                    }
                    hashMap.put(str, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public final void m13756N(zzfi.zzg.zza zzaVar, Object obj) {
        C5276s.m13324j(obj);
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
            zzj().m14182B().m14219b("Ignoring invalid (type) event param value", obj);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public final void m13757O(zzfi.zzj.zza zzaVar) {
        zzj().m14186F().m14218a("Checking account type status for ad personalization signals");
        if (m13761c0(zzaVar.zzr())) {
            zzj().m14181A().m14218a("Turning off ad personalization due to account type");
            zzfi.zzn zznVar = (zzfi.zzn) ((zzix) zzfi.zzn.zze().zza("_npa").zzb(mo13675c().m14540p()).zza(1L).zzab());
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
            if (zznp.zza() && mo13672a().m13900n(C5474e0.f11246T0)) {
                C5551k m14063b = C5551k.m14063b(zzaVar.zzs());
                m14063b.m14066d(C5737y6.a.AD_PERSONALIZATION, EnumC5538j.CHILD_ACCOUNT);
                zzaVar.zzf(m14063b.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public final void m13758P(zzfi.zzn.zza zzaVar, Object obj) {
        C5276s.m13324j(obj);
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
            zzj().m14182B().m14219b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public final boolean m13759W(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(zzb().mo28130a() - j10) > j11;
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5486f mo13672a() {
        return super.mo13672a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final byte[] m13760b0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            zzj().m14182B().m14219b("Failed to gzip content", e10);
            throw e10;
        }
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5730y mo13675c() {
        return super.mo13675c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final boolean m13761c0(String str) {
        C5276s.m13324j(str);
        C5648r5 m14160y0 = mo13766l().m14160y0(str);
        return m14160y0 != null && mo13675c().m14544t() && m14160y0.m14318q() && mo13767m().m13955Q(str);
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5582m4 mo13677d() {
        return super.mo13677d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public final byte[] m13762d0(byte[] bArr) {
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
            zzj().m14182B().m14219b("Failed to ungzip content", e10);
            throw e10;
        }
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C5735y4 mo13679e() {
        return super.mo13679e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final List<Integer> m13763e0() {
        Map<String, String> m13829c = C5474e0.m13829c(this.f11804b.zza());
        if (m13829c == null || m13829c.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = C5474e0.f11241R.m13918a(null).intValue();
        for (Map.Entry<String, String> entry : m13829c.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt(entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            zzj().m14187G().m14219b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e10) {
                    zzj().m14187G().m14219b("Experiment ID NumberFormatException", e10);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C5537ib mo13681f() {
        return super.mo13681f();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo13683g() {
        super.mo13683g();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo13685h() {
        super.mo13685h();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo13687i() {
        super.mo13687i();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C5472db mo13764j() {
        return super.mo13764j();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C5628pb mo13765k() {
        return super.mo13765k();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C5577m mo13766l() {
        return super.mo13766l();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C5531i5 mo13767m() {
        return super.mo13767m();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C5740y9 mo13768n() {
        return super.mo13768n();
    }

    @Override // com.google.android.gms.measurement.internal.C5653ra
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C5679ta mo13769o() {
        return super.mo13769o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5692ua
    /* renamed from: s */
    protected final boolean mo13770s() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final long m13771u(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return m13772v(str.getBytes(Charset.forName("UTF-8")));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final long m13772v(byte[] bArr) {
        C5276s.m13324j(bArr);
        mo13681f().mo13687i();
        MessageDigest m13981O0 = C5537ib.m13981O0();
        if (m13981O0 != null) {
            return C5537ib.m14003w(m13981O0.digest(bArr));
        }
        zzj().m14182B().m14218a("Failed to get MD5");
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final <T extends Parcelable> T m13773x(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (C7139b.a unused) {
            zzj().m14182B().m14218a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final zzfi.zze m13774y(C5706w c5706w) {
        zzfi.zze.zza zza = zzfi.zze.zze().zza(c5706w.f11959e);
        Iterator<String> it = c5706w.f11960f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            zzfi.zzg.zza zza2 = zzfi.zzg.zze().zza(next);
            Object m14605y1 = c5706w.f11960f.m14605y1(next);
            C5276s.m13324j(m14605y1);
            m13756N(zza2, m14605y1);
            zza.zza(zza2);
        }
        return (zzfi.zze) ((zzix) zza.zzab());
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ InterfaceC9461f zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5473e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5595n4 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5635q5 zzl() {
        return super.zzl();
    }
}
