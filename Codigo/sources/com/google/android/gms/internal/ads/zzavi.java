package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes2.dex */
public final class zzavi {
    private static final String[] zza = {"/aclk", "/pcs/click", "/dbm/clk"};
    private final String zzb = "ad.doubleclick.net";
    private final String[] zzc = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private final zzave zzd;

    @Deprecated
    public zzavi(zzave zzaveVar) {
        this.zzd = zzaveVar;
    }

    private final Uri zzg(Uri uri, String str) {
        StringBuilder sb2;
        String str2;
        uri.getClass();
        try {
            try {
            } catch (UnsupportedOperationException unused) {
                throw new zzavj("Provided Uri is not in a valid state");
            }
        } catch (NullPointerException unused2) {
        }
        if (uri.getHost().equals(this.zzb)) {
            if (uri.getPath().contains(";")) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new zzavj("Parameter already exists: dc_ms");
                }
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                if (indexOf != -1) {
                    int i10 = indexOf + 1;
                    sb2 = new StringBuilder(uri2.substring(0, i10));
                    sb2.append("dc_ms");
                    sb2.append("=");
                    sb2.append(str);
                    sb2.append(";");
                    sb2.append(uri2.substring(i10));
                    str2 = sb2.toString();
                    return Uri.parse(str2);
                }
                String encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                str2 = uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length());
                return Uri.parse(str2);
            }
        }
        if (uri.getQueryParameter("ms") != null) {
            throw new zzavj("Query parameter already exists: ms");
        }
        String uri3 = uri.toString();
        int indexOf3 = uri3.indexOf("&adurl");
        if (indexOf3 == -1) {
            indexOf3 = uri3.indexOf("?adurl");
        }
        if (indexOf3 == -1) {
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        int i11 = indexOf3 + 1;
        sb2 = new StringBuilder(uri3.substring(0, i11));
        sb2.append("ms");
        sb2.append("=");
        sb2.append(str);
        sb2.append("&");
        sb2.append(uri3.substring(i11));
        str2 = sb2.toString();
        return Uri.parse(str2);
    }

    @Deprecated
    public final Uri zza(Uri uri, Context context, View view, Activity activity) {
        try {
            return zzg(uri, this.zzd.zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzavj("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri zzb(Uri uri, Context context) {
        return zzg(uri, this.zzd.zzg(context));
    }

    @Deprecated
    public final zzave zzc() {
        return this.zzd;
    }

    @Deprecated
    public final void zzd(MotionEvent motionEvent) {
        this.zzd.zzk(motionEvent);
    }

    public final boolean zze(Uri uri) {
        if (zzf(uri)) {
            String[] strArr = zza;
            for (int i10 = 0; i10 < 3; i10++) {
                if (uri.getPath().endsWith(strArr[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean zzf(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.zzc;
            for (int i10 = 0; i10 < 3; i10++) {
                if (host.endsWith(strArr[i10])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
