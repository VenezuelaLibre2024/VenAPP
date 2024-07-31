.class public Landroidx/camera/camera2/internal/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/v1;


# instance fields
.field private final a:Landroidx/camera/camera2/internal/x1;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/a2;",
            ">;"
        }
    .end annotation
.end field

.field private volatile c:Z

.field private volatile d:Landroidx/camera/core/impl/y1;


# direct methods
.method public constructor <init>(Landroidx/camera/camera2/internal/x1;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/camera2/internal/x1;",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/a2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/camera/camera2/internal/i1;->c:Z

    iget-object v1, p1, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    sget-object v2, Landroidx/camera/camera2/internal/x1$e;->OPENED:Landroidx/camera/camera2/internal/x1$e;

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CaptureSession state must be OPENED. Current state:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p1, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    iput-object p1, p0, Landroidx/camera/camera2/internal/i1;->a:Landroidx/camera/camera2/internal/x1;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/i1;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/camera/camera2/internal/i1;->c:Z

    return-void
.end method

.method public b(Landroidx/camera/core/impl/y1;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/camera2/internal/i1;->d:Landroidx/camera/core/impl/y1;

    return-void
.end method
