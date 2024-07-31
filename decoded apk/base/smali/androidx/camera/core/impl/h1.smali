.class public final Landroidx/camera/core/impl/h1;
.super Landroidx/camera/core/impl/r0;
.source "SourceFile"


# instance fields
.field private final o:Landroid/view/Surface;


# direct methods
.method public constructor <init>(Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/impl/r0;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/impl/h1;->o:Landroid/view/Surface;

    return-void
.end method

.method public constructor <init>(Landroid/view/Surface;Landroid/util/Size;I)V
    .locals 0

    invoke-direct {p0, p2, p3}, Landroidx/camera/core/impl/r0;-><init>(Landroid/util/Size;I)V

    iput-object p1, p0, Landroidx/camera/core/impl/h1;->o:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public r()Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/f<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/h1;->o:Landroid/view/Surface;

    invoke-static {v0}, La0/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    return-object v0
.end method
