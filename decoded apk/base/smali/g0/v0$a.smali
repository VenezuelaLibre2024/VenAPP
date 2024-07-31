.class Lg0/v0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg0/v0;->d(Lg0/n0;Ljava/util/Map$Entry;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La0/c<",
        "Lw/x0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lg0/v0;


# direct methods
.method constructor <init>(Lg0/v0;)V
    .locals 0

    iput-object p1, p0, Lg0/v0$a;->a:Lg0/v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "SurfaceProcessorNode"

    const-string v1, "Downstream node failed to provide Surface."

    invoke-static {v0, v1, p1}, Lw/o0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public b(Lw/x0;)V
    .locals 1

    invoke-static {p1}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lg0/v0$a;->a:Lg0/v0;

    iget-object v0, v0, Lg0/v0;->a:Lg0/r0;

    invoke-interface {v0, p1}, Lw/y0;->a(Lw/x0;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lw/x0;

    invoke-virtual {p0, p1}, Lg0/v0$a;->b(Lw/x0;)V

    return-void
.end method
