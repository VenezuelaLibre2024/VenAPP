package x0;

import ck.v;
import gk.Continuation;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public interface k<T> {
    Object a(InputStream inputStream, Continuation<? super T> continuation);

    T b();

    Object c(T t10, OutputStream outputStream, Continuation<? super v> continuation);
}
