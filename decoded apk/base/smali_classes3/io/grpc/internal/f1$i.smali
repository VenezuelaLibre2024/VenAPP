.class Lio/grpc/internal/f1$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "i"
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/f1;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$i;->a:Lio/grpc/internal/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$i;->a:Lio/grpc/internal/f1;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lio/grpc/internal/f1;->k(Lio/grpc/internal/f1;Lvi/k1$d;)Lvi/k1$d;

    iget-object v0, p0, Lio/grpc/internal/f1$i;->a:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->l(Lio/grpc/internal/f1;)V

    return-void
.end method
