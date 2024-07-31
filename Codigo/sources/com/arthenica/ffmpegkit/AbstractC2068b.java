package com.arthenica.ffmpegkit;

import android.util.Log;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;
import p372u2.C11302a;

/* renamed from: com.arthenica.ffmpegkit.b */
/* loaded from: classes.dex */
public abstract class AbstractC2068b implements InterfaceC2092x {

    /* renamed from: n */
    protected static final AtomicLong f8192n = new AtomicLong(1);

    /* renamed from: b */
    protected final InterfaceC2083o f8194b;

    /* renamed from: f */
    protected final String[] f8198f;

    /* renamed from: m */
    protected final EnumC2084p f8205m;

    /* renamed from: a */
    protected final long f8193a = f8192n.getAndIncrement();

    /* renamed from: c */
    protected final Date f8195c = new Date();

    /* renamed from: d */
    protected Date f8196d = null;

    /* renamed from: e */
    protected Date f8197e = null;

    /* renamed from: g */
    protected final List<C2082n> f8199g = new LinkedList();

    /* renamed from: h */
    protected final Object f8200h = new Object();

    /* renamed from: i */
    protected Future<?> f8201i = null;

    /* renamed from: j */
    protected EnumC2093y f8202j = EnumC2093y.CREATED;

    /* renamed from: k */
    protected C2091w f8203k = null;

    /* renamed from: l */
    protected String f8204l = null;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2068b(String[] strArr, InterfaceC2083o interfaceC2083o, EnumC2084p enumC2084p) {
        this.f8194b = interfaceC2083o;
        this.f8198f = strArr;
        this.f8205m = enumC2084p;
        FFmpegKitConfig.m10438b(this);
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: a */
    public String mo10479a(int i10) {
        m10499x(i10);
        if (mo10480b()) {
            Log.i("ffmpeg-kit", String.format("getAllLogsAsString was called to return all logs but there are still logs being transmitted for session id %d.", Long.valueOf(this.f8193a)));
        }
        return m10496u();
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: b */
    public boolean mo10480b() {
        return FFmpegKitConfig.messagesInTransmit(this.f8193a) != 0;
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: c */
    public List<C2082n> mo10481c(int i10) {
        m10499x(i10);
        if (mo10480b()) {
            Log.i("ffmpeg-kit", String.format("getAllLogs was called to return all logs but there are still logs being transmitted for session id %d.", Long.valueOf(this.f8193a)));
        }
        return mo10490m();
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: d */
    public EnumC2084p mo10482d() {
        return this.f8205m;
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: e */
    public InterfaceC2083o mo10483e() {
        return this.f8194b;
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: f */
    public long mo10484f() {
        return this.f8193a;
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    public long getDuration() {
        Date date = this.f8196d;
        Date date2 = this.f8197e;
        if (date == null || date2 == null) {
            return 0L;
        }
        return date2.getTime() - date.getTime();
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    public EnumC2093y getState() {
        return this.f8202j;
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: h */
    public Date mo10485h() {
        return this.f8196d;
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: i */
    public String mo10486i() {
        return FFmpegKitConfig.m10439c(this.f8198f);
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: j */
    public Date mo10487j() {
        return this.f8195c;
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: k */
    public String mo10488k() {
        return this.f8204l;
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: l */
    public Date mo10489l() {
        return this.f8197e;
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: m */
    public List<C2082n> mo10490m() {
        LinkedList linkedList;
        synchronized (this.f8200h) {
            linkedList = new LinkedList(this.f8199g);
        }
        return linkedList;
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: o */
    public void mo10491o(C2082n c2082n) {
        synchronized (this.f8200h) {
            this.f8199g.add(c2082n);
        }
    }

    @Override // com.arthenica.ffmpegkit.InterfaceC2092x
    /* renamed from: q */
    public C2091w mo10492q() {
        return this.f8203k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m10493r(C2091w c2091w) {
        this.f8203k = c2091w;
        this.f8202j = EnumC2093y.COMPLETED;
        this.f8197e = new Date();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m10494s(Exception exc) {
        this.f8204l = C11302a.m35304a(exc);
        this.f8202j = EnumC2093y.FAILED;
        this.f8197e = new Date();
    }

    /* renamed from: t */
    public String[] m10495t() {
        return this.f8198f;
    }

    /* renamed from: u */
    public String m10496u() {
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.f8200h) {
            Iterator<C2082n> it = this.f8199g.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().m10523b());
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m10497v(Future<?> future) {
        this.f8201i = future;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m10498w() {
        this.f8202j = EnumC2093y.RUNNING;
        this.f8196d = new Date();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public void m10499x(int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        while (mo10480b() && System.currentTimeMillis() < i10 + currentTimeMillis) {
            synchronized (this) {
                try {
                    wait(100L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }
}
