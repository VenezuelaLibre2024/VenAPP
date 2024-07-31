.class Lw/i1$b;
.super Landroidx/camera/core/impl/r0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/i1;-><init>(Landroid/util/Size;Landroidx/camera/core/impl/c0;Lw/y;Landroid/util/Range;Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic o:Lw/i1;


# direct methods
.method constructor <init>(Lw/i1;Landroid/util/Size;I)V
    .locals 0

    iput-object p1, p0, Lw/i1$b;->o:Lw/i1;

    invoke-direct {p0, p2, p3}, Landroidx/camera/core/impl/r0;-><init>(Landroid/util/Size;I)V

    return-void
.end method


# virtual methods
.method protected r()Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/f<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lw/i1$b;->o:Lw/i1;

    iget-object v0, v0, Lw/i1;->f:Lcom/google/common/util/concurrent/f;

    return-object v0
.end method
