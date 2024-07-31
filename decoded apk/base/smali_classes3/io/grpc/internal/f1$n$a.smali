.class final Lio/grpc/internal/f1$n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1$n;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/f1$n;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$n;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$n$a;->a:Lio/grpc/internal/f1$n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$n$a;->a:Lio/grpc/internal/f1$n;

    iget-object v0, v0, Lio/grpc/internal/f1$n;->b:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->P(Lio/grpc/internal/f1;)V

    return-void
.end method
