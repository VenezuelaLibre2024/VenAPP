package p211l2;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C9322n;

/* renamed from: l2.k */
/* loaded from: classes.dex */
public final class C9359k {

    /* renamed from: a */
    private final WorkDatabase f22676a;

    public C9359k(WorkDatabase workDatabase) {
        C9322n.m27781e(workDatabase, "workDatabase");
        this.f22676a = workDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final Integer m27863d(C9359k this$0) {
        int m27870d;
        C9322n.m27781e(this$0, "this$0");
        m27870d = C9360l.m27870d(this$0.f22676a, "next_alarm_manager_id");
        return Integer.valueOf(m27870d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final Integer m27864f(C9359k this$0, int i10, int i11) {
        int m27870d;
        C9322n.m27781e(this$0, "this$0");
        m27870d = C9360l.m27870d(this$0.f22676a, "next_job_scheduler_id");
        boolean z10 = false;
        if (i10 <= m27870d && m27870d <= i11) {
            z10 = true;
        }
        if (z10) {
            i10 = m27870d;
        } else {
            C9360l.m27871e(this$0.f22676a, "next_job_scheduler_id", i10 + 1);
        }
        return Integer.valueOf(i10);
    }

    /* renamed from: c */
    public final int m27865c() {
        Object m32249A = this.f22676a.m32249A(new Callable() { // from class: l2.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer m27863d;
                m27863d = C9359k.m27863d(C9359k.this);
                return m27863d;
            }
        });
        C9322n.m27780d(m32249A, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) m32249A).intValue();
    }

    /* renamed from: e */
    public final int m27866e(final int i10, final int i11) {
        Object m32249A = this.f22676a.m32249A(new Callable() { // from class: l2.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer m27864f;
                m27864f = C9359k.m27864f(C9359k.this, i10, i11);
                return m27864f;
            }
        });
        C9322n.m27780d(m32249A, "workDatabase.runInTransa…            id\n        })");
        return ((Number) m32249A).intValue();
    }
}
