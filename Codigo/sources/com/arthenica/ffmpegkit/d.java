package com.arthenica.ffmpegkit;

import android.util.Log;

/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final k f7257a;

    /* renamed from: b, reason: collision with root package name */
    private final l f7258b;

    public d(k kVar) {
        this.f7257a = kVar;
        this.f7258b = kVar.z();
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.s(this.f7257a);
        l lVar = this.f7258b;
        if (lVar != null) {
            try {
                lVar.a(this.f7257a);
            } catch (Exception e10) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside session complete callback.%s", u2.a.a(e10)));
            }
        }
        l x10 = FFmpegKitConfig.x();
        if (x10 != null) {
            try {
                x10.a(this.f7257a);
            } catch (Exception e11) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside global complete callback.%s", u2.a.a(e11)));
            }
        }
    }
}
