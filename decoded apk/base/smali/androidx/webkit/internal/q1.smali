.class public Landroidx/webkit/internal/q1;
.super Le2/u;
.source "SourceFile"


# static fields
.field private static final c:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/webkit/WebViewRenderProcess;",
            "Landroidx/webkit/internal/q1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lorg/chromium/support_lib_boundary/WebViewRendererBoundaryInterface;

.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/webkit/WebViewRenderProcess;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Landroidx/webkit/internal/q1;->c:Ljava/util/WeakHashMap;

    return-void
.end method

.method public constructor <init>(Landroid/webkit/WebViewRenderProcess;)V
    .locals 1

    invoke-direct {p0}, Le2/u;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/webkit/internal/q1;->b:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public constructor <init>(Lorg/chromium/support_lib_boundary/WebViewRendererBoundaryInterface;)V
    .locals 0

    invoke-direct {p0}, Le2/u;-><init>()V

    iput-object p1, p0, Landroidx/webkit/internal/q1;->a:Lorg/chromium/support_lib_boundary/WebViewRendererBoundaryInterface;

    return-void
.end method

.method public static b(Landroid/webkit/WebViewRenderProcess;)Landroidx/webkit/internal/q1;
    .locals 2

    sget-object v0, Landroidx/webkit/internal/q1;->c:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/webkit/internal/q1;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    new-instance v1, Landroidx/webkit/internal/q1;

    invoke-direct {v1, p0}, Landroidx/webkit/internal/q1;-><init>(Landroid/webkit/WebViewRenderProcess;)V

    invoke-virtual {v0, p0, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method public static c(Ljava/lang/reflect/InvocationHandler;)Landroidx/webkit/internal/q1;
    .locals 1

    const-class v0, Lorg/chromium/support_lib_boundary/WebViewRendererBoundaryInterface;

    invoke-static {v0, p0}, Lhm/a;->a(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/chromium/support_lib_boundary/WebViewRendererBoundaryInterface;

    new-instance v0, Landroidx/webkit/internal/q1$a;

    invoke-direct {v0, p0}, Landroidx/webkit/internal/q1$a;-><init>(Lorg/chromium/support_lib_boundary/WebViewRendererBoundaryInterface;)V

    invoke-interface {p0, v0}, Lorg/chromium/support_lib_boundary/IsomorphicObjectBoundaryInterface;->getOrCreatePeer(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/webkit/internal/q1;

    return-object p0
.end method


# virtual methods
.method public a()Z
    .locals 2

    sget-object v0, Landroidx/webkit/internal/j1;->K:Landroidx/webkit/internal/a$h;

    invoke-virtual {v0}, Landroidx/webkit/internal/a$h;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Landroidx/webkit/internal/q1;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebViewRenderProcess;

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroidx/webkit/internal/k0;->g(Landroid/webkit/WebViewRenderProcess;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    invoke-virtual {v0}, Landroidx/webkit/internal/a;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/webkit/internal/q1;->a:Lorg/chromium/support_lib_boundary/WebViewRendererBoundaryInterface;

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/WebViewRendererBoundaryInterface;->terminate()Z

    move-result v0

    return v0

    :cond_2
    invoke-static {}, Landroidx/webkit/internal/j1;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method
