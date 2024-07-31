package p170j2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.C9322n;
import p094f2.AbstractC7277j;
import p230m2.InterfaceC9536b;

/* renamed from: j2.a */
/* loaded from: classes.dex */
public final class C8940a extends AbstractC8944e<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8940a(Context context, InterfaceC9536b taskExecutor) {
        super(context, taskExecutor);
        C9322n.m27781e(context, "context");
        C9322n.m27781e(taskExecutor, "taskExecutor");
    }

    /* renamed from: m */
    private final boolean m26150m(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // p170j2.AbstractC8944e
    /* renamed from: j */
    public IntentFilter mo26152j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x002c. Please report as an issue. */
    @Override // p170j2.AbstractC8944e
    /* renamed from: k */
    public void mo26153k(Intent intent) {
        String str;
        Boolean bool;
        C9322n.m27781e(intent, "intent");
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        AbstractC7277j m21767e = AbstractC7277j.m21767e();
        str = C8941b.f21274a;
        m21767e.mo21770a(str, "Received " + action);
        switch (action.hashCode()) {
            case -1886648615:
                if (!action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    return;
                }
                bool = Boolean.FALSE;
                m26166g(bool);
                return;
            case -54942926:
                if (!action.equals("android.os.action.DISCHARGING")) {
                    return;
                }
                bool = Boolean.FALSE;
                m26166g(bool);
                return;
            case 948344062:
                if (!action.equals("android.os.action.CHARGING")) {
                    return;
                }
                bool = Boolean.TRUE;
                m26166g(bool);
                return;
            case 1019184907:
                if (!action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    return;
                }
                bool = Boolean.TRUE;
                m26166g(bool);
                return;
            default:
                return;
        }
    }

    @Override // p170j2.AbstractC8947h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean mo26151e() {
        String str;
        Intent registerReceiver = m26164d().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(m26150m(registerReceiver));
        }
        AbstractC7277j m21767e = AbstractC7277j.m21767e();
        str = C8941b.f21274a;
        m21767e.mo21772c(str, "getInitialState - null intent received");
        return Boolean.FALSE;
    }
}
