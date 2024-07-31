.class public final synthetic Ln2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/work/impl/workers/ConstraintTrackingWorker;

.field public final synthetic b:Lcom/google/common/util/concurrent/f;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/workers/ConstraintTrackingWorker;Lcom/google/common/util/concurrent/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln2/b;->a:Landroidx/work/impl/workers/ConstraintTrackingWorker;

    iput-object p2, p0, Ln2/b;->b:Lcom/google/common/util/concurrent/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ln2/b;->a:Landroidx/work/impl/workers/ConstraintTrackingWorker;

    iget-object v1, p0, Ln2/b;->b:Lcom/google/common/util/concurrent/f;

    invoke-static {v0, v1}, Landroidx/work/impl/workers/ConstraintTrackingWorker;->d(Landroidx/work/impl/workers/ConstraintTrackingWorker;Lcom/google/common/util/concurrent/f;)V

    return-void
.end method
