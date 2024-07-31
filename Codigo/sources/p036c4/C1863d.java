package p036c4;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: c4.d */
/* loaded from: classes.dex */
public final class C1863d extends InputStream {

    /* renamed from: c */
    private static final Queue<C1863d> f7786c = C1871l.m9957f(0);

    /* renamed from: a */
    private InputStream f7787a;

    /* renamed from: b */
    private IOException f7788b;

    C1863d() {
    }

    /* renamed from: b */
    public static C1863d m9926b(InputStream inputStream) {
        C1863d poll;
        Queue<C1863d> queue = f7786c;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new C1863d();
        }
        poll.m9929f(inputStream);
        return poll;
    }

    /* renamed from: a */
    public IOException m9927a() {
        return this.f7788b;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f7787a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f7787a.close();
    }

    /* renamed from: e */
    public void m9928e() {
        this.f7788b = null;
        this.f7787a = null;
        Queue<C1863d> queue = f7786c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    /* renamed from: f */
    void m9929f(InputStream inputStream) {
        this.f7787a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f7787a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f7787a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f7787a.read();
        } catch (IOException e10) {
            this.f7788b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f7787a.read(bArr);
        } catch (IOException e10) {
            this.f7788b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f7787a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f7788b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f7787a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        try {
            return this.f7787a.skip(j10);
        } catch (IOException e10) {
            this.f7788b = e10;
            throw e10;
        }
    }
}
