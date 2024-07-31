.class public Landroidx/webkit/internal/p1;
.super Landroid/webkit/WebViewRenderProcessClient;
.source "SourceFile"


# instance fields
.field private a:Le2/v;


# direct methods
.method public constructor <init>(Le2/v;)V
    .locals 0

    invoke-direct {p0}, Landroid/webkit/WebViewRenderProcessClient;-><init>()V

    iput-object p1, p0, Landroidx/webkit/internal/p1;->a:Le2/v;

    return-void
.end method


# virtual methods
.method public onRenderProcessResponsive(Landroid/webkit/WebView;Landroid/webkit/WebViewRenderProcess;)V
    .locals 1

    iget-object v0, p0, Landroidx/webkit/internal/p1;->a:Le2/v;

    invoke-static {p2}, Landroidx/webkit/internal/q1;->b(Landroid/webkit/WebViewRenderProcess;)Landroidx/webkit/internal/q1;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Le2/v;->onRenderProcessResponsive(Landroid/webkit/WebView;Le2/u;)V

    return-void
.end method

.method public onRenderProcessUnresponsive(Landroid/webkit/WebView;Landroid/webkit/WebViewRenderProcess;)V
    .locals 1

    iget-object v0, p0, Landroidx/webkit/internal/p1;->a:Le2/v;

    invoke-static {p2}, Landroidx/webkit/internal/q1;->b(Landroid/webkit/WebViewRenderProcess;)Landroidx/webkit/internal/q1;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Le2/v;->onRenderProcessUnresponsive(Landroid/webkit/WebView;Le2/u;)V

    return-void
.end method
