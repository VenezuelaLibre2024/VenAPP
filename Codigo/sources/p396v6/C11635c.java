package p396v6;

import com.facebook.ads.AdError;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import p361t6.C11108u1;
import p363t8.C11144d0;
import p363t8.C11146e0;
import p436x6.C12318m;

/* renamed from: v6.c */
/* loaded from: classes.dex */
public final class C11635c {

    /* renamed from: a */
    private static final int[] f30282a = {AdError.CACHE_ERROR_CODE, AdError.SERVER_ERROR_CODE, 1920, 1601, 1600, AdError.NO_FILL_ERROR_CODE, AdError.NETWORK_ERROR_CODE, 960, 800, 800, 480, 400, 400, RecognitionOptions.PDF417};

    /* renamed from: v6.c$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f30283a;

        /* renamed from: b */
        public final int f30284b;

        /* renamed from: c */
        public final int f30285c;

        /* renamed from: d */
        public final int f30286d;

        /* renamed from: e */
        public final int f30287e;

        private b(int i10, int i11, int i12, int i13, int i14) {
            this.f30283a = i10;
            this.f30285c = i11;
            this.f30284b = i12;
            this.f30286d = i13;
            this.f30287e = i14;
        }
    }

    /* renamed from: a */
    public static void m36480a(int i10, C11146e0 c11146e0) {
        c11146e0.m34673Q(7);
        byte[] m34682e = c11146e0.m34682e();
        m34682e[0] = -84;
        m34682e[1] = 64;
        m34682e[2] = -1;
        m34682e[3] = -1;
        m34682e[4] = (byte) ((i10 >> 16) & 255);
        m34682e[5] = (byte) ((i10 >> 8) & 255);
        m34682e[6] = (byte) (i10 & 255);
    }

    /* renamed from: b */
    public static C11108u1 m36481b(C11146e0 c11146e0, String str, String str2, C12318m c12318m) {
        c11146e0.m34678V(1);
        return new C11108u1.b().m34540U(str).m34552g0("audio/ac4").m34529J(2).m34553h0(((c11146e0.m34664H() & 32) >> 5) == 1 ? 48000 : 44100).m34534O(c12318m).m34543X(str2).m34526G();
    }

    /* renamed from: c */
    public static int m36482c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return m36483d(new C11144d0(bArr)).f30287e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        if (r11 != 11) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
    
        if (r11 != 11) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008a, code lost:
    
        if (r11 != 8) goto L46;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p396v6.C11635c.b m36483d(p363t8.C11144d0 r11) {
        /*
            r0 = 16
            int r1 = r11.m34632h(r0)
            int r0 = r11.m34632h(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.m34632h(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.m34632h(r0)
            r2 = 3
            if (r1 != r2) goto L2f
            int r4 = m36485f(r11, r0)
            int r1 = r1 + r4
        L2f:
            r5 = r1
            r1 = 10
            int r1 = r11.m34632h(r1)
            boolean r4 = r11.m34631g()
            if (r4 == 0) goto L45
            int r4 = r11.m34632h(r2)
            if (r4 <= 0) goto L45
            r11.m34642r(r0)
        L45:
            boolean r4 = r11.m34631g()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r7 = 44100(0xac44, float:6.1797E-41)
            if (r4 == 0) goto L53
            r9 = r6
            goto L54
        L53:
            r9 = r7
        L54:
            int r11 = r11.m34632h(r3)
            if (r9 != r7) goto L63
            r4 = 13
            if (r11 != r4) goto L63
            int[] r0 = p396v6.C11635c.f30282a
            r11 = r0[r11]
            goto L93
        L63:
            if (r9 != r6) goto L92
            int[] r4 = p396v6.C11635c.f30282a
            int r6 = r4.length
            if (r11 >= r6) goto L92
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 8
            r7 = 1
            if (r1 == r7) goto L88
            r7 = 11
            if (r1 == r0) goto L83
            if (r1 == r2) goto L88
            if (r1 == r3) goto L7c
            goto L8d
        L7c:
            if (r11 == r2) goto L8f
            if (r11 == r6) goto L8f
            if (r11 != r7) goto L8d
            goto L8f
        L83:
            if (r11 == r6) goto L8f
            if (r11 != r7) goto L8d
            goto L8f
        L88:
            if (r11 == r2) goto L8f
            if (r11 != r6) goto L8d
            goto L8f
        L8d:
            r11 = r4
            goto L93
        L8f:
            int r4 = r4 + 1
            goto L8d
        L92:
            r11 = 0
        L93:
            v6.c$b r0 = new v6.c$b
            r6 = 2
            r10 = 0
            r4 = r0
            r7 = r9
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p396v6.C11635c.m36483d(t8.d0):v6.c$b");
    }

    /* renamed from: e */
    public static int m36484e(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i12 == 65535) {
            i12 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }

    /* renamed from: f */
    private static int m36485f(C11144d0 c11144d0, int i10) {
        int i11 = 0;
        while (true) {
            int m34632h = i11 + c11144d0.m34632h(i10);
            if (!c11144d0.m34631g()) {
                return m34632h;
            }
            i11 = (m34632h + 1) << i10;
        }
    }
}
