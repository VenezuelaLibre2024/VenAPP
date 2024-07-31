.class Lb0/e$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field a:Landroidx/camera/core/impl/k2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/k2<",
            "*>;"
        }
    .end annotation
.end field

.field b:Landroidx/camera/core/impl/k2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/k2<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/k2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/k2<",
            "*>;",
            "Landroidx/camera/core/impl/k2<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/e$c;->a:Landroidx/camera/core/impl/k2;

    iput-object p2, p0, Lb0/e$c;->b:Landroidx/camera/core/impl/k2;

    return-void
.end method
