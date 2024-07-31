package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC6018y;
import com.google.crypto.tink.shaded.protobuf.C5950a0;
import com.google.crypto.tink.shaded.protobuf.C6008t1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.crypto.tink.shaded.protobuf.e */
/* loaded from: classes2.dex */
public final class C5961e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.e$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12571a;

        static {
            int[] iArr = new int[C6008t1.b.values().length];
            f12571a = iArr;
            try {
                iArr[C6008t1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12571a[C6008t1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12571a[C6008t1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12571a[C6008t1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12571a[C6008t1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12571a[C6008t1.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12571a[C6008t1.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12571a[C6008t1.b.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12571a[C6008t1.b.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12571a[C6008t1.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12571a[C6008t1.b.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12571a[C6008t1.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12571a[C6008t1.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f12571a[C6008t1.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f12571a[C6008t1.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f12571a[C6008t1.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f12571a[C6008t1.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f12571a[C6008t1.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.e$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        public int f12572a;

        /* renamed from: b */
        public long f12573b;

        /* renamed from: c */
        public Object f12574c;

        /* renamed from: d */
        public final C5994p f12575d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(C5994p c5994p) {
            c5994p.getClass();
            this.f12575d = c5994p;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static int m15353A(int i10, byte[] bArr, int i11, int i12, C5950a0.i<?> iVar, b bVar) {
        C6020z c6020z = (C6020z) iVar;
        int m15361I = m15361I(bArr, i11, bVar);
        while (true) {
            c6020z.m16278F0(AbstractC5973i.m15522b(bVar.f12572a));
            if (m15361I >= i12) {
                break;
            }
            int m15361I2 = m15361I(bArr, m15361I, bVar);
            if (i10 != bVar.f12572a) {
                break;
            }
            m15361I = m15361I(bArr, m15361I2, bVar);
        }
        return m15361I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static int m15354B(int i10, byte[] bArr, int i11, int i12, C5950a0.i<?> iVar, b bVar) {
        C5974i0 c5974i0 = (C5974i0) iVar;
        int m15364L = m15364L(bArr, i11, bVar);
        while (true) {
            c5974i0.m15593k(AbstractC5973i.m15523c(bVar.f12573b));
            if (m15364L >= i12) {
                break;
            }
            int m15361I = m15361I(bArr, m15364L, bVar);
            if (i10 != bVar.f12572a) {
                break;
            }
            m15364L = m15364L(bArr, m15361I, bVar);
        }
        return m15364L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static int m15355C(byte[] bArr, int i10, b bVar) {
        int m15361I = m15361I(bArr, i10, bVar);
        int i11 = bVar.f12572a;
        if (i11 < 0) {
            throw C5953b0.m15328g();
        }
        if (i11 == 0) {
            bVar.f12574c = "";
            return m15361I;
        }
        bVar.f12574c = new String(bArr, m15361I, i11, C5950a0.f12550b);
        return m15361I + i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002e -> B:5:0x000c). Please report as a decompilation issue!!! */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m15356D(int r4, byte[] r5, int r6, int r7, com.google.crypto.tink.shaded.protobuf.C5950a0.i<?> r8, com.google.crypto.tink.shaded.protobuf.C5961e.b r9) {
        /*
            int r6 = m15361I(r5, r6, r9)
            int r0 = r9.f12572a
            if (r0 < 0) goto L3f
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
        Lc:
            r8.add(r1)
            goto L1b
        L10:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.C5950a0.f12550b
            r2.<init>(r5, r6, r0, r3)
        L17:
            r8.add(r2)
            int r6 = r6 + r0
        L1b:
            if (r6 >= r7) goto L3e
            int r0 = m15361I(r5, r6, r9)
            int r2 = r9.f12572a
            if (r4 == r2) goto L26
            goto L3e
        L26:
            int r6 = m15361I(r5, r0, r9)
            int r0 = r9.f12572a
            if (r0 < 0) goto L39
            if (r0 != 0) goto L31
            goto Lc
        L31:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.C5950a0.f12550b
            r2.<init>(r5, r6, r0, r3)
            goto L17
        L39:
            com.google.crypto.tink.shaded.protobuf.b0 r4 = com.google.crypto.tink.shaded.protobuf.C5953b0.m15328g()
            throw r4
        L3e:
            return r6
        L3f:
            com.google.crypto.tink.shaded.protobuf.b0 r4 = com.google.crypto.tink.shaded.protobuf.C5953b0.m15328g()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C5961e.m15356D(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.a0$i, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0036 -> B:5:0x000c). Please report as a decompilation issue!!! */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m15357E(int r5, byte[] r6, int r7, int r8, com.google.crypto.tink.shaded.protobuf.C5950a0.i<?> r9, com.google.crypto.tink.shaded.protobuf.C5961e.b r10) {
        /*
            int r7 = m15361I(r6, r7, r10)
            int r0 = r10.f12572a
            if (r0 < 0) goto L59
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
        Lc:
            r9.add(r1)
            goto L23
        L10:
            int r2 = r7 + r0
            boolean r3 = com.google.crypto.tink.shaded.protobuf.C6005s1.m16057n(r6, r7, r2)
            if (r3 == 0) goto L54
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.C5950a0.f12550b
            r3.<init>(r6, r7, r0, r4)
        L1f:
            r9.add(r3)
            r7 = r2
        L23:
            if (r7 >= r8) goto L53
            int r0 = m15361I(r6, r7, r10)
            int r2 = r10.f12572a
            if (r5 == r2) goto L2e
            goto L53
        L2e:
            int r7 = m15361I(r6, r0, r10)
            int r0 = r10.f12572a
            if (r0 < 0) goto L4e
            if (r0 != 0) goto L39
            goto Lc
        L39:
            int r2 = r7 + r0
            boolean r3 = com.google.crypto.tink.shaded.protobuf.C6005s1.m16057n(r6, r7, r2)
            if (r3 == 0) goto L49
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.C5950a0.f12550b
            r3.<init>(r6, r7, r0, r4)
            goto L1f
        L49:
            com.google.crypto.tink.shaded.protobuf.b0 r5 = com.google.crypto.tink.shaded.protobuf.C5953b0.m15325d()
            throw r5
        L4e:
            com.google.crypto.tink.shaded.protobuf.b0 r5 = com.google.crypto.tink.shaded.protobuf.C5953b0.m15328g()
            throw r5
        L53:
            return r7
        L54:
            com.google.crypto.tink.shaded.protobuf.b0 r5 = com.google.crypto.tink.shaded.protobuf.C5953b0.m15325d()
            throw r5
        L59:
            com.google.crypto.tink.shaded.protobuf.b0 r5 = com.google.crypto.tink.shaded.protobuf.C5953b0.m15328g()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C5961e.m15357E(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.a0$i, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static int m15358F(byte[] bArr, int i10, b bVar) {
        int m15361I = m15361I(bArr, i10, bVar);
        int i11 = bVar.f12572a;
        if (i11 < 0) {
            throw C5953b0.m15328g();
        }
        if (i11 == 0) {
            bVar.f12574c = "";
            return m15361I;
        }
        bVar.f12574c = C6005s1.m16048e(bArr, m15361I, i11);
        return m15361I + i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static int m15359G(int i10, byte[] bArr, int i11, int i12, C5993o1 c5993o1, b bVar) {
        if (C6008t1.m16092a(i10) == 0) {
            throw C5953b0.m15324c();
        }
        int m16093b = C6008t1.m16093b(i10);
        if (m16093b == 0) {
            int m15364L = m15364L(bArr, i11, bVar);
            c5993o1.m15929n(i10, Long.valueOf(bVar.f12573b));
            return m15364L;
        }
        if (m16093b == 1) {
            c5993o1.m15929n(i10, Long.valueOf(m15378j(bArr, i11)));
            return i11 + 8;
        }
        if (m16093b == 2) {
            int m15361I = m15361I(bArr, i11, bVar);
            int i13 = bVar.f12572a;
            if (i13 < 0) {
                throw C5953b0.m15328g();
            }
            if (i13 > bArr.length - m15361I) {
                throw C5953b0.m15332m();
            }
            c5993o1.m15929n(i10, i13 == 0 ? AbstractC5970h.f12591b : AbstractC5970h.m15487l(bArr, m15361I, i13));
            return m15361I + i13;
        }
        if (m16093b != 3) {
            if (m16093b != 5) {
                throw C5953b0.m15324c();
            }
            c5993o1.m15929n(i10, Integer.valueOf(m15376h(bArr, i11)));
            return i11 + 4;
        }
        C5993o1 m15919k = C5993o1.m15919k();
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int m15361I2 = m15361I(bArr, i11, bVar);
            int i16 = bVar.f12572a;
            i15 = i16;
            if (i16 == i14) {
                i11 = m15361I2;
                break;
            }
            int m15359G = m15359G(i15, bArr, m15361I2, i12, m15919k, bVar);
            i15 = i16;
            i11 = m15359G;
        }
        if (i11 > i12 || i15 != i14) {
            throw C5953b0.m15329h();
        }
        c5993o1.m15929n(i10, m15919k);
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static int m15360H(int i10, byte[] bArr, int i11, b bVar) {
        int i12;
        int i13;
        int i14 = i10 & 127;
        int i15 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 < 0) {
            int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i15 + 1;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i14 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i15 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i14 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] >= 0) {
                                bVar.f12572a = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            bVar.f12572a = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        bVar.f12572a = i14 | i13;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static int m15361I(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return m15360H(b10, bArr, i11, bVar);
        }
        bVar.f12572a = b10;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static int m15362J(int i10, byte[] bArr, int i11, int i12, C5950a0.i<?> iVar, b bVar) {
        C6020z c6020z = (C6020z) iVar;
        int m15361I = m15361I(bArr, i11, bVar);
        while (true) {
            c6020z.m16278F0(bVar.f12572a);
            if (m15361I >= i12) {
                break;
            }
            int m15361I2 = m15361I(bArr, m15361I, bVar);
            if (i10 != bVar.f12572a) {
                break;
            }
            m15361I = m15361I(bArr, m15361I2, bVar);
        }
        return m15361I;
    }

    /* renamed from: K */
    static int m15363K(long j10, byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j11 |= (b11 & Byte.MAX_VALUE) << i12;
            i11 = i13;
            b10 = b11;
        }
        bVar.f12573b = j11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static int m15364L(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 < 0) {
            return m15363K(j10, bArr, i11, bVar);
        }
        bVar.f12573b = j10;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public static int m15365M(int i10, byte[] bArr, int i11, int i12, C5950a0.i<?> iVar, b bVar) {
        C5974i0 c5974i0 = (C5974i0) iVar;
        int m15364L = m15364L(bArr, i11, bVar);
        while (true) {
            c5974i0.m15593k(bVar.f12573b);
            if (m15364L >= i12) {
                break;
            }
            int m15361I = m15361I(bArr, m15364L, bVar);
            if (i10 != bVar.f12572a) {
                break;
            }
            m15364L = m15364L(bArr, m15361I, bVar);
        }
        return m15364L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static int m15366N(Object obj, InterfaceC5969g1 interfaceC5969g1, byte[] bArr, int i10, int i11, int i12, b bVar) {
        int m16198g0 = ((C6010u0) interfaceC5969g1).m16198g0(obj, bArr, i10, i11, i12, bVar);
        bVar.f12574c = obj;
        return m16198g0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public static int m15367O(Object obj, InterfaceC5969g1 interfaceC5969g1, byte[] bArr, int i10, int i11, b bVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = m15360H(i13, bArr, i12, bVar);
            i13 = bVar.f12572a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw C5953b0.m15332m();
        }
        int i15 = i13 + i14;
        interfaceC5969g1.mo15477h(obj, bArr, i14, i15, bVar);
        bVar.f12574c = obj;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public static int m15368P(int i10, byte[] bArr, int i11, int i12, b bVar) {
        if (C6008t1.m16092a(i10) == 0) {
            throw C5953b0.m15324c();
        }
        int m16093b = C6008t1.m16093b(i10);
        if (m16093b == 0) {
            return m15364L(bArr, i11, bVar);
        }
        if (m16093b == 1) {
            return i11 + 8;
        }
        if (m16093b == 2) {
            return m15361I(bArr, i11, bVar) + bVar.f12572a;
        }
        if (m16093b != 3) {
            if (m16093b == 5) {
                return i11 + 4;
            }
            throw C5953b0.m15324c();
        }
        int i13 = (i10 & (-8)) | 4;
        int i14 = 0;
        while (i11 < i12) {
            i11 = m15361I(bArr, i11, bVar);
            i14 = bVar.f12572a;
            if (i14 == i13) {
                break;
            }
            i11 = m15368P(i14, bArr, i11, i12, bVar);
        }
        if (i11 > i12 || i14 != i13) {
            throw C5953b0.m15329h();
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r12.f12573b == 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0013, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000e, code lost:
    
        if (r12.f12573b != 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0010, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        r11.m15410k(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r9 >= r10) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        r0 = m15361I(r8, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r7 == r12.f12572a) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r9 = m15364L(r8, r0, r12);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0029 -> B:3:0x0010). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m15369a(int r7, byte[] r8, int r9, int r10, com.google.crypto.tink.shaded.protobuf.C5950a0.i<?> r11, com.google.crypto.tink.shaded.protobuf.C5961e.b r12) {
        /*
            com.google.crypto.tink.shaded.protobuf.f r11 = (com.google.crypto.tink.shaded.protobuf.C5964f) r11
            int r9 = m15364L(r8, r9, r12)
            long r0 = r12.f12573b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L12
        L10:
            r0 = r1
            goto L13
        L12:
            r0 = r4
        L13:
            r11.m15410k(r0)
            if (r9 >= r10) goto L2c
            int r0 = m15361I(r8, r9, r12)
            int r5 = r12.f12572a
            if (r7 == r5) goto L21
            goto L2c
        L21:
            int r9 = m15364L(r8, r0, r12)
            long r5 = r12.f12573b
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L12
            goto L10
        L2c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C5961e.m15369a(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.a0$i, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m15370b(byte[] bArr, int i10, b bVar) {
        int m15361I = m15361I(bArr, i10, bVar);
        int i11 = bVar.f12572a;
        if (i11 < 0) {
            throw C5953b0.m15328g();
        }
        if (i11 > bArr.length - m15361I) {
            throw C5953b0.m15332m();
        }
        if (i11 == 0) {
            bVar.f12574c = AbstractC5970h.f12591b;
            return m15361I;
        }
        bVar.f12574c = AbstractC5970h.m15487l(bArr, m15361I, i11);
        return m15361I + i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r2 == r7.f12572a) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r4 = m15361I(r3, r0, r7);
        r0 = r7.f12572a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r0 < 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r0 > (r3.length - r4)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r0 != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0014, code lost:
    
        r6.add(com.google.crypto.tink.shaded.protobuf.AbstractC5970h.m15487l(r3, r4, r0));
        r4 = r4 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        throw com.google.crypto.tink.shaded.protobuf.C5953b0.m15332m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        throw com.google.crypto.tink.shaded.protobuf.C5953b0.m15328g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x001c, code lost:
    
        r6.add(com.google.crypto.tink.shaded.protobuf.AbstractC5970h.m15487l(r3, r4, r0));
        r4 = r4 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        if (r0 == 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        r6.add(com.google.crypto.tink.shaded.protobuf.AbstractC5970h.f12591b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r4 >= r5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r0 = m15361I(r3, r4, r7);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0033 -> B:6:0x000e). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m15371c(int r2, byte[] r3, int r4, int r5, com.google.crypto.tink.shaded.protobuf.C5950a0.i<?> r6, com.google.crypto.tink.shaded.protobuf.C5961e.b r7) {
        /*
            int r4 = m15361I(r3, r4, r7)
            int r0 = r7.f12572a
            if (r0 < 0) goto L46
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L41
            if (r0 != 0) goto L14
        Le:
            com.google.crypto.tink.shaded.protobuf.h r0 = com.google.crypto.tink.shaded.protobuf.AbstractC5970h.f12591b
            r6.add(r0)
            goto L1c
        L14:
            com.google.crypto.tink.shaded.protobuf.h r1 = com.google.crypto.tink.shaded.protobuf.AbstractC5970h.m15487l(r3, r4, r0)
            r6.add(r1)
            int r4 = r4 + r0
        L1c:
            if (r4 >= r5) goto L40
            int r0 = m15361I(r3, r4, r7)
            int r1 = r7.f12572a
            if (r2 == r1) goto L27
            goto L40
        L27:
            int r4 = m15361I(r3, r0, r7)
            int r0 = r7.f12572a
            if (r0 < 0) goto L3b
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L36
            if (r0 != 0) goto L14
            goto Le
        L36:
            com.google.crypto.tink.shaded.protobuf.b0 r2 = com.google.crypto.tink.shaded.protobuf.C5953b0.m15332m()
            throw r2
        L3b:
            com.google.crypto.tink.shaded.protobuf.b0 r2 = com.google.crypto.tink.shaded.protobuf.C5953b0.m15328g()
            throw r2
        L40:
            return r4
        L41:
            com.google.crypto.tink.shaded.protobuf.b0 r2 = com.google.crypto.tink.shaded.protobuf.C5953b0.m15332m()
            throw r2
        L46:
            com.google.crypto.tink.shaded.protobuf.b0 r2 = com.google.crypto.tink.shaded.protobuf.C5953b0.m15328g()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C5961e.m15371c(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.a0$i, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static double m15372d(byte[] bArr, int i10) {
        return Double.longBitsToDouble(m15378j(bArr, i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m15373e(int i10, byte[] bArr, int i11, int i12, C5950a0.i<?> iVar, b bVar) {
        C5985m c5985m = (C5985m) iVar;
        c5985m.m15870h(m15372d(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int m15361I = m15361I(bArr, i13, bVar);
            if (i10 != bVar.f12572a) {
                break;
            }
            c5985m.m15870h(m15372d(bArr, m15361I));
            i13 = m15361I + 8;
        }
        return i13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x00e4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f5  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int m15374f(int r8, byte[] r9, int r10, int r11, com.google.crypto.tink.shaded.protobuf.AbstractC6018y.c<?, ?> r12, com.google.crypto.tink.shaded.protobuf.AbstractC6018y.e<?, ?> r13, com.google.crypto.tink.shaded.protobuf.AbstractC5990n1<com.google.crypto.tink.shaded.protobuf.C5993o1, com.google.crypto.tink.shaded.protobuf.C5993o1> r14, com.google.crypto.tink.shaded.protobuf.C5961e.b r15) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C5961e.m15374f(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.y$c, com.google.crypto.tink.shaded.protobuf.y$e, com.google.crypto.tink.shaded.protobuf.n1, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m15375g(int i10, byte[] bArr, int i11, int i12, Object obj, InterfaceC6001r0 interfaceC6001r0, AbstractC5990n1<C5993o1, C5993o1> abstractC5990n1, b bVar) {
        AbstractC6018y.e m15933a = bVar.f12575d.m15933a(interfaceC6001r0, i10 >>> 3);
        if (m15933a == null) {
            return m15359G(i10, bArr, i11, i12, C6010u0.m16190w(obj), bVar);
        }
        AbstractC6018y.c cVar = (AbstractC6018y.c) obj;
        cVar.m16265V();
        return m15374f(i10, bArr, i11, i12, cVar, m15933a, abstractC5990n1, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m15376h(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m15377i(int i10, byte[] bArr, int i11, int i12, C5950a0.i<?> iVar, b bVar) {
        C6020z c6020z = (C6020z) iVar;
        c6020z.m16278F0(m15376h(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int m15361I = m15361I(bArr, i13, bVar);
            if (i10 != bVar.f12572a) {
                break;
            }
            c6020z.m16278F0(m15376h(bArr, m15361I));
            i13 = m15361I + 4;
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static long m15378j(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static int m15379k(int i10, byte[] bArr, int i11, int i12, C5950a0.i<?> iVar, b bVar) {
        C5974i0 c5974i0 = (C5974i0) iVar;
        c5974i0.m15593k(m15378j(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int m15361I = m15361I(bArr, i13, bVar);
            if (i10 != bVar.f12572a) {
                break;
            }
            c5974i0.m15593k(m15378j(bArr, m15361I));
            i13 = m15361I + 8;
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static float m15380l(byte[] bArr, int i10) {
        return Float.intBitsToFloat(m15376h(bArr, i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m15381m(int i10, byte[] bArr, int i11, int i12, C5950a0.i<?> iVar, b bVar) {
        C6014w c6014w = (C6014w) iVar;
        c6014w.m16210h(m15380l(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int m15361I = m15361I(bArr, i13, bVar);
            if (i10 != bVar.f12572a) {
                break;
            }
            c6014w.m16210h(m15380l(bArr, m15361I));
            i13 = m15361I + 4;
        }
        return i13;
    }

    /* renamed from: n */
    static int m15382n(InterfaceC5969g1 interfaceC5969g1, byte[] bArr, int i10, int i11, int i12, b bVar) {
        Object mo15474e = interfaceC5969g1.mo15474e();
        int m15366N = m15366N(mo15474e, interfaceC5969g1, bArr, i10, i11, i12, bVar);
        interfaceC5969g1.mo15471b(mo15474e);
        bVar.f12574c = mo15474e;
        return m15366N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static int m15383o(InterfaceC5969g1 interfaceC5969g1, int i10, byte[] bArr, int i11, int i12, C5950a0.i<?> iVar, b bVar) {
        int i13 = (i10 & (-8)) | 4;
        int m15382n = m15382n(interfaceC5969g1, bArr, i11, i12, i13, bVar);
        while (true) {
            iVar.add(bVar.f12574c);
            if (m15382n >= i12) {
                break;
            }
            int m15361I = m15361I(bArr, m15382n, bVar);
            if (i10 != bVar.f12572a) {
                break;
            }
            m15382n = m15382n(interfaceC5969g1, bArr, m15361I, i12, i13, bVar);
        }
        return m15382n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static int m15384p(InterfaceC5969g1 interfaceC5969g1, byte[] bArr, int i10, int i11, b bVar) {
        Object mo15474e = interfaceC5969g1.mo15474e();
        int m15367O = m15367O(mo15474e, interfaceC5969g1, bArr, i10, i11, bVar);
        interfaceC5969g1.mo15471b(mo15474e);
        bVar.f12574c = mo15474e;
        return m15367O;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static int m15385q(InterfaceC5969g1<?> interfaceC5969g1, int i10, byte[] bArr, int i11, int i12, C5950a0.i<?> iVar, b bVar) {
        int m15384p = m15384p(interfaceC5969g1, bArr, i11, i12, bVar);
        while (true) {
            iVar.add(bVar.f12574c);
            if (m15384p >= i12) {
                break;
            }
            int m15361I = m15361I(bArr, m15384p, bVar);
            if (i10 != bVar.f12572a) {
                break;
            }
            m15384p = m15384p(interfaceC5969g1, bArr, m15361I, i12, bVar);
        }
        return m15384p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static int m15386r(byte[] bArr, int i10, C5950a0.i<?> iVar, b bVar) {
        C5964f c5964f = (C5964f) iVar;
        int m15361I = m15361I(bArr, i10, bVar);
        int i11 = bVar.f12572a + m15361I;
        while (m15361I < i11) {
            m15361I = m15364L(bArr, m15361I, bVar);
            c5964f.m15410k(bVar.f12573b != 0);
        }
        if (m15361I == i11) {
            return m15361I;
        }
        throw C5953b0.m15332m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static int m15387s(byte[] bArr, int i10, C5950a0.i<?> iVar, b bVar) {
        C5985m c5985m = (C5985m) iVar;
        int m15361I = m15361I(bArr, i10, bVar);
        int i11 = bVar.f12572a + m15361I;
        while (m15361I < i11) {
            c5985m.m15870h(m15372d(bArr, m15361I));
            m15361I += 8;
        }
        if (m15361I == i11) {
            return m15361I;
        }
        throw C5953b0.m15332m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static int m15388t(byte[] bArr, int i10, C5950a0.i<?> iVar, b bVar) {
        C6020z c6020z = (C6020z) iVar;
        int m15361I = m15361I(bArr, i10, bVar);
        int i11 = bVar.f12572a + m15361I;
        while (m15361I < i11) {
            c6020z.m16278F0(m15376h(bArr, m15361I));
            m15361I += 4;
        }
        if (m15361I == i11) {
            return m15361I;
        }
        throw C5953b0.m15332m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static int m15389u(byte[] bArr, int i10, C5950a0.i<?> iVar, b bVar) {
        C5974i0 c5974i0 = (C5974i0) iVar;
        int m15361I = m15361I(bArr, i10, bVar);
        int i11 = bVar.f12572a + m15361I;
        while (m15361I < i11) {
            c5974i0.m15593k(m15378j(bArr, m15361I));
            m15361I += 8;
        }
        if (m15361I == i11) {
            return m15361I;
        }
        throw C5953b0.m15332m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static int m15390v(byte[] bArr, int i10, C5950a0.i<?> iVar, b bVar) {
        C6014w c6014w = (C6014w) iVar;
        int m15361I = m15361I(bArr, i10, bVar);
        int i11 = bVar.f12572a + m15361I;
        while (m15361I < i11) {
            c6014w.m16210h(m15380l(bArr, m15361I));
            m15361I += 4;
        }
        if (m15361I == i11) {
            return m15361I;
        }
        throw C5953b0.m15332m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static int m15391w(byte[] bArr, int i10, C5950a0.i<?> iVar, b bVar) {
        C6020z c6020z = (C6020z) iVar;
        int m15361I = m15361I(bArr, i10, bVar);
        int i11 = bVar.f12572a + m15361I;
        while (m15361I < i11) {
            m15361I = m15361I(bArr, m15361I, bVar);
            c6020z.m16278F0(AbstractC5973i.m15522b(bVar.f12572a));
        }
        if (m15361I == i11) {
            return m15361I;
        }
        throw C5953b0.m15332m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static int m15392x(byte[] bArr, int i10, C5950a0.i<?> iVar, b bVar) {
        C5974i0 c5974i0 = (C5974i0) iVar;
        int m15361I = m15361I(bArr, i10, bVar);
        int i11 = bVar.f12572a + m15361I;
        while (m15361I < i11) {
            m15361I = m15364L(bArr, m15361I, bVar);
            c5974i0.m15593k(AbstractC5973i.m15523c(bVar.f12573b));
        }
        if (m15361I == i11) {
            return m15361I;
        }
        throw C5953b0.m15332m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static int m15393y(byte[] bArr, int i10, C5950a0.i<?> iVar, b bVar) {
        C6020z c6020z = (C6020z) iVar;
        int m15361I = m15361I(bArr, i10, bVar);
        int i11 = bVar.f12572a + m15361I;
        while (m15361I < i11) {
            m15361I = m15361I(bArr, m15361I, bVar);
            c6020z.m16278F0(bVar.f12572a);
        }
        if (m15361I == i11) {
            return m15361I;
        }
        throw C5953b0.m15332m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static int m15394z(byte[] bArr, int i10, C5950a0.i<?> iVar, b bVar) {
        C5974i0 c5974i0 = (C5974i0) iVar;
        int m15361I = m15361I(bArr, i10, bVar);
        int i11 = bVar.f12572a + m15361I;
        while (m15361I < i11) {
            m15361I = m15364L(bArr, m15361I, bVar);
            c5974i0.m15593k(bVar.f12573b);
        }
        if (m15361I == i11) {
            return m15361I;
        }
        throw C5953b0.m15332m();
    }
}
