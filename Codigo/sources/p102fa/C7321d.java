package p102fa;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC5105e;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.internal.AbstractC5188w;
import com.google.android.gms.common.api.internal.InterfaceC5173r;
import com.google.android.gms.common.internal.C5288w;
import com.google.android.gms.common.internal.C5297z;
import com.google.android.gms.common.internal.InterfaceC5294y;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: fa.d */
/* loaded from: classes.dex */
public final class C7321d extends AbstractC5105e implements InterfaceC5294y {

    /* renamed from: a */
    private static final C5101a.g f16483a;

    /* renamed from: b */
    private static final C5101a.a f16484b;

    /* renamed from: c */
    private static final C5101a f16485c;

    /* renamed from: d */
    public static final /* synthetic */ int f16486d = 0;

    static {
        C5101a.g gVar = new C5101a.g();
        f16483a = gVar;
        C7320c c7320c = new C7320c();
        f16484b = c7320c;
        f16485c = new C5101a("ClientTelemetry.API", c7320c, gVar);
    }

    public C7321d(Context context, C5297z c5297z) {
        super(context, (C5101a<C5297z>) f16485c, c5297z, AbstractC5105e.a.f10417c);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC5294y
    /* renamed from: a */
    public final Task<Void> mo13365a(final C5288w c5288w) {
        AbstractC5188w.a m13190a = AbstractC5188w.m13190a();
        m13190a.m13198d(zaf.zaa);
        m13190a.m13197c(false);
        m13190a.m13196b(new InterfaceC5173r() { // from class: fa.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC5173r
            public final void accept(Object obj, Object obj2) {
                C5288w c5288w2 = C5288w.this;
                int i10 = C7321d.f16486d;
                ((C7318a) ((C7322e) obj).getService()).m21948f2(c5288w2);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        });
        return doBestEffortWrite(m13190a.m13195a());
    }
}
