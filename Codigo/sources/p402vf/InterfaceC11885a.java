package p402vf;

import ag.C0113a;
import androidx.lifecycle.AbstractC1300f;
import androidx.lifecycle.InterfaceC1308j;
import androidx.lifecycle.InterfaceC1322t;
import com.google.android.gms.common.api.InterfaceC5107g;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.util.List;
import p445xf.C12482a;

/* renamed from: vf.a */
/* loaded from: classes2.dex */
public interface InterfaceC11885a extends Closeable, InterfaceC1308j, InterfaceC5107g {
    /* renamed from: W */
    Task<List<C12482a>> mo18348W(C0113a c0113a);

    @InterfaceC1322t(AbstractC1300f.a.ON_DESTROY)
    void close();
}
