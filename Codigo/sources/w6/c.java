package w6;

import android.media.MediaCodec;
import t8.r0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public byte[] f29654a;

    /* renamed from: b */
    public byte[] f29655b;

    /* renamed from: c */
    public int f29656c;

    /* renamed from: d */
    public int[] f29657d;

    /* renamed from: e */
    public int[] f29658e;

    /* renamed from: f */
    public int f29659f;

    /* renamed from: g */
    public int f29660g;

    /* renamed from: h */
    public int f29661h;

    /* renamed from: i */
    private final MediaCodec.CryptoInfo f29662i;

    /* renamed from: j */
    private final b f29663j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final MediaCodec.CryptoInfo f29664a;

        /* renamed from: b */
        private final MediaCodec.CryptoInfo.Pattern f29665b;

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f29664a = cryptoInfo;
            this.f29665b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* synthetic */ b(MediaCodec.CryptoInfo cryptoInfo, a aVar) {
            this(cryptoInfo);
        }

        public void b(int i10, int i11) {
            this.f29665b.set(i10, i11);
            this.f29664a.setPattern(this.f29665b);
        }
    }

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f29662i = cryptoInfo;
        this.f29663j = r0.f26744a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f29662i;
    }

    public void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f29657d == null) {
            int[] iArr = new int[1];
            this.f29657d = iArr;
            this.f29662i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f29657d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f29659f = i10;
        this.f29657d = iArr;
        this.f29658e = iArr2;
        this.f29655b = bArr;
        this.f29654a = bArr2;
        this.f29656c = i11;
        this.f29660g = i12;
        this.f29661h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f29662i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (r0.f26744a >= 24) {
            ((b) t8.a.e(this.f29663j)).b(i12, i13);
        }
    }
}
