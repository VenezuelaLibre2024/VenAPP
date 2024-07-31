package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import te.e;
import we.k;

/* loaded from: classes.dex */
public class Trace extends com.google.firebase.perf.application.b implements Parcelable, ve.b {

    /* renamed from: a */
    private final WeakReference<ve.b> f12300a;

    /* renamed from: b */
    private final Trace f12301b;

    /* renamed from: c */
    private final GaugeManager f12302c;

    /* renamed from: d */
    private final String f12303d;

    /* renamed from: e */
    private final Map<String, com.google.firebase.perf.metrics.a> f12304e;

    /* renamed from: f */
    private final Map<String, String> f12305f;

    /* renamed from: r */
    private final List<ve.a> f12306r;

    /* renamed from: s */
    private final List<Trace> f12307s;

    /* renamed from: t */
    private final k f12308t;

    /* renamed from: u */
    private final com.google.firebase.perf.util.a f12309u;

    /* renamed from: v */
    private l f12310v;

    /* renamed from: w */
    private l f12311w;

    /* renamed from: x */
    private static final re.a f12297x = re.a.e();

    /* renamed from: y */
    private static final Map<String, Trace> f12298y = new ConcurrentHashMap();

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new a();

    /* renamed from: z */
    static final Parcelable.Creator<Trace> f12299z = new b();

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<Trace> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Trace[] newArray(int i10) {
            return new Trace[i10];
        }
    }

    /* loaded from: classes.dex */
    class b implements Parcelable.Creator<Trace> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Trace[] newArray(int i10) {
            return new Trace[i10];
        }
    }

    private Trace(Parcel parcel, boolean z10) {
        super(z10 ? null : com.google.firebase.perf.application.a.b());
        this.f12300a = new WeakReference<>(this);
        this.f12301b = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f12303d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f12307s = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f12304e = concurrentHashMap;
        this.f12305f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, com.google.firebase.perf.metrics.a.class.getClassLoader());
        this.f12310v = (l) parcel.readParcelable(l.class.getClassLoader());
        this.f12311w = (l) parcel.readParcelable(l.class.getClassLoader());
        List<ve.a> synchronizedList = Collections.synchronizedList(new ArrayList());
        this.f12306r = synchronizedList;
        parcel.readList(synchronizedList, ve.a.class.getClassLoader());
        if (z10) {
            this.f12308t = null;
            this.f12309u = null;
            this.f12302c = null;
        } else {
            this.f12308t = k.k();
            this.f12309u = new com.google.firebase.perf.util.a();
            this.f12302c = GaugeManager.getInstance();
        }
    }

    /* synthetic */ Trace(Parcel parcel, boolean z10, a aVar) {
        this(parcel, z10);
    }

    private Trace(String str) {
        this(str, k.k(), new com.google.firebase.perf.util.a(), com.google.firebase.perf.application.a.b(), GaugeManager.getInstance());
    }

    public Trace(String str, k kVar, com.google.firebase.perf.util.a aVar, com.google.firebase.perf.application.a aVar2) {
        this(str, kVar, aVar, aVar2, GaugeManager.getInstance());
    }

    public Trace(String str, k kVar, com.google.firebase.perf.util.a aVar, com.google.firebase.perf.application.a aVar2, GaugeManager gaugeManager) {
        super(aVar2);
        this.f12300a = new WeakReference<>(this);
        this.f12301b = null;
        this.f12303d = str.trim();
        this.f12307s = new ArrayList();
        this.f12304e = new ConcurrentHashMap();
        this.f12305f = new ConcurrentHashMap();
        this.f12309u = aVar;
        this.f12308t = kVar;
        this.f12306r = Collections.synchronizedList(new ArrayList());
        this.f12302c = gaugeManager;
    }

    private void b(String str, String str2) {
        if (l()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f12303d));
        }
        if (!this.f12305f.containsKey(str) && this.f12305f.size() >= 5) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
        }
        e.d(str, str2);
    }

    public static Trace c(String str) {
        return new Trace(str);
    }

    private com.google.firebase.perf.metrics.a m(String str) {
        com.google.firebase.perf.metrics.a aVar = this.f12304e.get(str);
        if (aVar != null) {
            return aVar;
        }
        com.google.firebase.perf.metrics.a aVar2 = new com.google.firebase.perf.metrics.a(str);
        this.f12304e.put(str, aVar2);
        return aVar2;
    }

    private void n(l lVar) {
        if (this.f12307s.isEmpty()) {
            return;
        }
        Trace trace = this.f12307s.get(this.f12307s.size() - 1);
        if (trace.f12311w == null) {
            trace.f12311w = lVar;
        }
    }

    @Override // ve.b
    public void a(ve.a aVar) {
        if (aVar == null) {
            f12297x.j("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (!j() || l()) {
                return;
            }
            this.f12306r.add(aVar);
        }
    }

    public Map<String, com.google.firebase.perf.metrics.a> d() {
        return this.f12304e;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    public l e() {
        return this.f12311w;
    }

    public String f() {
        return this.f12303d;
    }

    protected void finalize() {
        try {
            if (k()) {
                f12297x.k("Trace '%s' is started but not stopped when it is destructed!", this.f12303d);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    public List<ve.a> g() {
        List<ve.a> unmodifiableList;
        synchronized (this.f12306r) {
            ArrayList arrayList = new ArrayList();
            for (ve.a aVar : this.f12306r) {
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    @Keep
    public String getAttribute(String str) {
        return this.f12305f.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f12305f);
    }

    @Keep
    public long getLongMetric(String str) {
        com.google.firebase.perf.metrics.a aVar = str != null ? this.f12304e.get(str.trim()) : null;
        if (aVar == null) {
            return 0L;
        }
        return aVar.a();
    }

    public l h() {
        return this.f12310v;
    }

    public List<Trace> i() {
        return this.f12307s;
    }

    @Keep
    public void incrementMetric(String str, long j10) {
        String e10 = e.e(str);
        if (e10 != null) {
            f12297x.d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, e10);
            return;
        }
        if (!j()) {
            f12297x.k("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f12303d);
        } else {
            if (l()) {
                f12297x.k("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f12303d);
                return;
            }
            com.google.firebase.perf.metrics.a m10 = m(str.trim());
            m10.c(j10);
            f12297x.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(m10.a()), this.f12303d);
        }
    }

    boolean j() {
        return this.f12310v != null;
    }

    boolean k() {
        return j() && !l();
    }

    boolean l() {
        return this.f12311w != null;
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z10 = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            f12297x.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f12303d);
            z10 = true;
        } catch (Exception e10) {
            f12297x.d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
        }
        if (z10) {
            this.f12305f.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j10) {
        String e10 = e.e(str);
        if (e10 != null) {
            f12297x.d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, e10);
            return;
        }
        if (!j()) {
            f12297x.k("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f12303d);
        } else if (l()) {
            f12297x.k("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f12303d);
        } else {
            m(str.trim()).d(j10);
            f12297x.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j10), this.f12303d);
        }
    }

    @Keep
    public void removeAttribute(String str) {
        if (l()) {
            f12297x.c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f12305f.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!com.google.firebase.perf.config.a.g().K()) {
            f12297x.a("Trace feature is disabled.");
            return;
        }
        String f10 = e.f(this.f12303d);
        if (f10 != null) {
            f12297x.d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f12303d, f10);
            return;
        }
        if (this.f12310v != null) {
            f12297x.d("Trace '%s' has already started, should not start again!", this.f12303d);
            return;
        }
        this.f12310v = this.f12309u.a();
        registerForAppState();
        ve.a perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f12300a);
        a(perfSession);
        if (perfSession.e()) {
            this.f12302c.collectGaugeMetricOnce(perfSession.d());
        }
    }

    @Keep
    public void stop() {
        if (!j()) {
            f12297x.d("Trace '%s' has not been started so unable to stop!", this.f12303d);
            return;
        }
        if (l()) {
            f12297x.d("Trace '%s' has already stopped, should not stop again!", this.f12303d);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f12300a);
        unregisterForAppState();
        l a10 = this.f12309u.a();
        this.f12311w = a10;
        if (this.f12301b == null) {
            n(a10);
            if (this.f12303d.isEmpty()) {
                f12297x.c("Trace name is empty, no log is sent to server");
                return;
            }
            this.f12308t.C(new com.google.firebase.perf.metrics.b(this).a(), getAppState());
            if (SessionManager.getInstance().perfSession().e()) {
                this.f12302c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f12301b, 0);
        parcel.writeString(this.f12303d);
        parcel.writeList(this.f12307s);
        parcel.writeMap(this.f12304e);
        parcel.writeParcelable(this.f12310v, 0);
        parcel.writeParcelable(this.f12311w, 0);
        synchronized (this.f12306r) {
            parcel.writeList(this.f12306r);
        }
    }
}
