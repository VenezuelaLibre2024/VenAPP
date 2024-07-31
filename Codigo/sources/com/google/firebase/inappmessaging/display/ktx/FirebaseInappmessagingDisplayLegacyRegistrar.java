package com.google.firebase.inappmessaging.display.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import dk.q;
import java.util.List;
import pc.c;
import ye.h;

@Keep
/* loaded from: classes.dex */
public final class FirebaseInappmessagingDisplayLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        List<c<?>> e10;
        e10 = q.e(h.b("fire-iamd-ktx", "20.4.0"));
        return e10;
    }
}
