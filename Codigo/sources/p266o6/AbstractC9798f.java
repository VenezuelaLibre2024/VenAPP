package p266o6;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p098f6.EnumC7300d;
import p266o6.C9795c;
import p327r6.InterfaceC10625a;

/* renamed from: o6.f */
/* loaded from: classes.dex */
public abstract class AbstractC9798f {

    /* renamed from: o6.f$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private InterfaceC10625a f24187a;

        /* renamed from: b */
        private Map<EnumC7300d, b> f24188b = new HashMap();

        /* renamed from: a */
        public a m29449a(EnumC7300d enumC7300d, b bVar) {
            this.f24188b.put(enumC7300d, bVar);
            return this;
        }

        /* renamed from: b */
        public AbstractC9798f m29450b() {
            if (this.f24187a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f24188b.keySet().size() < EnumC7300d.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<EnumC7300d, b> map = this.f24188b;
            this.f24188b = new HashMap();
            return AbstractC9798f.m29443d(this.f24187a, map);
        }

        /* renamed from: c */
        public a m29451c(InterfaceC10625a interfaceC10625a) {
            this.f24187a = interfaceC10625a;
            return this;
        }
    }

    /* renamed from: o6.f$b */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: o6.f$b$a */
        /* loaded from: classes.dex */
        public static abstract class a {
            /* renamed from: a */
            public abstract b mo29433a();

            /* renamed from: b */
            public abstract a mo29434b(long j10);

            /* renamed from: c */
            public abstract a mo29435c(Set<c> set);

            /* renamed from: d */
            public abstract a mo29436d(long j10);
        }

        /* renamed from: a */
        public static a m29452a() {
            return new C9795c.b().mo29435c(Collections.emptySet());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract long mo29430b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Set<c> mo29431c();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract long mo29432d();
    }

    /* renamed from: o6.f$c */
    /* loaded from: classes.dex */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    private long m29441a(int i10, long j10) {
        return (long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * r7)));
    }

    /* renamed from: b */
    public static a m29442b() {
        return new a();
    }

    /* renamed from: d */
    static AbstractC9798f m29443d(InterfaceC10625a interfaceC10625a, Map<EnumC7300d, b> map) {
        return new C9794b(interfaceC10625a, map);
    }

    /* renamed from: f */
    public static AbstractC9798f m29444f(InterfaceC10625a interfaceC10625a) {
        return m29442b().m29449a(EnumC7300d.DEFAULT, b.m29452a().mo29434b(30000L).mo29436d(86400000L).mo29433a()).m29449a(EnumC7300d.HIGHEST, b.m29452a().mo29434b(1000L).mo29436d(86400000L).mo29433a()).m29449a(EnumC7300d.VERY_LOW, b.m29452a().mo29434b(86400000L).mo29436d(86400000L).mo29435c(m29445i(c.DEVICE_IDLE)).mo29433a()).m29451c(interfaceC10625a).m29450b();
    }

    /* renamed from: i */
    private static <T> Set<T> m29445i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* renamed from: j */
    private void m29446j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    /* renamed from: c */
    public JobInfo.Builder m29447c(JobInfo.Builder builder, EnumC7300d enumC7300d, long j10, int i10) {
        builder.setMinimumLatency(m29448g(enumC7300d, j10, i10));
        m29446j(builder, mo29429h().get(enumC7300d).mo29431c());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract InterfaceC10625a mo29428e();

    /* renamed from: g */
    public long m29448g(EnumC7300d enumC7300d, long j10, int i10) {
        long mo32385a = j10 - mo29428e().mo32385a();
        b bVar = mo29429h().get(enumC7300d);
        return Math.min(Math.max(m29441a(i10, bVar.mo29430b()), mo32385a), bVar.mo29432d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Map<EnumC7300d, b> mo29429h();
}
