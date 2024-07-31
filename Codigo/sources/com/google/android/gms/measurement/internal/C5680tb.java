package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzix;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.tb */
/* loaded from: classes2.dex */
public final class C5680tb {

    /* renamed from: a */
    private zzfi.zze f11856a;

    /* renamed from: b */
    private Long f11857b;

    /* renamed from: c */
    private long f11858c;

    /* renamed from: d */
    private final /* synthetic */ C5628pb f11859d;

    private C5680tb(C5628pb c5628pb) {
        this.f11859d = c5628pb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzfi.zze m14347a(String str, zzfi.zze zzeVar) {
        C5621p4 m14184D;
        String str2;
        Object obj;
        String zzg = zzeVar.zzg();
        List<zzfi.zzg> zzh = zzeVar.zzh();
        this.f11859d.mo13764j();
        Long l10 = (Long) C5472db.m13744Z(zzeVar, "_eid");
        boolean z10 = l10 != null;
        if (z10 && zzg.equals("_ep")) {
            C5276s.m13324j(l10);
            this.f11859d.mo13764j();
            zzg = (String) C5472db.m13744Z(zzeVar, "_en");
            if (TextUtils.isEmpty(zzg)) {
                this.f11859d.zzj().m14184D().m14219b("Extra parameter without an event name. eventId", l10);
                return null;
            }
            if (this.f11856a == null || this.f11857b == null || l10.longValue() != this.f11857b.longValue()) {
                Pair<zzfi.zze, Long> m14112C = this.f11859d.mo13766l().m14112C(str, l10);
                if (m14112C == null || (obj = m14112C.first) == null) {
                    this.f11859d.zzj().m14184D().m14220c("Extra parameter without existing main event. eventName, eventId", zzg, l10);
                    return null;
                }
                this.f11856a = (zzfi.zze) obj;
                this.f11858c = ((Long) m14112C.second).longValue();
                this.f11859d.mo13764j();
                this.f11857b = (Long) C5472db.m13744Z(this.f11856a, "_eid");
            }
            long j10 = this.f11858c - 1;
            this.f11858c = j10;
            if (j10 <= 0) {
                C5577m mo13766l = this.f11859d.mo13766l();
                mo13766l.mo13687i();
                mo13766l.zzj().m14186F().m14219b("Clearing complex main event info. appId", str);
                try {
                    mo13766l.m14155w().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e10) {
                    mo13766l.zzj().m14182B().m14219b("Error clearing complex main event", e10);
                }
            } else {
                this.f11859d.mo13766l().m14147e0(str, l10, this.f11858c, this.f11856a);
            }
            ArrayList arrayList = new ArrayList();
            for (zzfi.zzg zzgVar : this.f11856a.zzh()) {
                this.f11859d.mo13764j();
                if (C5472db.m13748z(zzeVar, zzgVar.zzg()) == null) {
                    arrayList.add(zzgVar);
                }
            }
            if (arrayList.isEmpty()) {
                m14184D = this.f11859d.zzj().m14184D();
                str2 = "No unique parameters in main event. eventName";
                m14184D.m14219b(str2, zzg);
            } else {
                arrayList.addAll(zzh);
                zzh = arrayList;
            }
        } else if (z10) {
            this.f11857b = l10;
            this.f11856a = zzeVar;
            this.f11859d.mo13764j();
            Object m13744Z = C5472db.m13744Z(zzeVar, "_epc");
            long longValue = ((Long) (m13744Z != null ? m13744Z : 0L)).longValue();
            this.f11858c = longValue;
            if (longValue <= 0) {
                m14184D = this.f11859d.zzj().m14184D();
                str2 = "Complex event with zero extra param count. eventName";
                m14184D.m14219b(str2, zzg);
            } else {
                this.f11859d.mo13766l().m14147e0(str, (Long) C5276s.m13324j(l10), this.f11858c, zzeVar);
            }
        }
        return (zzfi.zze) ((zzix) zzeVar.zzby().zza(zzg).zzd().zza(zzh).zzab());
    }
}
