package p170j2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.C9322n;
import p094f2.AbstractC7277j;
import p230m2.InterfaceC9536b;

/* renamed from: j2.c */
/* loaded from: classes.dex */
public final class C8942c extends AbstractC8944e<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8942c(Context context, InterfaceC9536b taskExecutor) {
        super(context, taskExecutor);
        C9322n.m27781e(context, "context");
        C9322n.m27781e(taskExecutor, "taskExecutor");
    }

    @Override // p170j2.AbstractC8944e
    /* renamed from: j */
    public IntentFilter mo26152j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // p170j2.AbstractC8944e
    /* renamed from: k */
    public void mo26153k(Intent intent) {
        String str;
        Boolean bool;
        C9322n.m27781e(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        AbstractC7277j m21767e = AbstractC7277j.m21767e();
        str = C8943d.f21275a;
        m21767e.mo21770a(str, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1980154005) {
                if (hashCode != 490310653 || !action.equals("android.intent.action.BATTERY_LOW")) {
                    return;
                } else {
                    bool = Boolean.FALSE;
                }
            } else if (!action.equals("android.intent.action.BATTERY_OKAY")) {
                return;
            } else {
                bool = Boolean.TRUE;
            }
            m26166g(bool);
        }
    }

    @Override // p170j2.AbstractC8947h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean mo26151e() {
        String str;
        Intent registerReceiver = m26164d().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            AbstractC7277j m21767e = AbstractC7277j.m21767e();
            str = C8943d.f21275a;
            m21767e.mo21772c(str, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
        boolean z10 = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
