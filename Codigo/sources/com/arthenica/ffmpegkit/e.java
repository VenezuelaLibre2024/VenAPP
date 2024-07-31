package com.arthenica.ffmpegkit;

import android.util.Log;

/* loaded from: classes.dex */
public class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final s f7259a;

    /* renamed from: b, reason: collision with root package name */
    private final t f7260b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f7261c;

    public e(s sVar, Integer num) {
        this.f7259a = sVar;
        this.f7260b = sVar.z();
        this.f7261c = num;
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.D(this.f7259a, this.f7261c.intValue());
        t tVar = this.f7260b;
        if (tVar != null) {
            try {
                tVar.a(this.f7259a);
            } catch (Exception e10) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside session complete callback.%s", u2.a.a(e10)));
            }
        }
        t E = FFmpegKitConfig.E();
        if (E != null) {
            try {
                E.a(this.f7259a);
            } catch (Exception e11) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside global complete callback.%s", u2.a.a(e11)));
            }
        }
    }
}
