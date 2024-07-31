package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import p438x8.C12367i;
import p438x8.C12386x;

/* renamed from: com.google.android.gms.ads.internal.client.h5 */
/* loaded from: classes.dex */
public final class C4838h5 {

    /* renamed from: a */
    private final C12367i[] f9749a;

    /* renamed from: b */
    private final String f9750b;

    public C4838h5(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C12386x.f33230a);
        String string = obtainAttributes.getString(C12386x.f33231b);
        String string2 = obtainAttributes.getString(C12386x.f33232c);
        boolean z10 = !TextUtils.isEmpty(string);
        boolean z11 = !TextUtils.isEmpty(string2);
        if (z10 && !z11) {
            this.f9749a = m12404c(string);
        } else {
            if (z10 || !z11) {
                obtainAttributes.recycle();
                if (!z10) {
                    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                }
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
            this.f9749a = m12404c(string2);
        }
        String string3 = obtainAttributes.getString(C12386x.f33233d);
        this.f9750b = string3;
        obtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    /* renamed from: c */
    private static C12367i[] m12404c(String str) {
        String[] split = str.split("\\s*,\\s*");
        int length = split.length;
        C12367i[] c12367iArr = new C12367i[length];
        for (int i10 = 0; i10 < split.length; i10++) {
            String trim = split[i10].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    c12367iArr[i10] = new C12367i("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
                }
            } else if ("BANNER".equals(trim)) {
                c12367iArr[i10] = C12367i.f33198i;
            } else if ("LARGE_BANNER".equals(trim)) {
                c12367iArr[i10] = C12367i.f33200k;
            } else if ("FULL_BANNER".equals(trim)) {
                c12367iArr[i10] = C12367i.f33199j;
            } else if ("LEADERBOARD".equals(trim)) {
                c12367iArr[i10] = C12367i.f33201l;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                c12367iArr[i10] = C12367i.f33202m;
            } else if ("SMART_BANNER".equals(trim)) {
                c12367iArr[i10] = C12367i.f33204o;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                c12367iArr[i10] = C12367i.f33203n;
            } else if ("FLUID".equals(trim)) {
                c12367iArr[i10] = C12367i.f33205p;
            } else {
                if (!"ICON".equals(trim)) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
                }
                c12367iArr[i10] = C12367i.f33208s;
            }
        }
        if (length != 0) {
            return c12367iArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    /* renamed from: a */
    public final String m12405a() {
        return this.f9750b;
    }

    /* renamed from: b */
    public final C12367i[] m12406b(boolean z10) {
        if (z10 || this.f9749a.length == 1) {
            return this.f9749a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
