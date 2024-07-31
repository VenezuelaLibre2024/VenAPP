package p414w6;

import android.media.MediaCodec;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: w6.c */
/* loaded from: classes.dex */
public final class C12078c {

    /* renamed from: a */
    public byte[] f32117a;

    /* renamed from: b */
    public byte[] f32118b;

    /* renamed from: c */
    public int f32119c;

    /* renamed from: d */
    public int[] f32120d;

    /* renamed from: e */
    public int[] f32121e;

    /* renamed from: f */
    public int f32122f;

    /* renamed from: g */
    public int f32123g;

    /* renamed from: h */
    public int f32124h;

    /* renamed from: i */
    private final MediaCodec.CryptoInfo f32125i;

    /* renamed from: j */
    private final b f32126j;

    /* renamed from: w6.c$b */
    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a */
        private final MediaCodec.CryptoInfo f32127a;

        /* renamed from: b */
        private final MediaCodec.CryptoInfo.Pattern f32128b;

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f32127a = cryptoInfo;
            this.f32128b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m38803b(int i10, int i11) {
            this.f32128b.set(i10, i11);
            this.f32127a.setPattern(this.f32128b);
        }
    }

    public C12078c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f32125i = cryptoInfo;
        this.f32126j = C11172r0.f29040a >= 24 ? new b(cryptoInfo) : null;
    }

    /* renamed from: a */
    public MediaCodec.CryptoInfo m38799a() {
        return this.f32125i;
    }

    /* renamed from: b */
    public void m38800b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f32120d == null) {
            int[] iArr = new int[1];
            this.f32120d = iArr;
            this.f32125i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f32120d;
        iArr2[0] = iArr2[0] + i10;
    }

    /* renamed from: c */
    public void m38801c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f32122f = i10;
        this.f32120d = iArr;
        this.f32121e = iArr2;
        this.f32118b = bArr;
        this.f32117a = bArr2;
        this.f32119c = i11;
        this.f32123g = i12;
        this.f32124h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f32125i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (C11172r0.f29040a >= 24) {
            ((b) C11137a.m34603e(this.f32126j)).m38803b(i12, i13);
        }
    }
}
