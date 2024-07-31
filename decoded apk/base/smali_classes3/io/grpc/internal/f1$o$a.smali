.class final Lio/grpc/internal/f1$o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1$o;->b(Lvi/g1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lvi/g1;

.field final synthetic b:Lio/grpc/internal/f1$o;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$o;Lvi/g1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/f1$o$a;->b:Lio/grpc/internal/f1$o;

    iput-object p2, p0, Lio/grpc/internal/f1$o$a;->a:Lvi/g1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$o$a;->b:Lio/grpc/internal/f1$o;

    iget-object v1, p0, Lio/grpc/internal/f1$o$a;->a:Lvi/g1;

    invoke-static {v0, v1}, Lio/grpc/internal/f1$o;->e(Lio/grpc/internal/f1$o;Lvi/g1;)V

    return-void
.end method
