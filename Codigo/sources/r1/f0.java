package r1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f24576a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<Runnable> f24577b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f24578c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f24579d;

    public f0(Executor executor) {
        kotlin.jvm.internal.n.e(executor, "executor");
        this.f24576a = executor;
        this.f24577b = new ArrayDeque<>();
        this.f24579d = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Runnable command, f0 this$0) {
        kotlin.jvm.internal.n.e(command, "$command");
        kotlin.jvm.internal.n.e(this$0, "this$0");
        try {
            command.run();
        } finally {
            this$0.c();
        }
    }

    public final void c() {
        synchronized (this.f24579d) {
            Runnable poll = this.f24577b.poll();
            Runnable runnable = poll;
            this.f24578c = runnable;
            if (poll != null) {
                this.f24576a.execute(runnable);
            }
            ck.v vVar = ck.v.f7137a;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable command) {
        kotlin.jvm.internal.n.e(command, "command");
        synchronized (this.f24579d) {
            this.f24577b.offer(new Runnable() { // from class: r1.e0
                @Override // java.lang.Runnable
                public final void run() {
                    f0.b(command, this);
                }
            });
            if (this.f24578c == null) {
                c();
            }
            ck.v vVar = ck.v.f7137a;
        }
    }
}
