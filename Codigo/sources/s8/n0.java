package s8;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class n0 extends f {

    /* renamed from: e, reason: collision with root package name */
    private final int f25309e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f25310f;

    /* renamed from: g, reason: collision with root package name */
    private final DatagramPacket f25311g;

    /* renamed from: h, reason: collision with root package name */
    private Uri f25312h;

    /* renamed from: i, reason: collision with root package name */
    private DatagramSocket f25313i;

    /* renamed from: j, reason: collision with root package name */
    private MulticastSocket f25314j;

    /* renamed from: k, reason: collision with root package name */
    private InetAddress f25315k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f25316l;

    /* renamed from: m, reason: collision with root package name */
    private int f25317m;

    /* loaded from: classes.dex */
    public static final class a extends k {
        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public n0() {
        this(AdError.SERVER_ERROR_CODE);
    }

    public n0(int i10) {
        this(i10, 8000);
    }

    public n0(int i10, int i11) {
        super(true);
        this.f25309e = i11;
        byte[] bArr = new byte[i10];
        this.f25310f = bArr;
        this.f25311g = new DatagramPacket(bArr, 0, i10);
    }

    public int c() {
        DatagramSocket datagramSocket = this.f25313i;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // s8.j
    public void close() {
        this.f25312h = null;
        MulticastSocket multicastSocket = this.f25314j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) t8.a.e(this.f25315k));
            } catch (IOException unused) {
            }
            this.f25314j = null;
        }
        DatagramSocket datagramSocket = this.f25313i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f25313i = null;
        }
        this.f25315k = null;
        this.f25317m = 0;
        if (this.f25316l) {
            this.f25316l = false;
            s();
        }
    }

    @Override // s8.j
    public Uri getUri() {
        return this.f25312h;
    }

    @Override // s8.j
    public long o(n nVar) {
        Uri uri = nVar.f25288a;
        this.f25312h = uri;
        String str = (String) t8.a.e(uri.getHost());
        int port = this.f25312h.getPort();
        t(nVar);
        try {
            this.f25315k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f25315k, port);
            if (this.f25315k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f25314j = multicastSocket;
                multicastSocket.joinGroup(this.f25315k);
                this.f25313i = this.f25314j;
            } else {
                this.f25313i = new DatagramSocket(inetSocketAddress);
            }
            this.f25313i.setSoTimeout(this.f25309e);
            this.f25316l = true;
            u(nVar);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, AdError.INTERNAL_ERROR_CODE);
        } catch (SecurityException e11) {
            throw new a(e11, AdError.INTERNAL_ERROR_2006);
        }
    }

    @Override // s8.h
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f25317m == 0) {
            try {
                ((DatagramSocket) t8.a.e(this.f25313i)).receive(this.f25311g);
                int length = this.f25311g.getLength();
                this.f25317m = length;
                r(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, AdError.CACHE_ERROR_CODE);
            } catch (IOException e11) {
                throw new a(e11, AdError.INTERNAL_ERROR_CODE);
            }
        }
        int length2 = this.f25311g.getLength();
        int i12 = this.f25317m;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f25310f, length2 - i12, bArr, i10, min);
        this.f25317m -= min;
        return min;
    }
}
