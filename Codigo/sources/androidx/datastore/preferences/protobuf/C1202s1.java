package androidx.datastore.preferences.protobuf;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.datastore.preferences.protobuf.s1 */
/* loaded from: classes.dex */
public final class C1202s1 {

    /* renamed from: a */
    private static final b f4988a;

    /* renamed from: androidx.datastore.preferences.protobuf.s1$a */
    /* loaded from: classes.dex */
    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static void m6400h(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
            if (m6405m(b11) || (((b10 << 28) + (b11 + 112)) >> 30) != 0 || m6405m(b12) || m6405m(b13)) {
                throw C1150b0.m5666c();
            }
            int m6410r = ((b10 & 7) << 18) | (m6410r(b11) << 12) | (m6410r(b12) << 6) | m6410r(b13);
            cArr[i10] = m6404l(m6410r);
            cArr[i10 + 1] = m6409q(m6410r);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public static void m6401i(byte b10, char[] cArr, int i10) {
            cArr[i10] = (char) b10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public static void m6402j(byte b10, byte b11, byte b12, char[] cArr, int i10) {
            if (m6405m(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || m6405m(b12)))) {
                throw C1150b0.m5666c();
            }
            cArr[i10] = (char) (((b10 & 15) << 12) | (m6410r(b11) << 6) | m6410r(b12));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public static void m6403k(byte b10, byte b11, char[] cArr, int i10) {
            if (b10 < -62 || m6405m(b11)) {
                throw C1150b0.m5666c();
            }
            cArr[i10] = (char) (((b10 & 31) << 6) | m6410r(b11));
        }

        /* renamed from: l */
        private static char m6404l(int i10) {
            return (char) ((i10 >>> 10) + 55232);
        }

        /* renamed from: m */
        private static boolean m6405m(byte b10) {
            return b10 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public static boolean m6406n(byte b10) {
            return b10 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public static boolean m6407o(byte b10) {
            return b10 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public static boolean m6408p(byte b10) {
            return b10 < -32;
        }

        /* renamed from: q */
        private static char m6409q(int i10) {
            return (char) ((i10 & 1023) + 56320);
        }

        /* renamed from: r */
        private static int m6410r(byte b10) {
            return b10 & 63;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.s1$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        b() {
        }

        /* renamed from: a */
        abstract String mo6411a(byte[] bArr, int i10, int i11);

        /* renamed from: b */
        abstract int mo6412b(CharSequence charSequence, byte[] bArr, int i10, int i11);

        /* renamed from: c */
        final boolean m6413c(byte[] bArr, int i10, int i11) {
            return mo6414d(0, bArr, i10, i11) == 0;
        }

        /* renamed from: d */
        abstract int mo6414d(int i10, byte[] bArr, int i11, int i12);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.s1$c */
    /* loaded from: classes.dex */
    static final class c extends b {
        c() {
        }

        /* renamed from: e */
        private static int m6415e(byte[] bArr, int i10, int i11) {
            while (i10 < i11 && bArr[i10] >= 0) {
                i10++;
            }
            if (i10 >= i11) {
                return 0;
            }
            return m6416f(bArr, i10, i11);
        }

        /* renamed from: f */
        private static int m6416f(byte[] bArr, int i10, int i11) {
            while (i10 < i11) {
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i12 >= i11) {
                            return b10;
                        }
                        if (b10 >= -62) {
                            i10 = i12 + 1;
                            if (bArr[i12] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b10 >= -16) {
                        if (i12 >= i11 - 2) {
                            return C1202s1.m6390l(bArr, i12, i11);
                        }
                        int i13 = i12 + 1;
                        byte b11 = bArr[i12];
                        if (b11 <= -65 && (((b10 << 28) + (b11 + 112)) >> 30) == 0) {
                            int i14 = i13 + 1;
                            if (bArr[i13] <= -65) {
                                i12 = i14 + 1;
                                if (bArr[i14] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i12 >= i11 - 1) {
                        return C1202s1.m6390l(bArr, i12, i11);
                    }
                    int i15 = i12 + 1;
                    byte b12 = bArr[i12];
                    if (b12 <= -65 && ((b10 != -32 || b12 >= -96) && (b10 != -19 || b12 < -96))) {
                        i10 = i15 + 1;
                        if (bArr[i15] > -65) {
                        }
                    }
                    return -1;
                }
                i10 = i12;
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.C1202s1.b
        /* renamed from: a */
        String mo6411a(byte[] bArr, int i10, int i11) {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = bArr[i10];
                if (!a.m6406n(b10)) {
                    break;
                }
                i10++;
                a.m6401i(b10, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b11 = bArr[i10];
                if (a.m6406n(b11)) {
                    int i16 = i14 + 1;
                    a.m6401i(b11, cArr, i14);
                    while (i15 < i12) {
                        byte b12 = bArr[i15];
                        if (!a.m6406n(b12)) {
                            break;
                        }
                        i15++;
                        a.m6401i(b12, cArr, i16);
                        i16++;
                    }
                    i10 = i15;
                    i14 = i16;
                } else if (a.m6408p(b11)) {
                    if (i15 >= i12) {
                        throw C1150b0.m5666c();
                    }
                    a.m6403k(b11, bArr[i15], cArr, i14);
                    i10 = i15 + 1;
                    i14++;
                } else if (a.m6407o(b11)) {
                    if (i15 >= i12 - 1) {
                        throw C1150b0.m5666c();
                    }
                    int i17 = i15 + 1;
                    a.m6402j(b11, bArr[i15], bArr[i17], cArr, i14);
                    i10 = i17 + 1;
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw C1150b0.m5666c();
                    }
                    int i18 = i15 + 1;
                    byte b13 = bArr[i15];
                    int i19 = i18 + 1;
                    a.m6400h(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                    i10 = i19 + 1;
                    i14 = i14 + 1 + 1;
                }
            }
            return new String(cArr, 0, i14);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // androidx.datastore.preferences.protobuf.C1202s1.b
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int mo6412b(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1202s1.c.mo6412b(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // androidx.datastore.preferences.protobuf.C1202s1.b
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int mo6414d(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = androidx.datastore.preferences.protobuf.C1202s1.m6379a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = androidx.datastore.preferences.protobuf.C1202s1.m6379a(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = androidx.datastore.preferences.protobuf.C1202s1.m6380b(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = m6415e(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1202s1.c.mo6414d(int, byte[], int, int):int");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.s1$d */
    /* loaded from: classes.dex */
    public static class d extends IllegalArgumentException {
        d(int i10, int i11) {
            super("Unpaired surrogate at index " + i10 + " of " + i11);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.s1$e */
    /* loaded from: classes.dex */
    static final class e extends b {
        e() {
        }

        /* renamed from: e */
        static boolean m6417e() {
            return C1199r1.m6316C() && C1199r1.m6317D();
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x008e, code lost:
        
            return -1;
         */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int m6418f(byte[] r8, long r9, int r11) {
            /*
                int r0 = m6419g(r8, r9, r11)
                int r11 = r11 - r0
                long r0 = (long) r0
                long r9 = r9 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r11 <= 0) goto L1a
                long r4 = r9 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C1199r1.m6349s(r8, r9)
                if (r1 < 0) goto L19
                int r11 = r11 + (-1)
                r9 = r4
                goto L9
            L19:
                r9 = r4
            L1a:
                if (r11 != 0) goto L1d
                return r0
            L1d:
                int r11 = r11 + (-1)
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L3a
                if (r11 != 0) goto L29
                return r1
            L29:
                int r11 = r11 + (-1)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r9
                byte r9 = androidx.datastore.preferences.protobuf.C1199r1.m6349s(r8, r9)
                if (r9 <= r4) goto L37
                goto L39
            L37:
                r9 = r2
                goto L7
            L39:
                return r5
            L3a:
                r6 = -16
                if (r1 >= r6) goto L64
                r6 = 2
                if (r11 >= r6) goto L46
                int r8 = m6420h(r8, r1, r9, r11)
                return r8
            L46:
                int r11 = r11 + (-2)
                long r6 = r9 + r2
                byte r9 = androidx.datastore.preferences.protobuf.C1199r1.m6349s(r8, r9)
                if (r9 > r4) goto L63
                r10 = -96
                if (r1 != r0) goto L56
                if (r9 < r10) goto L63
            L56:
                r0 = -19
                if (r1 != r0) goto L5c
                if (r9 >= r10) goto L63
            L5c:
                long r2 = r2 + r6
                byte r9 = androidx.datastore.preferences.protobuf.C1199r1.m6349s(r8, r6)
                if (r9 <= r4) goto L37
            L63:
                return r5
            L64:
                r0 = 3
                if (r11 >= r0) goto L6c
                int r8 = m6420h(r8, r1, r9, r11)
                return r8
            L6c:
                int r11 = r11 + (-3)
                long r6 = r9 + r2
                byte r9 = androidx.datastore.preferences.protobuf.C1199r1.m6349s(r8, r9)
                if (r9 > r4) goto L8e
                int r10 = r1 << 28
                int r9 = r9 + 112
                int r10 = r10 + r9
                int r9 = r10 >> 30
                if (r9 != 0) goto L8e
                long r9 = r6 + r2
                byte r0 = androidx.datastore.preferences.protobuf.C1199r1.m6349s(r8, r6)
                if (r0 > r4) goto L8e
                long r2 = r2 + r9
                byte r9 = androidx.datastore.preferences.protobuf.C1199r1.m6349s(r8, r9)
                if (r9 <= r4) goto L37
            L8e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1202s1.e.m6418f(byte[], long, int):int");
        }

        /* renamed from: g */
        private static int m6419g(byte[] bArr, long j10, int i10) {
            int i11 = 0;
            if (i10 < 16) {
                return 0;
            }
            while (i11 < i10) {
                long j11 = 1 + j10;
                if (C1199r1.m6349s(bArr, j10) < 0) {
                    return i11;
                }
                i11++;
                j10 = j11;
            }
            return i10;
        }

        /* renamed from: h */
        private static int m6420h(byte[] bArr, int i10, long j10, int i11) {
            if (i11 == 0) {
                return C1202s1.m6387i(i10);
            }
            if (i11 == 1) {
                return C1202s1.m6388j(i10, C1199r1.m6349s(bArr, j10));
            }
            if (i11 == 2) {
                return C1202s1.m6389k(i10, C1199r1.m6349s(bArr, j10), C1199r1.m6349s(bArr, j10 + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.C1202s1.b
        /* renamed from: a */
        String mo6411a(byte[] bArr, int i10, int i11) {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte m6349s = C1199r1.m6349s(bArr, i10);
                if (!a.m6406n(m6349s)) {
                    break;
                }
                i10++;
                a.m6401i(m6349s, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte m6349s2 = C1199r1.m6349s(bArr, i10);
                if (a.m6406n(m6349s2)) {
                    int i16 = i14 + 1;
                    a.m6401i(m6349s2, cArr, i14);
                    while (i15 < i12) {
                        byte m6349s3 = C1199r1.m6349s(bArr, i15);
                        if (!a.m6406n(m6349s3)) {
                            break;
                        }
                        i15++;
                        a.m6401i(m6349s3, cArr, i16);
                        i16++;
                    }
                    i10 = i15;
                    i14 = i16;
                } else if (a.m6408p(m6349s2)) {
                    if (i15 >= i12) {
                        throw C1150b0.m5666c();
                    }
                    a.m6403k(m6349s2, C1199r1.m6349s(bArr, i15), cArr, i14);
                    i10 = i15 + 1;
                    i14++;
                } else if (a.m6407o(m6349s2)) {
                    if (i15 >= i12 - 1) {
                        throw C1150b0.m5666c();
                    }
                    int i17 = i15 + 1;
                    a.m6402j(m6349s2, C1199r1.m6349s(bArr, i15), C1199r1.m6349s(bArr, i17), cArr, i14);
                    i10 = i17 + 1;
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw C1150b0.m5666c();
                    }
                    int i18 = i15 + 1;
                    byte m6349s4 = C1199r1.m6349s(bArr, i15);
                    int i19 = i18 + 1;
                    a.m6400h(m6349s2, m6349s4, C1199r1.m6349s(bArr, i18), C1199r1.m6349s(bArr, i19), cArr, i14);
                    i10 = i19 + 1;
                    i14 = i14 + 1 + 1;
                }
            }
            return new String(cArr, 0, i14);
        }

        @Override // androidx.datastore.preferences.protobuf.C1202s1.b
        /* renamed from: b */
        int mo6412b(CharSequence charSequence, byte[] bArr, int i10, int i11) {
            char c10;
            long j10;
            long j11;
            long j12;
            char c11;
            int i12;
            char charAt;
            long j13 = i10;
            long j14 = i11 + j13;
            int length = charSequence.length();
            if (length > i11 || bArr.length - i11 < i10) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i10 + i11));
            }
            int i13 = 0;
            while (true) {
                c10 = 128;
                j10 = 1;
                if (i13 >= length || (charAt = charSequence.charAt(i13)) >= 128) {
                    break;
                }
                C1199r1.m6321H(bArr, j13, (byte) charAt);
                i13++;
                j13 = 1 + j13;
            }
            if (i13 == length) {
                return (int) j13;
            }
            while (i13 < length) {
                char charAt2 = charSequence.charAt(i13);
                if (charAt2 < c10 && j13 < j14) {
                    long j15 = j13 + j10;
                    C1199r1.m6321H(bArr, j13, (byte) charAt2);
                    j12 = j10;
                    j11 = j15;
                    c11 = c10;
                } else if (charAt2 < 2048 && j13 <= j14 - 2) {
                    long j16 = j13 + j10;
                    C1199r1.m6321H(bArr, j13, (byte) ((charAt2 >>> 6) | 960));
                    long j17 = j16 + j10;
                    C1199r1.m6321H(bArr, j16, (byte) ((charAt2 & '?') | RecognitionOptions.ITF));
                    long j18 = j10;
                    c11 = 128;
                    j11 = j17;
                    j12 = j18;
                } else {
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || j13 > j14 - 3) {
                        if (j13 > j14 - 4) {
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i12)))) {
                                throw new d(i13, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j13);
                        }
                        int i14 = i13 + 1;
                        if (i14 != length) {
                            char charAt3 = charSequence.charAt(i14);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                long j19 = j13 + 1;
                                C1199r1.m6321H(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                long j20 = j19 + 1;
                                c11 = 128;
                                C1199r1.m6321H(bArr, j19, (byte) (((codePoint >>> 12) & 63) | RecognitionOptions.ITF));
                                long j21 = j20 + 1;
                                C1199r1.m6321H(bArr, j20, (byte) (((codePoint >>> 6) & 63) | RecognitionOptions.ITF));
                                j12 = 1;
                                j11 = j21 + 1;
                                C1199r1.m6321H(bArr, j21, (byte) ((codePoint & 63) | RecognitionOptions.ITF));
                                i13 = i14;
                            } else {
                                i13 = i14;
                            }
                        }
                        throw new d(i13 - 1, length);
                    }
                    long j22 = j13 + j10;
                    C1199r1.m6321H(bArr, j13, (byte) ((charAt2 >>> '\f') | 480));
                    long j23 = j22 + j10;
                    C1199r1.m6321H(bArr, j22, (byte) (((charAt2 >>> 6) & 63) | RecognitionOptions.ITF));
                    C1199r1.m6321H(bArr, j23, (byte) ((charAt2 & '?') | RecognitionOptions.ITF));
                    j11 = j23 + 1;
                    j12 = 1;
                    c11 = 128;
                }
                i13++;
                c10 = c11;
                long j24 = j12;
                j13 = j11;
                j10 = j24;
            }
            return (int) j13;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
        
            if (androidx.datastore.preferences.protobuf.C1199r1.m6349s(r13, r2) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
        
            if (androidx.datastore.preferences.protobuf.C1199r1.m6349s(r13, r2) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.C1202s1.b
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int mo6414d(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 204
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1202s1.e.mo6414d(int, byte[], int, int):int");
        }
    }

    static {
        f4988a = (!e.m6417e() || C1155d.m5684c()) ? new c() : new e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static String m6383e(byte[] bArr, int i10, int i11) {
        return f4988a.mo6411a(bArr, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m6384f(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        return f4988a.mo6412b(charSequence, bArr, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m6385g(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 < length) {
                char charAt = charSequence.charAt(i10);
                if (charAt >= 2048) {
                    i11 += m6386h(charSequence, i10);
                    break;
                }
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                break;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i11 + 4294967296L));
    }

    /* renamed from: h */
    private static int m6386h(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        while (i10 < length) {
            char charAt = charSequence.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i10) < 65536) {
                        throw new d(i10, length);
                    }
                    i10++;
                }
            }
            i10++;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static int m6387i(int i10) {
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static int m6388j(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static int m6389k(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static int m6390l(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            return m6387i(b10);
        }
        if (i12 == 1) {
            return m6388j(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return m6389k(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: m */
    public static boolean m6391m(byte[] bArr) {
        return f4988a.m6413c(bArr, 0, bArr.length);
    }

    /* renamed from: n */
    public static boolean m6392n(byte[] bArr, int i10, int i11) {
        return f4988a.m6413c(bArr, i10, i11);
    }
}
