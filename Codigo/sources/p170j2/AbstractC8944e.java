package p170j2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.C9322n;
import p094f2.AbstractC7277j;
import p230m2.InterfaceC9536b;

/* renamed from: j2.e */
/* loaded from: classes.dex */
public abstract class AbstractC8944e<T> extends AbstractC8947h<T> {

    /* renamed from: f */
    private final BroadcastReceiver f21276f;

    /* renamed from: j2.e$a */
    /* loaded from: classes.dex */
    public static final class a extends BroadcastReceiver {

        /* renamed from: a */
        final /* synthetic */ AbstractC8944e<T> f21277a;

        a(AbstractC8944e<T> abstractC8944e) {
            this.f21277a = abstractC8944e;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C9322n.m27781e(context, "context");
            C9322n.m27781e(intent, "intent");
            this.f21277a.mo26153k(intent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8944e(Context context, InterfaceC9536b taskExecutor) {
        super(context, taskExecutor);
        C9322n.m27781e(context, "context");
        C9322n.m27781e(taskExecutor, "taskExecutor");
        this.f21276f = new a(this);
    }

    @Override // p170j2.AbstractC8947h
    /* renamed from: h */
    public void mo26158h() {
        String str;
        AbstractC7277j m21767e = AbstractC7277j.m21767e();
        str = C8945f.f21278a;
        m21767e.mo21770a(str, getClass().getSimpleName() + ": registering receiver");
        m26164d().registerReceiver(this.f21276f, mo26152j());
    }

    @Override // p170j2.AbstractC8947h
    /* renamed from: i */
    public void mo26159i() {
        String str;
        AbstractC7277j m21767e = AbstractC7277j.m21767e();
        str = C8945f.f21278a;
        m21767e.mo21770a(str, getClass().getSimpleName() + ": unregistering receiver");
        m26164d().unregisterReceiver(this.f21276f);
    }

    /* renamed from: j */
    public abstract IntentFilter mo26152j();

    /* renamed from: k */
    public abstract void mo26153k(Intent intent);
}
