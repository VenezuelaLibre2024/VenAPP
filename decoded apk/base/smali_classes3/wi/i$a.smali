.class Lwi/i$a;
.super Lio/grpc/internal/v0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwi/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/grpc/internal/v0<",
        "Lwi/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lwi/i;


# direct methods
.method constructor <init>(Lwi/i;)V
    .locals 0

    iput-object p1, p0, Lwi/i$a;->b:Lwi/i;

    invoke-direct {p0}, Lio/grpc/internal/v0;-><init>()V

    return-void
.end method


# virtual methods
.method protected b()V
    .locals 2

    iget-object v0, p0, Lwi/i$a;->b:Lwi/i;

    invoke-static {v0}, Lwi/i;->i(Lwi/i;)Lio/grpc/internal/j1$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lio/grpc/internal/j1$a;->b(Z)V

    return-void
.end method

.method protected c()V
    .locals 2

    iget-object v0, p0, Lwi/i$a;->b:Lwi/i;

    invoke-static {v0}, Lwi/i;->i(Lwi/i;)Lio/grpc/internal/j1$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lio/grpc/internal/j1$a;->b(Z)V

    return-void
.end method
