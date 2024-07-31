package jb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import vb.c0;
import vb.i0;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f19831a = new byte[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19832a;

        static {
            int[] iArr = new int[i0.values().length];
            f19832a = iArr;
            try {
                iArr[i0.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19832a[i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19832a[i0.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19832a[i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] a(c0.c cVar) {
        ByteBuffer put;
        int i10 = a.f19832a[cVar.c0().ordinal()];
        if (i10 == 1 || i10 == 2) {
            put = ByteBuffer.allocate(5).put((byte) 0);
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    return f19831a;
                }
                throw new GeneralSecurityException("unknown output prefix type");
            }
            put = ByteBuffer.allocate(5).put((byte) 1);
        }
        return put.putInt(cVar.b0()).array();
    }
}
