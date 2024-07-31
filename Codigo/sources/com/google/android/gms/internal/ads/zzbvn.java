package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbvn extends zzbvw {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbvn(zzcjk zzcjkVar, Map map) {
        super(zzcjkVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcjkVar.zzi();
        this.zzc = zze("description");
        this.zzf = zze("summary");
        this.zzd = zzd("start_ticks");
        this.zze = zzd("end_ticks");
        this.zzg = zze("location");
    }

    private final long zzd(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String zze(String str) {
        return TextUtils.isEmpty((CharSequence) this.zza.get(str)) ? "" : (String) this.zza.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j10 = this.zzd;
        if (j10 > -1) {
            data.putExtra("beginTime", j10);
        }
        long j11 = this.zze;
        if (j11 > -1) {
            data.putExtra("endTime", j11);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void zzc() {
        if (this.zzb == null) {
            zzh("Activity context is not available.");
            return;
        }
        t.r();
        if (!new zzbfm(this.zzb).zzb()) {
            zzh("This feature is not available on the device.");
            return;
        }
        t.r();
        AlertDialog.Builder j10 = j2.j(this.zzb);
        Resources zze = t.q().zze();
        j10.setTitle(zze != null ? zze.getString(d9.d.f13873q) : "Create calendar event");
        j10.setMessage(zze != null ? zze.getString(d9.d.f13874r) : "Allow Ad to create a calendar event?");
        j10.setPositiveButton(zze != null ? zze.getString(d9.d.f13871o) : "Accept", new zzbvl(this));
        j10.setNegativeButton(zze != null ? zze.getString(d9.d.f13872p) : "Decline", new zzbvm(this));
        j10.create().show();
    }
}
