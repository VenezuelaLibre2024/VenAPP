package p179jb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p400vb.C11790c0;
import p400vb.EnumC11802i0;

/* renamed from: jb.d */
/* loaded from: classes2.dex */
public final class C9012d {

    /* renamed from: a */
    public static final byte[] f21610a = new byte[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jb.d$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21611a;

        static {
            int[] iArr = new int[EnumC11802i0.values().length];
            f21611a = iArr;
            try {
                iArr[EnumC11802i0.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21611a[EnumC11802i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21611a[EnumC11802i0.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21611a[EnumC11802i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static byte[] m26430a(C11790c0.c cVar) {
        ByteBuffer put;
        int i10 = a.f21611a[cVar.m37352c0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            put = ByteBuffer.allocate(5).put((byte) 0);
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    return f21610a;
                }
                throw new GeneralSecurityException("unknown output prefix type");
            }
            put = ByteBuffer.allocate(5).put((byte) 1);
        }
        return put.putInt(cVar.m37351b0()).array();
    }
}
