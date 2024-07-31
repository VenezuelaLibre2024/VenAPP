package qd;

import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public interface t {

    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN_DISMISS_TYPE,
        AUTO,
        CLICK,
        SWIPE
    }

    /* loaded from: classes.dex */
    public enum b {
        UNSPECIFIED_RENDER_ERROR,
        IMAGE_FETCH_ERROR,
        IMAGE_DISPLAY_ERROR,
        IMAGE_UNSUPPORTED_FORMAT
    }

    Task<Void> a(de.a aVar);

    Task<Void> b(a aVar);

    Task<Void> c(b bVar);

    Task<Void> d();
}
