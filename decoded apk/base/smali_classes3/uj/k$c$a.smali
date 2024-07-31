.class final Luj/k$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luj/k$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final a:Luj/k$b;

.field final synthetic b:Luj/k$c;


# direct methods
.method constructor <init>(Luj/k$c;Luj/k$b;)V
    .locals 0

    iput-object p1, p0, Luj/k$c$a;->b:Luj/k$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Luj/k$c$a;->a:Luj/k$b;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Luj/k$c$a;->a:Luj/k$b;

    const/4 v1, 0x1

    iput-boolean v1, v0, Luj/k$b;->d:Z

    iget-object v0, p0, Luj/k$c$a;->b:Luj/k$c;

    iget-object v0, v0, Luj/k$c;->a:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v1, p0, Luj/k$c$a;->a:Luj/k$b;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/PriorityBlockingQueue;->remove(Ljava/lang/Object;)Z

    return-void
.end method
