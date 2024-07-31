.class public final Lw/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb0/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/w$a;,
        Lw/w$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb0/j<",
        "Lw/v;",
        ">;"
    }
.end annotation


# static fields
.field static final H:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Landroidx/camera/core/impl/a0$a;",
            ">;"
        }
    .end annotation
.end field

.field static final I:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Landroidx/camera/core/impl/z$a;",
            ">;"
        }
    .end annotation
.end field

.field static final J:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Landroidx/camera/core/impl/l2$c;",
            ">;"
        }
    .end annotation
.end field

.field static final K:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field static final L:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field static final M:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field static final N:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Lw/p;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final G:Landroidx/camera/core/impl/p1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "camerax.core.appConfig.cameraFactoryProvider"

    const-class v1, Landroidx/camera/core/impl/a0$a;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Lw/w;->H:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.appConfig.deviceSurfaceManagerProvider"

    const-class v1, Landroidx/camera/core/impl/z$a;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Lw/w;->I:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.appConfig.useCaseConfigFactoryProvider"

    const-class v1, Landroidx/camera/core/impl/l2$c;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Lw/w;->J:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.appConfig.cameraExecutor"

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Lw/w;->K:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.appConfig.schedulerHandler"

    const-class v1, Landroid/os/Handler;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Lw/w;->L:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.appConfig.minimumLoggingLevel"

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Lw/w;->M:Landroidx/camera/core/impl/n0$a;

    const-string v0, "camerax.core.appConfig.availableCamerasLimiter"

    const-class v1, Lw/p;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Lw/w;->N:Landroidx/camera/core/impl/n0$a;

    return-void
.end method

.method constructor <init>(Landroidx/camera/core/impl/p1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/w;->G:Landroidx/camera/core/impl/p1;

    return-void
.end method


# virtual methods
.method public W(Lw/p;)Lw/p;
    .locals 2

    iget-object v0, p0, Lw/w;->G:Landroidx/camera/core/impl/p1;

    sget-object v1, Lw/w;->N:Landroidx/camera/core/impl/n0$a;

    invoke-virtual {v0, v1, p1}, Landroidx/camera/core/impl/p1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw/p;

    return-object p1
.end method

.method public X(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;
    .locals 2

    iget-object v0, p0, Lw/w;->G:Landroidx/camera/core/impl/p1;

    sget-object v1, Lw/w;->K:Landroidx/camera/core/impl/n0$a;

    invoke-virtual {v0, v1, p1}, Landroidx/camera/core/impl/p1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    return-object p1
.end method

.method public Y(Landroidx/camera/core/impl/a0$a;)Landroidx/camera/core/impl/a0$a;
    .locals 2

    iget-object v0, p0, Lw/w;->G:Landroidx/camera/core/impl/p1;

    sget-object v1, Lw/w;->H:Landroidx/camera/core/impl/n0$a;

    invoke-virtual {v0, v1, p1}, Landroidx/camera/core/impl/p1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/impl/a0$a;

    return-object p1
.end method

.method public Z(Landroidx/camera/core/impl/z$a;)Landroidx/camera/core/impl/z$a;
    .locals 2

    iget-object v0, p0, Lw/w;->G:Landroidx/camera/core/impl/p1;

    sget-object v1, Lw/w;->I:Landroidx/camera/core/impl/n0$a;

    invoke-virtual {v0, v1, p1}, Landroidx/camera/core/impl/p1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/impl/z$a;

    return-object p1
.end method

.method public a0(Landroid/os/Handler;)Landroid/os/Handler;
    .locals 2

    iget-object v0, p0, Lw/w;->G:Landroidx/camera/core/impl/p1;

    sget-object v1, Lw/w;->L:Landroidx/camera/core/impl/n0$a;

    invoke-virtual {v0, v1, p1}, Landroidx/camera/core/impl/p1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    return-object p1
.end method

.method public b0(Landroidx/camera/core/impl/l2$c;)Landroidx/camera/core/impl/l2$c;
    .locals 2

    iget-object v0, p0, Lw/w;->G:Landroidx/camera/core/impl/p1;

    sget-object v1, Lw/w;->J:Landroidx/camera/core/impl/n0$a;

    invoke-virtual {v0, v1, p1}, Landroidx/camera/core/impl/p1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/impl/l2$c;

    return-object p1
.end method

.method public m()Landroidx/camera/core/impl/n0;
    .locals 1

    iget-object v0, p0, Lw/w;->G:Landroidx/camera/core/impl/p1;

    return-object v0
.end method
