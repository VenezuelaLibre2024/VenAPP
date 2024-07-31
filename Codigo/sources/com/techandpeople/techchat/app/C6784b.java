package com.techandpeople.techchat.app;

import io.flutter.plugin.common.PluginRegistry;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: com.techandpeople.techchat.app.b */
/* loaded from: classes3.dex */
public final class C6784b {

    /* renamed from: a */
    public static final a f14871a = new a(null);

    /* renamed from: com.techandpeople.techchat.app.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        private final boolean m19549a(PluginRegistry pluginRegistry) {
            String name = C6784b.class.getName();
            if (pluginRegistry.hasPlugin(name)) {
                return true;
            }
            pluginRegistry.registrarFor(name);
            return false;
        }

        /* renamed from: b */
        public final void m19550b(PluginRegistry registry) {
            C9322n.m27781e(registry, "registry");
            m19549a(registry);
        }
    }
}
