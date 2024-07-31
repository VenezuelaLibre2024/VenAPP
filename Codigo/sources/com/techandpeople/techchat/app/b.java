package com.techandpeople.techchat.app;

import io.flutter.plugin.common.PluginRegistry;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13569a = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final boolean a(PluginRegistry pluginRegistry) {
            String name = b.class.getName();
            if (pluginRegistry.hasPlugin(name)) {
                return true;
            }
            pluginRegistry.registrarFor(name);
            return false;
        }

        public final void b(PluginRegistry registry) {
            n.e(registry, "registry");
            a(registry);
        }
    }
}
