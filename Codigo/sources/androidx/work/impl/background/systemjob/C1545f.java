package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import java.util.Iterator;
import p094f2.AbstractC7277j;
import p094f2.C7269b;
import p094f2.EnumC7268a;
import p094f2.EnumC7278k;
import p192k2.C9132u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.work.impl.background.systemjob.f */
/* loaded from: classes.dex */
public class C1545f {

    /* renamed from: b */
    private static final String f6640b = AbstractC7277j.m21769i("SystemJobInfoConverter");

    /* renamed from: a */
    private final ComponentName f6641a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.background.systemjob.f$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6642a;

        static {
            int[] iArr = new int[EnumC7278k.values().length];
            f6642a = iArr;
            try {
                iArr[EnumC7278k.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6642a[EnumC7278k.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6642a[EnumC7278k.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6642a[EnumC7278k.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6642a[EnumC7278k.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1545f(Context context) {
        this.f6641a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    /* renamed from: b */
    private static JobInfo.TriggerContentUri m8654b(C7269b.c cVar) {
        return new JobInfo.TriggerContentUri(cVar.m21753a(), cVar.m21754b() ? 1 : 0);
    }

    /* renamed from: c */
    static int m8655c(EnumC7278k enumC7278k) {
        int i10 = a.f6642a[enumC7278k.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5 && Build.VERSION.SDK_INT >= 26) {
            return 4;
        }
        AbstractC7277j.m21767e().mo21770a(f6640b, "API version too low. Cannot convert network type value " + enumC7278k);
        return 1;
    }

    /* renamed from: d */
    static void m8656d(JobInfo.Builder builder, EnumC7278k enumC7278k) {
        if (Build.VERSION.SDK_INT < 30 || enumC7278k != EnumC7278k.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(m8655c(enumC7278k));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public JobInfo m8657a(C9132u c9132u, int i10) {
        C7269b c7269b = c9132u.f22014j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", c9132u.f22005a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", c9132u.m26895f());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", c9132u.m26899j());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f6641a).setRequiresCharging(c7269b.m21747g()).setRequiresDeviceIdle(c7269b.m21748h()).setExtras(persistableBundle);
        m8656d(extras, c7269b.m21744d());
        if (!c7269b.m21748h()) {
            extras.setBackoffCriteria(c9132u.f22017m, c9132u.f22016l == EnumC7268a.LINEAR ? 0 : 1);
        }
        long max = Math.max(c9132u.m26893c() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28 || max > 0) {
            extras.setMinimumLatency(max);
        } else if (!c9132u.f22021q) {
            extras.setImportantWhileForeground(true);
        }
        if (c7269b.m21745e()) {
            Iterator<C7269b.c> it = c7269b.m21743c().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(m8654b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(c7269b.m21742b());
            extras.setTriggerContentMaxDelay(c7269b.m21741a());
        }
        extras.setPersisted(false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            extras.setRequiresBatteryNotLow(c7269b.m21746f());
            extras.setRequiresStorageNotLow(c7269b.m21749i());
        }
        boolean z10 = c9132u.f22015k > 0;
        boolean z11 = max > 0;
        if (i11 >= 31 && c9132u.f22021q && !z10 && !z11) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
