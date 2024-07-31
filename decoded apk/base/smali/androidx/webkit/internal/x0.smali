.class public Landroidx/webkit/internal/x0;
.super Le2/i;
.source "SourceFile"


# instance fields
.field private a:Landroid/webkit/ServiceWorkerController;

.field private b:Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

.field private final c:Le2/j;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Le2/i;-><init>()V

    sget-object v0, Landroidx/webkit/internal/j1;->k:Landroidx/webkit/internal/a$c;

    invoke-virtual {v0}, Landroidx/webkit/internal/a$c;->c()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {}, Landroidx/webkit/internal/d;->g()Landroid/webkit/ServiceWorkerController;

    move-result-object v0

    iput-object v0, p0, Landroidx/webkit/internal/x0;->a:Landroid/webkit/ServiceWorkerController;

    iput-object v2, p0, Landroidx/webkit/internal/x0;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    invoke-direct {p0}, Landroidx/webkit/internal/x0;->e()Landroid/webkit/ServiceWorkerController;

    move-result-object v0

    invoke-static {v0}, Landroidx/webkit/internal/d;->i(Landroid/webkit/ServiceWorkerController;)Landroidx/webkit/internal/y0;

    move-result-object v0

    iput-object v0, p0, Landroidx/webkit/internal/x0;->c:Le2/j;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/webkit/internal/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iput-object v2, p0, Landroidx/webkit/internal/x0;->a:Landroid/webkit/ServiceWorkerController;

    invoke-static {}, Landroidx/webkit/internal/k1;->d()Landroidx/webkit/internal/m1;

    move-result-object v0

    invoke-interface {v0}, Landroidx/webkit/internal/m1;->getServiceWorkerController()Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    move-result-object v0

    iput-object v0, p0, Landroidx/webkit/internal/x0;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    new-instance v1, Landroidx/webkit/internal/y0;

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;->getServiceWorkerWebSettings()Ljava/lang/reflect/InvocationHandler;

    move-result-object v0

    invoke-direct {v1, v0}, Landroidx/webkit/internal/y0;-><init>(Ljava/lang/reflect/InvocationHandler;)V

    iput-object v1, p0, Landroidx/webkit/internal/x0;->c:Le2/j;

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Landroidx/webkit/internal/j1;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method private d()Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;
    .locals 1

    iget-object v0, p0, Landroidx/webkit/internal/x0;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/webkit/internal/k1;->d()Landroidx/webkit/internal/m1;

    move-result-object v0

    invoke-interface {v0}, Landroidx/webkit/internal/m1;->getServiceWorkerController()Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    move-result-object v0

    iput-object v0, p0, Landroidx/webkit/internal/x0;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    :cond_0
    iget-object v0, p0, Landroidx/webkit/internal/x0;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    return-object v0
.end method

.method private e()Landroid/webkit/ServiceWorkerController;
    .locals 1

    iget-object v0, p0, Landroidx/webkit/internal/x0;->a:Landroid/webkit/ServiceWorkerController;

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/webkit/internal/d;->g()Landroid/webkit/ServiceWorkerController;

    move-result-object v0

    iput-object v0, p0, Landroidx/webkit/internal/x0;->a:Landroid/webkit/ServiceWorkerController;

    :cond_0
    iget-object v0, p0, Landroidx/webkit/internal/x0;->a:Landroid/webkit/ServiceWorkerController;

    return-object v0
.end method


# virtual methods
.method public b()Le2/j;
    .locals 1

    iget-object v0, p0, Landroidx/webkit/internal/x0;->c:Le2/j;

    return-object v0
.end method

.method public c(Le2/h;)V
    .locals 3

    sget-object v0, Landroidx/webkit/internal/j1;->k:Landroidx/webkit/internal/a$c;

    invoke-virtual {v0}, Landroidx/webkit/internal/a$c;->c()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    if-nez p1, :cond_0

    invoke-direct {p0}, Landroidx/webkit/internal/x0;->e()Landroid/webkit/ServiceWorkerController;

    move-result-object p1

    invoke-static {p1, v2}, Landroidx/webkit/internal/d;->p(Landroid/webkit/ServiceWorkerController;Landroid/webkit/ServiceWorkerClient;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Landroidx/webkit/internal/x0;->e()Landroid/webkit/ServiceWorkerController;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/webkit/internal/d;->q(Landroid/webkit/ServiceWorkerController;Le2/h;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroidx/webkit/internal/a;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    if-nez p1, :cond_2

    invoke-direct {p0}, Landroidx/webkit/internal/x0;->d()Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    move-result-object p1

    invoke-interface {p1, v2}, Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;->setServiceWorkerClient(Ljava/lang/reflect/InvocationHandler;)V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Landroidx/webkit/internal/x0;->d()Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    move-result-object v0

    new-instance v1, Landroidx/webkit/internal/w0;

    invoke-direct {v1, p1}, Landroidx/webkit/internal/w0;-><init>(Le2/h;)V

    invoke-static {v1}, Lhm/a;->c(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;->setServiceWorkerClient(Ljava/lang/reflect/InvocationHandler;)V

    :goto_0
    return-void

    :cond_3
    invoke-static {}, Landroidx/webkit/internal/j1;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p1

    throw p1
.end method
