package fa;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class d extends com.google.android.gms.common.api.e implements y {

    /* renamed from: a, reason: collision with root package name */
    private static final a.g f15060a;

    /* renamed from: b, reason: collision with root package name */
    private static final a.AbstractC0146a f15061b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f15062c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f15063d = 0;

    static {
        a.g gVar = new a.g();
        f15060a = gVar;
        c cVar = new c();
        f15061b = cVar;
        f15062c = new com.google.android.gms.common.api.a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, z zVar) {
        super(context, (com.google.android.gms.common.api.a<z>) f15062c, zVar, e.a.f9309c);
    }

    @Override // com.google.android.gms.common.internal.y
    public final Task<Void> a(final w wVar) {
        w.a a10 = com.google.android.gms.common.api.internal.w.a();
        a10.d(zaf.zaa);
        a10.c(false);
        a10.b(new r() { // from class: fa.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                com.google.android.gms.common.internal.w wVar2 = com.google.android.gms.common.internal.w.this;
                int i10 = d.f15063d;
                ((a) ((e) obj).getService()).f2(wVar2);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        });
        return doBestEffortWrite(a10.a());
    }
}
