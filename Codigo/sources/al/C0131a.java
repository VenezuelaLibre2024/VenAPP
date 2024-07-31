package al;

import android.os.Looper;
import java.util.List;
import p089el.InterfaceC7246v;
import p494zk.AbstractC13066h2;

/* renamed from: al.a */
/* loaded from: classes3.dex */
public final class C0131a implements InterfaceC7246v {
    @Override // p089el.InterfaceC7246v
    /* renamed from: a */
    public String mo617a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // p089el.InterfaceC7246v
    /* renamed from: b */
    public AbstractC13066h2 mo618b(List<? extends InterfaceC7246v> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C0134d(C0136f.m630a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // p089el.InterfaceC7246v
    /* renamed from: c */
    public int mo619c() {
        return 1073741823;
    }
}
