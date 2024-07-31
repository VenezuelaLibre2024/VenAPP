package p436x6;

import java.util.UUID;
import p363t8.C11172r0;
import p414w6.InterfaceC12077b;

/* renamed from: x6.c0 */
/* loaded from: classes.dex */
public final class C12299c0 implements InterfaceC12077b {

    /* renamed from: d */
    public static final boolean f32950d;

    /* renamed from: a */
    public final UUID f32951a;

    /* renamed from: b */
    public final byte[] f32952b;

    /* renamed from: c */
    public final boolean f32953c;

    static {
        boolean z10;
        if ("Amazon".equals(C11172r0.f29042c)) {
            String str = C11172r0.f29043d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f32950d = z10;
            }
        }
        z10 = false;
        f32950d = z10;
    }

    public C12299c0(UUID uuid, byte[] bArr, boolean z10) {
        this.f32951a = uuid;
        this.f32952b = bArr;
        this.f32953c = z10;
    }
}
