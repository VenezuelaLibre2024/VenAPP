package p419wb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import p271ob.C9830b;
import p380ub.InterfaceC11528a;

/* renamed from: wb.n */
/* loaded from: classes2.dex */
public final class C12142n implements InterfaceC11528a {

    /* renamed from: e */
    public static final C9830b.b f32279e = C9830b.b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: a */
    private final ThreadLocal<Mac> f32280a;

    /* renamed from: b */
    private final String f32281b;

    /* renamed from: c */
    private final Key f32282c;

    /* renamed from: d */
    private final int f32283d;

    /* renamed from: wb.n$a */
    /* loaded from: classes2.dex */
    class a extends ThreadLocal<Mac> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() {
            try {
                Mac m38888a = C12137i.f32265c.m38888a(C12142n.this.f32281b);
                m38888a.init(C12142n.this.f32282c);
                return m38888a;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public C12142n(String str, Key key) {
        int i10;
        a aVar = new a();
        this.f32280a = aVar;
        if (!f32279e.mo29502b()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f32281b = str;
        this.f32282c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    c10 = 1;
                    break;
                }
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    c10 = 2;
                    break;
                }
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c10 = 3;
                    break;
                }
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                i10 = 20;
                break;
            case 1:
                i10 = 28;
                break;
            case 2:
                i10 = 32;
                break;
            case 3:
                i10 = 48;
                break;
            case 4:
                i10 = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        this.f32283d = i10;
        aVar.get();
    }

    @Override // p380ub.InterfaceC11528a
    /* renamed from: a */
    public byte[] mo36088a(byte[] bArr, int i10) {
        if (i10 > this.f32283d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.f32280a.get().update(bArr);
        return Arrays.copyOf(this.f32280a.get().doFinal(), i10);
    }
}
