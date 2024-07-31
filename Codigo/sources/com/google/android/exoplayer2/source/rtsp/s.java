package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.source.rtsp.s;
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
import s8.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s implements Closeable {

    /* renamed from: r, reason: collision with root package name */
    public static final Charset f8421r = eb.e.f14596c;

    /* renamed from: a, reason: collision with root package name */
    private final d f8422a;

    /* renamed from: b, reason: collision with root package name */
    private final s8.e0 f8423b = new s8.e0("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* renamed from: c, reason: collision with root package name */
    private final Map<Integer, b> f8424c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d, reason: collision with root package name */
    private g f8425d;

    /* renamed from: e, reason: collision with root package name */
    private Socket f8426e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f8427f;

    /* loaded from: classes.dex */
    public interface b {
        void h(byte[] bArr);
    }

    /* loaded from: classes.dex */
    private final class c implements e0.b<f> {
        private c() {
        }

        @Override // s8.e0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void i(f fVar, long j10, long j11, boolean z10) {
        }

        @Override // s8.e0.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void m(f fVar, long j10, long j11) {
        }

        @Override // s8.e0.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e0.c h(f fVar, long j10, long j11, IOException iOException, int i10) {
            if (!s.this.f8427f) {
                s.this.f8422a.a(iOException);
            }
            return s8.e0.f25220f;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        default void a(Exception exc) {
        }

        default void b(List<String> list, Exception exc) {
        }

        void c(List<String> list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f8429a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private int f8430b = 1;

        /* renamed from: c, reason: collision with root package name */
        private long f8431c;

        private com.google.common.collect.w<String> a(byte[] bArr) {
            t8.a.g(this.f8430b == 3);
            if (bArr.length <= 0 || bArr[bArr.length - 1] != 10) {
                throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
            }
            this.f8429a.add((bArr.length <= 1 || bArr[bArr.length + (-2)] != 13) ? new String(bArr, 0, bArr.length - 1, s.f8421r) : new String(bArr, 0, bArr.length - 2, s.f8421r));
            com.google.common.collect.w<String> r10 = com.google.common.collect.w.r(this.f8429a);
            e();
            return r10;
        }

        private com.google.common.collect.w<String> b(byte[] bArr) {
            t8.a.a(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
            String str = new String(bArr, 0, bArr.length - 2, s.f8421r);
            this.f8429a.add(str);
            int i10 = this.f8430b;
            if (i10 == 1) {
                if (!u.e(str)) {
                    return null;
                }
                this.f8430b = 2;
                return null;
            }
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            long f10 = u.f(str);
            if (f10 != -1) {
                this.f8431c = f10;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.f8431c > 0) {
                this.f8430b = 3;
                return null;
            }
            com.google.common.collect.w<String> r10 = com.google.common.collect.w.r(this.f8429a);
            e();
            return r10;
        }

        private static byte[] d(byte b10, DataInputStream dataInputStream) {
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

        private void e() {
            this.f8429a.clear();
            this.f8430b = 1;
            this.f8431c = 0L;
        }

        public com.google.common.collect.w<String> c(byte b10, DataInputStream dataInputStream) {
            com.google.common.collect.w<String> b11 = b(d(b10, dataInputStream));
            while (b11 == null) {
                if (this.f8430b == 3) {
                    long j10 = this.f8431c;
                    if (j10 <= 0) {
                        throw new IllegalStateException("Expects a greater than zero Content-Length.");
                    }
                    int d10 = hb.e.d(j10);
                    t8.a.g(d10 != -1);
                    byte[] bArr = new byte[d10];
                    dataInputStream.readFully(bArr, 0, d10);
                    b11 = a(bArr);
                } else {
                    b11 = b(d(dataInputStream.readByte(), dataInputStream));
                }
            }
            return b11;
        }
    }

    /* loaded from: classes.dex */
    private final class f implements e0.e {

        /* renamed from: a, reason: collision with root package name */
        private final DataInputStream f8432a;

        /* renamed from: b, reason: collision with root package name */
        private final e f8433b = new e();

        /* renamed from: c, reason: collision with root package name */
        private volatile boolean f8434c;

        public f(InputStream inputStream) {
            this.f8432a = new DataInputStream(inputStream);
        }

        private void a() {
            int readUnsignedByte = this.f8432a.readUnsignedByte();
            int readUnsignedShort = this.f8432a.readUnsignedShort();
            byte[] bArr = new byte[readUnsignedShort];
            this.f8432a.readFully(bArr, 0, readUnsignedShort);
            b bVar = (b) s.this.f8424c.get(Integer.valueOf(readUnsignedByte));
            if (bVar == null || s.this.f8427f) {
                return;
            }
            bVar.h(bArr);
        }

        private void d(byte b10) {
            if (s.this.f8427f) {
                return;
            }
            s.this.f8422a.c(this.f8433b.c(b10, this.f8432a));
        }

        @Override // s8.e0.e
        public void b() {
            while (!this.f8434c) {
                byte readByte = this.f8432a.readByte();
                if (readByte == 36) {
                    a();
                } else {
                    d(readByte);
                }
            }
        }

        @Override // s8.e0.e
        public void c() {
            this.f8434c = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class g implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final OutputStream f8436a;

        /* renamed from: b, reason: collision with root package name */
        private final HandlerThread f8437b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f8438c;

        public g(OutputStream outputStream) {
            this.f8436a = outputStream;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
            this.f8437b = handlerThread;
            handlerThread.start();
            this.f8438c = new Handler(handlerThread.getLooper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(byte[] bArr, List list) {
            try {
                this.f8436a.write(bArr);
            } catch (Exception e10) {
                if (s.this.f8427f) {
                    return;
                }
                s.this.f8422a.b(list, e10);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Handler handler = this.f8438c;
            final HandlerThread handlerThread = this.f8437b;
            Objects.requireNonNull(handlerThread);
            handler.post(new Runnable() { // from class: c8.c
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quit();
                }
            });
            try {
                this.f8437b.join();
            } catch (InterruptedException unused) {
                this.f8437b.interrupt();
            }
        }

        public void e(final List<String> list) {
            final byte[] a10 = u.a(list);
            this.f8438c.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.t
                @Override // java.lang.Runnable
                public final void run() {
                    s.g.this.b(a10, list);
                }
            });
        }
    }

    public s(d dVar) {
        this.f8422a = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f8427f) {
            return;
        }
        try {
            g gVar = this.f8425d;
            if (gVar != null) {
                gVar.close();
            }
            this.f8423b.l();
            Socket socket = this.f8426e;
            if (socket != null) {
                socket.close();
            }
        } finally {
            this.f8427f = true;
        }
    }

    public void f(Socket socket) {
        this.f8426e = socket;
        this.f8425d = new g(socket.getOutputStream());
        this.f8423b.n(new f(socket.getInputStream()), new c(), 0);
    }

    public void g(int i10, b bVar) {
        this.f8424c.put(Integer.valueOf(i10), bVar);
    }

    public void i(List<String> list) {
        t8.a.i(this.f8425d);
        this.f8425d.e(list);
    }
}
