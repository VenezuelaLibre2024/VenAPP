package com.arthenica.ffmpegkit;

import android.util.Log;
import p372u2.C11302a;

/* renamed from: com.arthenica.ffmpegkit.d */
/* loaded from: classes.dex */
public class RunnableC2072d implements Runnable {

    /* renamed from: a */
    private final C2079k f8209a;

    /* renamed from: b */
    private final InterfaceC2080l f8210b;

    public RunnableC2072d(C2079k c2079k) {
        this.f8209a = c2079k;
        this.f8210b = c2079k.m10517z();
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.m10455s(this.f8209a);
        InterfaceC2080l interfaceC2080l = this.f8210b;
        if (interfaceC2080l != null) {
            try {
                interfaceC2080l.mo10518a(this.f8209a);
            } catch (Exception e10) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside session complete callback.%s", C11302a.m35304a(e10)));
            }
        }
        InterfaceC2080l m10460x = FFmpegKitConfig.m10460x();
        if (m10460x != null) {
            try {
                m10460x.mo10518a(this.f8209a);
            } catch (Exception e11) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside global complete callback.%s", C11302a.m35304a(e11)));
            }
        }
    }
}
