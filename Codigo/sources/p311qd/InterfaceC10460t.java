package p311qd;

import com.google.android.gms.tasks.Task;
import de.C6888a;

/* renamed from: qd.t */
/* loaded from: classes.dex */
public interface InterfaceC10460t {

    /* renamed from: qd.t$a */
    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN_DISMISS_TYPE,
        AUTO,
        CLICK,
        SWIPE
    }

    /* renamed from: qd.t$b */
    /* loaded from: classes.dex */
    public enum b {
        UNSPECIFIED_RENDER_ERROR,
        IMAGE_FETCH_ERROR,
        IMAGE_DISPLAY_ERROR,
        IMAGE_UNSUPPORTED_FORMAT
    }

    /* renamed from: a */
    Task<Void> mo31380a(C6888a c6888a);

    /* renamed from: b */
    Task<Void> mo31381b(a aVar);

    /* renamed from: c */
    Task<Void> mo31382c(b bVar);

    /* renamed from: d */
    Task<Void> mo31383d();
}
