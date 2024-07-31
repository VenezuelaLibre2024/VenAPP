package com.arthenica.ffmpegkit;

import android.util.Log;

/* loaded from: classes.dex */
public class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final h f7254a;

    /* renamed from: b, reason: collision with root package name */
    private final i f7255b;

    public c(h hVar) {
        this.f7254a = hVar;
        this.f7255b = hVar.B();
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.r(this.f7254a);
        i iVar = this.f7255b;
        if (iVar != null) {
            try {
                iVar.a(this.f7254a);
            } catch (Exception e10) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside session complete callback.%s", u2.a.a(e10)));
            }
        }
        i u10 = FFmpegKitConfig.u();
        if (u10 != null) {
            try {
                u10.a(this.f7254a);
            } catch (Exception e11) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside global complete callback.%s", u2.a.a(e11)));
            }
        }
    }
}
