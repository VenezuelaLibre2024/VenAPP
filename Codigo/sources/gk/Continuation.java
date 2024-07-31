package gk;

/* loaded from: classes3.dex */
public interface Continuation<T> {
    f getContext();

    void resumeWith(Object obj);
}
