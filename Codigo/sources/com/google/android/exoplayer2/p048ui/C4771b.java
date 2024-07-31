package com.google.android.exoplayer2.p048ui;

import android.graphics.Color;
import p363t8.C11172r0;

/* renamed from: com.google.android.exoplayer2.ui.b */
/* loaded from: classes.dex */
final class C4771b {
    /* renamed from: a */
    public static String m12292a(String str) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str).length());
        sb2.append(".");
        sb2.append(str);
        sb2.append(",.");
        sb2.append(str);
        sb2.append(" *");
        return sb2.toString();
    }

    /* renamed from: b */
    public static String m12293b(int i10) {
        return C11172r0.m34860C("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(Color.alpha(i10) / 255.0d));
    }
}
