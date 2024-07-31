package c4;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* loaded from: classes.dex */
public final class d extends InputStream {

    /* renamed from: c, reason: collision with root package name */
    private static final Queue<d> f6837c = l.f(0);

    /* renamed from: a, reason: collision with root package name */
    private InputStream f6838a;

    /* renamed from: b, reason: collision with root package name */
    private IOException f6839b;

    d() {
    }

    public static d b(InputStream inputStream) {
        d poll;
        Queue<d> queue = f6837c;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new d();
        }
        poll.f(inputStream);
        return poll;
    }

    public IOException a() {
        return this.f6839b;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f6838a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f6838a.close();
    }

    public void e() {
        this.f6839b = null;
        this.f6838a = null;
        Queue<d> queue = f6837c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    void f(InputStream inputStream) {
        this.f6838a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f6838a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f6838a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f6838a.read();
        } catch (IOException e10) {
            this.f6839b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f6838a.read(bArr);
        } catch (IOException e10) {
            this.f6839b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f6838a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f6839b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f6838a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        try {
            return this.f6838a.skip(j10);
        } catch (IOException e10) {
            this.f6839b = e10;
            throw e10;
        }
    }
}
