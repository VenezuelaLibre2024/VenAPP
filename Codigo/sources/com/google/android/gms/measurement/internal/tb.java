package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzix;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class tb {

    /* renamed from: a, reason: collision with root package name */
    private zzfi.zze f10658a;

    /* renamed from: b, reason: collision with root package name */
    private Long f10659b;

    /* renamed from: c, reason: collision with root package name */
    private long f10660c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ pb f10661d;

    private tb(pb pbVar) {
        this.f10661d = pbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfi.zze a(String str, zzfi.zze zzeVar) {
        p4 D;
        String str2;
        Object obj;
        String zzg = zzeVar.zzg();
        List<zzfi.zzg> zzh = zzeVar.zzh();
        this.f10661d.j();
        Long l10 = (Long) db.Z(zzeVar, "_eid");
        boolean z10 = l10 != null;
        if (z10 && zzg.equals("_ep")) {
            com.google.android.gms.common.internal.s.j(l10);
            this.f10661d.j();
            zzg = (String) db.Z(zzeVar, "_en");
            if (TextUtils.isEmpty(zzg)) {
                this.f10661d.zzj().D().b("Extra parameter without an event name. eventId", l10);
                return null;
            }
            if (this.f10658a == null || this.f10659b == null || l10.longValue() != this.f10659b.longValue()) {
                Pair<zzfi.zze, Long> C = this.f10661d.l().C(str, l10);
                if (C == null || (obj = C.first) == null) {
                    this.f10661d.zzj().D().c("Extra parameter without existing main event. eventName, eventId", zzg, l10);
                    return null;
                }
                this.f10658a = (zzfi.zze) obj;
                this.f10660c = ((Long) C.second).longValue();
                this.f10661d.j();
                this.f10659b = (Long) db.Z(this.f10658a, "_eid");
            }
            long j10 = this.f10660c - 1;
            this.f10660c = j10;
            if (j10 <= 0) {
                m l11 = this.f10661d.l();
                l11.i();
                l11.zzj().F().b("Clearing complex main event info. appId", str);
                try {
                    l11.w().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e10) {
                    l11.zzj().B().b("Error clearing complex main event", e10);
                }
            } else {
                this.f10661d.l().e0(str, l10, this.f10660c, this.f10658a);
            }
            ArrayList arrayList = new ArrayList();
            for (zzfi.zzg zzgVar : this.f10658a.zzh()) {
                this.f10661d.j();
                if (db.z(zzeVar, zzgVar.zzg()) == null) {
                    arrayList.add(zzgVar);
                }
            }
            if (arrayList.isEmpty()) {
                D = this.f10661d.zzj().D();
                str2 = "No unique parameters in main event. eventName";
                D.b(str2, zzg);
            } else {
                arrayList.addAll(zzh);
                zzh = arrayList;
            }
        } else if (z10) {
            this.f10659b = l10;
            this.f10658a = zzeVar;
            this.f10661d.j();
            Object Z = db.Z(zzeVar, "_epc");
            long longValue = ((Long) (Z != null ? Z : 0L)).longValue();
            this.f10660c = longValue;
            if (longValue <= 0) {
                D = this.f10661d.zzj().D();
                str2 = "Complex event with zero extra param count. eventName";
                D.b(str2, zzg);
            } else {
                this.f10661d.l().e0(str, (Long) com.google.android.gms.common.internal.s.j(l10), this.f10660c, zzeVar);
            }
        }
        return (zzfi.zze) ((zzix) zzeVar.zzby().zza(zzg).zzd().zza(zzh).zzab());
    }
}
