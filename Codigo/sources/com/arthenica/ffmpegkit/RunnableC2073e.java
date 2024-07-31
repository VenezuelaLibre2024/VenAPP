package com.arthenica.ffmpegkit;

import android.util.Log;
import p372u2.C11302a;

/* renamed from: com.arthenica.ffmpegkit.e */
/* loaded from: classes.dex */
public class RunnableC2073e implements Runnable {

    /* renamed from: a */
    private final C2087s f8211a;

    /* renamed from: b */
    private final InterfaceC2088t f8212b;

    /* renamed from: c */
    private final Integer f8213c;

    public RunnableC2073e(C2087s c2087s, Integer num) {
        this.f8211a = c2087s;
        this.f8212b = c2087s.m10532z();
        this.f8213c = num;
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.m10418D(this.f8211a, this.f8213c.intValue());
        InterfaceC2088t interfaceC2088t = this.f8212b;
        if (interfaceC2088t != null) {
            try {
                interfaceC2088t.mo10533a(this.f8211a);
            } catch (Exception e10) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside session complete callback.%s", C11302a.m35304a(e10)));
            }
        }
        InterfaceC2088t m10419E = FFmpegKitConfig.m10419E();
        if (m10419E != null) {
            try {
                m10419E.mo10533a(this.f8211a);
            } catch (Exception e11) {
                Log.e("ffmpeg-kit", String.format("Exception thrown inside global complete callback.%s", C11302a.m35304a(e11)));
            }
        }
    }
}
