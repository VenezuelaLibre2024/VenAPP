.class Lio/grpc/internal/a0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/a0;->g(Lio/grpc/internal/j1$a;)Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/j1$a;

.field final synthetic b:Lio/grpc/internal/a0;


# direct methods
.method constructor <init>(Lio/grpc/internal/a0;Lio/grpc/internal/j1$a;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/a0$b;->b:Lio/grpc/internal/a0;

    iput-object p2, p0, Lio/grpc/internal/a0$b;->a:Lio/grpc/internal/j1$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/a0$b;->a:Lio/grpc/internal/j1$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lio/grpc/internal/j1$a;->b(Z)V

    return-void
.end method