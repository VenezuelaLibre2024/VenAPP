package io.flutter.plugins.sharedpreferences;

import java.util.List;

/* loaded from: classes3.dex */
public interface SharedPreferencesListEncoder {
    List<String> decode(String str);

    String encode(List<String> list);
}
