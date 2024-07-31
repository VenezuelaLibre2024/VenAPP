.class public Landroidx/webkit/internal/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Landroid/webkit/TracingController;
    .locals 1

    invoke-static {}, Landroidx/webkit/internal/s;->a()Landroid/webkit/TracingController;

    move-result-object v0

    return-object v0
.end method

.method public static b()Ljava/lang/ClassLoader;
    .locals 1

    invoke-static {}, Landroidx/webkit/internal/z;->a()Ljava/lang/ClassLoader;

    move-result-object v0

    return-object v0
.end method

.method public static c(Landroid/webkit/WebView;)Landroid/os/Looper;
    .locals 0

    invoke-static {p0}, Landroidx/webkit/internal/r;->a(Landroid/webkit/WebView;)Landroid/os/Looper;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/webkit/TracingController;)Z
    .locals 0

    invoke-static {p0}, Landroidx/webkit/internal/y;->a(Landroid/webkit/TracingController;)Z

    move-result p0

    return p0
.end method

.method public static e(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Landroidx/webkit/internal/b0;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static f(Landroid/webkit/TracingController;Le2/k;)V
    .locals 4

    new-instance v0, Landroid/webkit/TracingConfig$Builder;

    invoke-direct {v0}, Landroid/webkit/TracingConfig$Builder;-><init>()V

    const/4 v1, 0x1

    new-array v1, v1, [I

    invoke-virtual {p1}, Le2/k;->b()I

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    invoke-static {v0, v1}, Landroidx/webkit/internal/t;->a(Landroid/webkit/TracingConfig$Builder;[I)Landroid/webkit/TracingConfig$Builder;

    move-result-object v0

    invoke-virtual {p1}, Le2/k;->a()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/webkit/internal/u;->a(Landroid/webkit/TracingConfig$Builder;Ljava/util/Collection;)Landroid/webkit/TracingConfig$Builder;

    move-result-object v0

    invoke-virtual {p1}, Le2/k;->c()I

    move-result p1

    invoke-static {v0, p1}, Landroidx/webkit/internal/v;->a(Landroid/webkit/TracingConfig$Builder;I)Landroid/webkit/TracingConfig$Builder;

    move-result-object p1

    invoke-static {p1}, Landroidx/webkit/internal/w;->a(Landroid/webkit/TracingConfig$Builder;)Landroid/webkit/TracingConfig;

    move-result-object p1

    invoke-static {p0, p1}, Landroidx/webkit/internal/x;->a(Landroid/webkit/TracingController;Landroid/webkit/TracingConfig;)V

    return-void
.end method

.method public static g(Landroid/webkit/TracingController;Ljava/io/OutputStream;Ljava/util/concurrent/Executor;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/webkit/internal/a0;->a(Landroid/webkit/TracingController;Ljava/io/OutputStream;Ljava/util/concurrent/Executor;)Z

    move-result p0

    return p0
.end method
