package xi;

import com.google.android.gms.common.api.a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import dm.x;
import dm.y;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import xi.b;
import xi.f;

/* loaded from: classes3.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f31348a = Logger.getLogger(b.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final dm.e f31349b = dm.e.l("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a implements x {

        /* renamed from: a, reason: collision with root package name */
        private final dm.d f31350a;

        /* renamed from: b, reason: collision with root package name */
        int f31351b;

        /* renamed from: c, reason: collision with root package name */
        byte f31352c;

        /* renamed from: d, reason: collision with root package name */
        int f31353d;

        /* renamed from: e, reason: collision with root package name */
        int f31354e;

        /* renamed from: f, reason: collision with root package name */
        short f31355f;

        public a(dm.d dVar) {
            this.f31350a = dVar;
        }

        private void a() {
            int i10 = this.f31353d;
            int m10 = g.m(this.f31350a);
            this.f31354e = m10;
            this.f31351b = m10;
            byte readByte = (byte) (this.f31350a.readByte() & 255);
            this.f31352c = (byte) (this.f31350a.readByte() & 255);
            if (g.f31348a.isLoggable(Level.FINE)) {
                g.f31348a.fine(b.b(true, this.f31353d, this.f31351b, readByte, this.f31352c));
            }
            int readInt = this.f31350a.readInt() & a.e.API_PRIORITY_OTHER;
            this.f31353d = readInt;
            if (readByte != 9) {
                throw g.k("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            }
            if (readInt != i10) {
                throw g.k("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // dm.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // dm.x
        public y m() {
            return this.f31350a.m();
        }

        @Override // dm.x
        public long s1(dm.b bVar, long j10) {
            while (true) {
                int i10 = this.f31354e;
                if (i10 != 0) {
                    long s12 = this.f31350a.s1(bVar, Math.min(j10, i10));
                    if (s12 == -1) {
                        return -1L;
                    }
                    this.f31354e -= (int) s12;
                    return s12;
                }
                this.f31350a.skip(this.f31355f);
                this.f31355f = (short) 0;
                if ((this.f31352c & 4) != 0) {
                    return -1L;
                }
                a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final String[] f31356a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f31357b = new String[64];

        /* renamed from: c, reason: collision with root package name */
        private static final String[] f31358c = new String[RecognitionOptions.QR_CODE];

        static {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                String[] strArr = f31358c;
                if (i11 >= strArr.length) {
                    break;
                }
                strArr[i11] = String.format("%8s", Integer.toBinaryString(i11)).replace(' ', '0');
                i11++;
            }
            String[] strArr2 = f31357b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            strArr2[1 | 8] = strArr2[1] + "|PADDED";
            strArr2[4] = "END_HEADERS";
            strArr2[32] = "PRIORITY";
            strArr2[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = iArr2[i12];
                int i14 = iArr[0];
                String[] strArr3 = f31357b;
                int i15 = i14 | i13;
                strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
                strArr3[i15 | 8] = strArr3[i14] + '|' + strArr3[i13] + "|PADDED";
            }
            while (true) {
                String[] strArr4 = f31357b;
                if (i10 >= strArr4.length) {
                    return;
                }
                if (strArr4[i10] == null) {
                    strArr4[i10] = f31358c[i10];
                }
                i10++;
            }
        }

        b() {
        }

        static String a(byte b10, byte b11) {
            if (b11 == 0) {
                return "";
            }
            if (b10 != 2 && b10 != 3) {
                if (b10 == 4 || b10 == 6) {
                    return b11 == 1 ? "ACK" : f31358c[b11];
                }
                if (b10 != 7 && b10 != 8) {
                    String[] strArr = f31357b;
                    String str = b11 < strArr.length ? strArr[b11] : f31358c[b11];
                    return (b10 != 5 || (b11 & 4) == 0) ? (b10 != 0 || (b11 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return f31358c[b11];
        }

        static String b(boolean z10, int i10, int i11, byte b10, byte b11) {
            String[] strArr = f31356a;
            String format = b10 < strArr.length ? strArr[b10] : String.format("0x%02x", Byte.valueOf(b10));
            String a10 = a(b10, b11);
            Locale locale = Locale.US;
            Object[] objArr = new Object[5];
            objArr[0] = z10 ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i10);
            objArr[2] = Integer.valueOf(i11);
            objArr[3] = format;
            objArr[4] = a10;
            return String.format(locale, "%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    /* loaded from: classes3.dex */
    static final class c implements xi.b {

        /* renamed from: a, reason: collision with root package name */
        private final dm.d f31359a;

        /* renamed from: b, reason: collision with root package name */
        private final a f31360b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f31361c;

        /* renamed from: d, reason: collision with root package name */
        final f.a f31362d;

        c(dm.d dVar, int i10, boolean z10) {
            this.f31359a = dVar;
            this.f31361c = z10;
            a aVar = new a(dVar);
            this.f31360b = aVar;
            this.f31362d = new f.a(i10, aVar);
        }

        private void a(b.a aVar, int i10, byte b10, int i11) {
            boolean z10 = (b10 & 1) != 0;
            if ((b10 & 32) != 0) {
                throw g.k("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            short readByte = (b10 & 8) != 0 ? (short) (this.f31359a.readByte() & 255) : (short) 0;
            aVar.i(z10, i11, this.f31359a, g.l(i10, b10, readByte));
            this.f31359a.skip(readByte);
        }

        private void b(b.a aVar, int i10, byte b10, int i11) {
            if (i10 < 8) {
                throw g.k("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i10));
            }
            if (i11 != 0) {
                throw g.k("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
            int readInt = this.f31359a.readInt();
            int readInt2 = this.f31359a.readInt();
            int i12 = i10 - 8;
            xi.a b11 = xi.a.b(readInt2);
            if (b11 == null) {
                throw g.k("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            }
            dm.e eVar = dm.e.f14292e;
            if (i12 > 0) {
                eVar = this.f31359a.w0(i12);
            }
            aVar.v(readInt, b11, eVar);
        }

        private List<xi.d> e(int i10, short s10, byte b10, int i11) {
            a aVar = this.f31360b;
            aVar.f31354e = i10;
            aVar.f31351b = i10;
            aVar.f31355f = s10;
            aVar.f31352c = b10;
            aVar.f31353d = i11;
            this.f31362d.l();
            return this.f31362d.e();
        }

        private void f(b.a aVar, int i10, byte b10, int i11) {
            if (i11 == 0) {
                throw g.k("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            }
            boolean z10 = (b10 & 1) != 0;
            short readByte = (b10 & 8) != 0 ? (short) (this.f31359a.readByte() & 255) : (short) 0;
            if ((b10 & 32) != 0) {
                i(aVar, i11);
                i10 -= 5;
            }
            aVar.t(false, z10, i11, -1, e(g.l(i10, b10, readByte), readByte, b10, i11), e.HTTP_20_HEADERS);
        }

        private void g(b.a aVar, int i10, byte b10, int i11) {
            if (i10 != 8) {
                throw g.k("TYPE_PING length != 8: %s", Integer.valueOf(i10));
            }
            if (i11 != 0) {
                throw g.k("TYPE_PING streamId != 0", new Object[0]);
            }
            aVar.h((b10 & 1) != 0, this.f31359a.readInt(), this.f31359a.readInt());
        }

        private void i(b.a aVar, int i10) {
            int readInt = this.f31359a.readInt();
            aVar.l(i10, readInt & a.e.API_PRIORITY_OTHER, (this.f31359a.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
        }

        private void j(b.a aVar, int i10, byte b10, int i11) {
            if (i10 != 5) {
                throw g.k("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i10));
            }
            if (i11 == 0) {
                throw g.k("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
            i(aVar, i11);
        }

        private void l(b.a aVar, int i10, byte b10, int i11) {
            if (i11 == 0) {
                throw g.k("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            }
            short readByte = (b10 & 8) != 0 ? (short) (this.f31359a.readByte() & 255) : (short) 0;
            aVar.j(i11, this.f31359a.readInt() & a.e.API_PRIORITY_OTHER, e(g.l(i10 - 4, b10, readByte), readByte, b10, i11));
        }

        private void n(b.a aVar, int i10, byte b10, int i11) {
            if (i10 != 4) {
                throw g.k("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i10));
            }
            if (i11 == 0) {
                throw g.k("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
            int readInt = this.f31359a.readInt();
            xi.a b11 = xi.a.b(readInt);
            if (b11 == null) {
                throw g.k("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            }
            aVar.s(i11, b11);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:16:0x002e. Please report as an issue. */
        private void o(b.a aVar, int i10, byte b10, int i11) {
            if (i11 != 0) {
                throw g.k("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            if ((b10 & 1) != 0) {
                if (i10 != 0) {
                    throw g.k("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                }
                aVar.k();
                return;
            }
            if (i10 % 6 != 0) {
                throw g.k("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i10));
            }
            i iVar = new i();
            for (int i12 = 0; i12 < i10; i12 += 6) {
                short readShort = this.f31359a.readShort();
                int readInt = this.f31359a.readInt();
                switch (readShort) {
                    case 1:
                    case 6:
                        iVar.e(readShort, 0, readInt);
                    case 2:
                        if (readInt != 0 && readInt != 1) {
                            throw g.k("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                        iVar.e(readShort, 0, readInt);
                    case 3:
                        readShort = 4;
                        iVar.e(readShort, 0, readInt);
                    case 4:
                        if (readInt < 0) {
                            throw g.k("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                        readShort = 7;
                        iVar.e(readShort, 0, readInt);
                    case 5:
                        if (readInt < 16384 || readInt > 16777215) {
                            throw g.k("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                        }
                        iVar.e(readShort, 0, readInt);
                        break;
                    default:
                }
            }
            aVar.u(false, iVar);
            if (iVar.b() >= 0) {
                this.f31362d.g(iVar.b());
            }
        }

        private void q(b.a aVar, int i10, byte b10, int i11) {
            if (i10 != 4) {
                throw g.k("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i10));
            }
            long readInt = this.f31359a.readInt() & 2147483647L;
            if (readInt == 0) {
                throw g.k("windowSizeIncrement was 0", new Object[0]);
            }
            aVar.d(i11, readInt);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f31359a.close();
        }

        @Override // xi.b
        public boolean p1(b.a aVar) {
            try {
                this.f31359a.q0(9L);
                int m10 = g.m(this.f31359a);
                if (m10 < 0 || m10 > 16384) {
                    throw g.k("FRAME_SIZE_ERROR: %s", Integer.valueOf(m10));
                }
                byte readByte = (byte) (this.f31359a.readByte() & 255);
                byte readByte2 = (byte) (this.f31359a.readByte() & 255);
                int readInt = this.f31359a.readInt() & a.e.API_PRIORITY_OTHER;
                if (g.f31348a.isLoggable(Level.FINE)) {
                    g.f31348a.fine(b.b(true, readInt, m10, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        a(aVar, m10, readByte2, readInt);
                        return true;
                    case 1:
                        f(aVar, m10, readByte2, readInt);
                        return true;
                    case 2:
                        j(aVar, m10, readByte2, readInt);
                        return true;
                    case 3:
                        n(aVar, m10, readByte2, readInt);
                        return true;
                    case 4:
                        o(aVar, m10, readByte2, readInt);
                        return true;
                    case 5:
                        l(aVar, m10, readByte2, readInt);
                        return true;
                    case 6:
                        g(aVar, m10, readByte2, readInt);
                        return true;
                    case 7:
                        b(aVar, m10, readByte2, readInt);
                        return true;
                    case 8:
                        q(aVar, m10, readByte2, readInt);
                        return true;
                    default:
                        this.f31359a.skip(m10);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class d implements xi.c {

        /* renamed from: a, reason: collision with root package name */
        private final dm.c f31363a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f31364b;

        /* renamed from: c, reason: collision with root package name */
        private final dm.b f31365c;

        /* renamed from: d, reason: collision with root package name */
        private final f.b f31366d;

        /* renamed from: e, reason: collision with root package name */
        private int f31367e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f31368f;

        d(dm.c cVar, boolean z10) {
            this.f31363a = cVar;
            this.f31364b = z10;
            dm.b bVar = new dm.b();
            this.f31365c = bVar;
            this.f31366d = new f.b(bVar);
            this.f31367e = 16384;
        }

        private void f(int i10, long j10) {
            while (j10 > 0) {
                int min = (int) Math.min(this.f31367e, j10);
                long j11 = min;
                j10 -= j11;
                b(i10, min, (byte) 9, j10 == 0 ? (byte) 4 : (byte) 0);
                this.f31363a.K0(this.f31365c, j11);
            }
        }

        @Override // xi.c
        public synchronized void F(int i10, xi.a aVar, byte[] bArr) {
            if (this.f31368f) {
                throw new IOException("closed");
            }
            if (aVar.httpCode == -1) {
                throw g.j("errorCode.httpCode == -1", new Object[0]);
            }
            b(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f31363a.writeInt(i10);
            this.f31363a.writeInt(aVar.httpCode);
            if (bArr.length > 0) {
                this.f31363a.write(bArr);
            }
            this.f31363a.flush();
        }

        @Override // xi.c
        public synchronized void G() {
            if (this.f31368f) {
                throw new IOException("closed");
            }
            if (this.f31364b) {
                if (g.f31348a.isLoggable(Level.FINE)) {
                    g.f31348a.fine(String.format(">> CONNECTION %s", g.f31349b.r()));
                }
                this.f31363a.write(g.f31349b.E());
                this.f31363a.flush();
            }
        }

        @Override // xi.c
        public synchronized void P0(i iVar) {
            if (this.f31368f) {
                throw new IOException("closed");
            }
            int i10 = 0;
            b(0, iVar.f() * 6, (byte) 4, (byte) 0);
            while (i10 < 10) {
                if (iVar.d(i10)) {
                    this.f31363a.writeShort(i10 == 4 ? 3 : i10 == 7 ? 4 : i10);
                    this.f31363a.writeInt(iVar.a(i10));
                }
                i10++;
            }
            this.f31363a.flush();
        }

        @Override // xi.c
        public synchronized void X0(boolean z10, int i10, dm.b bVar, int i11) {
            if (this.f31368f) {
                throw new IOException("closed");
            }
            a(i10, z10 ? (byte) 1 : (byte) 0, bVar, i11);
        }

        void a(int i10, byte b10, dm.b bVar, int i11) {
            b(i10, i11, (byte) 0, b10);
            if (i11 > 0) {
                this.f31363a.K0(bVar, i11);
            }
        }

        void b(int i10, int i11, byte b10, byte b11) {
            if (g.f31348a.isLoggable(Level.FINE)) {
                g.f31348a.fine(b.b(false, i10, i11, b10, b11));
            }
            int i12 = this.f31367e;
            if (i11 > i12) {
                throw g.j("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
            }
            if ((Integer.MIN_VALUE & i10) != 0) {
                throw g.j("reserved bit set: %s", Integer.valueOf(i10));
            }
            g.n(this.f31363a, i11);
            this.f31363a.writeByte(b10 & 255);
            this.f31363a.writeByte(b11 & 255);
            this.f31363a.writeInt(i10 & a.e.API_PRIORITY_OTHER);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            this.f31368f = true;
            this.f31363a.close();
        }

        @Override // xi.c
        public synchronized void d(int i10, long j10) {
            if (this.f31368f) {
                throw new IOException("closed");
            }
            if (j10 == 0 || j10 > 2147483647L) {
                throw g.j("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
            }
            b(i10, 4, (byte) 8, (byte) 0);
            this.f31363a.writeInt((int) j10);
            this.f31363a.flush();
        }

        void e(boolean z10, int i10, List<xi.d> list) {
            if (this.f31368f) {
                throw new IOException("closed");
            }
            this.f31366d.e(list);
            long size = this.f31365c.size();
            int min = (int) Math.min(this.f31367e, size);
            long j10 = min;
            byte b10 = size == j10 ? (byte) 4 : (byte) 0;
            if (z10) {
                b10 = (byte) (b10 | 1);
            }
            b(i10, min, (byte) 1, b10);
            this.f31363a.K0(this.f31365c, j10);
            if (size > j10) {
                f(i10, size - j10);
            }
        }

        @Override // xi.c
        public synchronized void flush() {
            if (this.f31368f) {
                throw new IOException("closed");
            }
            this.f31363a.flush();
        }

        @Override // xi.c
        public synchronized void h(boolean z10, int i10, int i11) {
            if (this.f31368f) {
                throw new IOException("closed");
            }
            b(0, 8, (byte) 6, z10 ? (byte) 1 : (byte) 0);
            this.f31363a.writeInt(i10);
            this.f31363a.writeInt(i11);
            this.f31363a.flush();
        }

        @Override // xi.c
        public synchronized void o1(i iVar) {
            if (this.f31368f) {
                throw new IOException("closed");
            }
            this.f31367e = iVar.c(this.f31367e);
            b(0, 0, (byte) 4, (byte) 1);
            this.f31363a.flush();
        }

        @Override // xi.c
        public int p0() {
            return this.f31367e;
        }

        @Override // xi.c
        public synchronized void r1(boolean z10, boolean z11, int i10, int i11, List<xi.d> list) {
            try {
                if (z11) {
                    throw new UnsupportedOperationException();
                }
                if (this.f31368f) {
                    throw new IOException("closed");
                }
                e(z10, i10, list);
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // xi.c
        public synchronized void s(int i10, xi.a aVar) {
            if (this.f31368f) {
                throw new IOException("closed");
            }
            if (aVar.httpCode == -1) {
                throw new IllegalArgumentException();
            }
            b(i10, 4, (byte) 3, (byte) 0);
            this.f31363a.writeInt(aVar.httpCode);
            this.f31363a.flush();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IllegalArgumentException j(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IOException k(String str, Object... objArr) {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i10, byte b10, short s10) {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return (short) (i10 - s10);
        }
        throw k("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(dm.d dVar) {
        return (dVar.readByte() & 255) | ((dVar.readByte() & 255) << 16) | ((dVar.readByte() & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(dm.c cVar, int i10) {
        cVar.writeByte((i10 >>> 16) & 255);
        cVar.writeByte((i10 >>> 8) & 255);
        cVar.writeByte(i10 & 255);
    }

    @Override // xi.j
    public xi.c a(dm.c cVar, boolean z10) {
        return new d(cVar, z10);
    }

    @Override // xi.j
    public xi.b b(dm.d dVar, boolean z10) {
        return new c(dVar, RecognitionOptions.AZTEC, z10);
    }
}
