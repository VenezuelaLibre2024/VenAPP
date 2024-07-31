package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f8952a = false;

    /* renamed from: b, reason: collision with root package name */
    private float f8953b = 1.0f;

    public static float b(Context context) {
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

    private final synchronized boolean f() {
        return this.f8953b >= 0.0f;
    }

    public final synchronized float a() {
        if (!f()) {
            return 1.0f;
        }
        return this.f8953b;
    }

    public final synchronized void c(boolean z10) {
        this.f8952a = z10;
    }

    public final synchronized void d(float f10) {
        this.f8953b = f10;
    }

    public final synchronized boolean e() {
        return this.f8952a;
    }
}
