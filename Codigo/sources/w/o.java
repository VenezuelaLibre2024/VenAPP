package w;

import androidx.lifecycle.LiveData;

/* loaded from: classes.dex */
public interface o {
    int a();

    boolean d();

    LiveData<Integer> g();

    default int getLensFacing() {
        return -1;
    }

    int i(int i10);

    LiveData<k1> j();
}
