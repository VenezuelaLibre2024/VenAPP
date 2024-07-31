package kd;

import jd.d;
import kd.b;

/* loaded from: classes.dex */
public interface b<T extends b<T>> {
    <U> T registerEncoder(Class<U> cls, d<? super U> dVar);
}
