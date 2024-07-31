.class Lio/grpc/internal/a0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/a0;->d(Lvi/g1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lvi/g1;

.field final synthetic b:Lio/grpc/internal/a0;


# direct methods
.method constructor <init>(Lio/grpc/internal/a0;Lvi/g1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/a0$d;->b:Lio/grpc/internal/a0;

    iput-object p2, p0, Lio/grpc/internal/a0$d;->a:Lvi/g1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/a0$d;->b:Lio/grpc/internal/a0;

    invoke-static {v0}, Lio/grpc/internal/a0;->a(Lio/grpc/internal/a0;)Lio/grpc/internal/j1$a;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/a0$d;->a:Lvi/g1;

    invoke-interface {v0, v1}, Lio/grpc/internal/j1$a;->d(Lvi/g1;)V

    return-void
.end method
