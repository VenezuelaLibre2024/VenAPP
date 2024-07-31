package io.grpc.internal;

import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.embedding.android.KeyboardMap;
import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import p082eb.C7159o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.grpc.internal.r0 */
/* loaded from: classes3.dex */
public class C8893r0 implements Closeable {

    /* renamed from: e */
    private int f20867e;

    /* renamed from: f */
    private int f20868f;

    /* renamed from: r */
    private Inflater f20869r;

    /* renamed from: u */
    private int f20872u;

    /* renamed from: v */
    private int f20873v;

    /* renamed from: w */
    private long f20874w;

    /* renamed from: a */
    private final C8901u f20863a = new C8901u();

    /* renamed from: b */
    private final CRC32 f20864b = new CRC32();

    /* renamed from: c */
    private final b f20865c = new b(this, null);

    /* renamed from: d */
    private final byte[] f20866d = new byte[RecognitionOptions.UPC_A];

    /* renamed from: s */
    private c f20870s = c.HEADER;

    /* renamed from: t */
    private boolean f20871t = false;

    /* renamed from: x */
    private int f20875x = 0;

    /* renamed from: y */
    private int f20876y = 0;

    /* renamed from: z */
    private boolean f20877z = true;

    /* renamed from: io.grpc.internal.r0$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20878a;

        static {
            int[] iArr = new int[c.values().length];
            f20878a = iArr;
            try {
                iArr[c.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20878a[c.HEADER_EXTRA_LEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20878a[c.HEADER_EXTRA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20878a[c.HEADER_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20878a[c.HEADER_COMMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20878a[c.HEADER_CRC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20878a[c.INITIALIZE_INFLATER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20878a[c.INFLATING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20878a[c.INFLATER_NEEDS_INPUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20878a[c.TRAILER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.r0$b */
    /* loaded from: classes3.dex */
    public class b {
        private b() {
        }

