package p419wb;

import java.security.SecureRandom;

/* renamed from: wb.p */
/* loaded from: classes2.dex */
public final class C12144p {

    /* renamed from: a */
    private static final ThreadLocal<SecureRandom> f32287a = new a();

    /* renamed from: wb.p$a */
    /* loaded from: classes2.dex */
    class a extends ThreadLocal<SecureRandom> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SecureRandom initialValue() {
            return C12144p.m38905a();
        }
    }

    /* renamed from: a */
    static /* synthetic */ SecureRandom m38905a() {
        return m38906b();
    }

    /* renamed from: b */
    private static SecureRandom m38906b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    /* renamed from: c */
    public static byte[] m38907c(int i10) {
        byte[] bArr = new byte[i10];
        f32287a.get().nextBytes(bArr);
        return bArr;
    }
}
