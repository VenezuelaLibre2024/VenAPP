package wb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import ob.b;

/* loaded from: classes2.dex */
public final class n implements ub.a {

    /* renamed from: e, reason: collision with root package name */
    public static final b.EnumC0370b f29814e = b.EnumC0370b.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal<Mac> f29815a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29816b;

    /* renamed from: c, reason: collision with root package name */
    private final Key f29817c;

    /* renamed from: d, reason: collision with root package name */
    private final int f29818d;

    /* loaded from: classes2.dex */
    class a extends ThreadLocal<Mac> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() {
            try {
                Mac a10 = i.f29800c.a(n.this.f29816b);
                a10.init(n.this.f29817c);
                return a10;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public n(String str, Key key) {
        int i10;
        a aVar = new a();
        this.f29815a = aVar;
        if (!f29814e.b()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f29816b = str;
        this.f29817c = key;
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
        this.f29818d = i10;
        aVar.get();
    }

    @Override // ub.a
    public byte[] a(byte[] bArr, int i10) {
        if (i10 > this.f29818d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.f29815a.get().update(bArr);
        return Arrays.copyOf(this.f29815a.get().doFinal(), i10);
    }
}
