package p119g7;

import java.nio.ByteBuffer;
import java.util.UUID;
import p363t8.C11146e0;
import p363t8.C11173s;

/* renamed from: g7.l */
/* loaded from: classes.dex */
public final class C7476l {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g7.l$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final UUID f17581a;

        /* renamed from: b */
        private final int f17582b;

        /* renamed from: c */
        private final byte[] f17583c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f17581a = uuid;
            this.f17582b = i10;
            this.f17583c = bArr;
        }
    }

    /* renamed from: a */
    public static byte[] m22727a(UUID uuid, byte[] bArr) {
        return m22728b(uuid, null, bArr);
    }

    /* renamed from: b */
    public static byte[] m22728b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* renamed from: c */
    public static boolean m22729c(byte[] bArr) {
        return m22730d(bArr) != null;
    }

    /* renamed from: d */
    private static a m22730d(byte[] bArr) {
        C11146e0 c11146e0 = new C11146e0(bArr);
        if (c11146e0.m34684g() < 32) {
            return null;
        }
        c11146e0.m34677U(0);
        if (c11146e0.m34692q() != c11146e0.m34679a() + 4 || c11146e0.m34692q() != 1886614376) {
            return null;
        }
        int m22592c = AbstractC7465a.m22592c(c11146e0.m34692q());
        if (m22592c > 1) {
            C11173s.m34970i("PsshAtomUtil", "Unsupported pssh version: " + m22592c);
            return null;
        }
        UUID uuid = new UUID(c11146e0.m34657A(), c11146e0.m34657A());
        if (m22592c == 1) {
            c11146e0.m34678V(c11146e0.m34668L() * 16);
        }
        int m34668L = c11146e0.m34668L();
        if (m34668L != c11146e0.m34679a()) {
            return null;
        }
        byte[] bArr2 = new byte[m34668L];
        c11146e0.m34688l(bArr2, 0, m34668L);
        return new a(uuid, m22592c, bArr2);
    }

    /* renamed from: e */
    public static byte[] m22731e(byte[] bArr, UUID uuid) {
        a m22730d = m22730d(bArr);
        if (m22730d == null) {
            return null;
        }
        if (uuid.equals(m22730d.f17581a)) {
            return m22730d.f17583c;
        }
        C11173s.m34970i("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + m22730d.f17581a + ".");
        return null;
    }

    /* renamed from: f */
    public static UUID m22732f(byte[] bArr) {
        a m22730d = m22730d(bArr);
        if (m22730d == null) {
            return null;
        }
        return m22730d.f17581a;
    }

    /* renamed from: g */
    public static int m22733g(byte[] bArr) {
        a m22730d = m22730d(bArr);
        if (m22730d == null) {
            return -1;
        }
        return m22730d.f17582b;
    }
}
