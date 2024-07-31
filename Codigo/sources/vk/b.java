package vk;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface b<R> extends a {
    R call(Object... objArr);

    R callBy(Map<Object, ? extends Object> map);

    List<Object> getParameters();

    i getReturnType();

    List<Object> getTypeParameters();

    j getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
