.class public final synthetic Lbd/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lbd/e;

.field public final synthetic b:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public synthetic constructor <init>(Lbd/e;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbd/d;->a:Lbd/e;

    iput-object p2, p0, Lbd/d;->b:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lbd/d;->a:Lbd/e;

    iget-object v1, p0, Lbd/d;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-static {v0, v1}, Lbd/e;->b(Lbd/e;Ljava/util/concurrent/CountDownLatch;)V

    return-void
.end method
