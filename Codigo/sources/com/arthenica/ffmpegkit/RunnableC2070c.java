package com.arthenica.ffmpegkit;

import android.util.Log;
import p372u2.C11302a;

/* renamed from: com.arthenica.ffmpegkit.c */
/* loaded from: classes.dex */
public class RunnableC2070c implements Runnable {

    /* renamed from: a */
    private final C2076h f8206a;

    /* renamed from: b */
    private final InterfaceC2077i f8207b;

    public RunnableC2070c(C2076h c2076h) {
        this.f8206a = c2076h;
        this.f8207b = c2076h.m10506B();
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.m10454r(this.f8206a);
        InterfaceC2077i interfaceC2077i = this.f8207b;
        if (interfaceC2077i != null) {
            try {
                interfaceC2077i.mo10513a(this.f8206a);
            } catch (Exception e10) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside session complete callback.%s", C11302a.m35304a(e10)));
            }
        }
        InterfaceC2077i m10457u = FFmpegKitConfig.m10457u();
        if (m10457u != null) {
            try {
                m10457u.mo10513a(this.f8206a);
            } catch (Exception e11) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside global complete callback.%s", C11302a.m35304a(e11)));
            }
        }
    }
}
