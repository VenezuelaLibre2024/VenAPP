package com.arthenica.ffmpegkit;

/* renamed from: com.arthenica.ffmpegkit.k */
/* loaded from: classes.dex */
public class C2079k extends AbstractC2068b {

    /* renamed from: o */
    private final InterfaceC2080l f8219o;

    private C2079k(String[] strArr, InterfaceC2080l interfaceC2080l, InterfaceC2083o interfaceC2083o, EnumC2084p enumC2084p) {
        super(strArr, interfaceC2083o, enumC2084p);
        this.f8219o = interfaceC2080l;
    }

    /* renamed from: y */
    public static C2079k m10516y(String[] strArr, InterfaceC2080l interfaceC2080l, InterfaceC2083o interfaceC2083o, EnumC2084p enumC2084p) {
        return new C2079k(strArr, interfaceC2080l, interfaceC2083o, enumC2084p);
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: g */
    public boolean mo10509g() {
        return false;
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: n */
    public boolean mo10510n() {
        return true;
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: p */
    public boolean mo10511p() {
        return false;
    }

    public String toString() {
        return "FFprobeSession{sessionId=" + this.f8193a + ", createTime=" + this.f8195c + ", startTime=" + this.f8196d + ", endTime=" + this.f8197e + ", arguments=" + FFmpegKitConfig.m10439c(this.f8198f) + ", logs=" + m10496u() + ", state=" + this.f8202j + ", returnCode=" + this.f8203k + ", failStackTrace='" + this.f8204l + "'}";
    }

    /* renamed from: z */
    public InterfaceC2080l m10517z() {
        return this.f8219o;
    }
}
