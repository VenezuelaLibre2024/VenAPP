package p322r1;

import ck.C2037v;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C9322n;

/* renamed from: r1.f0 */
/* loaded from: classes.dex */
public final class ExecutorC10589f0 implements Executor {

    /* renamed from: a */
    private final Executor f26690a;

    /* renamed from: b */
    private final ArrayDeque<Runnable> f26691b;

    /* renamed from: c */
    private Runnable f26692c;

    /* renamed from: d */
    private final Object f26693d;

    public ExecutorC10589f0(Executor executor) {
        C9322n.m27781e(executor, "executor");
        this.f26690a = executor;
        this.f26691b = new ArrayDeque<>();
        this.f26693d = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m32179b(Runnable command, ExecutorC10589f0 this$0) {
        C9322n.m27781e(command, "$command");
        C9322n.m27781e(this$0, "this$0");
        try {
            command.run();
        } finally {
            this$0.m32180c();
        }
    }

    /* renamed from: c */
    public final void m32180c() {
        synchronized (this.f26693d) {
            Runnable poll = this.f26691b.poll();
            Runnable runnable = poll;
            this.f26692c = runnable;
            if (poll != null) {
                this.f26690a.execute(runnable);
            }
            C2037v c2037v = C2037v.f8089a;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable command) {
        C9322n.m27781e(command, "command");
        synchronized (this.f26693d) {
            this.f26691b.offer(new Runnable() { // from class: r1.e0
                @Override // java.lang.Runnable
                public final void run() {
                    ExecutorC10589f0.m32179b(command, this);
                }
            });
            if (this.f26692c == null) {
                m32180c();
            }
            C2037v c2037v = C2037v.f8089a;
        }
    }
}
