package p170j2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.C9322n;
import p094f2.AbstractC7277j;
import p230m2.InterfaceC9536b;

/* renamed from: j2.l */
/* loaded from: classes.dex */
public final class C8951l extends AbstractC8944e<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8951l(Context context, InterfaceC9536b taskExecutor) {
        super(context, taskExecutor);
        C9322n.m27781e(context, "context");
        C9322n.m27781e(taskExecutor, "taskExecutor");
    }

    @Override // p170j2.AbstractC8944e
    /* renamed from: j */
    public IntentFilter mo26152j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
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
        str = C8952m.f21291a;
        m21767e.mo21770a(str, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    return;
                } else {
                    bool = Boolean.TRUE;
                }
            } else if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                return;
            } else {
                bool = Boolean.FALSE;
            }
            m26166g(bool);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L18;
     */
    @Override // p170j2.AbstractC8947h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Boolean mo26151e() {
        /*
            r5 = this;
            android.content.Context r0 = r5.m26164d()
            r1 = 0
            android.content.IntentFilter r2 = r5.mo26152j()
            android.content.Intent r0 = r0.registerReceiver(r1, r2)
            r1 = 1
            if (r0 == 0) goto L3d
            java.lang.String r2 = r0.getAction()
            if (r2 != 0) goto L17
            goto L3d
        L17:
            java.lang.String r0 = r0.getAction()
            r2 = 0
            if (r0 == 0) goto L3c
            int r3 = r0.hashCode()
            r4 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r3 == r4) goto L36
            r4 = -730838620(0xffffffffd47049a4, float:-4.1281105E12)
            if (r3 == r4) goto L2d
            goto L3c
        L2d:
            java.lang.String r3 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L3d
            goto L3c
        L36:
            java.lang.String r1 = "android.intent.action.DEVICE_STORAGE_LOW"
            boolean r0 = r0.equals(r1)
        L3c:
            r1 = r2
        L3d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p170j2.C8951l.mo26151e():java.lang.Boolean");
    }
}
