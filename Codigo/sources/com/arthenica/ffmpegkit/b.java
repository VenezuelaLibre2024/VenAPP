package com.arthenica.ffmpegkit;

import android.util.Log;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class b implements x {

    /* renamed from: n */
    protected static final AtomicLong f7240n = new AtomicLong(1);

    /* renamed from: b */
    protected final o f7242b;

    /* renamed from: f */
    protected final String[] f7246f;

    /* renamed from: m */
    protected final p f7253m;

    /* renamed from: a */
    protected final long f7241a = f7240n.getAndIncrement();

    /* renamed from: c */
    protected final Date f7243c = new Date();

    /* renamed from: d */
    protected Date f7244d = null;

    /* renamed from: e */
    protected Date f7245e = null;

    /* renamed from: g */
    protected final List<n> f7247g = new LinkedList();

    /* renamed from: h */
    protected final Object f7248h = new Object();

    /* renamed from: i */
    protected Future<?> f7249i = null;

    /* renamed from: j */
    protected y f7250j = y.CREATED;

    /* renamed from: k */
    protected w f7251k = null;

    /* renamed from: l */
    protected String f7252l = null;

    public b(String[] strArr, o oVar, p pVar) {
        this.f7242b = oVar;
        this.f7246f = strArr;
        this.f7253m = pVar;
        FFmpegKitConfig.b(this);
    }

    @Override // com.arthenica.ffmpegkit.x
    public String a(int i10) {
        x(i10);
        if (b()) {
            Log.i("ffmpeg-kit", String.format("getAllLogsAsString was called to return all logs but there are still logs being transmitted for session id %d.", Long.valueOf(this.f7241a)));
        }
        return u();
    }

    @Override // com.arthenica.ffmpegkit.x
    public boolean b() {
        return FFmpegKitConfig.messagesInTransmit(this.f7241a) != 0;
    }

    @Override // com.arthenica.ffmpegkit.x
    public List<n> c(int i10) {
        x(i10);
        if (b()) {
            Log.i("ffmpeg-kit", String.format("getAllLogs was called to return all logs but there are still logs being transmitted for session id %d.", Long.valueOf(this.f7241a)));
        }
        return m();
    }

    @Override // com.arthenica.ffmpegkit.x
    public p d() {
        return this.f7253m;
    }

    @Override // com.arthenica.ffmpegkit.x
    public o e() {
        return this.f7242b;
    }

    @Override // com.arthenica.ffmpegkit.x
    public long f() {
        return this.f7241a;
    }

    @Override // com.arthenica.ffmpegkit.x
    public long getDuration() {
        Date date = this.f7244d;
        Date date2 = this.f7245e;
        if (date == null || date2 == null) {
            return 0L;
        }
        return date2.getTime() - date.getTime();
    }

    @Override // com.arthenica.ffmpegkit.x
    public y getState() {
        return this.f7250j;
    }

    @Override // com.arthenica.ffmpegkit.x
    public Date h() {
        return this.f7244d;
    }

    @Override // com.arthenica.ffmpegkit.x
    public String i() {
        return FFmpegKitConfig.c(this.f7246f);
    }

    @Override // com.arthenica.ffmpegkit.x
    public Date j() {
        return this.f7243c;
    }

    @Override // com.arthenica.ffmpegkit.x
    public String k() {
        return this.f7252l;
    }

    @Override // com.arthenica.ffmpegkit.x
    public Date l() {
        return this.f7245e;
    }

    @Override // com.arthenica.ffmpegkit.x
    public List<n> m() {
        LinkedList linkedList;
        synchronized (this.f7248h) {
            linkedList = new LinkedList(this.f7247g);
        }
        return linkedList;
    }

    @Override // com.arthenica.ffmpegkit.x
    public void o(n nVar) {
        synchronized (this.f7248h) {
            this.f7247g.add(nVar);
        }
    }

    @Override // com.arthenica.ffmpegkit.x
    public w q() {
        return this.f7251k;
    }

    public void r(w wVar) {
        this.f7251k = wVar;
        this.f7250j = y.COMPLETED;
        this.f7245e = new Date();
    }

    public void s(Exception exc) {
        this.f7252l = u2.a.a(exc);
        this.f7250j = y.FAILED;
        this.f7245e = new Date();
    }

    public String[] t() {
        return this.f7246f;
    }

    public String u() {
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.f7248h) {
            Iterator<n> it = this.f7247g.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().b());
            }
        }
        return sb2.toString();
    }

    public void v(Future<?> future) {
        this.f7249i = future;
    }

    public void w() {
        this.f7250j = y.RUNNING;
        this.f7244d = new Date();
    }

    public void x(int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        while (b() && System.currentTimeMillis() < i10 + currentTimeMillis) {
            synchronized (this) {
                try {
                    wait(100L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }
}
