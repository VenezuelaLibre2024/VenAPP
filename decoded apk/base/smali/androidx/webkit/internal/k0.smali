.class public Landroidx/webkit/internal/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/webkit/WebSettings;)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Landroidx/webkit/internal/j0;->a(Landroid/webkit/WebSettings;)I

    move-result p0

    return p0
.end method

.method public static b(Landroid/webkit/WebView;)Landroid/webkit/WebViewRenderProcess;
    .locals 0

    invoke-static {p0}, Landroidx/webkit/internal/e0;->a(Landroid/webkit/WebView;)Landroid/webkit/WebViewRenderProcess;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/webkit/WebView;)Landroid/webkit/WebViewRenderProcessClient;
    .locals 0

    invoke-static {p0}, Landroidx/webkit/internal/i0;->a(Landroid/webkit/WebView;)Landroid/webkit/WebViewRenderProcessClient;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/webkit/WebSettings;I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Landroidx/webkit/internal/f0;->a(Landroid/webkit/WebSettings;I)V

    return-void
.end method

.method public static e(Landroid/webkit/WebView;Le2/v;)V
    .locals 1

    if-eqz p1, :cond_0

    new-instance v0, Landroidx/webkit/internal/p1;

    invoke-direct {v0, p1}, Landroidx/webkit/internal/p1;-><init>(Le2/v;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p0, v0}, Landroidx/webkit/internal/g0;->a(Landroid/webkit/WebView;Landroid/webkit/WebViewRenderProcessClient;)V

    return-void
.end method

.method public static f(Landroid/webkit/WebView;Ljava/util/concurrent/Executor;Le2/v;)V
    .locals 1

    if-eqz p2, :cond_0

    new-instance v0, Landroidx/webkit/internal/p1;

    invoke-direct {v0, p2}, Landroidx/webkit/internal/p1;-><init>(Le2/v;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p0, p1, v0}, Landroidx/webkit/internal/d0;->a(Landroid/webkit/WebView;Ljava/util/concurrent/Executor;Landroid/webkit/WebViewRenderProcessClient;)V

    return-void
.end method

.method public static g(Landroid/webkit/WebViewRenderProcess;)Z
    .locals 0

    invoke-static {p0}, Landroidx/webkit/internal/h0;->a(Landroid/webkit/WebViewRenderProcess;)Z

    move-result p0

    return p0
.end method
