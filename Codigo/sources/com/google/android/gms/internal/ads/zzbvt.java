package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbvt extends zzbvw {
    private final Map zza;
    private final Context zzb;

    public zzbvt(zzcjk zzcjkVar, Map map) {
        super(zzcjkVar, "storePicture");
        this.zza = map;
        this.zzb = zzcjkVar.zzi();
    }

    public final void zzb() {
        if (this.zzb == null) {
            zzh("Activity context is not available");
            return;
        }
        t.r();
        if (!new zzbfm(this.zzb).zzc()) {
            zzh("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzh("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            zzh("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        t.r();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            zzh("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources zze = t.q().zze();
        t.r();
        AlertDialog.Builder j10 = j2.j(this.zzb);
        j10.setTitle(zze != null ? zze.getString(d9.d.f13869m) : "Save image");
        j10.setMessage(zze != null ? zze.getString(d9.d.f13870n) : "Allow Ad to store image in Picture gallery?");
        j10.setPositiveButton(zze != null ? zze.getString(d9.d.f13871o) : "Accept", new zzbvr(this, str, lastPathSegment));
        j10.setNegativeButton(zze != null ? zze.getString(d9.d.f13872p) : "Decline", new zzbvs(this));
        j10.create().show();
    }
}
