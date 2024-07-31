package j2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class c extends e<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, m2.b taskExecutor) {
        super(context, taskExecutor);
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(taskExecutor, "taskExecutor");
    }

    @Override // j2.e
    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // j2.e
    public void k(Intent intent) {
        String str;
        Boolean bool;
        kotlin.jvm.internal.n.e(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        f2.j e10 = f2.j.e();
        str = d.f19524a;
        e10.a(str, "Received " + intent.getAction());
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
            g(bool);
        }
    }

    @Override // j2.h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean e() {
        String str;
        Intent registerReceiver = d().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            f2.j e10 = f2.j.e();
            str = d.f19524a;
            e10.c(str, "getInitialState - null intent received");
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
