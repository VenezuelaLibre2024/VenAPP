package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.source.rtsp.C4751s;
import com.google.common.collect.AbstractC5907w;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p082eb.C7149e;
import p137hb.C7690e;
import p351s8.C10818e0;
import p363t8.C11137a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.source.rtsp.s */
/* loaded from: classes.dex */
public final class C4751s implements Closeable {

    /* renamed from: r */
    public static final Charset f9476r = C7149e.f16019c;

    /* renamed from: a */
    private final d f9477a;

    /* renamed from: b */
    private final C10818e0 f9478b = new C10818e0("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* renamed from: c */
    private final Map<Integer, b> f9479c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d */
    private g f9480d;

    /* renamed from: e */
    private Socket f9481e;

    /* renamed from: f */
    private volatile boolean f9482f;

    /* renamed from: com.google.android.exoplayer2.source.rtsp.s$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: h */
        void mo12044h(byte[] bArr);
    }

    /* renamed from: com.google.android.exoplayer2.source.rtsp.s$c */
    /* loaded from: classes.dex */
    private final class c implements C10818e0.b<f> {
        private c() {
        }

        @Override // p351s8.C10818e0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo313i(f fVar, long j10, long j11, boolean z10) {
        }

        @Override // p351s8.C10818e0.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo317m(f fVar, long j10, long j11) {
        }

        @Override // p351s8.C10818e0.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C10818e0.c mo311h(f fVar, long j10, long j11, IOException iOException, int i10) {
            if (!C4751s.this.f9482f) {
                C4751s.this.f9477a.m12217a(iOException);
            }
            return C10818e0.f27339f;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.rtsp.s$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        default void m12217a(Exception exc) {
        }

        /* renamed from: b */
        default void m12218b(List<String> list, Exception exc) {
        }

        /* renamed from: c */
        void mo12111c(List<String> list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.source.rtsp.s$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        private final List<String> f9484a = new ArrayList();

        /* renamed from: b */
        private int f9485b = 1;

        /* renamed from: c */
        private long f9486c;

        /* renamed from: a */
        private AbstractC5907w<String> m12219a(byte[] bArr) {
            C11137a.m34605g(this.f9485b == 3);
            if (bArr.length <= 0 || bArr[bArr.length - 1] != 10) {
                throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
            }
            this.f9484a.add((bArr.length <= 1 || bArr[bArr.length + (-2)] != 13) ? new String(bArr, 0, bArr.length - 1, C4751s.f9476r) : new String(bArr, 0, bArr.length - 2, C4751s.f9476r));
            AbstractC5907w<String> m15079r = AbstractC5907w.m15079r(this.f9484a);
            m12222e();
            return m15079r;
        }

        /* renamed from: b */
        private AbstractC5907w<String> m12220b(byte[] bArr) {
            C11137a.m34599a(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
            String str = new String(bArr, 0, bArr.length - 2, C4751s.f9476r);
            this.f9484a.add(str);
            int i10 = this.f9485b;
            if (i10 == 1) {
                if (!C4753u.m12233e(str)) {
                    return null;
                }
                this.f9485b = 2;
                return null;
            }
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            long m12234f = C4753u.m12234f(str);
            if (m12234f != -1) {
                this.f9486c = m12234f;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.f9486c > 0) {
                this.f9485b = 3;
                return null;
            }
            AbstractC5907w<String> m15079r = AbstractC5907w.m15079r(this.f9484a);
            m12222e();
            return m15079r;
        }

        /* renamed from: d */
        private static byte[] m12221d(byte b10, DataInputStream dataInputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = {b10, dataInputStream.readByte()};
            byteArrayOutputStream.write(bArr);
            while (true) {
                if (bArr[0] == 13 && bArr[1] == 10) {
                    return byteArrayOutputStream.toByteArray();
                }
                bArr[0] = bArr[1];
                byte readByte = dataInputStream.readByte();
                bArr[1] = readByte;
                byteArrayOutputStream.write(readByte);
            }
        }

        /* renamed from: e */
        private void m12222e() {
            this.f9484a.clear();
            this.f9485b = 1;
            this.f9486c = 0L;
        }

        /* renamed from: c */
        public AbstractC5907w<String> m12223c(byte b10, DataInputStream dataInputStream) {
            AbstractC5907w<String> m12220b = m12220b(m12221d(b10, dataInputStream));
            while (m12220b == null) {
                if (this.f9485b == 3) {
                    long j10 = this.f9486c;
                    if (j10 <= 0) {
                        throw new IllegalStateException("Expects a greater than zero Content-Length.");
                    }
                    int m23413d = C7690e.m23413d(j10);
                    C11137a.m34605g(m23413d != -1);
                    byte[] bArr = new byte[m23413d];
                    dataInputStream.readFully(bArr, 0, m23413d);
                    m12220b = m12219a(bArr);
                } else {
                    m12220b = m12220b(m12221d(dataInputStream.readByte(), dataInputStream));
                }
            }
            return m12220b;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.rtsp.s$f */
    /* loaded from: classes.dex */
    private final class f implements C10818e0.e {

        /* renamed from: a */
        private final DataInputStream f9487a;

        /* renamed from: b */
        private final e f9488b = new e();

        /* renamed from: c */
        private volatile boolean f9489c;

        public f(InputStream inputStream) {
            this.f9487a = new DataInputStream(inputStream);
        }

        /* renamed from: a */
        private void m12224a() {
            int readUnsignedByte = this.f9487a.readUnsignedByte();
            int readUnsignedShort = this.f9487a.readUnsignedShort();
            byte[] bArr = new byte[readUnsignedShort];
            this.f9487a.readFully(bArr, 0, readUnsignedShort);
            b bVar = (b) C4751s.this.f9479c.get(Integer.valueOf(readUnsignedByte));
            if (bVar == null || C4751s.this.f9482f) {
                return;
            }
            bVar.mo12044h(bArr);
        }

        /* renamed from: d */
        private void m12225d(byte b10) {
            if (C4751s.this.f9482f) {
                return;
            }
            C4751s.this.f9477a.mo12111c(this.f9488b.m12223c(b10, this.f9487a));
        }

        @Override // p351s8.C10818e0.e
        /* renamed from: b */
        public void mo223b() {
            while (!this.f9489c) {
                byte readByte = this.f9487a.readByte();
                if (readByte == 36) {
                    m12224a();
                } else {
                    m12225d(readByte);
                }
            }
        }

        @Override // p351s8.C10818e0.e
        /* renamed from: c */
        public void mo224c() {
            this.f9489c = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.source.rtsp.s$g */
    /* loaded from: classes.dex */
    public final class g implements Closeable {

        /* renamed from: a */
        private final OutputStream f9491a;

        /* renamed from: b */
        private final HandlerThread f9492b;

        /* renamed from: c */
        private final Handler f9493c;

        public g(OutputStream outputStream) {
            this.f9491a = outputStream;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
            this.f9492b = handlerThread;
            handlerThread.start();
            this.f9493c = new Handler(handlerThread.getLooper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m12227b(byte[] bArr, List list) {
            try {
                this.f9491a.write(bArr);
            } catch (Exception e10) {
                if (C4751s.this.f9482f) {
                    return;
                }
                C4751s.this.f9477a.m12218b(list, e10);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Handler handler = this.f9493c;
            final HandlerThread handlerThread = this.f9492b;
            Objects.requireNonNull(handlerThread);
            handler.post(new Runnable() { // from class: c8.c
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quit();
                }
            });
            try {
                this.f9492b.join();
            } catch (InterruptedException unused) {
                this.f9492b.interrupt();
            }
        }

        /* renamed from: e */
        public void m12228e(final List<String> list) {
            final byte[] m12229a = C4753u.m12229a(list);
            this.f9493c.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.t
                @Override // java.lang.Runnable
                public final void run() {
                    C4751s.g.this.m12227b(m12229a, list);
                }
            });
        }
    }

    public C4751s(d dVar) {
        this.f9477a = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f9482f) {
            return;
        }
        try {
            g gVar = this.f9480d;
            if (gVar != null) {
                gVar.close();
            }
            this.f9478b.m32982l();
            Socket socket = this.f9481e;
            if (socket != null) {
                socket.close();
            }
        } finally {
            this.f9482f = true;
        }
    }

    /* renamed from: f */
    public void m12211f(Socket socket) {
        this.f9481e = socket;
        this.f9480d = new g(socket.getOutputStream());
        this.f9478b.m32984n(new f(socket.getInputStream()), new c(), 0);
    }

    /* renamed from: g */
    public void m12212g(int i10, b bVar) {
        this.f9479c.put(Integer.valueOf(i10), bVar);
    }

    /* renamed from: i */
    public void m12213i(List<String> list) {
        C11137a.m34607i(this.f9480d);
        this.f9480d.m12228e(list);
    }
}
