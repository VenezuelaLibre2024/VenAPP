package l2;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase f20854a;

    public k(WorkDatabase workDatabase) {
        kotlin.jvm.internal.n.e(workDatabase, "workDatabase");
        this.f20854a = workDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer d(k this$0) {
        int d10;
        kotlin.jvm.internal.n.e(this$0, "this$0");
        d10 = l.d(this$0.f20854a, "next_alarm_manager_id");
        return Integer.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer f(k this$0, int i10, int i11) {
        int d10;
        kotlin.jvm.internal.n.e(this$0, "this$0");
        d10 = l.d(this$0.f20854a, "next_job_scheduler_id");
        boolean z10 = false;
        if (i10 <= d10 && d10 <= i11) {
            z10 = true;
        }
        if (z10) {
            i10 = d10;
        } else {
            l.e(this$0.f20854a, "next_job_scheduler_id", i10 + 1);
        }
        return Integer.valueOf(i10);
    }

    public final int c() {
        Object A = this.f20854a.A(new Callable() { // from class: l2.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer d10;
                d10 = k.d(k.this);
                return d10;
            }
        });
        kotlin.jvm.internal.n.d(A, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) A).intValue();
    }

    public final int e(final int i10, final int i11) {
        Object A = this.f20854a.A(new Callable() { // from class: l2.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer f10;
                f10 = k.f(k.this, i10, i11);
                return f10;
            }
        });
        kotlin.jvm.internal.n.d(A, "workDatabase.runInTransa…            id\n        })");
        return ((Number) A).intValue();
    }
}
