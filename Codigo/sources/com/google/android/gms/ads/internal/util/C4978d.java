package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: com.google.android.gms.ads.internal.util.d */
/* loaded from: classes.dex */
public final class C4978d {

    /* renamed from: a */
    private boolean f10051a = false;

    /* renamed from: b */
    private float f10052b = 1.0f;

    /* renamed from: b */
    public static float m12617b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume != 0) {
            return streamVolume / streamMaxVolume;
        }
        return 0.0f;
    }

    /* renamed from: f */
    private final synchronized boolean m12618f() {
        return this.f10052b >= 0.0f;
    }

    /* renamed from: a */
    public final synchronized float m12619a() {
        if (!m12618f()) {
            return 1.0f;
        }
        return this.f10052b;
    }

    /* renamed from: c */
    public final synchronized void m12620c(boolean z10) {
        this.f10051a = z10;
    }

    /* renamed from: d */
    public final synchronized void m12621d(float f10) {
        this.f10052b = f10;
    }

    /* renamed from: e */
    public final synchronized boolean m12622e() {
        return this.f10051a;
    }
}
