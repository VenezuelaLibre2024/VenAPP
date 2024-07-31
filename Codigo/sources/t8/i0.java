package t8;

import android.os.SystemClock;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import s8.e0;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f26678a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f26679b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static boolean f26680c = false;

    /* renamed from: d, reason: collision with root package name */
    private static long f26681d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static String f26682e = "time.android.com";

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(IOException iOException);
    }

    /* loaded from: classes.dex */
    private static final class c implements e0.b<e0.e> {

        /* renamed from: a, reason: collision with root package name */
        private final b f26683a;

        public c(b bVar) {
            this.f26683a = bVar;
        }

        @Override // s8.e0.b
        public e0.c h(e0.e eVar, long j10, long j11, IOException iOException, int i10) {
            b bVar = this.f26683a;
            if (bVar != null) {
                bVar.b(iOException);
            }
            return s8.e0.f25220f;
        }

        @Override // s8.e0.b
        public void i(e0.e eVar, long j10, long j11, boolean z10) {
        }

        @Override // s8.e0.b
        public void m(e0.e eVar, long j10, long j11) {
            if (this.f26683a != null) {
                if (i0.k()) {
                    this.f26683a.a();
                } else {
                    this.f26683a.b(new IOException(new ConcurrentModificationException()));
                }
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class d implements e0.e {
        private d() {
        }

        @Override // s8.e0.e
        public void b() {
            synchronized (i0.f26678a) {
                synchronized (i0.f26679b) {
                    if (i0.f26680c) {
                        return;
                    }
                    long e10 = i0.e();
                    synchronized (i0.f26679b) {
                        long unused = i0.f26681d = e10;
                        boolean unused2 = i0.f26680c = true;
                    }
                }
            }
        }

        @Override // s8.e0.e
        public void c() {
        }
    }

    static /* synthetic */ long e() {
        return l();
    }

    private static void g(byte b10, byte b11, int i10, long j10) {
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

    public static long h() {
        long j10;
        synchronized (f26679b) {
            j10 = f26680c ? f26681d : -9223372036854775807L;
        }
        return j10;
    }

    public static String i() {
        String str;
        synchronized (f26679b) {
            str = f26682e;
        }
        return str;
    }

    public static void j(s8.e0 e0Var, b bVar) {
        if (k()) {
            if (bVar != null) {
                bVar.a();
            }
        } else {
            if (e0Var == null) {
                e0Var = new s8.e0("SntpClient");
            }
            e0Var.n(new d(), new c(bVar), 1);
        }
    }

    public static boolean k() {
        boolean z10;
        synchronized (f26679b) {
            z10 = f26680c;
        }
        return z10;
    }

    private static long l() {
        InetAddress byName = InetAddress.getByName(i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(ModuleDescriptor.MODULE_VERSION);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o(bArr, 40, currentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j10 = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            byte b10 = bArr[0];
            int i10 = bArr[1] & 255;
            long n10 = n(bArr, 24);
            long n11 = n(bArr, 32);
            long n12 = n(bArr, 40);
            g((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), i10, n12);
            long j11 = (j10 + (((n11 - n10) + (n12 - j10)) / 2)) - elapsedRealtime2;
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

    private static long m(byte[] bArr, int i10) {
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

    private static long n(byte[] bArr, int i10) {
        long m10 = m(bArr, i10);
        long m11 = m(bArr, i10 + 4);
        if (m10 == 0 && m11 == 0) {
            return 0L;
        }
        return ((m10 - 2208988800L) * 1000) + ((m11 * 1000) / 4294967296L);
    }

    private static void o(byte[] bArr, int i10, long j10) {
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