        /* synthetic */ b(C8893r0 c8893r0, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public boolean m25811g() {
            while (m25815k() > 0) {
                if (m25812h() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public int m25812h() {
            int readUnsignedByte;
            if (C8893r0.this.f20868f - C8893r0.this.f20867e > 0) {
                readUnsignedByte = C8893r0.this.f20866d[C8893r0.this.f20867e] & 255;
                C8893r0.m25792e(C8893r0.this, 1);
            } else {
                readUnsignedByte = C8893r0.this.f20863a.readUnsignedByte();
            }
            C8893r0.this.f20864b.update(readUnsignedByte);
            C8893r0.m25796j(C8893r0.this, 1);
            return readUnsignedByte;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public long m25813i() {
            return m25814j() | (m25814j() << 16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public int m25814j() {
            return m25812h() | (m25812h() << 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public int m25815k() {
            return (C8893r0.this.f20868f - C8893r0.this.f20867e) + C8893r0.this.f20863a.mo25686k();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public void m25816l(int i10) {
            int i11;
            int i12 = C8893r0.this.f20868f - C8893r0.this.f20867e;
            if (i12 > 0) {
                int min = Math.min(i12, i10);
                C8893r0.this.f20864b.update(C8893r0.this.f20866d, C8893r0.this.f20867e, min);
                C8893r0.m25792e(C8893r0.this, min);
                i11 = i10 - min;
            } else {
                i11 = i10;
            }
            if (i11 > 0) {
                byte[] bArr = new byte[RecognitionOptions.UPC_A];
                int i13 = 0;
                while (i13 < i11) {
                    int min2 = Math.min(i11 - i13, RecognitionOptions.UPC_A);
                    C8893r0.this.f20863a.mo25685V0(bArr, 0, min2);
                    C8893r0.this.f20864b.update(bArr, 0, min2);
                    i13 += min2;
                }
            }
            C8893r0.m25796j(C8893r0.this, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.r0$c */
    /* loaded from: classes3.dex */
    public enum c {
        HEADER,
        HEADER_EXTRA_LEN,
        HEADER_EXTRA,
        HEADER_NAME,
        HEADER_COMMENT,
        HEADER_CRC,
        INITIALIZE_INFLATER,
        INFLATING,
        INFLATER_NEEDS_INPUT,
        TRAILER
    }

    /* renamed from: E */
    private boolean m25782E() {
        c cVar;
        Inflater inflater = this.f20869r;
        if (inflater == null) {
            this.f20869r = new Inflater(true);
        } else {
            inflater.reset();
        }
        this.f20864b.reset();
        int i10 = this.f20868f;
        int i11 = this.f20867e;
        int i12 = i10 - i11;
        if (i12 > 0) {
            this.f20869r.setInput(this.f20866d, i11, i12);
            cVar = c.INFLATING;
        } else {
            cVar = c.INFLATER_NEEDS_INPUT;
        }
        this.f20870s = cVar;
        return true;
    }

    /* renamed from: I */
    private boolean m25783I() {
        if (this.f20865c.m25815k() < 10) {
            return false;
        }
        if (this.f20865c.m25814j() != 35615) {
            throw new ZipException("Not in GZIP format");
        }
        if (this.f20865c.m25812h() != 8) {
            throw new ZipException("Unsupported compression method");
        }
        this.f20872u = this.f20865c.m25812h();
        this.f20865c.m25816l(6);
        this.f20870s = c.HEADER_EXTRA_LEN;
        return true;
    }

    /* renamed from: O */
    private boolean m25784O() {
        if ((this.f20872u & 16) == 16 && !this.f20865c.m25811g()) {
            return false;
        }
        this.f20870s = c.HEADER_CRC;
        return true;
    }

    /* renamed from: Q */
    private boolean m25785Q() {
        if ((this.f20872u & 2) == 2) {
            if (this.f20865c.m25815k() < 2) {
                return false;
            }
            if ((((int) this.f20864b.getValue()) & 65535) != this.f20865c.m25814j()) {
                throw new ZipException("Corrupt GZIP header");
            }
        }
        this.f20870s = c.INITIALIZE_INFLATER;
        return true;
    }

    /* renamed from: R */
    private boolean m25786R() {
        int m25815k = this.f20865c.m25815k();
        int i10 = this.f20873v;
        if (m25815k < i10) {
            return false;
        }
        this.f20865c.m25816l(i10);
        this.f20870s = c.HEADER_NAME;
        return true;
    }

    /* renamed from: S */
    private boolean m25787S() {
        c cVar;
        if ((this.f20872u & 4) != 4) {
            cVar = c.HEADER_NAME;
        } else {
            if (this.f20865c.m25815k() < 2) {
                return false;
            }
            this.f20873v = this.f20865c.m25814j();
            cVar = c.HEADER_EXTRA;
        }
        this.f20870s = cVar;
        return true;
    }

    /* renamed from: U */
    private boolean m25788U() {
        if ((this.f20872u & 8) == 8 && !this.f20865c.m25811g()) {
            return false;
        }
        this.f20870s = c.HEADER_COMMENT;
        return true;
    }

    /* renamed from: a0 */
    private boolean m25790a0() {
        if (this.f20869r != null && this.f20865c.m25815k() <= 18) {
            this.f20869r.end();
            this.f20869r = null;
        }
        if (this.f20865c.m25815k() < 8) {
            return false;
        }
        if (this.f20864b.getValue() != this.f20865c.m25813i() || this.f20874w != this.f20865c.m25813i()) {
            throw new ZipException("Corrupt GZIP trailer");
        }
        this.f20864b.reset();
        this.f20870s = c.HEADER;
        return true;
    }

    /* renamed from: e */
    static /* synthetic */ int m25792e(C8893r0 c8893r0, int i10) {
        int i11 = c8893r0.f20867e + i10;
        c8893r0.f20867e = i11;
        return i11;
    }

    /* renamed from: j */
    static /* synthetic */ int m25796j(C8893r0 c8893r0, int i10) {
        int i11 = c8893r0.f20875x + i10;
        c8893r0.f20875x = i11;
        return i11;
    }

    /* renamed from: n */
    private boolean m25797n() {
        C7159o.m21319v(this.f20869r != null, "inflater is null");
        C7159o.m21319v(this.f20867e == this.f20868f, "inflaterInput has unconsumed bytes");
        int min = Math.min(this.f20863a.mo25686k(), RecognitionOptions.UPC_A);
        if (min == 0) {
            return false;
        }
        this.f20867e = 0;
        this.f20868f = min;
        this.f20863a.mo25685V0(this.f20866d, 0, min);
        this.f20869r.setInput(this.f20866d, this.f20867e, min);
        this.f20870s = c.INFLATING;
        return true;
    }

    /* renamed from: y */
    private int m25798y(byte[] bArr, int i10, int i11) {
        c cVar;
        C7159o.m21319v(this.f20869r != null, "inflater is null");
        try {
            int totalIn = this.f20869r.getTotalIn();
            int inflate = this.f20869r.inflate(bArr, i10, i11);
            int totalIn2 = this.f20869r.getTotalIn() - totalIn;
            this.f20875x += totalIn2;
            this.f20876y += totalIn2;
            this.f20867e += totalIn2;
            this.f20864b.update(bArr, i10, inflate);
            if (!this.f20869r.finished()) {
                if (this.f20869r.needsInput()) {
                    cVar = c.INFLATER_NEEDS_INPUT;
                }
                return inflate;
            }
            this.f20874w = this.f20869r.getBytesWritten() & KeyboardMap.kValueMask;
            cVar = c.TRAILER;
            this.f20870s = cVar;
            return inflate;
        } catch (DataFormatException e10) {
            throw new DataFormatException("Inflater data format exception: " + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0073, code lost:
    
        if (r2 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0079, code lost:
    
        if (r6.f20870s != io.grpc.internal.C8893r0.c.HEADER) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0083, code lost:
    
        if (r6.f20865c.m25815k() >= 10) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0086, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0087, code lost:
    
        r6.f20877z = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0089, code lost:
    
        return r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001c. Please report as an issue. */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m25799B(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f20871t
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "GzipInflatingBuffer is closed"
            p082eb.C7159o.m21319v(r0, r2)
            r0 = 0
            r3 = r0
        Lb:
            r2 = r1
        Lc:
            if (r2 == 0) goto L73
            int r4 = r9 - r3
            if (r4 <= 0) goto L73
            int[] r2 = io.grpc.internal.C8893r0.a.f20878a
            io.grpc.internal.r0$c r5 = r6.f20870s
            int r5 = r5.ordinal()
            r2 = r2[r5]
            switch(r2) {
                case 1: goto L6e;
                case 2: goto L69;
                case 3: goto L64;
                case 4: goto L5f;
                case 5: goto L5a;
                case 6: goto L55;
                case 7: goto L50;
                case 8: goto L42;
                case 9: goto L3d;
                case 10: goto L38;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Invalid state: "
            r8.append(r9)
            io.grpc.internal.r0$c r9 = r6.f20870s
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L38:
            boolean r2 = r6.m25790a0()
            goto Lc
        L3d:
            boolean r2 = r6.m25797n()
            goto Lc
        L42:
            int r2 = r8 + r3
            int r2 = r6.m25798y(r7, r2, r4)
            int r3 = r3 + r2
            io.grpc.internal.r0$c r2 = r6.f20870s
            io.grpc.internal.r0$c r4 = io.grpc.internal.C8893r0.c.TRAILER
            if (r2 != r4) goto Lb
            goto L38
        L50:
            boolean r2 = r6.m25782E()
            goto Lc
        L55:
            boolean r2 = r6.m25785Q()
            goto Lc
        L5a:
            boolean r2 = r6.m25784O()
            goto Lc
        L5f:
            boolean r2 = r6.m25788U()
            goto Lc
        L64:
            boolean r2 = r6.m25786R()
            goto Lc
        L69:
            boolean r2 = r6.m25787S()
            goto Lc
        L6e:
            boolean r2 = r6.m25783I()
            goto Lc
        L73:
            if (r2 == 0) goto L87
            io.grpc.internal.r0$c r7 = r6.f20870s
            io.grpc.internal.r0$c r8 = io.grpc.internal.C8893r0.c.HEADER
            if (r7 != r8) goto L86
            io.grpc.internal.r0$b r7 = r6.f20865c
            int r7 = io.grpc.internal.C8893r0.b.m25808d(r7)
            r8 = 10
            if (r7 >= r8) goto L86
            goto L87
        L86:
            r1 = r0
        L87:
            r6.f20877z = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.C8893r0.m25799B(byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean m25800H() {
        C7159o.m21319v(!this.f20871t, "GzipInflatingBuffer is closed");
        return this.f20877z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f20871t) {
            return;
        }
        this.f20871t = true;
        this.f20863a.close();
        Inflater inflater = this.f20869r;
        if (inflater != null) {
            inflater.end();
            this.f20869r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m25801l(InterfaceC8903u1 interfaceC8903u1) {
        C7159o.m21319v(!this.f20871t, "GzipInflatingBuffer is closed");
        this.f20863a.m25848b(interfaceC8903u1);
        this.f20877z = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public int m25802o() {
        int i10 = this.f20875x;
        this.f20875x = 0;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public int m25803q() {
        int i10 = this.f20876y;
        this.f20876y = 0;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean m25804r() {
        C7159o.m21319v(!this.f20871t, "GzipInflatingBuffer is closed");
        return (this.f20865c.m25815k() == 0 && this.f20870s == c.HEADER) ? false : true;
    }
}
