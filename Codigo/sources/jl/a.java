package jl;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final a f19989a = new a();

    private a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
