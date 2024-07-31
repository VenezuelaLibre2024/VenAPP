package io.grpc.internal;

import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.embedding.android.KeyboardMap;
import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class r0 implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    private int f19120e;

    /* renamed from: f, reason: collision with root package name */
    private int f19121f;

    /* renamed from: r, reason: collision with root package name */
    private Inflater f19122r;

    /* renamed from: u, reason: collision with root package name */
    private int f19125u;

    /* renamed from: v, reason: collision with root package name */
    private int f19126v;

    /* renamed from: w, reason: collision with root package name */
    private long f19127w;

    /* renamed from: a, reason: collision with root package name */
    private final u f19116a = new u();

    /* renamed from: b, reason: collision with root package name */
    private final CRC32 f19117b = new CRC32();

    /* renamed from: c, reason: collision with root package name */
    private final b f19118c = new b(this, null);

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f19119d = new byte[RecognitionOptions.UPC_A];

    /* renamed from: s, reason: collision with root package name */
    private c f19123s = c.HEADER;

    /* renamed from: t, reason: collision with root package name */
    private boolean f19124t = false;

    /* renamed from: x, reason: collision with root package name */
    private int f19128x = 0;

    /* renamed from: y, reason: collision with root package name */
    private int f19129y = 0;

    /* renamed from: z, reason: collision with root package name */
    private boolean f19130z = true;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19131a;

        static {
            int[] iArr = new int[c.values().length];
            f19131a = iArr;
            try {
                iArr[c.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19131a[c.HEADER_EXTRA_LEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19131a[c.HEADER_EXTRA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19131a[c.HEADER_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19131a[c.HEADER_COMMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19131a[c.HEADER_CRC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19131a[c.INITIALIZE_INFLATER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19131a[c.INFLATING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19131a[c.INFLATER_NEEDS_INPUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19131a[c.TRAILER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b {
        private b() {
        }

        /* synthetic */ b(r0 r0Var, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g() {
            while (k() > 0) {
                if (h() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int h() {
            int readUnsignedByte;
            if (r0.this.f19121f - r0.this.f19120e > 0) {
                readUnsignedByte = r0.this.f19119d[r0.this.f19120e] & 255;
                r0.e(r0.this, 1);
            } else {
                readUnsignedByte = r0.this.f19116a.readUnsignedByte();
            }
            r0.this.f19117b.update(readUnsignedByte);
            r0.j(r0.this, 1);
            return readUnsignedByte;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return j() | (j() << 16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int j() {
            return h() | (h() << 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int k() {
            return (r0.this.f19121f - r0.this.f19120e) + r0.this.f19116a.k();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(int i10) {
            int i11;
            int i12 = r0.this.f19121f - r0.this.f19120e;
            if (i12 > 0) {
                int min = Math.min(i12, i10);
                r0.this.f19117b.update(r0.this.f19119d, r0.this.f19120e, min);
                r0.e(r0.this, min);
                i11 = i10 - min;
            } else {
                i11 = i10;
            }
            if (i11 > 0) {
                byte[] bArr = new byte[RecognitionOptions.UPC_A];
                int i13 = 0;
                while (i13 < i11) {
                    int min2 = Math.min(i11 - i13, RecognitionOptions.UPC_A);
                    r0.this.f19116a.V0(bArr, 0, min2);
                    r0.this.f19117b.update(bArr, 0, min2);
                    i13 += min2;
                }
            }
            r0.j(r0.this, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
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

    private boolean E() {
        c cVar;
        Inflater inflater = this.f19122r;
        if (inflater == null) {
            this.f19122r = new Inflater(true);
        } else {
            inflater.reset();
        }
        this.f19117b.reset();
        int i10 = this.f19121f;
        int i11 = this.f19120e;
        int i12 = i10 - i11;
        if (i12 > 0) {
            this.f19122r.setInput(this.f19119d, i11, i12);
            cVar = c.INFLATING;
        } else {
            cVar = c.INFLATER_NEEDS_INPUT;
        }
        this.f19123s = cVar;
        return true;
    }

    private boolean I() {
        if (this.f19118c.k() < 10) {
            return false;
        }
        if (this.f19118c.j() != 35615) {
            throw new ZipException("Not in GZIP format");
        }
        if (this.f19118c.h() != 8) {
            throw new ZipException("Unsupported compression method");
        }
        this.f19125u = this.f19118c.h();
        this.f19118c.l(6);
        this.f19123s = c.HEADER_EXTRA_LEN;
        return true;
    }

    private boolean O() {
        if ((this.f19125u & 16) == 16 && !this.f19118c.g()) {
            return false;
        }
        this.f19123s = c.HEADER_CRC;
        return true;
    }

    private boolean Q() {
        if ((this.f19125u & 2) == 2) {
            if (this.f19118c.k() < 2) {
                return false;
            }
            if ((((int) this.f19117b.getValue()) & 65535) != this.f19118c.j()) {
                throw new ZipException("Corrupt GZIP header");
            }
        }
        this.f19123s = c.INITIALIZE_INFLATER;
        return true;
    }

    private boolean R() {
        int k10 = this.f19118c.k();
        int i10 = this.f19126v;
        if (k10 < i10) {
            return false;
        }
        this.f19118c.l(i10);
        this.f19123s = c.HEADER_NAME;
        return true;
    }

    private boolean S() {
        c cVar;
        if ((this.f19125u & 4) != 4) {
            cVar = c.HEADER_NAME;
        } else {
            if (this.f19118c.k() < 2) {
                return false;
            }
            this.f19126v = this.f19118c.j();
            cVar = c.HEADER_EXTRA;
        }
        this.f19123s = cVar;
        return true;
    }

    private boolean U() {
        if ((this.f19125u & 8) == 8 && !this.f19118c.g()) {
            return false;
        }
        this.f19123s = c.HEADER_COMMENT;
        return true;
    }

    private boolean a0() {
        if (this.f19122r != null && this.f19118c.k() <= 18) {
            this.f19122r.end();
            this.f19122r = null;
        }
        if (this.f19118c.k() < 8) {
            return false;
        }
        if (this.f19117b.getValue() != this.f19118c.i() || this.f19127w != this.f19118c.i()) {
            throw new ZipException("Corrupt GZIP trailer");
        }
        this.f19117b.reset();
        this.f19123s = c.HEADER;
        return true;
    }

    static /* synthetic */ int e(r0 r0Var, int i10) {
        int i11 = r0Var.f19120e + i10;
        r0Var.f19120e = i11;
        return i11;
    }

    static /* synthetic */ int j(r0 r0Var, int i10) {
        int i11 = r0Var.f19128x + i10;
        r0Var.f19128x = i11;
        return i11;
    }

    private boolean n() {
        eb.o.v(this.f19122r != null, "inflater is null");
        eb.o.v(this.f19120e == this.f19121f, "inflaterInput has unconsumed bytes");
        int min = Math.min(this.f19116a.k(), RecognitionOptions.UPC_A);
        if (min == 0) {
            return false;
        }
        this.f19120e = 0;
        this.f19121f = min;
        this.f19116a.V0(this.f19119d, 0, min);
        this.f19122r.setInput(this.f19119d, this.f19120e, min);
        this.f19123s = c.INFLATING;
        return true;
    }

    private int y(byte[] bArr, int i10, int i11) {
        c cVar;
        eb.o.v(this.f19122r != null, "inflater is null");
        try {
            int totalIn = this.f19122r.getTotalIn();
            int inflate = this.f19122r.inflate(bArr, i10, i11);
            int totalIn2 = this.f19122r.getTotalIn() - totalIn;
            this.f19128x += totalIn2;
            this.f19129y += totalIn2;
            this.f19120e += totalIn2;
            this.f19117b.update(bArr, i10, inflate);
            if (!this.f19122r.finished()) {
                if (this.f19122r.needsInput()) {
                    cVar = c.INFLATER_NEEDS_INPUT;
                }
                return inflate;
            }
            this.f19127w = this.f19122r.getBytesWritten() & KeyboardMap.kValueMask;
            cVar = c.TRAILER;
            this.f19123s = cVar;
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
    
        if (r6.f19123s != io.grpc.internal.r0.c.HEADER) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0083, code lost:
    
        if (r6.f19118c.k() >= 10) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0086, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0087, code lost:
    
        r6.f19130z = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0089, code lost:
    
        return r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001c. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int B(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f19124t
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "GzipInflatingBuffer is closed"
            eb.o.v(r0, r2)
            r0 = 0
            r3 = r0
        Lb:
            r2 = r1
        Lc:
            if (r2 == 0) goto L73
            int r4 = r9 - r3
            if (r4 <= 0) goto L73
            int[] r2 = io.grpc.internal.r0.a.f19131a
            io.grpc.internal.r0$c r5 = r6.f19123s
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
            io.grpc.internal.r0$c r9 = r6.f19123s
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L38:
            boolean r2 = r6.a0()
            goto Lc
        L3d:
            boolean r2 = r6.n()
            goto Lc
        L42:
            int r2 = r8 + r3
            int r2 = r6.y(r7, r2, r4)
            int r3 = r3 + r2
            io.grpc.internal.r0$c r2 = r6.f19123s
            io.grpc.internal.r0$c r4 = io.grpc.internal.r0.c.TRAILER
            if (r2 != r4) goto Lb
            goto L38
        L50:
            boolean r2 = r6.E()
            goto Lc
        L55:
            boolean r2 = r6.Q()
            goto Lc
        L5a:
            boolean r2 = r6.O()
            goto Lc
        L5f:
            boolean r2 = r6.U()
            goto Lc
        L64:
            boolean r2 = r6.R()
            goto Lc
        L69:
            boolean r2 = r6.S()
            goto Lc
        L6e:
            boolean r2 = r6.I()
            goto Lc
        L73:
            if (r2 == 0) goto L87
            io.grpc.internal.r0$c r7 = r6.f19123s
            io.grpc.internal.r0$c r8 = io.grpc.internal.r0.c.HEADER
            if (r7 != r8) goto L86
            io.grpc.internal.r0$b r7 = r6.f19118c
            int r7 = io.grpc.internal.r0.b.d(r7)
            r8 = 10
            if (r7 >= r8) goto L86
            goto L87
        L86:
            r1 = r0
        L87:
            r6.f19130z = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.r0.B(byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean H() {
        eb.o.v(!this.f19124t, "GzipInflatingBuffer is closed");
        return this.f19130z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f19124t) {
            return;
        }
        this.f19124t = true;
        this.f19116a.close();
        Inflater inflater = this.f19122r;
        if (inflater != null) {
            inflater.end();
            this.f19122r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(u1 u1Var) {
        eb.o.v(!this.f19124t, "GzipInflatingBuffer is closed");
        this.f19116a.b(u1Var);
        this.f19130z = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        int i10 = this.f19128x;
        this.f19128x = 0;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int q() {
        int i10 = this.f19129y;
        this.f19129y = 0;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r() {
        eb.o.v(!this.f19124t, "GzipInflatingBuffer is closed");
        return (this.f19118c.k() == 0 && this.f19123s == c.HEADER) ? false : true;
    }
}
