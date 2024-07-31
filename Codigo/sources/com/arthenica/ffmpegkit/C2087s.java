package com.arthenica.ffmpegkit;

/* renamed from: com.arthenica.ffmpegkit.s */
/* loaded from: classes.dex */
public class C2087s extends AbstractC2068b {

    /* renamed from: o */
    private C2085q f8226o;

    /* renamed from: p */
    private final InterfaceC2088t f8227p;

    private C2087s(String[] strArr, InterfaceC2088t interfaceC2088t, InterfaceC2083o interfaceC2083o) {
        super(strArr, interfaceC2083o, EnumC2084p.NEVER_PRINT_LOGS);
        this.f8227p = interfaceC2088t;
    }

    /* renamed from: y */
    public static C2087s m10529y(String[] strArr, InterfaceC2088t interfaceC2088t, InterfaceC2083o interfaceC2083o) {
        return new C2087s(strArr, interfaceC2088t, interfaceC2083o);
    }

    /* renamed from: A */
    public C2085q m10530A() {
        return this.f8226o;
    }

    /* renamed from: B */
    public void m10531B(C2085q c2085q) {
        this.f8226o = c2085q;
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: g */
    public boolean mo10509g() {
        return false;
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: n */
    public boolean mo10510n() {
        return false;
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: p */
    public boolean mo10511p() {
        return true;
    }

    public String toString() {
        return "MediaInformationSession{sessionId=" + this.f8193a + ", createTime=" + this.f8195c + ", startTime=" + this.f8196d + ", endTime=" + this.f8197e + ", arguments=" + FFmpegKitConfig.m10439c(this.f8198f) + ", logs=" + m10496u() + ", state=" + this.f8202j + ", returnCode=" + this.f8203k + ", failStackTrace='" + this.f8204l + "'}";
    }

    /* renamed from: z */
    public InterfaceC2088t m10532z() {
        return this.f8227p;
    }
}
