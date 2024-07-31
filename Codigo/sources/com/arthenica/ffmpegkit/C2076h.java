package com.arthenica.ffmpegkit;

import android.util.Log;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.arthenica.ffmpegkit.h */
/* loaded from: classes.dex */
public class C2076h extends AbstractC2068b {

    /* renamed from: o */
    private final InterfaceC2069b0 f8215o;

    /* renamed from: p */
    private final InterfaceC2077i f8216p;

    /* renamed from: q */
    private final List<C2067a0> f8217q;

    /* renamed from: r */
    private final Object f8218r;

    private C2076h(String[] strArr, InterfaceC2077i interfaceC2077i, InterfaceC2083o interfaceC2083o, InterfaceC2069b0 interfaceC2069b0, EnumC2084p enumC2084p) {
        super(strArr, interfaceC2083o, enumC2084p);
        this.f8216p = interfaceC2077i;
        this.f8215o = interfaceC2069b0;
        this.f8217q = new LinkedList();
        this.f8218r = new Object();
    }

    /* renamed from: z */
    public static C2076h m10504z(String[] strArr, InterfaceC2077i interfaceC2077i, InterfaceC2083o interfaceC2083o, InterfaceC2069b0 interfaceC2069b0, EnumC2084p enumC2084p) {
        return new C2076h(strArr, interfaceC2077i, interfaceC2083o, interfaceC2069b0, enumC2084p);
    }

    /* renamed from: A */
    public List<C2067a0> m10505A(int i10) {
        m10499x(i10);
        if (mo10480b()) {
            Log.i("ffmpeg-kit", String.format("getAllStatistics was called to return all statistics but there are still statistics being transmitted for session id %d.", Long.valueOf(this.f8193a)));
        }
        return m10507C();
    }

    /* renamed from: B */
    public InterfaceC2077i m10506B() {
        return this.f8216p;
    }

    /* renamed from: C */
    public List<C2067a0> m10507C() {
        List<C2067a0> list;
        synchronized (this.f8218r) {
            list = this.f8217q;
        }
        return list;
    }

    /* renamed from: D */
    public InterfaceC2069b0 m10508D() {
        return this.f8215o;
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: g */
    public boolean mo10509g() {
        return true;
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: n */
    public boolean mo10510n() {
        return false;
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: p */
    public boolean mo10511p() {
        return false;
    }

    public String toString() {
        return "FFmpegSession{sessionId=" + this.f8193a + ", createTime=" + this.f8195c + ", startTime=" + this.f8196d + ", endTime=" + this.f8197e + ", arguments=" + FFmpegKitConfig.m10439c(this.f8198f) + ", logs=" + m10496u() + ", state=" + this.f8202j + ", returnCode=" + this.f8203k + ", failStackTrace='" + this.f8204l + "'}";
    }

    /* renamed from: y */
    public void m10512y(C2067a0 c2067a0) {
        synchronized (this.f8218r) {
            this.f8217q.add(c2067a0);
        }
    }
}
