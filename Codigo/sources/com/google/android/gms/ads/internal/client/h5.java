package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class h5 {

    /* renamed from: a, reason: collision with root package name */
    private final x8.i[] f8672a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8673b;

    public h5(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, x8.x.f30710a);
        String string = obtainAttributes.getString(x8.x.f30711b);
        String string2 = obtainAttributes.getString(x8.x.f30712c);
        boolean z10 = !TextUtils.isEmpty(string);
        boolean z11 = !TextUtils.isEmpty(string2);
        if (z10 && !z11) {
            this.f8672a = c(string);
        } else {
            if (z10 || !z11) {
                obtainAttributes.recycle();
                if (!z10) {
                    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                }
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
            this.f8672a = c(string2);
        }
        String string3 = obtainAttributes.getString(x8.x.f30713d);
        this.f8673b = string3;
        obtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static x8.i[] c(String str) {
        String[] split = str.split("\\s*,\\s*");
        int length = split.length;
        x8.i[] iVarArr = new x8.i[length];
        for (int i10 = 0; i10 < split.length; i10++) {
            String trim = split[i10].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    iVarArr[i10] = new x8.i("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
                }
            } else if ("BANNER".equals(trim)) {
                iVarArr[i10] = x8.i.f30678i;
            } else if ("LARGE_BANNER".equals(trim)) {
                iVarArr[i10] = x8.i.f30680k;
            } else if ("FULL_BANNER".equals(trim)) {
                iVarArr[i10] = x8.i.f30679j;
            } else if ("LEADERBOARD".equals(trim)) {
                iVarArr[i10] = x8.i.f30681l;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                iVarArr[i10] = x8.i.f30682m;
            } else if ("SMART_BANNER".equals(trim)) {
                iVarArr[i10] = x8.i.f30684o;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                iVarArr[i10] = x8.i.f30683n;
            } else if ("FLUID".equals(trim)) {
                iVarArr[i10] = x8.i.f30685p;
            } else {
                if (!"ICON".equals(trim)) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
                }
                iVarArr[i10] = x8.i.f30688s;
            }
        }
        if (length != 0) {
            return iVarArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    public final String a() {
        return this.f8673b;
    }

    public final x8.i[] b(boolean z10) {
        if (z10 || this.f8672a.length == 1) {
            return this.f8672a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
