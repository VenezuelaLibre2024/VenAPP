package p419wb;

import com.google.android.gms.common.api.C5101a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p179jb.InterfaceC9009a;
import p271ob.C9830b;

/* renamed from: wb.b */
/* loaded from: classes2.dex */
public final class C12130b implements InterfaceC9009a {

    /* renamed from: e */
    public static final C9830b.b f32228e = C9830b.b.ALGORITHM_NOT_FIPS;

    /* renamed from: f */
    private static final ThreadLocal<Cipher> f32229f = new a();

    /* renamed from: g */
    private static final ThreadLocal<Cipher> f32230g = new b();

    /* renamed from: a */
    private final byte[] f32231a;

    /* renamed from: b */
    private final byte[] f32232b;

    /* renamed from: c */
    private final SecretKeySpec f32233c;

    /* renamed from: d */
    private final int f32234d;

    /* renamed from: wb.b$a */
    /* loaded from: classes2.dex */
    class a extends ThreadLocal<Cipher> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return C12137i.f32264b.m38888a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* renamed from: wb.b$b */
    /* loaded from: classes2.dex */
    class b extends ThreadLocal<Cipher> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return C12137i.f32264b.m38888a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public C12130b(byte[] bArr, int i10) {
        if (!f32228e.mo29502b()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i10 != 12 && i10 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f32234d = i10;
        C12146r.m38911a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f32233c = secretKeySpec;
        Cipher cipher = f32229f.get();
        cipher.init(1, secretKeySpec);
        byte[] m38865c = m38865c(cipher.doFinal(new byte[16]));
        this.f32231a = m38865c;
        this.f32232b = m38865c(m38865c);
    }

    /* renamed from: c */
    private static byte[] m38865c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 15) {
            int i11 = i10 + 1;
            bArr2[i10] = (byte) (((bArr[i10] << 1) ^ ((bArr[i11] & 255) >>> 7)) & 255);
            i10 = i11;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    /* renamed from: d */
    private byte[] m38866d(Cipher cipher, int i10, byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i10;
        if (i12 == 0) {
            return cipher.doFinal(m38868f(bArr2, this.f32231a));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i13 = 0;
        while (i12 - i13 > 16) {
            for (int i14 = 0; i14 < 16; i14++) {
                doFinal[i14] = (byte) (doFinal[i14] ^ bArr[(i11 + i13) + i14]);
            }
            doFinal = cipher.doFinal(doFinal);
            i13 += 16;
        }
        return cipher.doFinal(m38868f(doFinal, m38867e(Arrays.copyOfRange(bArr, i13 + i11, i11 + i12))));
    }

    /* renamed from: e */
    private byte[] m38867e(byte[] bArr) {
        if (bArr.length == 16) {
            return m38868f(bArr, this.f32231a);
        }
        byte[] copyOf = Arrays.copyOf(this.f32232b, 16);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            copyOf[i10] = (byte) (copyOf[i10] ^ bArr[i10]);
        }
        copyOf[bArr.length] = (byte) (copyOf[bArr.length] ^ 128);
        return copyOf;
    }

    /* renamed from: f */
    private static byte[] m38868f(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        return bArr3;
    }

    @Override // p179jb.InterfaceC9009a
    /* renamed from: a */
    public byte[] mo26424a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f32234d;
        if (length > (C5101a.e.API_PRIORITY_OTHER - i10) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i10 + 16];
        byte[] m38907c = C12144p.m38907c(i10);
        System.arraycopy(m38907c, 0, bArr3, 0, this.f32234d);
        Cipher cipher = f32229f.get();
        cipher.init(1, this.f32233c);
        byte[] m38866d = m38866d(cipher, 0, m38907c, 0, m38907c.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] m38866d2 = m38866d(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = f32230g.get();
        cipher2.init(1, this.f32233c, new IvParameterSpec(m38866d));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f32234d);
        byte[] m38866d3 = m38866d(cipher, 2, bArr3, this.f32234d, bArr.length);
        int length2 = bArr.length + this.f32234d;
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[length2 + i11] = (byte) ((m38866d2[i11] ^ m38866d[i11]) ^ m38866d3[i11]);
        }
        return bArr3;
    }

    @Override // p179jb.InterfaceC9009a
    /* renamed from: b */
    public byte[] mo26425b(byte[] bArr, byte[] bArr2) {
        int length = (bArr.length - this.f32234d) - 16;
        if (length < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = f32229f.get();
        cipher.init(1, this.f32233c);
        byte[] m38866d = m38866d(cipher, 0, bArr, 0, this.f32234d);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        byte[] m38866d2 = m38866d(cipher, 1, bArr3, 0, bArr3.length);
        byte[] m38866d3 = m38866d(cipher, 2, bArr, this.f32234d, length);
        int length2 = bArr.length - 16;
        byte b10 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            b10 = (byte) (b10 | (((bArr[length2 + i10] ^ m38866d2[i10]) ^ m38866d[i10]) ^ m38866d3[i10]));
        }
        if (b10 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = f32230g.get();
        cipher2.init(1, this.f32233c, new IvParameterSpec(m38866d));
        return cipher2.doFinal(bArr, this.f32234d, length);
    }
}
