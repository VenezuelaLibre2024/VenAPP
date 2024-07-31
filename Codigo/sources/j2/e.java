package j2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public abstract class e<T> extends h<T> {

    /* renamed from: f, reason: collision with root package name */
    private final BroadcastReceiver f19525f;

    /* loaded from: classes.dex */
    public static final class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e<T> f19526a;

        a(e<T> eVar) {
            this.f19526a = eVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            kotlin.jvm.internal.n.e(context, "context");
            kotlin.jvm.internal.n.e(intent, "intent");
            this.f19526a.k(intent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, m2.b taskExecutor) {
        super(context, taskExecutor);
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(taskExecutor, "taskExecutor");
        this.f19525f = new a(this);
    }

    @Override // j2.h
    public void h() {
        String str;
        f2.j e10 = f2.j.e();
        str = f.f19527a;
        e10.a(str, getClass().getSimpleName() + ": registering receiver");
        d().registerReceiver(this.f19525f, j());
    }

    @Override // j2.h
    public void i() {
        String str;
        f2.j e10 = f2.j.e();
        str = f.f19527a;
        e10.a(str, getClass().getSimpleName() + ": unregistering receiver");
        d().unregisterReceiver(this.f19525f);
    }

    public abstract IntentFilter j();

    public abstract void k(Intent intent);
}
