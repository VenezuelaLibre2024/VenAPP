.class Li0/g$a;
.super Landroidx/camera/core/impl/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li0/g;->p()Landroidx/camera/core/impl/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Li0/g;


# direct methods
.method constructor <init>(Li0/g;)V
    .locals 0

    iput-object p1, p0, Li0/g$a;->a:Li0/g;

    invoke-direct {p0}, Landroidx/camera/core/impl/k;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroidx/camera/core/impl/s;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/camera/core/impl/k;->b(Landroidx/camera/core/impl/s;)V

    iget-object v0, p0, Li0/g$a;->a:Li0/g;

    iget-object v0, v0, Li0/g;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/w;

    invoke-virtual {v1}, Landroidx/camera/core/w;->s()Landroidx/camera/core/impl/y1;

    move-result-object v1

    invoke-static {p1, v1}, Li0/g;->F(Landroidx/camera/core/impl/s;Landroidx/camera/core/impl/y1;)V

    goto :goto_0

    :cond_0
    return-void
.end method
