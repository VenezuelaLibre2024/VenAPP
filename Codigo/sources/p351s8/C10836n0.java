package p351s8;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import p363t8.C11137a;

/* renamed from: s8.n0 */
/* loaded from: classes.dex */
public final class C10836n0 extends AbstractC10819f {

    /* renamed from: e */
    private final int f27428e;

    /* renamed from: f */
    private final byte[] f27429f;

    /* renamed from: g */
    private final DatagramPacket f27430g;

    /* renamed from: h */
    private Uri f27431h;

    /* renamed from: i */
    private DatagramSocket f27432i;

    /* renamed from: j */
    private MulticastSocket f27433j;

    /* renamed from: k */
    private InetAddress f27434k;

    /* renamed from: l */
    private boolean f27435l;

    /* renamed from: m */
    private int f27436m;

    /* renamed from: s8.n0$a */
    /* loaded from: classes.dex */
    public static final class a extends C10829k {
        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public C10836n0() {
        this(AdError.SERVER_ERROR_CODE);
    }

    public C10836n0(int i10) {
        this(i10, 8000);
    }

    public C10836n0(int i10, int i11) {
        super(true);
        this.f27428e = i11;
        byte[] bArr = new byte[i10];
        this.f27429f = bArr;
        this.f27430g = new DatagramPacket(bArr, 0, i10);
    }

    /* renamed from: c */
    public int m33040c() {
        DatagramSocket datagramSocket = this.f27432i;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // p351s8.InterfaceC10827j
    public void close() {
        this.f27431h = null;
        MulticastSocket multicastSocket = this.f27433j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) C11137a.m34603e(this.f27434k));
            } catch (IOException unused) {
            }
            this.f27433j = null;
        }
        DatagramSocket datagramSocket = this.f27432i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f27432i = null;
        }
        this.f27434k = null;
        this.f27436m = 0;
        if (this.f27435l) {
            this.f27435l = false;
            m32995s();
        }
    }

    @Override // p351s8.InterfaceC10827j
    public Uri getUri() {
        return this.f27431h;
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: o */
    public long mo162o(C10835n c10835n) {
        Uri uri = c10835n.f27407a;
        this.f27431h = uri;
        String str = (String) C11137a.m34603e(uri.getHost());
        int port = this.f27431h.getPort();
        m32996t(c10835n);
        try {
            this.f27434k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f27434k, port);
            if (this.f27434k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f27433j = multicastSocket;
                multicastSocket.joinGroup(this.f27434k);
                this.f27432i = this.f27433j;
            } else {
                this.f27432i = new DatagramSocket(inetSocketAddress);
            }
            this.f27432i.setSoTimeout(this.f27428e);
            this.f27435l = true;
            m32997u(c10835n);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, AdError.INTERNAL_ERROR_CODE);
        } catch (SecurityException e11) {
            throw new a(e11, AdError.INTERNAL_ERROR_2006);
        }
    }

    @Override // p351s8.InterfaceC10823h
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f27436m == 0) {
            try {
                ((DatagramSocket) C11137a.m34603e(this.f27432i)).receive(this.f27430g);
                int length = this.f27430g.getLength();
                this.f27436m = length;
                m32994r(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, AdError.CACHE_ERROR_CODE);
            } catch (IOException e11) {
                throw new a(e11, AdError.INTERNAL_ERROR_CODE);
            }
        }
        int length2 = this.f27430g.getLength();
        int i12 = this.f27436m;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f27429f, length2 - i12, bArr, i10, min);
        this.f27436m -= min;
        return min;
    }
}
