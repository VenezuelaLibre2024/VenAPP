package p363t8;

import android.os.SystemClock;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import p351s8.C10818e0;

/* renamed from: t8.i0 */
/* loaded from: classes.dex */
public final class C11154i0 {

    /* renamed from: a */
    private static final Object f28974a = new Object();

    /* renamed from: b */
    private static final Object f28975b = new Object();

    /* renamed from: c */
    private static boolean f28976c = false;

    /* renamed from: d */
    private static long f28977d = 0;

    /* renamed from: e */
    private static String f28978e = "time.android.com";

    /* renamed from: t8.i0$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo11852a();

        /* renamed from: b */
        void mo11853b(IOException iOException);
    }

    /* renamed from: t8.i0$c */
    /* loaded from: classes.dex */
    private static final class c implements C10818e0.b<C10818e0.e> {

        /* renamed from: a */
        private final b f28979a;

        public c(b bVar) {
            this.f28979a = bVar;
        }

        @Override // p351s8.C10818e0.b
        /* renamed from: h */
        public C10818e0.c mo311h(C10818e0.e eVar, long j10, long j11, IOException iOException, int i10) {
            b bVar = this.f28979a;
            if (bVar != null) {
                bVar.mo11853b(iOException);
            }
            return C10818e0.f27339f;
        }

        @Override // p351s8.C10818e0.b
        /* renamed from: i */
        public void mo313i(C10818e0.e eVar, long j10, long j11, boolean z10) {
        }

        @Override // p351s8.C10818e0.b
        /* renamed from: m */
        public void mo317m(C10818e0.e eVar, long j10, long j11) {
            if (this.f28979a != null) {
                if (C11154i0.m34740k()) {
                    this.f28979a.mo11852a();
                } else {
                    this.f28979a.mo11853b(new IOException(new ConcurrentModificationException()));
                }
            }
        }
    }

    /* renamed from: t8.i0$d */
    /* loaded from: classes.dex */
    private static final class d implements C10818e0.e {
        private d() {
        }

        @Override // p351s8.C10818e0.e
        /* renamed from: b */
        public void mo223b() {
            synchronized (C11154i0.f28974a) {
                synchronized (C11154i0.f28975b) {
                    if (C11154i0.f28976c) {
                        return;
                    }
                    long m34734e = C11154i0.m34734e();
                    synchronized (C11154i0.f28975b) {
                        long unused = C11154i0.f28977d = m34734e;
                        boolean unused2 = C11154i0.f28976c = true;
                    }
                }
            }
        }

        @Override // p351s8.C10818e0.e
        /* renamed from: c */
        public void mo224c() {
        }
    }

    /* renamed from: e */
    static /* synthetic */ long m34734e() {
        return m34741l();
    }

    /* renamed from: g */
    private static void m34736g(byte b10, byte b11, int i10, long j10) {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b11));
        }
        if (i10 != 0 && i10 <= 15) {
            if (j10 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i10);
        }
    }

    /* renamed from: h */
    public static long m34737h() {
        long j10;
        synchronized (f28975b) {
            j10 = f28976c ? f28977d : -9223372036854775807L;
        }
        return j10;
    }

    /* renamed from: i */
    public static String m34738i() {
        String str;
        synchronized (f28975b) {
            str = f28978e;
        }
        return str;
    }

    /* renamed from: j */
    public static void m34739j(C10818e0 c10818e0, b bVar) {
        if (m34740k()) {
            if (bVar != null) {
                bVar.mo11852a();
            }
        } else {
            if (c10818e0 == null) {
                c10818e0 = new C10818e0("SntpClient");
            }
            c10818e0.m32984n(new d(), new c(bVar), 1);
        }
    }

    /* renamed from: k */
    public static boolean m34740k() {
        boolean z10;
        synchronized (f28975b) {
            z10 = f28976c;
        }
        return z10;
    }

    /* renamed from: l */
    private static long m34741l() {
        InetAddress byName = InetAddress.getByName(m34738i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(ModuleDescriptor.MODULE_VERSION);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            m34744o(bArr, 40, currentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j10 = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            byte b10 = bArr[0];
            int i10 = bArr[1] & 255;
            long m34743n = m34743n(bArr, 24);
            long m34743n2 = m34743n(bArr, 32);
            long m34743n3 = m34743n(bArr, 40);
            m34736g((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), i10, m34743n3);
            long j11 = (j10 + (((m34743n2 - m34743n) + (m34743n3 - j10)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j11;
        } catch (Throwable th2) {
            try {
                datagramSocket.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: m */
    private static long m34742m(byte[] bArr, int i10) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & RecognitionOptions.ITF) == 128) {
            i11 = (i11 & 127) + RecognitionOptions.ITF;
        }
        if ((i12 & RecognitionOptions.ITF) == 128) {
            i12 = (i12 & 127) + RecognitionOptions.ITF;
        }
        if ((i13 & RecognitionOptions.ITF) == 128) {
            i13 = (i13 & 127) + RecognitionOptions.ITF;
        }
        if ((i14 & RecognitionOptions.ITF) == 128) {
            i14 = (i14 & 127) + RecognitionOptions.ITF;
        }
        return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
    }

    /* renamed from: n */
    private static long m34743n(byte[] bArr, int i10) {
        long m34742m = m34742m(bArr, i10);
        long m34742m2 = m34742m(bArr, i10 + 4);
        if (m34742m == 0 && m34742m2 == 0) {
            return 0L;
        }
        return ((m34742m - 2208988800L) * 1000) + ((m34742m2 * 1000) / 4294967296L);
    }

    /* renamed from: o */
    private static void m34744o(byte[] bArr, int i10, long j10) {
        if (j10 == 0) {
            Arrays.fill(bArr, i10, i10 + 8, (byte) 0);
            return;
        }
        long j11 = j10 / 1000;
        long j12 = j10 - (j11 * 1000);
        long j13 = j11 + 2208988800L;
        int i11 = i10 + 1;
        bArr[i10] = (byte) (j13 >> 24);
        int i12 = i11 + 1;
        bArr[i11] = (byte) (j13 >> 16);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (j13 >> 8);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (j13 >> 0);
        long j14 = (j12 * 4294967296L) / 1000;
        int i15 = i14 + 1;
        bArr[i14] = (byte) (j14 >> 24);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (j14 >> 16);
        bArr[i16] = (byte) (j14 >> 8);
        bArr[i16 + 1] = (byte) (Math.random() * 255.0d);
    }
}
