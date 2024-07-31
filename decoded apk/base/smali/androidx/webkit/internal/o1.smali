.class public Landroidx/webkit/internal/o1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/chromium/support_lib_boundary/WebViewRendererClientBoundaryInterface;


# static fields
.field private static final c:[Ljava/lang/String;


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Le2/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/webkit/internal/o1;->c:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Le2/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/webkit/internal/o1;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Landroidx/webkit/internal/o1;->b:Le2/v;

    return-void
.end method


# virtual methods
.method public final getSupportedFeatures()[Ljava/lang/String;
    .locals 1

    sget-object v0, Landroidx/webkit/internal/o1;->c:[Ljava/lang/String;

    return-object v0
.end method

.method public final onRendererResponsive(Landroid/webkit/WebView;Ljava/lang/reflect/InvocationHandler;)V
    .locals 3

    invoke-static {p2}, Landroidx/webkit/internal/q1;->c(Ljava/lang/reflect/InvocationHandler;)Landroidx/webkit/internal/q1;

    move-result-object p2

    iget-object v0, p0, Landroidx/webkit/internal/o1;->b:Le2/v;

    iget-object v1, p0, Landroidx/webkit/internal/o1;->a:Ljava/util/concurrent/Executor;

    if-nez v1, :cond_0

    invoke-virtual {v0, p1, p2}, Le2/v;->onRenderProcessResponsive(Landroid/webkit/WebView;Le2/u;)V

    goto :goto_0

    :cond_0
    new-instance v2, Landroidx/webkit/internal/o1$b;

    invoke-direct {v2, p0, v0, p1, p2}, Landroidx/webkit/internal/o1$b;-><init>(Landroidx/webkit/internal/o1;Le2/v;Landroid/webkit/WebView;Le2/u;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final onRendererUnresponsive(Landroid/webkit/WebView;Ljava/lang/reflect/InvocationHandler;)V
    .locals 3

    invoke-static {p2}, Landroidx/webkit/internal/q1;->c(Ljava/lang/reflect/InvocationHandler;)Landroidx/webkit/internal/q1;

    move-result-object p2

    iget-object v0, p0, Landroidx/webkit/internal/o1;->b:Le2/v;

    iget-object v1, p0, Landroidx/webkit/internal/o1;->a:Ljava/util/concurrent/Executor;

    if-nez v1, :cond_0

    invoke-virtual {v0, p1, p2}, Le2/v;->onRenderProcessUnresponsive(Landroid/webkit/WebView;Le2/u;)V

    goto :goto_0

    :cond_0
    new-instance v2, Landroidx/webkit/internal/o1$a;

    invoke-direct {v2, p0, v0, p1, p2}, Landroidx/webkit/internal/o1$a;-><init>(Landroidx/webkit/internal/o1;Le2/v;Landroid/webkit/WebView;Le2/u;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method
