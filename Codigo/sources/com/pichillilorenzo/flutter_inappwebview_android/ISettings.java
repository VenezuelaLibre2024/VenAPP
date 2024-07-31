package com.pichillilorenzo.flutter_inappwebview_android;

import java.util.Map;

/* loaded from: classes3.dex */
public interface ISettings<T> {
    Map<String, Object> getRealSettings(T t10);

    ISettings<T> parse(Map<String, Object> map);

    Map<String, Object> toMap();
}
