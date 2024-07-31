.class Lio/grpc/internal/z$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/z;->k(Lvi/g1;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lvi/g1;

.field final synthetic b:Lio/grpc/internal/z;


# direct methods
.method constructor <init>(Lio/grpc/internal/z;Lvi/g1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/z$e;->b:Lio/grpc/internal/z;

    iput-object p2, p0, Lio/grpc/internal/z$e;->a:Lvi/g1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/z$e;->b:Lio/grpc/internal/z;

    invoke-static {v0}, Lio/grpc/internal/z;->h(Lio/grpc/internal/z;)Lvi/g;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/z$e;->a:Lvi/g1;

    invoke-virtual {v1}, Lvi/g1;->o()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/grpc/internal/z$e;->a:Lvi/g1;

    invoke-virtual {v2}, Lvi/g1;->m()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lvi/g;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
