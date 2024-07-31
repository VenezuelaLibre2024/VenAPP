package io.flutter;

import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
import io.flutter.embedding.engine.loader.FlutterLoader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final class FlutterInjector {
    private static boolean accessed;
    private static FlutterInjector instance;
    private DeferredComponentManager deferredComponentManager;
    private ExecutorService executorService;
    private FlutterJNI.Factory flutterJniFactory;
    private FlutterLoader flutterLoader;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private DeferredComponentManager deferredComponentManager;
        private ExecutorService executorService;
        private FlutterJNI.Factory flutterJniFactory;
        private FlutterLoader flutterLoader;

        /* loaded from: classes3.dex */
        public class NamedThreadFactory implements ThreadFactory {
            private int threadId;

            private NamedThreadFactory() {
                this.threadId = 0;
            }

            /* synthetic */ NamedThreadFactory(Builder builder, AnonymousClass1 anonymousClass1) {
                this();
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("flutter-worker-");
                int i10 = this.threadId;
                this.threadId = i10 + 1;
                sb2.append(i10);
                thread.setName(sb2.toString());
                return thread;
            }
        }

        private void fillDefaults() {
            if (this.flutterJniFactory == null) {
                this.flutterJniFactory = new FlutterJNI.Factory();
            }
            if (this.executorService == null) {
                this.executorService = Executors.newCachedThreadPool(new NamedThreadFactory());
            }
            if (this.flutterLoader == null) {
                this.flutterLoader = new FlutterLoader(this.flutterJniFactory.provideFlutterJNI(), this.executorService);
            }
        }

        public FlutterInjector build() {
            fillDefaults();
            return new FlutterInjector(this.flutterLoader, this.deferredComponentManager, this.flutterJniFactory, this.executorService);
        }

        public Builder setDeferredComponentManager(DeferredComponentManager deferredComponentManager) {
            this.deferredComponentManager = deferredComponentManager;
            return this;
        }

        public Builder setExecutorService(ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        public Builder setFlutterJNIFactory(FlutterJNI.Factory factory) {
            this.flutterJniFactory = factory;
            return this;
        }

        public Builder setFlutterLoader(FlutterLoader flutterLoader) {
            this.flutterLoader = flutterLoader;
            return this;
        }
    }

    private FlutterInjector(FlutterLoader flutterLoader, DeferredComponentManager deferredComponentManager, FlutterJNI.Factory factory, ExecutorService executorService) {
        this.flutterLoader = flutterLoader;
        this.deferredComponentManager = deferredComponentManager;
        this.flutterJniFactory = factory;
        this.executorService = executorService;
    }

    /* synthetic */ FlutterInjector(FlutterLoader flutterLoader, DeferredComponentManager deferredComponentManager, FlutterJNI.Factory factory, ExecutorService executorService, AnonymousClass1 anonymousClass1) {
        this(flutterLoader, deferredComponentManager, factory, executorService);
    }

    public static FlutterInjector instance() {
        accessed = true;
        if (instance == null) {
            instance = new Builder().build();
        }
        return instance;
    }

    public static void reset() {
        accessed = false;
        instance = null;
    }

    public static void setInstance(FlutterInjector flutterInjector) {
        if (accessed) {
            throw new IllegalStateException("Cannot change the FlutterInjector instance once it's been read. If you're trying to dependency inject, be sure to do so at the beginning of the program");
        }
        instance = flutterInjector;
    }

    public DeferredComponentManager deferredComponentManager() {
        return this.deferredComponentManager;
    }

    public ExecutorService executorService() {
        return this.executorService;
    }

    public FlutterLoader flutterLoader() {
        return this.flutterLoader;
    }

    public FlutterJNI.Factory getFlutterJNIFactory() {
        return this.flutterJniFactory;
    }
}
