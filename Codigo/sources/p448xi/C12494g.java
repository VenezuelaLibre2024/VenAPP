package p448xi;

import com.google.android.gms.common.api.C5101a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import dm.C7056b;
import dm.C7061e;
import dm.C7081y;
import dm.InterfaceC7058c;
import dm.InterfaceC7060d;
import dm.InterfaceC7080x;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import p448xi.C12493f;
import p448xi.InterfaceC12489b;

/* renamed from: xi.g */
/* loaded from: classes3.dex */
public final class C12494g implements InterfaceC12497j {

    /* renamed from: a */
    private static final Logger f33868a = Logger.getLogger(b.class.getName());

    /* renamed from: b */
    private static final C7061e f33869b = C7061e.m20753l("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xi.g$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC7080x {

        /* renamed from: a */
        private final InterfaceC7060d f33870a;

        /* renamed from: b */
        int f33871b;

        /* renamed from: c */
        byte f33872c;

        /* renamed from: d */
        int f33873d;

        /* renamed from: e */
        int f33874e;

        /* renamed from: f */
        short f33875f;

        public a(InterfaceC7060d interfaceC7060d) {
            this.f33870a = interfaceC7060d;
        }

        /* renamed from: a */
        private void m40888a() {
            int i10 = this.f33873d;
            int m40884m = C12494g.m40884m(this.f33870a);
            this.f33874e = m40884m;
            this.f33871b = m40884m;
            byte readByte = (byte) (this.f33870a.readByte() & 255);
            this.f33872c = (byte) (this.f33870a.readByte() & 255);
            if (C12494g.f33868a.isLoggable(Level.FINE)) {
                C12494g.f33868a.fine(b.m40890b(true, this.f33873d, this.f33871b, readByte, this.f33872c));
            }
            int readInt = this.f33870a.readInt() & C5101a.e.API_PRIORITY_OTHER;
            this.f33873d = readInt;
            if (readByte != 9) {
                throw C12494g.m40882k("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            }
            if (readInt != i10) {
                throw C12494g.m40882k("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // dm.InterfaceC7080x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // dm.InterfaceC7080x
        /* renamed from: m */
        public C7081y mo20685m() {
            return this.f33870a.mo20685m();
        }

        @Override // dm.InterfaceC7080x
        /* renamed from: s1 */
        public long mo20686s1(C7056b c7056b, long j10) {
            while (true) {
                int i10 = this.f33874e;
                if (i10 != 0) {
                    long mo20686s1 = this.f33870a.mo20686s1(c7056b, Math.min(j10, i10));
                    if (mo20686s1 == -1) {
                        return -1L;
                    }
                    this.f33874e -= (int) mo20686s1;
                    return mo20686s1;
                }
                this.f33870a.skip(this.f33875f);
                this.f33875f = (short) 0;
                if ((this.f33872c & 4) != 0) {
                    return -1L;
                }
                m40888a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xi.g$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private static final String[] f33876a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b */
        private static final String[] f33877b = new String[64];

        /* renamed from: c */
        private static final String[] f33878c = new String[RecognitionOptions.QR_CODE];

        static {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                String[] strArr = f33878c;
                if (i11 >= strArr.length) {
                    break;
                }
                strArr[i11] = String.format("%8s", Integer.toBinaryString(i11)).replace(' ', '0');
                i11++;
            }
            String[] strArr2 = f33877b;
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
                String[] strArr3 = f33877b;
                int i15 = i14 | i13;
                strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
                strArr3[i15 | 8] = strArr3[i14] + '|' + strArr3[i13] + "|PADDED";
            }
            while (true) {
                String[] strArr4 = f33877b;
                if (i10 >= strArr4.length) {
                    return;
                }
                if (strArr4[i10] == null) {
                    strArr4[i10] = f33878c[i10];
                }
                i10++;
            }
        }

        b() {
        }

        /* renamed from: a */
        static String m40889a(byte b10, byte b11) {
            if (b11 == 0) {
                return "";
            }
            if (b10 != 2 && b10 != 3) {
                if (b10 == 4 || b10 == 6) {
                    return b11 == 1 ? "ACK" : f33878c[b11];
                }
                if (b10 != 7 && b10 != 8) {
                    String[] strArr = f33877b;
                    String str = b11 < strArr.length ? strArr[b11] : f33878c[b11];
                    return (b10 != 5 || (b11 & 4) == 0) ? (b10 != 0 || (b11 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return f33878c[b11];
        }

        /* renamed from: b */
        static String m40890b(boolean z10, int i10, int i11, byte b10, byte b11) {
            String[] strArr = f33876a;
            String format = b10 < strArr.length ? strArr[b10] : String.format("0x%02x", Byte.valueOf(b10));
            String m40889a = m40889a(b10, b11);
            Locale locale = Locale.US;
            Object[] objArr = new Object[5];
            objArr[0] = z10 ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i10);
            objArr[2] = Integer.valueOf(i11);
            objArr[3] = format;
            objArr[4] = m40889a;
            return String.format(locale, "%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    /* renamed from: xi.g$c */
    /* loaded from: classes3.dex */
    static final class c implements InterfaceC12489b {

        /* renamed from: a */
        private final InterfaceC7060d f33879a;

        /* renamed from: b */
        private final a f33880b;

        /* renamed from: c */
        private final boolean f33881c;

        /* renamed from: d */
        final C12493f.a f33882d;

        c(InterfaceC7060d interfaceC7060d, int i10, boolean z10) {
            this.f33879a = interfaceC7060d;
            this.f33881c = z10;
            a aVar = new a(interfaceC7060d);
            this.f33880b = aVar;
            this.f33882d = new C12493f.a(i10, aVar);
        }

        /* renamed from: a */
        private void m40891a(InterfaceC12489b.a aVar, int i10, byte b10, int i11) {
            boolean z10 = (b10 & 1) != 0;
            if ((b10 & 32) != 0) {
                throw C12494g.m40882k("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            short readByte = (b10 & 8) != 0 ? (short) (this.f33879a.readByte() & 255) : (short) 0;
            aVar.mo39281i(z10, i11, this.f33879a, C12494g.m40883l(i10, b10, readByte));
            this.f33879a.skip(readByte);
        }

        /* renamed from: b */
        private void m40892b(InterfaceC12489b.a aVar, int i10, byte b10, int i11) {
            if (i10 < 8) {
                throw C12494g.m40882k("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i10));
            }
            if (i11 != 0) {
                throw C12494g.m40882k("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
            int readInt = this.f33879a.readInt();
            int readInt2 = this.f33879a.readInt();
            int i12 = i10 - 8;
            EnumC12488a m40842b = EnumC12488a.m40842b(readInt2);
            if (m40842b == null) {
                throw C12494g.m40882k("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            }
            C7061e c7061e = C7061e.f15650e;
            if (i12 > 0) {
                c7061e = this.f33879a.mo20739w0(i12);
            }
            aVar.mo39288v(readInt, m40842b, c7061e);
        }

        /* renamed from: e */
        private List<C12491d> m40893e(int i10, short s10, byte b10, int i11) {
            a aVar = this.f33880b;
            aVar.f33874e = i10;
            aVar.f33871b = i10;
            aVar.f33875f = s10;
            aVar.f33872c = b10;
            aVar.f33873d = i11;
            this.f33882d.m40866l();
            return this.f33882d.m40863e();
        }

        /* renamed from: f */
        private void m40894f(InterfaceC12489b.a aVar, int i10, byte b10, int i11) {
            if (i11 == 0) {
                throw C12494g.m40882k("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            }
            boolean z10 = (b10 & 1) != 0;
            short readByte = (b10 & 8) != 0 ? (short) (this.f33879a.readByte() & 255) : (short) 0;
            if ((b10 & 32) != 0) {
                m40896i(aVar, i11);
                i10 -= 5;
            }
            aVar.mo39286t(false, z10, i11, -1, m40893e(C12494g.m40883l(i10, b10, readByte), readByte, b10, i11), EnumC12492e.HTTP_20_HEADERS);
        }

        /* renamed from: g */
        private void m40895g(InterfaceC12489b.a aVar, int i10, byte b10, int i11) {
            if (i10 != 8) {
                throw C12494g.m40882k("TYPE_PING length != 8: %s", Integer.valueOf(i10));
            }
            if (i11 != 0) {
                throw C12494g.m40882k("TYPE_PING streamId != 0", new Object[0]);
            }
            aVar.mo39280h((b10 & 1) != 0, this.f33879a.readInt(), this.f33879a.readInt());
        }

        /* renamed from: i */
        private void m40896i(InterfaceC12489b.a aVar, int i10) {
            int readInt = this.f33879a.readInt();
            aVar.mo39284l(i10, readInt & C5101a.e.API_PRIORITY_OTHER, (this.f33879a.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
        }

        /* renamed from: j */
        private void m40897j(InterfaceC12489b.a aVar, int i10, byte b10, int i11) {
            if (i10 != 5) {
                throw C12494g.m40882k("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i10));
            }
            if (i11 == 0) {
                throw C12494g.m40882k("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
            m40896i(aVar, i11);
        }

        /* renamed from: l */
        private void m40898l(InterfaceC12489b.a aVar, int i10, byte b10, int i11) {
            if (i11 == 0) {
                throw C12494g.m40882k("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            }
            short readByte = (b10 & 8) != 0 ? (short) (this.f33879a.readByte() & 255) : (short) 0;
            aVar.mo39282j(i11, this.f33879a.readInt() & C5101a.e.API_PRIORITY_OTHER, m40893e(C12494g.m40883l(i10 - 4, b10, readByte), readByte, b10, i11));
        }

        /* renamed from: n */
        private void m40899n(InterfaceC12489b.a aVar, int i10, byte b10, int i11) {
            if (i10 != 4) {
                throw C12494g.m40882k("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i10));
            }
            if (i11 == 0) {
                throw C12494g.m40882k("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
            int readInt = this.f33879a.readInt();
            EnumC12488a m40842b = EnumC12488a.m40842b(readInt);
            if (m40842b == null) {
                throw C12494g.m40882k("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            }
            aVar.mo39285s(i11, m40842b);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:16:0x002e. Please report as an issue. */
        /* renamed from: o */
        private void m40900o(InterfaceC12489b.a aVar, int i10, byte b10, int i11) {
            if (i11 != 0) {
                throw C12494g.m40882k("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            if ((b10 & 1) != 0) {
                if (i10 != 0) {
                    throw C12494g.m40882k("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                }
                aVar.mo39283k();
                return;
            }
            if (i10 % 6 != 0) {
                throw C12494g.m40882k("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i10));
            }
            C12496i c12496i = new C12496i();
            for (int i12 = 0; i12 < i10; i12 += 6) {
                short readShort = this.f33879a.readShort();
                int readInt = this.f33879a.readInt();
                switch (readShort) {
                    case 1:
                    case 6:
                        c12496i.m40919e(readShort, 0, readInt);
                    case 2:
                        if (readInt != 0 && readInt != 1) {
                            throw C12494g.m40882k("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                        c12496i.m40919e(readShort, 0, readInt);
                    case 3:
                        readShort = 4;
                        c12496i.m40919e(readShort, 0, readInt);
                    case 4:
                        if (readInt < 0) {
                            throw C12494g.m40882k("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                        readShort = 7;
                        c12496i.m40919e(readShort, 0, readInt);
                    case 5:
                        if (readInt < 16384 || readInt > 16777215) {
                            throw C12494g.m40882k("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                        }
                        c12496i.m40919e(readShort, 0, readInt);
                        break;
                    default:
                }
            }
            aVar.mo39287u(false, c12496i);
            if (c12496i.m40916b() >= 0) {
                this.f33882d.m40864g(c12496i.m40916b());
            }
        }

        /* renamed from: q */
        private void m40901q(InterfaceC12489b.a aVar, int i10, byte b10, int i11) {
            if (i10 != 4) {
                throw C12494g.m40882k("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i10));
            }
            long readInt = this.f33879a.readInt() & 2147483647L;
            if (readInt == 0) {
                throw C12494g.m40882k("windowSizeIncrement was 0", new Object[0]);
            }
            aVar.mo39279d(i11, readInt);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f33879a.close();
        }

        @Override // p448xi.InterfaceC12489b
        /* renamed from: p1 */
        public boolean mo40843p1(InterfaceC12489b.a aVar) {
            try {
                this.f33879a.mo20733q0(9L);
                int m40884m = C12494g.m40884m(this.f33879a);
                if (m40884m < 0 || m40884m > 16384) {
                    throw C12494g.m40882k("FRAME_SIZE_ERROR: %s", Integer.valueOf(m40884m));
                }
                byte readByte = (byte) (this.f33879a.readByte() & 255);
                byte readByte2 = (byte) (this.f33879a.readByte() & 255);
                int readInt = this.f33879a.readInt() & C5101a.e.API_PRIORITY_OTHER;
                if (C12494g.f33868a.isLoggable(Level.FINE)) {
                    C12494g.f33868a.fine(b.m40890b(true, readInt, m40884m, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        m40891a(aVar, m40884m, readByte2, readInt);
                        return true;
                    case 1:
                        m40894f(aVar, m40884m, readByte2, readInt);
                        return true;
                    case 2:
                        m40897j(aVar, m40884m, readByte2, readInt);
                        return true;
                    case 3:
                        m40899n(aVar, m40884m, readByte2, readInt);
                        return true;
                    case 4:
                        m40900o(aVar, m40884m, readByte2, readInt);
                        return true;
                    case 5:
                        m40898l(aVar, m40884m, readByte2, readInt);
                        return true;
                    case 6:
                        m40895g(aVar, m40884m, readByte2, readInt);
                        return true;
                    case 7:
                        m40892b(aVar, m40884m, readByte2, readInt);
                        return true;
                    case 8:
                        m40901q(aVar, m40884m, readByte2, readInt);
                        return true;
                    default:
                        this.f33879a.skip(m40884m);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }
    }

    /* renamed from: xi.g$d */
    /* loaded from: classes3.dex */
    static final class d implements InterfaceC12490c {

        /* renamed from: a */
        private final InterfaceC7058c f33883a;

        /* renamed from: b */
        private final boolean f33884b;

        /* renamed from: c */
        private final C7056b f33885c;

        /* renamed from: d */
        private final C12493f.b f33886d;

        /* renamed from: e */
        private int f33887e;

        /* renamed from: f */
        private boolean f33888f;

        d(InterfaceC7058c interfaceC7058c, boolean z10) {
            this.f33883a = interfaceC7058c;
            this.f33884b = z10;
            C7056b c7056b = new C7056b();
            this.f33885c = c7056b;
            this.f33886d = new C12493f.b(c7056b);
            this.f33887e = 16384;
        }

        /* renamed from: f */
        private void m40902f(int i10, long j10) {
            while (j10 > 0) {
                int min = (int) Math.min(this.f33887e, j10);
                long j11 = min;
                j10 -= j11;
                m40904b(i10, min, (byte) 9, j10 == 0 ? (byte) 4 : (byte) 0);
                this.f33883a.mo19710K0(this.f33885c, j11);
            }
        }

        @Override // p448xi.InterfaceC12490c
        /* renamed from: F */
        public synchronized void mo39170F(int i10, EnumC12488a enumC12488a, byte[] bArr) {
            if (this.f33888f) {
                throw new IOException("closed");
            }
            if (enumC12488a.httpCode == -1) {
                throw C12494g.m40881j("errorCode.httpCode == -1", new Object[0]);
            }
            m40904b(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f33883a.writeInt(i10);
            this.f33883a.writeInt(enumC12488a.httpCode);
            if (bArr.length > 0) {
                this.f33883a.write(bArr);
            }
            this.f33883a.flush();
        }

        @Override // p448xi.InterfaceC12490c
        /* renamed from: G */
        public synchronized void mo39171G() {
            if (this.f33888f) {
                throw new IOException("closed");
            }
            if (this.f33884b) {
                if (C12494g.f33868a.isLoggable(Level.FINE)) {
                    C12494g.f33868a.fine(String.format(">> CONNECTION %s", C12494g.f33869b.mo20770r()));
                }
                this.f33883a.write(C12494g.f33869b.mo20759E());
                this.f33883a.flush();
            }
        }

        @Override // p448xi.InterfaceC12490c
        /* renamed from: P0 */
        public synchronized void mo39172P0(C12496i c12496i) {
            if (this.f33888f) {
                throw new IOException("closed");
            }
            int i10 = 0;
            m40904b(0, c12496i.m40920f() * 6, (byte) 4, (byte) 0);
            while (i10 < 10) {
                if (c12496i.m40918d(i10)) {
                    this.f33883a.writeShort(i10 == 4 ? 3 : i10 == 7 ? 4 : i10);
                    this.f33883a.writeInt(c12496i.m40915a(i10));
                }
                i10++;
            }
            this.f33883a.flush();
        }

        @Override // p448xi.InterfaceC12490c
        /* renamed from: X0 */
        public synchronized void mo39173X0(boolean z10, int i10, C7056b c7056b, int i11) {
            if (this.f33888f) {
                throw new IOException("closed");
            }
            m40903a(i10, z10 ? (byte) 1 : (byte) 0, c7056b, i11);
        }

        /* renamed from: a */
        void m40903a(int i10, byte b10, C7056b c7056b, int i11) {
            m40904b(i10, i11, (byte) 0, b10);
            if (i11 > 0) {
                this.f33883a.mo19710K0(c7056b, i11);
            }
        }

        /* renamed from: b */
        void m40904b(int i10, int i11, byte b10, byte b11) {
            if (C12494g.f33868a.isLoggable(Level.FINE)) {
                C12494g.f33868a.fine(b.m40890b(false, i10, i11, b10, b11));
            }
            int i12 = this.f33887e;
            if (i11 > i12) {
                throw C12494g.m40881j("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
            }
            if ((Integer.MIN_VALUE & i10) != 0) {
                throw C12494g.m40881j("reserved bit set: %s", Integer.valueOf(i10));
            }
            C12494g.m40885n(this.f33883a, i11);
            this.f33883a.writeByte(b10 & 255);
            this.f33883a.writeByte(b11 & 255);
            this.f33883a.writeInt(i10 & C5101a.e.API_PRIORITY_OTHER);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            this.f33888f = true;
            this.f33883a.close();
        }

        @Override // p448xi.InterfaceC12490c
        /* renamed from: d */
        public synchronized void mo39174d(int i10, long j10) {
            if (this.f33888f) {
                throw new IOException("closed");
            }
            if (j10 == 0 || j10 > 2147483647L) {
                throw C12494g.m40881j("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
            }
            m40904b(i10, 4, (byte) 8, (byte) 0);
            this.f33883a.writeInt((int) j10);
            this.f33883a.flush();
        }

        /* renamed from: e */
        void m40905e(boolean z10, int i10, List<C12491d> list) {
            if (this.f33888f) {
                throw new IOException("closed");
            }
            this.f33886d.m40872e(list);
            long size = this.f33885c.size();
            int min = (int) Math.min(this.f33887e, size);
            long j10 = min;
            byte b10 = size == j10 ? (byte) 4 : (byte) 0;
            if (z10) {
                b10 = (byte) (b10 | 1);
            }
            m40904b(i10, min, (byte) 1, b10);
            this.f33883a.mo19710K0(this.f33885c, j10);
            if (size > j10) {
                m40902f(i10, size - j10);
            }
        }

        @Override // p448xi.InterfaceC12490c
        public synchronized void flush() {
            if (this.f33888f) {
                throw new IOException("closed");
            }
            this.f33883a.flush();
        }

        @Override // p448xi.InterfaceC12490c
        /* renamed from: h */
        public synchronized void mo39166h(boolean z10, int i10, int i11) {
            if (this.f33888f) {
                throw new IOException("closed");
            }
            m40904b(0, 8, (byte) 6, z10 ? (byte) 1 : (byte) 0);
            this.f33883a.writeInt(i10);
            this.f33883a.writeInt(i11);
            this.f33883a.flush();
        }

        @Override // p448xi.InterfaceC12490c
        /* renamed from: o1 */
        public synchronized void mo39167o1(C12496i c12496i) {
            if (this.f33888f) {
                throw new IOException("closed");
            }
            this.f33887e = c12496i.m40917c(this.f33887e);
            m40904b(0, 0, (byte) 4, (byte) 1);
            this.f33883a.flush();
        }

        @Override // p448xi.InterfaceC12490c
        /* renamed from: p0 */
        public int mo39175p0() {
            return this.f33887e;
        }

        @Override // p448xi.InterfaceC12490c
        /* renamed from: r1 */
        public synchronized void mo39176r1(boolean z10, boolean z11, int i10, int i11, List<C12491d> list) {
            try {
                if (z11) {
                    throw new UnsupportedOperationException();
                }
                if (this.f33888f) {
                    throw new IOException("closed");
                }
                m40905e(z10, i10, list);
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // p448xi.InterfaceC12490c
        /* renamed from: s */
        public synchronized void mo39168s(int i10, EnumC12488a enumC12488a) {
            if (this.f33888f) {
                throw new IOException("closed");
            }
            if (enumC12488a.httpCode == -1) {
                throw new IllegalArgumentException();
            }
            m40904b(i10, 4, (byte) 3, (byte) 0);
            this.f33883a.writeInt(enumC12488a.httpCode);
            this.f33883a.flush();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static IllegalArgumentException m40881j(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static IOException m40882k(String str, Object... objArr) {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static int m40883l(int i10, byte b10, short s10) {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return (short) (i10 - s10);
        }
        throw m40882k("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static int m40884m(InterfaceC7060d interfaceC7060d) {
        return (interfaceC7060d.readByte() & 255) | ((interfaceC7060d.readByte() & 255) << 16) | ((interfaceC7060d.readByte() & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static void m40885n(InterfaceC7058c interfaceC7058c, int i10) {
        interfaceC7058c.writeByte((i10 >>> 16) & 255);
        interfaceC7058c.writeByte((i10 >>> 8) & 255);
        interfaceC7058c.writeByte(i10 & 255);
    }

    @Override // p448xi.InterfaceC12497j
    /* renamed from: a */
    public InterfaceC12490c mo40886a(InterfaceC7058c interfaceC7058c, boolean z10) {
        return new d(interfaceC7058c, z10);
    }

    @Override // p448xi.InterfaceC12497j
    /* renamed from: b */
    public InterfaceC12489b mo40887b(InterfaceC7060d interfaceC7060d, boolean z10) {
        return new c(interfaceC7060d, RecognitionOptions.AZTEC, z10);
    }
}
