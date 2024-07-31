package vf;

import androidx.lifecycle.f;
import androidx.lifecycle.j;
import androidx.lifecycle.t;
import com.google.android.gms.common.api.g;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes2.dex */
public interface a extends Closeable, j, g {
    Task<List<xf.a>> W(ag.a aVar);

    @t(f.a.ON_DESTROY)
    void close();
}
