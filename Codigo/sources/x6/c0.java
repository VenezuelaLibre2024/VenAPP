package x6;

import java.util.UUID;
import t8.r0;

/* loaded from: classes.dex */
public final class c0 implements w6.b {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f30438d;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f30439a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f30440b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30441c;

    static {
        boolean z10;
        if ("Amazon".equals(r0.f26746c)) {
            String str = r0.f26747d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f30438d = z10;
            }
        }
        z10 = false;
        f30438d = z10;
    }

    public c0(UUID uuid, byte[] bArr, boolean z10) {
        this.f30439a = uuid;
        this.f30440b = bArr;
        this.f30441c = z10;
    }
}
