.class Lio/grpc/internal/f1$p$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1$p;->h(Lvi/x0;Lvi/c;)Lvi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/f1$p;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$p;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$p$b;->a:Lio/grpc/internal/f1$p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$p$b;->a:Lio/grpc/internal/f1$p;

    iget-object v0, v0, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    invoke-virtual {v0}, Lio/grpc/internal/f1;->u0()V

    return-void
.end method
