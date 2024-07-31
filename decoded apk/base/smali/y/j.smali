.class public final Ly/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l0;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ly/n0;


# direct methods
.method public constructor <init>(Ljava/util/List;Ly/n0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l0;",
            ">;",
            "Ly/n0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/j;->a:Ljava/util/List;

    iput-object p2, p0, Ly/j;->b:Ly/n0;

    return-void
.end method


# virtual methods
.method a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ly/j;->a:Ljava/util/List;

    return-object v0
.end method

.method b()Z
    .locals 1

    iget-object v0, p0, Ly/j;->b:Ly/n0;

    invoke-interface {v0}, Ly/n0;->isAborted()Z

    move-result v0

    return v0
.end method
