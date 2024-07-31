.class final Lio/grpc/internal/f1$s$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1$s;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/f1$s;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$s;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$s$b;->a:Lio/grpc/internal/f1$s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$s$b;->a:Lio/grpc/internal/f1$s;

    iget-object v0, v0, Lio/grpc/internal/f1$s;->g:Lio/grpc/internal/x0;

    sget-object v1, Lio/grpc/internal/f1;->r0:Lvi/g1;

    invoke-virtual {v0, v1}, Lio/grpc/internal/x0;->d(Lvi/g1;)V

    return-void
.end method
