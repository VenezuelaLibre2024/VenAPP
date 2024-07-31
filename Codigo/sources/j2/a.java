package j2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class a extends e<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, m2.b taskExecutor) {
        super(context, taskExecutor);
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(taskExecutor, "taskExecutor");
    }

    private final boolean m(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // j2.e
    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x002c. Please report as an issue. */
    @Override // j2.e
    public void k(Intent intent) {
        String str;
        Boolean bool;
        kotlin.jvm.internal.n.e(intent, "intent");
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        f2.j e10 = f2.j.e();
        str = b.f19523a;
        e10.a(str, "Received " + action);
        switch (action.hashCode()) {
            case -1886648615:
                if (!action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    return;
                }
                bool = Boolean.FALSE;
                g(bool);
                return;
            case -54942926:
                if (!action.equals("android.os.action.DISCHARGING")) {
                    return;
                }
                bool = Boolean.FALSE;
                g(bool);
                return;
            case 948344062:
                if (!action.equals("android.os.action.CHARGING")) {
                    return;
                }
                bool = Boolean.TRUE;
                g(bool);
                return;
            case 1019184907:
                if (!action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    return;
                }
                bool = Boolean.TRUE;
                g(bool);
                return;
            default:
                return;
        }
    }

    @Override // j2.h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean e() {
        String str;
        Intent registerReceiver = d().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(m(registerReceiver));
        }
        f2.j e10 = f2.j.e();
        str = b.f19523a;
        e10.c(str, "getInitialState - null intent received");
        return Boolean.FALSE;
    }
}
