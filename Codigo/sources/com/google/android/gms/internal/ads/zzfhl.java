package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;

/* loaded from: classes2.dex */
public final class zzfhl {
    private final zzavi zza;

    public zzfhl(zzavi zzaviVar) {
        this.zza = zzaviVar;
    }

    private static final Uri zzb(Uri uri, String str) {
        StringBuilder sb2;
        String str2;
        String host;
        String path;
        if (uri != null) {
            try {
                try {
                    host = uri.getHost();
                    path = uri.getPath();
                } catch (UnsupportedOperationException unused) {
                    throw new zzavj("Provided Uri is not in a valid state");
                }
            } catch (NullPointerException unused2) {
            }
            if (host != null && host.equals("ad.doubleclick.net") && path != null) {
                if (path.contains(";")) {
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
                        sb2.append((CharSequence) uri2, i10, uri2.length());
                        str2 = sb2.toString();
                        return Uri.parse(str2);
                    }
                    String encodedPath = uri.getEncodedPath();
                    if (encodedPath == null) {
                        throw new UnsupportedOperationException();
                    }
                    int indexOf2 = uri2.indexOf(encodedPath);
                    StringBuilder sb3 = new StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2));
                    sb3.append(";");
                    sb3.append("dc_ms");
                    sb3.append("=");
                    sb3.append(str);
                    sb3.append(";");
                    sb3.append((CharSequence) uri2, indexOf2 + encodedPath.length(), uri2.length());
                    str2 = sb3.toString();
                    return Uri.parse(str2);
                }
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
        sb2.append((CharSequence) uri3, i11, uri3.length());
        str2 = sb2.toString();
        return Uri.parse(str2);
    }

    public final Uri zza(Uri uri, Context context, View view, Activity activity) {
        try {
            return zzb(uri, this.zza.zzc().zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzavj("Provided Uri is not in a valid state");
        }
    }
}
